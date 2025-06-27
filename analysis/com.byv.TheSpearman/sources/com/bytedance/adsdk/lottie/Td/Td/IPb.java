package com.bytedance.adsdk.lottie.Td.Td;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.Kbd.tp;
import com.bytedance.adsdk.lottie.Td.mZx.hu;
import java.util.Collections;

/* compiled from: ShapeLayer.java */
/* loaded from: classes2.dex */
public class IPb extends EYQ {
    private final mZx QQ;
    private final com.bytedance.adsdk.lottie.EYQ.EYQ.Pm VwS;

    IPb(com.bytedance.adsdk.lottie.QQ qq, Pm pm, mZx mzx, com.bytedance.adsdk.lottie.IPb iPb) {
        super(qq, pm);
        this.QQ = mzx;
        com.bytedance.adsdk.lottie.EYQ.EYQ.Pm pm2 = new com.bytedance.adsdk.lottie.EYQ.EYQ.Pm(qq, this, new hu("__container", pm.nWX(), false), iPb);
        this.VwS = pm2;
        pm2.EYQ(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    void mZx(Canvas canvas, Matrix matrix, int i) {
        this.VwS.EYQ(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        super.EYQ(rectF, matrix, z);
        this.VwS.EYQ(rectF, this.EYQ, z);
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    public com.bytedance.adsdk.lottie.Td.mZx.EYQ IPb() {
        com.bytedance.adsdk.lottie.Td.mZx.EYQ eyqIPb = super.IPb();
        return eyqIPb != null ? eyqIPb : this.QQ.IPb();
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    public tp VwS() {
        tp tpVarVwS = super.VwS();
        return tpVarVwS != null ? tpVarVwS : this.QQ.VwS();
    }
}
