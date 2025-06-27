package com.json;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.json.f7;
import com.json.sdk.utils.IronSourceQaProperties;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.SDKUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pa {
    private final b6 b = ca.h().c();

    /* renamed from: a, reason: collision with root package name */
    m5 f2062a = new m5();

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f2062a.a("debug", jSONObject);
        }
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                this.f2062a.a("imm", Boolean.valueOf(this.b.a(activity)));
            }
        }
    }

    public void a(f7.c cVar) {
        this.f2062a.a(i5.Z0, Integer.valueOf(cVar.ordinal()));
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.f2062a.a(i5.k, jSONObject);
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f2062a.a(i5.i, new JSONObject(controllerConfig).opt("chinaCDN"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void b(Context context) {
        this.f2062a.a("gpi", Boolean.valueOf(jb.d(context)));
    }

    public void c() {
        this.f2062a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f2062a.a(i5.J, "7.9.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(i5.w, ra.f);
        map.put(i5.v, ra.e);
        this.f2062a.a(map);
    }
}
