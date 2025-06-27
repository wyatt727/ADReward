package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f2641a;
    private int b;
    private int c;
    private int d;
    private LinearGradient e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f2641a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f2641a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f2641a = gradientAndShadowParameters.gradientStartColor;
            this.b = gradientAndShadowParameters.gradientEndColor;
            this.c = gradientAndShadowParameters.shadowColor;
            this.d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2641a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2641a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2641a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    private void a() {
        setTextSize(this.d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f2641a, this.b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.e);
        super.onDraw(canvas);
    }
}
