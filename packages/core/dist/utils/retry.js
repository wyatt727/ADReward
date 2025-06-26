import { logger } from './logger.js';
/**
 * Common retry configurations for different types of operations
 */
export const retryConfigs = {
    /**
     * Configuration for network operations (3 attempts, 1s initial delay)
     */
    network: {
        attempts: 3,
        initialDelay: 1000, // 1 second initial delay
        backoffFactor: 2, // Double the delay on each retry
        isRetryable: (error) => {
            // Network errors that should be retried
            return error.message.includes('ECONNRESET') ||
                error.message.includes('ETIMEDOUT') ||
                error.message.includes('ENOTFOUND') ||
                error.message.includes('ECONNREFUSED') ||
                error.message.includes('EHOSTUNREACH');
        }
    },
    /**
     * Configuration for ADB operations (3 attempts, 2s initial delay)
     */
    adb: {
        attempts: 3,
        initialDelay: 2000, // 2 second initial delay
        backoffFactor: 2, // Double the delay on each retry
        isRetryable: (error) => {
            // ADB errors that are worth retrying
            return error.message.includes('device offline') ||
                error.message.includes('device not found') ||
                error.message.includes('device unauthorized') ||
                error.message.includes('connection refused') ||
                error.message.includes('transport endpoint is not connected');
        }
    },
    /**
     * Configuration for Java executions (2 attempts, 1s initial delay)
     */
    java: {
        attempts: 2,
        initialDelay: 1000, // 1 second initial delay
        backoffFactor: 2, // Double the delay on each retry
        isRetryable: (error) => {
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
export async function retry(fn, options) {
    let lastError = null;
    let delay = options.initialDelay;
    for (let attempt = 1; attempt <= options.attempts; attempt++) {
        try {
            return await fn();
        }
        catch (error) {
            lastError = error;
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
 * Callable retry patterns
 * These functions wrap the retry function with predefined configurations
 */
export const retryPatterns = {
    /**
     * Retry a function with the network pattern
     * @param fn Function to retry
     * @returns Promise with the function result
     */
    network: (fn) => retry(fn, retryConfigs.network),
    /**
     * Retry a function with the ADB pattern
     * @param fn Function to retry
     * @returns Promise with the function result
     */
    adb: (fn) => retry(fn, retryConfigs.adb),
    /**
     * Retry a function with the Java pattern
     * @param fn Function to retry
     * @returns Promise with the function result
     */
    java: (fn) => retry(fn, retryConfigs.java)
};
/**
 * Backward compatibility function for retryOperation usage
 * @param fn Function to retry
 * @param options Retry options
 * @returns Promise with the function result
 */
export const retryOperation = retry;
// Export retryPatterns as default for convenient import
export default retryPatterns;
//# sourceMappingURL=retry.js.map