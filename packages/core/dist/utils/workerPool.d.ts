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
    initialize(filename: string): any;
    /**
     * Run a task in the worker pool
     * @param data Data to pass to the worker
     * @returns Promise with worker result
     */
    run<T, R>(data: T): Promise<R>;
    /**
     * Shutdown the worker pool
     */
    shutdown(): Promise<void>;
}
export declare const workerPool: WorkerPool;
export {};
