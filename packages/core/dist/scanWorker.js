import { parentPort, workerData, isMainThread } from 'worker_threads';
import fs from 'fs';
/**
 * Main worker function that processes a batch of files looking for hooks.
 * This is designed to work with both Worker Threads and Piscina.
 *
 * @param data The worker data containing files and families to scan for
 * @returns Map of hook families to hook sites
 */
async function processFiles(data) {
    const { files, families } = data;
    const results = {};
    // Dynamic import hook modules inside worker
    const patterns = await Promise.all(families.map(f => import(`../hooks/${f}.js`).catch(e => {
        console.error(`Error loading hook family ${f}:`, e);
        return { family: f, match: () => [] };
    })));
    for (const file of files) {
        try {
            const src = fs.readFileSync(file, 'utf8');
            for (const mod of patterns) {
                const hits = mod.match?.(src);
                if (!hits?.length)
                    continue;
                if (!results[mod.family]) {
                    results[mod.family] = [];
                }
                results[mod.family].push(...hits.map((h) => ({ ...h, file })));
            }
        }
        catch (error) {
            console.error(`Error processing file ${file}:`, error);
            // Continue with next file
        }
    }
    return results;
}
// Support both Worker Threads (direct invocation) and Piscina (module.exports)
if (!isMainThread && parentPort) {
    // Worker Threads mode
    const data = workerData;
    processFiles(data).then(results => parentPort.postMessage(results), error => {
        console.error('Worker error:', error);
        parentPort.postMessage({});
    });
}
// Export for Piscina
export default processFiles;
//# sourceMappingURL=scanWorker.js.map