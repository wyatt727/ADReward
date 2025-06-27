package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class w1 implements AppLovinBroadcastManager.Receiver {
    private static final Set c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final ho f1110a;
    private final com.applovin.impl.sdk.k b;

    private w1(long j, com.applovin.impl.sdk.k kVar, final Runnable runnable) {
        this.f1110a = ho.a(j, kVar, new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(runnable);
            }
        });
        this.b = kVar;
        c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.f1110a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        c.remove(this);
    }

    public long b() {
        return this.f1110a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f1110a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f1110a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        a();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static w1 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new w1(j, kVar, runnable);
    }
}
