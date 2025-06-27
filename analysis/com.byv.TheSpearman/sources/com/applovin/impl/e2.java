package com.applovin.impl;

import com.applovin.impl.f8;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class e2 implements f8 {

    /* renamed from: a, reason: collision with root package name */
    protected final po f375a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final d9[] e;
    private final long[] f;
    private int g;

    @Override // com.applovin.impl.f8
    public void a(float f) {
    }

    @Override // com.applovin.impl.f8
    public /* synthetic */ void a(boolean z) {
        f8.CC.$default$a(this, z);
    }

    @Override // com.applovin.impl.f8
    public void f() {
    }

    @Override // com.applovin.impl.f8
    public void i() {
    }

    @Override // com.applovin.impl.f8
    public /* synthetic */ void j() {
        f8.CC.$default$j(this);
    }

    @Override // com.applovin.impl.f8
    public /* synthetic */ void k() {
        f8.CC.$default$k(this);
    }

    public e2(po poVar, int[] iArr, int i) {
        int i2 = 0;
        a1.b(iArr.length > 0);
        this.d = i;
        this.f375a = (po) a1.a(poVar);
        int length = iArr.length;
        this.b = length;
        this.e = new d9[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.e[i3] = poVar.a(iArr[i3]);
        }
        Arrays.sort(this.e, new Comparator() { // from class: com.applovin.impl.e2$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e2.a((d9) obj, (d9) obj2);
            }
        });
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = poVar.a(this.e[i2]);
                i2++;
            } else {
                this.f = new long[i4];
                return;
            }
        }
    }

    @Override // com.applovin.impl.to
    public final d9 a(int i) {
        return this.e[i];
    }

    @Override // com.applovin.impl.to
    public final int b(int i) {
        return this.c[i];
    }

    @Override // com.applovin.impl.f8
    public final d9 g() {
        return this.e[h()];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (System.identityHashCode(this.f375a) * 31) + Arrays.hashCode(this.c);
        }
        return this.g;
    }

    @Override // com.applovin.impl.to
    public final po a() {
        return this.f375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f375a == e2Var.f375a && Arrays.equals(this.c, e2Var.c);
    }

    @Override // com.applovin.impl.to
    public final int b() {
        return this.c.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(d9 d9Var, d9 d9Var2) {
        return d9Var2.i - d9Var.i;
    }
}
