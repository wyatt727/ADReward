package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes2.dex */
public class VwS implements Kbd, MxO, EYQ.InterfaceC0072EYQ {
    float EYQ;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> HX;
    private final boolean IPb;
    private final String Kbd;
    private final com.bytedance.adsdk.lottie.QQ MxO;
    private final com.bytedance.adsdk.lottie.Td.Td.EYQ Pm;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> QQ;
    private final Paint Td;
    private final List<pi> VwS;
    private final Path mZx;
    private com.bytedance.adsdk.lottie.EYQ.mZx.Td pi;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> tp;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> tsL;

    public VwS(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.KO ko) {
        Path path = new Path();
        this.mZx = path;
        this.Td = new com.bytedance.adsdk.lottie.EYQ.EYQ(1);
        this.VwS = new ArrayList();
        this.Pm = eyq;
        this.Kbd = ko.EYQ();
        this.IPb = ko.Kbd();
        this.MxO = qq;
        if (eyq.IPb() != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = eyq.IPb().EYQ().EYQ();
            this.tsL = EYQ;
            EYQ.EYQ(this);
            eyq.EYQ(this.tsL);
        }
        if (eyq.VwS() != null) {
            this.pi = new com.bytedance.adsdk.lottie.EYQ.mZx.Td(this, eyq, eyq.VwS());
        }
        if (ko.mZx() == null || ko.Td() == null) {
            this.QQ = null;
            this.HX = null;
            return;
        }
        path.setFillType(ko.Pm());
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> EYQ2 = ko.mZx().EYQ();
        this.QQ = EYQ2;
        EYQ2.EYQ(this);
        eyq.EYQ(EYQ2);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> EYQ3 = ko.Td().EYQ();
        this.HX = EYQ3;
        EYQ3.EYQ(this);
        eyq.EYQ(EYQ3);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.MxO.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Td td = list2.get(i);
            if (td instanceof pi) {
                this.VwS.add((pi) td);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        if (this.IPb) {
            return;
        }
        com.bytedance.adsdk.lottie.Kbd.EYQ("FillContent#draw");
        this.Td.setColor((com.bytedance.adsdk.lottie.IPb.Kbd.EYQ((int) ((((i / 255.0f) * this.HX.VwS().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.lottie.EYQ.mZx.mZx) this.QQ).HX() & ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<ColorFilter, ColorFilter> eyq = this.tp;
        if (eyq != null) {
            this.Td.setColorFilter(eyq.VwS());
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> eyq2 = this.tsL;
        if (eyq2 != null) {
            float fFloatValue = eyq2.VwS().floatValue();
            if (fFloatValue == 0.0f) {
                this.Td.setMaskFilter(null);
            } else if (fFloatValue != this.EYQ) {
                this.Td.setMaskFilter(this.Pm.mZx(fFloatValue));
            }
            this.EYQ = fFloatValue;
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.Td td = this.pi;
        if (td != null) {
            td.EYQ(this.Td);
        }
        this.mZx.reset();
        for (int i2 = 0; i2 < this.VwS.size(); i2++) {
            this.mZx.addPath(this.VwS.get(i2).Pm(), matrix);
        }
        canvas.drawPath(this.mZx, this.Td);
        com.bytedance.adsdk.lottie.Kbd.mZx("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        this.mZx.reset();
        for (int i = 0; i < this.VwS.size(); i++) {
            this.mZx.addPath(this.VwS.get(i).Pm(), matrix);
        }
        this.mZx.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
