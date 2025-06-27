package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class H4 extends IOException {
    public final int A00;
    public final C0762Gy A01;

    public H4(IOException iOException, C0762Gy c0762Gy, int i) {
        super(iOException);
        this.A01 = c0762Gy;
        this.A00 = i;
    }

    public H4(String str, C0762Gy c0762Gy, int i) {
        super(str);
        this.A01 = c0762Gy;
        this.A00 = i;
    }

    public H4(String str, IOException iOException, C0762Gy c0762Gy, int i) {
        super(str, iOException);
        this.A01 = c0762Gy;
        this.A00 = i;
    }
}
