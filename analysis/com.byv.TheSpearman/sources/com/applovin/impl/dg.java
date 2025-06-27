package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public class dg implements i8 {
    public static final m8 d = new m8() { // from class: com.applovin.impl.dg$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return dg.b();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private k8 f364a;
    private dl b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new dg()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    private boolean b(j8 j8Var) {
        fg fgVar = new fg();
        if (fgVar.a(j8Var, true) && (fgVar.b & 2) == 2) {
            int iMin = Math.min(fgVar.i, 8);
            yg ygVar = new yg(iMin);
            j8Var.c(ygVar.c(), 0, iMin);
            if (w8.c(a(ygVar))) {
                this.b = new w8();
            } else if (fr.c(a(ygVar))) {
                this.b = new fr();
            } else if (qg.b(a(ygVar))) {
                this.b = new qg();
            }
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f364a = k8Var;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        a1.b(this.f364a);
        if (this.b == null) {
            if (b(j8Var)) {
                j8Var.b();
            } else {
                throw ah.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.c) {
            ro roVarA = this.f364a.a(0, 1);
            this.f364a.c();
            this.b.a(this.f364a, roVarA);
            this.c = true;
        }
        return this.b.a(j8Var, qhVar);
    }

    private static yg a(yg ygVar) {
        ygVar.f(0);
        return ygVar;
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        dl dlVar = this.b;
        if (dlVar != null) {
            dlVar.a(j, j2);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        try {
            return b(j8Var);
        } catch (ah unused) {
            return false;
        }
    }
}
