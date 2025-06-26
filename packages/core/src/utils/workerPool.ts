import Piscina from 'piscina';
import os from 'os';
import { logger } from './logger.js';

/**
 * Worker pool implementation using Piscina
 */
class WorkerPool {
  private pool: Piscina | null = null;
  private workerId = 0;
  private totalJobs = 0;
  private completedJobs = 0;
  private startTime = 0;
  
  /**
   * Initialize the worker pool with a worker script
   * @param filename Path to the worker script
   * @returns The initialized pool
   */
  initialize(filename: string): Piscina {
    if (this.pool) {
      throw new Error('Worker pool already initialized');
    }
    
    // Determine number of threads - limit to CPU count or 8, whichever is smaller
    const numThreads = Math.min(os.cpus().length, 8);
    
    logger.debug(`Initializing worker pool with ${numThreads} threads`);
    
    this.pool = new Piscina({
      filename,
      minThreads: 1,
      maxThreads: numThreads
    });
    
    this.startTime = Date.now();
    
    return this.pool;
  }
  
  /**
   * Run a task in the worker pool
   * @param data Data to pass to the worker
   * @returns Promise that resolves with the worker result
   */
  async run<T, R>(data: T): Promise<R> {
    if (!this.pool) {
      throw new Error('Worker pool not initialized');
    }
    
    const jobId = ++this.workerId;
    this.totalJobs++;
    
    try {
      logger.debug(`Starting worker job #${jobId}`);
      const result = await this.pool.run(data);
      logger.debug(`Completed worker job #${jobId}`);
      this.completedJobs++;
      return result as R;
    } catch (error) {
      logger.error(`Worker job #${jobId} failed: ${error}`);
      this.completedJobs++;
      throw error;
    }
  }
  
  /**
   * Get the worker pool utilization percentage
   * @returns Utilization percentage (0-1)
   */
  getUtilization(): number {
    if (!this.pool || this.totalJobs === 0 || this.startTime === 0) {
      return 0;
    }
    
    const runTime = Date.now() - this.startTime;
    if (runTime === 0) {
      return 0;
    }
    
    const maxPotentialThroughput = this.pool.options.maxThreads! * runTime;
    const actualUsage = this.totalJobs * (runTime / this.completedJobs);
    
    return Math.min(actualUsage / maxPotentialThroughput, 1);
  }
  
  /**
   * Destroy the worker pool
   */
  async destroy(): Promise<void> {
    if (this.pool) {
      await this.pool.destroy();
      this.pool = null;
      this.workerId = 0;
      this.totalJobs = 0;
      this.completedJobs = 0;
      this.startTime = 0;
      logger.debug('Worker pool destroyed');
    }
  }
}

export const workerPool = new WorkerPool(); 