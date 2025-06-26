import { Router } from 'express';
// Make jobQueue import optional to allow testing
let jobQueue;
try {
    jobQueue = await import('../queue.js').then(m => m.jobQueue);
}
catch (error) {
    // In test environment, create a mock jobQueue
    jobQueue = {
        getQueueStats: () => ({}),
        getAllJobs: () => [],
        getJob: () => null
    };
}
const router = Router();
/**
 * GET /api/health
 * Health check endpoint
 */
router.get('/', (req, res) => {
    const queueStats = jobQueue.getQueueStats?.() || {};
    res.json({
        status: 'ok',
        timestamp: new Date().toISOString(),
        version: process.env.npm_package_version || '2.5.0',
        queues: queueStats
    });
});
/**
 * GET /api/health/jobs
 * Get status of all jobs
 */
router.get('/jobs', (req, res) => {
    res.json({
        jobs: jobQueue.getAllJobs?.().map(job => ({
            id: job.id,
            type: job.type,
            status: job.status,
            progress: job.progress || 0,
            startTime: job.startTime,
            endTime: job.endTime
        })) || []
    });
});
/**
 * GET /api/health/jobs/:id
 * Get status of a specific job
 */
router.get('/jobs/:id', (req, res) => {
    const job = jobQueue.getJob?.(req.params.id);
    if (!job) {
        return res.status(404).json({
            error: {
                message: `Job ${req.params.id} not found`,
                code: 'JOB_NOT_FOUND'
            }
        });
    }
    res.json({ job });
});
export default router;
//# sourceMappingURL=health.js.map