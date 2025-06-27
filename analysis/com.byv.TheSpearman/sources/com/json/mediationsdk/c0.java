package com.json.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.json.b6;
import com.json.ca;
import com.json.environment.ContextProvider;
import com.json.environment.StringUtils;
import com.json.m9;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.p0;
import com.json.td;
import com.json.x7;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class c0 {
    private static c0 d;
    private final x7 b = ca.h().d();
    private final b6 c = ca.h().c();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f1917a = new JSONObject();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c0 c0Var = c0.this;
                c0Var.a(c0Var.c());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            a(next, jSONObject.opt(next));
        }
    }

    private void b() {
        a(e());
        a(d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject c() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String strP = this.c.p(applicationContext);
                String strA = this.c.a(applicationContext);
                if (TextUtils.isEmpty(strP)) {
                    strP = this.c.J(applicationContext);
                    str = !TextUtils.isEmpty(strP) ? IronSourceConstants.TYPE_UUID : "";
                } else {
                    str = IronSourceConstants.TYPE_GAID;
                }
                if (!TextUtils.isEmpty(strP)) {
                    jSONObject.put(td.b, strP);
                    jSONObject.put(td.D, str);
                }
                if (!TextUtils.isEmpty(strA)) {
                    jSONObject.put(td.E, Boolean.parseBoolean(strA));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static synchronized c0 f() {
        if (d == null) {
            d = new c0();
        }
        return d;
    }

    void a() {
        try {
            new Thread(new a()).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void a(String str, Object obj) {
        try {
            this.f1917a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int iD = this.c.d();
        int iJ = this.c.j();
        float fH = this.c.h();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMapC = c.b().c();
                concurrentHashMapC.putAll(m9.b().c());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMapC.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                Boolean boolJ = p.p().j();
                if (boolJ != null) {
                    jSONObject.put("consent", boolJ.booleanValue());
                }
                String strD = this.c.D(applicationContext);
                if (!TextUtils.isEmpty(strD)) {
                    jSONObject.put("asid", strD);
                }
                jSONObject.put(td.f, IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put(td.V, this.c.m(applicationContext));
                jSONObject.put(td.y, this.c.f());
                jSONObject.put("bat", this.c.w(applicationContext));
                jSONObject.put(td.z, this.c.n());
                jSONObject.put(td.B, jSONObject2);
                jSONObject.put(td.j, new Date().getTime());
                jSONObject.put(td.g, iD);
                jSONObject.put(td.h, iJ);
                jSONObject.put(td.M, String.valueOf(fH));
                jSONObject.put(td.l, this.b.a(IronSource.AD_UNIT.INTERSTITIAL));
                jSONObject.put(td.k, this.b.a(IronSource.AD_UNIT.REWARDED_VIDEO));
                jSONObject.put(td.G, this.c.s());
            } catch (JSONException e) {
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(td.A, StringUtils.toUpperCase(language));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put(td.n, pluginType);
                }
                String strO = this.c.o();
                if (strO != null) {
                    jSONObject.put(td.p, strO);
                    jSONObject.put(td.o, strO.replaceAll("[^0-9/.]", ""));
                }
                String strS = this.c.s(applicationContext);
                if (strS != null) {
                    jSONObject.put("auid", strS);
                }
                jSONObject.put(td.m, IronSourceUtils.getSessionId());
                jSONObject.put("appKey", p.p().q());
                jSONObject.put(td.d, this.c.j(applicationContext));
                jSONObject.put(td.e, IronSourceUtils.getSDKVersion());
                jSONObject.put(td.i, Build.MODEL);
                jSONObject.put(td.q, "android");
                jSONObject.put(td.r, Build.MANUFACTURER);
                jSONObject.put(td.s, String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put(td.t, applicationContext.getPackageName());
                jSONObject.put(td.u, p0.b(applicationContext, applicationContext.getPackageName()));
                String strR = p.p().r();
                if (!TextUtils.isEmpty(strR)) {
                    jSONObject.put(td.v, strR);
                }
            } catch (JSONException e) {
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    JSONObject g() {
        b();
        return this.f1917a;
    }
}
