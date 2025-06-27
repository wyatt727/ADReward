package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class E4 implements XV {
    public static byte[] A05;
    public static String[] A06 = {"ilqNaxLa84KwPxLclQkuXaDAjXKjVBay", "YYRGnxFlW9XodSzMr5d0AgWnEUGN8SAb", "TFjL0s25LaCBEteV0vZTEC31LOIwZtzx", "GUmZTVO9tTTKl3Mpcsedxo5lbewk1Lj3", "rxyeYW6RMQKKTnfalukPqNZ2KBfsB6S5", "mDRU4t7MoPNm7z5QI5KjgmazMAxk28NE", "eki8tF0EBXj6l5GM9f5RfEnwS82fHKRK", "1REkWmsZMDj0bgzORsQu3VEtsLn99tZ6"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static E4 A01(long j, long j2, By by, C0788Hz c0788Hz) {
        int iA0H;
        int i = by.A04;
        int i2 = by.A03;
        int iA08 = c0788Hz.A08();
        if ((iA08 & 1) != 1 || (iA0H = c0788Hz.A0H()) == 0) {
            return null;
        }
        long jA0F = IF.A0F(iA0H, i * 1000000, i2);
        if ((iA08 & 6) != 6) {
            return new E4(j2, by.A02, jA0F);
        }
        long jA0H = c0788Hz.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = c0788Hz.A0E();
        }
        if (j != -1 && j != j2 + jA0H) {
            Log.w(A02(27, 10, 25), A02(2, 25, 119) + j + A02(0, 2, 77) + (j2 + jA0H));
        }
        return new E4(j2, by.A02, jA0F, jA0H, jArr);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-24, -36, 62, 47, 52, 45, 6, 74, 71, 90, 71, 6, 89, 79, 96, 75, 6, 83, 79, 89, 83, 71, 90, 73, 78, 32, 6, -32, -15, -10, -17, -37, -19, -19, -13, -19, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.uinode.XV
    public final long A88(long j) {
        long j2 = j - this.A02;
        if (!A9I()) {
            return 0L;
        }
        int i = this.A00;
        String[] strArr = A06;
        if (strArr[5].charAt(8) == strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "W8nk4dNFk5UYs2ixe7nvUw2jVo0XpVlf";
        strArr2[2] = "94Ku6bJ3HPlMD7WZMvisRyq3A9jYmrd2";
        if (j2 <= i) {
            return 0L;
        }
        double d = (j2 * 256.0d) / this.A01;
        int iA0B = IF.A0B(this.A04, (long) d, true, true);
        long jA00 = A00(iA0B);
        long j3 = this.A04[iA0B];
        long jA002 = A00(iA0B + 1);
        return Math.round((jA002 - jA00) * (j3 == (iA0B == 99 ? 256L : this.A04[iA0B + 1]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r9 - j3))) + jA00;
    }

    static {
        A03();
    }

    public E4(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public E4(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j) {
        double scaledPosition;
        if (!A9I()) {
            return new C0(new C2(0L, this.A02 + this.A00));
        }
        long jA0E = IF.A0E(j, 0L, this.A03);
        double d = (jA0E * 100.0d) / this.A03;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            scaledPosition = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else if (d >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i = (int) d;
            double prevScaledPosition = this.A04[i];
            double d2 = i == 99 ? 256.0d : r5[i + 1];
            double d3 = i;
            String[] strArr = A06;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "OMtgh7AGIO6dejZGwnLWpymQ4IFINQQk";
            strArr2[2] = "IsjlGA9bpSadN6h09kE1zH4HNrdroVjr";
            scaledPosition = ((d2 - prevScaledPosition) * (d - d3)) + prevScaledPosition;
        }
        long jRound = Math.round((scaledPosition / 256.0d) * this.A01);
        long positionOffset = this.A00;
        return new C0(new C2(jA0E, this.A02 + IF.A0E(jRound, positionOffset, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return this.A04 != null;
    }
}
