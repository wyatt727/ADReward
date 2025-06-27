package com.bytedance.sdk.component.adexpress.dynamic.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.Td.VwS;

/* compiled from: DynamicInteractHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static int EYQ(VwS vwS) {
        if (vwS == null) {
            return 0;
        }
        String strMN = vwS.mN();
        String strTPj = vwS.tPj();
        if (TextUtils.isEmpty(strTPj) || TextUtils.isEmpty(strMN) || !strTPj.equals("creative")) {
            return 0;
        }
        if (strMN.equals("shake")) {
            return 2;
        }
        if (strMN.equals("twist")) {
            return 3;
        }
        return strMN.equals("slide") ? 1 : 0;
    }
}
