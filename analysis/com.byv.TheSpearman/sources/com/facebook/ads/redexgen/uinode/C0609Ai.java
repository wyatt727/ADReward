package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0609Ai {
    public final Handler A00;
    public final InterfaceC0610Aj A01;

    public C0609Ai(Handler handler, InterfaceC0610Aj interfaceC0610Aj) {
        this.A00 = interfaceC0610Aj != null ? (Handler) AbstractC0763Ha.A01(handler) : null;
        this.A01 = interfaceC0610Aj;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0608Ah(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0606Af(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0605Ae(this, format));
        }
    }

    public final void A04(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0607Ag(this, bc));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0603Ac(this, bc));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0604Ad(this, str, j, j2));
        }
    }
}
