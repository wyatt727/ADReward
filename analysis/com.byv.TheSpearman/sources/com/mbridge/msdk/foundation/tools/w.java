package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: SameBase64Decoder.java */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2999a;
    public static final int[] b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f2999a = charArray;
        int[] iArr = new int[256];
        b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            b[f2999a[i]] = i;
        }
        b[61] = 0;
    }

    public static String a(String str) {
        int i;
        byte[] bArr;
        int length = str.length();
        int i2 = 0;
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i3 = length - 1;
            int i4 = 0;
            while (i4 < i3 && b[str.charAt(i4) & 255] < 0) {
                i4++;
            }
            while (i3 > 0 && b[str.charAt(i3) & 255] < 0) {
                i3--;
            }
            int i5 = str.charAt(i3) == '=' ? str.charAt(i3 + (-1)) == '=' ? 2 : 1 : 0;
            int i6 = (i3 - i4) + 1;
            if (length > 76) {
                i = (str.charAt(76) == '\r' ? i6 / 78 : 0) << 1;
            } else {
                i = 0;
            }
            int i7 = (((i6 - i) * 6) >> 3) - i5;
            byte[] bArr2 = new byte[i7];
            int i8 = (i7 / 3) * 3;
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8) {
                int[] iArr = b;
                int i11 = i4 + 1;
                int i12 = i11 + 1;
                int i13 = (iArr[str.charAt(i4)] << 18) | (iArr[str.charAt(i11)] << 12);
                int i14 = i12 + 1;
                int i15 = i13 | (iArr[str.charAt(i12)] << 6);
                int i16 = i14 + 1;
                int i17 = i15 | iArr[str.charAt(i14)];
                int i18 = i9 + 1;
                bArr2[i9] = (byte) (i17 >> 16);
                int i19 = i18 + 1;
                bArr2[i18] = (byte) (i17 >> 8);
                int i20 = i19 + 1;
                bArr2[i19] = (byte) i17;
                if (i > 0 && (i10 = i10 + 1) == 19) {
                    i16 += 2;
                    i10 = 0;
                }
                i4 = i16;
                i9 = i20;
            }
            if (i9 < i7) {
                int i21 = 0;
                while (i4 <= i3 - i5) {
                    i2 |= b[str.charAt(i4)] << (18 - (i21 * 6));
                    i21++;
                    i4++;
                }
                int i22 = 16;
                while (i9 < i7) {
                    bArr2[i9] = (byte) (i2 >> i22);
                    i22 -= 8;
                    i9++;
                }
            }
            bArr = bArr2;
        }
        if (bArr.length == 0) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return new String(bArr);
    }
}
