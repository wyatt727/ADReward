package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class GQ implements Comparable<GQ> {
    public final int A00;
    public final GM A01;

    public GQ(int i, GM gm) {
        this.A00 = i;
        this.A01 = gm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GQ gq) {
        return this.A00 - gq.A00;
    }
}
