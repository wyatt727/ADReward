package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qo implements m2 {
    public static final qo d = new qo(new po[0]);
    public static final m2.a f = new m2.a() { // from class: com.applovin.impl.qo$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return qo.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f848a;
    private final po[] b;
    private int c;

    public qo(po... poVarArr) {
        this.b = poVarArr;
        this.f848a = poVarArr.length;
    }

    public po a(int i) {
        return this.b[i];
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b);
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo.class != obj.getClass()) {
            return false;
        }
        qo qoVar = (qo) obj;
        return this.f848a == qoVar.f848a && Arrays.equals(this.b, qoVar.b);
    }

    public int a(po poVar) {
        for (int i = 0; i < this.f848a; i++) {
            if (this.b[i] == poVar) {
                return i;
            }
        }
        return -1;
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    public boolean a() {
        return this.f848a == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ qo a(Bundle bundle) {
        return new qo((po[]) n2.a(po.d, bundle.getParcelableArrayList(b(0)), ab.h()).toArray(new po[0]));
    }
}
