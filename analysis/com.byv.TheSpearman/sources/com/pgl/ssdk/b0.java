package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.json.i5;
import com.json.t2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f4305a = 504;
    public static String b = null;
    public static String c = "";
    private static Context d;

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, d, bArr);
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(i5.x, t2.e);
            jSONObject.put("version", "5.9.0.0.overseas-rc.8");
            String str = c;
            if (str == null || str.length() <= 0) {
                try {
                    jSONObject.put("token_id", b());
                } catch (Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            } else {
                jSONObject.put("token_id", c);
            }
            jSONObject.put("code", f4305a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static void a(Context context, String str, d0 d0Var) {
        if (d == null) {
            d = context;
        }
        int i = f4305a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        System.currentTimeMillis();
        b = str;
        f4305a = 102;
        AbstractC1403d.a(new c0(context, d0Var));
    }

    public static synchronized String b() {
        if (TextUtils.isEmpty(c)) {
            c = (String) com.pgl.ssdk.ces.a.meta(303, d, null);
        }
        return c;
    }

    public static void c() {
        Context context = d;
        if (context != null) {
            f4305a = 102;
            AbstractC1403d.a(new c0(context, null));
            com.pgl.ssdk.ces.f.e().a();
            C1423y.a();
        }
    }
}
