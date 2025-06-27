package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullTypeDoubleAds.java */
/* loaded from: classes2.dex */
public class Kbd extends mZx implements com.bytedance.sdk.openadsdk.HX.Kbd {
    private final Uc KO;
    private boolean hu;

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
    protected boolean Nvm() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void VwS() {
    }

    public Kbd(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
        this.KO = (Uc) eyq.EYQ;
    }

    public static void EYQ(UB ub, boolean z, String str) {
        HashMap map = new HashMap();
        map.put("is_backup", Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ("choose_ad_start_show", ub, str, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_id", ub.ZFP());
            jSONObject.put("is_backup", z);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ("choose_ad_start_show", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(RewardFullBaseLayout rewardFullBaseLayout) {
        if (Td.EYQ(this.KO)) {
            Td.EYQ(this.KO, rewardFullBaseLayout);
        } else {
            super.EYQ(rewardFullBaseLayout);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.EYQ
    public boolean mZx() {
        return this.hu;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void lEs() {
        wBa jsObject;
        if (this.EYQ.TZn.isFinishing()) {
            return;
        }
        if (this.EYQ.mN.QQ() || this.hu) {
            super.lEs();
            if (this.EYQ.mN.QQ()) {
                xt();
                this.EYQ.na.mZx();
                return;
            }
            return;
        }
        FullRewardExpressView fullRewardExpressViewEYQ = this.EYQ.mN.EYQ();
        if (fullRewardExpressViewEYQ == null || (jsObject = fullRewardExpressViewEYQ.getJsObject()) == null) {
            return;
        }
        jsObject.EYQ(this);
    }

    @Override // com.bytedance.sdk.openadsdk.HX.Kbd
    public void EYQ(int i, long j) {
        this.hu = true;
        int i2 = i - 1;
        this.KO.Pf(i2);
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.KO, this.EYQ.VwS, i, j);
        com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ(this.KO.wj(), i2);
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.Kbd.1
            @Override // java.lang.Runnable
            public void run() {
                Kbd.this.lEs();
                Kbd.this.xt();
                Kbd.this.EYQ.na.mZx();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.HX.Kbd
    public void EYQ(nWX nwx) {
        this.EYQ.mN.EYQ().mZx(nwx);
    }

    public void mZx(boolean z) {
        if (this.hu) {
            return;
        }
        HashMap map = new HashMap();
        map.put("has_focus", Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ("choose_ad_focus_changed", this.KO, this.EYQ.VwS, map);
    }
}
