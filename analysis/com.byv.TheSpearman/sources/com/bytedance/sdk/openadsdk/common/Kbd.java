package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.hu;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.Locale;

/* compiled from: LandingPageLoadingFirstStyle.java */
/* loaded from: classes2.dex */
public class Kbd extends IPb {
    AnimatorSet EYQ;
    private TextView HX;
    private TextView MxO;
    private TextView QQ;
    private int pi;
    private PAGProgressBar tp;
    private FrameLayout tsL;

    public Kbd(Context context, String str, String[] strArr, nWX nwx, hu huVar) {
        super(context, str, strArr, nwx, huVar);
        this.pi = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    protected void EYQ() {
        if (this.IPb == null) {
            return;
        }
        this.Kbd = IPb();
        if (this.Pm != null && this.Pm.length > 0) {
            TextView textView = this.HX;
            if (textView != null) {
                textView.setText(this.Pm[0]);
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.tsL;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    private View IPb() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.IPb);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        int iMZx = tr.mZx(this.IPb, 68.0f);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.IPb);
        pAGLinearLayout.addView(tTRoundRectImageView, new LinearLayout.LayoutParams(iMZx, iMZx));
        PAGTextView pAGTextView = new PAGTextView(this.IPb);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tr.mZx(this.IPb, 170.0f), -2);
        layoutParams2.topMargin = tr.mZx(this.IPb, 8.0f);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(17);
        pAGTextView.setMaxWidth(tr.mZx(this.IPb, 150.0f));
        pAGTextView.setMaxLines(2);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(18.0f);
        pAGLinearLayout.addView(pAGTextView, layoutParams2);
        this.tsL = new PAGFrameLayout(this.IPb);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.width = tr.mZx(this.IPb, 244.0f);
        layoutParams3.height = tr.mZx(this.IPb, 24.0f);
        layoutParams3.topMargin = tr.mZx(this.IPb, 16.0f);
        pAGLinearLayout.addView(this.tsL, layoutParams3);
        this.QQ = new PAGTextView(this.IPb);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
        this.QQ.setEllipsize(TextUtils.TruncateAt.END);
        this.QQ.setVisibility(4);
        layoutParams4.gravity = 17;
        Drawable drawableEYQ = com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this.IPb, "tt_landingpage_loading_text_rect");
        this.QQ.setBackground(drawableEYQ);
        this.QQ.setGravity(17);
        this.QQ.setMaxLines(1);
        int iMZx2 = tr.mZx(this.IPb, 12.0f);
        int iMZx3 = tr.mZx(this.IPb, 4.0f);
        this.QQ.setPadding(iMZx2, iMZx3, iMZx2, iMZx3);
        int color = Color.parseColor("#1A73E8");
        this.QQ.setTextColor(color);
        this.QQ.setTextSize(12.0f);
        this.tsL.addView(this.QQ, layoutParams4);
        this.HX = new PAGTextView(this.IPb);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
        this.HX.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams5.gravity = 17;
        this.HX.setBackground(drawableEYQ);
        this.HX.setGravity(17);
        this.HX.setMaxLines(1);
        this.HX.setPadding(iMZx2, iMZx3, iMZx2, iMZx3);
        this.HX.setTextColor(color);
        this.HX.setTextSize(12.0f);
        this.tsL.addView(this.HX, layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this.IPb);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        int iMZx4 = tr.mZx(this.IPb, 21.0f);
        int iMZx5 = tr.mZx(this.IPb, 43.0f);
        layoutParams6.topMargin = iMZx4;
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(iMZx5, 0, 0, 0);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams6);
        this.tp = new PAGProgressBar(this.IPb, null, R.style.Widget.ProgressBar.Horizontal);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(tr.mZx(this.IPb, 160.0f), iMZx2);
        layoutParams7.gravity = 16;
        this.tp.setMax(100);
        this.tp.setProgress(1);
        this.tp.setProgressDrawable(zF.Td(this.IPb, "tt_full_reward_loading_progress_style"));
        pAGLinearLayout2.addView(this.tp, layoutParams7);
        this.MxO = new PAGTextView(this.IPb);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(tr.mZx(this.IPb, 35.0f), -2);
        this.MxO.setMaxLines(1);
        layoutParams8.leftMargin = tr.mZx(this.IPb, 8.0f);
        this.MxO.setTextColor(Color.parseColor("#161823"));
        this.MxO.setTextSize(14.0f);
        pAGLinearLayout2.addView(this.MxO, layoutParams8);
        if (!TextUtils.isEmpty(this.Td)) {
            pAGTextView.setText(this.Td);
        } else {
            pAGTextView.setVisibility(8);
        }
        if (this.mZx != null && !TextUtils.isEmpty(this.mZx.EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.mZx, tTRoundRectImageView, (UB) null);
        } else {
            tTRoundRectImageView.setVisibility(8);
        }
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void mZx() {
        mZx(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i) {
        FrameLayout frameLayout = this.tsL;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        this.tsL.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.Kbd.1
            @Override // java.lang.Runnable
            public void run() {
                if (Kbd.this.EYQ == null) {
                    Kbd.this.EYQ = new AnimatorSet();
                    AnimatorSet animatorSet = Kbd.this.EYQ;
                    Kbd kbd = Kbd.this;
                    AnimatorSet.Builder builderPlay = animatorSet.play(kbd.EYQ(kbd.QQ));
                    Kbd kbd2 = Kbd.this;
                    builderPlay.with(kbd2.mZx(kbd2.HX));
                    Kbd.this.EYQ.setDuration(500L);
                }
                Kbd.this.EYQ.start();
            }
        }, i);
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void Td() {
        AnimatorSet animatorSet = this.EYQ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator EYQ(TextView textView) {
        return ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -this.tsL.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator mZx(final TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", this.tsL.getHeight() + tr.mZx(this.IPb, 10.0f), 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.common.Kbd.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                TextView textView2 = textView;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (Kbd.this.Pm == null || Kbd.this.Pm.length < 2 || Kbd.this.tsL == null) {
                    return;
                }
                Kbd.this.mZx(2000);
                Kbd.this.VwS();
            }
        });
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VwS() {
        if (this.Pm == null) {
            return;
        }
        if (this.pi >= this.Pm.length) {
            this.pi = 0;
        }
        TextView textView = this.QQ;
        if (textView != null) {
            if (textView.getVisibility() != 0) {
                this.QQ.setVisibility(0);
            }
            this.QQ.setText(this.Pm[this.pi]);
            this.QQ.setY(0.0f);
        }
        if (this.HX != null) {
            int i = this.pi + 1;
            this.HX.setText(this.Pm[i < this.Pm.length ? i : 0]);
            this.HX.setVisibility(4);
        }
        this.pi++;
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void EYQ(int i) {
        PAGProgressBar pAGProgressBar = this.tp;
        if (pAGProgressBar != null) {
            pAGProgressBar.setProgress(i);
        }
        TextView textView = this.MxO;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i)));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.IPb
    public void Pm() {
        super.Pm();
    }
}
