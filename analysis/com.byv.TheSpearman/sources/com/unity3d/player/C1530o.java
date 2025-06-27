package com.unity3d.player;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1530o extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1534s f4404a;

    C1530o(C1534s c1534s) {
        this.f4404a = c1534s;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        C1534s.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        AbstractC1536u.Log(5, "Camera2: CameraDevice disconnected.");
        this.f4404a.a(cameraDevice);
        C1534s.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        AbstractC1536u.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.f4404a.a(cameraDevice);
        C1534s.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        this.f4404a.b = cameraDevice;
        C1534s.D.release();
    }
}
