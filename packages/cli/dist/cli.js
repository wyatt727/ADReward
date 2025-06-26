#!/usr/bin/env node
import { Command } from 'commander';
import enquirer from 'enquirer';
import { execa } from 'execa';
import { logger, requireDevice, acquire, decompile, scan, ensureFridaServer, generateFrida, } from '@adreward/core';
const program = new Command();
program
    .option('-p, --package <n>', 'Android package name')
    .option('-d, --device <id>', 'ADB device id (default: first online)')
    .option('--pull', 'Pull APK/AAB from device', false)
    .option('--analyze', 'Decompile & scan', true)
    .option('--gen-script', 'Generate Frida hook', true)
    .option('--hooks <list>', 'Hook families (csv)', 'admob,unity')
    .option('-o, --out <dir>', 'Output dir', './analysis')
    .option('-v, --verbose', 'Verbose logging', false)
    .option('--ktir', 'Use Kotlin IR scanner (requires d2j-dex2jar)', false)
    .parse();
(async () => {
    try {
        // Get options and ensure they match our expected interface
        const opts = program.opts();
        if (opts.verbose) {
            logger.level = 'debug';
        }
        // — 1. pick device —
        const device = await requireDevice(opts.device);
        logger.info(`Using device: ${device}`);
        // — 2. pick package —
        let pkg = opts.package;
        if (!pkg) {
            const { stdout } = await execa('adb', ['-s', device, 'shell', 'pm', 'list', 'packages', '-3']);
            const list = stdout.trim().split('\n').map(l => l.replace('package:', ''));
            const response = await enquirer.prompt({
                type: 'select',
                name: 'answer',
                message: 'Select package',
                choices: list
            });
            pkg = response.answer;
        }
        logger.info(`Target package: ${pkg}`);
        // — 3. acquire apk —
        const apk = await acquire(pkg, device, opts);
        logger.info(`APK ready: ${apk}`);
        // early‑exit when only pulling
        if (!opts.analyze && !opts.genScript)
            return;
        // — 4. decompile —
        const dexDir = await decompile(apk, { out: opts.out, generateJar: opts.ktir });
        logger.info(`Decompilation complete: ${dexDir}`);
        // — 5. scan —
        const comps = await scan(dexDir, opts.hooks.split(','), { useKtirScanner: opts.ktir });
        logger.info('Scan results ready');
        // — 6. generate script —
        if (opts.genScript) {
            await ensureFridaServer(device);
            const paths = await generateFrida(pkg, comps, opts.out);
            logger.info(`Script ready: ${paths.deploy}`);
        }
        logger.info('All done!');
    }
    catch (err) {
        if (err instanceof Error) {
            logger.error(err.message);
        }
        else {
            logger.error(String(err));
        }
        process.exit(1);
    }
})();
//# sourceMappingURL=cli.js.map