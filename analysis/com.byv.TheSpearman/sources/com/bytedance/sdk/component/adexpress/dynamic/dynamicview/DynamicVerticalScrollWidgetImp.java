package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class DynamicVerticalScrollWidgetImp extends DynamicBaseWidgetImp implements Kbd {
    ObjectAnimator EYQ;
    private boolean WU;
    private Runnable XN;
    ObjectAnimator mZx;
    private int zF;

    public DynamicVerticalScrollWidgetImp(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.zF = 0;
        this.WU = false;
        this.XN = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicVerticalScrollWidgetImp.this.EYQ();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ() {
        View childAt;
        final View childAt2;
        final View childAt3 = getChildAt(this.zF);
        int i = this.zF;
        if (i == 0) {
            this.WU = false;
        }
        boolean z = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.zF + 1)).getChildCount() <= 0;
        if (!this.pi.tp().Kbd().EYQ() && z) {
            this.WU = true;
            childAt2 = getChildAt(this.zF - 1);
            this.EYQ = ObjectAnimator.ofFloat(childAt3, "translationY", 0.0f, (this.QQ + getChildAt(this.zF).getHeight()) / 2);
        } else {
            if (z) {
                childAt = getChildAt((this.zF + 2) % getChildCount());
            } else {
                childAt = getChildAt((this.zF + 1) % getChildCount());
            }
            this.EYQ = ObjectAnimator.ofFloat(childAt3, "translationY", 0.0f, (-(this.QQ + getChildAt(this.zF).getHeight())) / 2);
            if (z) {
                this.zF++;
            }
            childAt2 = childAt;
        }
        this.EYQ.setInterpolator(new LinearInterpolator());
        this.EYQ.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt3.setVisibility(8);
            }
        });
        if (this.WU) {
            this.mZx = ObjectAnimator.ofFloat(childAt2, "translationY", (-(this.QQ + childAt2.getHeight())) / 2, 0.0f);
        } else {
            this.mZx = ObjectAnimator.ofFloat(childAt2, "translationY", (this.QQ + childAt2.getHeight()) / 2, 0.0f);
        }
        this.mZx.setInterpolator(new LinearInterpolator());
        this.mZx.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.EYQ.setDuration(500L);
        this.mZx.setDuration(500L);
        this.EYQ.start();
        this.mZx.start();
        if (this.WU) {
            this.zF--;
        } else {
            int i2 = this.zF + 1;
            this.zF = i2;
            this.zF = i2 % getChildCount();
        }
        postDelayed(this.XN, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.QQ - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.XN, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kbd
    public void mZx() {
        removeCallbacks(this.XN);
        ObjectAnimator objectAnimator = this.EYQ;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.EYQ.cancel();
        }
        ObjectAnimator objectAnimator2 = this.mZx;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.mZx.cancel();
        }
        super.mZx();
    }
}
