declare module 'update-notifier' {
  interface NotifierOptions {
    pkg?: object;
    updateCheckInterval?: number;
    isGlobal?: boolean;
    distTag?: string;
    shouldNotifyInNpmScript?: boolean;
  }

  interface UpdateInfo {
    latest: string;
    current: string;
    type: string;
    name: string;
  }

  interface Notifier {
    notify(options?: {
      isGlobal?: boolean;
      message?: string;
      boxenOptions?: object;
    }): void;
    update: UpdateInfo | undefined;
    fetchInfo(): Promise<void>;
  }

  function updateNotifier(options?: NotifierOptions): Notifier;

  export = updateNotifier;
} 