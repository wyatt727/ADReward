package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: HandlerUtils.java */
/* loaded from: classes2.dex */
public class QQ {
    private static volatile Handler EYQ;

    public static Handler EYQ() {
        return com.bytedance.sdk.component.VwS.EYQ.EYQ.EYQ().mZx();
    }

    public static Handler mZx() {
        if (EYQ == null) {
            synchronized (QQ.class) {
                if (EYQ == null) {
                    EYQ = new Handler(Looper.getMainLooper());
                }
            }
        }
        return EYQ;
    }
}
