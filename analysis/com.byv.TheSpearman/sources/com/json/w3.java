package com.json;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2380a = "w3";

    public static JSONObject a(Context context) throws JSONException {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f2380a, "add AID");
                jSONObject.put("deviceIds" + t2.i.d + "AID" + t2.i.e, SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f2380a, "add LAT");
                jSONObject.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(limitAdTracking));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static void a(Context context, JSONObject jSONObject) throws JSONException {
        b6 b6VarC = ca.h().c();
        try {
            if (a("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), b6VarC.c(context));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a(JSONObject jSONObject) {
        b6 b6VarC = ca.h().c();
        try {
            a(jSONObject, "displaySizeWidth", String.valueOf(b6VarC.d()));
            a(jSONObject, "displaySizeHeight", String.valueOf(b6VarC.j()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    public static JSONObject b(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void b(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), ca.h().c().w(context));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void b(JSONObject jSONObject) throws JSONException {
        b6 b6VarC = ca.h().c();
        try {
            if (a("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), b6VarC.c());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONObject c(Context context) throws JSONException {
        b6 b6VarC = ca.h().c();
        x3 x3VarB = x3.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = x3VarB.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = x3VarB.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            }
            String strE = x3VarB.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(strE));
            }
            String strF = x3VarB.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = x3VarB.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(strF2));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(x3VarB.a()));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (x3VarB.b() != null && x3VarB.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(x3VarB.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(b6VarC.h(context))));
            }
            String strG = p0.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(b6VarC.h());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(b6VarC.f());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), jb.d(context));
            jSONObject.put("mcc", p2.b(context));
            jSONObject.put("mnc", p2.c(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), p2.e(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(p2.f(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), p0.f(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), p0.d(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(p0.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), jb.c(context));
            String strE2 = p0.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(strE2));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(b6VarC.i())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(b6VarC.p())));
            String strN = b6VarC.n(context);
            if (!TextUtils.isEmpty(strN)) {
                jSONObject.put("icc", strN);
            }
            String strB = b6VarC.b();
            if (!TextUtils.isEmpty(strB)) {
                jSONObject.put("tz", SDKUtils.encodeString(strB));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static void c(Context context, JSONObject jSONObject) throws JSONException {
        b6 b6VarC = ca.h().c();
        try {
            if (a("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), b6VarC.l(context));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void c(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(ca.h().c().n())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void d(Context context, JSONObject jSONObject) throws JSONException {
        try {
            String strB = q2.b(context);
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), q2.d(context));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void e(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), x3.b(context).a(context));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void f(Context context, JSONObject jSONObject) throws JSONException {
        b6 b6VarC = ca.h().c();
        try {
            if (a("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), b6VarC.G(context));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void g(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), ca.h().c().q(context));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void h(Context context, JSONObject jSONObject) throws JSONException {
        b6 b6VarC = ca.h().c();
        try {
            if (a("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), b6VarC.d(context));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
