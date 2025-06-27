package com.json;

/* loaded from: classes4.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    private int f2382a;
    private int b;
    private String c;

    public w6() {
        this.f2382a = 0;
        this.b = 0;
        this.c = "";
    }

    public w6(int i, int i2, String str) {
        this.f2382a = i;
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.f2382a;
    }

    public boolean d() {
        return this.b > 0 && this.f2382a > 0;
    }

    public boolean e() {
        return this.b == 0 && this.f2382a == 0;
    }

    public String toString() {
        return this.c;
    }
}
