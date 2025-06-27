package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class yq implements m2 {
    public static final yq f = new yq(0, 0);
    public static final m2.a g = new m2.a() { // from class: com.applovin.impl.yq$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return yq.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f1215a;
    public final int b;
    public final int c;
    public final float d;

    public yq(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        return this.f1215a == yqVar.f1215a && this.b == yqVar.b && this.c == yqVar.c && this.d == yqVar.d;
    }

    public int hashCode() {
        return ((((((this.f1215a + 217) * 31) + this.b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public yq(int i, int i2, int i3, float f2) {
        this.f1215a = i;
        this.b = i2;
        this.c = i3;
        this.d = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yq a(Bundle bundle) {
        return new yq(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }
}
