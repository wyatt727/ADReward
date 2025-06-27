package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class NativeExpressVideoView extends NativeExpressView implements Td.Pm, Td.InterfaceC0065Td, tsL {
    int EYQ;
    private com.bytedance.sdk.openadsdk.multipro.mZx.EYQ FH;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.Td FtN;
    boolean IPb;
    boolean Kbd;
    private ExpressVideoView Nvm;
    int Pm;
    boolean Td;
    private long Tnp;
    int VwS;
    boolean mZx;
    private long tr;

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void Kbd() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void mZx() {
    }

    public NativeExpressVideoView(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot, String str) {
        super(context, ub, adSlot, str, false);
        this.EYQ = 1;
        this.mZx = false;
        this.Td = true;
        this.Kbd = true;
        this.IPb = true;
        this.VwS = -1;
        VwS();
    }

    protected void VwS() {
        this.tsL = new FrameLayout(this.QQ);
        int iYK = this.MxO != null ? this.MxO.yK() : 0;
        this.Pm = iYK;
        Td(iYK);
        hu();
        addView(this.tsL, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    private void hu() {
        try {
            this.FH = new com.bytedance.sdk.openadsdk.multipro.mZx.EYQ();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.QQ, this.MxO, this.HX, this.wBa);
            this.Nvm = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.Nvm.setControllerStatusCallBack(new NativeVideoTsView.mZx() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.1
                @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.mZx
                public void EYQ(boolean z, long j, long j2, long j3, boolean z2) {
                    NativeExpressVideoView.this.FH.EYQ = z;
                    NativeExpressVideoView.this.FH.Kbd = j;
                    NativeExpressVideoView.this.FH.IPb = j2;
                    NativeExpressVideoView.this.FH.VwS = j3;
                    NativeExpressVideoView.this.FH.Pm = z2;
                }
            });
            this.Nvm.setVideoAdLoadListener(this);
            this.Nvm.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.HX)) {
                this.Nvm.setIsAutoPlay(this.mZx ? this.tp.isAutoPlay() : this.Td);
            } else if ("open_ad".equals(this.HX)) {
                this.Nvm.setIsAutoPlay(true);
            } else {
                this.Nvm.setIsAutoPlay(this.Td);
            }
            if ("open_ad".equals(this.HX)) {
                this.Nvm.setIsQuiet(true);
            } else {
                this.XN = com.bytedance.sdk.openadsdk.core.hu.Pm().Td(String.valueOf(this.Pm));
                this.Nvm.setIsQuiet(this.XN);
            }
            this.Nvm.Pm();
        } catch (Exception unused) {
            this.Nvm = null;
        }
    }

    void Td(int i) {
        int iMZx = com.bytedance.sdk.openadsdk.core.hu.Pm().mZx(i);
        if (3 == iMZx) {
            this.mZx = false;
            this.Td = false;
        } else if (4 == iMZx) {
            this.mZx = true;
        } else {
            int iTd = com.bytedance.sdk.component.utils.hu.Td(com.bytedance.sdk.openadsdk.core.hu.EYQ());
            if (1 == iMZx) {
                this.mZx = false;
                this.Td = FH.Pm(iTd);
            } else if (2 == iMZx) {
                if (FH.Kbd(iTd) || FH.Pm(iTd) || FH.IPb(iTd)) {
                    this.mZx = false;
                    this.Td = true;
                }
            } else if (5 == iMZx && (FH.Pm(iTd) || FH.IPb(iTd))) {
                this.mZx = false;
                this.Td = true;
            }
        }
        if (this.Td) {
            return;
        }
        this.EYQ = 3;
    }

    public com.bytedance.sdk.openadsdk.multipro.mZx.EYQ getVideoModel() {
        return this.FH;
    }

    private void setShowAdInteractionView(boolean z) {
        ExpressVideoView expressVideoView = this.Nvm;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.mZx.KO
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm, com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
        this.xt = pm;
        this.VwS = pm.Td();
        if ((this.xt instanceof UB) && ((UB) this.xt).hu() != null) {
            ((UB) this.xt).hu().EYQ((tsL) this);
        }
        if (nwx != null && nwx.Td()) {
            mZx(nwx);
        }
        super.EYQ(pm, nwx);
    }

    private void mZx(final com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
        if (nwx == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.2
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressVideoView.this.Td(nwx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
        double dIPb = nwx.IPb();
        double dVwS = nwx.VwS();
        double dQQ = nwx.QQ();
        double dHX = nwx.HX();
        if ((dQQ == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dHX == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && this.VwS != 7) {
            return;
        }
        int iMZx = tr.mZx(this.QQ, (float) dIPb);
        int iMZx2 = tr.mZx(this.QQ, (float) dVwS);
        int iMZx3 = tr.mZx(this.QQ, (float) dQQ);
        int iMZx4 = tr.mZx(this.QQ, (float) dHX);
        float fMin = Math.min(Math.min(tr.mZx(this.QQ, nwx.tsL()), tr.mZx(this.QQ, nwx.pi())), Math.min(tr.mZx(this.QQ, nwx.nWX()), tr.mZx(this.QQ, nwx.KO())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.tsL.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iMZx3, iMZx4);
        }
        layoutParams.width = iMZx3;
        layoutParams.height = iMZx4;
        layoutParams.topMargin = iMZx2;
        layoutParams.leftMargin = iMZx;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        this.tsL.setLayoutParams(layoutParams);
        this.tsL.removeAllViews();
        if (this.Nvm != null) {
            if (this.VwS == 7 && (nwx instanceof com.bytedance.sdk.openadsdk.core.ugen.Td.mZx)) {
                FrameLayout frameLayoutHu = ((com.bytedance.sdk.openadsdk.core.ugen.Td.mZx) nwx).hu();
                if (frameLayoutHu != null) {
                    frameLayoutHu.removeAllViews();
                    frameLayoutHu.addView(this.Nvm, new FrameLayout.LayoutParams(-1, -1));
                }
            } else if (nwx.EYQ() != null) {
                if (this.IPb) {
                    nwx.EYQ().setTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.IPb, 1);
                    ((FrameLayout) nwx.EYQ()).removeAllViews();
                    ((FrameLayout) nwx.EYQ()).addView(this.Nvm, new FrameLayout.LayoutParams(-1, -1));
                    this.IPb = false;
                }
            } else {
                this.tsL.addView(this.Nvm);
            }
            tr.mZx(this.tsL, fMin);
            this.Nvm.EYQ(0L, true, false);
            Td(this.Pm);
            if (!com.bytedance.sdk.component.utils.hu.Pm(this.QQ) && !this.Td && this.Kbd) {
                this.Nvm.Kbd();
            }
            if (TextUtils.equals("embeded_ad", this.HX)) {
                return;
            }
            setShowAdInteractionView(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(boolean z) {
        ExpressVideoView expressVideoView = this.Nvm;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(int i) {
        ExpressVideoView expressVideoView = this.Nvm;
        if (expressVideoView == null) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i == 1) {
            expressVideoView.EYQ(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            expressVideoView.setCanInterruptVideoPlay(true);
            this.Nvm.performClick();
        } else if (i == 4) {
            expressVideoView.getNativeVideoController().Pm();
        } else {
            if (i != 5) {
                return;
            }
            expressVideoView.EYQ(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.mZx.QQ
    public void EYQ(View view, int i, com.bytedance.sdk.component.adexpress.Td td) {
        if (i == -1 || td == null) {
            return;
        }
        if (i == 11) {
            try {
                ExpressVideoView expressVideoView = this.Nvm;
                if (expressVideoView != null) {
                    expressVideoView.setCanInterruptVideoPlay(true);
                    this.Nvm.performClick();
                    if (this.pi) {
                        this.Nvm.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Cia).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.EYQ(view, i, td);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public long Td() {
        return this.tr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public int Pm() {
        ExpressVideoView expressVideoView;
        if (this.EYQ == 3 && (expressVideoView = this.Nvm) != null) {
            expressVideoView.Pm();
        }
        ExpressVideoView expressVideoView2 = this.Nvm;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().hu()) {
            return this.EYQ;
        }
        return 1;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void b_() {
        this.Kbd = false;
        this.EYQ = 2;
        com.bytedance.sdk.openadsdk.apiImpl.feed.Td td = this.FtN;
        if (td != null) {
            td.EYQ(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void e_() {
        this.Kbd = false;
        this.pi = true;
        this.EYQ = 3;
        com.bytedance.sdk.openadsdk.apiImpl.feed.Td td = this.FtN;
        if (td != null) {
            td.mZx(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void f_() {
        this.Kbd = false;
        this.pi = false;
        this.EYQ = 2;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void EYQ(long j, long j2) {
        this.Kbd = false;
        int i = this.EYQ;
        if (i != 5 && i != 3 && j > this.tr) {
            this.EYQ = 2;
        }
        this.tr = j;
        this.Tnp = j2;
        if (this.lEs != null && this.lEs.mZx() != null) {
            this.lEs.mZx().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        if (this.xt instanceof com.bytedance.sdk.openadsdk.core.ugen.Td.Td) {
            ((com.bytedance.sdk.openadsdk.core.ugen.Td.Td) this.xt).setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        mZx(j, j2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void g_() {
        this.Kbd = false;
        this.EYQ = 5;
        if (this.lEs != null && this.lEs.mZx() != null) {
            this.lEs.mZx().a_();
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.Td td = this.FtN;
        if (td != null) {
            td.Td(null);
        }
        if (this.xt instanceof com.bytedance.sdk.openadsdk.core.ugen.Td.Td) {
            ((com.bytedance.sdk.openadsdk.core.ugen.Td.Td) this.xt).a_();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.Pm
    public void EYQ(int i, int i2) {
        this.tr = this.Tnp;
        this.EYQ = 4;
        com.bytedance.sdk.openadsdk.apiImpl.feed.Td td = this.FtN;
        if (td != null) {
            td.EYQ(i, i2);
        }
    }

    protected ExpressVideoView getExpressVideoView() {
        return this.Nvm;
    }

    public com.bykv.vk.openvk.component.video.api.Pm.Td getVideoController() {
        ExpressVideoView expressVideoView = this.Nvm;
        if (expressVideoView != null) {
            return expressVideoView.getNativeVideoController();
        }
        return null;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.apiImpl.feed.Td td) {
        this.FtN = td;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.feed.Td getVideoAdListener() {
        return this.FtN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
    public void EYQ(int i, String str) {
        this.Uc = i;
        this.hYh = str;
    }

    private void mZx(long j, long j2) {
        int iAbs = (int) Math.abs(this.Uc - j);
        if (this.Uc < 0 || iAbs > 500 || this.Uc > j2 || iAbs >= 500 || this.zF.contains(this.hYh)) {
            return;
        }
        if (this.Uc > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.3
                @Override // java.lang.Runnable
                public void run() {
                    NativeExpressVideoView.this.Nvm.setCanInterruptVideoPlay(true);
                    NativeExpressVideoView.this.Nvm.performClick();
                    NativeExpressVideoView nativeExpressVideoView = NativeExpressVideoView.this;
                    nativeExpressVideoView.mZx(nativeExpressVideoView.Uc, NativeExpressVideoView.this.hYh);
                }
            }, iAbs);
        } else {
            this.Nvm.setCanInterruptVideoPlay(true);
            this.Nvm.performClick();
            mZx(this.Uc, this.hYh);
        }
        this.zF.add(this.hYh);
    }
}
