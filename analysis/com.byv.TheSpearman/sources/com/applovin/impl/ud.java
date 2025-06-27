package com.applovin.impl;

import com.applovin.impl.wd;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
final class ud {

    /* renamed from: a, reason: collision with root package name */
    public final wd.a f1062a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    ud(wd.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        a1.a(!z4 || z2);
        a1.a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        a1.a(z5);
        this.f1062a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public ud b(long j) {
        return j == this.b ? this : new ud(this.f1062a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public ud a(long j) {
        return j == this.c ? this : new ud(this.f1062a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ud.class != obj.getClass()) {
            return false;
        }
        ud udVar = (ud) obj;
        return this.b == udVar.b && this.c == udVar.c && this.d == udVar.d && this.e == udVar.e && this.f == udVar.f && this.g == udVar.g && this.h == udVar.h && this.i == udVar.i && yp.a(this.f1062a, udVar.f1062a);
    }

    public int hashCode() {
        return ((((((((((((((((this.f1062a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
