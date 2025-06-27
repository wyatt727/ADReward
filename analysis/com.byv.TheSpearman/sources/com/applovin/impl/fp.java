package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class fp {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long a(yg ygVar, int i, int i2) {
        ygVar.f(i);
        if (ygVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = ygVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i2 || (iJ & 32) == 0 || ygVar.w() < 7 || ygVar.a() < 7 || (ygVar.w() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        ygVar.a(bArr, 0, 6);
        return a(bArr);
    }

    private static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
