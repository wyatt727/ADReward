package com.json;

import android.text.TextUtils;
import android.util.Base64;
import com.json.mediationsdk.logger.IronLog;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public class c9 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1719a = 1024;
    public static final String b = "RSA/ECB/PKCS1Padding";

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(a(str.getBytes(C.UTF8_NAME), a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e) {
            IronLog.INTERNAL.error("exception on string encryption error: " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static KeyPair a() throws NoSuchAlgorithmException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            IronLog.INTERNAL.error("exception on key generation error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static RSAPublicKey a(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static byte[] a(byte[] bArr, PrivateKey privateKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            IronLog.INTERNAL.error("exception on encryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
