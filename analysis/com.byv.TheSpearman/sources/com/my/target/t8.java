package com.my.target;

/* loaded from: classes4.dex */
public class t8 extends u9 {
    public int d;
    public int e;
    public int f;

    public t8(String str) {
        super("playheadTimerValue", str);
        this.f = 1;
    }

    public static t8 a(String str) {
        return new t8(str);
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f = i;
    }

    public void c(int i) {
        this.d = i;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.d;
    }
}
