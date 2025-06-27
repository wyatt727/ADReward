package com.bytedance.adsdk.lottie.EYQ.EYQ;

import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import com.bytedance.adsdk.lottie.Td.mZx.hYh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes2.dex */
public class WU implements Td, EYQ.InterfaceC0072EYQ {
    private final String EYQ;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> IPb;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> Kbd;
    private final hYh.EYQ Pm;
    private final List<EYQ.InterfaceC0072EYQ> Td = new ArrayList();
    private final com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> VwS;
    private final boolean mZx;

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
    }

    public WU(com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.hYh hyh) {
        this.EYQ = hyh.EYQ();
        this.mZx = hyh.IPb();
        this.Pm = hyh.mZx();
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ = hyh.Pm().EYQ();
        this.Kbd = EYQ;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ2 = hyh.Td().EYQ();
        this.IPb = EYQ2;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ3 = hyh.Kbd().EYQ();
        this.VwS = EYQ3;
        eyq.EYQ(EYQ);
        eyq.EYQ(EYQ2);
        eyq.EYQ(EYQ3);
        EYQ.EYQ(this);
        EYQ2.EYQ(this);
        EYQ3.EYQ(this);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        for (int i = 0; i < this.Td.size(); i++) {
            this.Td.get(i).EYQ();
        }
    }

    void EYQ(EYQ.InterfaceC0072EYQ interfaceC0072EYQ) {
        this.Td.add(interfaceC0072EYQ);
    }

    hYh.EYQ mZx() {
        return this.Pm;
    }

    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> Td() {
        return this.Kbd;
    }

    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> Pm() {
        return this.IPb;
    }

    public com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Float> Kbd() {
        return this.VwS;
    }

    public boolean IPb() {
        return this.mZx;
    }
}
