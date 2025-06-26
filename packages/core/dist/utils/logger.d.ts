declare class Logger {
    private _level;
    constructor(level?: string);
    private getTime;
    debug(msg: string, obj?: any): void;
    info(msg: string | {
        [key: string]: any;
    }, obj?: any): void;
    warn(msg: string, obj?: any): void;
    error(msg: string | Error, obj?: any): void;
    private shouldLog;
    get level(): string;
    set level(newLevel: string);
}
export declare const logger: Logger;
export {};
