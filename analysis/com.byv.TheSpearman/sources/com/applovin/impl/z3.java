package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class z3 extends b2 {
    private final HashMap g = new HashMap();
    private Handler h;
    private yo i;

    protected int a(Object obj, int i) {
        return i;
    }

    protected long a(Object obj, long j) {
        return j;
    }

    protected abstract wd.a a(Object obj, wd.a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, wd wdVar, go goVar);

    protected z3() {
    }

    @Override // com.applovin.impl.b2
    protected void f() {
        for (b bVar : this.g.values()) {
            bVar.f1225a.b(bVar.b);
        }
    }

    @Override // com.applovin.impl.b2
    protected void e() {
        for (b bVar : this.g.values()) {
            bVar.f1225a.a(bVar.b);
        }
    }

    @Override // com.applovin.impl.b2
    protected void h() {
        for (b bVar : this.g.values()) {
            bVar.f1225a.c(bVar.b);
            bVar.f1225a.a((xd) bVar.c);
            bVar.f1225a.a((y6) bVar.c);
        }
        this.g.clear();
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final wd f1225a;
        public final wd.b b;
        public final a c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.f1225a = wdVar;
            this.b = bVar;
            this.c = aVar;
        }
    }

    private final class a implements xd, y6 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f1224a;
        private xd.a b;
        private y6.a c;

        @Override // com.applovin.impl.y6
        public /* synthetic */ void e(int i, wd.a aVar) {
            y6.CC.$default$e(this, i, aVar);
        }

        public a(Object obj) {
            this.b = z3.this.b((wd.a) null);
            this.c = z3.this.a((wd.a) null);
            this.f1224a = obj;
        }

        @Override // com.applovin.impl.y6
        public void d(int i, wd.a aVar) {
            if (f(i, aVar)) {
                this.c.a();
            }
        }

        @Override // com.applovin.impl.y6
        public void c(int i, wd.a aVar) {
            if (f(i, aVar)) {
                this.c.c();
            }
        }

        @Override // com.applovin.impl.y6
        public void b(int i, wd.a aVar) {
            if (f(i, aVar)) {
                this.c.d();
            }
        }

        private boolean f(int i, wd.a aVar) {
            wd.a aVarA;
            if (aVar != null) {
                aVarA = z3.this.a(this.f1224a, aVar);
                if (aVarA == null) {
                    return false;
                }
            } else {
                aVarA = null;
            }
            int iA = z3.this.a(this.f1224a, i);
            xd.a aVar2 = this.b;
            if (aVar2.f1167a != iA || !yp.a(aVar2.b, aVarA)) {
                this.b = z3.this.a(iA, aVarA, 0L);
            }
            y6.a aVar3 = this.c;
            if (aVar3.f1194a == iA && yp.a(aVar3.b, aVarA)) {
                return true;
            }
            this.c = z3.this.a(iA, aVarA);
            return true;
        }

        private pd a(pd pdVar) {
            long jA = z3.this.a(this.f1224a, pdVar.f);
            long jA2 = z3.this.a(this.f1224a, pdVar.g);
            return (jA == pdVar.f && jA2 == pdVar.g) ? pdVar : new pd(pdVar.f779a, pdVar.b, pdVar.c, pdVar.d, pdVar.e, jA, jA2);
        }

        @Override // com.applovin.impl.xd
        public void c(int i, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.b(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void b(int i, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.c(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i, wd.a aVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.a(a(pdVar));
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i, wd.a aVar) {
            if (f(i, aVar)) {
                this.c.b();
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i, wd.a aVar, int i2) {
            if (f(i, aVar)) {
                this.c.a(i2);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i, wd.a aVar, Exception exc) {
            if (f(i, aVar)) {
                this.c.a(exc);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.a(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.b.a(icVar, a(pdVar), iOException, z);
            }
        }
    }

    protected final void a(final Object obj, wd wdVar) {
        a1.a(!this.g.containsKey(obj));
        wd.b bVar = new wd.b() { // from class: com.applovin.impl.z3$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.wd.b
            public final void a(wd wdVar2, go goVar) {
                this.f$0.a(obj, wdVar2, goVar);
            }
        };
        a aVar = new a(obj);
        this.g.put(obj, new b(wdVar, bVar, aVar));
        wdVar.a((Handler) a1.a(this.h), (xd) aVar);
        wdVar.a((Handler) a1.a(this.h), (y6) aVar);
        wdVar.a(bVar, this.i);
        if (g()) {
            return;
        }
        wdVar.a(bVar);
    }

    @Override // com.applovin.impl.b2
    protected void a(yo yoVar) {
        this.i = yoVar;
        this.h = yp.a();
    }
}
