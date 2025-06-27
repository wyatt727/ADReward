package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGLoadingBaseLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingFourLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingOneLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingThreeLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingTwoLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullVideoLoadingManager.java */
/* loaded from: classes2.dex */
public class tsL {
    TTRoundRectImageView EYQ;
    private LinearLayout HX;
    private final Context IPb;
    private AnimatorSet KO;
    private final UB Kbd;
    private TwoSemicirclesView MxO;
    TextView Pm;
    private PAGLoadingBaseLayout QQ;
    PAGProgressBar Td;
    private int VwS = 0;
    private AnimatorSet hu;
    TextView mZx;
    private final int nWX;
    private final String pi;
    private TwoSemicirclesView tp;
    private PAGLogoView tsL;

    public tsL(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.IPb = eyq.VOV;
        this.Kbd = eyq.EYQ;
        this.pi = eyq.VwS;
        this.nWX = eyq.tp;
    }

    public void EYQ() {
        try {
            if (!UB.Kbd(this.Kbd) || zF.MxO(this.Kbd)) {
                return;
            }
            try {
                this.VwS = new JSONObject(this.Kbd.PI().tp()).optInt("loading_page_type", 0);
            } catch (JSONException unused) {
            }
            int i = this.VwS;
            if (i == 1) {
                Kbd();
                return;
            }
            if (i == 2) {
                IPb();
            } else if (i == 3) {
                VwS();
            } else {
                if (i != 4) {
                    return;
                }
                QQ();
            }
        } catch (Throwable unused2) {
        }
    }

    public void mZx() {
        try {
            int i = this.VwS;
            if (i == 1) {
                HX();
                return;
            }
            if (i == 2) {
                tp();
            } else if (i == 3) {
                MxO();
            } else {
                if (i != 4) {
                    return;
                }
                tsL();
            }
        } catch (Throwable unused) {
        }
    }

