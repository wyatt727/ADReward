import { logger } from './logger.js';
/**
 * Default retry options
 */
const defaultOptions = {
    retries: 3,
    initialDelay: 1000,
    backoffFactor: 2,
    maxDelay: 30000,
    retryableError: () => true,
    logRetries: true
};
/**
 * Retry patterns for common operations
 */
export const retryPatterns = {
    /**
     * Retry pattern for network operations
     */
    network: {
        retries: 3,
        initialDelay: 1000,
        backoffFactor: 2,
        maxDelay: 10000,
        retryableError: (error) => {
            // Network errors are often transient
            const message = error?.message?.toLowerCase() || '';
            return message.includes('network') ||
                message.includes('timeout') ||
                message.includes('econnrefused') ||
                message.includes('econnreset');
        }
    },
    /**
     * Retry pattern for ADB operations
     */
    adb: {
        retries: 3,
        initialDelay: 2000,
        backoffFactor: 1.5,
        maxDelay: 10000,
        retryableError: (error) => {
            // ADB errors that might be temporary
            const message = error?.message?.toLowerCase() || '';
            return message.includes('device') ||
                message.includes('offline') ||
                message.includes('unauthorized') ||
                message.includes('timeout');
        }
    },
    /**
     * Retry pattern for Java tool operations
     */
    java: {
        retries: 2,
        initialDelay: 1000,
        backoffFactor: 2,
        maxDelay: 5000,
        retryableError: (error) => {
            // Java errors that might be retryable
            const message = error?.message?.toLowerCase() || '';
            return message.includes('out of memory') ||
                message.includes('timeout');
        }
    }
};
/**
 * Retry a function with exponential backoff
 * @param fn Function to retry
 * @param options Retry options
 * @returns Result of the function
 */
export async function retry(fn, options = {}) {
    const opts = { ...defaultOptions, ...options };
    let lastError;
    for (let attempt = 1; attempt <= opts.retries + 1; attempt++) {
        try {
            return await fn();
        }
        catch (error) {
            lastError = error;
            // Check if error is retryable
            if (!opts.retryableError(error)) {
                if (opts.logRetries) {
                    logger.debug(`Non-retryable error: ${error instanceof Error ? error.message : String(error)}`);
                }
                throw error;
            }
            // Check if we've used all retries
            if (attempt > opts.retries) {
                if (opts.logRetries) {
                    logger.warn(`All ${opts.retries} retry attempts failed, giving up`);
                }
                throw error;
            }
            // Calculate backoff delay
            const delay = Math.min(opts.initialDelay * Math.pow(opts.backoffFactor, attempt - 1), opts.maxDelay);
            if (opts.logRetries) {
                logger.info(`Retry attempt ${attempt}/${opts.retries} after ${delay}ms: ${error instanceof Error ? error.message : String(error)}`);
            }
            // Wait for the backoff period
            await new Promise(resolve => setTimeout(resolve, delay));
        }
    }
    // This should never happen due to the throw in the loop
    throw lastError;
}
//# sourceMappingURL=retry.js.map