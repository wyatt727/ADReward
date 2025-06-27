package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1134Vp implements InterfaceC0758Gu {
    public final int A00;
    public final InterfaceC0758Gu A01;
    public final I3 A02;

    public C1134Vp(InterfaceC0758Gu interfaceC0758Gu, I3 i3, int i) {
        this.A01 = (InterfaceC0758Gu) AbstractC0763Ha.A01(interfaceC0758Gu);
        this.A02 = (I3) AbstractC0763Ha.A01(i3);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final long ADl(C0762Gy c0762Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c0762Gy);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
