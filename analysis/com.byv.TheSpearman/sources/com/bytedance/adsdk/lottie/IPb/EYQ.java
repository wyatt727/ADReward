package com.bytedance.adsdk.lottie.IPb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator.java */
/* loaded from: classes2.dex */
public abstract class EYQ extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> EYQ = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> mZx = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> Td = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.EYQ.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.EYQ.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.EYQ.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.mZx.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.mZx.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.mZx.clear();
    }

    void EYQ(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.mZx) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.Td.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.Td.remove(animatorPauseListener);
    }

    void EYQ() {
        Iterator<Animator.AnimatorListener> it = this.mZx.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void mZx(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.mZx) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void mZx() {
        Iterator<Animator.AnimatorListener> it = this.mZx.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void Td() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.EYQ.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void Pm() {
        if (Build.VERSION.SDK_INT >= 19) {
            Iterator<Animator.AnimatorPauseListener> it = this.Td.iterator();
            while (it.hasNext()) {
                it.next().onAnimationPause(this);
            }
        }
    }

    void Kbd() {
        if (Build.VERSION.SDK_INT >= 19) {
            Iterator<Animator.AnimatorPauseListener> it = this.Td.iterator();
            while (it.hasNext()) {
                it.next().onAnimationResume(this);
            }
        }
    }
}
