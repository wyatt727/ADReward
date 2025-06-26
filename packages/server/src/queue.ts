import PQueue from 'p-queue';
import { logger } from '@adreward/core';

/**
 * Job types that can be queued
 */
export enum JobType {
  APK_ACQUISITION = 'apk-acquisition',
  DECOMPILE = 'decompile',
  SCAN = 'scan',
  FRIDA = 'frida'
}

/**
 * Status of a queued job
 */
export enum JobStatus {
  PENDING = 'pending',
  RUNNING = 'running',
  COMPLETED = 'completed',
  FAILED = 'failed'
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
class QueueSystem {
  // Queues for different job types with concurrency limits
  private queues: Record<JobType, PQueue> = {
    [JobType.APK_ACQUISITION]: new PQueue({ concurrency: 2 }),
    [JobType.DECOMPILE]: new PQueue({ concurrency: 1 }),
    [JobType.SCAN]: new PQueue({ concurrency: 1 }),
    [JobType.FRIDA]: new PQueue({ concurrency: 2 })
  };
  
  // Job storage for tracking status
  private jobs: Map<string, Job<any, any>> = new Map();
  
  /**
   * Add a job to the queue
   * @param job Job to add
   * @param task Function to execute
   * @returns Promise that resolves with the job result
   */
  async addJob<T, R>(job: Job<T, R>, task: (data: T) => Promise<R>): Promise<Job<T, R>> {
    // Store job in tracking map
    this.jobs.set(job.id, { ...job, status: JobStatus.PENDING });
    
    // Add job to the appropriate queue
    return this.queues[job.type].add(async () => {
      // Update job status
      job.status = JobStatus.RUNNING;
      job.startTime = Date.now();
      this.jobs.set(job.id, job);
      
      try {
        logger.info(`Starting job ${job.id} (type: ${job.type})`);
        // Execute the task
        const result = await task(job.data);
        
        // Update job with success results
        job.status = JobStatus.COMPLETED;
        job.result = result;
        job.endTime = Date.now();
        job.progress = 100;
        this.jobs.set(job.id, job);
        
        logger.info(`Completed job ${job.id} (type: ${job.type})`);
        return job;
      } catch (error) {
        // Update job with error information
        job.status = JobStatus.FAILED;
        job.error = error instanceof Error ? error : new Error(String(error));
        job.endTime = Date.now();
        
        logger.error(`Failed job ${job.id} (type: ${job.type}): ${error}`);
        this.jobs.set(job.id, job);
        throw error;
      }
    }, { priority: job.priority }) as Promise<Job<T, R>>;
  }
  
  /**
   * Get the status of a job
   * @param jobId ID of the job to check
   * @returns Job status or undefined if not found
   */
  getJob<T, R>(jobId: string): Job<T, R> | undefined {
    return this.jobs.get(jobId) as Job<T, R> | undefined;
  }
  
  /**
   * Get all jobs
   * @returns Array of all jobs
   */
  getAllJobs(): Job<any, any>[] {
    return Array.from(this.jobs.values());
  }
  
  /**
   * Update job progress
   * @param jobId ID of the job to update
   * @param progress Progress percentage (0-100)
   */
  updateJobProgress(jobId: string, progress: number): void {
    const job = this.jobs.get(jobId);
    if (job) {
      job.progress = Math.min(Math.max(0, progress), 100);
      this.jobs.set(jobId, job);
    }
  }
  
  /**
   * Get queue statistics
   * @returns Queue statistics for each job type
   */
  getQueueStats() {
    return Object.entries(this.queues).reduce((stats, [type, queue]) => {
      stats[type as JobType] = {
        pending: queue.pending,
        size: queue.size,
        isIdle: queue.idle
      };
      return stats;
    }, {} as Record<JobType, { pending: number, size: number, isIdle: boolean }>);
  }
}

// Create and export a singleton queue instance
export const jobQueue = new QueueSystem(); 