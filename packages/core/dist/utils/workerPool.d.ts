/**
 * Worker pool implementation using Piscina
 */
declare class WorkerPool {
    private pool;
    private workerId;
    private totalJobs;
    private completedJobs;
    private startTime;
    /**
     * Initialize the worker pool with a worker script
     * @param filename Path to the worker script
     * @returns The initialized pool
     */
    initialize(filename: string): Piscina;
    /**
     * Run a task in the worker pool
     * @param data Data to pass to the worker
     * @returns Promise that resolves with the worker result
     */
    run<T, R>(data: T): Promise<R>;
    /**
     * Get the worker pool utilization percentage
     * @returns Utilization percentage (0-1)
     */
    getUtilization(): number;
    /**
     * Destroy the worker pool
     */
    destroy(): Promise<void>;
}
export declare const workerPool: WorkerPool;
export {};
