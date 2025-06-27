package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class VastBannerBackupView extends BackupView implements Td.Pm, Td.InterfaceC0065Td {
    public boolean EYQ;
    private NativeVideoTsView KO;
    private String UB;
    private long Uc;
    private PAGBannerAdWrapperListener hYh;
    private ShadowImageView hu;
    private com.com.bytedance.overseas.sdk.EYQ.Td nWX;
    private NativeExpressView pi;

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void b_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void e_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void f_() {
    }

    public VastBannerBackupView(Context context) {
        super(context);
        this.EYQ = true;
        this.mZx = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void EYQ(View view, int i, pi piVar) {
        NativeExpressView nativeExpressView = this.pi;
        if (nativeExpressView != null) {
            nativeExpressView.EYQ(view, i, piVar);
            NativeVideoTsView nativeVideoTsView = this.KO;
            if (nativeVideoTsView == null || !(nativeVideoTsView.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.Td)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.nativevideo.Td) this.KO.getNativeVideoController()).FtN();
        }
    }

    public void setClosedListenerKey(String str) {
        this.UB = str;
    }

    public void EYQ(UB ub, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.EYQ.Td td) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.Td = ub;
        this.pi = nativeExpressView;
        this.nWX = td;
        this.IPb = "banner_ad";
        this.pi.addView(this, new ViewGroup.LayoutParams(-2, -2));
        Kbd();
    }

    private void Kbd() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.pi piVarEYQ = BannerExpressBackupView.EYQ(this.pi.getExpectExpressWidth(), this.pi.getExpectExpressHeight());
        if (this.pi.getExpectExpressWidth() > 0 && this.pi.getExpectExpressHeight() > 0) {
            this.VwS = tr.mZx(this.mZx, this.pi.getExpectExpressWidth());
            this.QQ = tr.mZx(this.mZx, this.pi.getExpectExpressHeight());
        } else {
            this.VwS = tr.Td(this.mZx);
            this.QQ = Float.valueOf(this.VwS / piVarEYQ.mZx).intValue();
        }
        if (this.VwS > 0 && this.VwS > tr.Td(this.mZx)) {
            this.VwS = tr.Td(this.mZx);
            this.QQ = Float.valueOf(this.QQ * (tr.Td(this.mZx) / this.VwS)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.VwS, this.QQ);
        }
        layoutParams.width = this.VwS;
        layoutParams.height = this.QQ;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        IPb();
    }

    private void IPb() {
        if (this.Td != null) {
            int iBy = this.Td.by();
            EYQ eyqVwS = VwS();
            if (eyqVwS == null || eyqVwS.EYQ == null) {
                return;
            }
            addView(eyqVwS.EYQ);
            ShadowImageView shadowImageView = eyqVwS.Pm;
            PAGLogoView pAGLogoView = eyqVwS.Kbd;
            PAGImageView pAGImageView = eyqVwS.IPb;
            if (pAGImageView != null && this.Td.VwS()) {
                tr.EYQ((View) pAGImageView, 0);
                com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ((int) tr.EYQ(hu.EYQ(), 11.0f, true), pAGImageView, this.Td);
            }
            this.hu = eyqVwS.Td;
            NativeVideoTsView videoView = getVideoView();
            if (videoView instanceof NativeVideoTsView) {
                this.KO = videoView;
                videoView.setVideoAdLoadListener(this);
                this.KO.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(shadowImageView, FriendlyObstructionPurpose.CLOSE_AD));
                arrayList.add(new Pair(pAGLogoView, FriendlyObstructionPurpose.OTHER));
                arrayList.add(new Pair(pAGImageView, FriendlyObstructionPurpose.OTHER));
                arrayList.add(new Pair(this.hu, FriendlyObstructionPurpose.VIDEO_CONTROLS));
                this.KO.EYQ(arrayList);
                this.KO.setAdCreativeClickListener(new NativeVideoTsView.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.1
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.EYQ
                    public void EYQ(View view, int i) {
                        if (VastBannerBackupView.this.hYh != null) {
                            VastBannerBackupView.this.hYh.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TTWebsiteActivity.EYQ(VastBannerBackupView.this.mZx, VastBannerBackupView.this.Td, VastBannerBackupView.this.IPb);
                    }
                });
            }
            if (shadowImageView != null) {
                shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        VastBannerBackupView.this.EYQ();
                    }
                });
                NativeExpressView nativeExpressView = this.pi;
                if (nativeExpressView != null) {
                    if (nativeExpressView.getClickListener() != null) {
                        this.pi.getClickListener().mZx(shadowImageView);
                    }
                    if (this.pi.getClickCreativeListener() != null) {
                        this.pi.getClickCreativeListener().mZx(shadowImageView);
                    }
                }
            }
            ShadowImageView shadowImageView2 = this.hu;
            if (shadowImageView2 != null) {
                shadowImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (VastBannerBackupView.this.KO != null) {
                            boolean z = !VastBannerBackupView.this.KO.HX();
                            VastBannerBackupView vastBannerBackupView = VastBannerBackupView.this;
                            int iPm = z ? zF.Pm(vastBannerBackupView.getContext(), "tt_mute_wrapper") : zF.Pm(vastBannerBackupView.getContext(), "tt_unmute_wrapper");
                            VastBannerBackupView.this.KO.setIsQuiet(z);
                            VastBannerBackupView.this.hu.setImageResource(iPm);
                            if (VastBannerBackupView.this.Td == null || VastBannerBackupView.this.Td.zzY() == null || VastBannerBackupView.this.Td.zzY().EYQ() == null) {
                                return;
                            }
                            if (z) {
                                VastBannerBackupView.this.Td.zzY().EYQ().QQ(VastBannerBackupView.this.Uc);
                            } else {
                                VastBannerBackupView.this.Td.zzY().EYQ().HX(VastBannerBackupView.this.Uc);
                            }
                        }
                    }
                });
            }
            RatioFrameLayout ratioFrameLayout = eyqVwS.mZx;
            if (this.Td != null && this.Td.zzY() != null && ratioFrameLayout != null) {
                int iTsL = this.Td.zzY().tsL();
                float fPi = this.Td.zzY().pi();
                if (iTsL > 0 && fPi > 0.0f) {
                    ratioFrameLayout.setRatio(iTsL / fPi);
                } else if (iBy == 15) {
                    ratioFrameLayout.setRatio(0.5625f);
                } else if (iBy == 5) {
                    ratioFrameLayout.setRatio(1.7777778f);
                } else {
                    ratioFrameLayout.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && ratioFrameLayout != null) {
                ratioFrameLayout.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            EYQ((View) videoView, true);
            EYQ((View) this, true);
            EYQ(ratioFrameLayout);
        }
    }

    private EYQ VwS() {
        EYQ eyq = new EYQ();
        eyq.EYQ = new FrameLayout(this.mZx);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        eyq.EYQ.setLayoutParams(layoutParams);
        eyq.mZx = new RatioFrameLayout(this.mZx);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        eyq.mZx.setLayoutParams(layoutParams2);
        eyq.EYQ.addView(eyq.mZx);
        int iMZx = tr.mZx(this.mZx, 20.0f);
        int iMZx2 = tr.mZx(this.mZx, 5.0f);
        eyq.Td = new ShadowImageView(this.mZx);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iMZx, iMZx);
        layoutParams3.setMargins(iMZx2, iMZx2, iMZx2, iMZx2);
        eyq.Td.setScaleType(ImageView.ScaleType.CENTER);
        eyq.Td.setImageDrawable(zF.Td(this.mZx, "tt_mute_wrapper"));
        eyq.Td.setBackground(VwS.EYQ(this.mZx, "tt_mute_btn_bg"));
        eyq.Td.setLayoutParams(layoutParams3);
        eyq.EYQ.addView(eyq.Td);
        eyq.Pm = new ShadowImageView(this.mZx);
        eyq.Pm.setId(520093697);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iMZx, iMZx);
        layoutParams4.gravity = GravityCompat.END;
        int iMZx3 = tr.mZx(this.mZx, 7.0f);
        int iMZx4 = tr.mZx(this.mZx, 3.0f);
        layoutParams4.setMargins(iMZx3, iMZx3, iMZx3, iMZx3);
        eyq.Pm.setScaleType(ImageView.ScaleType.FIT_CENTER);
        eyq.Pm.setPadding(iMZx4, iMZx4, iMZx4, iMZx4);
        eyq.Pm.setImageDrawable(zF.Td(this.mZx, "tt_pangle_ad_close_drawable"));
        eyq.Pm.setBackground(VwS.EYQ(this.mZx, "tt_mute_btn_bg"));
        eyq.Pm.setLayoutParams(layoutParams4);
        eyq.EYQ.addView(eyq.Pm);
        eyq.Kbd = new PAGLogoView(this.mZx);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388691;
        layoutParams5.setMargins(iMZx2, iMZx2, iMZx2, iMZx2);
        eyq.Kbd.setLayoutParams(layoutParams5);
        eyq.EYQ.addView(eyq.Kbd);
        eyq.IPb = new PAGImageView(this.mZx);
        int iMZx5 = tr.mZx(this.mZx, 11.0f);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iMZx5, iMZx5);
        layoutParams6.gravity = 8388693;
        layoutParams6.rightMargin = iMZx2;
        layoutParams6.bottomMargin = iMZx2;
        eyq.IPb.setVisibility(8);
        eyq.IPb.setScaleType(ImageView.ScaleType.FIT_CENTER);
        eyq.IPb.setLayoutParams(layoutParams6);
        eyq.EYQ.addView(eyq.IPb);
        return eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void EYQ() {
        if (this.Kbd != null) {
            this.Kbd.show();
        } else if (this.Pm != null) {
            this.Pm.EYQ();
        } else {
            TTDelegateActivity.EYQ(this.Td, this.UB);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.Pm
    public void EYQ(int i, int i2) {
        ShadowImageView shadowImageView = this.hu;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(8);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void EYQ(long j, long j2) {
        this.Uc = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.InterfaceC0065Td
    public void g_() {
        ShadowImageView shadowImageView = this.hu;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(8);
        }
    }

    public long getVideoProgress() {
        return this.Uc;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.hYh = pAGBannerAdWrapperListener;
    }

    private static class EYQ {
        public FrameLayout EYQ;
        public PAGImageView IPb;
        public PAGLogoView Kbd;
        public ShadowImageView Pm;
        public ShadowImageView Td;
        public RatioFrameLayout mZx;

        private EYQ() {
        }
    }
}
