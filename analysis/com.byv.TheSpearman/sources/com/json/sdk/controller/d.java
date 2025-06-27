package com.json.sdk.controller;

import com.json.c4;
import com.json.h7;
import com.json.hc;
import com.json.m4;
import com.json.m7;
import com.json.o7;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";

    /* renamed from: a, reason: collision with root package name */
    private long f2148a;
    private int b;
    private c c;
    private EnumC0243d d = EnumC0243d.NONE;
    private String e;
    private String f;
    private c4 g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt(t2.a.i, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.a()));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2150a;

        static {
            int[] iArr = new int[c.values().length];
            f2150a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2150a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2150a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0243d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: a, reason: collision with root package name */
        private int f2152a;

        EnumC0243d(int i) {
            this.f2152a = i;
        }

        public int a() {
            return this.f2152a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, c4 c4Var) {
        int iOptInt = jSONObject.optInt(t2.a.i, -1);
        this.b = iOptInt;
        this.c = a(iOptInt);
        this.e = str;
        this.f = str2;
        this.g = c4Var;
    }

    private c a(int i2) {
        return i2 != 1 ? i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private void a(o7 o7Var) {
        if (this.g.c()) {
            return;
        }
        this.g.a(o7Var, this.f);
    }

    private void a(EnumC0243d enumC0243d) {
        h7 h7VarA = new h7().a(m4.x, Integer.valueOf(this.b)).a(m4.y, Integer.valueOf(enumC0243d.a()));
        if (this.f2148a > 0) {
            h7VarA.a(m4.A, Long.valueOf(System.currentTimeMillis() - this.f2148a));
        }
        m7.a(hc.w, h7VarA.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            o7 o7VarG = g();
            if (o7VarG.exists()) {
                o7 o7VarH = h();
                if (o7VarH.exists()) {
                    o7VarH.delete();
                }
                IronSourceStorageUtils.renameFile(o7VarG.getPath(), o7VarH.getPath());
            }
        } catch (Exception unused) {
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private o7 h() {
        return new o7(this.e, "fallback_mobileController.html");
    }

    private o7 i() {
        return new o7(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        h7 h7VarA = new h7().a(m4.x, Integer.valueOf(this.b));
        if (this.f2148a > 0) {
            h7VarA.a(m4.A, Long.valueOf(System.currentTimeMillis() - this.f2148a));
        }
        m7.a(hc.x, h7VarA.a());
    }

    void a(h7 h7Var) {
        h7Var.a(m4.x, Integer.valueOf(this.b));
        m7.a(hc.v, h7Var.a());
        this.f2148a = System.currentTimeMillis();
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0243d enumC0243d = EnumC0243d.CONTROLLER_FROM_SERVER;
        this.d = enumC0243d;
        a(enumC0243d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
        } else {
            EnumC0243d enumC0243d = EnumC0243d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0243d;
            a(enumC0243d);
            runnable.run();
        }
    }

    JSONObject f() throws JSONException {
        return new a();
    }

    o7 g() {
        return new o7(this.e, t2.g);
    }

    boolean k() {
        o7 o7Var;
        int i2 = b.f2150a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            o7Var = new o7(this.e, SDKUtils.getFileName(this.f));
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        o7 o7VarG = g();
                        o7 o7VarI = i();
                        if (!o7VarI.exists() && !o7VarG.exists()) {
                            a(new o7(this.e, SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        if (!o7VarI.exists() && o7VarG.exists()) {
                            EnumC0243d enumC0243d = EnumC0243d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = enumC0243d;
                            a(enumC0243d);
                            a(new o7(this.e, o7VarI.getName()));
                            return true;
                        }
                        c();
                        if (b()) {
                            EnumC0243d enumC0243d2 = EnumC0243d.PREPARED_CONTROLLER_LOADED;
                            this.d = enumC0243d2;
                            a(enumC0243d2);
                            d();
                            a(new o7(this.e, o7VarI.getName()));
                            return true;
                        }
                        if (a()) {
                            EnumC0243d enumC0243d3 = EnumC0243d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = enumC0243d3;
                            a(enumC0243d3);
                            a(new o7(this.e, o7VarI.getName()));
                            return true;
                        }
                        a(new o7(this.e, SDKUtils.getFileName(this.f)));
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            c();
            o7Var = new o7(this.e, SDKUtils.getFileName(this.f));
        }
        a(o7Var);
        return false;
    }

    boolean m() {
        return this.d != EnumC0243d.NONE;
    }
}
