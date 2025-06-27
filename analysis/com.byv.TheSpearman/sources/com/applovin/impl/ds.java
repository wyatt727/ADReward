package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes.dex */
final class ds {

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f374a;
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public ds(Context context) {
        this.f374a = (WifiManager) context.getApplicationContext().getSystemService(com.json.p2.b);
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = this.f374a;
            if (wifiManager == null) {
                kc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
