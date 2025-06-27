package com.bytedance.adsdk.lottie.IPb;

import android.view.Choreographer;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes2.dex */
public class Td extends EYQ implements Choreographer.FrameCallback {
    private com.bytedance.adsdk.lottie.IPb tp;
    private float mZx = 1.0f;
    private boolean Td = false;
    private long Pm = 0;
    private float Kbd = 0.0f;
    private float IPb = 0.0f;
    private int VwS = 0;
    private float QQ = -2.14748365E9f;
    private float HX = 2.14748365E9f;
    protected boolean EYQ = false;
    private boolean MxO = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(IPb());
    }

    public float IPb() {
        com.bytedance.adsdk.lottie.IPb iPb = this.tp;
        if (iPb == null) {
            return 0.0f;
        }
        return (this.IPb - iPb.IPb()) / (this.tp.VwS() - this.tp.IPb());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fKO;
        float fHu;
        float fKO2;
        if (this.tp == null) {
            return 0.0f;
        }
        if (zF()) {
            fKO = hu() - this.IPb;
            fHu = hu();
            fKO2 = KO();
        } else {
            fKO = this.IPb - KO();
            fHu = hu();
            fKO2 = KO();
        }
        return fKO / (fHu - fKO2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.bytedance.adsdk.lottie.IPb iPb = this.tp;
        if (iPb == null) {
            return 0L;
        }
        return (long) iPb.Kbd();
    }

    public float VwS() {
        return this.IPb;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.EYQ;
    }

    public void Td(boolean z) {
        this.MxO = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        UB();
        if (this.tp == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.lottie.Kbd.EYQ("LottieValueAnimator#doFrame");
        float fHYh = (this.Pm != 0 ? j - r1 : 0L) / hYh();
        float f = this.Kbd;
        if (zF()) {
            fHYh = -fHYh;
        }
        float f2 = f + fHYh;
        boolean z = !Kbd.Td(f2, KO(), hu());
        float f3 = this.Kbd;
        float fMZx = Kbd.mZx(f2, KO(), hu());
        this.Kbd = fMZx;
        if (this.MxO) {
            fMZx = (float) Math.floor(fMZx);
        }
        this.IPb = fMZx;
        this.Pm = j;
        if (!this.MxO || this.Kbd != f3) {
            Td();
        }
        if (z) {
            if (getRepeatCount() != -1 && this.VwS >= getRepeatCount()) {
                float fKO = this.mZx < 0.0f ? KO() : hu();
                this.Kbd = fKO;
                this.IPb = fKO;
                Uc();
                mZx(zF());
            } else {
                EYQ();
                this.VwS++;
                if (getRepeatMode() == 2) {
                    this.Td = !this.Td;
                    HX();
                } else {
                    float fHu = zF() ? hu() : KO();
                    this.Kbd = fHu;
                    this.IPb = fHu;
                }
                this.Pm = j;
            }
        }
        WU();
        com.bytedance.adsdk.lottie.Kbd.mZx("LottieValueAnimator#doFrame");
    }

    private float hYh() {
        com.bytedance.adsdk.lottie.IPb iPb = this.tp;
        if (iPb == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iPb.QQ()) / Math.abs(this.mZx);
    }

    public void QQ() {
        this.tp = null;
        this.QQ = -2.14748365E9f;
        this.HX = 2.14748365E9f;
    }

    public void EYQ(com.bytedance.adsdk.lottie.IPb iPb) {
        boolean z = this.tp == null;
        this.tp = iPb;
        if (z) {
            EYQ(Math.max(this.QQ, iPb.IPb()), Math.min(this.HX, iPb.VwS()));
        } else {
            EYQ((int) iPb.IPb(), (int) iPb.VwS());
        }
        float f = this.IPb;
        this.IPb = 0.0f;
        this.Kbd = 0.0f;
        EYQ((int) f);
        Td();
    }

    public void EYQ(float f) {
        if (this.Kbd == f) {
            return;
        }
        float fMZx = Kbd.mZx(f, KO(), hu());
        this.Kbd = fMZx;
        if (this.MxO) {
            fMZx = (float) Math.floor(fMZx);
        }
        this.IPb = fMZx;
        this.Pm = 0L;
        Td();
    }

    public void EYQ(int i) {
        EYQ(i, (int) this.HX);
    }

    public void mZx(float f) {
        EYQ(this.QQ, f);
    }

    public void EYQ(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        com.bytedance.adsdk.lottie.IPb iPb = this.tp;
        float fIPb = iPb == null ? -3.4028235E38f : iPb.IPb();
        com.bytedance.adsdk.lottie.IPb iPb2 = this.tp;
        float fVwS = iPb2 == null ? Float.MAX_VALUE : iPb2.VwS();
        float fMZx = Kbd.mZx(f, fIPb, fVwS);
        float fMZx2 = Kbd.mZx(f2, fIPb, fVwS);
        if (fMZx == this.QQ && fMZx2 == this.HX) {
            return;
        }
        this.QQ = fMZx;
        this.HX = fMZx2;
        EYQ((int) Kbd.mZx(this.IPb, fMZx, fMZx2));
    }

    public void HX() {
        Td(-tp());
    }

    public void Td(float f) {
        this.mZx = f;
    }

    public float tp() {
        return this.mZx;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.Td) {
            return;
        }
        this.Td = false;
        HX();
    }

    public void MxO() {
        this.EYQ = true;
        EYQ(zF());
        EYQ((int) (zF() ? hu() : KO()));
        this.Pm = 0L;
        this.VwS = 0;
        UB();
    }

    public void tsL() {
        Uc();
        mZx(zF());
    }

    public void pi() {
        Uc();
        Pm();
    }

    public void nWX() {
        this.EYQ = true;
        UB();
        this.Pm = 0L;
        if (zF() && VwS() == KO()) {
            EYQ(hu());
        } else if (!zF() && VwS() == hu()) {
            EYQ(KO());
        }
        Kbd();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        mZx();
        Uc();
    }

    private boolean zF() {
        return tp() < 0.0f;
    }

    public float KO() {
        com.bytedance.adsdk.lottie.IPb iPb = this.tp;
        if (iPb == null) {
            return 0.0f;
        }
        float f = this.QQ;
        return f == -2.14748365E9f ? iPb.IPb() : f;
    }

    public float hu() {
        com.bytedance.adsdk.lottie.IPb iPb = this.tp;
        if (iPb == null) {
            return 0.0f;
        }
        float f = this.HX;
        return f == 2.14748365E9f ? iPb.VwS() : f;
    }

    @Override // com.bytedance.adsdk.lottie.IPb.EYQ
    void mZx() {
        super.mZx();
        mZx(zF());
    }

    protected void UB() {
        if (isRunning()) {
            Pm(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void Uc() {
        Pm(true);
    }

    protected void Pm(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.EYQ = false;
        }
    }

    private void WU() {
        if (this.tp == null) {
            return;
        }
        float f = this.IPb;
        if (f < this.QQ || f > this.HX) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.QQ), Float.valueOf(this.HX), Float.valueOf(this.IPb)));
        }
    }
}
