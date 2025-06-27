package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class mh implements m2 {
    public static final mh d = new mh(1.0f);
    public static final m2.a f = new m2.a() { // from class: com.applovin.impl.mh$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return mh.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final float f697a;
    public final float b;
    private final int c;

    public mh(float f2) {
        this(f2, 1.0f);
    }

    public long a(long j) {
        return j * this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mh.class != obj.getClass()) {
            return false;
        }
        mh mhVar = (mh) obj;
        return this.f697a == mhVar.f697a && this.b == mhVar.b;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f697a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.b);
    }

    public mh(float f2, float f3) {
        a1.a(f2 > 0.0f);
        a1.a(f3 > 0.0f);
        this.f697a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public String toString() {
        return yp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f697a), Float.valueOf(this.b));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mh a(Bundle bundle) {
        return new mh(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public mh a(float f2) {
        return new mh(f2, this.b);
    }
}
