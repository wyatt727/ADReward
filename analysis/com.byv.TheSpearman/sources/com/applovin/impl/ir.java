package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ir {
    private static final Set f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f544a;
    private final com.applovin.impl.sdk.k b;
    private Runnable c;
    private final Object d = new Object();
    private final Timer e;

    private TimerTask b() {
        return new a();
    }

    private ir(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.e = timer;
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j);
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable != null) {
            this.f544a = z;
            this.b = kVar;
            this.c = runnable;
            f.add(this);
            timer.schedule(b(), j);
            return;
        }
        throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
    }

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!ir.this.b.f0().isApplicationPaused() || ir.this.f544a) {
                ir.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0027a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }

        /* renamed from: com.applovin.impl.ir$a$a, reason: collision with other inner class name */
        class C0027a implements AppLovinBroadcastManager.Receiver {
            C0027a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                ir.this.c();
            }
        }
    }

    public void a() {
        synchronized (this.d) {
            this.e.cancel();
            this.c = null;
            f.remove(this);
        }
    }

    public static ir a(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new ir(j, z, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }
}
