package com.my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private int f4239a = -1;
    private int b = -1;
    private String c;

    l0() {
    }

    public void a(Context context) {
        this.f4239a = -1;
        this.b = -1;
        this.c = null;
        if (o0.a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        this.f4239a = 2;
                    } else if (type != 1) {
                        this.f4239a = 1;
                    } else {
                        this.f4239a = 3;
                    }
                    this.c = activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
                }
            } catch (SecurityException unused) {
                z0.a("No permissions for access to network state");
            }
        }
        if (o0.a() || !o0.a("android.permission.BLUETOOTH", context)) {
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                this.b = defaultAdapter.isEnabled() ? 1 : 0;
            }
        } catch (SecurityException unused2) {
            z0.a("Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
        }
    }

    public void a(s0 s0Var, Context context) {
        s0Var.a(this.f4239a, this.c);
        int i = this.b;
        if (i != -1) {
            s0Var.g(i);
        }
    }

    public void b(Context context) {
    }
}
