package com.pgl.ssdk;

import android.hardware.display.DisplayManager;

/* renamed from: com.pgl.ssdk.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1424z implements DisplayManager.DisplayListener {
    C1424z() {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
        A.a(i, 1);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        A.a(i, 3);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
        A.a(i, 2);
    }
}
