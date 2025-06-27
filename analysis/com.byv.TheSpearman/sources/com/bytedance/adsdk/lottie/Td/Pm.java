package com.bytedance.adsdk.lottie.Td;

import com.bytedance.adsdk.lottie.Td.mZx.hu;
import java.util.List;

/* compiled from: FontCharacter.java */
/* loaded from: classes2.dex */
public class Pm {
    private final List<hu> EYQ;
    private final String IPb;
    private final String Kbd;
    private final double Pm;
    private final double Td;
    private final char mZx;

    public static int EYQ(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public Pm(List<hu> list, char c, double d, double d2, String str, String str2) {
        this.EYQ = list;
        this.mZx = c;
        this.Td = d;
        this.Pm = d2;
        this.Kbd = str;
        this.IPb = str2;
    }

    public List<hu> EYQ() {
        return this.EYQ;
    }

    public double mZx() {
        return this.Pm;
    }

    public int hashCode() {
        return EYQ(this.mZx, this.IPb, this.Kbd);
    }
}
