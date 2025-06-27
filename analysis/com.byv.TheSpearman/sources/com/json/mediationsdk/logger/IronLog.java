package com.json.mediationsdk.logger;

import android.text.TextUtils;
import com.json.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes4.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* renamed from: a, reason: collision with root package name */
    IronSourceLogger.IronSourceTag f1962a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f1962a = ironSourceTag;
    }

    private String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return String.format("%s %s", a(stackTrace, 5), b(stackTrace, 5));
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? a() : String.format("%s - %s", a(), str);
    }

    private String a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String str = stackTraceElementArr[i].getClassName().split("\\.")[r2.length - 1];
        return str.contains("$") ? str.split("\\$")[0] : str;
    }

    private String b(StackTraceElement[] stackTraceElementArr, int i) {
        StackTraceElement stackTraceElement;
        int i2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String[] strArrSplit = stackTraceElementArr[i].getClassName().split("\\.");
        String str = strArrSplit[strArrSplit.length - 1];
        if (str.contains("$")) {
            return str.split("\\$")[1] + "." + stackTraceElementArr[i].getMethodName();
        }
        if (!stackTraceElementArr[i].getMethodName().contains("$") || stackTraceElementArr.length <= (i2 = i + 1)) {
            stackTraceElement = stackTraceElementArr[i];
        } else {
            String[] strArrSplit2 = stackTraceElementArr[i2].getClassName().split("\\$");
            if (strArrSplit2.length > 1) {
                return strArrSplit2[1] + "." + stackTraceElementArr[i2].getMethodName();
            }
            stackTraceElement = stackTraceElementArr[i2];
        }
        return stackTraceElement.getMethodName();
    }

    public void error() {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(""), 3);
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(str), 3);
    }

    public void info() {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(""), 1);
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(str), 1);
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(""), 0);
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(str), 0);
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(""), 2);
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().log(this.f1962a, a(str), 2);
    }
}
