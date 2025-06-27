package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.tsL;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.mZx.mZx;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.Objects;

/* compiled from: RewardFullAdType.java */
/* loaded from: classes2.dex */
public abstract class mZx extends com.bytedance.sdk.openadsdk.component.reward.mZx.EYQ {
    private com.bytedance.sdk.openadsdk.HX.Pm KO;
    protected String MxO;
    public LinearLayout nWX;
    public com.bytedance.sdk.openadsdk.core.widget.EYQ pi;
    protected com.bytedance.sdk.openadsdk.core.mZx.Kbd tsL;

    /* compiled from: RewardFullAdType.java */
    public interface EYQ {
        void EYQ(boolean z);
    }

    public abstract void EYQ(FrameLayout frameLayout);

    public abstract boolean IPb();

    public abstract boolean Kbd();

    protected boolean Nvm() {
        return true;
    }

    public EYQ Pm() {
        return null;
    }

    public abstract void VwS();

    public void nWX() {
    }

    public void zF() {
    }

    public mZx(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.EYQ
    public void EYQ(com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx, wBa wba) {
        super.EYQ(mzx, wba);
        if (this.EYQ.TZn.hu()) {
            this.EYQ.wJ.EYQ(false);
        }
        if (zF.MxO(this.EYQ.EYQ)) {
            this.EYQ.kf.IPb();
        }
    }

    public void EYQ(RewardFullBaseLayout rewardFullBaseLayout) {
        int iLEs = this.mZx.lEs();
        if (iLEs == 1 && !zF.MxO(this.mZx)) {
            Td(rewardFullBaseLayout);
            return;
        }
        if (iLEs == 3) {
            Pm(rewardFullBaseLayout);
        } else if (iLEs == 5) {
            Kbd(rewardFullBaseLayout);
        } else {
            mZx(rewardFullBaseLayout);
        }
    }

    public RFEndCardBackUpLayout QQ() {
        return new RFEndCardBackUpLayout(this.EYQ.TZn);
    }

    public View HX() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this.EYQ.TZn);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this.EYQ.TZn);
        pAGRelativeLayout.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tr.mZx(this.EYQ.TZn, 28.0f), tr.mZx(this.EYQ.TZn, 28.0f));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = tr.mZx(this.EYQ.TZn, 20.0f);
        layoutParams.rightMargin = tr.mZx(this.EYQ.TZn, 24.0f);
        pAGRelativeLayout.setLayoutParams(layoutParams);
        pAGRelativeLayout.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.EYQ.TZn, "tt_mute_btn_bg"));
        pAGRelativeLayout.setGravity(17);
        pAGRelativeLayout.setVisibility(8);
        pAGRelativeLayout.setContentDescription(com.bytedance.sdk.component.utils.zF.EYQ(this.EYQ.TZn, "tt_ad_close_text"));
        PAGImageView pAGImageView = new PAGImageView(this.EYQ.TZn);
        pAGImageView.setId(520093706);
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(tr.mZx(this.EYQ.TZn, 12.0f), tr.mZx(this.EYQ.TZn, 12.0f)));
        pAGImageView.setImageResource(com.bytedance.sdk.component.utils.zF.Pm(this.EYQ.TZn, "tt_video_close_drawable"));
        pAGImageView.setContentDescription(com.bytedance.sdk.component.utils.zF.EYQ(this.EYQ.TZn, "tt_ad_close_text"));
        pAGRelativeLayout.addView(pAGImageView);
        PAGLogoView pAGLogoView = new PAGLogoView(this.EYQ.TZn);
        pAGLogoView.setId(520093757);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, tr.mZx(this.EYQ.TZn, 14.0f));
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = tr.mZx(this.EYQ.TZn, 16.0f);
        layoutParams2.bottomMargin = tr.mZx(this.EYQ.TZn, 100.0f);
        pAGLogoView.setLayoutParams(layoutParams2);
        PAGImageView pAGImageView2 = new PAGImageView(this.EYQ.TZn);
        pAGImageView2.setId(tp.baW);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tr.mZx(this.EYQ.TZn, 32.0f), tr.mZx(this.EYQ.TZn, 14.0f));
        layoutParams3.gravity = 8388693;
        layoutParams3.rightMargin = tr.mZx(this.EYQ.TZn, 7.0f);
        layoutParams3.bottomMargin = tr.mZx(this.EYQ.TZn, 100.0f);
        pAGImageView2.setLayoutParams(layoutParams3);
        pAGImageView2.setPadding(tr.mZx(this.EYQ.TZn, 9.0f), 0, tr.mZx(this.EYQ.TZn, 9.0f), 0);
        pAGImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        PlayableLoadingView playableLoadingView = new PlayableLoadingView(this.EYQ.TZn);
        playableLoadingView.setId(tp.oy);
        playableLoadingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        TopProxyLayout topProxyLayout = new TopProxyLayout(this.EYQ.TZn);
        topProxyLayout.setId(tp.lv);
        topProxyLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGFrameLayout.addView(pAGRelativeLayout);
        pAGFrameLayout.addView(pAGLogoView);
        pAGFrameLayout.addView(pAGImageView2);
        pAGFrameLayout.addView(playableLoadingView);
        pAGFrameLayout.addView(topProxyLayout);
        return pAGFrameLayout;
    }

    public View tp() {
        PAGRelativeLayout pAGRelativeLayout;
        if (this.mZx.lEs() != 5) {
            pAGRelativeLayout = new PAGRelativeLayout(this.EYQ.TZn);
            pAGRelativeLayout.setId(tp.jv);
        } else {
            pAGRelativeLayout = null;
        }
        Objects.toString(pAGRelativeLayout);
        return pAGRelativeLayout;
    }

    protected int MxO() {
        float f = 100.0f;
        if (this.mZx.lEs() == 1 && !zF.MxO(this.mZx)) {
            f = 20.0f;
        }
        return tr.mZx(this.EYQ.VOV, tsL.EYQ(this.mZx) ? 20.0f : f);
    }

    public void tsL() {
        this.EYQ.Kbc.EYQ(this.EYQ.IPb);
        this.EYQ.TQF.mZx();
        this.EYQ.TQF.EYQ(MxO());
        this.EYQ.na.EYQ();
        if (!this.EYQ.EYQ.oIw()) {
            if (this.EYQ.hYh && TextUtils.isEmpty(UB.EYQ(this.EYQ.VOV, this.mZx))) {
                pi();
            }
            this.EYQ.wJ.EYQ();
            this.EYQ.wa.EYQ();
        }
        this.EYQ.kf.EYQ();
        this.EYQ.KR.EYQ();
        if (zF.mZx(this.EYQ.EYQ)) {
            this.EYQ.wJ.QQ().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.EYQ.wJ.HX().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.EYQ.KR.Td(true);
            if (zF.MxO(this.EYQ.EYQ)) {
                this.EYQ.TQF.Pm();
                tr.EYQ((View) this.EYQ.wJ.QQ(), 4);
                tr.EYQ((View) this.EYQ.wJ.HX(), 0);
            }
        }
        if (KO.Td(this.EYQ.EYQ) || KO.mZx(this.EYQ.EYQ)) {
            return;
        }
        this.EYQ.TQF.EYQ(tr.mZx(this.EYQ.VOV, this.EYQ.tsL), tr.mZx(this.EYQ.VOV, this.EYQ.pi));
        this.EYQ.PI.EYQ();
        if (zF.MxO(this.EYQ.EYQ)) {
            this.EYQ.wJ.EYQ(true);
            this.EYQ.wJ.Kbd();
            EYQ(false, false, false, mZx.C0133mZx.Td);
        } else if (this.EYQ.TZn.UB()) {
            this.EYQ.TQF.mZx(0);
        }
    }

    public void pi() {
        LinearLayout linearLayout = (LinearLayout) this.EYQ.TZn.findViewById(tp.pi);
        this.nWX = linearLayout;
        tr.EYQ((View) linearLayout, 8);
        this.EYQ.Dal = new com.bytedance.sdk.openadsdk.common.VwS(this.EYQ.TZn, this.EYQ.EYQ, "landingpage_endcard");
        this.EYQ.Dal.Td().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.mZx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                mZx.this.EYQ.TQF.tp().performClick();
            }
        });
        this.nWX.addView(this.EYQ.Dal.Kbd(), new LinearLayout.LayoutParams(-1, -1));
        this.EYQ.wJ.EYQ(this.EYQ.Dal);
    }

    public void EYQ(boolean z, boolean z2, boolean z3, int i) {
        this.EYQ.na.EYQ(z, z2, z3, this, i);
    }

    public void KO() {
        com.bytedance.sdk.openadsdk.core.widget.EYQ eyq = this.pi;
        if (eyq == null || !eyq.isShowing()) {
            return;
        }
        this.pi.dismiss();
    }

    public void hu() {
        if (this.EYQ.hYh) {
            return;
        }
        this.EYQ.KR.IPb();
        this.EYQ.TQF.IPb(0);
    }

    public void UB() {
        this.tp.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
    }

    public void Uc() {
        hYh();
    }

    protected void hYh() {
        if (this.EYQ.WU.get() && !this.EYQ.hYh && this.EYQ.Tnp.getAndSet(false)) {
            if (this.EYQ.zF >= 0 || this.EYQ.zF == -1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = this.EYQ.zF;
                this.EYQ.Nuq.sendMessage(messageObtain);
            }
        }
    }

    public void WU() {
        if (this.EYQ == null) {
            return;
        }
        this.EYQ.Kbd = false;
        boolean z = this.EYQ.Kbd;
        boolean z2 = this.EYQ.Pm;
        if (!this.EYQ.XN.get()) {
            this.EYQ.FtN.tp();
        }
        UB();
        this.EYQ.wJ.Uc();
        this.EYQ.kf.nWX();
        if (this.EYQ.WU.get()) {
            this.EYQ.Tnp.set(true);
        }
    }

    public void XN() {
        if (this.EYQ == null) {
            return;
        }
        if (this.EYQ.TQF != null) {
            this.EYQ.TQF.hu();
        }
        boolean z = this.EYQ.Pm;
        this.EYQ.XPd.EYQ();
        DeviceUtils.VwS();
        this.EYQ.wJ.UB();
        if (this.EYQ.Pm) {
            this.EYQ.TZn.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.mZx.2
                @Override // java.lang.Runnable
                public void run() {
                    if (mZx.this.EYQ.XPd.EYQ() > 0) {
                        mZx.this.EYQ.XPd.EYQ(false);
                    }
                }
            });
        }
    }

    public void NZ() {
        if (this.EYQ.mN != null) {
            this.EYQ.mN.IPb();
        }
        if (this.EYQ.TQF != null) {
            this.EYQ.TQF.nWX();
        }
        this.EYQ.FtN.Pm(this.EYQ.IPb);
        if (!Kbd()) {
            this.EYQ.WU.get();
        }
        this.EYQ.wJ.nWX();
        this.EYQ.kf.Kbd();
        this.EYQ.TQF.tsL();
        this.EYQ.na.Td();
        this.EYQ.Kbc.mZx();
    }

    public void tPj() {
        int iUB;
        if (hu.Pm().hYh(String.valueOf(this.EYQ.KO)) == 1) {
            if (this.EYQ.IPb) {
                if (zF.MxO(this.EYQ.EYQ)) {
                    iUB = hu.Pm().EYQ(String.valueOf(this.EYQ.KO), true);
                } else {
                    iUB = hu.Pm().tp(String.valueOf(this.EYQ.KO));
                }
            } else if (zF.MxO(this.EYQ.EYQ)) {
                iUB = hu.Pm().EYQ(String.valueOf(this.EYQ.KO), false);
            } else {
                iUB = hu.Pm().UB(String.valueOf(this.EYQ.KO));
            }
            if (this.EYQ.TQF != null && this.EYQ.TQF.HX()) {
                if (this.EYQ.TQF != null) {
                    this.EYQ.TQF.tp().performClick();
                }
            } else if ((!this.EYQ.WU.get() || zF.MxO(this.EYQ.EYQ)) && iUB != -1) {
                if (((this.EYQ.FtN == null || this.EYQ.FtN.QQ() < iUB * 1000) && (this.EYQ.kf == null || this.EYQ.kf.MxO() - this.EYQ.kf.tsL() < iUB)) || this.EYQ.KR == null) {
                    return;
                }
                this.EYQ.KR.Pm();
            }
        }
    }

    public void wBa() {
        this.EYQ.KR.Td();
        this.EYQ.KR.Kbd(true);
    }

    public void rfB() {
        this.tsL = this.EYQ.Pf.Td();
    }

    public void lEs() {
        if (!IPb() && ((this instanceof VwS) || (this instanceof QQ))) {
            this.EYQ.Pf.mZx();
        } else {
            if (this.HX.EYQ(this.Kbd.HX(), false)) {
                return;
            }
            this.tp.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
            EYQ(mZx.C0133mZx.EYQ);
            this.Kbd.EYQ(!this.Kbd.rfB() ? 1 : 0, 4);
        }
    }

    public void EYQ(int i) {
        this.Kbd.pi();
        EYQ(false, true, false, i);
        if (this.EYQ.IPb) {
            this.HX.Td(10000);
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.HX.Pm pm) {
        this.KO = pm;
        Td();
        if (!this.EYQ.EYQ.oIw() && Nvm()) {
            xt();
        }
        if (Nvm()) {
            this.EYQ.na.mZx();
        }
        if (KO.Td(this.EYQ.EYQ)) {
            this.tp.sendEmptyMessageDelayed(500, 100L);
        }
        this.EYQ.TQF.EYQ(this.EYQ.MxO == 100.0f);
        rfB();
        VwS();
    }

    protected final void xt() {
        if (this.EYQ.TZn.isFinishing()) {
            return;
        }
        this.EYQ.wJ.pi();
        String str = this.EYQ.IPb ? "reward_endcard" : "fullscreen_endcard";
        this.EYQ.wJ.EYQ(this.KO, str, this.EYQ.TZn);
        this.EYQ.kf.EYQ(this.KO, this.EYQ.Pm);
        this.EYQ.wJ.EYQ(str, this.EYQ.TZn);
        this.EYQ.wJ.Kbd();
    }

    public void EYQ(Message message) {
        int i = message.what;
        int i2 = message.what;
        if (i2 == 1) {
            wBa();
            return;
        }
        if (i2 == 300) {
            EYQ(mZx.C0133mZx.mZx);
            this.EYQ.FtN.EYQ(!this.EYQ.FtN.rfB() ? 1 : 0, 1 ^ (this.EYQ.FtN.rfB() ? 1 : 0));
            if (this.EYQ.EYQ.zzY() == null || this.EYQ.EYQ.zzY().EYQ() == null) {
                return;
            }
            this.EYQ.EYQ.zzY().EYQ().EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.GENERAL_LINEAR_AD_ERROR);
            return;
        }
        if (i2 == 400) {
            this.EYQ.FtN.pi();
            EYQ(false, true, false, 3);
            return;
        }
        if (i2 == 500) {
            if (!zF.mZx(this.EYQ.EYQ)) {
                this.EYQ.KR.Td(false);
            }
            SSWebView sSWebViewQQ = this.EYQ.wJ.QQ();
            if (sSWebViewQQ != null && sSWebViewQQ.getWebView() != null) {
                sSWebViewQQ.HX();
                sSWebViewQQ.getWebView().resumeTimers();
            }
            if (this.EYQ.wJ.QQ() != null) {
                this.EYQ.wJ.EYQ(1.0f);
                this.EYQ.TQF.EYQ(1.0f);
            }
            if (!this.EYQ.TZn.KO() && this.EYQ.FtN.mZx() && this.EYQ.Nvm.get()) {
                this.EYQ.FtN.pi();
                return;
            }
            return;
        }
        if (i2 == 600) {
            hu();
            return;
        }
        if (i2 != 700) {
            if (i2 != 800) {
                return;
            }
            if (!zF.mZx(this.EYQ.EYQ)) {
                this.EYQ.KR.Td(false);
            }
            this.EYQ.TQF.EYQ(1.0f);
            if (!this.EYQ.TZn.KO() && this.EYQ.FtN.mZx() && this.EYQ.Nvm.get()) {
                this.EYQ.FtN.pi();
                return;
            }
            return;
        }
        int i3 = message.arg1;
        if (this.EYQ.Tnp.get()) {
            return;
        }
        if (i3 > 0) {
            this.EYQ.KR.mZx();
            this.EYQ.KR.EYQ((i3 / 1000) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
            this.EYQ.KR.Kbd(false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 700;
            messageObtain.arg1 = i3 - 1000;
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq = this.EYQ;
            eyq.zF -= 1000;
            this.tp.sendMessageDelayed(messageObtain, 1000L);
            return;
        }
        this.tp.removeMessages(700);
        if (zF.Td(this.mZx)) {
            if (this.EYQ.kf.UB() || !this.EYQ.wJ.hu()) {
                hu();
                return;
            } else {
                wBa();
                return;
            }
        }
        hu();
    }

    static void mZx(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(tp.tp);
        frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(EYQ(context));
        RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setId(tp.tsL);
        rFDownloadBarLayout.setPadding(tr.mZx(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setBackgroundColor(com.bytedance.sdk.component.utils.zF.QQ(context, "tt_download_bar_background_new"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tr.mZx(context, 90.0f));
        layoutParams.gravity = 80;
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.pi);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setId(tp.nWX);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(tp.KO);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setId(tp.hu);
        sSWebView2.setVisibility(8);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    protected static FrameLayout EYQ(Context context) {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(tp.MxO);
        pAGFrameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout.setLayoutParams(layoutParams);
        return pAGFrameLayout;
    }

    private void Td(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.addView(pAGRelativeLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(tp.MxO);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 211.0f));
        layoutParams.addRule(13);
        pAGRelativeLayout.addView(pAGFrameLayout, layoutParams);
        View view = new View(context);
        view.setVisibility(8);
        view.setId(tp.UB);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(2, tp.MxO);
        pAGRelativeLayout.addView(view, layoutParams2);
        RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setId(tp.tsL);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tr.mZx(context, 280.0f), tr.mZx(context, 70.0f));
        layoutParams3.addRule(2, tp.MxO);
        layoutParams3.addRule(14);
        layoutParams3.bottomMargin = tr.mZx(context, 33.0f);
        pAGRelativeLayout.addView(rFDownloadBarLayout, layoutParams3);
        View view2 = new View(context);
        view2.setId(tp.dub);
        view2.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(3, tp.MxO);
        pAGRelativeLayout.addView(view2, layoutParams4);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setLines(1);
        pAGTextView.setGravity(17);
        pAGTextView.setText(com.bytedance.sdk.component.utils.zF.mZx(context, "tt_video_download_apk"));
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 15.0f);
        pAGTextView.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_reward_video_download_btn_bg"));
        pAGTextView.setId(520093705);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(tr.mZx(context, 260.0f), tr.mZx(context, 36.0f));
        layoutParams5.addRule(3, tp.MxO);
        layoutParams5.addRule(14);
        layoutParams5.topMargin = tr.mZx(context, 70.0f);
        pAGRelativeLayout.addView(pAGTextView, layoutParams5);
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(tp.nWX);
        pAGRelativeLayout.addView(sSWebView, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(tp.KO);
        frameLayout2.setVisibility(4);
        pAGRelativeLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(tp.hu);
        pAGRelativeLayout.addView(sSWebView2, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void Pm(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        frameLayout.addView(EYQ(context));
        RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_reward_full_new_bar_bg"));
        rFDownloadBarLayout.setPadding(tr.mZx(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setId(tp.tsL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tr.mZx(context, 76.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = tr.mZx(context, 10.0f);
        layoutParams.rightMargin = tr.mZx(context, 10.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        layoutParams.bottomMargin = tr.mZx(context, 14.0f);
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.pi);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(tp.nWX);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(tp.KO);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(tp.hu);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    private void Kbd(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        frameLayout.addView(EYQ(context));
        RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_reward_full_new_bar_bg"));
        rFDownloadBarLayout.setPadding(tr.mZx(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setId(tp.tsL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tr.mZx(context, 76.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = tr.mZx(context, 10.0f);
        layoutParams.rightMargin = tr.mZx(context, 10.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        layoutParams.bottomMargin = tr.mZx(context, 14.0f);
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.pi);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(tp.nWX);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(tp.KO);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(tp.hu);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }
}
