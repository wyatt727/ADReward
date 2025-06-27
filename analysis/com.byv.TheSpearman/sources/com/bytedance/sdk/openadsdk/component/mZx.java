package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.view.OpenScreenAdBackupView;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.mZx.mZx;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.json.t2;
import org.json.JSONObject;

/* compiled from: AppOpenAdExpressManager.java */
/* loaded from: classes2.dex */
public class mZx extends Td {
    private boolean MxO;
    private PAGAppOpenAdExpressView tp;

    public mZx(Activity activity, UB ub, FrameLayout frameLayout, EYQ eyq, int i, boolean z, com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq2) {
        super(activity, ub, frameLayout, eyq, i, z, eyq2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public void EYQ(ViewGroup viewGroup) {
        UB.EYQ eyqPI;
        Pair<Float, Float> pairEYQ = com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ.EYQ.EYQ(this.EYQ.getWindow(), this.VwS);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.mZx.yK())).setExpressViewAcceptedSize(((Float) pairEYQ.first).floatValue(), ((Float) pairEYQ.second).floatValue()).build();
        if (pi.Pm() && (eyqPI = this.mZx.PI()) != null) {
            eyqPI.Kbd();
        }
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = new PAGAppOpenAdExpressView(this.EYQ, this.mZx, adSlotBuild, "open_ad");
        this.tp = pAGAppOpenAdExpressView;
        pAGAppOpenAdExpressView.setTopListener(this.Kbd);
        this.tp.setExpressVideoListenerProxy(this.Kbd);
        this.tp.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.mZx.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                mZx.this.Kbd.Pm();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (mZx.this.tp.pi()) {
                    mZx.this.MxO = true;
                    mZx mzx = mZx.this;
                    mZx.super.EYQ((ViewGroup) mzx.Pm);
                    mZx.super.EYQ();
                    mZx.super.mZx();
                    return;
                }
                if (mZx.this.mZx.BEC()) {
                    mZx.this.Kbd.Td();
                    return;
                }
                if (mZx.this.Td) {
                    mZx mzx2 = mZx.this;
                    if (mzx2.EYQ(mzx2.tp.getVideoFrameLayout())) {
                        mZx.this.Kbd.Td();
                        return;
                    } else {
                        mZx.this.Kbd.Pm();
                        return;
                    }
                }
                mZx.this.Kbd.Td();
            }
        });
        this.mZx.QQ(1);
        this.Pm.addView(this.tp, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public void EYQ() {
        this.tp.setClickListener(com.bytedance.sdk.openadsdk.component.EYQ.mZx.EYQ(this.mZx, this.EYQ, this.HX, this.tp));
        com.bytedance.sdk.openadsdk.core.nativeexpress.IPb iPbMZx = com.bytedance.sdk.openadsdk.component.EYQ.mZx.mZx(this.mZx, this.EYQ, this.HX, this.tp);
        this.tp.setClickCreativeListener(iPbMZx);
        iPbMZx.EYQ(new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.mZx.2
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx.EYQ
            public void EYQ(View view, int i) {
                mZx.this.Kbd.Kbd();
            }
        });
        this.tp.setBackupListener(new com.bytedance.sdk.component.adexpress.mZx.Td() { // from class: com.bytedance.sdk.openadsdk.component.mZx.3
            @Override // com.bytedance.sdk.component.adexpress.mZx.Td
            public boolean EYQ(ViewGroup viewGroup, int i) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i);
                sb.append(t2.i.e);
                try {
                    ((NativeExpressView) viewGroup).tsL();
                    new OpenScreenAdBackupView(mZx.this.EYQ).EYQ((NativeExpressView) mZx.this.tp);
                    return true;
                } catch (Exception e) {
                    Log.e("AppOpenAdExpressManager", "", e);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public void mZx() {
        this.tp.HX();
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public void EYQ(int i, int i2, boolean z) {
        if (this.MxO) {
            super.EYQ(i, i2, z);
        } else {
            this.tp.EYQ(String.valueOf(i), i2, 0, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public void Td() {
        super.Td();
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = this.tp;
        if (pAGAppOpenAdExpressView != null) {
            pAGAppOpenAdExpressView.MxO();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public int Pm() {
        return this.tp.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.Td
    public JSONObject EYQ(JSONObject jSONObject) {
        return this.tp.EYQ(jSONObject, this.mZx);
    }
}
