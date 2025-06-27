package com.bytedance.sdk.openadsdk.component.reward.mZx;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.HashMap;
import java.util.List;

/* compiled from: RewardFullTypeImage.java */
/* loaded from: classes2.dex */
public class VwS extends mZx {
    private boolean KO;
    private TTRatingBar2 NZ;
    private View UB;
    private RatioImageView Uc;
    private PAGTextView WU;
    private PAGTextView XN;
    private TTRoundRectImageView hYh;
    private final int hu;
    private String lEs;
    private PAGRelativeLayout rfB;
    private PAGTextView tPj;
    private PAGLogoView wBa;
    private PAGTextView zF;

    public VwS(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
        this.lEs = "fullscreen_interstitial_ad";
        this.hu = this.mZx.by();
        this.KO = this.EYQ.tp == 2;
    }

    private void FH() {
        this.KO = this.EYQ.tp == 2;
        boolean z = this.KO;
        int i = this.hu;
        if (z) {
            if (i == 3) {
                Tnp();
                return;
            } else if (i == 33) {
                PI();
                return;
            } else {
                mN();
                return;
            }
        }
        if (i == 3) {
            tr();
        } else if (i == 33) {
            FtN();
        } else {
            kf();
        }
    }

    private void tr() {
        this.UB = Td(this.EYQ.TZn);
        Kbc();
    }

