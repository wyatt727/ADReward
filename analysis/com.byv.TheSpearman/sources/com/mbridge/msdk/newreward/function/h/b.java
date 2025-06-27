package com.mbridge.msdk.newreward.function.h;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;

/* compiled from: MetricsUtil.java */
/* loaded from: classes4.dex */
public final class b {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return SameMD5.getMD5(ai.d());
        }
        try {
            String[] strArrSplit = str.split("_");
            String str2 = (strArrSplit == null || strArrSplit.length < 3) ? "" : strArrSplit[2];
            return TextUtils.isEmpty(str2) ? SameMD5.getMD5(ai.d()) : str2;
        } catch (Exception unused) {
            return SameMD5.getMD5(ai.d());
        }
    }
}
