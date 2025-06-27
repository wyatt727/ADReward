package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: RewardFullVideoLayout.java */
/* loaded from: classes2.dex */
public class Kbd {
    PAGLogoView HX;
    FrameLayout IPb;
    public KO KO;
    RelativeLayout Kbd;
    RelativeLayout MxO;
    private RFDownloadBarLayout NZ;
    ImageView Pm;
    View QQ;
    final UB Td;
    private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ Uc;
    View VwS;
    private int WU;
    private boolean XN;
    private final boolean hYh;
    PAGProgressBar hu;
    final Activity mZx;
    ImageView tp;
    tsL tsL;
    private final String zF;
    int EYQ = 3;
    protected int pi = 0;
    protected final AtomicBoolean nWX = new AtomicBoolean(false);
    Runnable UB = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Kbd.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                if ((Kbd.this.Td == null || !Kbd.this.Td.HG()) && Kbd.this.Kbd != null) {
                    int[] iArr = new int[2];
                    Kbd.this.Kbd.getLocationOnScreen(iArr);
                    Kbd.this.Uc.KR.mZx(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    protected boolean EYQ() {
        return true;
    }

    public Kbd(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.Uc = eyq;
        this.mZx = eyq.TZn;
        this.Td = eyq.EYQ;
        this.zF = eyq.VwS;
        this.hYh = eyq.IPb;
    }

    public void mZx() {
        if (this.XN) {
            return;
        }
        this.XN = true;
        this.WU = this.Uc.tp;
        if (EYQ()) {
            tsL tsl = new tsL(this.Uc);
            this.tsL = tsl;
            tsl.EYQ();
        }
        Uc();
        KO ko = new KO(this.mZx, this.Td, this.zF, this.IPb);
        this.KO = ko;
        ko.EYQ();
    }

    private void Uc() {
        RelativeLayout relativeLayout;
        RFDownloadBarLayout rFDownloadBarLayout = (RFDownloadBarLayout) this.mZx.findViewById(tp.tsL);
        this.NZ = rFDownloadBarLayout;
        rFDownloadBarLayout.EYQ(this.Uc);
        this.HX = (PAGLogoView) this.mZx.findViewById(520093757);
        this.tp = (ImageView) this.mZx.findViewById(tp.baW);
        this.Pm = (ImageView) this.mZx.findViewById(520093706);
        this.Kbd = (RelativeLayout) this.mZx.findViewById(520093708);
        this.IPb = (FrameLayout) this.mZx.findViewById(tp.MxO);
        this.VwS = this.mZx.findViewById(tp.UB);
        this.QQ = this.mZx.findViewById(tp.dub);
        this.MxO = (RelativeLayout) this.mZx.findViewById(tp.jv);
        tsL tsl = this.tsL;
        if (tsl == null || tsl.Pm() == null || (relativeLayout = this.MxO) == null) {
            return;
        }
        relativeLayout.addView(this.tsL.Pm(), new LinearLayout.LayoutParams(-1, -1));
        this.tsL.mZx();
    }

    public void Td() {
        this.IPb.removeAllViews();
    }

    public void EYQ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.HX.getLayoutParams();
        marginLayoutParams.setMargins(16, 0, 0, i);
        this.HX.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.tp.getLayoutParams();
        marginLayoutParams2.setMargins(0, 0, 7, i);
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams2.setMarginStart(0);
            marginLayoutParams2.setMarginEnd(7);
        }
        this.tp.setLayoutParams(marginLayoutParams2);
    }

    public void EYQ(boolean z) {
        int i = 8;
        tr.EYQ((View) this.HX, zF.MxO(this.Td) ? 8 : 0);
        ImageView imageView = this.tp;
        if (this.Td.oIw() && this.Td.VwS()) {
            i = 0;
        }
        tr.EYQ((View) imageView, i);
        mZx(z);
        if (this.hYh) {
            Kbd();
        }
    }

