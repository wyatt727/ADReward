package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1423y {

    /* renamed from: a, reason: collision with root package name */
    private static Context f4325a;

    public static String a(Context context) {
        TelephonyManager telephonyManager;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", C1417s.a(context));
            Object objMeta = com.pgl.ssdk.ces.a.meta(155, context, null);
            jSONObject.put("usb_debug", objMeta instanceof Boolean ? ((Boolean) objMeta).booleanValue() : false);
            JSONArray[] jSONArrayArrB = C1417s.b(context);
            if (jSONArrayArrB != null) {
                jSONObject.put("sdata", jSONArrayArrB[0]);
                jSONObject.put("sdmta", jSONArrayArrB[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            int i = C1419u.b;
            if (i == -1) {
                SharedPreferences sharedPreferencesA = T.a(b());
                if (sharedPreferencesA == null || (i = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
                    AbstractC1403d.a(new RunnableC1418t());
                    i = -1;
                } else {
                    C1419u.b = i;
                }
            }
            jSONObject.put("camera_count", i);
            if (C1419u.f4322a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                C1419u.f4322a = telephonyManager.getSimState();
            }
            jSONObject.put("sim", C1419u.f4322a);
            jSONObject.put("virtual_display", A.a(context));
            jSONObject.put("acbs", C1416q.c(context));
            Object objMeta2 = com.pgl.ssdk.ces.a.meta(156, context, null);
            jSONObject.put("bl_unlock", objMeta2 instanceof Boolean ? ((Boolean) objMeta2).booleanValue() : false);
            jSONObject.put("easyclick", C1416q.a());
            C1421w.g();
            C1421w.a(jSONObject);
            String strD = r.d();
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put("sign", strD);
            }
            return (String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (Throwable th) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", 3);
                jSONObject2.put("exception", th.toString());
                jSONObject2.put("stacktrace", Arrays.toString(th.getStackTrace()));
                jSONObject2.put("cause", String.valueOf(th.getCause()));
                return Base64.encodeToString(jSONObject2.toString().getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME), 0);
            } catch (Throwable unused) {
                return "eyJzdGF0dXMiOjN9";
            }
        }
    }

    public static void a() {
        AbstractC1403d.a(new RunnableC1422x());
    }

    public static Context b() {
        return f4325a;
    }

    public static void b(Context context) {
        f4325a = context;
    }

    public static String c() {
        String strA = a(f4325a);
        a();
        return strA;
    }
}
