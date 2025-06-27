package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;

/* compiled from: BounceAnimation.java */
/* loaded from: classes2.dex */
public class Kbd extends Pm {
    public Kbd(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<android.animation.ObjectAnimator> EYQ() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ r1 = r5.mZx
            java.lang.String r1 = r1.WU()
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 1
            switch(r2) {
                case 3029889: goto L33;
                case 3387192: goto L29;
                case 483313230: goto L1f;
                case 1356771568: goto L15;
                default: goto L14;
            }
        L14:
            goto L3d
        L15:
            java.lang.String r2 = "backwards"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r3
            goto L3e
        L1f:
            java.lang.String r2 = "forwards"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r4
            goto L3e
        L29:
            java.lang.String r2 = "none"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 3
            goto L3e
        L33:
            java.lang.String r2 = "both"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 0
            goto L3e
        L3d:
            r1 = -1
        L3e:
            if (r1 == 0) goto L50
            if (r1 == r4) goto L4c
            if (r1 == r3) goto L48
            r5.Td(r0)
            goto L53
        L48:
            r5.mZx(r0)
            goto L53
        L4c:
            r5.Pm(r0)
            goto L53
        L50:
            r5.EYQ(r0)
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Kbd.EYQ():java.util.List");
    }

    private void EYQ(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.mZx.zF())).setDuration(((int) (this.mZx.tp() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        this.mZx.IPb(this.mZx.KO() * 2);
        list.add(EYQ(duration));
    }

    private void mZx(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.mZx.zF())).setDuration((int) (this.mZx.tp() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Kbd.1
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
                Kbd.this.Td.setTranslationY(0.0f);
            }
        });
        list.add(EYQ(duration));
    }

    private void Td(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.mZx.zF())).setDuration((int) (this.mZx.tp() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Kbd.2
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
                Kbd.this.Td.setTranslationY(0.0f);
            }
        });
        list.add(EYQ(duration));
    }

    private void Pm(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.mZx.zF())).setDuration((int) (this.mZx.tp() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(EYQ(duration));
    }
}
