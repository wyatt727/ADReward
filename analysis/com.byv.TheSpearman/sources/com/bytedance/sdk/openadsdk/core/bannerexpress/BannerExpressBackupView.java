package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.IPb;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.pi;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class BannerExpressBackupView extends BackupView {
    public static pi[] EYQ = {new pi(1, 6.4f, 320, 50), new pi(4, 1.2f, Strategy.TTL_SECONDS_DEFAULT, 250)};
    private static final AtomicInteger pi = new AtomicInteger(1);
    private NativeExpressView KO;
    private PAGBannerAdWrapperListener UB;
    private String hu;
    private EYQ nWX;

    public void setClosedListenerKey(String str) {
        this.hu = str;
    }

    public BannerExpressBackupView(Context context) {
        super(context);
        this.mZx = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void EYQ(View view, int i, com.bytedance.sdk.openadsdk.core.model.pi piVar) {
        EYQ eyq;
        if (this.KO != null) {
            if ((i == 1 || i == 2) && (eyq = this.nWX) != null) {
                ImageView imageView = eyq.tp;
                if (i == 1) {
                    this.KO.getClickListener().mZx(imageView);
                } else {
                    this.KO.getClickCreativeListener().mZx(imageView);
                }
            }
            this.KO.EYQ(view, i, piVar);
        }
    }

    void EYQ(UB ub, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.EYQ.Td td) {
        setBackgroundColor(-1);
        this.Td = ub;
        this.KO = nativeExpressView;
        this.IPb = "banner_ad";
        this.KO.addView(this, new ViewGroup.LayoutParams(-2, -2));
        mZx();
    }

    private void mZx() {
        pi piVarEYQ = EYQ(this.KO.getExpectExpressWidth(), this.KO.getExpectExpressHeight());
        if (this.KO.getExpectExpressWidth() > 0 && this.KO.getExpectExpressHeight() > 0) {
            this.VwS = tr.mZx(this.mZx, this.KO.getExpectExpressWidth());
            this.QQ = tr.mZx(this.mZx, this.KO.getExpectExpressHeight());
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
        if (piVarEYQ.EYQ == 1) {
            Td();
        } else {
            Pm();
        }
    }

    private void EYQ(ImageView imageView) {
        com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.Td.Dal().get(0), imageView, this.Td);
    }

    private void Td() {
        float fMZx = (this.QQ * 1.0f) / tr.mZx(this.mZx, 50.0f);
        if ((this.QQ * 1.0f) / this.VwS > 0.21875f) {
            fMZx = (this.VwS * 1.0f) / tr.mZx(this.mZx, 320.0f);
        }
        EYQ eyqKbd = Kbd();
        this.nWX = eyqKbd;
        ImageView imageView = eyqKbd.tp;
        ImageView imageView2 = this.nWX.Pm;
        TextView textView = this.nWX.Kbd;
        TextView textView2 = this.nWX.IPb;
        TTRatingBar2 tTRatingBar2 = this.nWX.VwS;
        TextView textView3 = this.nWX.HX;
        textView.setTextSize(2, tr.EYQ(this.mZx, textView.getTextSize()) * fMZx);
        textView2.setTextSize(2, tr.EYQ(this.mZx, textView2.getTextSize()) * fMZx);
        textView3.setTextSize(2, tr.EYQ(this.mZx, textView3.getTextSize()) * fMZx);
        View view = this.nWX.QQ;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.EYQ(BannerExpressBackupView.this.mZx, BannerExpressBackupView.this.Td, BannerExpressBackupView.this.IPb);
                }
            });
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BannerExpressBackupView.this.EYQ();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (tr.mZx(this.mZx, 45.0f) * fMZx);
            layoutParams.height = (int) (tr.mZx(this.mZx, 45.0f) * fMZx);
        }
        if (this.Td.vD() != null && !TextUtils.isEmpty(this.Td.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.Td.vD().EYQ(), this.Td.vD().mZx(), this.Td.vD().Td(), imageView2, this.Td);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.Td.TZn())) {
            textView3.setText(this.Td.TZn());
        } else {
            textView3.setVisibility(8);
        }
        tr.EYQ(textView2, tTRatingBar2, this.Td);
        EYQ((View) imageView2, true);
        imageView2.setTag(520093762, Boolean.TRUE);
        EYQ((View) this, true);
        EYQ((View) textView3, true);
    }

    private void Pm() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        if (this.Td != null) {
            int iBy = this.Td.by();
            float fMZx = (this.QQ * 1.0f) / tr.mZx(this.mZx, 250.0f);
            if (this.Td.mN() == null) {
                EYQ eyqIPb = IPb();
                this.nWX = eyqIPb;
                ImageView imageView = eyqIPb.tp;
                RatioImageView ratioImageView = this.nWX.EYQ;
                ImageView imageView2 = this.nWX.Pm;
                TextView textView5 = this.nWX.Kbd;
                TextView textView6 = this.nWX.mZx;
                TextView textView7 = this.nWX.Td;
                TextView textView8 = this.nWX.HX;
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (tr.mZx(this.mZx, 45.0f) * fMZx);
                    layoutParams.height = (int) (tr.mZx(this.mZx, 45.0f) * fMZx);
                }
                textView5.setTextSize(2, tr.EYQ(this.mZx, textView5.getTextSize()) * fMZx);
                textView6.setTextSize(2, tr.EYQ(this.mZx, textView6.getTextSize()) * fMZx);
                textView7.setTextSize(2, tr.EYQ(this.mZx, textView7.getTextSize()) * fMZx);
                textView8.setTextSize(2, tr.EYQ(this.mZx, textView8.getTextSize()) * fMZx);
                try {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView5.getLayoutParams();
                    float f = fMZx - 1.0f;
                    if (f > 0.0f) {
                        layoutParams2.topMargin = tr.mZx(this.mZx, f * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView8.getLayoutParams()).setMargins(0, (int) (tr.mZx(this.mZx, 16.0f) * fMZx), 0, 0);
                } catch (Throwable unused) {
                }
                View view = this.nWX.QQ;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.EYQ(BannerExpressBackupView.this.mZx, BannerExpressBackupView.this.Td, BannerExpressBackupView.this.IPb);
                        }
                    });
                }
                if (iBy == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    if (ratioImageView.getParent() instanceof FrameLayout) {
                        ((LinearLayout.LayoutParams) ((FrameLayout) ratioImageView.getParent()).getLayoutParams()).weight = 2.5f;
                    }
                    ratioImageView.setRatio(1.91f);
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        BannerExpressBackupView.this.EYQ();
                    }
                });
                int iMZx = tr.mZx(this.mZx, 15.0f);
                tr.EYQ(imageView, iMZx, iMZx, iMZx, iMZx);
                EYQ((ImageView) ratioImageView);
                if (this.Td.vD() == null || TextUtils.isEmpty(this.Td.vD().EYQ())) {
                    textView = textView8;
                    textView2 = textView7;
                    textView3 = textView6;
                    textView4 = textView5;
                } else {
                    textView = textView8;
                    textView2 = textView7;
                    textView3 = textView6;
                    textView4 = textView5;
                    com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.Td.vD().EYQ(), this.Td.vD().mZx(), this.Td.vD().Td(), imageView2, this.Td);
                }
                textView2.setText(getNameOrSource());
                textView4.setText(getNameOrSource());
                textView3.setText(getDescription());
                if (!TextUtils.isEmpty(this.Td.TZn())) {
                    textView.setText(this.Td.TZn());
                } else {
                    textView.setVisibility(8);
                }
                EYQ((View) ratioImageView, true);
                ratioImageView.setTag(520093762, Boolean.TRUE);
                EYQ((View) this, true);
                EYQ((View) textView, true);
                return;
            }
            EYQ eyqVwS = VwS();
            this.nWX = eyqVwS;
            ImageView imageView3 = eyqVwS.tp;
            TextView textView9 = this.nWX.Kbd;
            TextView textView10 = this.nWX.mZx;
            TextView textView11 = this.nWX.HX;
            RatioFrameLayout ratioFrameLayout = this.nWX.MxO;
            textView9.setTextSize(2, tr.EYQ(this.mZx, textView9.getTextSize()) * fMZx);
            textView10.setTextSize(2, tr.EYQ(this.mZx, textView10.getTextSize()) * fMZx);
            textView11.setTextSize(2, tr.EYQ(this.mZx, textView11.getTextSize()) * fMZx);
            View view2 = this.nWX.QQ;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.EYQ(BannerExpressBackupView.this.mZx, BannerExpressBackupView.this.Td, BannerExpressBackupView.this.IPb);
                    }
                });
            }
            if (iBy == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (iBy == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            NativeVideoTsView videoView = getVideoView();
            if (videoView != null) {
                NativeExpressView nativeExpressView = this.KO;
                if (nativeExpressView instanceof NativeExpressVideoView) {
                    videoView.setVideoAdInteractionListener((NativeExpressVideoView) nativeExpressView);
                }
                ratioFrameLayout.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new NativeVideoTsView.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.6
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.EYQ
                    public void EYQ(View view3, int i) {
                        if (BannerExpressBackupView.this.UB != null) {
                            BannerExpressBackupView.this.UB.onAdClicked();
                        }
                    }
                });
                IPb clickCreativeListener = this.KO.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.EYQ(videoView.getNativeVideoController());
                }
            }
            textView9.setText(getNameOrSource());
            textView10.setText(getDescription());
            if (!TextUtils.isEmpty(this.Td.TZn())) {
                textView11.setText(this.Td.TZn());
            } else {
                textView11.setVisibility(8);
            }
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    BannerExpressBackupView.this.EYQ();
                }
            });
            int iMZx2 = tr.mZx(this.mZx, 15.0f);
            tr.EYQ(imageView3, iMZx2, iMZx2, iMZx2, iMZx2);
            EYQ((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            EYQ((View) this, true);
            EYQ((View) textView11, true);
            EYQ(ratioFrameLayout);
        }
    }

    public static pi EYQ(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? EYQ[1] : EYQ[0];
        } catch (Throwable unused) {
            return EYQ[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void EYQ() {
        if (this.Kbd != null) {
            this.Kbd.show();
        } else if (this.Pm != null) {
            this.Pm.EYQ();
        } else {
            TTDelegateActivity.EYQ(this.Td, this.hu);
        }
    }

    private EYQ Kbd() {
        int iMZx = tr.mZx(this.mZx, 45.0f);
        int iMZx2 = tr.mZx(this.mZx, 25.0f);
        int i = (int) (iMZx2 / 5.0d);
        int iMZx3 = tr.mZx(this.mZx, 10.0f);
        int iMZx4 = tr.mZx(this.mZx, 2.0f);
        int iMZx5 = tr.mZx(this.mZx, 3.0f);
        tr.mZx(this.mZx, 11.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.mZx);
        addView(relativeLayout, -1, -1);
        ImageView imageView = new ImageView(this.mZx);
        imageView.setId(520093738);
        TextView textView = new TextView(this.mZx);
        textView.setId(520093730);
        TextView textView2 = new TextView(this.mZx);
        textView2.setId(520093731);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(this.mZx, null);
        tTRatingBar2.setId(520093735);
        View pAGLogoView = new PAGLogoView(this.mZx);
        pAGLogoView.setId(520093739);
        TextView textView3 = new TextView(this.mZx);
        textView3.setId(520093703);
        ImageView imageView2 = new ImageView(this.mZx);
        imageView2.setId(520093697);
        EYQ eyq = new EYQ(imageView, textView, textView2, tTRatingBar2, pAGLogoView, textView3, imageView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMZx, iMZx);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(20);
        }
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundColor(zF.QQ(this.mZx, "tt_white"));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(imageView);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, iMZx2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(iMZx3);
            layoutParams2.addRule(16, textView3.getId());
            layoutParams2.addRule(17, imageView.getId());
            textView.setTextDirection(5);
        }
        layoutParams2.leftMargin = iMZx3;
        layoutParams2.addRule(0, textView3.getId());
        layoutParams2.addRule(1, imageView.getId());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iMZx2);
        layoutParams3.addRule(3, textView.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(iMZx3);
            layoutParams3.addRule(17, imageView.getId());
        }
        layoutParams3.leftMargin = iMZx3;
        layoutParams3.topMargin = iMZx4;
        layoutParams3.addRule(1, imageView.getId());
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setTextColor(Color.parseColor("#FF333333"));
        textView2.setTextSize(12.0f);
        textView2.setTypeface(Typeface.defaultFromStyle(1));
        textView2.setLayoutParams(layoutParams3);
        relativeLayout.addView(textView2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iMZx4;
        layoutParams4.addRule(3, textView.getId());
        layoutParams4.addRule(6, textView2.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart(iMZx4);
            layoutParams4.addRule(17, textView2.getId());
            layoutParams4.addRule(16, textView3.getId());
        }
        layoutParams4.leftMargin = iMZx4;
        layoutParams4.addRule(1, textView2.getId());
        layoutParams4.addRule(0, textView3.getId());
        tTRatingBar2.setLayoutParams(layoutParams4);
        relativeLayout.addView(tTRatingBar2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iMZx5);
        }
        layoutParams5.addRule(11);
        layoutParams5.addRule(12);
        layoutParams5.topMargin = iMZx5;
        layoutParams5.rightMargin = iMZx5;
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginEnd(iMZx2);
            layoutParams6.addRule(21);
        }
        layoutParams6.rightMargin = iMZx2;
        textView3.setBackgroundResource(zF.Pm(this.mZx, "tt_backup_btn_1"));
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setPadding(iMZx3, i, iMZx3, i);
        textView3.setText(zF.EYQ(this.mZx, "tt_video_download_apk"));
        textView3.setTextColor(Color.parseColor("#f0f0f0"));
        textView3.setTextSize(10.0f);
        textView3.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView3);
        int i2 = iMZx5 * 5;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(i2, i2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams7.addRule(21);
            layoutParams7.setMarginEnd(iMZx5);
        }
        layoutParams7.addRule(11);
        layoutParams7.topMargin = iMZx5;
        layoutParams7.rightMargin = iMZx5;
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setImageResource(zF.Pm(this.mZx, "tt_dislike_icon"));
        imageView2.setLayoutParams(layoutParams7);
        relativeLayout.addView(imageView2);
        return eyq;
    }

    private EYQ IPb() {
        int i;
        float fMZx = tr.mZx(this.mZx, 5.0f);
        float fMZx2 = tr.mZx(this.mZx, 7.0f);
        float fMZx3 = tr.mZx(this.mZx, 8.0f);
        float fMZx4 = tr.mZx(this.mZx, 18.0f);
        float fMZx5 = tr.mZx(this.mZx, 15.0f);
        float fMZx6 = tr.mZx(this.mZx, 45.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.mZx);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i2 = (int) fMZx3;
        relativeLayout.setPadding(i2, i2, i2, i2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        TextView textView = new TextView(this.mZx);
        textView.setId(520093730);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -1;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) fMZx4);
            textView.setTextDirection(5);
        }
        int i3 = (int) fMZx4;
        layoutParams2.rightMargin = i3;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(GravityCompat.START);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        TextView textView2 = new TextView(this.mZx);
        textView2.setId(520093733);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -1;
        layoutParams3.addRule(3, textView.getId());
        layoutParams3.topMargin = (int) (fMZx3 / 2.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd(i3);
            textView2.setTextDirection(5);
        }
        layoutParams3.rightMargin = i3;
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(GravityCompat.START);
        textView2.setMaxLines(2);
        textView2.setTextColor(Color.parseColor("#FFAEAEAE"));
        textView2.setTextSize(12.0f);
        textView2.setLayoutParams(layoutParams3);
        relativeLayout.addView(textView2);
        ImageView imageView = new ImageView(this.mZx);
        imageView.setId(520093697);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int i4 = (int) fMZx5;
        layoutParams4.width = i4;
        layoutParams4.height = i4;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(21);
        }
        layoutParams4.addRule(11);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(zF.Pm(this.mZx, "tt_titlebar_close_press_for_dark"));
        imageView.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView);
        LinearLayout linearLayout = new LinearLayout(this.mZx);
        if (Build.VERSION.SDK_INT >= 17) {
            i = 3;
            linearLayout.setLayoutDirection(3);
        } else {
            i = 3;
        }
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(i, textView2.getId());
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        relativeLayout.addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(this.mZx);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -1);
        layoutParams6.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams6);
        linearLayout.addView(frameLayout);
        RatioImageView ratioImageView = new RatioImageView(this.mZx);
        ratioImageView.setId(520093736);
        ratioImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        frameLayout.addView(ratioImageView, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this.mZx);
        linearLayout2.setId(520093737);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1);
        layoutParams7.weight = 1.0f;
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams7);
        linearLayout.addView(linearLayout2);
        ImageView imageView2 = new ImageView(this.mZx);
        imageView2.setId(520093738);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        int i5 = (int) fMZx6;
        layoutParams8.width = i5;
        layoutParams8.height = i5;
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setLayoutParams(layoutParams8);
        linearLayout2.addView(imageView2);
        TextView textView3 = new TextView(this.mZx);
        textView3.setId(520093730);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.topMargin = (int) fMZx2;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView3.setTextSize(12.0f);
        textView3.setLayoutParams(layoutParams9);
        linearLayout2.addView(textView3);
        TextView textView4 = new TextView(this.mZx);
        textView4.setId(520093703);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams10.topMargin = (int) (fMZx3 * 2.0f);
        textView4.setBackgroundResource(zF.Pm(this.mZx, "tt_backup_btn_1"));
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setMaxLines(1);
        int i6 = (int) (2.0f * fMZx);
        int i7 = (int) fMZx;
        textView4.setPadding(i6, i7, i6, i7);
        textView4.setText(zF.EYQ(this.mZx, "tt_video_download_apk"));
        textView4.setTextColor(zF.QQ(this.mZx, "tt_white"));
        textView4.setTextSize(10.0f);
        textView4.setLayoutParams(layoutParams10);
        linearLayout2.addView(textView4);
        View pAGLogoView = new PAGLogoView(this.mZx);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams11);
        relativeLayout.addView(pAGLogoView);
        return new EYQ(imageView2, textView, pAGLogoView, textView4, imageView, textView3, textView2, ratioImageView);
    }

    private EYQ VwS() {
        float fMZx = tr.mZx(this.mZx, 4.0f);
        float fMZx2 = tr.mZx(this.mZx, 5.0f);
        float fMZx3 = tr.mZx(this.mZx, 8.0f);
        float fMZx4 = tr.mZx(this.mZx, 15.0f);
        float fMZx5 = tr.mZx(this.mZx, 18.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.mZx);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i = (int) fMZx3;
        relativeLayout.setPadding(i, i, i, i);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        TextView textView = new TextView(this.mZx);
        textView.setId(520093730);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.width = -1;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) fMZx5);
            textView.setTextDirection(5);
        }
        layoutParams2.rightMargin = (int) fMZx5;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(GravityCompat.START);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        ImageView imageView = new ImageView(this.mZx);
        imageView.setId(520093697);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        int i2 = (int) fMZx4;
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.addRule(21);
        }
        layoutParams3.addRule(11);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(zF.Pm(this.mZx, "tt_titlebar_close_press_for_dark"));
        imageView.setLayoutParams(layoutParams3);
        relativeLayout.addView(imageView);
        TextView textView2 = new TextView(this.mZx);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        textView2.setId(520093703);
        layoutParams4.addRule(11);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(21);
        }
        layoutParams4.addRule(12);
        layoutParams4.topMargin = i;
        textView2.setBackgroundResource(zF.Pm(this.mZx, "tt_backup_btn_1"));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        int i3 = (int) (2.0f * fMZx2);
        int i4 = (int) fMZx2;
        textView2.setPadding(i3, i4, i3, i4);
        textView2.setText(zF.EYQ(this.mZx, "tt_video_download_apk"));
        textView2.setTextColor(zF.QQ(this.mZx, "tt_white"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(textView2);
        TextView textView3 = new TextView(this.mZx);
        textView3.setId(520093733);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(4, textView2.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.addRule(20);
            layoutParams5.addRule(16, textView2.getId());
            textView3.setTextDirection(5);
        }
        layoutParams5.addRule(12);
        layoutParams5.rightMargin = (int) fMZx;
        layoutParams5.addRule(0, textView2.getId());
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(GravityCompat.START);
        textView3.setMaxLines(1);
        textView3.setTextColor(Color.parseColor("#FFAEAEAE"));
        textView3.setTextSize(12.0f);
        textView3.setLayoutParams(layoutParams5);
        relativeLayout.addView(textView3);
        FrameLayout frameLayout = new FrameLayout(this.mZx);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(2, textView2.getId());
        layoutParams6.addRule(3, textView.getId());
        layoutParams6.topMargin = i;
        frameLayout.setLayoutParams(layoutParams6);
        relativeLayout.addView(frameLayout);
        RatioFrameLayout ratioFrameLayout = new RatioFrameLayout(this.mZx);
        ratioFrameLayout.setId(520093736);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams7.gravity = 17;
        ratioFrameLayout.setLayoutParams(layoutParams7);
        frameLayout.addView(ratioFrameLayout);
        View pAGLogoView = new PAGLogoView(this.mZx);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, textView2.getId());
        pAGLogoView.setLayoutParams(layoutParams8);
        relativeLayout.addView(pAGLogoView);
        return new EYQ(textView, pAGLogoView, textView2, imageView, textView3, ratioFrameLayout);
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.UB = pAGBannerAdWrapperListener;
    }

    private static class EYQ {
        public RatioImageView EYQ;
        TextView HX;
        TextView IPb;
        TextView Kbd;
        private RatioFrameLayout MxO;
        ImageView Pm;
        View QQ;
        public TextView Td;
        TTRatingBar2 VwS;
        public TextView mZx;
        ImageView tp;

        EYQ(ImageView imageView, TextView textView, TextView textView2, TTRatingBar2 tTRatingBar2, View view, TextView textView3, ImageView imageView2) {
            this.Pm = imageView;
            this.Kbd = textView;
            this.IPb = textView2;
            this.VwS = tTRatingBar2;
            this.QQ = view;
            this.HX = textView3;
            this.tp = imageView2;
        }

        EYQ(ImageView imageView, TextView textView, View view, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, RatioImageView ratioImageView) {
            this(imageView, textView, null, null, view, textView2, imageView2);
            this.Td = textView3;
            this.mZx = textView4;
            this.EYQ = ratioImageView;
        }

        EYQ(TextView textView, View view, TextView textView2, ImageView imageView, TextView textView3, RatioFrameLayout ratioFrameLayout) {
            this(null, textView, null, null, view, textView2, imageView);
            this.mZx = textView3;
            this.MxO = ratioFrameLayout;
        }
    }
}
