package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* loaded from: classes4.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private Context f4333a;
    private E b;

    public F(Context context) {
        this.f4333a = context;
    }

    public void a() {
        if (this.b != null) {
            this.f4333a.getContentResolver().unregisterContentObserver(this.b);
            this.b = null;
        }
    }

    public void a(D d, String str) {
        this.b = new E(this, new Handler(Looper.getMainLooper()), d);
        this.f4333a.getContentResolver().registerContentObserver(Settings.System.getUriFor(str), true, this.b);
    }
}
