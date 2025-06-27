package com.applovin.impl;

import com.applovin.impl.ro;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class g7 implements ro {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f449a = new byte[4096];

    @Override // com.applovin.impl.ro
    public /* synthetic */ int a(e5 e5Var, int i, boolean z) {
        return a(e5Var, i, z, 0);
    }

    @Override // com.applovin.impl.ro
    public void a(long j, int i, int i2, int i3, ro.a aVar) {
    }

    @Override // com.applovin.impl.ro
    public void a(d9 d9Var) {
    }

    @Override // com.applovin.impl.ro
    public /* synthetic */ void a(yg ygVar, int i) {
        a(ygVar, i, 0);
    }

    @Override // com.applovin.impl.ro
    public int a(e5 e5Var, int i, boolean z, int i2) throws EOFException {
        int iA = e5Var.a(this.f449a, 0, Math.min(this.f449a.length, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.impl.ro
    public void a(yg ygVar, int i, int i2) {
        ygVar.g(i);
    }
}
