package com.bytedance.adsdk.ugeno.EYQ;

import android.text.TextUtils;

/* compiled from: UGMethodParser.java */
/* loaded from: classes2.dex */
public class Pm {
    public static Object EYQ(com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ eyq) {
        mZx mzxEYQ;
        if (eyq == null || (mzxEYQ = EYQ(eyq.EYQ())) == null) {
            return null;
        }
        return mzxEYQ.mZx(eyq.mZx());
    }

    public static mZx EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        if (str.equals("find")) {
            return new EYQ();
        }
        return null;
    }
}
