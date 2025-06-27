package com.my.target;

import android.content.Context;
import com.my.target.l;
import com.my.target.o5;

/* loaded from: classes4.dex */
public final class t3 extends l<e4> {
    public final e4 h;

    public static class a implements l.a<e4> {
        @Override // com.my.target.l.a
        public boolean a() {
            return true;
        }

        @Override // com.my.target.l.a
        public t b() {
            return t.a();
        }

        @Override // com.my.target.l.a
        public p<e4> c() {
            return d4.a();
        }

        @Override // com.my.target.l.a
        public o<e4> d() {
            return c4.a();
        }
    }

    public t3(j jVar, o5.a aVar, e4 e4Var) {
        super(new a(), jVar, aVar);
        this.h = e4Var;
    }

    public static l<e4> a(e4 e4Var, j jVar, o5.a aVar) {
        return new t3(jVar, aVar, e4Var);
    }

    public static l<e4> a(j jVar, o5.a aVar) {
        return new t3(jVar, aVar, null);
    }

    @Override // com.my.target.l
    public void a(o5 o5Var, Context context, l.b<e4> bVar) {
        if (this.h == null) {
            super.a(o5Var, context, bVar);
            return;
        }
        n nVarB = n.b();
        e4 e4VarA = a((t3) this.h, nVarB, context);
        bVar.a(e4VarA, e4VarA != null ? null : nVarB.a());
    }
}
