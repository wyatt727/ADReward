package com.applovin.impl;

import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public class td {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1031a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    protected td(td tdVar) {
        this.f1031a = tdVar.f1031a;
        this.b = tdVar.b;
        this.c = tdVar.c;
        this.d = tdVar.d;
        this.e = tdVar.e;
    }

    public td a(Object obj) {
        return this.f1031a.equals(obj) ? this : new td(obj, this.b, this.c, this.d, this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return this.f1031a.equals(tdVar.f1031a) && this.b == tdVar.b && this.c == tdVar.c && this.d == tdVar.d && this.e == tdVar.e;
    }

    public int hashCode() {
        return ((((((((this.f1031a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public td(Object obj) {
        this(obj, -1L);
    }

    public td(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public boolean a() {
        return this.b != -1;
    }

    private td(Object obj, int i, int i2, long j, int i3) {
        this.f1031a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public td(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public td(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
