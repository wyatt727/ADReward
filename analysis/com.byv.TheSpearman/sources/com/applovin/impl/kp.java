package com.applovin.impl;

import android.text.Layout;

/* loaded from: classes.dex */
final class kp {

    /* renamed from: a, reason: collision with root package name */
    private String f606a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;
    private String l;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private yn r;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    public int k() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public boolean q() {
        return this.f == 1;
    }

    public boolean r() {
        return this.g == 1;
    }

    public String c() {
        return this.f606a;
    }

    public int b() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public boolean p() {
        return this.c;
    }

    public boolean o() {
        return this.e;
    }

    public float j() {
        return this.s;
    }

    public kp a(kp kpVar) {
        return a(kpVar, true);
    }

    public String f() {
        return this.l;
    }

    public int i() {
        return this.m;
    }

    public int h() {
        return this.n;
    }

    public Layout.Alignment l() {
        return this.o;
    }

    public Layout.Alignment g() {
        return this.p;
    }

    public boolean m() {
        return this.q == 1;
    }

    public kp b(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    public yn n() {
        return this.r;
    }

    public int e() {
        return this.j;
    }

    public float d() {
        return this.k;
    }

    public int a() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public kp c(int i) {
        this.j = i;
        return this;
    }

    public kp b(String str) {
        this.l = str;
        return this;
    }

    private kp a(kp kpVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kpVar != null) {
            if (!this.c && kpVar.c) {
                b(kpVar.b);
            }
            if (this.h == -1) {
                this.h = kpVar.h;
            }
            if (this.i == -1) {
                this.i = kpVar.i;
            }
            if (this.f606a == null && (str = kpVar.f606a) != null) {
                this.f606a = str;
            }
            if (this.f == -1) {
                this.f = kpVar.f;
            }
            if (this.g == -1) {
                this.g = kpVar.g;
            }
            if (this.n == -1) {
                this.n = kpVar.n;
            }
            if (this.o == null && (alignment2 = kpVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = kpVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = kpVar.q;
            }
            if (this.j == -1) {
                this.j = kpVar.j;
                this.k = kpVar.k;
            }
            if (this.r == null) {
                this.r = kpVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = kpVar.s;
            }
            if (z && !this.e && kpVar.e) {
                a(kpVar.d);
            }
            if (z && this.m == -1 && (i = kpVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public kp c(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public kp e(int i) {
        this.m = i;
        return this;
    }

    public kp d(int i) {
        this.n = i;
        return this;
    }

    public kp b(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public kp e(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public kp a(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public kp b(float f) {
        this.s = f;
        return this;
    }

    public kp a(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public kp d(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public kp a(String str) {
        this.f606a = str;
        return this;
    }

    public kp b(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public kp a(float f) {
        this.k = f;
        return this;
    }

    public kp a(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public kp a(yn ynVar) {
        this.r = ynVar;
        return this;
    }
}
