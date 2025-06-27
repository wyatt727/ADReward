package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.tj;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class ae {
    private final d d;
    private final xd.a e;
    private final y6.a f;
    private final HashMap g;
    private final Set h;
    private boolean j;
    private yo k;
    private tj i = new tj.a(0);
    private final IdentityHashMap b = new IdentityHashMap();
    private final Map c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final List f264a = new ArrayList();

    public interface d {
        void a();
    }

    public ae(d dVar, r0 r0Var, Handler handler) {
        this.d = dVar;
        xd.a aVar = new xd.a();
        this.e = aVar;
        y6.a aVar2 = new y6.a();
        this.f = aVar2;
        this.g = new HashMap();
        this.h = new HashSet();
        if (r0Var != null) {
            aVar.a(handler, r0Var);
            aVar2.a(handler, r0Var);
        }
    }

    public boolean d() {
        return this.j;
    }

    public int c() {
        return this.f264a.size();
    }

    public go a(int i, List list, tj tjVar) {
        if (!list.isEmpty()) {
            this.i = tjVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = (c) list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = (c) this.f264a.get(i2 - 1);
                    cVar.a(cVar2.d + cVar2.f267a.i().b());
                } else {
                    cVar.a(0);
                }
                a(i2, cVar.f267a.i().b());
                this.f264a.add(i2, cVar);
                this.c.put(cVar.b, cVar);
                if (this.j) {
                    d(cVar);
                    if (this.b.isEmpty()) {
                        this.h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return a();
    }

    public void e() {
        for (b bVar : this.g.values()) {
            try {
                bVar.f266a.c(bVar.b);
            } catch (RuntimeException e) {
                kc.a("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f266a.a((xd) bVar.c);
            bVar.f266a.a((y6) bVar.c);
        }
        this.g.clear();
        this.h.clear();
        this.j = false;
    }

    private void b() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c.isEmpty()) {
                a(cVar);
                it.remove();
            }
        }
    }

    static final class c implements zd {

        /* renamed from: a, reason: collision with root package name */
        public final sc f267a;
        public int d;
        public boolean e;
        public final List c = new ArrayList();
        public final Object b = new Object();

        public c(wd wdVar, boolean z) {
            this.f267a = new sc(wdVar, z);
        }

        @Override // com.applovin.impl.zd
        public Object a() {
            return this.b;
        }

        @Override // com.applovin.impl.zd
        public go b() {
            return this.f267a.i();
        }

        public void a(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final wd f266a;
        public final wd.b b;
        public final a c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.f266a = wdVar;
            this.b = bVar;
            this.c = aVar;
        }
    }

    private final class a implements xd, y6 {

        /* renamed from: a, reason: collision with root package name */
        private final c f265a;
        private xd.a b;
        private y6.a c;

        @Override // com.applovin.impl.y6
        public /* synthetic */ void e(int i, wd.a aVar) {
            y6.CC.$default$e(this, i, aVar);
        }

        public a(c cVar) {
            this.b = ae.this.e;
            this.c = ae.this.f;
            this.f265a = cVar;
        }

        @Override // com.applovin.impl.xd
        public void a(int i, wd.a aVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.a(pdVar);
            }
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
            wd.a aVarB;
            if (aVar != null) {
                aVarB = ae.b(this.f265a, aVar);
                if (aVarB == null) {
                    return false;
                }
            } else {
                aVarB = null;
            }
            int iB = ae.b(this.f265a, i);
            xd.a aVar2 = this.b;
            if (aVar2.f1167a != iB || !yp.a(aVar2.b, aVarB)) {
                this.b = ae.this.e.a(iB, aVarB, 0L);
            }
            y6.a aVar3 = this.c;
            if (aVar3.f1194a == iB && yp.a(aVar3.b, aVarB)) {
                return true;
            }
            this.c = ae.this.f.a(iB, aVarB);
            return true;
        }

        @Override // com.applovin.impl.xd
        public void c(int i, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.b(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.xd
        public void b(int i, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i, aVar)) {
                this.b.c(icVar, pdVar);
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
                this.b.a(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.b.a(icVar, pdVar, iOException, z);
            }
        }
    }

    private void d(c cVar) {
        sc scVar = cVar.f267a;
        wd.b bVar = new wd.b() { // from class: com.applovin.impl.ae$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.wd.b
            public final void a(wd wdVar, go goVar) {
                this.f$0.a(wdVar, goVar);
            }
        };
        a aVar = new a(cVar);
        this.g.put(cVar, new b(scVar, bVar, aVar));
        scVar.a(yp.b(), (xd) aVar);
        scVar.a(yp.b(), (y6) aVar);
        scVar.a(bVar, this.k);
    }

    private void c(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVar = (b) a1.a((b) this.g.remove(cVar));
            bVar.f266a.c(bVar.b);
            bVar.f266a.a((xd) bVar.c);
            bVar.f266a.a((y6) bVar.c);
            this.h.remove(cVar);
        }
    }

    private void a(int i, int i2) {
        while (i < this.f264a.size()) {
            ((c) this.f264a.get(i)).d += i2;
            i++;
        }
    }

    private void b(c cVar) {
        this.h.add(cVar);
        b bVar = (b) this.g.get(cVar);
        if (bVar != null) {
            bVar.f266a.b(bVar.b);
        }
    }

    public rd a(wd.a aVar, n0 n0Var, long j) {
        Object objB = b(aVar.f1031a);
        wd.a aVarB = aVar.b(a(aVar.f1031a));
        c cVar = (c) a1.a((c) this.c.get(objB));
        b(cVar);
        cVar.c.add(aVarB);
        rc rcVarA = cVar.f267a.a(aVarB, n0Var, j);
        this.b.put(rcVarA, cVar);
        b();
        return rcVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wd.a b(c cVar, wd.a aVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (((wd.a) cVar.c.get(i)).d == aVar.d) {
                return aVar.b(a(cVar, aVar.f1031a));
            }
        }
        return null;
    }

    public go a() {
        if (this.f264a.isEmpty()) {
            return go.f465a;
        }
        int iB = 0;
        for (int i = 0; i < this.f264a.size(); i++) {
            c cVar = (c) this.f264a.get(i);
            cVar.d = iB;
            iB += cVar.f267a.i().b();
        }
        return new ph(this.f264a, this.i);
    }

    private static Object b(Object obj) {
        return com.applovin.impl.b.d(obj);
    }

    private void a(c cVar) {
        b bVar = (b) this.g.get(cVar);
        if (bVar != null) {
            bVar.f266a.a(bVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i) {
        return i + cVar.d;
    }

    private static Object a(Object obj) {
        return com.applovin.impl.b.c(obj);
    }

    private void b(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVar = (c) this.f264a.remove(i3);
            this.c.remove(cVar.b);
            a(i3, -cVar.f267a.i().b());
            cVar.e = true;
            if (this.j) {
                c(cVar);
            }
        }
    }

    private static Object a(c cVar, Object obj) {
        return com.applovin.impl.b.a(cVar.b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(wd wdVar, go goVar) {
        this.d.a();
    }

    public void a(yo yoVar) {
        a1.b(!this.j);
        this.k = yoVar;
        for (int i = 0; i < this.f264a.size(); i++) {
            c cVar = (c) this.f264a.get(i);
            d(cVar);
            this.h.add(cVar);
        }
        this.j = true;
    }

    public void a(rd rdVar) {
        c cVar = (c) a1.a((c) this.b.remove(rdVar));
        cVar.f267a.a(rdVar);
        cVar.c.remove(((rc) rdVar).f858a);
        if (!this.b.isEmpty()) {
            b();
        }
        c(cVar);
    }

    public go a(int i, int i2, tj tjVar) {
        a1.a(i >= 0 && i <= i2 && i2 <= c());
        this.i = tjVar;
        b(i, i2);
        return a();
    }

    public go a(List list, tj tjVar) {
        b(0, this.f264a.size());
        return a(this.f264a.size(), list, tjVar);
    }

    public go a(tj tjVar) {
        int iC = c();
        if (tjVar.a() != iC) {
            tjVar = tjVar.d().b(0, iC);
        }
        this.i = tjVar;
        return a();
    }
}
