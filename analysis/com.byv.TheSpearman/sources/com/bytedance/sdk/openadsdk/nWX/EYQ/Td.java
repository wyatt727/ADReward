package com.bytedance.sdk.openadsdk.nWX.EYQ;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: PAGDisplayMrcTracker.java */
/* loaded from: classes2.dex */
public class Td extends mZx {
    private int Pm;

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    public int IPb() {
        return 100;
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    protected void mZx(int i) {
    }

    public Td(Integer num, View view, UB ub, int i) {
        super(num, view, ub, 1000, i);
        this.Pm = -1;
        mZx(view);
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    protected boolean Td() {
        if (this.EYQ == null || this.EYQ.get() == null) {
            return false;
        }
        View view = this.EYQ.get();
        if (this.Pm == -1) {
            mZx(view);
        }
        return IPb.EYQ(view, this.Pm == 1, this.mZx.Yd());
    }

    private void mZx(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.Pm = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.nWX.EYQ.mZx
    protected void Pm() {
        super.Pm();
    }
}
