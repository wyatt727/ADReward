package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Td.EYQ;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class ClickSlideUpView2 extends SlideUpView {
    private TextView EYQ;
    private AnimatorSet IPb;
    private int Kbd;
    private ImageView Pm;
    private ImageView Td;
    private ImageView mZx;

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    protected void EYQ(Context context) {
    }

    public ClickSlideUpView2(Context context) {
        super(context);
        this.IPb = new AnimatorSet();
        mZx(context);
    }

    private void mZx(Context context) {
        addView(EYQ.mZx(context));
        this.mZx = (ImageView) findViewById(2097610751);
        this.Td = (ImageView) findViewById(2097610750);
        this.Pm = (ImageView) findViewById(2097610749);
        this.EYQ = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.EYQ == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.EYQ.setText(str);
    }

    private void Pm() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    public float getAlphaColor() {
        return this.Kbd;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + Opcodes.MONITOREXIT;
        this.Pm.setColorFilter(Color.rgb(i2, i2, i2), PorterDuff.Mode.SRC_IN);
        int i3 = ((i + 20) % 60) + Opcodes.MONITOREXIT;
        this.Td.setColorFilter(Color.rgb(i3, i3, i3), PorterDuff.Mode.SRC_IN);
        int i4 = ((i + 40) % 60) + Opcodes.MONITOREXIT;
        this.mZx.setColorFilter(Color.rgb(i4, i4, i4), PorterDuff.Mode.SRC_IN);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void EYQ() {
        Pm();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void mZx() {
        this.IPb.cancel();
    }
}
