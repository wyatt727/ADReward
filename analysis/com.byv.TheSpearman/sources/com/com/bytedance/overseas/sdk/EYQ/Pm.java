package com.com.bytedance.overseas.sdk.EYQ;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;

/* compiled from: TTDownloadFactory.java */
/* loaded from: classes2.dex */
public class Pm {
    public static Td EYQ(Context context, UB ub, String str) {
        if (FH.QQ(context)) {
            return new mZx(context, ub, str);
        }
        return new EYQ(context, ub, str);
    }
}
