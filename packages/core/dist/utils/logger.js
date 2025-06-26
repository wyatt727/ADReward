// Simple logger implementation that can be enhanced later
class Logger {
    _level;
    constructor(level = 'info') {
        this._level = level;
    }
    getTime() {
        return new Date().toISOString();
    }
    debug(msg, obj) {
        if (this.shouldLog('debug')) {
            console.debug(`[${this.getTime()}] DEBUG: ${msg}`, obj || '');
        }
    }
    info(msg, obj) {
        if (this.shouldLog('info')) {
            if (typeof msg === 'object') {
                console.info(`[${this.getTime()}] INFO:`, msg);
            }
            else {
                console.info(`[${this.getTime()}] INFO: ${msg}`, obj || '');
            }
        }
    }
    warn(msg, obj) {
        if (this.shouldLog('warn')) {
            console.warn(`[${this.getTime()}] WARN: ${msg}`, obj || '');
        }
    }
    error(msg, obj) {
        if (this.shouldLog('error')) {
            console.error(`[${this.getTime()}] ERROR: ${msg}`, obj || '');
        }
    }
    shouldLog(level) {
        const levels = { debug: 0, info: 1, warn: 2, error: 3 };
        return levels[level] >= levels[this._level];
    }
    get level() {
        return this._level;
    }
    set level(newLevel) {
        this._level = newLevel;
    }
}
export const logger = new Logger();
//# sourceMappingURL=logger.js.map