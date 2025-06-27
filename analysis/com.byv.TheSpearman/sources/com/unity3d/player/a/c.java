package com.unity3d.player.a;

import android.os.Build;
import com.unity3d.player.IPermissionRequestCallbacks;

/* loaded from: classes4.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private IPermissionRequestCallbacks f4390a;
    private String b;
    private int c;
    private boolean d;

    c(d dVar, IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i, boolean z) {
        this.f4390a = iPermissionRequestCallbacks;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.c;
        if (i != -1) {
            if (i == 0) {
                this.f4390a.onPermissionGranted(this.b);
            }
        } else if (Build.VERSION.SDK_INT >= 30 || this.d) {
            this.f4390a.onPermissionDenied(this.b);
        } else {
            this.f4390a.onPermissionDeniedAndDontAskAgain(this.b);
        }
    }
}
