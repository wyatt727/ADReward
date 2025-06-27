package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import org.json.JSONException;

/* compiled from: RewardFullTypePlayable.java */
/* loaded from: classes2.dex */
public class HX extends mZx {
    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean IPb() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean Kbd() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void VwS() {
    }

    public HX(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
    }

    public static boolean EYQ(UB ub) {
        return zF.mZx(ub) || zF.MxO(ub);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void Uc() {
        if (zF.Td(this.mZx) && this.EYQ.wJ.kf() && !this.EYQ.wJ.Pf()) {
            hYh();
        }
        if (zF.mZx(this.EYQ.EYQ)) {
            if (DeviceUtils.VwS() == 0) {
                this.EYQ.Pm = true;
            }
            if (this.EYQ.Pm) {
                this.EYQ.KR.mZx(true);
                this.EYQ.XPd.EYQ(true);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void zF() throws JSONException {
        if (this.EYQ.kf.tp() && zF.MxO(this.EYQ.EYQ)) {
            this.EYQ.kf.EYQ("return_foreground");
            if ((this.pi == null || !this.pi.isShowing()) && this.EYQ.kf.tsL() >= 0) {
                this.EYQ.kf.EYQ(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void WU() throws JSONException {
        super.WU();
        if (zF.MxO(this.EYQ.EYQ)) {
            this.tp.removeMessages(600);
            this.EYQ.kf.EYQ("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void XN() throws JSONException {
        super.XN();
        if (zF.MxO(this.EYQ.EYQ)) {
            this.tp.removeMessages(600);
            this.EYQ.kf.EYQ("go_background");
        }
    }
}
