package com.json.mediationsdk.logger;

/* loaded from: classes4.dex */
public abstract class IronSourceLogger {

    /* renamed from: a, reason: collision with root package name */
    int f1964a;
    private String b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(String str) {
        this.b = str;
        this.f1964a = 0;
    }

    IronSourceLogger(String str, int i) {
        this.b = str;
        this.f1964a = i;
    }

    int a() {
        return this.f1964a;
    }

    String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IronSourceLogger)) {
            return false;
        }
        IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
        String str = this.b;
        return str != null && str.equals(ironSourceLogger.b);
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.f1964a = i;
    }
}
