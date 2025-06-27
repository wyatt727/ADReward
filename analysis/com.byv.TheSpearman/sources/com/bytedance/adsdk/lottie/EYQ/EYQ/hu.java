package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes2.dex */
public class hu implements Kbd, MxO, pi, tp, EYQ.InterfaceC0072EYQ {
    private final com.bytedance.adsdk.lottie.EYQ.mZx.hu HX;
    private final boolean IPb;
    private final String Kbd;
    private final com.bytedance.adsdk.lottie.Td.Td.EYQ Pm;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> QQ;
    private final com.bytedance.adsdk.lottie.QQ Td;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> VwS;
    private Pm tp;
    private final Matrix EYQ = new Matrix();
    private final Path mZx = new Path();

    public hu(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.tsL tsl) {
        this.Td = qq;
        this.Pm = eyq;
        this.Kbd = tsl.EYQ();
        this.IPb = tsl.Kbd();
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = tsl.mZx().EYQ();
        this.VwS = EYQ;
        eyq.EYQ(EYQ);
        EYQ.EYQ(this);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ2 = tsl.Td().EYQ();
        this.QQ = EYQ2;
        eyq.EYQ(EYQ2);
        EYQ2.EYQ(this);
        com.bytedance.adsdk.lottie.EYQ.mZx.hu huVarTp = tsl.Pm().tp();
        this.HX = huVarTp;
        huVarTp.EYQ(eyq);
        huVarTp.EYQ(this);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.tp
    public void EYQ(ListIterator<Td> listIterator) {
        if (this.tp != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.tp = new Pm(this.Td, this.Pm, "Repeater", this.IPb, arrayList, null);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        this.tp.EYQ(list, list2);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        Path pathPm = this.tp.Pm();
        this.mZx.reset();
        float fFloatValue = this.VwS.VwS().floatValue();
        float fFloatValue2 = this.QQ.VwS().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.EYQ.set(this.HX.mZx(i + fFloatValue2));
            this.mZx.addPath(pathPm, this.EYQ);
        }
        return this.mZx;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.VwS.VwS().floatValue();
        float fFloatValue2 = this.QQ.VwS().floatValue();
        float fFloatValue3 = this.HX.mZx().VwS().floatValue() / 100.0f;
        float fFloatValue4 = this.HX.Td().VwS().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.EYQ.set(matrix);
            float f = i2;
            this.EYQ.preConcat(this.HX.mZx(f + fFloatValue2));
            this.tp.EYQ(canvas, this.EYQ, (int) (i * com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        this.tp.EYQ(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.Td.invalidateSelf();
    }
}
