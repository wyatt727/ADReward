package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.tsL;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class FullRewardExpressView extends NativeExpressView {
    public static float EYQ = 100.0f;
    FullRewardExpressBackupView Td;
    tsL mZx;

    public FullRewardExpressView(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq, AdSlot adSlot, String str) {
        super(eyq.TZn, eyq.EYQ, adSlot, str, eyq.Pm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void IPb() {
        this.nWX = true;
        this.tsL = new FrameLayout(this.QQ);
        if (!com.bytedance.sdk.openadsdk.core.ugen.Td.EYQ(this.MxO)) {
            addView(this.tsL, new FrameLayout.LayoutParams(-1, -1));
        }
        super.IPb();
        SSWebView webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        VwS();
    }

    private void VwS() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.mZx.Td() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.1
            @Override // com.bytedance.sdk.component.adexpress.mZx.Td
            public boolean EYQ(ViewGroup viewGroup, int i) {
                try {
                    ((NativeExpressView) viewGroup).tsL();
                    FullRewardExpressView.this.Td = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView.this.Td.EYQ(FullRewardExpressView.this.MxO, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.mZx.KO
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm, nWX nwx) {
        this.xt = pm;
        if (this.MxO != null && this.MxO.HG()) {
            super.EYQ(pm, nwx);
            return;
        }
        if (pm instanceof UB) {
            UB ub = (UB) pm;
            if (ub.hu() != null) {
                ub.hu().EYQ((tsL) this);
            }
        }
        if (nwx != null && nwx.Td()) {
            mZx(nwx);
        }
        super.EYQ(pm, nwx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected boolean EYQ(nWX nwx) {
        if ((this.MxO instanceof Uc) && ((Uc) this.MxO).oFG() && nwx.Td() && nwx.mZx() == 1) {
            return false;
        }
        return super.EYQ(nwx);
    }

    public void setExpressVideoListenerProxy(tsL tsl) {
        this.mZx = tsl;
    }

    public void mZx(final nWX nwx) {
        if (nwx == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                FullRewardExpressView.this.Td(nwx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(nWX nwx) {
        if (nwx == null) {
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
        if (this.xt.Td() == 7 && (nwx instanceof com.bytedance.sdk.openadsdk.core.ugen.Td.mZx)) {
            FrameLayout frameLayoutHu = ((com.bytedance.sdk.openadsdk.core.ugen.Td.mZx) nwx).hu();
            if (frameLayoutHu != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayoutHu.addView(this.tsL, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.tsL.getLayoutParams();
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
        this.tsL.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(boolean z) {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.EYQ(z);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ() {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.EYQ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void mZx() {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.mZx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(int i) {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.EYQ(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public long Td() {
        tsL tsl = this.mZx;
        if (tsl != null) {
            return tsl.Td();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public int Pm() {
        tsL tsl = this.mZx;
        if (tsl != null) {
            return tsl.Pm();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void Kbd() {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.Kbd();
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

    public FrameLayout getVideoFrameLayout() {
        if (pi()) {
            return this.Td.getVideoContainer();
        }
        return this.tsL;
    }

    public View getBackupContainerBackgroundView() {
        if (pi()) {
            return this.Td.getBackupContainerBackgroundView();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void mZx(int i) {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.mZx(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(int i, String str) {
        tsL tsl = this.mZx;
        if (tsl != null) {
            tsl.EYQ(i, str);
        }
    }
}
