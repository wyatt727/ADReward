package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.Td.EYQ;
import com.bytedance.sdk.component.utils.pi;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes2.dex */
public class SlideUpView extends RelativeLayout {
    private ImageView EYQ;
    private AnimatorSet HX;
    private AnimatorSet IPb;
    private TextView Kbd;
    private int MxO;
    private TextView Pm;
    private AnimatorSet QQ;
    private ImageView Td;
    private AnimatorSet VwS;
    private ImageView mZx;
    private String tp;

    public SlideUpView(Context context) {
        super(context);
        this.IPb = new AnimatorSet();
        this.VwS = new AnimatorSet();
        this.QQ = new AnimatorSet();
        this.HX = new AnimatorSet();
        this.MxO = 100;
        EYQ(context);
    }

    public SlideUpView(Context context, String str) {
        super(context);
        this.IPb = new AnimatorSet();
        this.VwS = new AnimatorSet();
        this.QQ = new AnimatorSet();
        this.HX = new AnimatorSet();
        this.MxO = 100;
        setClipChildren(false);
        this.tp = str;
        EYQ(context);
    }

    protected void EYQ(Context context) {
        if (context == null) {
            context = Pm.EYQ();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.tp)) {
            addView(EYQ.VwS(context));
            this.MxO = (int) (this.MxO * 1.25d);
        } else {
            addView(EYQ.IPb(context));
        }
        this.EYQ = (ImageView) findViewById(2097610734);
        this.mZx = (ImageView) findViewById(2097610735);
        this.Pm = (TextView) findViewById(2097610730);
        this.Td = (ImageView) findViewById(2097610733);
        this.Kbd = (TextView) findViewById(2097610731);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.IPb;
    }

    public void EYQ() {
        Td();
        this.IPb.start();
        this.IPb.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideUpView.this.IPb.start();
                    }
                }, 200L);
            }
        });
    }

    public void Td() {
        ValueAnimator valueAnimator;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.EYQ, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.EYQ, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.EYQ, "translationY", 0.0f, IPb.EYQ(getContext(), -this.MxO));
        if (Build.VERSION.SDK_INT >= 21) {
            objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        } else {
            objectAnimatorOfFloat3.setInterpolator(com.bytedance.sdk.component.adexpress.EYQ.mZx.Pm.EYQ(0.2f, 0.0f, 0.3f, 1.0f));
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) IPb.EYQ(getContext(), this.MxO));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (SlideUpView.this.Td != null) {
                    Integer num = (Integer) valueAnimator2.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.Td.getLayoutParams();
                    layoutParams.height = num.intValue();
                    SlideUpView.this.Td.setLayoutParams(layoutParams);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        } else {
            valueAnimatorOfInt.setInterpolator(com.bytedance.sdk.component.adexpress.EYQ.mZx.Pm.EYQ(0.2f, 0.0f, 0.3f, 1.0f));
        }
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.Td, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.Td, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.mZx, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.mZx, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.mZx, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.mZx, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.mZx, "translationY", 0.0f, IPb.EYQ(getContext(), -this.MxO));
        if (Build.VERSION.SDK_INT >= 21) {
            valueAnimator = valueAnimatorOfInt;
            objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        } else {
            valueAnimator = valueAnimatorOfInt;
            objectAnimatorOfFloat10.setInterpolator(com.bytedance.sdk.component.adexpress.EYQ.mZx.Pm.EYQ(0.2f, 0.0f, 0.3f, 1.0f));
        }
        this.VwS.setDuration(50L);
        this.HX.setDuration(1500L);
        this.QQ.setDuration(50L);
        this.VwS.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.QQ.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.HX.playTogether(objectAnimatorOfFloat3, valueAnimator, objectAnimatorOfFloat10);
        this.IPb.playSequentially(this.QQ, this.HX, this.VwS);
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
            AnimatorSet animatorSet3 = this.VwS;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.HX;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            pi.mZx(e.getMessage());
        }
    }

    public void setGuideText(String str) {
        TextView textView = this.Pm;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.Kbd != null) {
            if (TextUtils.isEmpty(str)) {
                this.Kbd.setText("");
            } else {
                this.Kbd.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZx();
    }
}
