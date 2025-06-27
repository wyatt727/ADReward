package com.json;

import android.content.Context;
import android.text.TextUtils;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.WaterfallConfiguration;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class x8 {

    /* renamed from: a, reason: collision with root package name */
    m5 f2440a = new m5();

    public void a(int i) {
        this.f2440a.a(i5.V, Integer.valueOf(i));
    }

    public void a(Context context) {
        this.f2440a.a(context);
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(i5.V0, waterfallConfiguration.getCom.ironsource.unity.androidbridge.AndroidBridgeConstants.WATERFALL_CONFIG_FLOOR_KEY java.lang.String());
                jSONObject.put(i5.W0, waterfallConfiguration.getCeiling());
            } catch (JSONException unused) {
            }
        }
        if (jSONObject.length() == 0) {
            this.f2440a.a(i5.U0, i0.a(ad_unit));
        } else {
            this.f2440a.a(i5.U0, jSONObject, i0.a(ad_unit));
        }
    }

    public void a(n6 n6Var) {
        try {
            HashMap map = new HashMap();
            map.put(i5.w, n6Var.a());
            map.put(i5.v, n6Var.b());
            map.put(i5.J, n6Var.c());
            this.f2440a.a(map);
        } catch (Exception unused) {
        }
    }

    public void a(Boolean bool) {
        this.f2440a.a(i5.v0, bool);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2440a.a(i5.r0, str);
    }

    public void a(JSONObject jSONObject) {
        this.f2440a.a(i5.r, (Object) jSONObject);
    }

    public void a(boolean z) {
        this.f2440a.a(i5.t0, Boolean.valueOf(z));
    }

    public void b(int i) {
        if (i >= 0) {
            this.f2440a.a(i5.u0, Integer.valueOf(i));
        }
    }

    public void b(String str) {
        this.f2440a.a(i5.n0, str);
    }

    public void b(JSONObject jSONObject) {
        this.f2440a.a(i5.G0, (Object) jSONObject);
    }

    public void b(boolean z) {
        this.f2440a.a("gpi", Boolean.valueOf(z));
    }

    public void c(int i) {
        this.f2440a.a(i5.T, Integer.valueOf(i));
    }

    public void c(String str) {
        this.f2440a.a(i5.p0, str);
    }

    public void d(String str) {
        this.f2440a.a("mt", str);
    }

    public void e(String str) {
        this.f2440a.a(i5.t, str);
    }

    public void f(String str) {
        this.f2440a.a(i5.B, str);
    }

    public void g(String str) {
        this.f2440a.a("sid", str);
    }

    public void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2440a.a(i5.S, str);
    }
}
