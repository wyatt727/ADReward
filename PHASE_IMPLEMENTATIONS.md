### PHASE 1: Performance & DX
#### Incremental decompile cache
* `packages/core/src/decompile.ts`:
	+ After each Jadx run, write `{ classPath: sha256 }` to `<dexDir>/dex.hash.json`.
	+ On next run, compare APK’s `classes*.dex` hashes; run Jadx only for deltas.
* Add `--force-decompile` flag to CLI to bypass cache.
* Unit-test: feed identical APK twice → second call must skip Jadx.

#### Shared worker-pool + structured timings
* Add `piscina` to workspace root; expose singleton in `packages/core/src/workerPool.ts`.
* Replace `Worker` fan-out in `scan.ts` with `Piscina.run()`.
* Use Node `perf_hooks.performance` + `PerformanceObserver` to log `measure()` spans (`pull`, `decompile`, `scan`, `frida`).
* Enable via `--timings` (already exists for IR; extend to whole pipeline).

### PHASE 2: Reliability
#### Generic retry helper
* `packages/core/src/utils/retry.ts` implementing exponential back-off (docs §5.1).
* Wrap all network / ADB / Java exec calls.

#### Crash reporter
* In `packages/cli/src/cli.ts` top-level add `process.on('uncaughtException', …)` to dump stack, CLI opts, last 100 log lines to `analysis/<pkg>/crash-<ts>.log`.

### PHASE 3: Plugin Architecture
#### Lifecycle hooks
* Create `packages/core/src/hooks.ts`:
```typescript
export const pipelineHooks = {
  beforeScan: new AsyncSeriesHook(['context']),
  afterScan:  new AsyncSeriesHook(['components'])
};
```
* Insert `await pipelineHooks.beforeScan.promise(ctx)` just before Smali/IR scanning, and `await pipelineHooks.afterScan.promise(results)` after merge.

#### Plugin loader
* CLI flag `--plugin <glob>` (multi).
* At startup `import.meta.glob` the provided paths, call `default.register(pipelineHooks)`.

#### Self-update command
* Add `cli upgrade` sub-command: `execa('pnpm', ['i','-g','apk-frida@latest'], { stdio:'inherit' });`
* Integrate `update-notifier` for passive hint.

### PHASE 4: Developer Tools
#### Live watch / hot-reload
* CLI flag `--watch` (requires `--gen-script`).
* Use `chokidar` to watch generated script; on change run:
```bash
frida -U -n <pkg> --reload -l auto-ad-bypass.js
```
* Provide graceful fall-back when Frida <16 (no reload).

#### Diff-mode reporter
* New command `cli diff <old.json> <new.json>`; uses `deep-diff` to print added/removed hooks.
* Write IR+Smali merge output to `analysis/<pkg>/components-<ts>.json` automatically when `--analyze`.

### PHASE 5: API Surface
#### REST gateway (optional headless mode)
* New sub-package `packages/server/` with Express + queues.
* Routes: `/pull`, `/scan`, `/generate` replicating CLI phases.
* Dockerfile exposing port 3100; emphasise non-interactive run.

### PHASE 6: Testing & QA
#### Auto-test harness
* Add `--tests` flag; when set, `generateFrida()` appends self-invoking test stubs.
* Provide fixtures under `packages/core/test/fixtures`.
* Integrate in CI GitHub Action.

#### Expanded unit + integration tests
* Cover new retry logic, plugin hooks, diff reporter.
* Matrix job with `--ir-only`, `--ir`, `--watch` smoke tests.

### PHASE 7: UI (stretch goal)
#### Electron / React dashboard (docs phase 2.2)
* Scaffold `packages/gui/`; use Vite + React.
* Create bridge to REST gateway for job status and log streaming.
* Postpone until all CLI work is merged and stabilised.

### Cross-cutting tasks
* Docs – update `ARCHITECTURE.md`, `IMPLEMENTATION.md`, CLI `--help`.
* Lint/format/publish – ensure new packages added to `pnpm-workspace.yaml`.
* Semantic-version: each phase bumps **minor**; UI phase bumps **major** (3.0).