    private void Kbd() {
        PAGPAGLoadingOneLayout pAGPAGLoadingOneLayout = new PAGPAGLoadingOneLayout(this.IPb);
        this.QQ = pAGPAGLoadingOneLayout;
        this.EYQ = pAGPAGLoadingOneLayout.getLoadingIcon();
        this.mZx = this.QQ.getLoadingAppName();
        this.Td = this.QQ.getLoadingProgressBar();
        this.Pm = this.QQ.getLoadingProgressNumber();
        this.tsL = this.QQ.getLoadingLogo();
        if (this.nWX == 1 && this.Kbd.xh() != null && !TextUtils.isEmpty(this.Kbd.xh().mZx())) {
            this.mZx.setText(this.Kbd.xh().mZx());
        } else if (!TextUtils.isEmpty(this.Kbd.TQF())) {
            this.mZx.setText(this.Kbd.TQF());
        } else {
            this.mZx.setVisibility(8);
        }
        pi();
        this.tsL.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.EYQ(tsL.this.IPb, tsL.this.Kbd, tsL.this.pi);
            }
        });
    }

    private void IPb() {
        PAGPAGLoadingTwoLayout pAGPAGLoadingTwoLayout = new PAGPAGLoadingTwoLayout(this.IPb);
        this.QQ = pAGPAGLoadingTwoLayout;
        this.EYQ = pAGPAGLoadingTwoLayout.getLoadingIcon();
        this.Pm = this.QQ.getLoadingProgressNumber();
        this.tsL = this.QQ.getLoadingLogo();
        pi();
        this.tsL.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.EYQ(tsL.this.IPb, tsL.this.Kbd, tsL.this.pi);
            }
        });
    }

    private void VwS() {
        PAGPAGLoadingThreeLayout pAGPAGLoadingThreeLayout = new PAGPAGLoadingThreeLayout(this.IPb);
        this.QQ = pAGPAGLoadingThreeLayout;
        this.HX = pAGPAGLoadingThreeLayout.getWaveContainer();
        this.Pm = this.QQ.getLoadingProgressNumber();
        PAGLogoView loadingLogo = this.QQ.getLoadingLogo();
        this.tsL = loadingLogo;
        loadingLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.EYQ(tsL.this.IPb, tsL.this.Kbd, tsL.this.pi);
            }
        });
    }

    private void QQ() {
        PAGPAGLoadingFourLayout pAGPAGLoadingFourLayout = new PAGPAGLoadingFourLayout(this.IPb);
        this.QQ = pAGPAGLoadingFourLayout;
        this.tp = pAGPAGLoadingFourLayout.getInnerCircle();
        this.MxO = this.QQ.getOuterCircle();
        this.tp.setRadius(tr.mZx(this.IPb, 80.0f));
        Paint paintTwo = this.tp.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.tp.setPaintTwo(paintTwo);
        this.MxO.setRadius(tr.mZx(this.IPb, 95.0f));
        Paint paintTwo2 = this.MxO.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.MxO.setPaintTwo(paintTwo2);
        this.Pm = this.QQ.getLoadingProgressNumber();
        PAGLogoView loadingLogo = this.QQ.getLoadingLogo();
        this.tsL = loadingLogo;
        loadingLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.EYQ(tsL.this.IPb, tsL.this.Kbd, tsL.this.pi);
            }
        });
    }

    private void HX() {
        nWX();
    }

    private void tp() throws Resources.NotFoundException {
        Context context = this.IPb;
        this.EYQ.setAnimation(AnimationUtils.loadAnimation(context, com.bytedance.sdk.component.utils.zF.tp(context, "tt_loading_two_icon_scale")));
        nWX();
    }

    private void MxO() {
        this.KO = new AnimatorSet();
        LinearLayout linearLayout = this.HX;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder builderPlay = this.KO.play(duration);
            for (int i = 1; i < this.HX.getChildCount(); i++) {
                float f = -9.0f;
                if (i % 2 == 0) {
                    f = 9.0f;
                }
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.HX.getChildAt(i), "translationY", -f, f).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                builderPlay = builderPlay.with(duration2);
            }
            this.KO.start();
        }
        nWX();
    }

    private void tsL() {
        this.KO = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tp, Key.ROTATION, 0.0f, 360.0f).setDuration(1500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.MxO, Key.ROTATION, 0.0f, 360.0f).setDuration(2500L);
        duration2.setRepeatCount(-1);
        this.KO.playTogether(duration, duration2);
        this.KO.start();
        nWX();
    }

    private void pi() {
        if (this.Kbd.vD() != null && !TextUtils.isEmpty(this.Kbd.vD().EYQ())) {
            try {
                com.bytedance.sdk.component.Pm.tp tpVarEYQ = com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(this.Kbd.vD());
                UB ub = this.Kbd;
                tpVarEYQ.EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, ub.vD().EYQ(), new EYQ(this.EYQ)));
                return;
            } catch (Throwable unused) {
            }
        }
        this.EYQ.setVisibility(8);
    }

    private void nWX() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (tsL.this.Td != null) {
                    tsL.this.Td.setProgress(iIntValue);
                }
                tsL.this.Pm.setText(String.valueOf(iIntValue));
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.tsL.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (tsL.this.Td != null) {
                    tsL.this.Td.setProgress(iIntValue);
                }
                tsL.this.Pm.setText(String.valueOf(iIntValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.hu = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.hu.start();
    }

    public void Td() {
        AnimatorSet animatorSet = this.KO;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.hu;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public View Pm() {
        return this.QQ;
    }

    /* compiled from: RewardFullVideoLoadingManager.java */
    private static class EYQ implements hu<Bitmap> {
        private final WeakReference<ImageView> EYQ;

        public EYQ(ImageView imageView) {
            this.EYQ = new WeakReference<>(imageView);
        }

        @Override // com.bytedance.sdk.component.Pm.hu
        public void EYQ(com.bytedance.sdk.component.Pm.MxO<Bitmap> mxO) {
            ImageView imageView = this.EYQ.get();
            if (imageView == null) {
                return;
            }
            if (mxO != null) {
                try {
                    if (mxO.mZx() != null) {
                        imageView.setImageBitmap(mxO.mZx());
                        return;
                    }
                } catch (Throwable unused) {
                    imageView.setVisibility(8);
                    return;
                }
            }
            imageView.setVisibility(8);
        }

        @Override // com.bytedance.sdk.component.Pm.hu
        public void EYQ(int i, String str, Throwable th) {
            ImageView imageView = this.EYQ.get();
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }
}
