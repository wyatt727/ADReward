package com.json.mediationsdk.logger;

import com.json.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {
    private static IronSourceLoggerManager d;
    private ArrayList<IronSourceLogger> c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.c = new ArrayList<>();
        c();
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.c = new ArrayList<>();
        c();
    }

    private IronSourceLogger a(String str) {
        Iterator<IronSourceLogger> it = this.c.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    private void c() {
        this.c.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        if (d == null) {
            d = new IronSourceLoggerManager("IronSourceLoggerManager");
        }
        return d;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager ironSourceLoggerManager = d;
        if (ironSourceLoggerManager == null) {
            d = new IronSourceLoggerManager("IronSourceLoggerManager");
        } else {
            ironSourceLoggerManager.f1964a = i;
        }
        return d;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.c.add(ironSourceLogger);
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (i < this.f1964a) {
            return;
        }
        Iterator<IronSourceLogger> it = this.c.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.a() <= i) {
                next.log(ironSourceTag, str, i);
            }
        }
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    @Override // com.json.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i < 0 || i > 3) {
            this.c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        ironSourceLoggerA.setDebugLevel(i);
    }
}
