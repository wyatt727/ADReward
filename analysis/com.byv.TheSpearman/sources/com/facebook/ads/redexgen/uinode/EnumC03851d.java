package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC03851d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC03851d[] A02;
    public static final EnumC03851d A03;
    public static final EnumC03851d A04;
    public static final EnumC03851d A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        EnumC03851d enumC03851d = new EnumC03851d(strA01, 0, strA01);
        A05 = enumC03851d;
        String strA012 = A01(13, 14, 115);
        EnumC03851d enumC03851d2 = new EnumC03851d(strA012, 1, strA012);
        A04 = enumC03851d2;
        String strA013 = A01(0, 13, 126);
        EnumC03851d enumC03851d3 = new EnumC03851d(strA013, 2, strA013);
        A03 = enumC03851d3;
        A02 = new EnumC03851d[]{enumC03851d, enumC03851d2, enumC03851d3};
    }

    public EnumC03851d(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC03851d A00(String str) {
        for (EnumC03851d enumC03851d : values()) {
            if (enumC03851d.A00.equalsIgnoreCase(str)) {
                return enumC03851d;
            }
        }
        return A03;
    }

    public static EnumC03851d valueOf(String str) {
        return (EnumC03851d) Enum.valueOf(EnumC03851d.class, str);
    }

    public static EnumC03851d[] values() {
        return (EnumC03851d[]) A02.clone();
    }
}
