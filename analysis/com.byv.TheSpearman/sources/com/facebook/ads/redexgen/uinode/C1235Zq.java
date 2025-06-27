package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1235Zq implements C4W {
    public static byte[] A07;
    public int A00;
    public InterfaceC04332z<AnonymousClass49> A01;
    public final AnonymousClass48 A02;
    public final C4X A03;
    public final ArrayList<AnonymousClass49> A04;
    public final ArrayList<AnonymousClass49> A05;
    public final boolean A06;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-86, -76, -85, -43, -58, -34, -47, -44, -58, -55};
    }

    public C1235Zq(AnonymousClass48 anonymousClass48) {
        this(anonymousClass48, false);
    }

    public C1235Zq(AnonymousClass48 anonymousClass48, boolean z) {
        this.A01 = new C1247a4(30);
        this.A04 = new ArrayList<>();
        this.A05 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = anonymousClass48;
        this.A06 = z;
        this.A03 = new C4X(this);
    }

    private final int A00(int i, int i2) {
        int count = this.A05.size();
        if (i2 < count) {
            this.A05.get(i2);
            throw new NullPointerException(A01(0, 3, 5));
        }
        return i;
    }

    private final void A03(List<AnonymousClass49> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
            A0A(null);
        }
        list.clear();
    }

    public final int A04(int i) {
        return A00(i, 0);
    }

    public final int A05(int i) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 5));
        }
        return i;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            AnonymousClass48 anonymousClass48 = this.A02;
            this.A05.get(0);
            anonymousClass48.ABK(null);
            throw null;
        }
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A07() {
        A06();
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 5));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 5));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(AnonymousClass49 anonymousClass49) {
        if (!this.A06) {
            throw new NullPointerException(A01(3, 7, 35));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i) {
        return (this.A00 & i) != 0;
    }
}
