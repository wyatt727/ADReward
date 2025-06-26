import { Router } from 'express';
import { v4 as uuidv4 } from 'uuid';
import path from 'path';
import fs from 'fs/promises';
import { decompile, scan } from '@adreward/core';
import { jobQueue, JobType, JobStatus } from '../queue.js';
const router = Router();
/**
 * POST /api/scan/decompile
 * Decompile an APK file
 */
router.post('/decompile', async (req, res, next) => {
    try {
        const { apkPath, outputDir, forceDecompile } = req.body;
        if (!apkPath) {
            return res.status(400).json({
                error: {
                    message: 'APK path is required',
                    code: 'MISSING_APK_PATH'
                }
            });
        }
        // Check if APK exists
        try {
            await fs.access(apkPath);
        }
        catch (error) {
            return res.status(404).json({
                error: {
                    message: `APK file not found at ${apkPath}`,
                    code: 'APK_NOT_FOUND'
                }
            });
        }
        const jobId = uuidv4();
        const outDir = outputDir || path.join(path.dirname(apkPath), path.basename(apkPath, '.apk'));
        // Create job
        const job = {
            id: jobId,
            type: JobType.DECOMPILE,
            priority: 1,
            status: JobStatus.PENDING,
            data: {
                apkPath,
                outDir,
                forceDecompile
            }
        };
        // Queue job
        jobQueue.addJob(job, async (data) => {
            // Decompile APK
            const dexDir = await decompile(data.apkPath, {
                out: data.outDir,
                forceDecompile: data.forceDecompile
            });
            return { dexDir };
        }).catch(next);
        // Return job ID immediately
        res.status(202).json({
            jobId,
            message: `Decompilation for ${path.basename(apkPath)} has been queued`,
            status: JobStatus.PENDING,
            statusUrl: `/api/health/jobs/${jobId}`
        });
    }
    catch (error) {
        next(error);
    }
});
/**
 * POST /api/scan/analyze
 * Scan a decompiled APK
 */
router.post('/analyze', async (req, res, next) => {
    try {
        const { apkPath, hooks = 'admob,unity', useIr = false, irOnly = false, showTimings = false, outputDir } = req.body;
        if (!apkPath) {
            return res.status(400).json({
                error: {
                    message: 'APK path is required',
                    code: 'MISSING_APK_PATH'
                }
            });
        }
        const jobId = uuidv4();
        const baseName = path.basename(apkPath, '.apk');
        const baseDir = path.dirname(apkPath);
        const dexDir = path.join(baseDir, baseName);
        const outDir = outputDir || path.join(baseDir, 'scan-results');
        // Check if decompiled directory exists
        try {
            await fs.access(dexDir);
        }
        catch (error) {
            return res.status(404).json({
                error: {
                    message: `Decompiled directory not found at ${dexDir}`,
                    code: 'DEXDIR_NOT_FOUND'
                }
            });
        }
        // Create job
        const job = {
            id: jobId,
            type: JobType.SCAN,
            priority: 1,
            status: JobStatus.PENDING,
            data: {
                dexDir,
                hooks: hooks.split(','),
                useIr,
                irOnly,
                showTimings,
                outDir
            }
        };
        // Queue job
        jobQueue.addJob(job, async (data) => {
            // Scan decompiled APK
            const components = await scan(data.dexDir, data.hooks, {
                useKtirScanner: data.useIr,
                useKtirOnly: data.irOnly,
                showTimings: data.showTimings,
                saveResults: true
            });
            return { components };
        }).catch(next);
        // Return job ID immediately
        res.status(202).json({
            jobId,
            message: `Scanning for ${hooks} hooks has been queued`,
            status: JobStatus.PENDING,
            statusUrl: `/api/health/jobs/${jobId}`
        });
    }
    catch (error) {
        next(error);
    }
});
/**
 * GET /api/scan/results/:jobId
 * Get scan results for a specific job
 */
router.get('/results/:jobId', async (req, res, next) => {
    try {
        const job = jobQueue.getJob(req.params.jobId);
        if (!job) {
            return res.status(404).json({
                error: {
                    message: `Job ${req.params.jobId} not found`,
                    code: 'JOB_NOT_FOUND'
                }
            });
        }
        if (job.status !== JobStatus.COMPLETED) {
            return res.status(202).json({
                message: `Job ${job.id} is ${job.status}`,
                status: job.status,
                progress: job.progress || 0
            });
        }
        res.json({
            status: job.status,
            result: job.result
        });
    }
    catch (error) {
        next(error);
    }
});
// Export the router
export const scanRouter = router;
//# sourceMappingURL=scan.js.map