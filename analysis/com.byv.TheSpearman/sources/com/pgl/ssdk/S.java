package com.pgl.ssdk;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class S {

    /* renamed from: a, reason: collision with root package name */
    private static List f4299a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:69:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.pgl.ssdk.Q a(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.S.a(android.content.Context, java.lang.String):com.pgl.ssdk.Q");
    }

    private static String a(ZipFile zipFile, String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List listAsList = Build.VERSION.SDK_INT >= 21 ? Arrays.asList(Build.SUPPORTED_ABIS) : null;
        ArrayList arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(Build.CPU_ABI)) {
            arrayList2.add(Build.CPU_ABI);
        }
        if (!TextUtils.isEmpty(Build.CPU_ABI2)) {
            arrayList2.add(Build.CPU_ABI2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", listAsList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int iIndexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (iIndexOf <= 0) {
            iIndexOf = str.length();
        }
        sb.append(str.substring(0, iIndexOf));
        sb.append("/");
        sb.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb.toString());
    }
}
