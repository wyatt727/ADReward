package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class BluePressInteractView extends FrameLayout {
    private AnimatorSet EYQ;
    private int HX;
    private View IPb;
    private View Kbd;
    private View Pm;
    private int QQ;
    private boolean Td;
    private ImageView VwS;
    private ObjectAnimator mZx;
    private Context tp;

    public BluePressInteractView(Context context, int i, int i2) {
        super(context);
        this.Td = false;
        this.EYQ = new AnimatorSet();
        this.QQ = i;
        this.HX = i2;
        this.tp = context;
        Td();
        Pm();
    }

    private void Td() {
        View view = new View(this.tp);
        this.Pm = view;
        view.setBackground(EYQ("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.QQ * 0.45d), (int) (this.HX * 0.45d));
        layoutParams.gravity = 17;
        this.Pm.setLayoutParams(layoutParams);
        addView(this.Pm);
        View view2 = new View(this.tp);
        this.Kbd = view2;
        view2.setBackground(EYQ("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.QQ * 0.25d), (int) (this.HX * 0.25d));
        layoutParams2.gravity = 17;
        this.Kbd.setLayoutParams(layoutParams2);
        addView(this.Kbd);
        View view3 = new View(this.tp);
        this.IPb = view3;
        view3.setBackground(EYQ("#807BBEFF", "#FF7BBEFF"));
        int i = this.QQ;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i * 0.25d), (int) (i * 0.25d));
        layoutParams3.gravity = 17;
        this.IPb.setLayoutParams(layoutParams3);
        addView(this.IPb);
        ImageView imageView = new ImageView(this.tp);
        this.VwS = imageView;
        imageView.setImageResource(zF.Pm(getContext(), "tt_blue_hand"));
        this.VwS.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.QQ * 0.62d), (int) (this.HX * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.VwS.setLayoutParams(layoutParams4);
        addView(this.VwS);
    }

    private void Pm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.Pm, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.Pm, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.Kbd, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.Kbd, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.IPb, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.IPb, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.VwS, Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.mZx = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.EYQ.setDuration(1500L);
        this.EYQ.setInterpolator(new AccelerateDecelerateInterpolator());
        this.EYQ.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.EYQ.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.BluePressInteractView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (BluePressInteractView.this.Td) {
                    return;
                }
                BluePressInteractView.this.mZx.start();
                BluePressInteractView.this.EYQ.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                BluePressInteractView.this.Td = true;
            }
        });
    }

    private GradientDrawable EYQ(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void EYQ() {
        this.Td = false;
        ObjectAnimator objectAnimator = this.mZx;
        if (objectAnimator == null || this.EYQ == null) {
            return;
        }
        objectAnimator.start();
        this.EYQ.start();
    }

    public void mZx() {
        this.Td = true;
        ObjectAnimator objectAnimator = this.mZx;
        if (objectAnimator == null || this.EYQ == null) {
            return;
        }
        objectAnimator.cancel();
        this.EYQ.cancel();
    }
}
