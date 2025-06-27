package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.pi;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.tp;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: BaseRewardFullAdType.java */
/* loaded from: classes2.dex */
public class EYQ {
    protected com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ EYQ;
    protected com.bytedance.sdk.openadsdk.core.video.Td.mZx HX;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.Kbd IPb;
    protected final pi Kbd;
    protected int Pm;
    protected final tp QQ;
    protected int Td;
    protected final nWX VwS;
    protected UB mZx;
    protected wBa tp;

    public EYQ(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.EYQ = eyq;
        this.mZx = eyq.EYQ;
        this.Td = eyq.tsL;
        this.Pm = eyq.pi;
        this.Kbd = eyq.FtN;
        this.IPb = eyq.TQF;
        this.VwS = eyq.wJ;
        this.QQ = eyq.KR;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx, wBa wba) {
        this.HX = mzx;
        this.tp = wba;
    }

    public boolean EYQ() {
        return this.EYQ.EYQ.oIw() || this.EYQ.EYQ.by() == 15 || this.EYQ.EYQ.by() == 5 || this.EYQ.EYQ.by() == 50;
    }

    public void EYQ(boolean z) {
        if (this.EYQ.WU.get()) {
            return;
        }
        UB ub = this.mZx;
        if (ub != null && ub.HG()) {
            this.QQ.Td(false);
            this.QQ.EYQ(true);
            this.EYQ.TQF.Td(8);
            this.EYQ.TQF.Pm(8);
            return;
        }
        if (!z) {
            this.QQ.Td(false);
            this.QQ.EYQ(false);
            this.QQ.Pm(false);
            this.EYQ.TQF.IPb(8);
        } else {
            this.QQ.EYQ(this.EYQ.EYQ.BQ());
            if (zF.MxO(this.EYQ.EYQ) || EYQ()) {
                this.QQ.Td(true);
            }
            if (EYQ() || ((this instanceof VwS) && this.EYQ.TZn.hu())) {
                this.QQ.Pm(true);
            } else {
                this.QQ.IPb();
                this.EYQ.TQF.IPb(0);
            }
        }
        if (!z) {
            this.EYQ.TQF.Td(4);
            this.EYQ.TQF.Pm(8);
        } else if (this.EYQ.MxO != FullRewardExpressView.EYQ || !EYQ()) {
            this.EYQ.TQF.Td(8);
            this.EYQ.TQF.Pm(8);
        } else {
            this.EYQ.TQF.Td(0);
            this.EYQ.TQF.Pm(0);
        }
    }

    public boolean mZx() {
        if (!KO.mZx(this.EYQ.EYQ) || !this.EYQ.FH.get()) {
            return (this.EYQ.WU.get() || this.EYQ.XN.get() || zF.MxO(this.EYQ.EYQ)) ? false : true;
        }
        FrameLayout frameLayoutIPb = this.EYQ.TQF.IPb();
        frameLayoutIPb.setVisibility(4);
        frameLayoutIPb.setVisibility(0);
        return false;
    }

    protected void Td() {
        if (zF.mZx(this.EYQ.EYQ) && DeviceUtils.VwS() == 0) {
            this.EYQ.Pm = true;
        }
        this.EYQ.KR.mZx(this.EYQ.Pm);
    }
}
