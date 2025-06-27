package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.WU;

/* loaded from: classes2.dex */
public class ShakeAnimationView extends LinearLayout {
    private TextView EYQ;
    private int HX;
    private TextView IPb;
    private TextView Kbd;
    private int MxO;
    private WU Pm;
    private LinearLayout QQ;
    private ImageView Td;
    private EYQ VwS;
    private TextView mZx;
    private int tp;

    public interface EYQ {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public ShakeAnimationView(Context context, View view, int i, int i2, int i3) {
        super(context);
        this.HX = i;
        this.tp = i2;
        this.MxO = i3;
        EYQ(context, view);
    }

    protected void EYQ(Context context, View view) {
        addView(view);
        this.QQ = (LinearLayout) findViewById(2097610727);
        this.Td = (ImageView) findViewById(2097610725);
        this.EYQ = (TextView) findViewById(2097610724);
        this.mZx = (TextView) findViewById(2097610726);
        this.Kbd = (TextView) findViewById(2097610723);
        this.IPb = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.QQ.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.Kbd.setVisibility(8);
            this.IPb.setVisibility(8);
        } else {
            this.Kbd.setText(str);
        }
    }

    public LinearLayout getShakeLayout() {
        return this.QQ;
    }

    public void setOnShakeViewListener(EYQ eyq) {
        this.VwS = eyq;
    }

    public void EYQ() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShakeAnimationView.this.Td != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new mZx(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ShakeAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShakeAnimationView.this.Td.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                ShakeAnimationView.this.Td.startAnimation(rotateAnimation);
            }
        }
    }

    private static class mZx implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * (-2.0f)) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private mZx() {
        }

        /* synthetic */ mZx(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.Pm == null) {
                this.Pm = new WU(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
