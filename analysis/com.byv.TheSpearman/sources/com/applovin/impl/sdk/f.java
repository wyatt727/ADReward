package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {
    public static int i = -1;

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f926a;
    private final Context b;
    private final k c;
    private final Set d = new HashSet();
    private final Object f = new Object();
    private boolean g;
    private int h;

    public interface a {
        void a(int i);
    }

    f(k kVar) {
        this.c = kVar;
        Context contextK = k.k();
        this.b = contextK;
        this.f926a = (AudioManager) contextK.getSystemService("audio");
    }

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private void c() {
        this.c.L();
        if (t.a()) {
            this.c.L().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void b(a aVar) {
        synchronized (this.f) {
            if (this.d.contains(aVar)) {
                this.d.remove(aVar);
                if (this.d.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f926a.getRingerMode());
        }
    }

    public int a() {
        return this.f926a.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f) {
            if (this.d.contains(aVar)) {
                return;
            }
            this.d.add(aVar);
            if (this.d.size() == 1) {
                b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.g = true;
            this.h = this.f926a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.g = false;
            if (this.h != this.f926a.getRingerMode()) {
                this.h = i;
                b(this.f926a.getRingerMode());
            }
        }
    }

    private void b() {
        this.c.L();
        if (t.a()) {
            this.c.L().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.h = i;
        this.b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(final int i2) {
        if (this.g) {
            return;
        }
        this.c.L();
        if (t.a()) {
            this.c.L().a("AudioSessionManager", "Ringer mode is " + i2);
        }
        synchronized (this.f) {
            for (final a aVar : this.d) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.f$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(i2);
                    }
                });
            }
        }
    }
}
