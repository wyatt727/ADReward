package com.pgl.ssdk;

import java.lang.Thread;

/* loaded from: classes4.dex */
public class M implements Thread.UncaughtExceptionHandler {
    private static volatile M c;
    private volatile boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f4294a = Thread.getDefaultUncaughtExceptionHandler();

    private M() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static M b() {
        if (c == null) {
            synchronized (M.class) {
                if (c == null) {
                    c = new M();
                }
            }
        }
        return c;
    }

    public boolean a() {
        return this.b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.b = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4294a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
