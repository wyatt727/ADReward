package com.unity3d.player;

import android.util.Log;

/* renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1536u {

    /* renamed from: a, reason: collision with root package name */
    protected static boolean f4409a = false;

    protected static void Log(int i, String str) {
        if (f4409a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }
}
