package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: ImageFormatChecker.java */
/* loaded from: classes2.dex */
public class HX {
    private static final byte[] EYQ;
    private static final byte[] IPb;
    private static final byte[] Kbd;
    private static final byte[] Pm;
    private static final byte[] Td;
    private static final int VwS;
    private static final byte[] mZx;

    static {
        byte[] bArr = {-1, -40, -1};
        EYQ = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        mZx = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        Td = bArr3;
        byte[] bArrEYQ = EYQ("BM");
        Pm = bArrEYQ;
        Kbd = EYQ("GIF87a");
        IPb = EYQ("GIF89a");
        VwS = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(bArrEYQ.length), 6))).intValue();
    }

    public static int EYQ() {
        return VwS;
    }

    public static final String EYQ(byte[] bArr) {
        return mZx(bArr) ? "jpeg" : Td(bArr) ? "png" : Pm(bArr) ? "gif" : Kbd(bArr) ? "bmp" : IPb(bArr) ? "ico" : "other";
    }

    private static boolean mZx(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = EYQ;
        return length >= bArr2.length && EYQ(bArr, bArr2);
    }

    private static boolean Td(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = mZx;
        return length >= bArr2.length && EYQ(bArr, bArr2);
    }

    private static boolean Pm(byte[] bArr) {
        return (bArr.length >= 6 && EYQ(bArr, Kbd)) || EYQ(bArr, IPb);
    }

    private static boolean Kbd(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = Pm;
        return length >= bArr2.length && EYQ(bArr, bArr2);
    }

    private static boolean IPb(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = Td;
        return length >= bArr2.length && EYQ(bArr, bArr2);
    }

    private static boolean EYQ(byte[] bArr, byte[] bArr2) {
        return EYQ(bArr, bArr2, 0);
    }

    private static boolean EYQ(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] EYQ(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
