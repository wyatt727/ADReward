package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    private int f556a;

    public final boolean e() {
        return d(4);
    }

    public final boolean f() {
        return d(1);
    }

    public final void b(int i) {
        this.f556a = i | this.f556a;
    }

    public final void c(int i) {
        this.f556a = (~i) & this.f556a;
    }

    protected final boolean d(int i) {
        return (this.f556a & i) == i;
    }

    public void b() {
        this.f556a = 0;
    }

    public final void e(int i) {
        this.f556a = i;
    }

    public final boolean d() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return d(268435456);
    }
}
