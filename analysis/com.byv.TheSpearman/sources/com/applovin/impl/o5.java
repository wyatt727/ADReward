package com.applovin.impl;

import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f736a;
    public final d9 b;
    public final d9 c;
    public final int d;
    public final int e;

    public o5(String str, d9 d9Var, d9 d9Var2, int i, int i2) {
        a1.a(i == 0 || i2 == 0);
        this.f736a = a1.a(str);
        this.b = (d9) a1.a(d9Var);
        this.c = (d9) a1.a(d9Var2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o5.class != obj.getClass()) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.d == o5Var.d && this.e == o5Var.e && this.f736a.equals(o5Var.f736a) && this.b.equals(o5Var.b) && this.c.equals(o5Var.c);
    }

    public int hashCode() {
        return ((((((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31) + this.f736a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
