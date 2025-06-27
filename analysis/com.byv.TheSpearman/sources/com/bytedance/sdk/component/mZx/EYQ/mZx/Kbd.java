package com.bytedance.sdk.component.mZx.EYQ.mZx;

/* compiled from: Segment.java */
/* loaded from: classes2.dex */
final class Kbd {
    final byte[] EYQ;
    Kbd IPb;
    boolean Kbd;
    boolean Pm;
    int Td;
    Kbd VwS;
    int mZx;

    Kbd() {
        this.EYQ = new byte[8192];
        this.Kbd = true;
        this.Pm = false;
    }

    Kbd(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.EYQ = bArr;
        this.mZx = i;
        this.Td = i2;
        this.Pm = z;
        this.Kbd = z2;
    }

    final Kbd EYQ() {
        this.Pm = true;
        return new Kbd(this.EYQ, this.mZx, this.Td, true, false);
    }

    public final Kbd mZx() {
        Kbd kbd = this.IPb;
        Kbd kbd2 = kbd != this ? kbd : null;
        Kbd kbd3 = this.VwS;
        if (kbd3 != null) {
            kbd3.IPb = kbd;
        }
        Kbd kbd4 = this.IPb;
        if (kbd4 != null) {
            kbd4.VwS = kbd3;
        }
        this.IPb = null;
        this.VwS = null;
        return kbd2;
    }

    public final Kbd EYQ(Kbd kbd) {
        kbd.VwS = this;
        kbd.IPb = this.IPb;
        this.IPb.VwS = kbd;
        this.IPb = kbd;
        return kbd;
    }
}
