package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;
import kotlin.text.Typography;

/* compiled from: AESKey.java */
/* loaded from: classes2.dex */
public final class EYQ {
    private static final String EYQ = Td();
    private static final String mZx = hu.Pm().Td();

    public static String EYQ() {
        return new String(Base64.decode(EYQ, 0)).substring(2);
    }

    public static String mZx() {
        return new String(Base64.decode(mZx, 0)).substring(2);
    }

    private static String Td() {
        char[] cArr = {203, Typography.paragraph, 168, Typography.degree, 207, 148, 149, 178, 205, Typography.paragraph, 149, 166, 134, 178, 184, Typography.degree, 206, Typography.registered, 187, 178, 150, 185, Typography.section, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }
}
