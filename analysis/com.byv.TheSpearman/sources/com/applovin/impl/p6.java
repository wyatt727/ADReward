package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class p6 implements m2 {
    public static final p6 d = new p6(0, 0, 0);
    public static final m2.a f = new m2.a() { // from class: com.applovin.impl.p6$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return p6.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f774a;
    public final int b;
    public final int c;

    public p6(int i, int i2, int i3) {
        this.f774a = i;
        this.b = i2;
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.f774a == p6Var.f774a && this.b == p6Var.b && this.c == p6Var.c;
    }

    public int hashCode() {
        return ((((this.f774a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p6 a(Bundle bundle) {
        return new p6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
