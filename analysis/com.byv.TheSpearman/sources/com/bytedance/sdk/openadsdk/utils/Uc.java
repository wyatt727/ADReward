package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.json.p2;

/* compiled from: PAGNetworkTools.java */
/* loaded from: classes2.dex */
public class Uc {
    public static String EYQ(Context context) {
        int iEYQ = com.bytedance.sdk.component.utils.NZ.EYQ(context, 0L);
        return iEYQ != 2 ? iEYQ != 3 ? iEYQ != 4 ? iEYQ != 5 ? iEYQ != 6 ? "mobile" : "5g" : "4g" : p2.b : p2.f2055a : "2g";
    }
}
