package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.ma;
import com.applovin.impl.od;
import com.applovin.impl.w5;
import java.util.Map;

/* loaded from: classes.dex */
public final class x5 implements a7 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1158a = new Object();
    private od.e b;
    private z6 c;
    private ma.b d;
    private String e;

    private z6 a(od.e eVar) {
        ma.b bVarA = this.d;
        if (bVarA == null) {
            bVarA = new b6.b().a(this.e);
        }
        Uri uri = eVar.b;
        na naVar = new na(uri == null ? null : uri.toString(), eVar.f, bVarA);
        qp it = eVar.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            naVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        w5 w5VarA = new w5.b().a(eVar.f746a, k9.d).a(eVar.d).b(eVar.e).a(pb.a(eVar.g)).a(naVar);
        w5VarA.a(0, eVar.b());
        return w5VarA;
    }

    @Override // com.applovin.impl.a7
    public z6 a(od odVar) {
        z6 z6Var;
        a1.a(odVar.b);
        od.e eVar = odVar.b.c;
        if (eVar != null && yp.f1214a >= 18) {
            synchronized (this.f1158a) {
                if (!yp.a(eVar, this.b)) {
                    this.b = eVar;
                    this.c = a(eVar);
                }
                z6Var = (z6) a1.a(this.c);
            }
            return z6Var;
        }
        return z6.f1229a;
    }
}
