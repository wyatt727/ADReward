package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* compiled from: AdPreference.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Td EYQ;

    private Td() {
    }

    public static Td EYQ(Context context) {
        if (EYQ == null) {
            synchronized (Td.class) {
                if (EYQ == null) {
                    EYQ = new Td();
                }
            }
        }
        return EYQ;
    }

    public void EYQ(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("ttopenadsdk", str, str2);
    }

    public String mZx(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("ttopenadsdk", str, str2);
    }

    public void EYQ(String str, int i) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("ttopenadsdk", str, Integer.valueOf(i));
    }

    public int mZx(String str, int i) {
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("ttopenadsdk", str, i);
    }

    public void EYQ(String str, long j) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("ttopenadsdk", str, Long.valueOf(j));
    }

    public Long mZx(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("ttopenadsdk", str, j));
    }
}
