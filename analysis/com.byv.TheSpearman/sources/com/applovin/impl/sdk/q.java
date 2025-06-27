package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.ve;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class q {
    private static final a j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k f978a;
    private long c;
    private long f;
    private Object g;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Object d = new Object();
    private final AtomicBoolean e = new AtomicBoolean();
    private final Map h = new HashMap();
    private final Object i = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f979a = -1;
        private int b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f979a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i = aVar.b;
            aVar.b = i + 1;
            return i;
        }

        public int a() {
            return this.b;
        }
    }

    q(k kVar) {
        this.f978a = kVar;
    }

    public void a(boolean z) {
        synchronized (this.d) {
            this.e.set(z);
            if (z) {
                this.f = System.currentTimeMillis();
                this.f978a.L();
                if (t.a()) {
                    this.f978a.L().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f);
                }
                final Long l = (Long) this.f978a.a(oj.c2);
                if (l.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(l);
                        }
                    }, l.longValue());
                }
            } else {
                this.f = 0L;
                this.f978a.L();
                if (t.a()) {
                    this.f978a.L().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.b.get();
    }

    public boolean d() {
        return this.e.get();
    }

    public void b(Object obj) {
        if (!ve.b(obj) && this.b.compareAndSet(true, false)) {
            this.g = null;
            this.f978a.L();
            if (t.a()) {
                this.f978a.L().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.i) {
            a aVar = (a) this.h.get(str);
            if (aVar == null) {
                aVar = new a();
                this.h.put(str, aVar);
            }
            aVar.f979a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.i) {
            aVar = (a) this.h.get(str);
            if (aVar == null) {
                aVar = j;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        if (d() && System.currentTimeMillis() - this.f >= l.longValue()) {
            this.f978a.L();
            if (t.a()) {
                this.f978a.L().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.e.set(false);
        }
    }

    public Object a() {
        return this.g;
    }

    public void a(final Object obj) {
        if (!ve.b(obj) && this.b.compareAndSet(false, true)) {
            this.g = obj;
            this.c = System.currentTimeMillis();
            this.f978a.L();
            if (t.a()) {
                this.f978a.L().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final Long l = (Long) this.f978a.a(oj.d2);
            if (l.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(l, obj);
                    }
                }, l.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l, Object obj) {
        if (this.b.get() && System.currentTimeMillis() - this.c >= l.longValue()) {
            this.f978a.L();
            if (t.a()) {
                this.f978a.L().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.i) {
            this.h.remove(str);
        }
    }
}
