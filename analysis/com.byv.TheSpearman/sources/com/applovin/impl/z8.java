package com.applovin.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f1231a;

    public int hashCode() {
        if (yp.f1214a >= 24) {
            return this.f1231a.hashCode();
        }
        int iA = a();
        for (int i = 0; i < a(); i++) {
            iA = (iA * 31) + b(i);
        }
        return iA;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f1232a = new SparseBooleanArray();
        private boolean b;

        public b a(int i) {
            a1.b(!this.b);
            this.f1232a.append(i, true);
            return this;
        }

        public b a(z8 z8Var) {
            for (int i = 0; i < z8Var.a(); i++) {
                a(z8Var.b(i));
            }
            return this;
        }

        public b a(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public b a(int i, boolean z) {
            return z ? a(i) : this;
        }

        public z8 a() {
            a1.b(!this.b);
            this.b = true;
            return new z8(this.f1232a);
        }
    }

    private z8(SparseBooleanArray sparseBooleanArray) {
        this.f1231a = sparseBooleanArray;
    }

    public boolean a(int i) {
        return this.f1231a.get(i);
    }

    public int b(int i) {
        a1.a(i, 0, a());
        return this.f1231a.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        if (yp.f1214a < 24) {
            if (a() != z8Var.a()) {
                return false;
            }
            for (int i = 0; i < a(); i++) {
                if (b(i) != z8Var.b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f1231a.equals(z8Var.f1231a);
    }

    public boolean a(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f1231a.size();
    }
}
