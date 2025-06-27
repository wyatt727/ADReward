package com.bytedance.adsdk.lottie.Td.mZx;

import android.graphics.Paint;
import com.bytedance.adsdk.lottie.EYQ.EYQ.zF;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes2.dex */
public class Uc implements Td {
    private final String EYQ;
    private final float HX;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx IPb;
    private final com.bytedance.adsdk.lottie.Td.EYQ.Pm Kbd;
    private final com.bytedance.adsdk.lottie.Td.EYQ.EYQ Pm;
    private final mZx QQ;
    private final List<com.bytedance.adsdk.lottie.Td.EYQ.mZx> Td;
    private final EYQ VwS;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx mZx;
    private final boolean tp;

    /* compiled from: ShapeStroke.java */
    public enum EYQ {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap EYQ() {
            int i = AnonymousClass1.EYQ[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i == 2) {
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.SQUARE;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: com.bytedance.adsdk.lottie.Td.mZx.Uc$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;
        static final /* synthetic */ int[] mZx;

        static {
            int[] iArr = new int[mZx.values().length];
            mZx = iArr;
            try {
                iArr[mZx.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                mZx[mZx.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                mZx[mZx.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EYQ.values().length];
            EYQ = iArr2;
            try {
                iArr2[EYQ.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EYQ[EYQ.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EYQ[EYQ.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum mZx {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join EYQ() {
            int i = AnonymousClass1.mZx[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public Uc(String str, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx, List<com.bytedance.adsdk.lottie.Td.EYQ.mZx> list, com.bytedance.adsdk.lottie.Td.EYQ.EYQ eyq, com.bytedance.adsdk.lottie.Td.EYQ.Pm pm, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx2, EYQ eyq2, mZx mzx3, float f, boolean z) {
        this.EYQ = str;
        this.mZx = mzx;
        this.Td = list;
        this.Pm = eyq;
        this.Kbd = pm;
        this.IPb = mzx2;
        this.VwS = eyq2;
        this.QQ = mzx3;
        this.HX = f;
        this.tp = z;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        return new zF(qq, eyq, this);
    }

    public String EYQ() {
        return this.EYQ;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.EYQ mZx() {
        return this.Pm;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.Pm Td() {
        return this.Kbd;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.mZx Pm() {
        return this.IPb;
    }

    public List<com.bytedance.adsdk.lottie.Td.EYQ.mZx> Kbd() {
        return this.Td;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.mZx IPb() {
        return this.mZx;
    }

    public EYQ VwS() {
        return this.VwS;
    }

    public mZx QQ() {
        return this.QQ;
    }

    public float HX() {
        return this.HX;
    }

    public boolean tp() {
        return this.tp;
    }
}
