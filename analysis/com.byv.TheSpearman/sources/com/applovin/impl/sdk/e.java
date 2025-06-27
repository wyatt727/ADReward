package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class e {
    private static final e l = new e();
    private Handler b;
    private Handler d;
    private k g;
    private Thread h;
    private long i;
    private long j;
    private long k;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f923a = new AtomicLong(0);
    private final HandlerThread c = new HandlerThread("AppLovinSdk:anr_detector");
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicBoolean f = new AtomicBoolean();

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (e.this.e.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - e.this.f923a.get();
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > e.this.i) {
                e.this.a();
                if (e.this.h == null || e.this.h.getStackTrace().length <= 0) {
                    str = "None";
                } else {
                    StackTraceElement stackTraceElement = e.this.h.getStackTrace()[0];
                    str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                }
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.j());
                HashMap map = new HashMap(3);
                map.put("top_main_method", str);
                map.put(FirebaseAnalytics.Param.SOURCE, e.this.g.w0() ? "non_first_session" : "first_session");
                map.put("details", "seconds_since_app_launch=" + seconds);
                e.this.g.B().a(o.b.ANR, (Map) map);
            }
            e.this.d.postDelayed(this, e.this.k);
        }
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.e.get()) {
                return;
            }
            e.this.f923a.set(System.currentTimeMillis());
            e.this.b.postDelayed(this, e.this.j);
        }
    }

    private e() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.i = timeUnit.toMillis(4L);
        this.j = timeUnit.toMillis(3L);
        this.k = timeUnit.toMillis(3L);
    }

    private void a(k kVar) {
        if (this.f.compareAndSet(false, true)) {
            this.g = kVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b();
                }
            });
            this.i = ((Long) kVar.a(oj.U5)).longValue();
            this.j = ((Long) kVar.a(oj.V5)).longValue();
            this.k = ((Long) kVar.a(oj.W5)).longValue();
            this.b = new Handler(k.k().getMainLooper());
            this.c.start();
            this.b.post(new c());
            Handler handler = new Handler(this.c.getLooper());
            this.d = handler;
            handler.postDelayed(new b(), this.k / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.h = Thread.currentThread();
    }

    public static void b(k kVar) {
        if (kVar != null) {
            if (((Boolean) kVar.a(oj.T5)).booleanValue() && !zp.c(kVar)) {
                l.a(kVar);
            } else {
                l.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f.get()) {
            this.e.set(true);
        }
    }
}
