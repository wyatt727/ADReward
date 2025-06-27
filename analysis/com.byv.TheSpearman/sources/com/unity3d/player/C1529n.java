package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1529n extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1534s f4403a;

    C1529n(C1534s c1534s) {
        this.f4403a = c1534s;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC1536u.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        StringBuilder sb;
        C1534s c1534s = this.f4403a;
        if (c1534s.b == null) {
            return;
        }
        synchronized (c1534s.s) {
            C1534s c1534s2 = this.f4403a;
            c1534s2.r = cameraCaptureSession;
            try {
                c1534s2.q = c1534s2.b.createCaptureRequest(1);
                C1534s c1534s3 = this.f4403a;
                c1534s3.q.addTarget(c1534s3.v);
                C1534s c1534s4 = this.f4403a;
                c1534s4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c1534s4.n);
                this.f4403a.f();
            } catch (CameraAccessException e) {
                sb = new StringBuilder();
                sb.append("Camera2: CameraAccessException ");
                sb.append(e);
                AbstractC1536u.Log(6, sb.toString());
            } catch (IllegalStateException e2) {
                sb = new StringBuilder();
                sb.append("Camera2: IllegalStateException ");
                sb.append(e2);
                AbstractC1536u.Log(6, sb.toString());
            }
        }
    }
}
