package com.bytedance.sdk.component.adexpress.Pm;

import android.text.TextUtils;

/* compiled from: RitScreenUtils.java */
/* loaded from: classes2.dex */
public class Kbd {
    public static boolean EYQ(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean mZx(String str) {
        return com.bytedance.sdk.component.adexpress.Pm.mZx() && EYQ(str);
    }
}
