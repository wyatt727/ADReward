package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: StrokeContent.java */
/* loaded from: classes2.dex */
public class zF extends EYQ {
    private final boolean IPb;
    private final String Kbd;
    private final com.bytedance.adsdk.lottie.Td.Td.EYQ Pm;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> QQ;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> VwS;

    public zF(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.Uc uc) {
        super(qq, eyq, uc.VwS().EYQ(), uc.QQ().EYQ(), uc.HX(), uc.Td(), uc.Pm(), uc.Kbd(), uc.IPb());
        this.Pm = eyq;
        this.Kbd = uc.EYQ();
        this.IPb = uc.tp();
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> EYQ = uc.mZx().EYQ();
        this.VwS = EYQ;
        EYQ.EYQ(this);
        eyq.EYQ(EYQ);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        if (this.IPb) {
            return;
        }
        this.mZx.setColor(((com.bytedance.adsdk.lottie.EYQ.mZx.mZx) this.VwS).HX());
        if (this.QQ != null) {
            this.mZx.setColorFilter(this.QQ.VwS());
        }
        super.EYQ(canvas, matrix, i);
    }
}
