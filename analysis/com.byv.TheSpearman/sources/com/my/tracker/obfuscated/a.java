package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class a {
    final p d;
    final a1 e;
    final w0 f;
    final Application g;

    /* renamed from: a, reason: collision with root package name */
    final Map<Activity, Boolean> f4207a = new WeakHashMap();
    final Handler b = g.f4225a;
    final AtomicBoolean c = new AtomicBoolean();
    long k = 0;
    long l = 0;
    final Runnable h = new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.b();
        }
    };
    final Runnable i = new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.c();
        }
    };
    final Runnable j = new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.d();
        }
    };

    private final class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }
    }

    private a(p pVar, a1 a1Var, w0 w0Var, Application application) {
        this.d = pVar;
        this.e = a1Var;
        this.f = w0Var;
        this.g = application;
    }

    public static a a(p pVar, a1 a1Var, w0 w0Var, Application application) {
        return new a(pVar, a1Var, w0Var, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(y0.a(this.e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        r0.a(this.g).d(y0.b(this.k));
    }

    public void a() {
        this.g.registerActivityLifecycleCallbacks(new b());
    }

    void a(long j) {
        this.b.removeCallbacks(this.h);
        this.c.set(true);
        this.b.postDelayed(this.h, j);
        this.l = System.currentTimeMillis() + j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.f4207a.put(activity, Boolean.TRUE) != null || this.f4207a.size() > 1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.k >= y0.a(this.e.i())) {
            this.f.c();
            if (this.e.p()) {
                this.d.e();
                a(y0.a(this.e.e()));
                return;
            }
        }
        long j = this.l - jCurrentTimeMillis;
        if (j > 0) {
            a(j);
        } else {
            f();
        }
    }

    void c(Activity activity) {
        if (this.f4207a.remove(activity) == null || !this.f4207a.isEmpty()) {
            return;
        }
        this.c.set(false);
        this.b.removeCallbacks(this.h);
        this.k = System.currentTimeMillis();
        g.a(this.j);
    }

    public void d(final Activity activity) {
        g.c(new Runnable() { // from class: com.my.tracker.obfuscated.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(activity);
            }
        });
    }

    public void e() {
        if (this.c.get()) {
            g.c(this.i);
        }
    }

    void f() {
        z0.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }
}
