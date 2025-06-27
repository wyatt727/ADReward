package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class WD implements InterfaceC0727Fo {
    public final GB A00;
    public final Map<String, GH> A01;
    public final Map<String, GC> A02;
    public final long[] A03;

    public WD(GB gb, Map<String, GH> map, Map<String, GC> map2) {
        Map<String, GH> mapEmptyMap;
        this.A00 = gb;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = gb.A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final List<C0726Fn> A6Z(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final long A70(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A71() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0727Fo
    public final int A7T(long j) {
        int iA0A = IF.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
