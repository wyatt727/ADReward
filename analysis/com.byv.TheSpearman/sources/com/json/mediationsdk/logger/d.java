package com.json.mediationsdk.logger;

import com.json.mediationsdk.logger.IronSourceLogger;
import java.lang.Thread;

/* loaded from: classes4.dex */
public class d implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name =" + thread.getName(), th);
    }
}
