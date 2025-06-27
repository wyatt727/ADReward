package com.iab.omid.library.corpmailru.d;

import android.os.Build;
import com.json.i5;
import com.json.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return t2.e;
    }

    public static JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "deviceType", a());
        b.a(jSONObject, "osVersion", b());
        b.a(jSONObject, i5.x, c());
        return jSONObject;
    }
}
