package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.view.Surface;

/* loaded from: classes4.dex */
public class Camera2Wrapper implements com.unity3d.player.a.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f4331a;
    private C1534s b = null;

    public Camera2Wrapper(Context context) {
        this.f4331a = context;
        initCamera2Jni();
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public void a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    public void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    public void a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        nativeFrameReady(obj, obj2, obj3, i, i2, i3);
    }

    protected void closeCamera2() {
        C1534s c1534s = this.b;
        if (c1534s != null) {
            c1534s.a();
        }
        this.b = null;
    }

    protected int getCamera2Count() {
        return C1534s.a(this.f4331a);
    }

    protected int getCamera2FocalLengthEquivalent(int i) {
        return C1534s.a(this.f4331a, i);
    }

    protected int[] getCamera2Resolutions(int i) {
        return C1534s.b(this.f4331a, i);
    }

    protected int getCamera2SensorOrientation(int i) {
        return C1534s.c(this.f4331a, i);
    }

    protected Rect getFrameSizeCamera2() {
        C1534s c1534s = this.b;
        return c1534s != null ? c1534s.b() : new Rect();
    }

    protected boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C1534s c1534s = new C1534s(this);
        this.b = c1534s;
        return c1534s.a(this.f4331a, i, i2, i3, i4, i5, surface);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i) {
        return C1534s.d(this.f4331a, i);
    }

    protected boolean isCamera2FrontFacing(int i) {
        return C1534s.e(this.f4331a, i);
    }

    protected void pauseCamera2() {
        C1534s c1534s = this.b;
        if (c1534s != null) {
            c1534s.c();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        C1534s c1534s = this.b;
        if (c1534s != null) {
            return c1534s.a(f, f2);
        }
        return false;
    }

    protected void startCamera2() throws CameraAccessException {
        C1534s c1534s = this.b;
        if (c1534s != null) {
            c1534s.g();
        }
    }

    protected void stopCamera2() {
        C1534s c1534s = this.b;
        if (c1534s != null) {
            c1534s.h();
        }
    }
}
