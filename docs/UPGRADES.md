# APK‑Frida Pipeline – Upgrade Playbook

> **Scope:** Concrete instructions for every enhancement proposed in the *Improvement Ideas* list (DX, performance, feature depth, reliability, docs).
> **Assumed baseline:** Codebase version 2.0.0 exactly as described in ARCHITECTURE/IMPLEMENTATION.
> **Target toolchain:** Node ≥ 20, pnpm 8, TypeScript 5.4, `zx` 8, Frida 16.1.

---

## 0 · Road‑mapping

| Phase | Upgrade group                                                                  | Reqd. effort | Dependencies     |
| ----- | ------------------------------------------------------------------------------ | ------------ | ---------------- |
| **1** | TypeScript migration<br>Monorepo / pnpm workspaces<br>Pre‑commit lint/test     | Medium       | baseline v2.0.0  |
| **2** | Incremental decompile cache<br>Shared worker‑pool<br>Structured step timing    | Medium–High  | Phase 1          |
| **3** | Plugin API (tapable hooks)<br>Import‑glob plugin loader<br>Self‑update command | High         | Phase 1          |
| **4** | Live device watch‑mode<br>Diff‑mode reporting<br>Cloud REST gateway            | High         | Phases 1‑3       |
| **5** | GUI dashboard (Electron)<br>Multi‑device farm<br>Interactive sandbox docs      | Very High    | All prior phases |

---

## 1 · Developer Experience & Maintainability

### 1.1 TypeScript migration

1. **Add tooling**

   ```bash
   pnpm add -D typescript ts-node @types/node vite-tsconfig-paths
   pnpm dlx tsc --init --rootDir src --outDir dist --esModuleInterop --resolveJsonModule --strict
   ```
2. **Move files** – `mv *.js src/*.ts` + adjust imports (`.js`→`.js` still works in TS ESM).
3. **Fix errors** – iterate `pnpm dlx tsc -w` until clean.
4. **Build script** – add in `package.json` root:

   ```json
   { "scripts": { "build": "tsc -p tsconfig.json" } }
   ```
5. **Publish** – CLI entry now points to `dist/cli.js`.

> *Tip:* Keep `zx` scripts in `.mjs` or use `#!/usr/bin/env zx` which supports TS via ts‑node.

### 1.2 pnpm workspaces & monorepo layout

```
root/
  pnpm-workspace.yaml
  packages/
    cli/        # apk‑frida CLI (depends on core)
    core/       # non‑CLI library exports
    hooks‑base/ # built‑in hook families
```

* `pnpm-workspace.yaml` content:

  ```yaml
  packages:
    - "packages/*"
  ```
* Each sub‑package gets its own `package.json` with `type: module` and local `tsconfig.json` inheriting from root.

### 1.3 Pre‑commit lint/test

```bash
pnpm add -D eslint prettier lint-staged husky jest @types/jest eslint-plugin-import
```

* `.eslintrc.cjs` with AirBnB‑base + import rules.
* `.lintstagedrc`:

  ```json
  { "*.{ts,js,json,md}": "prettier --write" , "src/**/*.ts": "eslint --fix" }
  ```
* `npx husky-init && pnpm exec husky add .husky/pre-commit "pnpm exec lint-staged"`.

---

## 2 · Performance & Scalability

### 2.1 Incremental decompile cache

*Persist per‑class hash map to skip unchanged classes.*

1. After `jadx` run, compute `SHA‑1` of each `.smali` or `.java` file → store in `analysis/<pkg>/dex.hash.json`.
2. On next run, read old map, compare to new `jar tf` list.
   Use `jadx --show-bad-code` with `--output` pointing to `changed/` for only new/changed DEX.
3. Merge into existing output dir.

### 2.2 Shared worker‑pool with Piscina

```bash
pnpm add piscina
```

```ts
import Piscina from 'piscina';
const pool = new Piscina({ filename: new URL('./scanWorker.js', import.meta.url).href });
await Promise.all(files.map(f=>pool.run({ file:f, families })));
```

Pool persists across batch processing.

### 2.3 Structured step timing

