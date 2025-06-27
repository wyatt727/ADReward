package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;

/* compiled from: SlotUtils.java */
/* loaded from: classes2.dex */
public class NZ {
    public static boolean EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        int iKvC;
        return (ub == null || (iKvC = ub.KvC()) == 8 || iKvC == 7 || ub.PI() == null || Build.VERSION.SDK_INT > 27) ? false : true;
    }
}
