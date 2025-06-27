package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class HH implements InterfaceC1394ce {
    public final List<InterfaceC1033Rr> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1394ce
    public final InterfaceC1033Rr A5q(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1033Rr> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1394ce
    public final int size() {
        return this.A00.size();
    }
}
