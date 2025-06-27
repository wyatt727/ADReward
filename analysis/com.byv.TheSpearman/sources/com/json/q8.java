package com.json;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class q8 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2081a;
    private String b;
    private String c;
    private boolean d;
    private w6 e;
    private Map<String, String> f;
    private wa g;
    private boolean h;
    protected boolean i;
    protected boolean j = false;

    q8(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Map<String, String> map, wa waVar, w6 w6Var) {
        this.b = str;
        this.c = str2;
        this.f2081a = z;
        this.d = z2;
        this.f = map;
        this.g = waVar;
        this.e = w6Var;
        this.h = z3;
        this.i = z4;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.b);
        map.put("instanceName", this.c);
        map.put("rewarded", Boolean.toString(this.f2081a));
        map.put("inAppBidding", Boolean.toString(this.d));
        map.put("isOneFlow", Boolean.toString(this.h));
        map.put(t2.s, String.valueOf(2));
        w6 w6Var = this.e;
        map.put("width", w6Var != null ? Integer.toString(w6Var.c()) : "0");
        w6 w6Var2 = this.e;
        map.put("height", w6Var2 != null ? Integer.toString(w6Var2.a()) : "0");
        w6 w6Var3 = this.e;
        map.put("label", w6Var3 != null ? w6Var3.b() : "");
        map.put(t2.w, Boolean.toString(g()));
        map.put("isMultipleAdObjects", Boolean.toString(this.i));
        Map<String, String> map2 = this.f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void a(wa waVar) {
        this.g = waVar;
        this.j = true;
    }

    public final wa b() {
        return this.g;
    }

    public Map<String, String> c() {
        return this.f;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public w6 f() {
        return this.e;
    }

    public boolean g() {
        return f() != null && f().d();
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return h() || k();
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.f2081a;
    }

    public boolean m() {
        return this.j;
    }
}
