package com.json;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.json.sdk.utils.IronSourceQaProperties;
import com.json.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wd {
    private static wd c;
    private final b6 b = ca.h().c();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f2433a = new JSONObject();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2434a;

        a(Context context) {
            this.f2434a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                wd.this.a(w3.a(this.f2434a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private wd() {
    }

    public static synchronized wd d() {
        if (c == null) {
            c = new wd();
        }
        return c;
    }

    public void a() {
        HashMap map = new HashMap();
        map.put("omidVersion", ra.f);
        map.put("omidPartnerVersion", ra.e);
        c.a(map);
    }

    public void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(this.b.a(activity)));
        }
        a("appOrientation", SDKUtils.translateRequestedOrientation(this.b.K(activity)));
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            new Thread(new a(context)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Context context, String str, String str2) {
        a(context);
        if (context instanceof Activity) {
            a((Activity) context);
        }
        b(context);
        b(str2);
        a(str);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a("applicationKey", SDKUtils.encodeString(str));
    }

    synchronized void a(String str, Object obj) {
        try {
            this.f2433a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String str : map.keySet()) {
            a(str, SDKUtils.encodeString(map.get(str)));
        }
    }

    public void a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            a(next, jSONObject.opt(next));
        }
    }

    public void b() {
        if (IronSourceQaProperties.isInitialized()) {
            c.a(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        a(w3.c(context));
        a(w3.b(context));
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a("applicationUserId", SDKUtils.encodeString(str));
    }

    public void b(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            a(td.r1 + next, jSONObject.opt(next));
        }
    }

    public JSONObject c(Context context) {
        c();
        b(context);
        try {
            return new JSONObject(this.f2433a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public void c() {
        c(SDKUtils.getControllerConfig());
        a(SDKUtils.getInitSDKParams());
        b();
        a();
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String d(Context context) {
        try {
            return h5.b(c(context).toString());
        } catch (Exception unused) {
            return h5.b(new JSONObject().toString());
        }
    }
}
