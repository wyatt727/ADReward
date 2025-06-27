package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.pgl.ssdk.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1417s {

    /* renamed from: a, reason: collision with root package name */
    private static String f4321a;
    private static long[][] b;

    public static String a(Context context) {
        String str = f4321a;
        if (str != null) {
            return str;
        }
        f4321a = Build.VERSION.SDK_INT >= 24 ? Settings.Global.getString(context.getContentResolver(), "boot_count") : "lowapi";
        return f4321a;
    }

    public static JSONArray[] b(Context context) throws JSONException {
        if (b == null) {
            b = (long[][]) com.pgl.ssdk.ces.a.meta(157, context, null);
        }
        long[][] jArr = b;
        if (jArr == null || jArr.length != 2) {
            b = null;
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long[][] jArr2 = b;
        long[] jArr3 = jArr2[0];
        long[] jArr4 = jArr2[1];
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jArr3.length; i++) {
            try {
                jSONArray.put(i, jCurrentTimeMillis - jArr3[i]);
                jSONArray2.put(i, jCurrentTimeMillis - jArr4[i]);
            } catch (JSONException unused) {
            }
        }
        return new JSONArray[]{jSONArray, jSONArray2};
    }
}
