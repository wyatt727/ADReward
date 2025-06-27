package com.mbridge.msdk.e.a;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes4.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private int f2703a;
    private int b;
    private final int c;
    private final float d;

    public f() {
        this(2500, 1, 1.0f);
    }

    public f(int i, int i2, float f) {
        this.f2703a = i;
        this.c = i2;
        this.d = f;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int a() {
        return this.f2703a;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int b() {
        return this.b;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final void a(z zVar) throws z {
        int i = this.b + 1;
        this.b = i;
        int i2 = this.f2703a;
        this.f2703a = i2 + ((int) (i2 * this.d));
        if (!(i <= this.c)) {
            throw zVar;
        }
    }
}
