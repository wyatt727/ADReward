package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RubInAnimation.java */
/* loaded from: classes2.dex */
public class tp extends Pm {
    private float IPb;
    private float Kbd;
    private EYQ Pm;

    public tp(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        int i;
        String str;
        if ((this.Td instanceof ImageView) && (this.Td.getParent() instanceof DynamicBaseWidget)) {
            this.Td = (View) this.Td.getParent();
        }
        this.Td.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "alpha", 0.0f, 1.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        this.Pm = new EYQ(this.Td);
        final int i2 = this.Td.getLayoutParams().height;
        this.Kbd = i2;
        this.IPb = this.Td.getLayoutParams().width;
        if ("left".equals(this.mZx.EYQ()) || "right".equals(this.mZx.EYQ())) {
            i = (int) this.IPb;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.Pm, str, 0, i).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        arrayList.add(EYQ(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.tp.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                tp.this.Pm.EYQ(i2);
            }
        });
        return arrayList;
    }

    /* compiled from: RubInAnimation.java */
    private class EYQ {
        private View mZx;

        public EYQ(View view) {
            this.mZx = view;
        }

        public void EYQ(int i) {
            if ("top".equals(tp.this.mZx.EYQ())) {
                if (tp.this.Td instanceof ViewGroup) {
                    for (int i2 = 0; i2 < ((ViewGroup) tp.this.Td).getChildCount(); i2++) {
                        ((ViewGroup) tp.this.Td).getChildAt(i2).setTranslationY(i - tp.this.Kbd);
                    }
                }
                tp.this.Td.setTranslationY(tp.this.Kbd - i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.mZx.getLayoutParams();
            layoutParams.height = i;
            this.mZx.setLayoutParams(layoutParams);
            this.mZx.requestLayout();
        }
    }
}
