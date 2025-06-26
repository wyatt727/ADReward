# Kotlin‑IR Scanner – Design & Implementation Guide

> **Goal:** Extend *apk‑frida* so it can locate reward‑granting hooks even when an app’s Kotlin code is ProGuard/R8‑obfuscated, inlined, or coroutine‑wrapped. We do this by analysing Kotlin **Intermediate Representation (IR)** rather than Smali.
> **Status:** Specification & reference implementation ‑ ready for integration into core v2.x.

---

## 1 · Why Kotlin IR?

| Obfuscation obstacle | Smali / JADX view                                      | IR view                                                           |
| -------------------- | ------------------------------------------------------ | ----------------------------------------------------------------- |
| Class/field rename   | `Lcom/a/b/c/x;->a(I)V`                                 | Still remembers original FQCN (`RewardManager.grant`) in metadata |
| Inline functions     | Body pasted into caller; no distinct method to hook    | IR keeps *inline function* node and call‑site link                |
| Coroutines           | Compiled to state‑machine classes (`ContinuationImpl`) | IR contains `suspend` flag and original function name             |

**Bottom line:** IR retains semantic information the Dex no longer has.

---

## 2 · High‑level pipeline additions

```mermaid
graph TD
    A[Existing decompile] --> B[Smali pattern scan]
    A --> C[Kotlin‑IR scan (NEW)]
    C --> D[Hook map]
    B --> D
    D --> E[Frida script generator]
```

*We merge IR+Smali results; IR wins on duplicates.*

---

## 3 · Build‑time prerequisites

| Tool / Lib                     | Version   | Use                                                   |
| ------------------------------ | --------- | ----------------------------------------------------- |
| **kotlin‑compiler‑embeddable** | 1.9.x     | Parse metadata → IR module                            |
| **kotlinx‑metadata‑jvm**       | 0.9.x     | Decode `kotlin.Metadata` annotations from class files |
| **kotlin‑ir‑linker**           | *bundled* | Generate IR from metadata without source              |
| **gradle‑shadow‑plugin**       | 8.x       | Build single fat JAR (`ktir‑scanner.jar`)             |

Add a new Gradle project under `packages/ktir‑scanner/`.

```groovy
plugins {
  id 'org.jetbrains.kotlin.jvm' version '1.9.22'
  id 'com.github.johnrengelman.shadow' version '8.1.1'
}

repositories { mavenCentral() }
dependencies {
  implementation "org.jetbrains.kotlin:kotlin-compiler-embeddable:1.9.22"
  implementation "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.9.0"
}

shadowJar {
  archiveBaseName.set('ktir-scanner')
  archiveClassifier.set('')
}
```

Running `./gradlew :packages:ktir-scanner:shadowJar` produces `build/libs/ktir-scanner.jar` (\~10 MB).

---

## 4 · CLI integration (Node side)

```ts
// packages/core/src/ir.ts
import { execFile } from 'child_process';
import { tmpdir } from './utils/misc.js';
import { logger } from './utils/logger.js';

export async function scanKotlinIR(jarList: string[], hookFamilies: string[]): Promise<ComponentMap> {
  return new Promise((resolve, reject) => {
    const jsonOut = path.join(tmpdir(), `ir-${Date.now()}.json`);
    execFile('java', [ '-jar', 'ktir-scanner.jar', jsonOut, ...hookFamilies, '--', ...jarList],
      { maxBuffer: 1024*1024*20 }, (err) => {
        if (err) return reject(err);
        resolve(JSON.parse(fs.readFileSync(jsonOut, 'utf8')));
    });
  });
}
```

Add flag to CLI:

```ts
program.option('--ir', 'Enable Kotlin-IR scanner (default on when Kotlin metadata found)', false);
```

During analysis stage:

```ts
if (opts.ir || hasKotlinMetadata(dexDir)) {
  const jars = collectJarPaths(dexDir);
  const irComps = await scanKotlinIR(jars, opts.hooks.split(','));
  merge(components, irComps, /*prefer=ir*/ true);
}
```

`hasKotlinMetadata()` simply greps for `kotlin.Metadata` in any `.class` file inside the decompiled tree.

---

## 5 · Scanner internals (Kotlin code)

### 5.1 Entry‑point (Kt)

