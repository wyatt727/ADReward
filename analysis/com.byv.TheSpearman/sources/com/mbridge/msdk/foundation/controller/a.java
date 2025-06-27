package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseMBSDKContext.java */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2757a = "c";
    public static HashMap<String, String> b = new HashMap<>();
    protected String c;
    protected Context d;
    protected String e;
    private WeakReference<Activity> g;
    private String h;
    private int i;
    private String l;
    private String m;
    private int n;
    private WeakReference<Context> p;
    private JSONObject q;
    private String s;
    private final g f = new g();
    private JSONObject j = new JSONObject();
    private boolean k = false;
    private ConcurrentHashMap<String, String> o = new ConcurrentHashMap<>();
    private int r = 0;

    /* compiled from: BaseMBSDKContext.java */
    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    public interface InterfaceC0263a {
    }

    protected abstract void a(InterfaceC0263a interfaceC0263a);

    public final WeakReference<Activity> a() {
        return this.g;
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.g = weakReference;
    }

    public final String b() {
        if (!TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        Context context = this.d;
        if (context != null) {
            return (String) al.a(context, "sp_appKey", "");
        }
        return null;
    }

    public final Context c() {
        return this.d;
    }

    public final g d() {
        return this.f;
    }

    public final Context e() {
        WeakReference<Context> weakReference = this.p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            this.p = new WeakReference<>(context);
        }
    }

    public final int f() {
        return this.i;
    }

    public final void a(int i) {
        this.i = i;
    }

    public final String g() {
        try {
            if (!TextUtils.isEmpty(this.e)) {
                return this.e;
            }
            Context context = this.d;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.e = packageName;
            return packageName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void b(int i) {
        this.n = i;
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.m)) {
            return this.m;
        }
        Context context = this.d;
        if (context != null) {
            return (String) al.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.m = str;
            Context context = this.d;
            if (context != null) {
                al.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final BitmapDrawable a(String str, int i) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.o) == null || !concurrentHashMap.containsKey(str) || !af.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.o.get(str);
        BitmapDrawable bitmapDrawableN = ai.n(str2);
        k.a(str, i, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : bitmapDrawableN != null ? "" : "str to bitmap failed", bitmapDrawableN == null ? 2 : 1, str2);
        return bitmapDrawableN;
    }

    public final JSONObject i() {
        return this.q;
    }

    public final void a(JSONObject jSONObject) {
        this.q = jSONObject;
    }

    public final int j() {
        return this.r;
    }

    public final void c(int i) {
        this.r = i;
    }

    public final void a(final InterfaceC0263a interfaceC0263a, final Handler handler) throws JSONException {
        if (this.k) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.a() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = al.a(this.d, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = al.a(this.d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (!TextUtils.isEmpty(str)) {
                        z.a(str);
                    } else {
                        z.c();
                    }
                    if (objA2 instanceof Integer) {
                        z.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e) {
            ad.b(f2757a, e.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e2) {
            ad.b(f2757a, e2.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    z.o(a.this.d);
                    a.this.a(interfaceC0263a);
                    h.a(a.this.d, a.this.c);
                } catch (Exception e3) {
                    ad.b(a.f2757a, e3.getMessage());
                }
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        z.c(a.this.d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z.c(0);
                    } catch (Throwable th) {
                        ad.b(a.f2757a, th.getMessage());
                    }
                }
                try {
                    com.mbridge.msdk.c.g gVarB = h.a().b(c.m().k());
                    if (gVarB == null) {
                        h.a();
                        gVarB = i.a();
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = gVarB;
                    messageObtain.what = 9;
                    handler.sendMessage(messageObtain);
                } catch (Exception e4) {
                    ad.b(a.f2757a, e4.getMessage());
                }
            }
        }).start();
    }

    public final String k() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        Context context = this.d;
        if (context != null) {
            return (String) al.a(context, "sp_appId", "");
        }
        return "";
    }

    public final void b(String str) {
        try {
            if (this.o != null && !TextUtils.isEmpty(str) && this.o.containsKey(str)) {
                this.o.remove(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c(String str) {
        Context context;
        try {
            this.h = str;
            if (TextUtils.isEmpty(str) || (context = this.d) == null) {
                return;
            }
            al.b(context, "applicationIds", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, JSONObject jSONObject) throws JSONException {
        if (af.a().a("w_m_r_l", true)) {
            try {
                if (this.j == null) {
                    this.j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.j.put(next, jSONObject.get(next));
                    }
                }
                if (this.j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.o == null) {
                        this.o = new ConcurrentHashMap<>();
                    }
                    this.o.put(str, this.j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void d(String str) {
        Context context;
        try {
            this.c = str;
            if (TextUtils.isEmpty(str) || (context = this.d) == null) {
                return;
            }
            al.b(context, "sp_appId", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void e(String str) {
        Context context;
        try {
            this.l = str;
            if (TextUtils.isEmpty(str) || (context = this.d) == null) {
                return;
            }
            al.b(context, "sp_appKey", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(Context context) {
        this.d = context;
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = str;
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.s)) {
            return this.s;
        }
        try {
            String md5 = SameMD5.getMD5(c.m().k() + c.m().b());
            this.s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }
}
