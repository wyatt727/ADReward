package com.bykv.vk.openvk.component.video.EYQ.Pm;

import com.bykv.vk.openvk.component.video.EYQ.Pm.Td;

/* compiled from: AbstractMediaPlayer.java */
/* loaded from: classes.dex */
public abstract class EYQ implements Td {
    protected boolean EYQ = false;
    private Td.VwS IPb;
    private Td.IPb Kbd;
    private Td.EYQ Pm;
    private Td.Pm QQ;
    private Td.mZx Td;
    private Td.InterfaceC0058Td VwS;
    private Td.Kbd mZx;

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.Kbd kbd) {
        this.mZx = kbd;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.mZx mzx) {
        this.Td = mzx;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.EYQ eyq) {
        this.Pm = eyq;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.IPb iPb) {
        this.Kbd = iPb;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.InterfaceC0058Td interfaceC0058Td) {
        this.VwS = interfaceC0058Td;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.Pm pm) {
        this.QQ = pm;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public final void EYQ(Td.VwS vwS) {
        this.IPb = vwS;
    }

    public void EYQ() {
        this.mZx = null;
        this.Pm = null;
        this.Td = null;
        this.Kbd = null;
        this.IPb = null;
        this.VwS = null;
        this.QQ = null;
    }

    protected final void mZx() {
        try {
            Td.Kbd kbd = this.mZx;
            if (kbd != null) {
                kbd.mZx(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void Td() {
        try {
            Td.mZx mzx = this.Td;
            if (mzx != null) {
                mzx.EYQ(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void EYQ(int i) {
        try {
            Td.EYQ eyq = this.Pm;
            if (eyq != null) {
                eyq.EYQ(this, i);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void Pm() {
        try {
            Td.IPb iPb = this.Kbd;
            if (iPb != null) {
                iPb.Td(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void EYQ(int i, int i2, int i3, int i4) {
        try {
            Td.VwS vwS = this.IPb;
            if (vwS != null) {
                vwS.EYQ(this, i, i2, i3, i4);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean EYQ(int i, int i2) {
        try {
            Td.InterfaceC0058Td interfaceC0058Td = this.VwS;
            if (interfaceC0058Td != null) {
                if (interfaceC0058Td.EYQ(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    protected final boolean mZx(int i, int i2) {
        try {
            Td.Pm pm = this.QQ;
            if (pm != null) {
                if (pm.mZx(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(boolean z) {
        this.EYQ = z;
    }
}
