package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.IPb;
import com.bytedance.sdk.openadsdk.core.nativeexpress.VwS;
import com.bytedance.sdk.openadsdk.core.nativeexpress.tsL;
import com.bytedance.sdk.openadsdk.utils.tr;
import org.json.JSONObject;

/* compiled from: RewardFullExpressVideoLayout.java */
/* loaded from: classes2.dex */
public class Td {
    com.com.bytedance.overseas.sdk.EYQ.Td EYQ;
    private FullRewardExpressView HX;
    private final Activity IPb;
    private boolean MxO;
    private final String QQ;
    private final UB VwS;
    Handler mZx;
    private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ tp;
    boolean Td = false;
    boolean Pm = false;
    boolean Kbd = false;

    public Td(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.tp = eyq;
        this.IPb = eyq.TZn;
        this.VwS = eyq.EYQ;
        this.QQ = eyq.VwS;
    }

    public void EYQ(AdSlot adSlot) {
        if (this.Kbd) {
            return;
        }
        this.Kbd = true;
        this.HX = new FullRewardExpressView(this.tp, adSlot, this.QQ);
    }

    public FullRewardExpressView EYQ() {
        return this.HX;
    }

    public FrameLayout mZx() {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.HX.pi()) {
            tsL();
        }
        return videoFrameLayout;
    }

    public boolean Td() {
        return this.Td;
    }

    public void EYQ(boolean z) {
        this.Td = z;
    }

    public boolean Pm() {
        return this.Pm;
    }

    public void mZx(boolean z) {
        this.Pm = z;
    }

    public void EYQ(VwS vwS, IPb iPb) {
        UB ub;
        if (this.HX == null || (ub = this.VwS) == null) {
            return;
        }
        this.EYQ = EYQ(ub);
        vwS.EYQ(this.HX);
        vwS.EYQ(this.EYQ);
        this.HX.setClickListener(vwS);
        iPb.EYQ((View) this.HX);
        iPb.EYQ(this.EYQ);
        this.HX.setClickCreativeListener(iPb);
    }

    private com.com.bytedance.overseas.sdk.EYQ.Td EYQ(UB ub) {
        if (ub.Pf() == 4) {
            return com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this.IPb, ub, this.QQ);
        }
        return null;
    }

    public void EYQ(tsL tsl) {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressVideoListenerProxy(tsl);
    }

    public void EYQ(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public Handler Kbd() {
        if (this.mZx == null) {
            this.mZx = new Handler(Looper.getMainLooper());
        }
        return this.mZx;
    }

    public void IPb() {
        if (this.MxO) {
            return;
        }
        this.MxO = true;
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.MxO();
        }
        Handler handler = this.mZx;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void VwS() {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.tp();
        }
    }

    public boolean QQ() {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.pi();
    }

    public int HX() {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    public JSONObject EYQ(JSONObject jSONObject) {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.EYQ(jSONObject, this.tp.EYQ);
        }
        return null;
    }

    public void tp() {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.QQ();
    }

    public void MxO() {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.HX();
        this.HX.tp();
    }

    public void tsL() {
        if (UB.Kbd(this.VwS) && this.VwS.rfB() == 3 && this.VwS.lEs() == 0) {
            try {
                if (this.VwS.TZE() == 1) {
                    int iMZx = tr.mZx(hu.EYQ(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.HX.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iMZx;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void EYQ(int i, boolean z) {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.EYQ(i, z);
        }
    }

    public void EYQ(int i, String str) {
        FullRewardExpressView fullRewardExpressView = this.HX;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mZx(i, str);
        }
    }
}
