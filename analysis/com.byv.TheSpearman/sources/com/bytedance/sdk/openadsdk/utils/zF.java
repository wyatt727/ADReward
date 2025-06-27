package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* compiled from: PropSwitchUtils.java */
/* loaded from: classes2.dex */
public class zF {
    public static boolean EYQ = EYQ();

    private static boolean EYQ() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.hu.EYQ() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.hu.EYQ().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
        }
        return true;
    }

    public static void EYQ(int i) {
        try {
            SharedPreferences.Editor editorEdit = com.bytedance.sdk.openadsdk.core.hu.EYQ().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            editorEdit.putInt("perf_con_use_prop", i);
            editorEdit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
        }
    }
}
