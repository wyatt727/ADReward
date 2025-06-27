package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class SlideUp3DView extends FrameLayout {
    private Context EYQ;
    private AnimationDrawable Kbd;
    private TextView Pm;
    private TextView Td;
    private ImageView mZx;

    public SlideUp3DView(Context context) {
        super(context);
        this.EYQ = context;
        EYQ();
    }

    public void EYQ() {
        this.mZx = new ImageView(this.EYQ);
        this.Pm = new TextView(this.EYQ);
        this.Td = new TextView(this.EYQ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) IPb.EYQ(this.EYQ, 200.0f), (int) IPb.EYQ(this.EYQ, 200.0f));
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = (int) IPb.EYQ(this.EYQ, 70.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) IPb.EYQ(this.EYQ, 25.0f);
        this.Pm.setText(zF.mZx(this.EYQ, "tt_slide_up_3d"));
        this.Pm.setTextColor(-1);
        this.Pm.setTextSize(24.0f);
        this.Pm.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        this.Td.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        this.Td.setTextColor(-1);
        this.Td.setTextSize(14.0f);
        addView(this.mZx, layoutParams);
        if (!Pm.mZx()) {
            addView(this.Pm, layoutParams2);
        }
        addView(this.Td, layoutParams3);
    }

    public void setGuideText(String str) {
        this.Td.setText(str);
    }

    private void Pm() {
        this.Kbd = new AnimationDrawable();
        EYQ(100, "tt_slide_up_1");
        EYQ(100, "tt_slide_up_2");
        EYQ(100, "tt_slide_up_3");
        EYQ(100, "tt_slide_up_4");
        EYQ(100, "tt_slide_up_5");
        EYQ(100, "tt_slide_up_6");
        EYQ(100, "tt_slide_up_7");
        EYQ(100, "tt_slide_up_8");
        EYQ(100, "tt_slide_up_9");
        EYQ(100, "tt_slide_up_10");
        EYQ(120, "tt_slide_up_11");
        EYQ(120, "tt_slide_up_12");
        EYQ(120, "tt_slide_up_13");
        EYQ(120, "tt_slide_up_14");
        EYQ(120, "tt_slide_up_15");
        this.Kbd.setOneShot(false);
    }

    private void EYQ(int i, String str) {
        this.Kbd.addFrame(zF.Td(this.EYQ, str), i);
    }

    public void mZx() {
        if (this.Kbd == null) {
            Pm();
        }
        this.mZx.setImageDrawable(this.Kbd);
        this.Kbd.start();
    }

    public void Td() {
        AnimationDrawable animationDrawable = this.Kbd;
        if (animationDrawable != null) {
            animationDrawable.stop();
            this.Kbd = null;
        }
    }
}
