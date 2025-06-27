package com.bytedance.adsdk.lottie.Td.mZx;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapeData.java */
/* loaded from: classes2.dex */
public class nWX {
    private final List<com.bytedance.adsdk.lottie.Td.EYQ> EYQ;
    private boolean Td;
    private PointF mZx;

    public nWX(PointF pointF, boolean z, List<com.bytedance.adsdk.lottie.Td.EYQ> list) {
        this.mZx = pointF;
        this.Td = z;
        this.EYQ = new ArrayList(list);
    }

    public nWX() {
        this.EYQ = new ArrayList();
    }

    public void EYQ(float f, float f2) {
        if (this.mZx == null) {
            this.mZx = new PointF();
        }
        this.mZx.set(f, f2);
    }

    public PointF EYQ() {
        return this.mZx;
    }

    public void EYQ(boolean z) {
        this.Td = z;
    }

    public boolean mZx() {
        return this.Td;
    }

    public List<com.bytedance.adsdk.lottie.Td.EYQ> Td() {
        return this.EYQ;
    }

    public void EYQ(nWX nwx, nWX nwx2, float f) {
        if (this.mZx == null) {
            this.mZx = new PointF();
        }
        this.Td = nwx.mZx() || nwx2.mZx();
        if (nwx.Td().size() != nwx2.Td().size()) {
            nwx.Td().size();
            nwx2.Td().size();
        }
        int iMin = Math.min(nwx.Td().size(), nwx2.Td().size());
        if (this.EYQ.size() < iMin) {
            for (int size = this.EYQ.size(); size < iMin; size++) {
                this.EYQ.add(new com.bytedance.adsdk.lottie.Td.EYQ());
            }
        } else if (this.EYQ.size() > iMin) {
            for (int size2 = this.EYQ.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.lottie.Td.EYQ> list = this.EYQ;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFEYQ = nwx.EYQ();
        PointF pointFEYQ2 = nwx2.EYQ();
        EYQ(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFEYQ.x, pointFEYQ2.x, f), com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFEYQ.y, pointFEYQ2.y, f));
        for (int size3 = this.EYQ.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.lottie.Td.EYQ eyq = nwx.Td().get(size3);
            com.bytedance.adsdk.lottie.Td.EYQ eyq2 = nwx2.Td().get(size3);
            PointF pointFEYQ3 = eyq.EYQ();
            PointF pointFMZx = eyq.mZx();
            PointF pointFTd = eyq.Td();
            PointF pointFEYQ4 = eyq2.EYQ();
            PointF pointFMZx2 = eyq2.mZx();
            PointF pointFTd2 = eyq2.Td();
            this.EYQ.get(size3).EYQ(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFEYQ3.x, pointFEYQ4.x, f), com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFEYQ3.y, pointFEYQ4.y, f));
            this.EYQ.get(size3).mZx(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFMZx.x, pointFMZx2.x, f), com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFMZx.y, pointFMZx2.y, f));
            this.EYQ.get(size3).Td(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFTd.x, pointFTd2.x, f), com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(pointFTd.y, pointFTd2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.EYQ.size() + "closed=" + this.Td + AbstractJsonLexerKt.END_OBJ;
    }
}
