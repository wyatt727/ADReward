package com.my.target;

import android.content.Context;
import com.my.target.l;
import com.my.target.o5;

/* loaded from: classes4.dex */
public final class m9 extends l<q9> {
    public final q9 h;

    public static class a implements l.a<q9> {
        @Override // com.my.target.l.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.l.a
        public t b() {
            return t.a();
        }

        @Override // com.my.target.l.a
        public p<q9> c() {
            return p9.a();
        }

        @Override // com.my.target.l.a
        public o<q9> d() {
            return o9.a();
        }
    }

    public m9(j jVar, o5.a aVar, q9 q9Var) {
        super(new a(), jVar, aVar);
        this.h = q9Var;
    }

    public static l<q9> a(j jVar, o5.a aVar) {
        return new m9(jVar, aVar, null);
    }

    public static l<q9> a(q9 q9Var, j jVar, o5.a aVar) {
        return new m9(jVar, aVar, q9Var);
    }

    @Override // com.my.target.l
    public void a(o5 o5Var, Context context, l.b<q9> bVar) {
        n nVarB = n.b();
        q9 q9Var = this.h;
        if (q9Var == null) {
            super.a(o5Var, context, bVar);
        } else {
            q9 q9VarA = a((m9) q9Var, nVarB, context);
            bVar.a(q9VarA, q9VarA != null ? null : nVarB.a());
        }
    }
}
