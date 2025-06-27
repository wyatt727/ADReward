package com.bytedance.sdk.component.adexpress.Pm;

import android.text.TextUtils;

/* compiled from: GlobalAdTypeUtils.java */
/* loaded from: classes2.dex */
public class Td {
    public static boolean EYQ(String str) {
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
