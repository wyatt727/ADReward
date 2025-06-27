package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class zk extends gi {
    public static final m2.a d = new m2.a() { // from class: com.applovin.impl.zk$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return zk.b(bundle);
        }
    };
    private final int b;
    private final float c;

    public zk(int i) {
        a1.a(i > 0, "maxStars must be a positive integer");
        this.b = i;
        this.c = -1.0f;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return this.b == zkVar.b && this.c == zkVar.c;
    }

    public zk(int i, float f) {
        a1.a(i > 0, "maxStars must be a positive integer");
        a1.a(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.b = i;
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zk b(Bundle bundle) {
        a1.a(bundle.getInt(a(0), -1) == 2);
        int i = bundle.getInt(a(1), 5);
        float f = bundle.getFloat(a(2), -1.0f);
        if (f == -1.0f) {
            return new zk(i);
        }
        return new zk(i, f);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
