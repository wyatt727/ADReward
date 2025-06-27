package com.bytedance.adsdk.lottie.Td.Td;

import com.bytedance.adsdk.lottie.Td.EYQ.MxO;
import com.bytedance.adsdk.lottie.Td.EYQ.tp;
import com.bytedance.adsdk.lottie.Td.EYQ.tsL;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes2.dex */
public class Pm {
    private final List<com.bytedance.adsdk.lottie.Td.mZx.Td> EYQ;
    private final tsL HX;
    private final long IPb;
    private final float KO;
    private final EYQ Kbd;
    private final int MxO;
    private final com.bytedance.adsdk.lottie.Td.mZx.EYQ NZ;
    private final long Pm;
    private final List<com.bytedance.adsdk.lottie.Td.mZx.QQ> QQ;
    private final String Td;
    private final tp UB;
    private final MxO Uc;
    private final String VwS;
    private final mZx WU;
    private final boolean XN;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx hYh;
    private final float hu;
    private final com.bytedance.adsdk.lottie.IPb mZx;
    private final float nWX;
    private final float pi;
    private final com.bytedance.adsdk.lottie.Kbd.tp tPj;
    private final int tp;
    private final int tsL;
    private final List<com.bytedance.adsdk.lottie.VwS.EYQ<Float>> zF;

    /* compiled from: Layer.java */
    public enum EYQ {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    public enum mZx {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Pm(List<com.bytedance.adsdk.lottie.Td.mZx.Td> list, com.bytedance.adsdk.lottie.IPb iPb, String str, long j, EYQ eyq, long j2, String str2, List<com.bytedance.adsdk.lottie.Td.mZx.QQ> list2, tsL tsl, int i, int i2, int i3, float f, float f2, float f3, float f4, tp tpVar, MxO mxO, List<com.bytedance.adsdk.lottie.VwS.EYQ<Float>> list3, mZx mzx, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx2, boolean z, com.bytedance.adsdk.lottie.Td.mZx.EYQ eyq2, com.bytedance.adsdk.lottie.Kbd.tp tpVar2) {
        this.EYQ = list;
        this.mZx = iPb;
        this.Td = str;
        this.Pm = j;
        this.Kbd = eyq;
        this.IPb = j2;
        this.VwS = str2;
        this.QQ = list2;
        this.HX = tsl;
        this.tp = i;
        this.MxO = i2;
        this.tsL = i3;
        this.pi = f;
        this.nWX = f2;
        this.KO = f3;
        this.hu = f4;
        this.UB = tpVar;
        this.Uc = mxO;
        this.zF = list3;
        this.WU = mzx;
        this.hYh = mzx2;
        this.XN = z;
        this.NZ = eyq2;
        this.tPj = tpVar2;
    }

    com.bytedance.adsdk.lottie.IPb EYQ() {
        return this.mZx;
    }

    float mZx() {
        return this.pi;
    }

    float Td() {
        return this.nWX / this.mZx.pi();
    }

    List<com.bytedance.adsdk.lottie.VwS.EYQ<Float>> Pm() {
        return this.zF;
    }

    public long Kbd() {
        return this.Pm;
    }

    public String IPb() {
        return this.Td;
    }

    public String VwS() {
        return this.VwS;
    }

    float QQ() {
        return this.KO;
    }

    float HX() {
        return this.hu;
    }

    List<com.bytedance.adsdk.lottie.Td.mZx.QQ> tp() {
        return this.QQ;
    }

    public EYQ MxO() {
        return this.Kbd;
    }

    mZx tsL() {
        return this.WU;
    }

    long pi() {
        return this.IPb;
    }

    List<com.bytedance.adsdk.lottie.Td.mZx.Td> nWX() {
        return this.EYQ;
    }

    tsL KO() {
        return this.HX;
    }

    int hu() {
        return this.tsL;
    }

    int UB() {
        return this.MxO;
    }

    int Uc() {
        return this.tp;
    }

    tp hYh() {
        return this.UB;
    }

    MxO zF() {
        return this.Uc;
    }

    com.bytedance.adsdk.lottie.Td.EYQ.mZx WU() {
        return this.hYh;
    }

    public String toString() {
        return EYQ("");
    }

    public boolean XN() {
        return this.XN;
    }

    public com.bytedance.adsdk.lottie.Td.mZx.EYQ NZ() {
        return this.NZ;
    }

    public com.bytedance.adsdk.lottie.Kbd.tp tPj() {
        return this.tPj;
    }

    public String EYQ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(IPb());
        sb.append("\n");
        Pm pmEYQ = this.mZx.EYQ(pi());
        if (pmEYQ != null) {
            sb.append("\t\tParents: ");
            sb.append(pmEYQ.IPb());
            Pm pmEYQ2 = this.mZx.EYQ(pmEYQ.pi());
            while (pmEYQ2 != null) {
                sb.append("->");
                sb.append(pmEYQ2.IPb());
                pmEYQ2 = this.mZx.EYQ(pmEYQ2.pi());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!tp().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(tp().size());
            sb.append("\n");
        }
        if (Uc() != 0 && UB() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(Uc()), Integer.valueOf(UB()), Integer.valueOf(hu())));
        }
        if (!this.EYQ.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.bytedance.adsdk.lottie.Td.mZx.Td td : this.EYQ) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(td);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
