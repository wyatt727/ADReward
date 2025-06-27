package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class IN {
    public static byte[] A02;
    public static String[] A03 = {"ByJYsTLYuoR6uc8r", "JtyXwt9Aly6TcqGHtKIVJmBsk4OeLfoM", "a9HBAd1W81XiearAjjAT3V1ZsLEmO9Oi", "EXNlrjnsmLCbvnLTR5jNuRmyx9d0ZBX8", "CaQoJFxeqSTbWtIeh0kRdnuLPh9NlfCW", "NDFH7JBJhJBLaqfKHqozYt4fbxKVNhf7", "NTYlS1n6YEIgBX9wiCzSTuRNkv1W0ADe", "oBB1NAAyCwUYb6ONAQdFrjyju4xXh"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{83, 100, 100, 121, 100, 54, 102, 119, 100, 101, Byte.MAX_VALUE, 120, 113, 54, 94, 83, 64, 85, 54, 117, 121, 120, 112, Byte.MAX_VALUE, 113};
    }

    static {
        A02();
    }

    public IN(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    public static IN A00(C0788Hz c0788Hz) throws C05969v {
        try {
            c0788Hz.A0Z(21);
            int iA0E = c0788Hz.A0E() & 3;
            int i = c0788Hz.A0E();
            int j = 0;
            int iA06 = c0788Hz.A06();
            for (int i2 = 0; i2 < i; i2++) {
                c0788Hz.A0Z(1);
                int csdStartPosition = c0788Hz.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c0788Hz.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    j += lengthSizeMinusOne;
                    c0788Hz.A0Z(numberOfArrays);
                }
            }
            c0788Hz.A0Y(iA06);
            byte[] buffer = new byte[j];
            int csdStartPosition2 = 0;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int numberOfArrays2 = str.charAt(26);
            int lengthSizeMinusOne2 = str2.charAt(26);
            if (numberOfArrays2 != lengthSizeMinusOne2) {
                A03[7] = "2";
                for (int lengthSizeMinusOne3 = 0; lengthSizeMinusOne3 < i; lengthSizeMinusOne3++) {
                    c0788Hz.A0Z(1);
                    int iA0I = c0788Hz.A0I();
                    for (int j2 = 0; j2 < iA0I; j2++) {
                        int numberOfNalUnits = c0788Hz.A0I();
                        byte[] bArr = AbstractC0784Hv.A03;
                        int csdLength2 = AbstractC0784Hv.A03.length;
                        System.arraycopy(bArr, 0, buffer, csdStartPosition2, csdLength2);
                        int numberOfArrays3 = AbstractC0784Hv.A03.length;
                        int csdStartPosition3 = csdStartPosition2 + numberOfArrays3;
                        byte[] bArr2 = c0788Hz.A00;
                        int numberOfArrays4 = c0788Hz.A06();
                        System.arraycopy(bArr2, numberOfArrays4, buffer, csdStartPosition3, numberOfNalUnits);
                        csdStartPosition2 = csdStartPosition3 + numberOfNalUnits;
                        c0788Hz.A0Z(numberOfNalUnits);
                    }
                }
                int numberOfArrays5 = iA0E + 1;
                return new IN(j == 0 ? null : Collections.singletonList(buffer), numberOfArrays5);
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C05969v(A01(0, 25, 65), e);
        }
    }
}
