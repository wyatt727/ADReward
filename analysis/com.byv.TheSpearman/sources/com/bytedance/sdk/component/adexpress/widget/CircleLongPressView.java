package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class CircleLongPressView extends FrameLayout {
    private Context EYQ;
    private AnimatorSet IPb;
    private RingProgressView Kbd;
    private TextView Pm;
    private ImageView Td;
    private ImageView mZx;

    public CircleLongPressView(Context context) {
        super(context);
        this.IPb = new AnimatorSet();
        this.EYQ = context;
        Kbd();
        IPb();
    }

    private void Kbd() {
        FrameLayout frameLayout = new FrameLayout(this.EYQ);
        this.Kbd = new RingProgressView(this.EYQ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 95.0f), (int) IPb.EYQ(this.EYQ, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.Kbd, layoutParams);
        ImageView imageView = new ImageView(this.EYQ);
        this.mZx = imageView;
        imageView.setImageResource(zF.Pm(this.EYQ, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 75.0f), (int) IPb.EYQ(this.EYQ, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.mZx, layoutParams2);
        ImageView imageView2 = new ImageView(this.EYQ);
        this.Td = imageView2;
        imageView2.setImageResource(zF.Pm(this.EYQ, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 63.0f), (int) IPb.EYQ(this.EYQ, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.Td, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.EYQ);
        this.Pm = textView;
        textView.setTextColor(-1);
        this.Pm.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.Pm, layoutParams4);
    }

    private void IPb() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.Td, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.Td, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.IPb.setDuration(800L);
        this.IPb.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(String str) {
        this.Pm.setText(str);
    }

    public void EYQ() {
        this.IPb.start();
    }

    public void mZx() {
        this.IPb.cancel();
    }

    public void Td() {
        this.Kbd.EYQ();
    }

    public void Pm() {
        this.Kbd.mZx();
        this.Kbd.Td();
    }
}
