package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0791Ic {
    public final Handler A00;
    public final InterfaceC0792Id A01;

    public C0791Ic(Handler handler, InterfaceC0792Id interfaceC0792Id) {
        this.A00 = interfaceC0792Id != null ? (Handler) AbstractC0763Ha.A01(handler) : null;
        this.A01 = interfaceC0792Id;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new IZ(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new IY(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0789Ia(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IX(this, format));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0790Ib(this, bc));
        }
    }

    public final void A06(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new IV(this, bc));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new IW(this, str, j, j2));
        }
    }
}
