import { performance, PerformanceObserver } from 'perf_hooks';
import { logger } from './logger.js';

/**
 * Configuration for timing utility
 */
interface TimingConfig {
  enabled: boolean;
}

/**
 * Utility for measuring and reporting execution timing
 */
class Timing {
  private config: TimingConfig = {
    enabled: false
  };
  
  private observer: PerformanceObserver | null = null;
  
  /**
   * Configure timing behavior
   */
  configure(config: Partial<TimingConfig>): void {
    this.config = { ...this.config, ...config };
    
    if (this.config.enabled) {
      this.setupObserver();
    } else {
      this.teardownObserver();
    }
  }
  
  /**
   * Set up performance observer
   */
  private setupObserver(): void {
    if (this.observer) {
      return;
    }
    
    this.observer = new PerformanceObserver((list) => {
      const entries = list.getEntries();
      for (const entry of entries) {
        logger.info({
          phase: entry.name,
          duration_ms: entry.duration.toFixed(1),
          timing: true
        }, `Timing - ${entry.name}: ${entry.duration.toFixed(1)}ms`);
      }
    });
    
    this.observer.observe({ entryTypes: ['measure'] });
    logger.debug('Performance timing enabled');
  }
  
  /**
   * Tear down performance observer
   */
  private teardownObserver(): void {
    if (this.observer) {
      this.observer.disconnect();
      this.observer = null;
      logger.debug('Performance timing disabled');
    }
  }
  
  /**
   * Time an asynchronous function and return its result
   * @param label Label for the timing measurement
   * @param fn Function to time
   * @returns Result of the function
   */
  async time<T>(label: string, fn: () => Promise<T>): Promise<T> {
    if (!this.config.enabled) {
      return fn();
    }
    
    const markStart = `${label}-start`;
    const markEnd = `${label}-end`;
    
    performance.mark(markStart);
    try {
      const result = await fn();
      performance.mark(markEnd);
      performance.measure(label, markStart, markEnd);
      return result;
    } catch (error) {
      performance.mark(markEnd);
      performance.measure(`${label}-error`, markStart, markEnd);
      throw error;
    }
  }
  
  /**
   * Time a synchronous function and return its result
   * @param label Label for the timing measurement
   * @param fn Function to time
   * @returns Result of the function
   */
  timeSync<T>(label: string, fn: () => T): T {
    if (!this.config.enabled) {
      return fn();
    }
    
    const markStart = `${label}-start`;
    const markEnd = `${label}-end`;
    
    performance.mark(markStart);
    try {
      const result = fn();
      performance.mark(markEnd);
      performance.measure(label, markStart, markEnd);
      return result;
    } catch (error) {
      performance.mark(markEnd);
      performance.measure(`${label}-error`, markStart, markEnd);
      throw error;
    }
  }
  
  /**
   * Check if timing is enabled
   */
  isEnabled(): boolean {
    return this.config.enabled;
  }
}

export const timing = new Timing(); 