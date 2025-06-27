package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class HandLongPressView extends FrameLayout {
    private Context EYQ;
    private TextView IPb;
    private boolean Kbd;
    private AnimatorSet Pm;
    private CircleRippleView Td;
    private ImageView mZx;

    public HandLongPressView(Context context) {
        super(context);
        this.Kbd = true;
        this.EYQ = context;
        this.Pm = new AnimatorSet();
        Td();
        Pm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.mZx.getLayoutParams();
                layoutParams.topMargin = ((int) ((HandLongPressView.this.Td.getMeasuredHeight() / 2.0f) - IPb.EYQ(HandLongPressView.this.getContext(), 5.0f))) + ((int) IPb.EYQ(HandLongPressView.this.EYQ, 20.0f));
                layoutParams.leftMargin = ((int) ((HandLongPressView.this.Td.getMeasuredWidth() / 2.0f) - IPb.EYQ(HandLongPressView.this.getContext(), 5.0f))) + ((int) IPb.EYQ(HandLongPressView.this.EYQ, 20.0f));
                layoutParams.bottomMargin = (int) (((-HandLongPressView.this.Td.getMeasuredHeight()) / 2.0f) + IPb.EYQ(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-HandLongPressView.this.Td.getMeasuredWidth()) / 2.0f) + IPb.EYQ(HandLongPressView.this.getContext(), 5.0f));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(layoutParams.leftMargin);
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
                HandLongPressView.this.mZx.setLayoutParams(layoutParams);
            }
        });
    }

    private void Td() {
        this.Td = new CircleRippleView(this.EYQ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 80.0f), (int) IPb.EYQ(this.EYQ, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) IPb.EYQ(this.EYQ, 20.0f);
        layoutParams.leftMargin = (int) IPb.EYQ(this.EYQ, 20.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        addView(this.Td, layoutParams);
        this.Td.EYQ();
        this.mZx = new ImageView(this.EYQ);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 80.0f), (int) IPb.EYQ(this.EYQ, 80.0f));
        this.mZx.setImageResource(zF.Pm(this.EYQ, "tt_splash_hand"));
        addView(this.mZx, layoutParams2);
        TextView textView = new TextView(this.EYQ);
        this.IPb = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) IPb.EYQ(this.EYQ, 10.0f);
        addView(this.IPb, layoutParams3);
    }

    private void Pm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mZx, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(HandLongPressView.this.mZx, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                HandLongPressView.this.mZx.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.Kbd) {
                    HandLongPressView.this.Td.EYQ();
                    HandLongPressView.this.Td.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.Td.mZx();
                    HandLongPressView.this.Td.setAlpha(0.0f);
                }
                HandLongPressView.this.Kbd = !r2.Kbd;
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mZx, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.Pm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(String str) {
        this.IPb.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.IPb.setTextColor(i);
    }

    public void EYQ() {
        this.Pm.start();
    }

    public void mZx() {
        AnimatorSet animatorSet = this.Pm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.Td;
        if (circleRippleView != null) {
            circleRippleView.mZx();
        }
    }
}
