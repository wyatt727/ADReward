package com.json;

import android.content.Context;

/* loaded from: classes4.dex */
public class x3 {
    private static x3 h;

    /* renamed from: a, reason: collision with root package name */
    private String f2437a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private final b6 g;

    private x3(Context context) {
        b6 b6VarC = ca.h().c();
        this.g = b6VarC;
        this.f2437a = b6VarC.g();
        this.b = b6VarC.e();
        this.c = b6VarC.l();
        this.d = b6VarC.o();
        this.e = b6VarC.k();
        this.f = b6VarC.j(context);
    }

    public static x3 b(Context context) {
        if (h == null) {
            h = new x3(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public float a(Context context) {
        return this.g.m(context);
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f2437a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }
}
