package com.json.sdk.controller;

import android.webkit.JavascriptInterface;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class g {
    private static final String c = "com.ironsource.sdk.controller.g";
    private static final String d = "functionName";
    private static final String e = "params";
    private static final String f = "hash";

    /* renamed from: a, reason: collision with root package name */
    private final b f2182a;
    private final s b;

    g(b bVar, s sVar) {
        this.f2182a = bVar;
        this.b = sVar;
    }

    private String a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f, SDKUtils.encodeString(str3));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void a(Exception exc) {
        exc.printStackTrace();
        Logger.i(c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void a(String str, String str2) throws Exception {
        this.f2182a.a(str, str2);
    }

    private void b(String str, String str2, String str3) {
        this.f2182a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(c, "messageHandler(" + str + " " + str3 + ")");
            if (this.b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e2) {
            a(e2);
        }
    }
}
