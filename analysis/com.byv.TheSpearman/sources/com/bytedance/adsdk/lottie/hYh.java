package com.bytedance.adsdk.lottie;

import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes2.dex */
public class hYh {
    private final Map<String, String> EYQ;
    private boolean mZx;

    public String EYQ(String str) {
        return str;
    }

    public String EYQ(String str, String str2) {
        return EYQ(str2);
    }

    public final String mZx(String str, String str2) {
        if (this.mZx && this.EYQ.containsKey(str2)) {
            return this.EYQ.get(str2);
        }
        String strEYQ = EYQ(str, str2);
        if (this.mZx) {
            this.EYQ.put(str2, strEYQ);
        }
        return strEYQ;
    }
}
