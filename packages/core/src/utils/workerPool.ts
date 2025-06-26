import Piscina from 'piscina';
import os from 'os';
import { logger } from './logger.js';

/**
 * Worker pool implementation using Piscina
 */
class WorkerPool {
  // @ts-ignore - Ignore Piscina type errors
  private pool: any = null;
  private workerId = 0;
  private totalJobs = 0;
  private completedJobs = 0;
  private startTime = 0;
  
  /**
   * Initialize the worker pool with a worker script
   * @param filename Path to the worker script
   * @returns The initialized pool
   */
  initialize(filename: string): any {
    if (this.pool) {
      throw new Error('Worker pool already initialized');
    }
    
    // Determine number of threads - limit to CPU count or 8, whichever is smaller
    const threads = Math.min(os.cpus().length, 8);
    logger.debug(`Initializing worker pool with ${threads} threads`);
    
    this.workerId = 0;
    this.totalJobs = 0;
    this.completedJobs = 0;
    this.startTime = Date.now();
    
    // Create the worker pool
    // @ts-ignore - Ignore Piscina type errors
    this.pool = new Piscina({
      filename,
      minThreads: 1,
      maxThreads: threads
    });
    
    return this.pool;
  }
  
  /**
   * Run a task in the worker pool
   * @param data Data to pass to the worker
   * @returns Promise with worker result
   */
  async run<T, R>(data: T): Promise<R> {
    if (!this.pool) {
      throw new Error('Worker pool not initialized');
    }
    
    const id = ++this.workerId;
    this.totalJobs++;
    
    try {
      logger.debug(`Running worker task #${id}`);
      const result = await this.pool.run(data, { name: 'default' }) as R;
      this.completedJobs++;
      return result;
    } catch (error) {
      logger.error(`Worker task #${id} failed: ${error}`);
      throw error;
    }
  }
  
  /**
   * Shutdown the worker pool
   */
  async shutdown(): Promise<void> {
    if (!this.pool) {
      return;
    }
    
    try {
      const elapsedTime = ((Date.now() - this.startTime) / 1000).toFixed(2);
      logger.info(`Worker pool stats: ${this.completedJobs}/${this.totalJobs} jobs completed in ${elapsedTime}s`);
      
      await this.pool.destroy();
      this.pool = null;
    } catch (error) {
      logger.error(`Error shutting down worker pool: ${error}`);
    }
  }
}

// Export singleton instance
export const workerPool = new WorkerPool(); 