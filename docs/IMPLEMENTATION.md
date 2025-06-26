# APK‑Frida Pipeline – Full Implementation Guide

> **Version:** 2.0.0   > **Updated:** 2025‑06‑26

---

## Reading guide

* **ARCHITECTURE.md** → why the design exists
* **OVERVIEW.md**      → what each capability does
* **IMPLEMENTATION.md** (this file) → **how** every capability is built, line‑by‑line
* **KOTLIN_IR_IMPLEMENTATION** → Kotlin-IR implementation specifics
* **UPGRADES.md** → Upgrade roadmap


> All code is ES Modules, Node ≥ 20, zero transpilers. Run `npm i` then `node cli.js` to prove parity with the snippets below.

---

## 1 · `cli.js` – orchestrator & UX

```js
#!/usr/bin/env node
import { Command } from 'commander';
import enquirer from 'enquirer';
import { logger } from './utils/logger.js';
import { requireDevice } from './adb.js';
import { acquire } from './apk.js';
import { decompile } from './decompile.js';
import { scan } from './scan.js';
import { ensureFridaServer, generateFrida } from './frida.js';

const program = new Command();
program
  .option('-p, --package <name>', 'Android package name')
  .option('-d, --device <id>', 'ADB device id (default: first online)')
  .option('--pull', 'Pull APK/AAB from device', false)
  .option('--analyze', 'Decompile & scan', false)
  .option('--gen-script', 'Generate Frida hook', false)
  .option('--hooks <list>', 'Hook families (csv)', 'admob,unity')
  .option('-o, --out <dir>', 'Output dir', './analysis')
  .option('-v, --verbose', 'Verbose logging', false)
  .parse();

(async () => {
  const opts = program.opts();
  if (opts.verbose) logger.level = 'debug';

  // — 1. pick device —
  const device = await requireDevice(opts.device);
  logger.info({device}, 'using device');

  // — 2. pick package —
  let pkg = opts.package;
  if (!pkg) {
    const { stdout } = await $`adb -s ${device} shell pm list packages -3`;
    const list = stdout.trim().split('\n').map(l=>l.replace('package:',''));
    pkg = (await enquirer.prompt({
      type:'select', message:'Select package', choices:list
    })).answer;
  }

  // — 3. acquire apk —
  const apk = await acquire(pkg, device, opts);
  logger.info({apk}, 'apk ready');

  // early‑exit when only pulling
  if (!opts.analyze && !opts.genScript) return;

  // — 4. decompile —
  const dexDir = await decompile(apk, opts);

  // — 5. scan —
  const comps = await scan(dexDir, opts.hooks.split(','));

  // — 6. generate script —
  if (opts.genScript) {
    await ensureFridaServer(device);
    const paths = await generateFrida(pkg, comps, opts.out);
    logger.info({ deploy: paths.deploy }, 'script ready');
  }
})();
```

*Uses `$` tag from **zx** for async exec readability.*

---

## 2 · `adb.js` – resilient wrapper

```js
import execa from 'execa';
import { logger } from './utils/logger.js';

export async function listDevices() {
  const { stdout } = await execa('adb', ['devices']);
  return stdout.split('\n')
    .filter(l=>/\tdevice$/.test(l))
    .map(l=>l.split('\t')[0]);
}

export async function requireDevice(preferred) {
  const devs = await listDevices();
  if (!devs.length) throw new Error('No ADB devices online');
  if (preferred && !devs.includes(preferred)) throw new Error(`Device ${preferred} not found`);
  return preferred || devs[0];
}

export async function execAdb(device, cmd, opts={}) {
  logger.debug({cmd}, 'adb');
  return execa('adb', ['-s', device].concat(cmd.split(' ')), opts);
}
```

---

## 3 · `apk.js` – pull & cache

