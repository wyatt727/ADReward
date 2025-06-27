package com.my.target;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public class u5 {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4142a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public final Rect h = new Rect();

    public static void a(Rect rect, Rect rect2) {
        rect2.set(ca.c(rect.left), ca.c(rect.top), ca.c(rect.right), ca.c(rect.bottom));
    }

    public static u5 e() {
        return new u5();
    }

    public Rect a() {
        return this.d;
    }

    public void a(int i, int i2) {
        this.f4142a.set(0, 0, i, i2);
        a(this.f4142a, this.b);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        a(this.c, this.d);
    }

    public Rect b() {
        return this.f;
    }

    public void b(int i, int i2, int i3, int i4) {
        this.e.set(i, i2, i3, i4);
        a(this.e, this.f);
    }

    public Rect c() {
        return this.h;
    }

    public void c(int i, int i2, int i3, int i4) {
        this.g.set(i, i2, i3, i4);
        a(this.g, this.h);
    }

    public Rect d() {
        return this.b;
    }
}
