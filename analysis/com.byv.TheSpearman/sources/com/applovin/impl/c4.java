package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f310a = {7, 4, 2, 1, 11};
    private static final int[] b = {5, 6, 12, 10, 3, 9, 8, 14};
    private static final int[] c = {15, 13};
    private static final int[] d = {20};

    public static String g(com.applovin.impl.sdk.k kVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.k.k());
        if (networkInfoB == null) {
            return "unknown";
        }
        int type = networkInfoB.getType();
        int subtype = networkInfoB.getSubtype();
        return type == 1 ? com.json.p2.b : type == 0 ? a(subtype, f310a) ? "2g" : a(subtype, b) ? com.json.p2.f2055a : a(subtype, c) ? "4g" : a(subtype, d) ? "5g" : "mobile" : "unknown";
    }

    public static int h(com.applovin.impl.sdk.k kVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.k.k());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return 2;
            }
            if (type == 0) {
                if (a(subtype, f310a)) {
                    return 4;
                }
                if (a(subtype, b)) {
                    return 5;
                }
                if (a(subtype, c)) {
                    return 6;
                }
                return a(subtype, d) ? 7 : 3;
            }
        }
        return 0;
    }

    public static String b(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.K0), str, kVar);
    }

    public static String a(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.L0), str, kVar);
    }

    public static Map c(com.applovin.impl.sdk.k kVar) {
        HashMap map = new HashMap();
        String str = (String) kVar.a(oj.k);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) kVar.a(oj.j5)).booleanValue()) {
            map.put("api_key", kVar.d0());
        }
        if (kVar.y() != null) {
            map.putAll(zp.a(kVar.y().a()));
        } else {
            map.putAll(zp.a(kVar.x().e()));
        }
        return map;
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (kVar != null) {
            return str + str2;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar != null) {
            try {
                if (jSONObject.has(com.json.mediationsdk.d.g)) {
                    pj pjVarH0 = kVar.h0();
                    if (jSONObject.isNull(com.json.mediationsdk.d.g)) {
                        return;
                    }
                    pjVarH0.a(jSONObject.getJSONObject(com.json.mediationsdk.d.g));
                    pjVarH0.e();
                    return;
                }
                return;
            } catch (JSONException e) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("ConnectionUtils", "Unable to parse settings out of API response", e);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String e(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.I0), "4.0/ad", kVar);
    }

    public static String d(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.J0), "4.0/ad", kVar);
    }

    public static Long f(com.applovin.impl.sdk.k kVar) {
        b4.d dVarA = kVar.r().a();
        if (dVarA == null) {
            return null;
        }
        double dC = zp.c(dVarA.b());
        double d2 = zp.d(dVarA.a());
        if (d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return Long.valueOf((long) (dC / d2));
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.I0), ((Boolean) kVar.a(oj.q3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.J0), ((Boolean) kVar.a(oj.q3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void a(int i, com.applovin.impl.sdk.k kVar) {
        if (i == 401) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "SDK key \"" + kVar.d0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i == 418) {
            kVar.h0().a(oj.f, Boolean.TRUE);
            kVar.h0().e();
        } else if (i >= 400 && i < 500) {
            if (((Boolean) kVar.a(oj.h)).booleanValue()) {
                kVar.U0();
            }
        } else if (i == -1 && ((Boolean) kVar.a(oj.h)).booleanValue()) {
            kVar.U0();
        }
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            kVar.b(qj.H, string);
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.k kVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(oj.j3)).intValue()];
        while (true) {
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z, com.applovin.impl.sdk.k kVar) {
        kVar.o().a(jSONObject, z);
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    sj.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }
}
