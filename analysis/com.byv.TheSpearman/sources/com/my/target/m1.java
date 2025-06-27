package com.my.target;

import android.util.Base64;
import android.util.Base64OutputStream;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes4.dex */
public class m1 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Map<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
                boolean z = true;
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String value = entry.getValue();
                        if (value != null) {
                            String key = entry.getKey();
                            String strB = da.b(value);
                            if (z) {
                                z = false;
                            } else {
                                deflaterOutputStream.write(38);
                            }
                            deflaterOutputStream.write(key.getBytes());
                            deflaterOutputStream.write(61);
                            deflaterOutputStream.write(strB.getBytes());
                        }
                    }
                    deflaterOutputStream.close();
                    String string = byteArrayOutputStream.toString();
                    deflaterOutputStream.close();
                    byteArrayOutputStream.close();
                    return string;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            ba.a("EncryptionUtils: Cannot encode message - " + th.getMessage());
            return "";
        }
    }

    public static String b(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
                try {
                    deflaterOutputStream.write(str.getBytes());
                    deflaterOutputStream.close();
                    String string = byteArrayOutputStream.toString();
                    deflaterOutputStream.close();
                    byteArrayOutputStream.close();
                    return string;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            ba.a("EncryptionUtils: Cannot obtain bidder token - " + th.getMessage());
            return "";
        }
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(Charset.forName(C.UTF8_NAME)));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return sb.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }
}
