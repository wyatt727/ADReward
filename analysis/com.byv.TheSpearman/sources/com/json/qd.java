package com.json;

/* loaded from: classes4.dex */
public class qd {

    /* renamed from: a, reason: collision with root package name */
    protected long f2084a;
    protected long b;
    protected long c;

    public long a() {
        return Math.max(0L, this.f2084a - System.currentTimeMillis());
    }

    public void a(long j) {
        this.f2084a = System.currentTimeMillis() + j;
    }

    public void b() {
        this.f2084a = 0L;
        this.b = 0L;
        this.c = 0L;
    }

    public void b(long j) {
        this.c = j;
        this.f2084a += j - this.b;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }
}
