package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.utils.zF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, wBa.EYQ {
    Animation.AnimationListener EYQ;
    private float HX;
    private TextView IPb;
    private Context Kbd;
    private int MxO;
    private final int Pm;
    private int QQ;
    private int Td;
    private int VwS;
    private List<String> mZx;
    private Handler nWX;
    private int pi;
    private int tp;
    private int tsL;

    public AnimationText(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.mZx = new ArrayList();
        this.Td = 0;
        this.Pm = 1;
        this.nWX = new wBa(Looper.getMainLooper(), this);
        this.EYQ = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.AnimationText.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (AnimationText.this.IPb != null) {
                    AnimationText.this.IPb.setText("");
                }
            }
        };
        this.QQ = i;
        this.HX = f;
        this.tp = i2;
        this.pi = i3;
        Td();
    }

    private void Td() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.tsL = i;
    }

    public void setAnimationDuration(int i) {
        this.VwS = i;
    }

    public void EYQ() {
        int i = this.tsL;
        if (i == 1) {
            setInAnimation(getContext(), zF.tp(this.Kbd, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), zF.tp(this.Kbd, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), zF.tp(this.Kbd, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), zF.tp(this.Kbd, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.EYQ);
            getOutAnimation().setAnimationListener(this.EYQ);
        }
        this.nWX.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.mZx = list;
    }

    public void mZx() {
        List<String> list = this.mZx;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.Td;
        this.Td = i + 1;
        this.MxO = i;
        setText(this.mZx.get(i));
        if (this.Td > this.mZx.size() - 1) {
            this.Td = 0;
        }
    }

    public void setTextColor(int i) {
        this.QQ = i;
    }

    public void setTextSize(float f) {
        this.HX = f;
    }

    public void setMaxLines(int i) {
        this.tp = i;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.IPb = textView;
        textView.setTextColor(this.QQ);
        this.IPb.setTextSize(this.HX);
        this.IPb.setMaxLines(this.tp);
        if (Build.VERSION.SDK_INT >= 17) {
            this.IPb.setTextAlignment(this.pi);
        }
        return this.IPb;
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        if (message.what != 1) {
            return;
        }
        mZx();
        this.nWX.sendEmptyMessageDelayed(1, this.VwS);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(MxO.mZx(this.mZx.get(this.MxO), this.HX, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.nWX.removeMessages(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.nWX.sendEmptyMessageDelayed(1, this.VwS);
    }
}