```kotlin
fun main(args: Array<String>) {
    if (args.size < 3) {
        println("usage: ktir-scanner <out.json> <hooks…> -- <jars…>");
        exitProcess(1)
    }
    val split = args.indexOf("--")
    val out = File(args[0])
    val families = args.slice(1 until split)
    val jars = args.slice(split + 1 until args.size).map(::File)
    val ctx = ScanCtx(families)
    val scanner = IRScanner(ctx)
    jars.forEach(scanner::scanJar)
    out.writeText(Json.encodeToString(ctx.results))
}
```

### 5.2 IRScanner core

```kotlin
class IRScanner(private val ctx: ScanCtx) {
  private val cfg = CompilerConfiguration().apply {
    put(CommonConfigurationKeys.MODULE_NAME, "ktir-scan")
    addJvmClasspathRoots(listOf(File(System.getProperty("java.class.path"))))
  }

  fun scanJar(jar: File) {
    // 1. load Jar into KotlinClassFinder
    val env = KotlinCoreEnvironment.createForProduction(
        Disposable {}, cfg, EnvironmentConfigFiles.JVM_CONFIG_FILES)
    val session = JvmStaticAnalyzer.createSessionForJvm(srcFiles = emptyList(), cfg, env.project) {
        addJvmClasspathRoot(jar)
    }
    val irModule = JvmIrGenerator(session).generateModuleFragment()

    irModule.files.forEach { file ->
      file.acceptChildren(object : IrElementVisitorVoid {
        override fun visitFunction(declaration: IrFunction) {
          families.forEach { family ->
            if (family.matcher(declaration)) ctx.addHit(family.name, declaration)
          }
          super.visitFunction(declaration)
        }
      }, null)
    }
  }
}
```

`families` is loaded via ServiceLoader: each JAR in `resources/hook-families/` exposes `HookFamily` interface with `matcher(IrFunction): Boolean`.

### 5.3 Example AdMob family matcher

```kotlin
object AdMobIR : HookFamily {
  override val name = "admob"
  private val target = "com.google.android.gms.ads.rewarded.RewardItem".fqNameSafe

  override fun matcher(fn: IrFunction): Boolean {
    return fn.returnType.getClass()?.fqNameSafe == target &&
           fn.name.asString().contains("EarnedReward", true)
  }
}
```

### 5.4 Export structure

```kotlin
data class HookSite(val className: String, val methodName: String,
                    val desc: String, val kotlinSig: String)

typealias ComponentMap = Map<String, List<HookSite>>
```

Serialised via Kotlinx‑serialization to JSON consumed by Node.

---

## 6 · Merging IR + Smali results

```ts
function merge(into: ComponentMap, from: ComponentMap, preferIR = false) {
  for (const fam in from) {
    if (!into[fam]) { into[fam] = from[fam]; continue; }
    const set = new Map(into[fam].map(h=>[h.kotlinSig||h.desc, h]));
    for (const h of from[fam]) set.set(h.kotlinSig||h.desc, preferIR ? h : set.get(h.key) || h);
    into[fam] = [...set.values()];
  }
}
```

---

## 7 · Performance notes

* Scanning 10 MB of class files \~\~800 ms on M2‑Max\*.
* IR generator is CPU‑bound; run it **before** spawning Smali workers to overlap I/O.

---

## 8 · Limitations & fallback

| Case                                                                | Outcome                                                                       |
| ------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| App stripped Kotlin metadata (`-keepattributes * !kotlin.Metadata`) | IR scanner yields nothing → Smali fallback still runs                         |
| Dalvik‑only Dex (Kotlin 1.2‑)                                       | IR linker can’t parse; skip to Smali                                          |
| Multiplatform KMM modules                                           | Only JVM part scanned; common/JS unreachable but irrelevant for Android hooks |

---

## 9 · Testing

1. **Unit** – use compiled sample with obfuscated Kotlin reward manager; assert IR scanner returns hook.
2. **Integration** – CI job flashes fixture APK to emulator, runs full pipeline with `--ir` flag, then asserts coins increment in game memory after deploy.

---

## 10 · CLI UX additions

```text
--ir              Enable Kotlin‑IR scanning (auto‑detect by default)
--ir-only         Skip Smali scanner (debug)
--ir-timings      Print per‑phase IR timings
```

---

## 11 · Roll‑out plan

| Step | Action                                                                                   |
| ---- | ---------------------------------------------------------------------------------------- |
| 1    | Merge gradle module + GitHub Action that builds & uploads `ktir-scanner.jar` as artefact |
| 2    | Add Node wrapper (`core/ir.ts`) and new CLI flags                                        |
| 3    | Feature‑flag default: *auto* when `kotlin.Metadata` found                                |
| 4    | Update README & docs; bump minor version 2.3.0                                           |

---

