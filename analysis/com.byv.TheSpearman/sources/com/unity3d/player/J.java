package com.unity3d.player;

/* loaded from: classes4.dex */
class J {
    private static boolean e = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f4340a = false;
    private boolean b = false;
    private boolean c = true;
    private boolean d = false;

    J() {
    }

    static boolean d() {
        return e;
    }

    static void e() {
        e = true;
    }

    static void f() {
        e = false;
    }

    boolean a() {
        return this.d;
    }

    boolean a(boolean z) {
        return e && !((!z && !this.f4340a) || this.c || this.b);
    }

    void b(boolean z) {
        this.f4340a = z;
    }

    boolean b() {
        return this.c;
    }

    void c(boolean z) {
        this.b = z;
    }

    boolean c() {
        return this.b;
    }

    void d(boolean z) {
        this.d = z;
    }

    void e(boolean z) {
        this.c = z;
    }

    public String toString() {
        return super.toString();
    }
}
