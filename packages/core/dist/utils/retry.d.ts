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
 * Common retry configurations for different types of operations
 */
export declare const retryConfigs: {
    /**
     * Configuration for network operations (3 attempts, 1s initial delay)
     */
    network: {
        attempts: number;
        initialDelay: number;
        backoffFactor: number;
        isRetryable: (error: Error) => boolean;
    };
    /**
     * Configuration for ADB operations (3 attempts, 2s initial delay)
     */
    adb: {
        attempts: number;
        initialDelay: number;
        backoffFactor: number;
        isRetryable: (error: Error) => boolean;
    };
    /**
     * Configuration for Java executions (2 attempts, 1s initial delay)
     */
    java: {
        attempts: number;
        initialDelay: number;
        backoffFactor: number;
        isRetryable: (error: Error) => boolean;
    };
};
/**
 * Retry a function with exponential backoff
 * @param fn Function to retry
 * @param options Retry options or predefined pattern
 * @returns Promise with the function result
 */
export declare function retry<T>(fn: () => Promise<T>, options: RetryOptions): Promise<T>;
/**
 * Callable retry patterns
 * These functions wrap the retry function with predefined configurations
 */
export declare const retryPatterns: {
    /**
     * Retry a function with the network pattern
     * @param fn Function to retry
     * @returns Promise with the function result
     */
    network: <T>(fn: () => Promise<T>) => Promise<T>;
    /**
     * Retry a function with the ADB pattern
     * @param fn Function to retry
     * @returns Promise with the function result
     */
    adb: <T>(fn: () => Promise<T>) => Promise<T>;
    /**
     * Retry a function with the Java pattern
     * @param fn Function to retry
     * @returns Promise with the function result
     */
    java: <T>(fn: () => Promise<T>) => Promise<T>;
};
/**
 * Backward compatibility function for retryOperation usage
 * @param fn Function to retry
 * @param options Retry options
 * @returns Promise with the function result
 */
export declare const retryOperation: typeof retry;
export default retryPatterns;
