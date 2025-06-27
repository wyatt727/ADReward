package com.json.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.json.ab;
import com.json.bb;
import com.json.m7;
import com.json.n7;
import com.json.o4;
import com.json.q8;
import com.json.s8;
import com.json.sdk.controller.e;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import com.json.wd;
import com.json.y8;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IronSourceNetwork {

    /* renamed from: a, reason: collision with root package name */
    static final String f2131a = "IronSourceNetwork";
    private static y8 b;
    private static ab c;
    private static JSONObject d;

    private static synchronized void a() throws Exception {
        if (b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            o4 o4VarA = n7.a(jSONObject);
            if (o4VarA.a()) {
                m7.a(o4VarA, n7.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void applyConsentInfo(JSONObject jSONObject) {
        y8 y8Var = b;
        if (y8Var == null) {
            return;
        }
        if (jSONObject == null) {
            return;
        }
        y8Var.a(jSONObject);
    }

    public static synchronized void destroyAd(q8 q8Var) throws Exception {
        a();
        b.b(q8Var);
    }

    public static synchronized e getControllerManager() {
        return b.a();
    }

    public static ab getInitListener() {
        return c;
    }

    public static synchronized void getOfferWallCredits(bb bbVar) throws Exception {
        a();
        b.a(bbVar);
    }

    public static synchronized JSONObject getRawToken(Context context) {
        return wd.d().c(context);
    }

    public static synchronized String getToken(Context context) {
        return wd.d().d(context);
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initOfferWall(Map<String, String> map, bb bbVar) throws Exception {
        a();
        b.a(map, bbVar);
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f2131a, "applicationKey is NULL");
            return;
        }
        if (b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e) {
                Logger.e(f2131a, "Failed to init event tracker: " + e.getMessage());
            }
            b = s8.a(context, str, str2);
            applyConsentInfo(d);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(q8 q8Var) {
        y8 y8Var = b;
        if (y8Var == null) {
            return false;
        }
        return y8Var.a(q8Var);
    }

    public static synchronized void loadAd(q8 q8Var, Map<String, String> map) throws Exception {
        a();
        b.a(q8Var, map);
    }

    public static synchronized void loadAdView(Activity activity, q8 q8Var, Map<String, String> map) throws Exception {
        a();
        b.b(activity, q8Var, map);
    }

    public static void onPause(Activity activity) {
        y8 y8Var = b;
        if (y8Var == null) {
            return;
        }
        y8Var.onPause(activity);
    }

    public static void onResume(Activity activity) {
        y8 y8Var = b;
        if (y8Var == null) {
            return;
        }
        y8Var.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        y8 y8Var = b;
        if (y8Var == null) {
            return;
        }
        y8Var.a(activity);
    }

    public static synchronized void setInitListener(ab abVar) {
        c = abVar;
    }

    public static synchronized void showAd(Activity activity, q8 q8Var, Map<String, String> map) throws Exception {
        a();
        b.a(activity, q8Var, map);
    }

    public static synchronized void showOfferWall(Activity activity, Map<String, String> map) throws Exception {
        a();
        b.a(activity, map);
    }

    public static synchronized void updateConsentInfo(JSONObject jSONObject) {
        d = jSONObject;
        applyConsentInfo(jSONObject);
    }

    public static synchronized void updateMetadata(JSONObject jSONObject) {
        wd.d().b(jSONObject);
    }
}
