package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.PointF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes2.dex */
public class UB implements hYh, EYQ.InterfaceC0072EYQ {
    private final com.bytedance.adsdk.lottie.QQ EYQ;
    private com.bytedance.adsdk.lottie.Td.mZx.nWX Pm;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> Td;
    private final String mZx;

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
    }

    public UB(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.pi piVar) {
        this.EYQ = qq;
        this.mZx = piVar.EYQ();
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = piVar.mZx().EYQ();
        this.Td = EYQ;
        eyq.EYQ(EYQ);
        EYQ.EYQ(this);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.EYQ.invalidateSelf();
    }

    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> mZx() {
        return this.Td;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.hYh
    public com.bytedance.adsdk.lottie.Td.mZx.nWX EYQ(com.bytedance.adsdk.lottie.Td.mZx.nWX nwx) {
        List<com.bytedance.adsdk.lottie.Td.EYQ> list;
        boolean z;
        List<com.bytedance.adsdk.lottie.Td.EYQ> listTd = nwx.Td();
        if (listTd.size() <= 2) {
            return nwx;
        }
        float fFloatValue = this.Td.VwS().floatValue();
        if (fFloatValue == 0.0f) {
            return nwx;
        }
        com.bytedance.adsdk.lottie.Td.mZx.nWX nwxMZx = mZx(nwx);
        nwxMZx.EYQ(nwx.EYQ().x, nwx.EYQ().y);
        List<com.bytedance.adsdk.lottie.Td.EYQ> listTd2 = nwxMZx.Td();
        boolean zMZx = nwx.mZx();
        int i = 0;
        int i2 = 0;
        while (i < listTd.size()) {
            com.bytedance.adsdk.lottie.Td.EYQ eyq = listTd.get(i);
            com.bytedance.adsdk.lottie.Td.EYQ eyq2 = listTd.get(EYQ(i - 1, listTd.size()));
            com.bytedance.adsdk.lottie.Td.EYQ eyq3 = listTd.get(EYQ(i - 2, listTd.size()));
            PointF pointFTd = (i != 0 || zMZx) ? eyq2.Td() : nwx.EYQ();
            PointF pointFMZx = (i != 0 || zMZx) ? eyq2.mZx() : pointFTd;
            PointF pointFEYQ = eyq.EYQ();
            PointF pointFTd2 = eyq3.Td();
            PointF pointFTd3 = eyq.Td();
            boolean z2 = !nwx.mZx() && i == 0 && i == listTd.size() + (-1);
            if (pointFMZx.equals(pointFTd) && pointFEYQ.equals(pointFTd) && !z2) {
                float f = pointFTd.x - pointFTd2.x;
                float f2 = pointFTd.y - pointFTd2.y;
                float f3 = pointFTd3.x - pointFTd.x;
                float f4 = pointFTd3.y - pointFTd.y;
                list = listTd;
                z = zMZx;
                float fHypot = (float) Math.hypot(f, f2);
                float fHypot2 = (float) Math.hypot(f3, f4);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f5 = pointFTd.x + ((pointFTd2.x - pointFTd.x) * fMin);
                float f6 = pointFTd.y + ((pointFTd2.y - pointFTd.y) * fMin);
                float f7 = pointFTd.x + ((pointFTd3.x - pointFTd.x) * fMin2);
                float f8 = pointFTd.y + ((pointFTd3.y - pointFTd.y) * fMin2);
                float f9 = f5 - ((f5 - pointFTd.x) * 0.5519f);
                float f10 = f6 - ((f6 - pointFTd.y) * 0.5519f);
                float f11 = f7 - ((f7 - pointFTd.x) * 0.5519f);
                float f12 = f8 - ((f8 - pointFTd.y) * 0.5519f);
                com.bytedance.adsdk.lottie.Td.EYQ eyq4 = listTd2.get(EYQ(i2 - 1, listTd2.size()));
                com.bytedance.adsdk.lottie.Td.EYQ eyq5 = listTd2.get(i2);
                eyq4.mZx(f5, f6);
                eyq4.Td(f5, f6);
                if (i == 0) {
                    nwxMZx.EYQ(f5, f6);
                }
                eyq5.EYQ(f9, f10);
                i2++;
                com.bytedance.adsdk.lottie.Td.EYQ eyq6 = listTd2.get(i2);
                eyq5.mZx(f11, f12);
                eyq5.Td(f7, f8);
                eyq6.EYQ(f7, f8);
            } else {
                list = listTd;
                z = zMZx;
                com.bytedance.adsdk.lottie.Td.EYQ eyq7 = listTd2.get(EYQ(i2 - 1, listTd2.size()));
                com.bytedance.adsdk.lottie.Td.EYQ eyq8 = listTd2.get(i2);
                eyq7.mZx(eyq2.mZx().x, eyq2.mZx().y);
                eyq7.Td(eyq2.Td().x, eyq2.Td().y);
                eyq8.EYQ(eyq.EYQ().x, eyq.EYQ().y);
            }
            i2++;
            i++;
            listTd = list;
            zMZx = z;
        }
        return nwxMZx;
    }

    private com.bytedance.adsdk.lottie.Td.mZx.nWX mZx(com.bytedance.adsdk.lottie.Td.mZx.nWX nwx) {
        List<com.bytedance.adsdk.lottie.Td.EYQ> listTd = nwx.Td();
        boolean zMZx = nwx.mZx();
        int size = listTd.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.lottie.Td.EYQ eyq = listTd.get(size);
            com.bytedance.adsdk.lottie.Td.EYQ eyq2 = listTd.get(EYQ(size - 1, listTd.size()));
            PointF pointFTd = (size != 0 || zMZx) ? eyq2.Td() : nwx.EYQ();
            i = (((size != 0 || zMZx) ? eyq2.mZx() : pointFTd).equals(pointFTd) && eyq.EYQ().equals(pointFTd) && !(!nwx.mZx() && size == 0 && size == listTd.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.lottie.Td.mZx.nWX nwx2 = this.Pm;
        if (nwx2 == null || nwx2.Td().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.lottie.Td.EYQ());
            }
            this.Pm = new com.bytedance.adsdk.lottie.Td.mZx.nWX(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.Pm.EYQ(zMZx);
        return this.Pm;
    }

    private static int EYQ(int i, int i2) {
        return i - (mZx(i, i2) * i2);
    }

    private static int mZx(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