```js
import fs from 'fs';
import path from 'path';
import { execAdb } from './adb.js';
import { logger } from './utils/logger.js';
import { tmpdir } from './utils/misc.js';
import { fileHash } from './utils/checksum.js';

const BUNDLETOOL = path.resolve('bundletool.jar');

export async function acquire(pkg, device, { pull, out }) {
  const target = path.join(out, `${pkg}.apk`);
  if (fs.existsSync(target) && !pull) {
    logger.debug('using cached apk');
    return target;
  }
  // 1. enumerate remote paths
  const { stdout } = await execAdb(device, `shell pm path ${pkg}`);
  const paths = stdout.trim().split('\n').map(l=>l.replace('package:',''));
  if (!paths[0]) throw new Error('pm path returned nothing');

  fs.mkdirSync(out, { recursive:true });

  if (paths.length === 1 && paths[0].endsWith('.apk')) {
    await execAdb(device, `pull ${paths[0]} ${target}`, { stdio:'inherit' });
    return target;
  }
  // split‑apks – pull all
  const splitsDir = path.join(tmpdir(), `${pkg}-splits`);
  fs.mkdirSync(splitsDir, {recursive:true});
  for (const p of paths) await execAdb(device, `pull ${p} ${splitsDir}`);

  // build universal apk
  await execa('java', ['-jar', BUNDLETOOL, 'build-apks',
    '--mode=universal', `--output=${splitsDir}/tmp.apks`,
    '--device-id', device, '--connected-device']);
  await execa('unzip', ['-p', `${splitsDir}/tmp.apks`, 'universal.apk'], { stdout: fs.createWriteStream(target) });
  logger.info({target}, 'universal apk built');
  return target;
}
```

---

## 4 · `decompile.js` – jadx driver

```js
import fs from 'fs';
import path from 'path';
import execa from 'execa';
import { logger } from './utils/logger.js';

const JADX = process.env.JADX_BIN || 'jadx';

export async function decompile(apk, { out }) {
  const dexDir = path.join(out, path.basename(apk, '.apk'));
  if (fs.existsSync(dexDir)) return dexDir;
  fs.mkdirSync(dexDir, { recursive:true });
  logger.info('running jadx…');
  await execa(JADX, ['-d', dexDir, apk], { stdio:'inherit' });
  return dexDir;
}
```

---

## 5 · `scan.js` + `scanWorker.js`

```js
import { Worker } from 'worker_threads';
import fg from 'fast-glob';
import os from 'os';
import { logger } from './utils/logger.js';

export async function scan(dexDir, families) {
  const files = await fg(['**/*.smali'], { cwd: dexDir, absolute:true });
  const chunkSize = Math.ceil(files.length / os.cpus().length);
  const chunks = [...Array(os.cpus().length)].map((_,i)=>files.slice(i*chunkSize,(i+1)*chunkSize));
  const res = {};
  await Promise.all(chunks.map(chunk => new Promise((resolve,reject)=>{
    const w = new Worker(new URL('./scanWorker.js', import.meta.url), {
      workerData: { files:chunk, families }
    });
    w.on('message', r => { Object.assign(res,r); });
    w.on('error', reject);
    w.on('exit', resolve);
  })));
  logger.info({families:Object.keys(res)}, 'scan complete');
  return res;
}
```

`scanWorker.js`

```js
import { parentPort, workerData } from 'worker_threads';
import fs from 'fs';
const { files, families } = workerData;

// dynamic import hook modules inside worker
const patterns = await Promise.all(families.map(f=>import(`./hooks/${f}.js`)));
const results = {};
for (const file of files) {
  const src = fs.readFileSync(file,'utf8');
  for (const mod of patterns) {
    const hits = mod.match(src);
    if (!hits?.length) continue;
    results[mod.family] ??= [];
    results[mod.family].push(...hits.map(h=>({...h, file})));
  }
}
parentPort.postMessage(results);
```

---

## 6 · `hooks/` folder

**Example:** `hooks/admob.js`

```js
export const family = 'admob';
export function match(src) {
  const clazzRe = /Lcom\/google\/android\/gms\/ads\/(rewarded|reward)/g;
  const out = [];
  let m;
  while ((m = clazzRe.exec(src))) {
    const clazz = m[0].replace(/\//g,'.').slice(1,-1);
    out.push({ className:clazz, methodName:'onUserEarnedReward', clazzVar:`C${out.length}` });
  }
  return out;
}
```

*Every module just needs `family` + `match()`; optional `patch()` for custom script body.*

---

## 7 · `frida.js` – server lifecycle & script emitter

