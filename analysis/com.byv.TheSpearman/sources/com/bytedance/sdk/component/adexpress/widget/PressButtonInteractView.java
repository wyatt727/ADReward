package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class PressButtonInteractView extends FrameLayout {
    private Context EYQ;
    private boolean Kbd;
    private AnimatorSet Pm;
    private SplashDiffuseView Td;
    private ImageView mZx;

    public PressButtonInteractView(Context context) {
        super(context);
        this.Kbd = true;
        this.EYQ = context;
        this.Pm = new AnimatorSet();
        Td();
        Pm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.mZx.getLayoutParams();
                layoutParams.topMargin = (int) ((PressButtonInteractView.this.Td.getMeasuredHeight() / 2.0f) - IPb.EYQ(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((PressButtonInteractView.this.Td.getMeasuredWidth() / 2.0f) - IPb.EYQ(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-PressButtonInteractView.this.Td.getMeasuredHeight()) / 2.0f) + IPb.EYQ(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-PressButtonInteractView.this.Td.getMeasuredWidth()) / 2.0f) + IPb.EYQ(PressButtonInteractView.this.getContext(), 5.0f));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(layoutParams.leftMargin);
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
                PressButtonInteractView.this.mZx.setLayoutParams(layoutParams);
            }
        });
    }

    private void Td() {
        this.Td = new SplashDiffuseView(this.EYQ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 40.0f), (int) IPb.EYQ(this.EYQ, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.Td, layoutParams);
        this.mZx = new ImageView(this.EYQ);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 62.0f), (int) IPb.EYQ(this.EYQ, 62.0f));
        layoutParams2.gravity = 16;
        this.mZx.setImageResource(zF.Pm(this.EYQ, "tt_splash_hand"));
        addView(this.mZx, layoutParams2);
    }

    private void Pm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mZx, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(PressButtonInteractView.this.mZx, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                PressButtonInteractView.this.mZx.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.Kbd) {
                    PressButtonInteractView.this.Td.EYQ();
                }
                PressButtonInteractView.this.Kbd = !r2.Kbd;
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mZx, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Pm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void EYQ() {
        this.Pm.start();
    }

    public void mZx() {
        AnimatorSet animatorSet = this.Pm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        SplashDiffuseView splashDiffuseView = this.Td;
        if (splashDiffuseView != null) {
            splashDiffuseView.mZx();
        }
        ImageView imageView = this.mZx;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
