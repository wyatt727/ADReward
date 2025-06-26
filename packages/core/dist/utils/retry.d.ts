/**
 * Options for retry operations
 */
export interface RetryOptions {
    /**
     * Number of retry attempts
     */
    retries?: number;
    /**
     * Initial delay in milliseconds
     */
    initialDelay?: number;
    /**
     * Backoff factor for exponential backoff
     */
    backoffFactor?: number;
    /**
     * Maximum delay in milliseconds
     */
    maxDelay?: number;
    /**
     * Function to determine if an error is retryable
     */
    retryableError?: (error: any) => boolean;
    /**
     * Whether to log retry attempts
     */
    logRetries?: boolean;
}
/**
 * Retry patterns for common operations
 */
export declare const retryPatterns: {
    /**
     * Retry pattern for network operations
     */
    network: {
        retries: number;
        initialDelay: number;
        backoffFactor: number;
        maxDelay: number;
        retryableError: (error: any) => any;
    };
    /**
     * Retry pattern for ADB operations
     */
    adb: {
        retries: number;
        initialDelay: number;
        backoffFactor: number;
        maxDelay: number;
        retryableError: (error: any) => any;
    };
    /**
     * Retry pattern for Java tool operations
     */
    java: {
        retries: number;
        initialDelay: number;
        backoffFactor: number;
        maxDelay: number;
        retryableError: (error: any) => any;
    };
};
/**
 * Retry a function with exponential backoff
 * @param fn Function to retry
 * @param options Retry options
 * @returns Result of the function
 */
export declare function retry<T>(fn: () => Promise<T>, options?: RetryOptions): Promise<T>;
