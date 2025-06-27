package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WF implements InterfaceC0727Fo {
    public static String[] A02 = {"rC2J7AwmmaBlZB1ox11LDA9ZAB6fxVsC", "FZKyzMmy9TivpD2nKj9z4jyUnxaUeLwM", "SgCjuagBwk99AmsF9yO8OoMMvubs4clZ", "SMyqq5yIGtEsHah", "ZWugu9oJugVg9n7ZMlc8zaFASnxpD2Hj", "S8p9iTCEp8NZOaZR39SQR", "XhPs2dbFqyZTAL6Xfbqo6", "a7gb9qnnbjI1KAE"};
    public final long[] A00;
    public final C0726Fn[] A01;

    public WF(C0726Fn[] c0726FnArr, long[] jArr) {
        this.A01 = c0726FnArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final List<C0726Fn> A6Z(long j) {
        int iA0B = IF.A0B(this.A00, j, true, false);
        if (iA0B != -1) {
            C0726Fn[] c0726FnArr = this.A01;
            if (A02[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A02[1] = "utRrKVvY3UrlqyIa0tu41Z4MJfpwxdGA";
            C0726Fn c0726Fn = c0726FnArr[iA0B];
            if (c0726Fn != null) {
                return Collections.singletonList(c0726Fn);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final long A70(int i) {
        boolean z = true;
        AbstractC0763Ha.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC0763Ha.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A7T(long j) {
        int iA0A = IF.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
