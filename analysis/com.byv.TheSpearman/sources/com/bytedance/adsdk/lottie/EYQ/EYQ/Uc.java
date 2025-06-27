package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;

/* compiled from: ShapeContent.java */
/* loaded from: classes2.dex */
public class Uc implements pi, EYQ.InterfaceC0072EYQ {
    private boolean IPb;
    private final com.bytedance.adsdk.lottie.EYQ.mZx.pi Kbd;
    private final com.bytedance.adsdk.lottie.QQ Pm;
    private final boolean Td;
    private final String mZx;
    private final Path EYQ = new Path();
    private final mZx VwS = new mZx();

    public Uc(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.UB ub) {
        this.mZx = ub.EYQ();
        this.Td = ub.Td();
        this.Pm = qq;
        com.bytedance.adsdk.lottie.EYQ.mZx.pi piVarEYQ = ub.mZx().EYQ();
        this.Kbd = piVarEYQ;
        eyq.EYQ(piVarEYQ);
        piVarEYQ.EYQ(this);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        mZx();
    }

    private void mZx() {
        this.IPb = false;
        this.Pm.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> r6, java.util.List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.bytedance.adsdk.lottie.EYQ.EYQ.Td r1 = (com.bytedance.adsdk.lottie.EYQ.EYQ.Td) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.WU
            if (r2 == 0) goto L26
            r2 = r1
            com.bytedance.adsdk.lottie.EYQ.EYQ.WU r2 = (com.bytedance.adsdk.lottie.EYQ.EYQ.WU) r2
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r3 = r2.mZx()
            com.bytedance.adsdk.lottie.Td.mZx.hYh$EYQ r4 = com.bytedance.adsdk.lottie.Td.mZx.hYh.EYQ.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            com.bytedance.adsdk.lottie.EYQ.EYQ.mZx r1 = r5.VwS
            r1.EYQ(r2)
            r2.EYQ(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.EYQ.EYQ.hYh
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.bytedance.adsdk.lottie.EYQ.EYQ.hYh r1 = (com.bytedance.adsdk.lottie.EYQ.EYQ.hYh) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.bytedance.adsdk.lottie.EYQ.mZx.pi r6 = r5.Kbd
            r6.EYQ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.EYQ.EYQ.Uc.EYQ(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        if (this.IPb) {
            return this.EYQ;
        }
        this.EYQ.reset();
        if (this.Td) {
            this.IPb = true;
            return this.EYQ;
        }
        Path pathVwS = this.Kbd.VwS();
        if (pathVwS == null) {
            return this.EYQ;
        }
        this.EYQ.set(pathVwS);
        this.EYQ.setFillType(Path.FillType.EVEN_ODD);
        this.VwS.EYQ(this.EYQ);
        this.IPb = true;
        return this.EYQ;
    }
}
