package com.bytedance.sdk.openadsdk.utils;

import java.security.SecureRandom;
import java.util.UUID;
import okio.Utf8;

/* compiled from: PangleUUID.java */
/* loaded from: classes2.dex */
public class hYh {
    private static final ThreadLocal<SecureRandom> EYQ = new ThreadLocal<>();

    public static String EYQ() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = EYQ;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        bArr[6] = (byte) (bArr[6] & 15);
        bArr[6] = (byte) (bArr[6] | 64);
        bArr[8] = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = (byte) (bArr[8] | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | (bArr[i] & 255);
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return new UUID(j2, j).toString();
    }
}
