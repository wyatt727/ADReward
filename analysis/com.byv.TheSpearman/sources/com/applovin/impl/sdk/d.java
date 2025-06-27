package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.ho;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private ho f922a;
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean();
    private boolean d;
    private final k f;
    private final WeakReference g;
    private long h;

    public interface a {
        void onAdRefresh();
    }

    public d(k kVar, a aVar) {
        this.g = new WeakReference(aVar);
        this.f = kVar;
    }

    private void e() {
        if (((Boolean) this.f.a(qe.X6)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f.a(qe.X6)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.f.L();
                    if (t.a()) {
                        this.f.L().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f.f0().isApplicationPaused()) {
                    this.f.L();
                    if (t.a()) {
                        this.f.L().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    ho hoVar = this.f922a;
                    if (hoVar != null) {
                        hoVar.e();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.g.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.b) {
            ho hoVar = this.f922a;
            if (hoVar != null) {
                hoVar.d();
            } else {
                this.f.L();
                if (t.a()) {
                    this.f.L().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.b) {
            this.f922a = null;
            if (!((Boolean) this.f.a(qe.Y6)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.b) {
            ho hoVar = this.f922a;
            if (hoVar != null) {
                hoVar.e();
            } else {
                this.c.set(false);
            }
        }
    }

    public void a(long j) {
        synchronized (this.b) {
            a();
            this.h = j;
            this.f922a = ho.a(j, this.f, new Runnable() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.i();
                }
            });
            if (!((Boolean) this.f.a(qe.Y6)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f.a(qe.X6)).booleanValue() && (this.f.E().c() || this.f.f0().isApplicationPaused())) {
                this.f922a.d();
            }
            if (this.c.compareAndSet(true, false) && ((Boolean) this.f.a(qe.Z6)).booleanValue()) {
                this.f.L();
                if (t.a()) {
                    this.f.L().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f922a.d();
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.b) {
            ho hoVar = this.f922a;
            jC = hoVar != null ? hoVar.c() : -1L;
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f.a(qe.W6)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z;
        a aVar;
        if (((Boolean) this.f.a(qe.W6)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.f.L();
                    if (t.a()) {
                        this.f.L().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f.E().c()) {
                    this.f.L();
                    if (t.a()) {
                        this.f.L().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.f922a != null) {
                    long jB = this.h - b();
                    long jLongValue = ((Long) this.f.a(qe.V6)).longValue();
                    if (jLongValue < 0 || jB <= jLongValue) {
                        this.f922a.e();
                        z = false;
                    } else {
                        a();
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (!z || (aVar = (a) this.g.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.f922a != null;
        }
        return z;
    }

    public void j() {
        synchronized (this.b) {
            k();
            this.d = true;
        }
    }

    public void m() {
        synchronized (this.b) {
            n();
            this.d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.b) {
            ho hoVar = this.f922a;
            if (hoVar != null) {
                hoVar.a();
                l();
            }
        }
    }
}
