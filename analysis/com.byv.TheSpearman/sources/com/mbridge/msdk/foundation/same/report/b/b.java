package com.mbridge.msdk.foundation.same.report.b;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: AnrMonitor.java */
/* loaded from: classes4.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f2917a;
    private final Handler b;
    private volatile a c;
    private com.mbridge.msdk.foundation.same.report.b.a d;
    private int e;

    private b() {
        super("AnrMonitor-Thread");
        this.b = new Handler(Looper.getMainLooper());
        this.e = 5000;
    }

    public static b a() {
        if (f2917a == null) {
            synchronized (b.class) {
                if (f2917a == null) {
                    f2917a = new b();
                }
            }
        }
        return f2917a;
    }

    public final b a(int i, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.e = i;
        this.d = aVar;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.c == null || this.c.c)) {
                synchronized (this) {
                    if (this.c == null) {
                        this.c = new a();
                    }
                    this.c.b();
                    long jUptimeMillis = this.e;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    while (jUptimeMillis > 0) {
                        try {
                            wait(jUptimeMillis);
                        } catch (InterruptedException e) {
                            Log.w("AnrMonitor", e.toString());
                        }
                        jUptimeMillis = this.e - (SystemClock.uptimeMillis() - jUptimeMillis2);
                    }
                    if (!this.c.a()) {
                        com.mbridge.msdk.foundation.same.report.b.a aVar = this.d;
                        if (aVar != null) {
                            aVar.a();
                        }
                    } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.d != null) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        this.d.a(c.a(stackTrace), stackTrace);
                    }
                }
            } else {
                try {
                    sleep(this.e);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: AnrMonitor.java */
    private class a implements Runnable {
        private long b;
        private boolean c;
        private long d;

        private a() {
            this.b = SystemClock.uptimeMillis();
        }

        final boolean a() {
            return !this.c || this.b - this.d >= ((long) b.this.e);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.c = true;
                this.b = SystemClock.uptimeMillis();
            }
        }

        final void b() {
            this.c = false;
            this.d = SystemClock.uptimeMillis();
            b.this.b.postAtFrontOfQueue(this);
        }
    }
}
