package com.facebook.ads.internal.util.common;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class FbValidationUtils {
    public static final String FB4A_SHA256_HASH = "4/nh4M+Z0OVqBVumXiQbM5n3zqUkMmsM3W7BMn7Q/cE=";
    public static final String FB_PACKAGE = "com.facebook.katana";

    public static String getSigningCertificate(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return "";
        }
        try {
            Signature[] signatureArr = packageInfo.signatures;
            return signatureArr.length == 0 ? "" : calculateSHA256Fingerprint(signatureArr[0].toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static String calculateSHA256Fingerprint(byte[] bArr) throws NoSuchAlgorithmException {
        return Base64.encodeToString(MessageDigest.getInstance("SHA256").digest(bArr), 2);
    }

    public static boolean isFbSigningCertificateValid(String str) {
        return FB4A_SHA256_HASH.equals(str);
    }
}
