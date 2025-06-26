// Simple logger implementation that can be enhanced later
class Logger {
  private _level: string;

  constructor(level: string = 'info') {
    this._level = level;
  }

  private getTime(): string {
    return new Date().toISOString();
  }

  debug(msg: string, obj?: any): void {
    if (this.shouldLog('debug')) {
      console.debug(`[${this.getTime()}] DEBUG: ${msg}`, obj || '');
    }
  }

  info(msg: string | { [key: string]: any }, obj?: any): void {
    if (this.shouldLog('info')) {
      if (typeof msg === 'object') {
        console.info(`[${this.getTime()}] INFO:`, msg);
      } else {
        console.info(`[${this.getTime()}] INFO: ${msg}`, obj || '');
      }
    }
  }

  warn(msg: string, obj?: any): void {
    if (this.shouldLog('warn')) {
      console.warn(`[${this.getTime()}] WARN: ${msg}`, obj || '');
    }
  }

  error(msg: string | Error, obj?: any): void {
    if (this.shouldLog('error')) {
      console.error(`[${this.getTime()}] ERROR: ${msg}`, obj || '');
    }
  }

  private shouldLog(level: string): boolean {
    const levels = { debug: 0, info: 1, warn: 2, error: 3 };
    return levels[level as keyof typeof levels] >= levels[this._level as keyof typeof levels];
  }

  get level(): string {
    return this._level;
  }

  set level(newLevel: string) {
    this._level = newLevel;
  }
}

export const logger = new Logger(); 