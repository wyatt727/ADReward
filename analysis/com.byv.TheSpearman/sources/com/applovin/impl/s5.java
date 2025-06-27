package com.applovin.impl;

/* loaded from: classes.dex */
public class s5 implements r4 {
    private final long b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    private final long f877a = -9223372036854775807L;
    private final boolean c = false;

    @Override // com.applovin.impl.r4
    public boolean b(nh nhVar) {
        nhVar.b();
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean e(nh nhVar) {
        nhVar.D();
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar) {
        nhVar.u();
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean c(nh nhVar) {
        if (!this.c) {
            nhVar.B();
            return true;
        }
        if (!b() || !nhVar.y()) {
            return true;
        }
        a(nhVar, -this.f877a);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean d(nh nhVar) {
        if (!this.c) {
            nhVar.w();
            return true;
        }
        if (!a() || !nhVar.y()) {
            return true;
        }
        a(nhVar, this.b);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b(nh nhVar, boolean z) {
        nhVar.a(z);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, int i, long j) {
        nhVar.a(i, j);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b() {
        return !this.c || this.f877a > 0;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, int i) {
        nhVar.a(i);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, boolean z) {
        nhVar.b(z);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a() {
        return !this.c || this.b > 0;
    }

    private static void a(nh nhVar, long j) {
        long currentPosition = nhVar.getCurrentPosition() + j;
        long duration = nhVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        nhVar.a(Math.max(currentPosition, 0L));
    }
}
