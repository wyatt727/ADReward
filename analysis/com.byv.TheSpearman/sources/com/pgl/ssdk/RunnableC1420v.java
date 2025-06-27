package com.pgl.ssdk;

import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;

/* renamed from: com.pgl.ssdk.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC1420v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4323a;
    final /* synthetic */ int b;

    RunnableC1420v(Context context, int i) {
        this.f4323a = context;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        InputManager inputManagerA = C1421w.a(this.f4323a);
        if (inputManagerA == null) {
            return;
        }
        InputDevice inputDevice = inputManagerA.getInputDevice(this.b);
        C1421w.g();
        if (inputDevice == null) {
            C1421w.a();
            C1421w.b();
            str = "nihc";
        } else {
            if (!inputDevice.isVirtual()) {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                C1421w.e();
                C1421w.f();
                C1421w.a("eihc");
                return;
            }
            C1421w.c();
            C1421w.d();
            str = "vihc";
        }
        C1421w.a(str);
    }
}
