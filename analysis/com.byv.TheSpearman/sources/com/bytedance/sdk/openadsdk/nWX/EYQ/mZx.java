package com.bytedance.sdk.openadsdk.nWX.EYQ;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.UB;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PAGBaseMrcTracker.java */
/* loaded from: classes2.dex */
public abstract class mZx {
    protected WeakReference<View> EYQ;
    private final int HX;
    private final int IPb;
    private final AtomicBoolean Kbd;
    private final AtomicLong Pm;
    private volatile boolean QQ = false;
    protected final AtomicBoolean Td;
    private final Integer VwS;
    protected UB mZx;

    public abstract int IPb();

    protected abstract boolean Td();

    protected abstract void mZx(int i);

    public static mZx EYQ(boolean z, Integer num, View view, UB ub, int i) {
        return z ? new QQ(num, view, ub, i) : new Td(num, view, ub, i);
    }

    public mZx(Integer num, View view, UB ub, int i, int i2) {
        this.VwS = num;
        this.IPb = i;
        this.mZx = ub;
        this.HX = i2;
        EYQ(view);
        this.Td = new AtomicBoolean(false);
        this.Pm = new AtomicLong(-1L);
        this.Kbd = new AtomicBoolean(false);
    }

    public void EYQ() {
        if (this.Td.compareAndSet(false, true)) {
            VwS.EYQ(this);
        }
    }

    public int mZx() {
        if (HX()) {
            return 1;
        }
        WeakReference<View> weakReference = this.EYQ;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.QQ) {
            return 3;
        }
        if (MxO().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return MxO().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && Td() ? 1 : 2;
        }
        tp();
        Kbd.mZx(MxO());
        return 3;
    }

    protected void Pm() {
        if (this.Kbd.compareAndSet(false, true)) {
            Pm.EYQ(this.mZx, Kbd(), this.HX);
        }
    }

    protected EYQ Kbd() {
        WeakReference<View> weakReference = this.EYQ;
        if (weakReference == null) {
            return new EYQ(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new EYQ(0, 0, 0.0f);
        }
        return new EYQ(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void VwS() {
        if (HX()) {
            return;
        }
        if (!this.Td.get()) {
            QQ();
        } else if (!this.Pm.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.Pm.get() >= this.IPb) {
            Pm();
        }
    }

    public void QQ() {
        this.Pm.set(-1L);
    }

    public boolean HX() {
        return this.Kbd.get();
    }

    public void tp() {
        this.QQ = true;
        VwS.mZx(this);
    }

    public void EYQ(int i) {
        if (i == 4) {
            EYQ();
            return;
        }
        if (i == 8) {
            pi();
        } else if (i == 9) {
            Pm();
        } else {
            mZx(i);
        }
    }

    public Integer MxO() {
        return this.VwS;
    }

    public boolean tsL() {
        return this.Td.get();
    }

    public void pi() {
        this.Td.set(false);
        QQ();
    }

    public void EYQ(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, MxO());
        }
        this.EYQ = new WeakReference<>(view);
    }
}
