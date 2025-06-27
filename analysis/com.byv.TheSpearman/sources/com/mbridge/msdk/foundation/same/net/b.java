package com.mbridge.msdk.foundation.same.net;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes4.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f2867a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public b() {
        this(30000, 0);
    }

    private b(int i, int i2) {
        this.b = 0;
        this.c = 0;
        this.f = 0;
        this.g = 0;
        this.h = 2;
        this.e = i <= 0 ? 30000 : i;
        this.f2867a = i2;
    }

    public b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b = 0;
        this.c = 0;
        this.f = 0;
        this.g = 0;
        this.h = 2;
        this.c = Math.max(i, 0);
        this.f = Math.max(i2, 0);
        this.g = Math.max(i3, 0);
        this.b = Math.max(i4, 0);
        this.f2867a = Math.max(i5, 0);
        this.h = i6;
    }

    public b(int i, int i2, int i3, int i4, int i5) {
        this.b = 0;
        this.c = 0;
        this.f = 0;
        this.g = 0;
        this.h = 2;
        this.c = Math.max(i, 0);
        this.f = Math.max(i2, 0);
        this.g = Math.max(i3, 0);
        this.b = Math.max(i4, 0);
        this.f2867a = Math.max(i5, 0);
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int a() {
        return this.e;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int b() {
        return this.f2867a;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final boolean a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        int i = this.d + 1;
        this.d = i;
        return i <= this.f2867a;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int c() {
        return this.c;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int d() {
        return this.f;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int e() {
        return this.g;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int f() {
        return this.b;
    }
}
