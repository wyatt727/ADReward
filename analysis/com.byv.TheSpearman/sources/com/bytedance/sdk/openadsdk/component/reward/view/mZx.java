package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.KO;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.pi;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: RewardFullBackUpEndCard.java */
/* loaded from: classes2.dex */
public class mZx {
    private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ EYQ;
    private KO Pm;
    private boolean Td;
    private RFEndCardBackUpLayout mZx;

    public mZx(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.EYQ = eyq;
    }

    public void EYQ() {
        if (this.Td) {
            return;
        }
        this.Td = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.EYQ.OtA.findViewById(tp.eVP);
        this.mZx = rFEndCardBackUpLayout;
        rFEndCardBackUpLayout.EYQ(this.EYQ);
        if (this.EYQ.EYQ.oIw()) {
            this.Pm = new KO(this.EYQ);
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.Kbd kbd) {
        tr.EYQ(this.mZx, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mZx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        KO ko = this.Pm;
        if (ko != null) {
            ko.EYQ(kbd);
        }
    }

    public void mZx() {
        tr.EYQ((View) this.mZx, 0);
    }

    public boolean EYQ(pi piVar) {
        KO ko = this.Pm;
        if (ko == null || !ko.EYQ(piVar)) {
            return false;
        }
        tr.EYQ((View) this.mZx, 0);
        return true;
    }

    public void Td() {
        KO ko = this.Pm;
        if (ko != null) {
            ko.EYQ();
        }
    }

    public void Pm() {
        KO ko = this.Pm;
        if (ko != null) {
            ko.mZx();
        }
    }

    public boolean Kbd() {
        KO ko = this.Pm;
        if (ko != null) {
            return ko.Td();
        }
        return false;
    }
}
