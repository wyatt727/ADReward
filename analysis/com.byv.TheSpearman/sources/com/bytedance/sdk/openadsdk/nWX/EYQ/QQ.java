package com.bytedance.sdk.openadsdk.nWX.EYQ;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: PAGVideoMrcTracker.java */
/* loaded from: classes2.dex */
public class QQ extends mZx {
    private int Pm;

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    public int IPb() {
        return 200;
    }

    public QQ(Integer num, View view, UB ub, int i) {
        super(num, view, ub, 2000, i);
        this.Pm = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    protected boolean Td() {
        return IPb.EYQ(this.EYQ.get(), this.mZx.Yd()) && this.Pm == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    protected void Pm() {
        super.Pm();
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    public void EYQ() {
        if (this.Pm != 1) {
            return;
        }
        super.EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    protected void mZx(int i) {
        if (HX()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.Pm = 0;
            QQ();
        }
        if (i == 3 || i == 2) {
            this.Pm = 2;
            QQ();
        }
        if (this.Pm == 1 || i != 0) {
            return;
        }
        this.Pm = 1;
        EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    public boolean tsL() {
        int i = this.Pm;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.Td.set(false);
        }
        return !z || super.tsL();
    }
}
