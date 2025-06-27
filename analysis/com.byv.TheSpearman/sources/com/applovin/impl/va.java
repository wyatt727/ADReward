package com.applovin.impl;

import com.applovin.impl.ta;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class va {

    /* renamed from: a, reason: collision with root package name */
    private final yg f1089a = new yg(10);

    public we a(j8 j8Var, ta.a aVar) {
        we weVarA = null;
        int i = 0;
        while (true) {
            try {
                j8Var.c(this.f1089a.c(), 0, 10);
                this.f1089a.f(0);
                if (this.f1089a.z() != 4801587) {
                    break;
                }
                this.f1089a.g(3);
                int iV = this.f1089a.v();
                int i2 = iV + 10;
                if (weVarA == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f1089a.c(), 0, bArr, 0, 10);
                    j8Var.c(bArr, 10, iV);
                    weVarA = new ta(aVar).a(bArr, i2);
                } else {
                    j8Var.c(iV);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        j8Var.b();
        j8Var.c(i);
        return weVarA;
    }
}
