package com.json;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b7 {

    /* renamed from: a, reason: collision with root package name */
    private z6 f1707a;
    private WebView c;
    private String d;
    private String e = "b7";
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {x6.h, x6.i, x6.g, "handleGetViewVisibility", x6.j};
    private fe b = new fe();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1708a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ JSONObject d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f1708a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!b7.this.b(this.f1708a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f1708a;
                    Log.e(b7.this.e, str);
                    b7.this.a(this.b, str);
                    return;
                }
                if (this.f1708a.equalsIgnoreCase("handleGetViewVisibility")) {
                    b7.this.e(this.c);
                } else if (this.f1708a.equalsIgnoreCase(x6.j) || this.f1708a.equalsIgnoreCase(x6.i)) {
                    b7.this.a(this.d.getString("params"), this.c, this.b);
                }
            } catch (Exception e) {
                e.printStackTrace();
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f1708a;
                Log.e(b7.this.e, str2);
                b7.this.a(this.b, str2);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1709a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.f1709a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    b7.this.c.evaluateJavascript(this.f1709a, null);
                } else {
                    b7.this.c.loadUrl(this.f1709a);
                }
            } catch (Throwable unused) {
                Log.e(b7.this.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private String a(String str) {
        return String.format(x6.u, str);
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
        } catch (Exception e) {
            Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        if (this.f1707a == null || this.b == null) {
            return;
        }
        a(x6.f2439a, a());
    }

    private void d(String str) {
        o6.f2043a.c(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    private boolean h(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(Build.VERSION.SDK_INT <= 22 ? x6.l : x6.k);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(x6.s, this.b.a());
            jSONObject.put(x6.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public void a(WebView webView) {
        this.c = webView;
    }

    public void a(z6 z6Var) {
        this.f1707a = z6Var;
    }

    public void a(String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public void a(String str, String str2) {
        z6 z6Var = this.f1707a;
        if (z6Var != null) {
            z6Var.a(str, str2, this.d);
        }
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.e, str4);
            this.f1707a.a(str3, str4, this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        z6 z6Var = this.f1707a;
        if (z6Var != null) {
            z6Var.a(str, jSONObject);
        }
    }

    void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f1707a == null) {
            m7.a(hc.t, new h7().a(m4.x, "mDelegate is null").a());
        } else {
            o6.f2043a.c(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void b() {
        this.f1707a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (TextUtils.isEmpty(strOptString) || !h(strOptString)) {
                a(jSONObject.optString(x6.v, x6.c), jSONObject);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            Log.e(this.e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }

    public void e() {
        if (this.f1707a == null || this.b == null) {
            return;
        }
        a(x6.b, a());
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.b.a();
        jSONObjectA.put("adViewId", this.d);
        a(str, jSONObjectA);
    }

    public void f(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void g(String str) {
        this.d = str;
    }
}
