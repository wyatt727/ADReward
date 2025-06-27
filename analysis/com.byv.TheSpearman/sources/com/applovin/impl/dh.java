package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class dh extends gi {
    public static final m2.a c = new m2.a() { // from class: com.applovin.impl.dh$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return dh.b(bundle);
        }
    };
    private final float b;

    public dh() {
        this.b = -1.0f;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.b));
    }

    public boolean equals(Object obj) {
        return (obj instanceof dh) && this.b == ((dh) obj).b;
    }

    public dh(float f) {
        a1.a(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.b = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dh b(Bundle bundle) {
        a1.a(bundle.getInt(a(0), -1) == 1);
        float f = bundle.getFloat(a(1), -1.0f);
        return f == -1.0f ? new dh() : new dh(f);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
