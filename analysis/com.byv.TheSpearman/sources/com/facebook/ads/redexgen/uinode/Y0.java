package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC0624Ax {
    public final C1188Xu A00;
    public final C1187Xt A01;
    public final InterfaceC0602Ab[] A02;

    public Y0(InterfaceC0602Ab... interfaceC0602AbArr) {
        InterfaceC0602Ab[] interfaceC0602AbArr2 = (InterfaceC0602Ab[]) Arrays.copyOf(interfaceC0602AbArr, interfaceC0602AbArr.length + 2);
        this.A02 = interfaceC0602AbArr2;
        C1188Xu c1188Xu = new C1188Xu();
        this.A00 = c1188Xu;
        C1187Xt c1187Xt = new C1187Xt();
        this.A01 = c1187Xt;
        interfaceC0602AbArr2[interfaceC0602AbArr.length] = c1188Xu;
        interfaceC0602AbArr2[interfaceC0602AbArr.length + 1] = c1187Xt;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0624Ax
    public final C05989x A3b(C05989x c05989x) {
        this.A00.A0B(c05989x.A02);
        return new C05989x(this.A01.A01(c05989x.A01), this.A01.A00(c05989x.A00), c05989x.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0624Ax
    public final InterfaceC0602Ab[] A64() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0624Ax
    public final long A7O(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0624Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
