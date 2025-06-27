package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* compiled from: AdUtils.java */
/* loaded from: classes2.dex */
public class mZx {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.UB> EYQ;

    public static com.bytedance.sdk.openadsdk.core.model.UB EYQ() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.UB> softReference = EYQ;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub == null) {
            return;
        }
        EYQ = new SoftReference<>(ub);
    }
}
