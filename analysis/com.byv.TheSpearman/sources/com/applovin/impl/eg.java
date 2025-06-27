package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
final class eg {

    /* renamed from: a, reason: collision with root package name */
    private final fg f385a = new fg();
    private final yg b = new yg(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    eg() {
    }

    public void c() {
        this.f385a.a();
        this.b.d(0);
        this.c = -1;
        this.e = false;
    }

    public yg b() {
        return this.b;
    }

    public void d() {
        if (this.b.c().length == 65025) {
            return;
        }
        yg ygVar = this.b;
        ygVar.a(Arrays.copyOf(ygVar.c(), Math.max(65025, this.b.e())), this.b.e());
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            fg fgVar = this.f385a;
            if (i5 >= fgVar.g) {
                break;
            }
            int[] iArr = fgVar.j;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public fg a() {
        return this.f385a;
    }

    public boolean a(j8 j8Var) {
        int i;
        a1.b(j8Var != null);
        if (this.e) {
            this.e = false;
            this.b.d(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.f385a.a(j8Var) || !this.f385a.a(j8Var, true)) {
                    return false;
                }
                fg fgVar = this.f385a;
                int iA = fgVar.h;
                if ((fgVar.b & 1) == 1 && this.b.e() == 0) {
                    iA += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!l8.a(j8Var, iA)) {
                    return false;
                }
                this.c = i;
            }
            int iA2 = a(this.c);
            int i2 = this.c + this.d;
            if (iA2 > 0) {
                yg ygVar = this.b;
                ygVar.a(ygVar.e() + iA2);
                if (!l8.b(j8Var, this.b.c(), this.b.e(), iA2)) {
                    return false;
                }
                yg ygVar2 = this.b;
                ygVar2.e(ygVar2.e() + iA2);
                this.e = this.f385a.j[i2 + (-1)] != 255;
            }
            if (i2 == this.f385a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }
}
