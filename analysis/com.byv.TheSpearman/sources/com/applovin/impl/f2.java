package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class f2 extends n5 {
    private long j;
    private int k;
    private int l;

    public f2() {
        super(2);
        this.l = 32;
    }

    public void i(int i) {
        a1.a(i > 0);
        this.l = i;
    }

    public long j() {
        return this.f;
    }

    public long k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    public boolean m() {
        return this.k > 0;
    }

    public boolean a(n5 n5Var) {
        a1.a(!n5Var.h());
        a1.a(!n5Var.c());
        a1.a(!n5Var.e());
        if (!b(n5Var)) {
            return false;
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.f = n5Var.f;
            if (n5Var.f()) {
                e(1);
            }
        }
        if (n5Var.d()) {
            e(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = n5Var.c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.c.put(byteBuffer);
        }
        this.j = n5Var.f;
        return true;
    }

    private boolean b(n5 n5Var) {
        ByteBuffer byteBuffer;
        if (!m()) {
            return true;
        }
        if (this.k >= this.l || n5Var.d() != d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = n5Var.c;
        return byteBuffer2 == null || (byteBuffer = this.c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    @Override // com.applovin.impl.n5, com.applovin.impl.j2
    public void b() {
        super.b();
        this.k = 0;
    }
}
