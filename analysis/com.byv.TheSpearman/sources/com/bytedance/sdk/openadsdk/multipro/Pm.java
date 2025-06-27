package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.hu;

/* compiled from: TTPathConst.java */
/* loaded from: classes2.dex */
public class Pm {
    public static String EYQ = "com.bytedance.openadsdk";
    public static String mZx = "content://" + EYQ + ".TTMultiProvider";

    static {
        EYQ();
    }

    public static void EYQ() {
        if (hu.EYQ() != null) {
            EYQ = hu.EYQ().getPackageName();
            mZx = "content://" + EYQ + ".TTMultiProvider";
        }
    }
}
