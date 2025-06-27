package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.adexpress.mZx.Pm;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.ugen.Td.mZx;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PAGAppOpenAdExpressView extends NativeExpressView {
    boolean EYQ;
    private Td.EYQ Pm;
    private com.bytedance.sdk.openadsdk.component.IPb.EYQ Td;
    private FrameLayout mZx;

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(int i, String str) {
    }

    public PAGAppOpenAdExpressView(Context context, UB ub, AdSlot adSlot, String str) {
        super(context, ub, adSlot, str, true);
        this.EYQ = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void IPb() {
        this.nWX = true;
        this.mZx = new FrameLayout(this.QQ);
        if (!com.bytedance.sdk.openadsdk.core.ugen.Td.EYQ(this.MxO)) {
            addView(this.mZx, new FrameLayout.LayoutParams(-1, -1));
        }
        super.IPb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public int getDynamicShowType() {
        if (this.xt == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.mZx.KO
    public void EYQ(Pm<? extends View> pm, nWX nwx) {
        this.xt = pm;
        if (nwx != null && nwx.Td()) {
            mZx(nwx);
        }
        super.EYQ(pm, nwx);
    }

    public void mZx(final nWX nwx) {
        if (nwx == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView.1
            @Override // java.lang.Runnable
            public void run() {
                PAGAppOpenAdExpressView.this.Td(nwx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(nWX nwx) {
        if (nwx == null) {
            return;
        }
        if (nwx.EYQ() != null) {
            if (this.EYQ) {
                nwx.EYQ().setTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.IPb, 1);
                ((FrameLayout) nwx.EYQ()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) nwx.EYQ();
                this.mZx = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.EYQ = false;
                return;
            }
            return;
        }
        double dIPb = nwx.IPb();
        double dVwS = nwx.VwS();
        double dQQ = nwx.QQ();
        double dHX = nwx.HX();
        int iMZx = tr.mZx(this.QQ, (float) dIPb);
        int iMZx2 = tr.mZx(this.QQ, (float) dVwS);
        int iMZx3 = tr.mZx(this.QQ, (float) dQQ);
        int iMZx4 = tr.mZx(this.QQ, (float) dHX);
        if ((dHX == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dQQ == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && this.xt.Td() != 7) {
            return;
        }
        if (this.xt.Td() == 7 && (nwx instanceof mZx)) {
            FrameLayout frameLayoutHu = ((mZx) nwx).hu();
            if (frameLayoutHu != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayoutHu.addView(this.mZx, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mZx.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iMZx3, iMZx4);
        }
        layoutParams2.width = iMZx3;
        layoutParams2.height = iMZx4;
        layoutParams2.topMargin = iMZx2;
        layoutParams2.leftMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        }
        this.mZx.setLayoutParams(layoutParams2);
    }

    public void setExpressVideoListenerProxy(Td.EYQ eyq) {
        this.Pm = eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ() {
        com.bytedance.sdk.openadsdk.component.IPb.EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void mZx() {
        super.mZx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(int i) {
        super.EYQ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void Kbd() {
        com.bytedance.sdk.openadsdk.component.IPb.EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.mZx(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.mZx.QQ
    public void EYQ(View view, int i, com.bytedance.sdk.component.adexpress.Td td) {
        if (i != -1 && td != null && i == 3) {
            Kbd();
        } else {
            super.EYQ(view, i, td);
        }
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.IPb.EYQ eyq) {
        this.Td = eyq;
    }

    public FrameLayout getVideoFrameLayout() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.VwS.EYQ.EYQ(this.MxO, hu.Pm().VwS(String.valueOf(this.MxO.yK())));
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void EYQ(pi.EYQ eyq) {
        eyq.Kbd(com.bytedance.sdk.openadsdk.component.VwS.EYQ.mZx());
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void EYQ(JSONObject jSONObject) throws JSONException {
        com.bytedance.sdk.openadsdk.component.VwS.EYQ.EYQ(jSONObject, this.MxO == null ? 0 : this.MxO.yK());
    }
}
