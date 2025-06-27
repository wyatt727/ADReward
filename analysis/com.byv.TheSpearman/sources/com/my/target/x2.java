package com.my.target;

import android.content.Context;
import com.my.target.l;
import com.my.target.o5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class x2 extends l<a3> {
    public final List<s> h;
    public final q8 i;
    public Runnable j;

    public static class a implements l.a<a3> {
        @Override // com.my.target.l.a
        public boolean a() {
            return true;
        }

        @Override // com.my.target.l.a
        public t b() {
            return t.a();
        }

        @Override // com.my.target.l.a
        public p<a3> c() {
            return z2.a();
        }

        @Override // com.my.target.l.a
        public o<a3> d() {
            return y2.a();
        }
    }

    public x2(j jVar, o5.a aVar, int i) {
        this(null, jVar, aVar, i);
    }

    public x2(List<s> list, j jVar, o5.a aVar, int i) {
        super(new a(), jVar, aVar);
        this.h = list;
        this.i = q8.a(i * 1000);
    }

    public static l<a3> a(j jVar, o5.a aVar, int i) {
        return new x2(jVar, aVar, i);
    }

    public static l<a3> a(s sVar, j jVar, o5.a aVar, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sVar);
        return new x2(arrayList, jVar, aVar, i);
    }

    public static l<a3> a(List<s> list, j jVar, o5.a aVar, int i) {
        return new x2(list, jVar, aVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(o5 o5Var, Context context) {
        this.i.b(this.j);
        a((x2) null, m.o, o5Var, context);
    }

    @Override // com.my.target.l
    public l<a3> a(final o5 o5Var, final Context context) {
        if (this.j == null) {
            this.j = new Runnable() { // from class: com.my.target.x2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(o5Var, context);
                }
            };
        }
        this.i.a(this.j);
        return super.a(o5Var, context);
    }

    @Override // com.my.target.l
    public void a(o5 o5Var, Context context, l.b<a3> bVar) {
        if (this.h == null) {
            super.a(o5Var, context, bVar);
            return;
        }
        n nVarB = n.b();
        a3 a3VarA = a((x2) a(this.h, (List<s>) null, (o<List<s>>) this.f4033a.d(), x1.a(), o5Var, nVarB, context), nVarB, context);
        bVar.a(a3VarA, a3VarA != null ? null : nVarB.a());
    }
}
