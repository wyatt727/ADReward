package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0719Fe extends AbstractC1340bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, Base64.padSymbol, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0719Fe.class.getSimpleName();
    }

    public C0719Fe(C1207Yn c1207Yn, J2 j2, String str, Uri uri, Map<String, String> mExtraData, C03700o c03700o, boolean z) {
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
        if (!AbstractC0874Lo.A0e(((AbstractC03640h) this).A00, enumC03630gA0G, this.A01)) {
            A0E(this.A01, enumC03630gA0G);
        }
        return enumC03630gA0G;
    }

    public final EnumC03630g A0G() {
        if (A0F(this.A00)) {
            EnumC03630g actionOutcome = EnumC03630g.A09;
            return actionOutcome;
        }
        try {
            EnumC03630g actionOutcome2 = C0855Kv.A05(new C0855Kv(), ((AbstractC03640h) this).A00, AbstractC0858Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC03640h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC03630g actionOutcome3 = EnumC03630g.A03;
            return actionOutcome3;
        }
    }
}
