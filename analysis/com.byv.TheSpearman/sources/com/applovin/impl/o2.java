package com.applovin.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class o2 implements wh {

    /* renamed from: a, reason: collision with root package name */
    private final m8 f735a;
    private i8 b;
    private j8 c;

    public o2(m8 m8Var) {
        this.f735a = m8Var;
    }

    @Override // com.applovin.impl.wh
    public void a(e5 e5Var, Uri uri, Map map, long j, long j2, k8 k8Var) throws sp {
        z5 z5Var = new z5(e5Var, j, j2);
        this.c = z5Var;
        if (this.b != null) {
            return;
        }
        i8[] i8VarArrA = this.f735a.a(uri, map);
        if (i8VarArrA.length == 1) {
            this.b = i8VarArrA[0];
        } else {
            int length = i8VarArrA.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                i8 i8Var = i8VarArrA[i];
                try {
                } catch (EOFException unused) {
                    a1.b(this.b != null || z5Var.f() == j);
                    z5Var.b();
                } catch (Throwable th) {
                    a1.b(this.b != null || z5Var.f() == j);
                    z5Var.b();
                    throw th;
                }
                if (i8Var.a(z5Var)) {
                    this.b = i8Var;
                    a1.b(true);
                    z5Var.b();
                    break;
                } else {
                    a1.b(this.b != null || z5Var.f() == j);
                    z5Var.b();
                    i++;
                }
            }
            if (this.b == null) {
                throw new sp("None of the available extractors (" + yp.b(i8VarArrA) + ") could read the stream.", (Uri) a1.a(uri));
            }
        }
        this.b.a(k8Var);
    }

    @Override // com.applovin.impl.wh
    public void c() {
        i8 i8Var = this.b;
        if (i8Var instanceof jf) {
            ((jf) i8Var).c();
        }
    }

    @Override // com.applovin.impl.wh
    public long b() {
        j8 j8Var = this.c;
        if (j8Var != null) {
            return j8Var.f();
        }
        return -1L;
    }

    @Override // com.applovin.impl.wh
    public int a(qh qhVar) {
        return ((i8) a1.a(this.b)).a((j8) a1.a(this.c), qhVar);
    }

    @Override // com.applovin.impl.wh
    public void a() {
        i8 i8Var = this.b;
        if (i8Var != null) {
            i8Var.a();
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.applovin.impl.wh
    public void a(long j, long j2) {
        ((i8) a1.a(this.b)).a(j, j2);
    }
}
