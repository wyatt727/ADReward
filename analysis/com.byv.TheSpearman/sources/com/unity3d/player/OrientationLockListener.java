package com.unity3d.player;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes4.dex */
public class OrientationLockListener implements D {

    /* renamed from: a, reason: collision with root package name */
    private F f4347a;
    private Context b;

    OrientationLockListener(Context context) {
        this.b = context;
        this.f4347a = new F(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        this.f4347a.a(this, "accelerometer_rotation");
    }

    public void a() {
        this.f4347a.a();
        this.f4347a = null;
    }

    public void a(boolean z) {
        nativeUpdateOrientationLockState(Settings.System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
    }

    public final native void nativeUpdateOrientationLockState(int i);
}
