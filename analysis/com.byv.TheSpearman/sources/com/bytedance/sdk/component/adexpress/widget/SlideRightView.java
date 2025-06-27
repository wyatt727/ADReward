package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.EYQ.mZx.Pm;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class SlideRightView extends FrameLayout {
    private Context EYQ;
    private AnimatorSet HX;
    private AnimatorSet IPb;
    private TextView Kbd;
    private ImageView Pm;
    private AnimatorSet QQ;
    private ImageView Td;
    private AnimatorSet VwS;
    private ImageView mZx;

    public SlideRightView(Context context) {
        super(context);
        this.IPb = new AnimatorSet();
        this.VwS = new AnimatorSet();
        this.QQ = new AnimatorSet();
        this.HX = new AnimatorSet();
        this.EYQ = context;
        Td();
    }

    private void Td() {
        ImageView imageView = new ImageView(this.EYQ);
        this.Pm = imageView;
        imageView.setBackgroundResource(zF.Pm(this.EYQ, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) IPb.EYQ(this.EYQ, 30.0f);
        addView(this.Pm, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.EYQ);
        this.Td = imageView2;
        imageView2.setImageResource(zF.Pm(this.EYQ, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 50.0f), (int) IPb.EYQ(this.EYQ, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) IPb.EYQ(this.EYQ, 30.0f);
        addView(this.Td, layoutParams2);
        ImageView imageView3 = new ImageView(this.EYQ);
        this.mZx = imageView3;
        imageView3.setImageResource(zF.Pm(this.EYQ, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 80.0f), (int) IPb.EYQ(this.EYQ, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) IPb.EYQ(this.EYQ, 30.0f);
        addView(this.mZx, layoutParams3);
        TextView textView = new TextView(this.EYQ);
        this.Kbd = textView;
        textView.setTextColor(-1);
        this.Kbd.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.Kbd, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) SlideRightView.this.mZx.getLayoutParams();
                layoutParams5.topMargin = (int) ((SlideRightView.this.Td.getMeasuredHeight() / 2.0f) - IPb.EYQ(SlideRightView.this.getContext(), 7.0f));
                layoutParams5.leftMargin = (-SlideRightView.this.Td.getMeasuredWidth()) + ((int) IPb.EYQ(SlideRightView.this.EYQ, 30.0f));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams5.setMarginStart(layoutParams5.leftMargin);
                    layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                }
                SlideRightView.this.mZx.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) SlideRightView.this.Pm.getLayoutParams();
                layoutParams6.topMargin = (int) ((SlideRightView.this.Td.getMeasuredHeight() / 2.0f) - IPb.EYQ(SlideRightView.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((SlideRightView.this.Td.getMeasuredWidth() / 2.0f) + ((int) IPb.EYQ(SlideRightView.this.EYQ, 30.0f)));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams5.setMarginStart(layoutParams5.leftMargin);
                    layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                }
                SlideRightView.this.Pm.setLayoutParams(layoutParams6);
            }
        });
    }

    private void Pm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mZx, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.Td, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.Td, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.Pm, "alpha", 0.0f, 1.0f);
        this.QQ.setDuration(300L);
        this.QQ.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.mZx, "translationX", 0.0f, IPb.EYQ(getContext(), 90.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        } else {
            objectAnimatorOfFloat5.setInterpolator(Pm.EYQ(0.2f, 0.0f, 0.3f, 1.0f));
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) IPb.EYQ(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.Pm.getLayoutParams();
                layoutParams.width = num.intValue();
                SlideRightView.this.Pm.setLayoutParams(layoutParams);
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        } else {
            valueAnimatorOfInt.setInterpolator(Pm.EYQ(0.2f, 0.0f, 0.3f, 1.0f));
        }
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.Td, "translationX", 0.0f, IPb.EYQ(getContext(), 90.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        } else {
            objectAnimatorOfFloat6.setInterpolator(Pm.EYQ(0.2f, 0.0f, 0.3f, 1.0f));
        }
        this.HX.setDuration(1500L);
        this.HX.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.mZx, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.Pm, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.Td, "alpha", 1.0f, 0.0f);
        this.VwS.setDuration(50L);
        this.VwS.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.IPb.playSequentially(this.QQ, this.HX, this.VwS);
    }

    public void EYQ() {
        Pm();
        this.IPb.start();
        this.IPb.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideRightView.this.IPb.start();
                    }
                }, 200L);
            }
        });
    }

    public void mZx() {
        try {
            AnimatorSet animatorSet = this.IPb;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.QQ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.HX;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.VwS;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGuideText(String str) {
        this.Kbd.setText(str);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
