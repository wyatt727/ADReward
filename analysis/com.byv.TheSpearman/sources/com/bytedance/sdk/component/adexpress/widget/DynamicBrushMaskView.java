package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.Td.EYQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicBrushMaskView extends FrameLayout {
    private RelativeLayout EYQ;
    private volatile boolean HX;
    private ImageView IPb;
    private ObjectAnimator Kbd;
    private Context Pm;
    private FrameLayout QQ;
    private TextView Td;
    private ImageView VwS;
    private BrushMaskView mZx;
    private volatile boolean tp;

    public DynamicBrushMaskView(Context context) {
        super(context);
        this.tp = false;
        this.Pm = context;
        addView(EYQ.Kbd(context));
        Td();
    }

    public void setBrushText(String str) {
        if (this.Td == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.Td.setText(str);
    }

    private void Td() {
        this.mZx = (BrushMaskView) findViewById(2097610740);
        this.EYQ = (RelativeLayout) findViewById(2097610737);
        this.IPb = (ImageView) findViewById(2097610739);
        this.QQ = (FrameLayout) findViewById(2097610741);
        this.VwS = (ImageView) findViewById(2097610736);
        this.QQ.setClipChildren(false);
        this.Td = (TextView) findViewById(2097610738);
        if (this.mZx != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mZx.setWatermark(zF.Pm(this.Pm, "tt_splash_brush_bg"));
            }
            this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBrushMaskView.this.Kbd == null || !DynamicBrushMaskView.this.Kbd.isStarted()) {
                            DynamicBrushMaskView.this.Pm();
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        if (this.mZx != null) {
            this.HX = false;
            int iEYQ = IPb.EYQ(this.Pm);
            int i = (iEYQ * 336) / 375;
            int i2 = (i * 80) / 336;
            this.QQ.setLayoutParams(new RelativeLayout.LayoutParams(i, i2));
            float width = this.mZx.getWidth() / 6.0f;
            float height = this.mZx.getHeight() / 2.0f;
            float f = i;
            final float f2 = f - (f / 3.0f);
            this.mZx.setEraserSize((this.mZx.getHeight() * 3) / 5.0f);
            float fEYQ = IPb.EYQ(getContext(), 15.0f);
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f2, i2 / 2);
            int i3 = i2 / 4;
            layoutParams.topMargin = i3;
            float f3 = f / 6.0f;
            layoutParams.leftMargin = (int) f3;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            }
            this.IPb.setLayoutParams(layoutParams);
            int i4 = (iEYQ * 58) / 375;
            this.VwS.setLayoutParams(new RelativeLayout.LayoutParams(500, 500));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, (i4 * 76) / 58);
            layoutParams2.topMargin = (int) (i3 + fEYQ);
            layoutParams2.leftMargin = (int) (f3 - (fEYQ * 1.5f));
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart(layoutParams2.leftMargin);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            }
            this.EYQ.setLayoutParams(layoutParams2);
            this.mZx.EYQ(width, height);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.EYQ, "translationX", 0.0f, f2);
            this.Kbd = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1000L);
            this.Kbd.setRepeatMode(1);
            this.Kbd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (DynamicBrushMaskView.this.IPb != null) {
                        layoutParams.width = (int) (f2 * animatedFraction);
                        DynamicBrushMaskView.this.IPb.setLayoutParams(layoutParams);
                    }
                }
            });
            this.Kbd.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (DynamicBrushMaskView.this.mZx != null) {
                        if (DynamicBrushMaskView.this.IPb != null) {
                            layoutParams.width = 0;
                            DynamicBrushMaskView.this.IPb.setLayoutParams(layoutParams);
                        }
                        if (DynamicBrushMaskView.this.HX) {
                            return;
                        }
                        DynamicBrushMaskView.this.tp = true;
                        DynamicBrushMaskView.this.mZx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                DynamicBrushMaskView.this.tp = false;
                                if (DynamicBrushMaskView.this.HX) {
                                    return;
                                }
                                DynamicBrushMaskView.this.Kbd.start();
                            }
                        }, 100L);
                    }
                }
            });
            ObjectAnimator objectAnimator = this.Kbd;
            if (objectAnimator == null || objectAnimator.isStarted() || this.Kbd.isRunning() || this.tp) {
                return;
            }
            this.Kbd.start();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            try {
                ObjectAnimator objectAnimator = this.Kbd;
                if (objectAnimator == null || !(objectAnimator.isStarted() || this.Kbd.isRunning() || this.tp)) {
                    BrushMaskView brushMaskView = this.mZx;
                    if (brushMaskView != null) {
                        brushMaskView.EYQ();
                    }
                    RelativeLayout relativeLayout = this.EYQ;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                    Pm();
                }
            } catch (Exception e) {
                pi.EYQ("DynamicBrushMaskView", e.getMessage());
            }
        }
    }

    public void EYQ() {
        if (this.HX) {
            return;
        }
        this.HX = true;
        ObjectAnimator objectAnimator = this.Kbd;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            RelativeLayout relativeLayout = this.EYQ;
            if (relativeLayout != null) {
                relativeLayout.clearAnimation();
                this.EYQ.setVisibility(4);
            }
            this.mZx.EYQ();
        }
        BrushMaskView brushMaskView = this.mZx;
        if (brushMaskView != null) {
            brushMaskView.setEraserSize(brushMaskView.getHeight());
            this.mZx.EYQ(0.0f, r0.getHeight() / 2.0f);
            this.mZx.mZx();
        }
    }

    public void mZx() {
        clearAnimation();
    }
}
