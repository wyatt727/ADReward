package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0718Fd extends AbstractC1340bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0718Fd.class.getSimpleName();
    }

    public C0718Fd(C1207Yn c1207Yn, J2 j2, String str, Uri uri, Map<String, String> mExtraData, C03700o c03700o, boolean z) {
        super(c1207Yn, j2, str, c03700o, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1340bZ
    public final EnumC03630g A0D() {
        EnumC03630g enumC03630gA0G = EnumC03630g.A08;
        if (((AbstractC1340bZ) this).A02) {
            enumC03630gA0G = A0G();
        }
        A0E(this.A01, enumC03630gA0G);
        return enumC03630gA0G;
    }

    public final EnumC03630g A0G() {
        EnumC03630g enumC03630g = EnumC03630g.A08;
        try {
            C0855Kv.A0C(new C0855Kv(), ((AbstractC03640h) this).A00, AbstractC0858Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC03640h) this).A02);
            return enumC03630g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC03630g.A03;
        }
    }
}
