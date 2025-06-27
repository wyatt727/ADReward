package com.bytedance.sdk.component.Td;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.utils.pi;
import com.json.m4;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AES.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static String EYQ;

    @Deprecated
    public static String EYQ(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(EYQ)) {
                EYQ = EYQ("AES/CBC/PKCS5Padding");
            }
            Cipher cipher = Cipher.getInstance(EYQ);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes(m4.M)), 0);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String EYQ(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(m4.M)), 0);
        } catch (Throwable th) {
            pi.mZx(th.getMessage());
            return null;
        }
    }

    public static String mZx(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Throwable th) {
            pi.mZx(th.getMessage());
            return null;
        }
    }

    @Deprecated
    public static String mZx(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(EYQ)) {
                EYQ = EYQ("AES/CBC/PKCS5Padding");
            }
            Cipher cipher = Cipher.getInstance(EYQ);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String EYQ(String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new String(EYQ(str.getBytes(), iArr));
    }

    public static byte[] EYQ(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr == null || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ iArr[i % iArr.length]);
        }
        return bArr2;
    }
}
