package com.applovin.impl;

import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1046a;
    public final float b;

    public u1(int i, float f) {
        this.f1046a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f1046a == u1Var.f1046a && Float.compare(u1Var.b, this.b) == 0;
    }

    public int hashCode() {
        return ((this.f1046a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToIntBits(this.b);
    }
}
