/**
 * Job types that can be queued
 */
export declare enum JobType {
    APK_ACQUISITION = "apk-acquisition",
    DECOMPILE = "decompile",
    SCAN = "scan",
    FRIDA = "frida"
}
/**
 * Status of a queued job
 */
export declare enum JobStatus {
    PENDING = "pending",
    RUNNING = "running",
    COMPLETED = "completed",
    FAILED = "failed"
}
/**
 * Job interface for queue operations
 */
export interface Job<T, R> {
    id: string;
    type: JobType;
    priority: number;
    status: JobStatus;
    data: T;
    result?: R;
    error?: Error;
    startTime?: number;
    endTime?: number;
    progress?: number;
}
/**
 * Queue system for managing concurrent operations
 */
declare class QueueSystem {
    private queues;
    private jobs;
    /**
     * Add a job to the queue
     * @param job Job to add
     * @param task Function to execute
     * @returns Promise that resolves with the job result
     */
    addJob<T, R>(job: Job<T, R>, task: (data: T) => Promise<R>): Promise<Job<T, R>>;
    /**
     * Get the status of a job
     * @param jobId ID of the job to check
     * @returns Job status or undefined if not found
     */
    getJob<T, R>(jobId: string): Job<T, R> | undefined;
    /**
     * Get all jobs
     * @returns Array of all jobs
     */
    getAllJobs(): Job<any, any>[];
    /**
     * Update job progress
     * @param jobId ID of the job to update
     * @param progress Progress percentage (0-100)
     */
    updateJobProgress(jobId: string, progress: number): void;
    /**
     * Get queue statistics
     * @returns Queue statistics for each job type
     */
    getQueueStats(): Record<JobType, {
        pending: number;
        size: number;
        isIdle: boolean;
    }>;
}
export declare const jobQueue: QueueSystem;
export {};
