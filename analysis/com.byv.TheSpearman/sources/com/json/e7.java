package com.json;

import android.content.Context;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.Logger;
import com.json.t2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e7 implements l0 {
    private static final String b = "e7";
    private static e7 c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, w7> f1751a = Collections.synchronizedMap(new HashMap());

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d7 f1752a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(d7 d7Var, Context context, String str) {
            this.f1752a = d7Var;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            e7.this.f1751a.put(this.c, new y6(this.f1752a, this.b));
        }
    }

    public static synchronized e7 a() {
        if (c == null) {
            c = new e7();
        }
        return c;
    }

    private w6 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(t2.h.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new w6(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new w6();
        }
    }

    private w6 b(JSONObject jSONObject) {
        w6 w6Var = new w6();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return w6Var;
        }
    }

    private boolean d(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean(t2.h.s0);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.json.l0
    public w7 a(String str) {
        if (str.isEmpty() || !this.f1751a.containsKey(str)) {
            return null;
        }
        return this.f1751a.get(str);
    }

    public void a(z6 z6Var, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        w6 w6VarB = b(jSONObject);
        if (this.f1751a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        d7 d7Var = new d7(z6Var, context, string, w6VarB);
        d7Var.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        d7Var.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            o6.f2043a.c(new a(d7Var, context, string));
        } else {
            this.f1751a.put(string, d7Var);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f1751a.containsKey(string)) {
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = this.f1751a.get(string);
        if (w7Var != null) {
            w7Var.a(jSONObject, str, str2);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f1751a.containsKey(string)) {
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = this.f1751a.get(string);
        String string2 = jSONObject.getString(t2.h.v0);
        if (w7Var != null) {
            w7Var.a(string2, str, str2);
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f1751a.containsKey(string)) {
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = this.f1751a.get(string);
        this.f1751a.remove(string);
        if (w7Var != null) {
            w7Var.a(str, str2);
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f1751a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = this.f1751a.get(string);
        if (w7Var != null) {
            w7Var.c(jSONObject, str, str2);
        }
    }
}