    private void Tnp() {
        final TTBaseVideoActivity tTBaseVideoActivity = this.EYQ.TZn;
        this.UB = mZx(tTBaseVideoActivity);
        EYQ(this.Uc);
        EYQ(this.hYh);
        EYQ(this.zF);
        EYQ(this.WU);
        EYQ(this.XN);
        EYQ(this.tPj);
        this.wBa.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.VwS.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(tTBaseVideoActivity, VwS.this.mZx, VwS.this.lEs);
                } catch (Throwable th) {
                    pi.EYQ("TTAD.RFTI", th.getMessage());
                }
            }
        });
        this.tPj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.VwS.2
            @Override // java.lang.Runnable
            public void run() {
                int width = VwS.this.rfB.getWidth() / 2;
                if (width >= tr.Td(hu.EYQ(), 90.0f)) {
                    ViewGroup.LayoutParams layoutParams = VwS.this.tPj.getLayoutParams();
                    if (layoutParams.width > 0) {
                        layoutParams.width = Math.min(width, layoutParams.width);
                        VwS.this.tPj.setLayoutParams(layoutParams);
                    }
                }
            }
        });
    }

    private void FtN() {
        this.UB = Pm(this.EYQ.TZn);
        Kbc();
    }

    private void PI() {
        this.UB = EYQ(this.EYQ.TZn, 0);
        Kbc();
    }

    private void kf() {
        final TTBaseVideoActivity tTBaseVideoActivity = this.EYQ.TZn;
        this.UB = Kbd(tTBaseVideoActivity);
        EYQ(this.Uc);
        EYQ(this.hYh);
        EYQ(this.zF);
        EYQ(this.WU);
        EYQ(this.tPj);
        this.wBa.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.VwS.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(tTBaseVideoActivity, VwS.this.mZx, VwS.this.lEs);
                } catch (Throwable th) {
                    pi.EYQ("TTAD.RFTI", th.getMessage());
                }
            }
        });
    }

    private void mN() {
        this.UB = EYQ(this.EYQ.TZn, 2);
        Kbc();
    }

    private void Kbc() {
        if (this.UB == null) {
            return;
        }
        final TTBaseVideoActivity tTBaseVideoActivity = this.EYQ.TZn;
        EYQ((View) this.Uc);
        EYQ((View) this.hYh);
        EYQ(this.zF);
        EYQ(this.WU);
        EYQ(this.XN);
        EYQ((View) this.NZ);
        EYQ(this.tPj);
        this.wBa.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.mZx.VwS.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(tTBaseVideoActivity, VwS.this.mZx, VwS.this.lEs);
                } catch (Throwable th) {
                    pi.EYQ("TTAD.RFTI", th.getMessage());
                }
            }
        });
    }

    private void Pm(UB ub) {
        if (ub == null) {
            return;
        }
        RatioImageView ratioImageView = this.Uc;
        if (ratioImageView != null) {
            int i = this.hu;
            if (i == 33) {
                ratioImageView.setRatio(1.0f);
            } else if (i == 3) {
                ratioImageView.setRatio(1.91f);
            } else {
                ratioImageView.setRatio(0.56f);
            }
            EYQ((ImageView) this.Uc);
        }
        if (this.hYh != null && this.mZx.vD() != null && !TextUtils.isEmpty(this.mZx.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.mZx.vD().EYQ(), this.mZx.vD().mZx(), this.mZx.vD().Td(), this.hYh, this.mZx);
        }
        PAGTextView pAGTextView = this.zF;
        if (pAGTextView != null) {
            pAGTextView.setText(EYQ(this.mZx));
        }
        PAGTextView pAGTextView2 = this.WU;
        if (pAGTextView2 != null) {
            pAGTextView2.setText(mZx(this.mZx));
        }
        Pf();
        vD();
    }

    protected String EYQ(UB ub) {
        if (ub == null) {
            return "";
        }
        if (ub.xh() != null && !TextUtils.isEmpty(ub.xh().mZx())) {
            return ub.xh().mZx();
        }
        if (TextUtils.isEmpty(ub.Kbc())) {
            return !TextUtils.isEmpty(ub.TQF()) ? ub.TQF() : "";
        }
        return ub.Kbc();
    }

    protected String mZx(UB ub) {
        if (ub == null) {
            return "";
        }
        if (TextUtils.isEmpty(ub.TQF())) {
            return !TextUtils.isEmpty(ub.OtA()) ? ub.OtA() : "";
        }
        return ub.TQF();
    }

    private void EYQ(ImageView imageView) {
        List<nWX> listDal;
        nWX nwx;
        if (this.mZx == null || (listDal = this.mZx.Dal()) == null || listDal.size() <= 0 || (nwx = listDal.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(listDal.get(0)).Td(2).EYQ(com.bytedance.sdk.openadsdk.IPb.Td.EYQ(this.mZx, nwx.EYQ(), imageView));
    }

    private void Pf() {
        TTRatingBar2 tTRatingBar2 = this.NZ;
        if (tTRatingBar2 == null) {
            return;
        }
        tr.EYQ((TextView) null, tTRatingBar2, this.mZx);
    }

    private void vD() {
        if (this.XN == null || this.mZx == null) {
            return;
        }
        tr.EYQ(this.XN, this.mZx, this.EYQ.TZn, "tt_comment_num_backup");
    }

    protected void EYQ(View view) {
        com.bytedance.sdk.openadsdk.core.mZx.mZx eyq;
        if (view == null || this.EYQ.TZn == null || this.mZx == null) {
            return;
        }
        if (this.tsL == null) {
            TTBaseVideoActivity tTBaseVideoActivity = this.EYQ.TZn;
            UB ub = this.mZx;
            String str = this.lEs;
            eyq = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(tTBaseVideoActivity, ub, str, FH.EYQ(str));
            eyq.EYQ(Kbd(this.mZx));
            HashMap map = new HashMap();
            if (zF.MxO(this.mZx)) {
                map.put("click_scence", 3);
            } else {
                map.put("click_scence", 1);
            }
            eyq.EYQ(map);
        } else {
            eyq = this.tsL;
        }
        if (this.EYQ.TZn != null) {
            eyq.EYQ(this.EYQ.TZn);
        }
        view.setOnTouchListener(eyq);
        view.setOnClickListener(eyq);
    }

    private com.com.bytedance.overseas.sdk.EYQ.Td Kbd(UB ub) {
        if (ub.Pf() == 4) {
            return new com.com.bytedance.overseas.sdk.EYQ.mZx(hu.EYQ(), ub, this.lEs);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(FrameLayout frameLayout) {
        FH();
        Pm(this.mZx);
        frameLayout.addView(this.UB);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void EYQ(RewardFullBaseLayout rewardFullBaseLayout) {
        if (KO.mZx(this.mZx)) {
            Td.Td(rewardFullBaseLayout);
        } else if (KO.Td(this.mZx)) {
            Td.Pm(rewardFullBaseLayout);
        } else {
            super.EYQ(rewardFullBaseLayout);
        }
    }

    public static boolean Td(UB ub) {
        return !UB.Kbd(ub) && ub.CsQ() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean Kbd() {
        return lRN() || zF.mZx(this.mZx);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public boolean IPb() {
        return lRN();
    }

    private boolean lRN() {
        return this.mZx != null && this.mZx.zF() == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.mZx.mZx
    public void VwS() {
        this.IPb.Pm(8);
        this.IPb.Td(8);
        this.QQ.Td(false);
        this.QQ.Pm(false);
        if (this.mZx.zF() == 2) {
            this.QQ.EYQ(false);
            this.IPb.IPb(8);
        } else {
            this.QQ.EYQ(this.mZx.BQ());
            this.IPb.IPb(0);
            this.QQ.IPb();
        }
    }

    private View mZx(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.Uc = new RatioImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.Uc.setScaleType(ImageView.ScaleType.FIT_XY);
        this.Uc.setLayoutParams(layoutParams);
        pAGRelativeLayout.addView(this.Uc);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.wBa = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, EYQ(14.0f));
        layoutParams2.addRule(2, tp.sOZ);
        this.wBa.setPadding(EYQ(2.0f), 0, 0, 0);
        this.wBa.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(this.wBa);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        this.rfB = pAGRelativeLayout2;
        pAGRelativeLayout2.setId(tp.sOZ);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, EYQ(90.0f));
        layoutParams3.addRule(12);
        this.rfB.setBackgroundColor(Color.parseColor("#E4FFFFFF"));
        this.rfB.setGravity(16);
        this.rfB.setLayoutParams(layoutParams3);
        pAGRelativeLayout.addView(this.rfB);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.hYh = tTRoundRectImageView;
        tTRoundRectImageView.setId(tp.oIw);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(EYQ(69.0f), EYQ(69.0f));
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.hYh.setBackgroundColor(0);
        this.hYh.setLayoutParams(layoutParams4);
        this.rfB.addView(this.hYh);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams5.addRule(1, tp.oIw);
        layoutParams5.addRule(0, tp.zzY);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams5);
        this.rfB.addView(pAGLinearLayout);
        this.zF = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, EYQ(27.0f));
        layoutParams6.leftMargin = EYQ(14.0f);
        this.zF.setEllipsize(TextUtils.TruncateAt.END);
        this.zF.setGravity(16);
        this.zF.setMaxWidth(EYQ(153.0f));
        this.zF.setSingleLine(true);
        this.zF.setTextColor(Color.parseColor("#ff000000"));
        this.zF.setTextSize(17.0f);
        this.zF.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.zF);
        this.WU = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.leftMargin = EYQ(14.0f);
        layoutParams7.topMargin = EYQ(5.0f);
        this.WU.setEllipsize(TextUtils.TruncateAt.END);
        this.WU.setSingleLine(true);
        this.WU.setTextColor(Color.parseColor("#4A4A4A"));
        this.WU.setTextSize(15.0f);
        this.WU.setLayoutParams(layoutParams7);
        pAGLinearLayout.addView(this.WU);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.tPj = pAGTextView;
        pAGTextView.setId(tp.zzY);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, EYQ(36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = EYQ(15.0f);
        this.tPj.setMinWidth(EYQ(90.0f));
        this.tPj.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_download_corner_bg"));
        this.tPj.setGravity(17);
        this.tPj.setSingleLine(true);
        this.tPj.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_video_download_apk"));
        this.tPj.setTextColor(Color.parseColor("#ffffff"));
        this.tPj.setTextSize(17.0f);
        this.tPj.setLayoutParams(layoutParams8);
        this.rfB.addView(this.tPj);
        return pAGRelativeLayout;
    }

    private View Td(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams2);
        RatioImageView ratioImageView = new RatioImageView(context);
        this.Uc = ratioImageView;
        ratioImageView.setId(tp.oB);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        this.Uc.setScaleType(ImageView.ScaleType.FIT_XY);
        this.Uc.setLayoutParams(layoutParams3);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.wBa = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, EYQ(14.0f));
        layoutParams4.addRule(8, tp.oB);
        this.wBa.setPadding(EYQ(2.0f), 0, 0, 0);
        this.wBa.setLayoutParams(layoutParams4);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.weight = 2.0f;
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams5);
        this.hYh = new TTRoundRectImageView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(EYQ(80.0f), EYQ(80.0f));
        this.hYh.setBackgroundColor(0);
        this.hYh.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.hYh);
        this.zF = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, EYQ(28.0f));
        this.zF.setEllipsize(TextUtils.TruncateAt.END);
        this.zF.setMaxWidth(EYQ(180.0f));
        this.zF.setSingleLine(true);
        this.zF.setTextColor(Color.parseColor("#ffffff"));
        this.zF.setTextSize(20.0f);
        this.zF.setLayoutParams(layoutParams7);
        this.WU = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = EYQ(40.0f);
        layoutParams8.topMargin = EYQ(20.0f);
        layoutParams8.rightMargin = EYQ(40.0f);
        this.WU.setGravity(17);
        this.WU.setTextColor(Color.parseColor("#ffffff"));
        this.WU.setTextSize(20.0f);
        this.WU.setLayoutParams(layoutParams8);
        this.XN = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, EYQ(20.0f));
        layoutParams9.topMargin = EYQ(50.0f);
        this.XN.setEllipsize(TextUtils.TruncateAt.END);
        this.XN.setSingleLine(true);
        this.XN.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_comment_num_backup"));
        this.XN.setTextColor(Color.parseColor("#ff93959a"));
        this.XN.setTextSize(14.0f);
        this.XN.setLayoutParams(layoutParams9);
        this.NZ = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, EYQ(16.0f));
        layoutParams10.gravity = 17;
        layoutParams10.topMargin = EYQ(12.0f);
        this.NZ.setLayoutParams(layoutParams10);
        this.tPj = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, EYQ(40.0f));
        layoutParams11.leftMargin = EYQ(40.0f);
        layoutParams11.rightMargin = EYQ(40.0f);
        layoutParams11.topMargin = EYQ(30.0f);
        this.tPj.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_reward_video_download_btn_bg"));
        this.tPj.setGravity(17);
        this.tPj.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_video_download_apk"));
        this.tPj.setTextColor(Color.parseColor("#ffffff"));
        this.tPj.setTextSize(15.0f);
        this.tPj.setLayoutParams(layoutParams11);
        linearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(this.Uc);
        pAGRelativeLayout.addView(this.wBa);
        linearLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.zF);
        pAGLinearLayout.addView(this.WU);
        pAGLinearLayout.addView(this.XN);
        pAGLinearLayout.addView(this.NZ);
        pAGLinearLayout.addView(this.tPj);
        return linearLayout;
    }

    private View EYQ(Context context, int i) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RatioImageView ratioImageView = new RatioImageView(context);
        this.Uc = ratioImageView;
        ratioImageView.setId(tp.oB);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        this.Uc.setScaleType(ImageView.ScaleType.FIT_XY);
        this.Uc.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(tp.VC);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, EYQ(70.0f));
        if (i == 0) {
            layoutParams2.leftMargin = EYQ(20.0f);
        } else if (i == 2) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, EYQ(100.0f));
            layoutParams2.leftMargin = EYQ(25.0f);
        }
        layoutParams2.topMargin = EYQ(60.0f);
        layoutParams2.addRule(1, tp.oB);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.hYh = tTRoundRectImageView;
        tTRoundRectImageView.setId(tp.oIw);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(EYQ(69.0f), EYQ(69.0f));
        if (i == 2) {
            layoutParams3 = new RelativeLayout.LayoutParams(EYQ(80.0f), EYQ(80.0f));
        }
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.hYh.setBackgroundColor(0);
        this.hYh.setLayoutParams(layoutParams3);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        if (i == 2) {
            layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams4.addRule(1, tp.oIw);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        this.zF = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, EYQ(27.0f));
        if (i == 2) {
            layoutParams5 = new LinearLayout.LayoutParams(-2, EYQ(33.0f));
        }
        layoutParams5.leftMargin = EYQ(14.0f);
        this.zF.setEllipsize(TextUtils.TruncateAt.END);
        this.zF.setGravity(16);
        this.zF.setMaxWidth(EYQ(176.0f));
        this.zF.setSingleLine(true);
        this.zF.setTextColor(Color.parseColor("#ffffffff"));
        this.zF.setTextSize(17.0f);
        this.zF.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = EYQ(14.0f);
        layoutParams6.topMargin = EYQ(10.0f);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        this.NZ = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, EYQ(14.0f));
        if (i == 2) {
            layoutParams7 = new LinearLayout.LayoutParams(-2, EYQ(20.0f));
        }
        layoutParams7.gravity = 17;
        this.NZ.setLayoutParams(layoutParams7);
        if (i == 2) {
            this.XN = new PAGTextView(context);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams8.leftMargin = EYQ(10.0f);
            this.XN.setEllipsize(TextUtils.TruncateAt.END);
            this.XN.setMaxWidth(EYQ(170.0f));
            this.XN.setSingleLine(true);
            this.XN.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_comment_num"));
            this.XN.setTextColor(Color.parseColor("#ffffffff"));
            this.XN.setTextSize(15.0f);
            this.XN.setLayoutParams(layoutParams8);
        }
        PAGTextView pAGTextView = new PAGTextView(context);
        this.WU = pAGTextView;
        pAGTextView.setId(tp.KJ);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(3, tp.VC);
        layoutParams9.topMargin = EYQ(30.0f);
        layoutParams9.addRule(1, tp.oB);
        if (i == 0) {
            layoutParams9.leftMargin = EYQ(20.0f);
            this.WU.setGravity(17);
        } else if (i == 2) {
            layoutParams9.leftMargin = EYQ(20.0f);
        }
        this.WU.setTextColor(Color.parseColor("#ffffff"));
        this.WU.setTextSize(17.0f);
        this.WU.setLayoutParams(layoutParams9);
        this.tPj = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, EYQ(40.0f));
        layoutParams10.addRule(3, tp.KJ);
        layoutParams10.addRule(14);
        layoutParams10.addRule(15);
        if (i == 0) {
            layoutParams10.leftMargin = EYQ(40.0f);
            layoutParams10.topMargin = EYQ(80.0f);
            layoutParams10.rightMargin = EYQ(40.0f);
        } else if (i == 2) {
            layoutParams10.leftMargin = EYQ(25.0f);
            layoutParams10.topMargin = EYQ(60.0f);
            layoutParams10.rightMargin = EYQ(25.0f);
        }
        layoutParams10.addRule(1, tp.oB);
        this.tPj.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_reward_video_download_btn_bg"));
        this.tPj.setGravity(17);
        this.tPj.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_video_download_apk"));
        this.tPj.setTextColor(Color.parseColor("#ffffff"));
        this.tPj.setTextSize(15.0f);
        this.tPj.setLayoutParams(layoutParams10);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.wBa = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, EYQ(14.0f));
        layoutParams11.addRule(9);
        layoutParams11.addRule(12);
        layoutParams11.leftMargin = EYQ(16.0f);
        layoutParams11.bottomMargin = EYQ(20.0f);
        this.wBa.setGravity(17);
        this.wBa.setPadding(EYQ(2.0f), 0, 0, 0);
        this.wBa.setLayoutParams(layoutParams11);
        pAGRelativeLayout.addView(this.Uc);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        pAGRelativeLayout2.addView(this.hYh);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.zF);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.NZ);
        if (i == 2) {
            pAGLinearLayout2.addView(this.XN);
        }
        pAGRelativeLayout.addView(this.WU);
        pAGRelativeLayout.addView(this.tPj);
        pAGRelativeLayout.addView(this.wBa);
        return pAGRelativeLayout;
    }

    private View Pm(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(tp.VC);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, EYQ(70.0f));
        layoutParams.topMargin = EYQ(45.0f);
        layoutParams.leftMargin = EYQ(20.0f);
        layoutParams.rightMargin = EYQ(20.0f);
        pAGRelativeLayout2.setLayoutParams(layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.hYh = tTRoundRectImageView;
        tTRoundRectImageView.setId(tp.oIw);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(EYQ(65.0f), EYQ(65.0f));
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        this.hYh.setBackgroundColor(0);
        this.hYh.setLayoutParams(layoutParams2);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(1, tp.oIw);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams3);
        this.zF = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, EYQ(27.0f));
        layoutParams4.leftMargin = EYQ(14.0f);
        this.zF.setEllipsize(TextUtils.TruncateAt.END);
        this.zF.setGravity(16);
        this.zF.setMaxWidth(EYQ(176.0f));
        this.zF.setSingleLine(true);
        this.zF.setTextColor(Color.parseColor("#ffffffff"));
        this.zF.setTextSize(17.0f);
        this.zF.setLayoutParams(layoutParams4);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = EYQ(10.0f);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams5);
        this.NZ = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = EYQ(14.0f);
        layoutParams6.gravity = 17;
        this.NZ.setLayoutParams(layoutParams6);
        this.XN = new PAGTextView(context);
        new LinearLayout.LayoutParams(-2, -2).leftMargin = EYQ(10.0f);
        this.XN.setEllipsize(TextUtils.TruncateAt.END);
        this.XN.setMaxWidth(EYQ(170.0f));
        this.XN.setSingleLine(true);
        this.XN.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_comment_num"));
        this.XN.setTextColor(Color.parseColor("#ffffffff"));
        this.XN.setTextSize(13.0f);
        RatioImageView ratioImageView = new RatioImageView(context);
        this.Uc = ratioImageView;
        ratioImageView.setId(tp.oB);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = EYQ(31.0f);
        layoutParams7.addRule(3, tp.VC);
        this.Uc.setScaleType(ImageView.ScaleType.FIT_XY);
        this.Uc.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.wBa = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, EYQ(14.0f));
        layoutParams8.addRule(8, tp.oB);
        layoutParams8.leftMargin = EYQ(5.0f);
        layoutParams8.bottomMargin = EYQ(5.0f);
        this.wBa.setGravity(17);
        this.wBa.setPadding(EYQ(2.0f), 0, 0, 0);
        this.wBa.setLayoutParams(layoutParams8);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.WU = pAGTextView;
        pAGTextView.setId(tp.KJ);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(3, tp.oB);
        layoutParams9.leftMargin = EYQ(40.0f);
        layoutParams9.topMargin = EYQ(20.0f);
        layoutParams9.rightMargin = EYQ(40.0f);
        this.WU.setGravity(17);
        this.WU.setTextColor(Color.parseColor("#ffffff"));
        this.WU.setTextSize(17.0f);
        this.WU.setLayoutParams(layoutParams9);
        this.tPj = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, EYQ(40.0f));
        layoutParams10.addRule(3, tp.KJ);
        layoutParams10.addRule(13);
        layoutParams10.leftMargin = EYQ(40.0f);
        layoutParams10.topMargin = EYQ(35.0f);
        layoutParams10.rightMargin = EYQ(40.0f);
        this.tPj.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_reward_video_download_btn_bg"));
        this.tPj.setGravity(17);
        this.tPj.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_video_download_apk"));
        this.tPj.setTextColor(Color.parseColor("#ffffff"));
        this.tPj.setTextSize(15.0f);
        this.tPj.setLayoutParams(layoutParams10);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        pAGRelativeLayout2.addView(this.hYh);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.zF);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.NZ);
        pAGLinearLayout2.addView(this.XN);
        pAGRelativeLayout.addView(this.Uc);
        pAGRelativeLayout.addView(this.wBa);
        pAGRelativeLayout.addView(this.WU);
        pAGRelativeLayout.addView(this.tPj);
        return pAGRelativeLayout;
    }

    private View Kbd(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.Uc = new RatioImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.Uc.setScaleType(ImageView.ScaleType.FIT_XY);
        this.Uc.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        this.rfB = pAGRelativeLayout2;
        pAGRelativeLayout2.setId(tp.sOZ);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, EYQ(100.0f));
        layoutParams2.addRule(12);
        layoutParams2.setMargins(EYQ(15.0f), EYQ(15.0f), EYQ(15.0f), EYQ(15.0f));
        this.rfB.setBackgroundColor(Color.parseColor("#E4FFFFFF"));
        this.rfB.setGravity(16);
        this.rfB.setPadding(EYQ(15.0f), 0, 0, 0);
        this.rfB.setLayoutParams(layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.hYh = tTRoundRectImageView;
        tTRoundRectImageView.setId(tp.oIw);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(EYQ(69.0f), EYQ(69.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.hYh.setBackgroundColor(0);
        this.hYh.setLayoutParams(layoutParams3);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(1, tp.oIw);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        this.zF = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, EYQ(27.0f));
        layoutParams5.leftMargin = EYQ(14.0f);
        this.zF.setEllipsize(TextUtils.TruncateAt.END);
        this.zF.setGravity(16);
        this.zF.setMaxWidth(EYQ(153.0f));
        this.zF.setSingleLine(true);
        this.zF.setTextColor(Color.parseColor("#ff000000"));
        this.zF.setTextSize(15.0f);
        this.zF.setLayoutParams(layoutParams5);
        this.WU = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = EYQ(14.0f);
        this.WU.setEllipsize(TextUtils.TruncateAt.END);
        this.WU.setGravity(16);
        this.WU.setMaxWidth(EYQ(153.0f));
        this.WU.setSingleLine(true);
        this.WU.setTextColor(Color.parseColor("#4A4A4A"));
        this.WU.setTextSize(14.0f);
        this.WU.setLayoutParams(layoutParams6);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.tPj = pAGTextView;
        pAGTextView.setId(tp.zzY);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(EYQ(80.0f), EYQ(36.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = EYQ(15.0f);
        this.tPj.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_download_corner_bg"));
        this.tPj.setGravity(17);
        this.tPj.setText(com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_video_download_apk"));
        this.tPj.setTextColor(Color.parseColor("#ffffff"));
        this.tPj.setTextSize(15.0f);
        this.tPj.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.wBa = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, EYQ(14.0f));
        layoutParams8.addRule(2, tp.sOZ);
        layoutParams8.leftMargin = EYQ(16.0f);
        layoutParams8.bottomMargin = EYQ(10.0f);
        this.wBa.setPadding(EYQ(2.0f), 0, 0, 0);
        this.wBa.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(this.Uc);
        pAGRelativeLayout.addView(this.rfB);
        this.rfB.addView(this.hYh);
        this.rfB.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.zF);
        pAGLinearLayout.addView(this.WU);
        this.rfB.addView(this.tPj);
        pAGRelativeLayout.addView(this.wBa);
        return pAGRelativeLayout;
    }

    private int EYQ(float f) {
        return tr.mZx(this.EYQ.TZn, f);
    }
}