    public void mZx(int i) throws Resources.NotFoundException {
        if (this.hu == null) {
            this.hu = new PAGProgressBar(this.Uc.TZn);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.hu.setLayoutParams(layoutParams);
            this.hu.setIndeterminateDrawable(this.Uc.TZn.getResources().getDrawable(com.bytedance.sdk.component.utils.zF.Pm(this.Uc.TZn, "tt_video_loading_progress_bar")));
            this.Uc.TQF.IPb().addView(this.hu);
        }
        this.hu.setVisibility(i);
    }

    public void EYQ(int i, int i2) {
        FrameLayout frameLayout;
        if (this.Td.lEs() == 1 && (frameLayout = this.IPb) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iTd = tr.Td((Context) this.mZx);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.IPb.getLayoutParams();
            layoutParams.width = iTd;
            int i3 = (iTd * 9) / 16;
            layoutParams.height = i3;
            this.IPb.setLayoutParams(layoutParams);
            this.pi = (tr.Pm((Context) this.mZx) - i3) / 2;
            pi.EYQ("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.pi);
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.Td td, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        UB ub;
        if (this.IPb != null && (ub = this.Td) != null && ub.xt() != null) {
            if (this.Td.xt().IPb && !KO.mZx(this.Td)) {
                EYQ((View.OnClickListener) td);
                EYQ(td);
            } else {
                EYQ(onClickListener);
            }
        }
        UB ub2 = this.Td;
        if (ub2 != null && ub2.lEs() == 1) {
            if (this.Td.xt() != null && (view2 = this.VwS) != null) {
                tr.EYQ(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.VwS.getLayoutParams();
                layoutParams.height = this.pi;
                this.VwS.setLayoutParams(layoutParams);
                if (this.Td.xt().mZx) {
                    this.VwS.setOnClickListener(td);
                    this.VwS.setOnTouchListener(onTouchListener);
                } else {
                    this.VwS.setOnClickListener(onClickListener);
                }
            }
            if (this.Td.xt() != null && (view = this.QQ) != null) {
                tr.EYQ(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.QQ.getLayoutParams();
                layoutParams2.height = this.pi;
                this.QQ.setLayoutParams(layoutParams2);
                if (this.Td.xt().Pm) {
                    this.QQ.setOnClickListener(td);
                    this.QQ.setOnTouchListener(onTouchListener);
                } else {
                    this.QQ.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.HX;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Kbd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        TTWebsiteActivity.EYQ(Kbd.this.mZx, Kbd.this.Td, Kbd.this.zF);
                    } catch (Throwable th) {
                        pi.EYQ("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.tp;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ((int) tr.EYQ(hu.EYQ(), 14.0f, true), this.tp, this.Uc.EYQ);
        }
    }

    public void Pm() {
        tr.EYQ((View) this.IPb, 8);
        tr.EYQ(this.VwS, 8);
        tr.EYQ(this.QQ, 8);
        Td(8);
        tr.EYQ((View) this.Pm, 8);
        tr.EYQ((View) this.Kbd, 8);
        tr.EYQ((View) this.HX, 8);
        tr.EYQ((View) this.MxO, 8);
        tr.EYQ((View) this.tp, 8);
    }

    void Kbd() {
        int iFH = this.Td.FH();
        this.EYQ = iFH;
        if (iFH == -200) {
            this.EYQ = hu.Pm().nWX(String.valueOf(this.Td.yK()));
        }
        if (this.EYQ != -1 || EYQ() || (this.Uc.xh instanceof com.bytedance.sdk.openadsdk.component.reward.mZx.Td)) {
            return;
        }
        Td(0);
    }

    void mZx(boolean z) {
        RelativeLayout relativeLayout;
        if (this.WU != 1 && (relativeLayout = this.Kbd) != null && z) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int iEYQ = EYQ("status_bar_height");
                int iEYQ2 = EYQ("navigation_bar_height");
                if (iEYQ > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (iEYQ > marginLayoutParams.topMargin) {
                        marginLayoutParams.topMargin = iEYQ;
                        this.Uc.KR.EYQ(iEYQ);
                    }
                }
                if (iEYQ2 > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (iEYQ2 > marginLayoutParams2.rightMargin) {
                        marginLayoutParams2.rightMargin = iEYQ2;
                    }
                }
            }
        }
        if (this.Uc.xh instanceof com.bytedance.sdk.openadsdk.component.reward.mZx.Td) {
            return;
        }
        Td(0);
    }

    private int EYQ(String str) {
        Resources resources = this.mZx.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void Td(int i) {
        UB ub = this.Td;
        if (ub != null && ub.oIw() && com.bytedance.sdk.openadsdk.core.model.tsL.EYQ(this.Td)) {
            tr.EYQ((View) this.NZ, 8);
        } else {
            tr.EYQ((View) this.NZ, i);
        }
    }

    public FrameLayout IPb() {
        return this.IPb;
    }

    public void Pm(int i) {
        tr.EYQ((View) this.HX, i);
    }

    public void VwS() {
        if (this.tp.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tp.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            if (Build.VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(11);
            }
            this.tp.setLayoutParams(marginLayoutParams);
        }
    }

    public void Kbd(int i) {
        int i2 = this.EYQ;
        if (i2 == -1 || i != i2 || this.nWX.get()) {
            return;
        }
        Td(0);
        this.nWX.set(true);
        QQ();
    }

    protected void QQ() {
        RFDownloadBarLayout rFDownloadBarLayout = this.NZ;
        if (rFDownloadBarLayout == null) {
            return;
        }
        rFDownloadBarLayout.EYQ();
    }

    public void IPb(int i) {
        RelativeLayout relativeLayout;
        tr.EYQ((View) this.Pm, i);
        tr.EYQ((View) this.Kbd, i);
        if (!com.bytedance.sdk.component.adexpress.Pm.mZx.EYQ(this.Uc.VOV) && (relativeLayout = this.Kbd) != null) {
            relativeLayout.post(this.UB);
        }
        if (i == 0 && !this.Uc.WU.get() && zF.mZx(this.Uc.EYQ)) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.Uc.EYQ, this.Uc.VwS, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.Uc.Uc);
        }
    }

    public boolean HX() {
        ImageView imageView = this.Pm;
        return imageView != null && this.Kbd != null && imageView.getVisibility() == 0 && this.Kbd.getVisibility() == 0;
    }

    public void EYQ(View.OnClickListener onClickListener) {
        tr.EYQ(this.IPb, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void EYQ(com.bytedance.sdk.openadsdk.core.mZx.Td td) {
        tr.EYQ((View) this.IPb, (View.OnTouchListener) td, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public View tp() {
        return this.Kbd;
    }

    public View MxO() {
        return this.NZ;
    }

    public void EYQ(float f) {
        tr.EYQ(this.Pm, f);
        tr.EYQ(this.Kbd, f);
    }

    public void EYQ(Animation animation) {
        RelativeLayout relativeLayout = this.MxO;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void tsL() {
        try {
            tsL tsl = this.tsL;
            if (tsl != null) {
                tsl.Td();
            }
            RelativeLayout relativeLayout = this.MxO;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.MxO;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void pi() {
        try {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.Uc.TZn, com.bytedance.sdk.component.utils.zF.tp(this.Uc.TZn, "tt_fade_out"));
            if (animationLoadAnimation != null) {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Kbd.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        Kbd.this.Uc.TQF.tsL();
                    }
                });
                this.Uc.TQF.EYQ(animationLoadAnimation);
            } else {
                this.Uc.TQF.tsL();
            }
        } catch (Throwable unused) {
            this.Uc.TQF.tsL();
        }
    }

    public void nWX() {
        KO ko = this.KO;
        if (ko != null) {
            ko.Kbd();
        }
        RelativeLayout relativeLayout = this.Kbd;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.UB);
        }
    }

    public void KO() {
        KO ko = this.KO;
        if (ko != null) {
            ko.IPb();
        }
    }

    public void hu() {
        KO ko = this.KO;
        if (ko != null) {
            ko.VwS();
        }
    }

    public void UB() {
        this.Uc.Pf.Kbd().onClick(this.NZ);
    }
}
