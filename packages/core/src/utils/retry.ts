import { logger } from './logger.js';

/**
 * Options for retry operations
 */
export interface RetryOptions {
  /** Maximum number of retry attempts */
  attempts: number;
  
  /** Initial delay between retries in milliseconds */
  initialDelay: number;
  
  /** Factor to multiply delay by after each attempt */
  backoffFactor: number;
  
  /** Optional filter function to determine if an error is retryable */
  isRetryable?: (error: Error) => boolean;
}

/**
 * Common retry patterns for different types of operations
 */
export const retryPatterns = {
  /**
   * Pattern for network operations (3 attempts, 1s initial delay)
   */
  network: {
    attempts: 3,
    initialDelay: 1000,
    backoffFactor: 2,
    isRetryable: (error: Error) => {
      // Network errors are generally retryable
      return error.message.includes('ECONNRESET') ||
        error.message.includes('ETIMEDOUT') ||
        error.message.includes('ENOTFOUND') ||
        error.message.includes('ECONNREFUSED') ||
        error.message.includes('EHOSTUNREACH');
    }
  },
  
  /**
   * Pattern for ADB operations (3 attempts, 2s initial delay)
   */
  adb: {
    attempts: 3,
    initialDelay: 2000,
    backoffFactor: 2,
    isRetryable: (error: Error) => {
      // ADB errors that are worth retrying
      return error.message.includes('device offline') ||
        error.message.includes('device not found') ||
        error.message.includes('device unauthorized') ||
        error.message.includes('connection refused') ||
        error.message.includes('transport endpoint is not connected');
    }
  },
  
  /**
   * Pattern for Java executions (2 attempts, 1s initial delay)
   */
  java: {
    attempts: 2,
    initialDelay: 1000,
    backoffFactor: 2,
    isRetryable: (error: Error) => {
      // Java errors that are worth retrying (class loading, OOM)
      return error.message.includes('ClassNotFoundException') ||
        error.message.includes('OutOfMemoryError') ||
        error.message.includes('Could not reserve enough space');
    }
  }
};

/**
 * Retry a function with exponential backoff
 * @param fn Function to retry
 * @param options Retry options or predefined pattern
 * @returns Promise with the function result
 */
export async function retry<T>(fn: () => Promise<T>, options: RetryOptions): Promise<T> {
  let lastError: Error | null = null;
  let delay = options.initialDelay;
  
  for (let attempt = 1; attempt <= options.attempts; attempt++) {
    try {
      return await fn();
    } catch (error) {
      lastError = error as Error;
      
      // Check if error is retryable
      if (options.isRetryable && !options.isRetryable(lastError)) {
        logger.debug(`Error not retryable: ${lastError.message}`);
        throw lastError;
      }
      
      // Last attempt - give up
      if (attempt === options.attempts) {
        logger.debug(`Retry exhausted after ${options.attempts} attempts: ${lastError.message}`);
        throw lastError;
      }
      
      // Log and retry after delay
      logger.debug(`Attempt ${attempt} failed, retrying in ${delay}ms: ${lastError.message}`);
      await new Promise(resolve => setTimeout(resolve, delay));
      delay *= options.backoffFactor;
    }
  }
  
  // This should never happen due to the throw in the loop
  throw lastError || new Error('Unknown error in retry');
}

/**
 * Wrapper functions to make retry pattern usage simpler.
 * Allows calling retryPatterns.xxx(fn) directly.
 */
export const retryPatternsFn = {
  /**
   * Retry a function with the network pattern
   * @param fn Function to retry
   * @returns Promise with the function result
   */
  network: <T>(fn: () => Promise<T>): Promise<T> => retry(fn, retryPatterns.network),
  
  /**
   * Retry a function with the ADB pattern
   * @param fn Function to retry
   * @returns Promise with the function result
   */
  adb: <T>(fn: () => Promise<T>): Promise<T> => retry(fn, retryPatterns.adb),
  
  /**
   * Retry a function with the Java pattern
   * @param fn Function to retry
   * @returns Promise with the function result
   */
  java: <T>(fn: () => Promise<T>): Promise<T> => retry(fn, retryPatterns.java)
};

/**
 * Backward compatibility function for retryOperation usage
 * @param fn Function to retry
 * @param options Retry options
 * @returns Promise with the function result
 */
export const retryOperation = retry;

// Export retryPatternsFn as default for convenient import
export default retryPatternsFn; 