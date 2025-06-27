package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* renamed from: com.applovin.impl.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo extends gi {
    public static final m2.a d = new m2.a() { // from class: com.applovin.impl.do$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return Cdo.b(bundle);
        }
    };
    private final boolean b;
    private final boolean c;

    public Cdo() {
        this.b = false;
        this.c = false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo cdo = (Cdo) obj;
        return this.c == cdo.c && this.b == cdo.b;
    }

    public Cdo(boolean z) {
        this.b = true;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cdo b(Bundle bundle) {
        a1.a(bundle.getInt(a(0), -1) == 3);
        if (bundle.getBoolean(a(1), false)) {
            return new Cdo(bundle.getBoolean(a(2), false));
        }
        return new Cdo();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
