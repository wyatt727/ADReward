package com.json;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.json.environment.thread.IronSourceThreadManager;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class j5 {

    /* renamed from: a, reason: collision with root package name */
    private final b6 f1825a;
    private final ConcurrentHashMap<String, Object> b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1826a;

        a(Context context) {
            this.f1826a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j5.this.e(this.f1826a);
            } catch (Exception unused) {
            }
            j5.this.c.set(false);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static volatile j5 f1827a = new j5(null);

        private b() {
        }
    }

    private j5() {
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.f1825a = ca.h().c();
        this.b = new ConcurrentHashMap<>();
    }

    /* synthetic */ j5(a aVar) {
        this();
    }

    static j5 a() {
        return b.f1827a;
    }

    private void a(Context context) {
        if (this.c.get()) {
            return;
        }
        try {
            this.c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception unused) {
            this.c.set(false);
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.b.put(str, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return this.b.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void d(Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.f1825a.s(context));
        a(i5.u, this.f1825a.e());
        a(i5.q, this.f1825a.g());
        a(i5.x, this.f1825a.l());
        String strO = this.f1825a.o();
        if (strO != null) {
            a(i5.y, strO.replaceAll("[^0-9/.]", ""));
            a(i5.z, strO);
        }
        a(i5.f1812a, String.valueOf(this.f1825a.k()));
        String strJ = this.f1825a.j(context);
        if (!TextUtils.isEmpty(strJ)) {
            a(i5.s0, strJ);
        }
        String strE = p0.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(i5.n, strE);
        }
        String strI = this.f1825a.i(context);
        if (!TextUtils.isEmpty(strI)) {
            a(i5.f0, strI);
        }
        a("bid", context.getPackageName());
        a(i5.s, String.valueOf(this.f1825a.h(context)));
        a(i5.P, "2.0");
        a(i5.Q, Long.valueOf(p0.f(context)));
        a(i5.O, Long.valueOf(p0.d(context)));
        a(i5.d, p0.b(context));
        a(i5.C, Integer.valueOf(p2.e(context)));
        a(i5.M, p2.f(context));
        a("stid", jb.c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strP = this.f1825a.p(context);
            if (!TextUtils.isEmpty(strP)) {
                a(i5.w0, strP);
            }
            String strA = this.f1825a.a(context);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            a(i5.p, Boolean.valueOf(Boolean.parseBoolean(strA)));
        } catch (Exception unused) {
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strD = this.f1825a.D(context);
        if (!TextUtils.isEmpty(strD)) {
            a("asid", strD);
        } else if (a("asid")) {
            b("asid");
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            a(i5.o, language.toUpperCase(Locale.getDefault()));
        }
        String strB = this.f1825a.b();
        if (!TextUtils.isEmpty(strB)) {
            a("tz", strB);
        }
        String strB2 = q2.b(context);
        if (!TextUtils.isEmpty(strB2) && !strB2.equals("none")) {
            a(i5.j, strB2);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a("vpn", Boolean.valueOf(q2.d(context)));
        }
        String strN = this.f1825a.n(context);
        if (!TextUtils.isEmpty(strN)) {
            a("icc", strN);
        }
        int iY = this.f1825a.y(context);
        if (iY >= 0) {
            a(i5.L0, Integer.valueOf(iY));
        }
        a(i5.M0, this.f1825a.A(context));
        a(i5.N0, this.f1825a.H(context));
        a(i5.U, Float.valueOf(this.f1825a.m(context)));
        a(i5.l, String.valueOf(this.f1825a.n()));
        a(i5.F, Integer.valueOf(this.f1825a.d()));
        a(i5.E, Integer.valueOf(this.f1825a.j()));
        a(i5.z0, String.valueOf(this.f1825a.i()));
        a(i5.I0, String.valueOf(this.f1825a.p()));
        a("mcc", Integer.valueOf(p2.b(context)));
        a("mnc", Integer.valueOf(p2.c(context)));
        a(i5.H, Boolean.valueOf(this.f1825a.c()));
        a(i5.g, Boolean.valueOf(this.f1825a.G(context)));
        a(i5.h, Integer.valueOf(this.f1825a.l(context)));
        a(i5.b, Boolean.valueOf(this.f1825a.c(context)));
        a(i5.A, Boolean.valueOf(this.f1825a.d(context)));
        a(i5.D, Boolean.valueOf(this.f1825a.f()));
        a(i5.N, String.valueOf(this.f1825a.h()));
        a("bat", Integer.valueOf(this.f1825a.w(context)));
        a("lpm", Boolean.valueOf(this.f1825a.q(context)));
        a(i5.c, this.f1825a.f(context));
        a(i5.R, this.f1825a.s());
    }

    protected void a(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(l5.a(this.b));
    }

    protected void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.b.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void b(String str, Object obj) {
        a(str, obj);
    }

    protected void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
