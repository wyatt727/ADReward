package com.json.sdk.controller;

import com.json.aa;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* loaded from: classes4.dex */
final class s {
    private static final String b = "MD5";

    /* renamed from: a, reason: collision with root package name */
    private String f2218a;

    s(String str) {
        this.f2218a = str;
    }

    static String a() {
        return UUID.randomUUID().toString();
    }

    private String a(String str) {
        try {
            return aa.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private String b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f2218a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    String b() {
        return this.f2218a;
    }
}
