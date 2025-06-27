package com.bytedance.sdk.openadsdk.core.model;

/* compiled from: AutoJumpConstants.java */
/* loaded from: classes2.dex */
public class Kbd {
    public static int EYQ(int i) {
        if (i <= 0) {
            return 0;
        }
        return i >= 11 ? (i - 11) + 1 : i;
    }
}
