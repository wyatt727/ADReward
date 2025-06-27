package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;

/* renamed from: com.pgl.ssdk.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC1418t implements Runnable {
    RunnableC1418t() {
    }

    @Override // java.lang.Runnable
    public void run() {
        Context contextB = C1423y.b();
        int numberOfCameras = C1419u.b;
        if (numberOfCameras == -1) {
            if (Build.VERSION.SDK_INT >= 21) {
                CameraManager cameraManager = (CameraManager) contextB.getSystemService("camera");
                if (cameraManager != null) {
                    try {
                        C1419u.b = cameraManager.getCameraIdList().length;
                    } catch (Throwable unused) {
                        C1419u.b = -1;
                    }
                } else {
                    C1419u.b = -2;
                }
                numberOfCameras = C1419u.b;
            } else {
                numberOfCameras = Camera.getNumberOfCameras();
                C1419u.b = numberOfCameras;
            }
        }
        C1419u.b = numberOfCameras;
        SharedPreferences sharedPreferencesA = T.a(C1423y.b());
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt("camera_count", C1419u.b).apply();
        }
    }
}
