package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ho {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f506a;
    private Timer b;
    private long c;
    private long d;
    private final Runnable e;
    private long f;
    private final Object g = new Object();

    private TimerTask b() {
        return new a();
    }

    private ho(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f506a = kVar;
        this.e = runnable;
    }

    public long c() {
        if (this.b != null) {
            return this.d - (System.currentTimeMillis() - this.c);
        }
        return this.d - this.f;
    }

    public void d() {
        synchronized (this.g) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f = Math.max(1L, System.currentTimeMillis() - this.c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f506a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f506a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f506a.L().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } finally {
                        this.b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.g) {
            long j = this.f;
            if (j > 0) {
                try {
                    long j2 = this.d - j;
                    this.d = j2;
                    if (j2 < 0) {
                        this.d = 0L;
                    }
                    Timer timer = new Timer();
                    this.b = timer;
                    timer.schedule(b(), this.d);
                    this.c = System.currentTimeMillis();
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f506a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f506a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f506a.L().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.f = 0L;
                    } finally {
                        this.f = 0L;
                    }
                }
            }
        }
    }

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                ho.this.e.run();
                synchronized (ho.this.g) {
                    ho.this.b = null;
                }
            } catch (Throwable th) {
                try {
                    if (ho.this.f506a != null) {
                        ho.this.f506a.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            ho.this.f506a.L().a("Timer", "Encountered error while executing timed task", th);
                        }
                        ho.this.f506a.B().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (ho.this.g) {
                        ho.this.b = null;
                    }
                } catch (Throwable th2) {
                    synchronized (ho.this.g) {
                        ho.this.b = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public void a() {
        synchronized (this.g) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f506a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f506a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f506a.L().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (Throwable th2) {
                        this.b = null;
                        this.f = 0L;
                        throw th2;
                    }
                }
                this.f = 0L;
            }
        }
    }

    public static ho a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            ho hoVar = new ho(kVar, runnable);
            hoVar.c = System.currentTimeMillis();
            hoVar.d = j;
            try {
                Timer timer = new Timer();
                hoVar.b = timer;
                timer.schedule(hoVar.b(), j);
            } catch (OutOfMemoryError e) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return hoVar;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }
}
