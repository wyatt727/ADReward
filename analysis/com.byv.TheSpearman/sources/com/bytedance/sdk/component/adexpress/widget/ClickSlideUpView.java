package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.Td.EYQ;

/* loaded from: classes2.dex */
public class ClickSlideUpView extends SlideUpView {
    private TextView EYQ;
    private AnimatorSet Td;
    private View mZx;

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    protected void EYQ(Context context) {
    }

    public ClickSlideUpView(Context context) {
        super(context);
        this.Td = new AnimatorSet();
        mZx(context);
    }

    private void mZx(Context context) {
        View viewEYQ = EYQ.EYQ(context);
        this.mZx = viewEYQ;
        addView(viewEYQ);
        setClipChildren(false);
        this.EYQ = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.EYQ == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.EYQ.setText(str);
    }

    private void Pm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mZx, "translationY", 0.0f, IPb.EYQ(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mZx, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.Td.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.Td.setDuration(1000L);
        this.Td.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void EYQ() {
        Pm();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void mZx() {
        this.Td.cancel();
    }
}