```js
import fs from 'fs';
import path from 'path';
import axios from 'axios';
import execa from 'execa';
import Handlebars from 'handlebars';
import { execAdb } from './adb.js';
import { logger } from './utils/logger.js';
import { tmpdir } from './utils/misc.js';

Handlebars.registerHelper('json', o => JSON.stringify(o));

const TEMPLATE = fs.readFileSync(new URL('./templates/frida.hbs', import.meta.url), 'utf8');
const compileTpl = Handlebars.compile(TEMPLATE);

export async function ensureFridaServer(device) {
  const ver = (await execa('frida', ['--version'])).stdout.trim();
  const abi = (await execAdb(device, 'shell getprop ro.product.cpu.abi')).stdout.trim();
  const remote = await execAdb(device, 'shell pidof frida-server', { reject:false });
  if (remote.exitCode === 0) return; // already running

  const bin = `frida-server-${ver}-android-${abi}`;
  const url = `https://github.com/frida/frida/releases/download/${ver}/${bin}.xz`;
  const dl = path.join(tmpdir(), `${bin}.xz`);
  if (!fs.existsSync(dl)) {
    logger.info('downloading frida-server…');
    const res = await axios({url, responseType:'stream'});
    await new Promise(r=>res.data.pipe(fs.createWriteStream(dl)).on('finish',r));
  }
  await execa('unxz', [dl]);
  await execAdb(device, `push ${dl.replace(/\.xz$/,'')} /data/local/tmp/frida`);
  await execAdb(device, 'shell chmod 755 /data/local/tmp/frida');
  await execAdb(device, 'shell /data/local/tmp/frida &');
  logger.info('frida-server started');
}

export async function generateFrida(pkg, comps, outDir) {
  const script = compileTpl({ pkg, comps });
  const pkgDir = path.join(outDir, pkg);
  fs.mkdirSync(pkgDir, {recursive:true});
  const scriptPath = path.join(pkgDir, 'auto-ad-bypass.js');
  fs.writeFileSync(scriptPath, script);

  // deploy helper
  const deploy = path.join(pkgDir, 'deploy.sh');
  fs.writeFileSync(deploy, `#!/bin/bash\nfrida -U -f ${pkg} -l ${scriptPath} --no-pause`);
  fs.chmodSync(deploy, 0o755);
  return { script: scriptPath, deploy };
}
```

`templates/frida.hbs` (trimmed)

```hbs
Java.perform(() => {
  {{#each comps.admob}}
  const {{clazzVar}} = Java.use('{{className}}');
  {{clazzVar}}.{{methodName}}.implementation = function(reward) {
    send('[BYPASS] {{methodName}} fired');
    try { return this.$super.{{methodName}}(reward); } catch (_) {}
    const Fake = Java.use('com.google.android.gms.ads.rewarded.RewardItem').$new('Auto',1);
    this.$super.{{methodName}}(Fake);
  };
  {{/each}}
});
```

---

## 8 · `utils/`

### 8.1 `logger.js`

```js
import pino from 'pino';
export const logger = pino({ level:'info', transport:{ target:'pino-pretty' } });
```

### 8.2 `misc.js`

```js
import os from 'os';
import fs from 'fs';
import path from 'path';
export function tmpdir() {
  const dir = path.join(os.tmpdir(), 'apk-frida');
  if (!fs.existsSync(dir)) fs.mkdirSync(dir, {recursive:true});
  return dir;
}
```

### 8.3 `checksum.js`

```js
import crypto from 'crypto';
import fs from 'fs';
export function fileHash(fp) {
  const h = crypto.createHash('sha256');
  h.update(fs.readFileSync(fp));
  return h.digest('hex');
}
```

---

## 9 · Auto‑test harness (optional)

```js
import { generateFrida } from './frida.js';
// if --tests flag given, append test routines per component
```

*(Harness serialises hook list into on‑load self‑invocation and asserts no exception.)*

---

## 10 · Putting it together

```bash
npm i  # installs commander, enquirer, pino, fast-glob, axios, execa, zx, handlebars
apk-frida \
  --package com.my.game \
  --pull --analyze --gen-script --verbose
./analysis/com.my.game/deploy.sh    # profit
```

---

## 11 · Feature ↔ Implementation map (cross‑reference)

See **OVERVIEW.md** table – every feature column links back to the specific module & function names shown above.

---
