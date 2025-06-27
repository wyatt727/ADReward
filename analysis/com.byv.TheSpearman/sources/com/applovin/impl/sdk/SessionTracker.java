package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.aa;
import com.applovin.impl.oj;
import com.applovin.impl.zp;
import com.json.t2;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a, reason: collision with root package name */
    final k f909a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicLong e = new AtomicLong();
    private final AtomicLong f = new AtomicLong();
    private Date g;
    private Date h;

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    class b implements ComponentCallbacks2 {
        b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            SessionTracker.this.d.set(i);
            if (i == 20) {
                SessionTracker.this.a();
            }
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (zp.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    SessionTracker(k kVar) {
        this.f909a = kVar;
        Application application = (Application) k.k();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f909a.L();
        if (t.a()) {
            this.f909a.L().a("SessionTracker", "Application Resumed");
        }
        this.f.set(System.currentTimeMillis());
        boolean zBooleanValue = ((Boolean) this.f909a.a(oj.C3)).booleanValue();
        long jLongValue = ((Long) this.f909a.a(oj.D3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.b.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.h == null || System.currentTimeMillis() - this.h.getTime() >= millis) {
            this.f909a.C().trackEvent("resumed");
            if (zBooleanValue) {
                this.h = new Date();
            }
        }
        if (!zBooleanValue) {
            this.h = new Date();
        }
        this.f909a.F().c(aa.p);
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.d.get();
    }

    public boolean isApplicationPaused() {
        return this.c.get();
    }

    public void pauseForClick() {
        this.b.set(true);
    }

    public void resumeForClick() {
        this.b.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f909a.L();
        if (t.a()) {
            this.f909a.L().a("SessionTracker", "Application Paused");
        }
        this.e.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.b.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f909a.a(oj.C3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f909a.a(oj.E3)).longValue());
        if (this.g == null || System.currentTimeMillis() - this.g.getTime() >= millis) {
            this.f909a.C().trackEvent(t2.h.f0);
            if (zBooleanValue) {
                this.g = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.g = new Date();
    }
}
