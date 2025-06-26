/**
 * Configuration for timing utility
 */
interface TimingConfig {
    enabled: boolean;
}
/**
 * Utility for measuring and reporting execution timing
 */
declare class Timing {
    private config;
    private observer;
    /**
     * Configure timing behavior
     */
    configure(config: Partial<TimingConfig>): void;
    /**
     * Set up performance observer
     */
    private setupObserver;
    /**
     * Tear down performance observer
     */
    private teardownObserver;
    /**
     * Time an asynchronous function and return its result
     * @param label Label for the timing measurement
     * @param fn Function to time
     * @returns Result of the function
     */
    time<T>(label: string, fn: () => Promise<T>): Promise<T>;
    /**
     * Time a synchronous function and return its result
     * @param label Label for the timing measurement
     * @param fn Function to time
     * @returns Result of the function
     */
    timeSync<T>(label: string, fn: () => T): T;
    /**
     * Check if timing is enabled
     */
    isEnabled(): boolean;
}
export declare const timing: Timing;
export {};
