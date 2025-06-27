package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: TTAppInfoUtils.java */
/* loaded from: classes2.dex */
public class XN {
    private static volatile String EYQ;

    public static String EYQ() {
        if (!TextUtils.isEmpty(EYQ)) {
            return EYQ;
        }
        String str = Build.MODEL;
        EYQ = str;
        return str;
    }
}
