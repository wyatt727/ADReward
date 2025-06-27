package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z1 implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1222a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private j5 d;

    @Override // com.applovin.impl.g5
    public /* synthetic */ Map e() {
        return Collections.emptyMap();
    }

    protected z1(boolean z) {
        this.f1222a = z;
    }

    @Override // com.applovin.impl.g5
    public final void a(yo yoVar) {
        a1.a(yoVar);
        if (this.b.contains(yoVar)) {
            return;
        }
        this.b.add(yoVar);
        this.c++;
    }

    protected final void b(j5 j5Var) {
        for (int i = 0; i < this.c; i++) {
            ((yo) this.b.get(i)).b(this, j5Var, this.f1222a);
        }
    }

    protected final void c(j5 j5Var) {
        this.d = j5Var;
        for (int i = 0; i < this.c; i++) {
            ((yo) this.b.get(i)).a(this, j5Var, this.f1222a);
        }
    }

    protected final void d(int i) {
        j5 j5Var = (j5) yp.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((yo) this.b.get(i2)).a(this, j5Var, this.f1222a, i);
        }
    }

    protected final void g() {
        j5 j5Var = (j5) yp.a(this.d);
        for (int i = 0; i < this.c; i++) {
            ((yo) this.b.get(i)).c(this, j5Var, this.f1222a);
        }
        this.d = null;
    }
}
