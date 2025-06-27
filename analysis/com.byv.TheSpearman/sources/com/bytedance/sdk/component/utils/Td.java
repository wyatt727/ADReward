package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: AppSigning.java */
/* loaded from: classes2.dex */
public class Td {
    private static HashMap<String, ArrayList<String>> EYQ = new HashMap<>();

    public static ArrayList<String> EYQ(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (EYQ.get(str) != null) {
                return EYQ.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : mZx(context, packageName)) {
                    String strEYQ = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strEYQ = EYQ(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strEYQ = EYQ(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strEYQ = EYQ(signature, "SHA256");
                    }
                    arrayList.add(strEYQ);
                }
            } catch (Exception e) {
                pi.mZx(e.toString());
            }
            EYQ.put(str, arrayList);
        }
        return arrayList;
    }

    public static String EYQ(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListEYQ = EYQ(context, "SHA1");
        if (arrayListEYQ != null && arrayListEYQ.size() != 0) {
            for (int i = 0; i < arrayListEYQ.size(); i++) {
                sb.append(arrayListEYQ.get(i));
                if (i < arrayListEYQ.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static Signature[] mZx(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            pi.mZx(e.toString());
            return null;
        }
    }

    private static String EYQ(Signature signature, String str) throws NoSuchAlgorithmException {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e) {
            pi.mZx(e.toString());
            return "error!";
        }
    }
}
