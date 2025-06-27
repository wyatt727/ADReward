package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class sm {
    private static final ExecutorService o = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f997a;
    private final com.applovin.impl.sdk.t b;
    private final ScheduledThreadPoolExecutor c;
    private final ScheduledThreadPoolExecutor d;
    private final ScheduledThreadPoolExecutor e;
    private final ScheduledThreadPoolExecutor f;
    private final ScheduledThreadPoolExecutor g;
    private final ScheduledThreadPoolExecutor h;
    private final ScheduledThreadPoolExecutor i;
    private final Map j = new HashMap();
    private final List k = new ArrayList(5);
    private final Object l = new Object();
    private boolean m;
    private boolean n;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f998a;

        static {
            int[] iArr = new int[b.values().length];
            f998a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f998a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f998a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f998a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public sm(com.applovin.impl.sdk.k kVar) {
        this.f997a = kVar;
        this.b = kVar.L();
        this.n = ((Boolean) kVar.a(oj.U)).booleanValue();
        this.c = b("auxiliary_operations", ((Integer) kVar.a(oj.P)).intValue());
        this.d = b("shared_thread_pool", ((Integer) kVar.a(oj.O)).intValue());
        this.e = b("core", ((Integer) kVar.a(oj.V)).intValue());
        this.g = b("caching", ((Integer) kVar.a(oj.W)).intValue());
        this.h = b("mediation", ((Integer) kVar.a(oj.X)).intValue());
        this.f = b("timeout", ((Integer) kVar.a(oj.Y)).intValue());
        this.i = b("other", ((Integer) kVar.a(oj.Z)).intValue());
    }

    public boolean d() {
        return this.m;
    }

    public Executor c() {
        return this.n ? this.e : this.d;
    }

    public ExecutorService b() {
        return this.n ? this.g : o;
    }

    public void f() {
        synchronized (this.l) {
            this.m = false;
        }
    }

    public ExecutorService a(String str, int i) {
        return Executors.newFixedThreadPool(i, new c(str));
    }

    public void e() {
        synchronized (this.l) {
            this.m = true;
            for (d dVar : this.k) {
                a(dVar.d, dVar.f);
            }
            this.k.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f1002a;
        private final String b;
        private final com.applovin.impl.sdk.t c;
        private final xl d;
        private final b f;

        @Override // java.lang.Runnable
        public void run() {
            try {
                x3.a();
                if (!this.f1002a.A0() || this.d.d()) {
                    ScheduledFuture scheduledFutureB = this.d.b(Thread.currentThread(), ((Long) this.f1002a.a(oj.L)).longValue());
                    this.d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.d(this.b, "Task re-scheduled...");
                    }
                    this.f1002a.l0().a(this.d, this.f, 2000L);
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.d(this.b, this.f + " queue finished task " + this.d.c());
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a(this.b, "Task failed execution", th);
                    }
                    this.d.a(th);
                } finally {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.d(this.b, this.f + " queue finished task " + this.d.c());
                    }
                }
            }
        }

        public d(com.applovin.impl.sdk.k kVar, xl xlVar, b bVar) {
            this.f1002a = kVar;
            this.c = kVar.L();
            this.b = xlVar.c();
            this.d = xlVar;
            this.f = bVar;
        }
    }

    private class c implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f1000a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f1000a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) sm.this.f997a.a(oj.R)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }

        c(String str) {
            this.f1000a = str;
        }

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.t unused = sm.this.b;
                if (com.applovin.impl.sdk.t.a()) {
                    sm.this.b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }
    }

    public void a(xl xlVar, b bVar) {
        a(xlVar, bVar, 0L);
    }

    public void a(xl xlVar, b bVar, long j) {
        a(xlVar, bVar, j, false);
    }

    private boolean b(d dVar) {
        if (dVar.d.d()) {
            return false;
        }
        synchronized (this.l) {
            if (this.m) {
                return false;
            }
            this.k.add(dVar);
            return true;
        }
    }

    public void a(xl xlVar, b bVar, long j, boolean z) {
        if (xlVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            d dVar = new d(this.f997a, xlVar, bVar);
            if (!b(dVar)) {
                a(dVar, j, z);
                return;
            } else {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.d(xlVar.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
    }

    public ScheduledFuture b(xl xlVar, b bVar, long j) {
        if (this.n) {
            return a(new d(this.f997a, xlVar, bVar)).schedule(xlVar, j, TimeUnit.MILLISECONDS);
        }
        return this.c.schedule(xlVar, j, TimeUnit.MILLISECONDS);
    }

    private ScheduledThreadPoolExecutor b(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new c(str));
    }

    public void a(xl xlVar, ke keVar) {
        String strB = keVar.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new d(this.f997a, xlVar, b.MEDIATION));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.n) {
            com.applovin.impl.sdk.k kVar = this.f997a;
            d dVar = new d(kVar, new kn(kVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.c.submit(runnable);
    }

    public void a(xl xlVar) {
        if (xlVar != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.n ? this.e : this.d;
            try {
                if (zp.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.f997a, xlVar, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = xlVar.b(Thread.currentThread(), ((Long) this.f997a.a(oj.L)).longValue());
                xlVar.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.a(xlVar.c(), "Task failed execution", th);
                }
                xlVar.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public ExecutorService a() {
        return this.n ? this.i : this.c;
    }

    private void a(final d dVar, long j, boolean z) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.n ? a(dVar) : this.d;
        if (j <= 0) {
            scheduledThreadPoolExecutorA.submit(dVar);
        } else if (z) {
            w1.a(j, this.f997a, new Runnable() { // from class: com.applovin.impl.sm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(dVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(dVar, j, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i = a.f998a[dVar.f.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        if (i != 4) {
            return this.i;
        }
        return this.f;
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
