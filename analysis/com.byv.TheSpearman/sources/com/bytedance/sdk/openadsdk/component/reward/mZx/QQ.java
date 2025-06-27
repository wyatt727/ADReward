package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.mZx.mZx;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: RewardFullTypeInteraction.java */
/* loaded from: classes2.dex */
public class QQ extends mZx {
    private FullInteractionStyleView KO;

    public QQ(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.EYQ.TZn, this.MxO);
        this.KO = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.tsL);
        this.KO.EYQ(this.mZx, this.EYQ.MxO, this.EYQ.tp, this.Td, this.Pm);
        frameLayout.addView(this.KO.getInteractionStyleRootView());
    }

    public static boolean EYQ(UB ub) {
        return (ub.QN() || ub.CsQ() == 100.0f) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public mZx.EYQ Pm() {
        return new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.QQ.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx.EYQ
            public void EYQ(boolean z) {
                if (QQ.this.KO != null) {
                    QQ.this.KO.setIsMute(z);
                }
            }
        };
    }

    public FrameLayout FH() {
        FullInteractionStyleView fullInteractionStyleView = this.KO;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean Kbd() {
        return tr();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean IPb() {
        return tr();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void VwS() {
        this.IPb.Pm(8);
        this.IPb.Td(8);
        if (this.mZx.zF() == 2) {
            this.QQ.EYQ(false);
            this.QQ.Td(false);
            this.QQ.Pm(false);
            this.IPb.IPb(8);
            return;
        }
        this.QQ.EYQ(this.mZx.BQ());
        this.QQ.Td(tr());
        this.QQ.Pm(tr());
        if (tr()) {
            this.IPb.IPb(8);
        } else {
            this.QQ.IPb();
            this.IPb.IPb(0);
        }
    }

    private boolean tr() {
        return UB.Kbd(this.mZx);
    }
}
