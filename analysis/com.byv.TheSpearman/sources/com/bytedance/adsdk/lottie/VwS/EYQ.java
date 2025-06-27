package com.bytedance.adsdk.lottie.VwS;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.lottie.IPb;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Keyframe.java */
/* loaded from: classes2.dex */
public class EYQ<T> {
    public final T EYQ;
    public PointF HX;
    public final float IPb;
    private float KO;
    public final Interpolator Kbd;
    private float MxO;
    public final Interpolator Pm;
    public PointF QQ;
    public final Interpolator Td;
    public Float VwS;
    private float hu;
    public T mZx;
    private int nWX;
    private int pi;
    private final IPb tp;
    private float tsL;

    public EYQ(IPb iPb, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.MxO = -3987645.8f;
        this.tsL = -3987645.8f;
        this.pi = 784923401;
        this.nWX = 784923401;
        this.KO = Float.MIN_VALUE;
        this.hu = Float.MIN_VALUE;
        this.QQ = null;
        this.HX = null;
        this.tp = iPb;
        this.EYQ = t;
        this.mZx = t2;
        this.Td = interpolator;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = f;
        this.VwS = f2;
    }

    public EYQ(IPb iPb, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.MxO = -3987645.8f;
        this.tsL = -3987645.8f;
        this.pi = 784923401;
        this.nWX = 784923401;
        this.KO = Float.MIN_VALUE;
        this.hu = Float.MIN_VALUE;
        this.QQ = null;
        this.HX = null;
        this.tp = iPb;
        this.EYQ = t;
        this.mZx = t2;
        this.Td = null;
        this.Pm = interpolator;
        this.Kbd = interpolator2;
        this.IPb = f;
        this.VwS = f2;
    }

    protected EYQ(IPb iPb, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.MxO = -3987645.8f;
        this.tsL = -3987645.8f;
        this.pi = 784923401;
        this.nWX = 784923401;
        this.KO = Float.MIN_VALUE;
        this.hu = Float.MIN_VALUE;
        this.QQ = null;
        this.HX = null;
        this.tp = iPb;
        this.EYQ = t;
        this.mZx = t2;
        this.Td = interpolator;
        this.Pm = interpolator2;
        this.Kbd = interpolator3;
        this.IPb = f;
        this.VwS = f2;
    }

    public EYQ(T t) {
        this.MxO = -3987645.8f;
        this.tsL = -3987645.8f;
        this.pi = 784923401;
        this.nWX = 784923401;
        this.KO = Float.MIN_VALUE;
        this.hu = Float.MIN_VALUE;
        this.QQ = null;
        this.HX = null;
        this.tp = null;
        this.EYQ = t;
        this.mZx = t;
        this.Td = null;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = Float.MIN_VALUE;
        this.VwS = Float.valueOf(Float.MAX_VALUE);
    }

    private EYQ(T t, T t2) {
        this.MxO = -3987645.8f;
        this.tsL = -3987645.8f;
        this.pi = 784923401;
        this.nWX = 784923401;
        this.KO = Float.MIN_VALUE;
        this.hu = Float.MIN_VALUE;
        this.QQ = null;
        this.HX = null;
        this.tp = null;
        this.EYQ = t;
        this.mZx = t2;
        this.Td = null;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = Float.MIN_VALUE;
        this.VwS = Float.valueOf(Float.MAX_VALUE);
    }

    public EYQ<T> EYQ(T t, T t2) {
        return new EYQ<>(t, t2);
    }

    public float Td() {
        IPb iPb = this.tp;
        if (iPb == null) {
            return 0.0f;
        }
        if (this.KO == Float.MIN_VALUE) {
            this.KO = (this.IPb - iPb.IPb()) / this.tp.pi();
        }
        return this.KO;
    }

    public float Pm() {
        if (this.tp == null) {
            return 1.0f;
        }
        if (this.hu == Float.MIN_VALUE) {
            if (this.VwS == null) {
                this.hu = 1.0f;
            } else {
                this.hu = Td() + ((this.VwS.floatValue() - this.IPb) / this.tp.pi());
            }
        }
        return this.hu;
    }

    public boolean Kbd() {
        return this.Td == null && this.Pm == null && this.Kbd == null;
    }

    public boolean EYQ(float f) {
        return f >= Td() && f < Pm();
    }

    public float IPb() {
        if (this.MxO == -3987645.8f) {
            this.MxO = ((Float) this.EYQ).floatValue();
        }
        return this.MxO;
    }

    public float VwS() {
        if (this.tsL == -3987645.8f) {
            this.tsL = ((Float) this.mZx).floatValue();
        }
        return this.tsL;
    }

    public int QQ() {
        if (this.pi == 784923401) {
            this.pi = ((Integer) this.EYQ).intValue();
        }
        return this.pi;
    }

    public int HX() {
        if (this.nWX == 784923401) {
            this.nWX = ((Integer) this.mZx).intValue();
        }
        return this.nWX;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.EYQ + ", endValue=" + this.mZx + ", startFrame=" + this.IPb + ", endFrame=" + this.VwS + ", interpolator=" + this.Td + AbstractJsonLexerKt.END_OBJ;
    }
}