```ts
import { performance, PerformanceObserver } from 'perf_hooks';
const obs = new PerformanceObserver(list => {
  list.getEntries().forEach(e => logger.info({phase:e.name, ms:e.duration}));
});
obs.observe({ entryTypes:['measure'] });
performance.mark('pull‑start');
// pull…
performance.measure('pull', 'pull‑start');
```

---

## 3 · Plugin Architecture

### 3.1 tapable lifecycle

```bash
pnpm add tapable
```

```ts
import { SyncHook, AsyncSeriesHook } from 'tapable';
export const hooks = {
  beforeScan: new AsyncSeriesHook(['context']),
  afterScan:  new AsyncSeriesHook(['components'])
};
```

*Core* invokes `hooks.beforeScan.promise(ctx)` etc.

### 3.2 Plugin loader with `import.meta.glob`

```ts
const mods = import.meta.glob('/plugins/**/*.ts');
for (const loader of Object.values(mods)) {
  const plug = (await loader()).default;
  plug.register?.(hooks);
}
```

Plugins can now do:

```ts
export default {
  register(hooks) {
    hooks.afterScan.tap('CSVReporter', comps => fs.writeFileSync('comps.csv', …));
  }
};
```

### 3.3 Self‑update command

1. Add `update-notifier` dependency.
2. `cli.js` sub‑command:

   ```ts
   program.command('upgrade').action(async ()=>{
     await execa('pnpm', ['i','-g','apk-frida@latest'], { stdio:'inherit' });
   });
   ```
3. In normal runs check `updateNotifier({pkg}).notify({defer:false});`.

---

## 4 · Feature Depth Enhancements

### 4.1 Live watch‑mode & hot reload

* Use Frida 16 `--reload` or attach a `frida‑repl` session.
* Watcher:

  ```ts
  import chokidar from 'chokidar';
  chokidar.watch(script).on('change', () => {
    execa('frida', ['-U','-f',pkg,'--reload','-l',script]);
  });
  ```

### 4.2 Diff‑mode reporting

```ts
import deepDiff from 'deep-diff';
const old = JSON.parse(fs.readFileSync('components-v1.json'));
const next = JSON.parse(fs.readFileSync('components-v2.json'));
console.log(deepDiff.diff(old, next));
```

Expose CLI: `apk-frida diff <pkg> <old.json> <new.json>`.

### 4.3 REST API wrapper

*Add Express*

```bash
pnpm add express cors multer
```

Server exposes `/pull`, `/scan`, `/generate` where each route invokes same core functions; wrap in `await queue.add(() => acquire(...))` to protect ADB.

---

## 5 · Reliability & Observability

### 5.1 Retry helper

```ts
export const retry = async (fn, n=3, delay=1000) => {
  for (let i=0;i<n;i++) try { return await fn(); } catch(e){
    if (i===n-1) throw e; await new Promise(r=>setTimeout(r,delay*Math.pow(2,i))); }
};
```

Wrap all `execAdb` and network calls.

### 5.2 Crash reporter

```ts
process.on('uncaughtException', e => {
  fs.writeFileSync(`crash-${Date.now()}.log`, JSON.stringify({
    err:e.stack, opts:program.opts(), lastLines:logger.flush()
  },null,2));
  process.exit(1);
});
```

---

## 6 · Documentation & Samples

### 6.1 One‑pager cheatsheet generation

```bash
pnpm add commander-markdown
npx commander-markdown ./packages/cli/dist/cli.js > CHEATSHEET.md
```

Run in `postbuild`.

### 6.2 Interactive sandbox

* Use StackBlitz’s Node template and pre‑install `frida-compile` shim to run scripts in browser (analysis‑only mode).
* Embed badge at top of README:
  `[Run in StackBlitz](https://stackblitz.com/github/…)`.

---

## 7 · Verification checklist

1. `pnpm install && pnpm test` passes on macOS, Linux, Windows.
2. `apk-frida --selfcheck` pulls a tiny open‑source APK and completes pipeline < 10 s.
3. `apk-frida upgrade` successfully re‑installs package when a newer tag exists.

---

> Implement upgrades incrementally; each Phase should bump **minor** version per SemVer, with exhaustive changelog notes.
