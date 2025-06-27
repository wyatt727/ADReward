package com.my.target;

import android.content.Context;
import com.my.target.l;
import com.my.target.o5;

/* loaded from: classes4.dex */
public final class k6 extends l<q6> {
    public final q6 h;
    public final String i;

    public static class a implements l.a<q6> {
        @Override // com.my.target.l.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.l.a
        public t b() {
            return r6.b();
        }

        @Override // com.my.target.l.a
        public p<q6> c() {
            return p6.a();
        }

        @Override // com.my.target.l.a
        public o<q6> d() {
            return o6.a();
        }
    }

    public k6(j jVar, o5.a aVar, q6 q6Var, String str) {
        super(new a(), jVar, aVar);
        this.h = q6Var;
        this.i = str;
    }

    public static l<q6> a(j jVar, o5.a aVar) {
        return new k6(jVar, aVar, null, null);
    }

    public static l<q6> a(q6 q6Var, j jVar, o5.a aVar) {
        return new k6(jVar, aVar, q6Var, null);
    }

    public static l<q6> a(String str, j jVar, o5.a aVar) {
        return new k6(jVar, aVar, null, str);
    }

    @Override // com.my.target.l
    public void a(o5 o5Var, Context context, l.b<q6> bVar) {
        n nVarB = n.b();
        if (this.i != null) {
            q6 q6VarA = a((k6) this.f4033a.d().a(this.i, s.b(""), this.h, this.b, this.c, o5Var, null, nVarB, context), nVarB, context);
            bVar.a(q6VarA, q6VarA == null ? nVarB.a() : null);
            return;
        }
        q6 q6Var = this.h;
        if (q6Var == null) {
            super.a(o5Var, context, bVar);
        } else {
            q6 q6VarA2 = a((k6) q6Var, nVarB, context);
            bVar.a(q6VarA2, q6VarA2 == null ? nVarB.a() : null);
        }
    }
}
