package com.bytedance.adsdk.lottie.Td;

/* compiled from: Marker.java */
/* loaded from: classes2.dex */
public class IPb {
    public final float EYQ;
    private final String Td;
    public final float mZx;

    public IPb(String str, float f, float f2) {
        this.Td = str;
        this.mZx = f2;
        this.EYQ = f;
    }

    public boolean EYQ(String str) {
        if (this.Td.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.Td.endsWith("\r")) {
            String str2 = this.Td;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
