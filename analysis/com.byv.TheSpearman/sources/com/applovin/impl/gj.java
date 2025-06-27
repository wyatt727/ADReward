package com.applovin.impl;

import com.json.t2;

/* loaded from: classes.dex */
public final class gj {
    public static final gj c = new gj(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f462a;
    public final long b;

    public String toString() {
        return "[timeUs=" + this.f462a + ", position=" + this.b + t2.i.e;
    }

    public gj(long j, long j2) {
        this.f462a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj.class != obj.getClass()) {
            return false;
        }
        gj gjVar = (gj) obj;
        return this.f462a == gjVar.f462a && this.b == gjVar.b;
    }

    public int hashCode() {
        return (((int) this.f462a) * 31) + ((int) this.b);
    }
}
