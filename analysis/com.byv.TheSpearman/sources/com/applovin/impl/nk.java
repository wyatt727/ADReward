package com.applovin.impl;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class nk {
    private final p4 c;
    private final SparseArray b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f724a = -1;

    public nk(p4 p4Var) {
        this.c = p4Var;
    }

    public Object c(int i) {
        if (this.f724a == -1) {
            this.f724a = 0;
        }
        while (true) {
            int i2 = this.f724a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.f724a--;
        }
        while (this.f724a < this.b.size() - 1 && i >= this.b.keyAt(this.f724a + 1)) {
            this.f724a++;
        }
        return this.b.valueAt(this.f724a);
    }

    public void a(int i, Object obj) {
        if (this.f724a == -1) {
            a1.b(this.b.size() == 0);
            this.f724a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            a1.a(i >= iKeyAt);
            if (iKeyAt == i) {
                p4 p4Var = this.c;
                SparseArray sparseArray2 = this.b;
                p4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public void b(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.f724a;
            if (i4 > 0) {
                this.f724a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public boolean c() {
        return this.b.size() == 0;
    }

    public Object b() {
        return this.b.valueAt(r0.size() - 1);
    }

    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.f724a = -1;
        this.b.clear();
    }

    public void a(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.f724a = this.b.size() > 0 ? Math.min(this.f724a, this.b.size() - 1) : -1;
    }
}
