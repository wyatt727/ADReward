package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class ja extends gi {
    public static final m2.a d = new m2.a() { // from class: com.applovin.impl.ja$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return ja.b(bundle);
        }
    };
    private final boolean b;
    private final boolean c;

    public ja() {
        this.b = false;
        this.c = false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return this.c == jaVar.c && this.b == jaVar.b;
    }

    public ja(boolean z) {
        this.b = true;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ja b(Bundle bundle) {
        a1.a(bundle.getInt(a(0), -1) == 0);
        if (bundle.getBoolean(a(1), false)) {
            return new ja(bundle.getBoolean(a(2), false));
        }
        return new ja();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
