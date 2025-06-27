package com.applovin.impl;

/* loaded from: classes.dex */
public final class xo {

    /* renamed from: a, reason: collision with root package name */
    public final int f1181a;
    public final ni[] b;
    public final f8[] c;
    public final Object d;

    public xo(ni[] niVarArr, f8[] f8VarArr, Object obj) {
        this.b = niVarArr;
        this.c = (f8[]) f8VarArr.clone();
        this.d = obj;
        this.f1181a = niVarArr.length;
    }

    public boolean a(xo xoVar) {
        if (xoVar == null || xoVar.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!a(xoVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(xo xoVar, int i) {
        return xoVar != null && yp.a(this.b[i], xoVar.b[i]) && yp.a(this.c[i], xoVar.c[i]);
    }

    public boolean a(int i) {
        return this.b[i] != null;
    }
}
