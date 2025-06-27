package com.bytedance.adsdk.lottie.Td.Td;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.Td.Td.Pm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes2.dex */
public class mZx extends EYQ {
    private final RectF HX;
    private final Paint MxO;
    private final List<EYQ> QQ;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> VwS;
    private final RectF tp;
    private boolean tsL;

    public mZx(com.bytedance.adsdk.lottie.QQ qq, Pm pm, List<Pm> list, com.bytedance.adsdk.lottie.IPb iPb) {
        int i;
        EYQ eyq;
        Pm.mZx mzxTsL;
        int i2;
        super(qq, pm);
        this.QQ = new ArrayList();
        this.HX = new RectF();
        this.tp = new RectF();
        this.MxO = new Paint();
        this.tsL = true;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxWU = pm.WU();
        if (mzxWU != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = mzxWU.EYQ();
            this.VwS = EYQ;
            EYQ(EYQ);
            this.VwS.EYQ(this);
        } else {
            this.VwS = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(iPb.HX().size());
        int size = list.size() - 1;
        EYQ eyq2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Pm pm2 = list.get(size);
            EYQ EYQ2 = EYQ.EYQ(this, pm2, qq, iPb);
            if (EYQ2 != null) {
                longSparseArray.put(EYQ2.mZx().Kbd(), EYQ2);
                if (eyq2 != null) {
                    eyq2.EYQ(EYQ2);
                    eyq2 = null;
                } else {
                    this.QQ.add(0, EYQ2);
                    if (pm2 != null && (mzxTsL = pm2.tsL()) != null && ((i2 = AnonymousClass1.EYQ[mzxTsL.ordinal()]) == 1 || i2 == 2)) {
                        eyq2 = EYQ2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            EYQ eyq3 = (EYQ) longSparseArray.get(longSparseArray.keyAt(i));
            if (eyq3 != null && (eyq = (EYQ) longSparseArray.get(eyq3.mZx().pi())) != null) {
                eyq3.mZx(eyq);
            }
        }
    }

    /* compiled from: CompositionLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.Td.Td.mZx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[Pm.mZx.values().length];
            EYQ = iArr;
            try {
                iArr[Pm.mZx.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[Pm.mZx.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void mZx(boolean z) {
        this.tsL = z;
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    public void EYQ(boolean z) {
        super.EYQ(z);
        Iterator<EYQ> it = this.QQ.iterator();
        while (it.hasNext()) {
            it.next().EYQ(z);
        }
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    void mZx(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("CompositionLayer#draw");
        this.tp.set(0.0f, 0.0f, this.Td.QQ(), this.Td.HX());
        matrix.mapRect(this.tp);
        boolean z = this.mZx.VwS() && this.QQ.size() > 1 && i != 255;
        if (z) {
            this.MxO.setAlpha(i);
            com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.tp, this.MxO);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            if (((!this.tsL && "__container".equals(this.Td.IPb())) || this.tp.isEmpty()) ? true : canvas.clipRect(this.tp)) {
                this.QQ.get(size).EYQ(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.lottie.Kbd.mZx("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        super.EYQ(rectF, matrix, z);
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            this.HX.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.QQ.get(size).EYQ(this.HX, this.EYQ, true);
            rectF.union(this.HX);
        }
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    public void EYQ(float f) {
        super.EYQ(f);
        if (this.VwS != null) {
            f = ((this.VwS.VwS().floatValue() * this.Td.EYQ().QQ()) - this.Td.EYQ().IPb()) / (this.mZx.XN().pi() + 0.01f);
        }
        if (this.VwS == null) {
            f -= this.Td.Td();
        }
        if (this.Td.mZx() != 0.0f && !"__container".equals(this.Td.IPb())) {
            f /= this.Td.mZx();
        }
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            this.QQ.get(size).EYQ(f);
        }
    }
}
