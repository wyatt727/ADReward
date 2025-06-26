# APK‑Frida Pipeline – Functional Overview

> **Version:** 2.0.0  > **Last updated:** 2025‑06‑26

---

## 1 · What the tool can do

| Capability                        | Outcome                                                                                                        | Where Implemented                                      |
| --------------------------------- | -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------ |
| 🔌 **Device discovery**           | Finds a single or user‑specified ADB device, retries, validates state                                          | `adb.js → requireDevice()`                             |
| 📦 **APK / AAB extraction**       | Pulls *monolithic*, *split* or *bundle* apps directly from the device; caches locally                          | `apk.js → acquire()` + Google **bundletool** for AABs  |
| ♻️ **Incremental cache**          | Skips pull/decompile when checksum unchanged                                                                   | `utils/misc.js → fileHash()`                           |
| 🪄 **Decompilation**              | Converts APK to Smali (or Java sources) using **JADX**; optional `apktool` resources                           | `decompile.js`                                         |
| ⚡ **Parallel pattern scan**       | Worker‑thread fan‑out across all Smali files; 6–8× speed‑up on big games                                       | `scan.js` + `scanWorker.js`                            |
| 🪙 **Hook discovery**             | Locates AdMob, Unity Ads, IronSource, custom SSV, reward handlers, currency setters                            | Regex/predicate modules in `hooks/*.js`                |
| 🏗 **Pluggable hook families**    | Drop a new pattern file → auto‑registered at runtime                                                           | Convention loader in `scan.js`                         |
| 🏃 **Frida‑server lifecycle**     | Auto‑downloads server binary matching host client; pushes, chmods, background‑starts; health‑checks port 27042 | `frida.js → ensureFridaServer()`                       |
| 📝 **Frida script generation**    | Emits interception stubs that *fire genuine reward callbacks* or *forge SSV replies*                           | `frida.js → generateFrida()` + Handlebars template     |
| 🚀 **Deploy helper**              | Writes `deploy.sh` with the exact `frida -U -f …` command & makes it executable                                | `frida.js`                                             |
| 🖥 **CLI UX**                     | Single binary `apk-frida` with interactive TUI fallback and rich flags                                         | `cli.js` + `commander`/`enquirer`                      |
| 📚 **Batch & headless modes**     | Process multiple package names or run in CI/emulators with no prompts                                          | loop in user scripts or `--batch-packages` flag        |
| 🔍 **Verbose structured logging** | `pino` pretty‑print in console, JSON in CI                                                                     | `utils/logger.js`                                      |
| 🧪 **Auto‑test harness**          | Optional generation of instrumentation tests that self‑invoke reward methods                                   | `hooks/tests.js` (opt‑in flag)                         |
| 🛡 **Security & integrity**       | SHA‑256 verify Frida binaries; operations stay local; server lives in `/data/local/tmp`                        | `frida.js` + `utils/checksum.js`                       |
| ⛑ **Robust error handling**       | Granular exit codes; writes crash logs per phase                                                               | central `try/catch` in `cli.js`                        |
| 🔗 **Extensibility hooks**        | Custom decompiler, custom script template, additional CLI sub‑commands                                         | Flags: `--decompiler`, `--template`, `--plugin <path>` |

---

## 2 · End‑to‑end flow (textual)

1. **CLI entry** – parse flags ➟ set logger level.
2. **Device** – `adb devices` → pick target.
3. **Acquire APK**

   * `pm path <pkg>` → collect file list.
   * `adb pull` each split OR run `bundletool build-apks --mode universal`.
4. **Checksum & cache check** – skip steps if unchanged.
5. **Decompile** – `jadx -d <dexDir>` (threads = CPU).
6. **Scan** – `fast-glob` all `*.smali`, shard to workers, run pattern modules.
7. **Frida‑server** – ensure binary and launch.
8. **Generate script** – inject stubs; optionally append auto‑tests.
9. **Write deploy.sh** – include package name + path to script.
10. **Exit** – code `0` on success; non‑zero with reason on fail.

---

## 3 · Key implementation details

### 3.1 ADB helper (`adb.js`)

```js
export async function execAdb(device, cmd, opts = {}) {
  return execa('adb', ['-s', device].concat(cmd.split(' ')), { ...opts });
}
```

* Centralised – every module imports this, so retries/timeouts are uniform.

### 3.2 Worker‑thread scan

* Uses `worker_threads` to sidestep Node’s single‑thread CPU limit.
* Each worker loads only the hooks requested via `--hooks admob,unity,…`.
* Results merged via `Object.assign` to yield `{ family: {clazz→methods} }` map.

### 3.3 Frida script template (excerpt)

```hbs
Java.perform(() => {
  {{#each hooks.admob}}
  const {{this.clazzVar}} = Java.use('{{this.className}}');
  {{this.clazzVar}}.{{this.methodName}}.implementation = function(reward) {
    send('[BYPASS] {{this.methodName}} called');
    try { return this.$super.{{this.methodName}}(reward); } catch (e) {}
    // fallback – forge reward
    const Fake = Java.use('com.google.android.gms.ads.rewarded.RewardItem').$new('Auto',1);
    this.$super.{{this.methodName}}(Fake);
  };
  {{/each}}
});
```

* Generated with Handlebars; variables pre‑escaped.

### 3.4 Bundletool handling

```bash
java -jar bundletool.jar build-apks \
  --mode=universal \
  --output=<out>/tmp.apks \
  --connected-device \
  --device-id=$DEVICE
unzip -p <out>/tmp.apks universal.apk > <out>/<pkg>.apk
```

---

## 4 · CLI flags that unlock extra power

| Flag                        | Effect                                                 |
| --------------------------- | ------------------------------------------------------ |
| `--pull`                    | Force re‑pull regardless of cache                      |
| `--analyze-only`            | Stop after scan; don’t spin Frida‑server/create script |
| `--hooks all`               | Enable every pattern module present in `hooks/`        |
| `--template ./my.tpl`       | Use custom Handlebars template for output script       |
| `--batch-packages file.txt` | Process newline‑separated package list sequentially    |
| `--emulator`                | Boot/snapshot an AVD and use it as target              |

---

## 5 · Extending & Customising

1. **Add new ad‑SDK**

   * `hooks/mysdk.js`:

     ```js
     export const family = 'mysdk';
     export const match = src => /onMyReward/.test(src);
     export const patch = ({ clazz, method }) => `\n  Java.use('${clazz}').${method}.implementation = function() { /* … */ };`;
     ```
2. **Inject analytics** – override `generateFrida()` to insert extra `send()` calls or StatsD metrics.
3. **Alternate decompiler** – drop `decompile/d2j.js`; flag `--decompiler d2j` picks it.

---

## 6 · Roadmap snapshot

* **2.1** – Live runtime hook discovery (in‑app scanning for dynamic class loads).
* **2.2** – Electron/React dashboard with drag‑and‑drop APK support.
* **3.0** – Kotlin‑IR & Protobuf resource pattern scanning.

---

## 7 · Where to go next

* Read `ARCHITECTURE.md` for deeper module internals.
* Peek at `hooks/` to craft specialised patches.
* Run `apk-frida --help` or `apk-frida --example` to see sample scripts.

---

> © 2025 Bulletproof Security Inc. Licensed under Apache‑2.0
