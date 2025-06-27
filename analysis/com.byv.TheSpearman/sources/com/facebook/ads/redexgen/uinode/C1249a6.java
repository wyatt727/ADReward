package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1249a6<K, V> extends AbstractC04322y<K, V> {
    public final /* synthetic */ C1248a5 A00;

    public C1249a6(C1248a5 c1248a5) {
        this.A00 = c1248a5;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04322y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
