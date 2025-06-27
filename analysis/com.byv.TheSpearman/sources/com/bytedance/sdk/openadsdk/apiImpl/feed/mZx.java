package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.KO;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.mZx.EYQ;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* compiled from: PAGFeedNativeVideoAdImpl.java */
/* loaded from: classes2.dex */
public class mZx extends QQ implements Td.Pm, Td.InterfaceC0065Td, EYQ.InterfaceC0135EYQ {
    private final com.bytedance.sdk.openadsdk.multipro.mZx.EYQ HX;
    private boolean MxO;
    private Td QQ;
    private long pi;
    private boolean tp;
    private AdSlot tsL;

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void f_() {
    }

    public mZx(Context context, UB ub, int i, AdSlot adSlot) {
        super(context, ub, i, true);
        this.tp = false;
        this.MxO = true;
        this.Kbd = i;
        this.tsL = adSlot;
        this.HX = new com.bytedance.sdk.openadsdk.multipro.mZx.EYQ();
        EYQ(this.IPb);
        EYQ("embeded_ad");
        this.Pm.EYQ(this);
    }

    public mZx(Context context, UB ub, int i, AdSlot adSlot, EYQ eyq, KO ko) {
        super(context, ub, i, false);
        this.tp = false;
        this.MxO = true;
        this.Pm = eyq;
        this.EYQ = ko;
        this.Kbd = i;
        this.tsL = adSlot;
        this.HX = new com.bytedance.sdk.openadsdk.multipro.mZx.EYQ();
        EYQ(this.IPb);
        EYQ("embeded_ad");
        eyq.EYQ(this);
    }

    public View Kbd() {
        NativeVideoTsView nativeVideoTsView;
        if (this.mZx != null && this.Td != null) {
            if (UB.Kbd(this.mZx)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.Td, this.mZx, this.EYQ.EYQ());
                    if (this.mZx != null && this.mZx.oIw()) {
                        com.bytedance.sdk.openadsdk.core.VwS.IPb iPbEYQ = nativeVideoTsView.EYQ((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        if (this.Pm != null) {
                            this.Pm.EYQ(iPbEYQ);
                        }
                    }
                    this.EYQ.EYQ(nativeVideoTsView.getNativeVideoController());
                    if (this.Pm != null) {
                        this.Pm.EYQ(nativeVideoTsView);
                    }
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.EYQ() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.mZx.1
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.EYQ
                        public void EYQ(View view, int i) {
                            if (mZx.this.EYQ != null) {
                                mZx.this.EYQ.EYQ(view, i);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.mZx() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.mZx.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.mZx
                        public void EYQ(boolean z, long j, long j2, long j3, boolean z2) {
                            mZx.this.HX.EYQ = z;
                            mZx.this.HX.Kbd = j;
                            mZx.this.HX.IPb = j2;
                            mZx.this.HX.VwS = j3;
                            mZx.this.HX.Pm = z2;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.Kbd) {
                        nativeVideoTsView.setIsAutoPlay(this.tp ? this.tsL.isAutoPlay() : this.MxO);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.MxO);
                    }
                    nativeVideoTsView.setIsQuiet(hu.Pm().Td(String.valueOf(this.IPb)));
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                }
                if (!UB.Kbd(this.mZx) && nativeVideoTsView != null && nativeVideoTsView.EYQ(0L, true, false)) {
                    return nativeVideoTsView;
                }
                ApmHelper.reportCustomError(this.mZx.by() + "," + nativeVideoTsView, "getAdView null", new RuntimeException());
            } else {
                nativeVideoTsView = null;
                if (!UB.Kbd(this.mZx)) {
                }
                ApmHelper.reportCustomError(this.mZx.by() + "," + nativeVideoTsView, "getAdView null", new RuntimeException());
            }
        }
        return null;
    }

    private void EYQ(int i) {
        int iMZx = hu.Pm().mZx(i);
        int iTd = com.bytedance.sdk.component.utils.hu.Td(hu.EYQ());
        if (3 == iMZx) {
            this.tp = false;
            this.MxO = false;
        } else {
            if (1 == iMZx && FH.Pm(iTd)) {
                this.tp = false;
            } else if (2 == iMZx) {
                if (FH.Kbd(iTd) || FH.Pm(iTd) || FH.IPb(iTd)) {
                    this.tp = false;
                }
            } else if (4 == iMZx) {
                this.tp = true;
            } else if (5 == iMZx && (FH.Pm(iTd) || FH.IPb(iTd))) {
            }
            this.MxO = true;
        }
        if (this.Pm != null) {
            this.Pm.EYQ(this.tp);
        }
    }

    public void EYQ(Td td) {
        this.QQ = td;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.Pm
    public void EYQ(int i, int i2) {
        Td td = this.QQ;
        if (td != null) {
            td.EYQ(i, i2);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void b_() {
        Td td = this.QQ;
        if (td != null) {
            td.EYQ(this);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void e_() {
        Td td = this.QQ;
        if (td != null) {
            td.mZx(this);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void EYQ(long j, long j2) {
        this.pi = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void g_() {
        Td td = this.QQ;
        if (td != null) {
            td.Td(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.mZx.EYQ.InterfaceC0135EYQ
    public com.bytedance.sdk.openadsdk.multipro.mZx.EYQ IPb() {
        return this.HX;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.QQ
    protected void EYQ(String str) {
        super.EYQ(str);
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.QQ, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        if (this.Pm != null) {
            this.Pm.tsL();
        }
    }
}
