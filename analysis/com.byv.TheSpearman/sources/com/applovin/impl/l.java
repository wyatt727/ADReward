package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements i8 {
    public static final m8 d = new m8() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return l.b();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final m f609a = new m();
    private final yg b = new yg(16384);
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new l()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f609a.a(k8Var, new ep.d(0, 1));
        k8Var.c();
        k8Var.a(new ej.b(-9223372036854775807L));
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int iA = j8Var.a(this.b.c(), 0, 16384);
        if (iA == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(iA);
        if (!this.c) {
            this.f609a.a(0L, 4);
            this.c = true;
        }
        this.f609a.a(this.b);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        this.c = false;
        this.f609a.a();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        yg ygVar = new yg(10);
        int i = 0;
        while (true) {
            j8Var.c(ygVar.c(), 0, 10);
            ygVar.f(0);
            if (ygVar.z() != 4801587) {
                break;
            }
            ygVar.g(3);
            int iV = ygVar.v();
            i += iV + 10;
            j8Var.c(iV);
        }
        j8Var.b();
        j8Var.c(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            j8Var.c(ygVar.c(), 0, 7);
            ygVar.f(0);
            int iC = ygVar.C();
            if (iC == 44096 || iC == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iA = n.a(ygVar.c(), iC);
                if (iA == -1) {
                    return false;
                }
                j8Var.c(iA - 7);
            } else {
                j8Var.b();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                j8Var.c(i3);
                i2 = 0;
            }
        }
    }
}
