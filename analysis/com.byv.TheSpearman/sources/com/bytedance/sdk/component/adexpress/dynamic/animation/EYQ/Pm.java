package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: BaseAnimation.java */
/* loaded from: classes2.dex */
public abstract class Pm implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kbd {
    public View Td;
    com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ mZx;
    private Set<ScheduledFuture<?>> Pm = new HashSet();
    public List<ObjectAnimator> EYQ = EYQ();

    abstract List<ObjectAnimator> EYQ();

    public Pm(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        this.Td = view;
        this.mZx = eyq;
    }

    public void Td() {
        List<ObjectAnimator> list = this.EYQ;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.mZx.UB() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && Build.VERSION.SDK_INT >= 19) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        EYQ eyq = Pm.this.new EYQ(objectAnimator);
                        ScheduledFuture<?> scheduledFutureSchedule = com.bytedance.sdk.component.VwS.IPb.IPb().schedule(eyq, (long) (Pm.this.mZx.UB() * 1000.0d), TimeUnit.MILLISECONDS);
                        eyq.EYQ(scheduledFutureSchedule);
                        Pm.this.Pm.add(scheduledFutureSchedule);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kbd
    public void mZx() {
        List<ObjectAnimator> list = this.EYQ;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.Pm.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator EYQ(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.mZx.nWX() * 1000.0d));
        if (this.mZx.KO() > 0) {
            objectAnimator.setRepeatCount(this.mZx.KO() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.mZx.hu())) {
            if ("alternate".equals(this.mZx.hu()) || "alternate-reverse".equals(this.mZx.hu())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.mZx.pi())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.mZx.hu())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.mZx.hu())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    Pm.this.Td.setVisibility(0);
                    if (Pm.this.Td.getParent() instanceof DynamicBaseWidgetImp) {
                        ((View) Pm.this.Td.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* compiled from: BaseAnimation.java */
    public class EYQ implements Runnable {
        ObjectAnimator EYQ;
        ScheduledFuture<?> mZx;

        EYQ(ObjectAnimator objectAnimator) {
            this.EYQ = objectAnimator;
        }

        public void EYQ(ScheduledFuture<?> scheduledFuture) {
            this.mZx = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT < 19 || com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() == null) {
                return;
            }
            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().Td().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    EYQ.this.EYQ.resume();
                }
            });
            if (this.mZx != null) {
                Pm.this.Pm.remove(this.mZx);
            }
        }
    }
}
