package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class wr {
    private int f;
    private int h;
    private float o;

    /* renamed from: a, reason: collision with root package name */
    private String f1145a = "";
    private String b = "";
    private Set c = Collections.emptySet();
    private String d = "";
    private String e = null;
    private boolean g = false;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int p = -1;
    private boolean q = false;

    public int h() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean k() {
        return this.j == 1;
    }

    public boolean l() {
        return this.k == 1;
    }

    public String d() {
        return this.e;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public boolean j() {
        return this.g;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean i() {
        return this.i;
    }

    public int f() {
        return this.n;
    }

    public float e() {
        return this.o;
    }

    public int g() {
        return this.p;
    }

    public boolean b() {
        return this.q;
    }

    public int a(String str, String str2, Set set, String str3) {
        if (this.f1145a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f1145a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (iA == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return iA + (this.c.size() * 4);
    }

    public wr c(int i) {
        this.n = i;
        return this;
    }

    public wr d(int i) {
        this.p = i;
        return this;
    }

    public wr b(boolean z) {
        this.q = z;
        return this;
    }

    public void d(String str) {
        this.d = str;
    }

    public wr a(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public wr c(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public wr b(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public wr d(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.b = str;
    }

    public wr a(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.f1145a = str;
    }

    public wr a(String str) {
        this.e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public wr a(float f) {
        this.o = f;
        return this;
    }

    public void a(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
