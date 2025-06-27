package com.mbridge.msdk.e.a;

/* compiled from: VolleyError.java */
/* loaded from: classes4.dex */
public abstract class z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final m f2714a;
    private long b;
    private int c;
    private String d;

    public abstract int a();

    public z() {
        this.c = 0;
        this.d = "";
        this.f2714a = null;
    }

    public z(m mVar) {
        this.c = 0;
        this.d = "";
        this.f2714a = mVar;
    }

    public z(String str) {
        super(str);
        this.c = 0;
        this.d = "";
        this.f2714a = null;
    }

    public z(Throwable th) {
        super(th);
        this.c = 0;
        this.d = "";
        this.f2714a = null;
    }

    final void a(long j) {
        this.b = j;
    }

    public final int b() {
        return this.c;
    }

    public final void a(int i) {
        this.c = i;
    }

    public final String c() {
        return this.d;
    }

    public final void a(String str) {
        this.d = str;
    }
}
