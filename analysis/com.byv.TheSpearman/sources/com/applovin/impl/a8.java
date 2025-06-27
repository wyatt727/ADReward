package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.ae;
import com.applovin.impl.c8;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.oh;
import com.applovin.impl.tj;
import com.applovin.impl.wd;
import com.google.android.exoplayer2.C;
import com.json.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class a8 extends c2 {
    private fj A;
    private tj B;
    private boolean C;
    private nh.b D;
    private qd E;
    private qd F;
    private lh G;
    private int H;
    private int I;
    private long J;
    final xo b;
    final nh.b c;
    private final li[] d;
    private final wo e;
    private final ha f;
    private final c8.f g;
    private final c8 h;
    private final cc i;
    private final CopyOnWriteArraySet j;
    private final go.b k;
    private final List l;
    private final boolean m;
    private final yd n;
    private final r0 o;
    private final Looper p;
    private final x1 q;
    private final long r;
    private final long s;
    private final j3 t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    private go R() {
        return new ph(this.l, this.B);
    }

    @Override // com.applovin.impl.nh
    public uo A() {
        return new uo(this.G.i.c);
    }

    @Override // com.applovin.impl.nh
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public ab x() {
        return ab.h();
    }

    @Override // com.applovin.impl.nh
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.nh
    public void a(TextureView textureView) {
    }

    @Override // com.applovin.impl.nh
    public void b(SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.nh
    public void b(TextureView textureView) {
    }

    @Override // com.applovin.impl.nh
    public long q() {
        return C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }

    @Override // com.applovin.impl.nh
    public yq z() {
        return yq.f;
    }

    public a8(li[] liVarArr, wo woVar, yd ydVar, gc gcVar, x1 x1Var, r0 r0Var, boolean z, fj fjVar, long j, long j2, fc fcVar, long j3, boolean z2, j3 j3Var, Looper looper, nh nhVar, nh.b bVar) {
        kc.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + yp.e + t2.i.e);
        a1.b(liVarArr.length > 0);
        this.d = (li[]) a1.a(liVarArr);
        this.e = (wo) a1.a(woVar);
        this.n = ydVar;
        this.q = x1Var;
        this.o = r0Var;
        this.m = z;
        this.A = fjVar;
        this.r = j;
        this.s = j2;
        this.C = z2;
        this.p = looper;
        this.t = j3Var;
        this.u = 0;
        final nh nhVar2 = nhVar != null ? nhVar : this;
        this.i = new cc(looper, j3Var, new cc.b() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda13
            @Override // com.applovin.impl.cc.b
            public final void a(Object obj, z8 z8Var) {
                a8.a(nhVar2, (nh.c) obj, z8Var);
            }
        });
        this.j = new CopyOnWriteArraySet();
        this.l = new ArrayList();
        this.B = new tj.a(0);
        xo xoVar = new xo(new ni[liVarArr.length], new f8[liVarArr.length], null);
        this.b = xoVar;
        this.k = new go.b();
        nh.b bVarA = new nh.b.a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, woVar.b()).a(bVar).a();
        this.c = bVarA;
        this.D = new nh.b.a().a(bVarA).a(3).a(9).a();
        qd qdVar = qd.H;
        this.E = qdVar;
        this.F = qdVar;
        this.H = -1;
        this.f = j3Var.a(looper, null);
        c8.f fVar = new c8.f() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.c8.f
            public final void a(c8.e eVar) {
                this.f$0.c(eVar);
            }
        };
        this.g = fVar;
        this.G = lh.a(xoVar);
        if (r0Var != null) {
            r0Var.a(nhVar2, looper);
            b((nh.e) r0Var);
            x1Var.a(new Handler(looper), r0Var);
        }
        this.h = new c8(liVarArr, woVar, xoVar, gcVar, x1Var, this.u, this.v, r0Var, fjVar, fcVar, j3, z2, looper, j3Var, fVar);
    }

    public void c(long j) {
        this.h.a(j);
    }

    public boolean S() {
        return this.G.p;
    }

    @Override // com.applovin.impl.nh
    public Looper p() {
        return this.p;
    }

    @Override // com.applovin.impl.nh
    public void b(nh.e eVar) {
        a((nh.c) eVar);
    }

    public void a(z7 z7Var) {
        this.j.add(z7Var);
    }

    @Override // com.applovin.impl.nh
    public nh.b i() {
        return this.D;
    }

    @Override // com.applovin.impl.nh
    public int o() {
        return this.G.e;
    }

    @Override // com.applovin.impl.nh
    public int j() {
        return this.G.m;
    }

    @Override // com.applovin.impl.nh
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public y7 c() {
        return this.G.f;
    }

    @Override // com.applovin.impl.nh
    public boolean l() {
        return this.G.l;
    }

    @Override // com.applovin.impl.nh
    public int m() {
        return this.u;
    }

    public void a(nh.c cVar) {
        this.i.a(cVar);
    }

    @Override // com.applovin.impl.nh
    public boolean r() {
        return this.v;
    }

    @Override // com.applovin.impl.nh
    public long F() {
        return this.r;
    }

    @Override // com.applovin.impl.nh
    public long e() {
        return this.s;
    }

    public void W() {
        kc.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + yp.e + "] [" + d8.a() + t2.i.e);
        if (!this.h.x()) {
            this.i.b(10, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda10
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.c((nh.c) obj);
                }
            });
        }
        this.i.b();
        this.f.a((Object) null);
        r0 r0Var = this.o;
        if (r0Var != null) {
            this.q.a(r0Var);
        }
        lh lhVarA = this.G.a(1);
        this.G = lhVarA;
        lh lhVarA2 = lhVarA.a(lhVarA.b);
        this.G = lhVarA2;
        lhVarA2.q = lhVarA2.s;
        this.G.r = 0L;
    }

    @Override // com.applovin.impl.nh
    public int v() {
        if (this.G.f631a.c()) {
            return this.I;
        }
        lh lhVar = this.G;
        return lhVar.f631a.a(lhVar.b.f1031a);
    }

    @Override // com.applovin.impl.nh
    public int t() {
        int iU = U();
        if (iU == -1) {
            return 0;
        }
        return iU;
    }

    @Override // com.applovin.impl.nh
    public long getDuration() {
        if (d()) {
            lh lhVar = this.G;
            wd.a aVar = lhVar.b;
            lhVar.f631a.a(aVar.f1031a, this.k);
            return r2.b(this.k.a(aVar.b, aVar.c));
        }
        return G();
    }

    @Override // com.applovin.impl.nh
    public long getCurrentPosition() {
        return r2.b(a(this.G));
    }

    @Override // com.applovin.impl.nh
    public long h() {
        return r2.b(this.G.r);
    }

    @Override // com.applovin.impl.nh
    public int E() {
        if (d()) {
            return this.G.b.b;
        }
        return -1;
    }

    @Override // com.applovin.impl.nh
    public int f() {
        if (d()) {
            return this.G.b.c;
        }
        return -1;
    }

    @Override // com.applovin.impl.nh
    public long g() {
        if (d()) {
            lh lhVar = this.G;
            lhVar.f631a.a(lhVar.b.f1031a, this.k);
            lh lhVar2 = this.G;
            if (lhVar2.c == -9223372036854775807L) {
                return lhVar2.f631a.a(t(), this.f309a).b();
            }
            return this.k.d() + r2.b(this.G.c);
        }
        return getCurrentPosition();
    }

    @Override // com.applovin.impl.nh
    public long s() {
        if (this.G.f631a.c()) {
            return this.J;
        }
        lh lhVar = this.G;
        if (lhVar.k.d != lhVar.b.d) {
            return lhVar.f631a.a(t(), this.f309a).d();
        }
        long j = lhVar.q;
        if (this.G.k.a()) {
            lh lhVar2 = this.G;
            go.b bVarA = lhVar2.f631a.a(lhVar2.k.f1031a, this.k);
            long jB = bVarA.b(this.G.k.b);
            j = jB == Long.MIN_VALUE ? bVarA.d : jB;
        }
        lh lhVar3 = this.G;
        return r2.b(a(lhVar3.f631a, lhVar3.k, j));
    }

    @Override // com.applovin.impl.nh
    public qo k() {
        return this.G.h;
    }

    @Override // com.applovin.impl.nh
    public qd C() {
        return this.E;
    }

    @Override // com.applovin.impl.nh
    public go n() {
        return this.G.f631a;
    }

    private int U() {
        if (this.G.f631a.c()) {
            return this.H;
        }
        lh lhVar = this.G;
        return lhVar.f631a.a(lhVar.b.f1031a, this.k).c;
    }

    private nh.f d(long j) {
        int iA;
        od odVar;
        Object obj;
        int iT = t();
        Object obj2 = null;
        if (this.G.f631a.c()) {
            iA = -1;
            odVar = null;
            obj = null;
        } else {
            lh lhVar = this.G;
            Object obj3 = lhVar.b.f1031a;
            lhVar.f631a.a(obj3, this.k);
            iA = this.G.f631a.a(obj3);
            obj = obj3;
            obj2 = this.G.f631a.a(iT, this.f309a).f467a;
            odVar = this.f309a.c;
        }
        long jB = r2.b(j);
        long jB2 = this.G.b.a() ? r2.b(b(this.G)) : jB;
        wd.a aVar = this.G.b;
        return new nh.f(obj2, iT, odVar, obj, iA, jB, jB2, aVar.b, aVar.c);
    }

    private void X() {
        nh.b bVar = this.D;
        nh.b bVarA = a(this.c);
        this.D = bVarA;
        if (bVarA.equals(bVar)) {
            return;
        }
        this.i.a(13, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda16
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                this.f$0.d((nh.c) obj);
            }
        });
    }

    private static long b(lh lhVar) {
        go.d dVar = new go.d();
        go.b bVar = new go.b();
        lhVar.f631a.a(lhVar.b.f1031a, bVar);
        if (lhVar.c == -9223372036854775807L) {
            return lhVar.f631a.a(bVar.c, dVar).c();
        }
        return bVar.e() + lhVar.c;
    }

    private static final class a implements zd {

        /* renamed from: a, reason: collision with root package name */
        private final Object f236a;
        private go b;

        public a(Object obj, go goVar) {
            this.f236a = obj;
            this.b = goVar;
        }

        @Override // com.applovin.impl.zd
        public go b() {
            return this.b;
        }

        @Override // com.applovin.impl.zd
        public Object a() {
            return this.f236a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.e);
    }

    private Pair a(lh lhVar, lh lhVar2, boolean z, int i, boolean z2) {
        go goVar = lhVar2.f631a;
        go goVar2 = lhVar.f631a;
        if (goVar2.c() && goVar.c()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (goVar2.c() != goVar.c()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (goVar.a(goVar.a(lhVar2.b.f1031a, this.k).c, this.f309a).f467a.equals(goVar2.a(goVar2.a(lhVar.b.f1031a, this.k).c, this.f309a).f467a)) {
            if (z && i == 0 && lhVar2.b.d < lhVar.b.d) {
                return new Pair(Boolean.TRUE, 0);
            }
            return new Pair(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i2));
    }

    private static boolean c(lh lhVar) {
        return lhVar.e == 3 && lhVar.l && lhVar.m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(lh lhVar, nh.c cVar) {
        cVar.d(c(lhVar));
    }

    public void e(nh.c cVar) {
        this.i.b(cVar);
    }

    @Override // com.applovin.impl.nh
    public boolean d() {
        return this.G.b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final c8.e eVar) {
        this.f.a(new Runnable() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(nh.c cVar) {
        cVar.a(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(nh.c cVar) {
        cVar.a(y7.a(new e8(1), 1003));
    }

    private long a(lh lhVar) {
        if (lhVar.f631a.c()) {
            return r2.a(this.J);
        }
        if (lhVar.b.a()) {
            return lhVar.s;
        }
        return a(lhVar.f631a, lhVar.b, lhVar.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(nh.c cVar) {
        cVar.a(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(lh lhVar, nh.c cVar) {
        cVar.e(lhVar.g);
        cVar.c(lhVar.g);
    }

    private Pair a(go goVar, go goVar2) {
        long jG = g();
        if (!goVar.c() && !goVar2.c()) {
            Pair pairA = goVar.a(this.f309a, this.k, t(), r2.a(jG));
            Object obj = ((Pair) yp.a(pairA)).first;
            if (goVar2.a(obj) != -1) {
                return pairA;
            }
            Object objA = c8.a(this.f309a, this.k, this.u, this.v, obj, goVar, goVar2);
            if (objA != null) {
                goVar2.a(objA, this.k);
                int i = this.k.c;
                return a(goVar2, i, goVar2.a(i, this.f309a).b());
            }
            return a(goVar2, -1, -9223372036854775807L);
        }
        boolean z = !goVar.c() && goVar2.c();
        int iU = z ? -1 : U();
        if (z) {
            jG = -9223372036854775807L;
        }
        return a(goVar2, iU, jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.l, lhVar.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(lh lhVar, int i, nh.c cVar) {
        cVar.a(lhVar.f631a, i);
    }

    @Override // com.applovin.impl.nh
    public void b() {
        lh lhVar = this.G;
        if (lhVar.e != 1) {
            return;
        }
        lh lhVarA = lhVar.a((y7) null);
        lh lhVarA2 = lhVarA.a(lhVarA.f631a.c() ? 4 : 2);
        this.w++;
        this.h.v();
        a(lhVarA2, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    private Pair a(go goVar, int i, long j) {
        if (goVar.c()) {
            this.H = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.J = j;
            this.I = 0;
            return null;
        }
        if (i == -1 || i >= goVar.b()) {
            i = goVar.a(this.v);
            j = goVar.a(i, this.f309a).b();
        }
        return goVar.a(this.f309a, this.k, i, r2.a(j));
    }

    private void b(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.l.remove(i3);
        }
        this.B = this.B.a(i, i2);
    }

    @Override // com.applovin.impl.nh
    public mh a() {
        return this.G.n;
    }

    @Override // com.applovin.impl.nh
    public void b(final boolean z) {
        if (this.v != z) {
            this.v = z;
            this.h.f(z);
            this.i.a(9, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda9
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).b(z);
                }
            });
            X();
            this.i.a();
        }
    }

    private nh.f a(int i, lh lhVar, int i2) {
        int i3;
        int iA;
        Object obj;
        od odVar;
        Object obj2;
        long jB;
        long jA;
        long jB2;
        long j;
        go.b bVar = new go.b();
        if (lhVar.f631a.c()) {
            i3 = i2;
            iA = -1;
            obj = null;
            odVar = null;
            obj2 = null;
        } else {
            Object obj3 = lhVar.b.f1031a;
            lhVar.f631a.a(obj3, bVar);
            int i4 = bVar.c;
            i3 = i4;
            obj2 = obj3;
            iA = lhVar.f631a.a(obj3);
            obj = lhVar.f631a.a(i4, this.f309a).f467a;
            odVar = this.f309a.c;
        }
        if (i == 0) {
            jB = bVar.f + bVar.d;
            if (lhVar.b.a()) {
                wd.a aVar = lhVar.b;
                jA = bVar.a(aVar.b, aVar.c);
                jB2 = b(lhVar);
                long j2 = jB2;
                j = jA;
                jB = j2;
            } else {
                if (lhVar.b.e != -1 && this.G.b.a()) {
                    jB = b(this.G);
                }
                j = jB;
            }
        } else if (lhVar.b.a()) {
            jA = lhVar.s;
            jB2 = b(lhVar);
            long j22 = jB2;
            j = jA;
            jB = j22;
        } else {
            jB = bVar.f + lhVar.s;
            j = jB;
        }
        long jB3 = r2.b(j);
        long jB4 = r2.b(jB);
        wd.a aVar2 = lhVar.b;
        return new nh.f(obj, i3, odVar, obj2, iA, jB3, jB4, aVar2.b, aVar2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(c8.e eVar) {
        long j;
        boolean z;
        long jA;
        int i = this.w - eVar.c;
        this.w = i;
        boolean z2 = true;
        if (eVar.d) {
            this.x = eVar.e;
            this.y = true;
        }
        if (eVar.f) {
            this.z = eVar.g;
        }
        if (i == 0) {
            go goVar = eVar.b.f631a;
            if (!this.G.f631a.c() && goVar.c()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!goVar.c()) {
                List listD = ((ph) goVar).d();
                a1.b(listD.size() == this.l.size());
                for (int i2 = 0; i2 < listD.size(); i2++) {
                    ((a) this.l.get(i2)).b = (go) listD.get(i2);
                }
            }
            if (this.y) {
                if (eVar.b.b.equals(this.G.b) && eVar.b.d == this.G.s) {
                    z2 = false;
                }
                if (z2) {
                    if (!goVar.c() && !eVar.b.b.a()) {
                        lh lhVar = eVar.b;
                        jA = a(goVar, lhVar.b, lhVar.d);
                    } else {
                        jA = eVar.b.d;
                    }
                    j = jA;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.y = false;
            a(eVar.b, 1, this.z, false, z, this.x, j, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(nh nhVar, nh.c cVar, z8 z8Var) {
        cVar.a(nhVar, new nh.d(z8Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i, nh.f fVar, nh.f fVar2, nh.c cVar) {
        cVar.e(i);
        cVar.a(fVar, fVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(lh lhVar, uo uoVar, nh.c cVar) {
        cVar.a(lhVar.h, uoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(lh lhVar, int i, nh.c cVar) {
        cVar.a(lhVar.l, i);
    }

    private lh a(lh lhVar, go goVar, Pair pair) {
        wd.a aVar;
        xo xoVar;
        lh lhVarA;
        long jA;
        a1.a(goVar.c() || pair != null);
        go goVar2 = lhVar.f631a;
        lh lhVarA2 = lhVar.a(goVar);
        if (goVar.c()) {
            wd.a aVarA = lh.a();
            long jA2 = r2.a(this.J);
            lh lhVarA3 = lhVarA2.a(aVarA, jA2, jA2, jA2, 0L, qo.d, this.b, ab.h()).a(aVarA);
            lhVarA3.q = lhVarA3.s;
            return lhVarA3;
        }
        Object obj = lhVarA2.b.f1031a;
        boolean z = !obj.equals(((Pair) yp.a(pair)).first);
        wd.a aVar2 = z ? new wd.a(pair.first) : lhVarA2.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA3 = r2.a(g());
        if (!goVar2.c()) {
            jA3 -= goVar2.a(obj, this.k).e();
        }
        if (z || jLongValue < jA3) {
            a1.b(!aVar2.a());
            qo qoVar = z ? qo.d : lhVarA2.h;
            if (z) {
                aVar = aVar2;
                xoVar = this.b;
            } else {
                aVar = aVar2;
                xoVar = lhVarA2.i;
            }
            lh lhVarA4 = lhVarA2.a(aVar, jLongValue, jLongValue, jLongValue, 0L, qoVar, xoVar, z ? ab.h() : lhVarA2.j).a(aVar);
            lhVarA4.q = jLongValue;
            return lhVarA4;
        }
        if (jLongValue == jA3) {
            int iA = goVar.a(lhVarA2.k.f1031a);
            if (iA != -1 && goVar.a(iA, this.k).c == goVar.a(aVar2.f1031a, this.k).c) {
                return lhVarA2;
            }
            goVar.a(aVar2.f1031a, this.k);
            if (aVar2.a()) {
                jA = this.k.a(aVar2.b, aVar2.c);
            } else {
                jA = this.k.d;
            }
            lhVarA = lhVarA2.a(aVar2, lhVarA2.s, lhVarA2.s, lhVarA2.d, jA - lhVarA2.s, lhVarA2.h, lhVarA2.i, lhVarA2.j).a(aVar2);
            lhVarA.q = jA;
        } else {
            a1.b(!aVar2.a());
            long jMax = Math.max(0L, lhVarA2.r - (jLongValue - jA3));
            long j = lhVarA2.q;
            if (lhVarA2.k.equals(lhVarA2.b)) {
                j = jLongValue + jMax;
            }
            lhVarA = lhVarA2.a(aVar2, jLongValue, jLongValue, jLongValue, jMax, lhVarA2.h, lhVarA2.i, lhVarA2.j);
            lhVarA.q = j;
        }
        return lhVarA;
    }

    public void a(we weVar) {
        qd qdVarA = this.E.a().a(weVar).a();
        if (qdVarA.equals(this.E)) {
            return;
        }
        this.E = qdVarA;
        this.i.b(14, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda17
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                this.f$0.b((nh.c) obj);
            }
        });
    }

    private long a(go goVar, wd.a aVar, long j) {
        goVar.a(aVar.f1031a, this.k);
        return j + this.k.e();
    }

    @Override // com.applovin.impl.nh
    public void a(nh.e eVar) {
        e(eVar);
    }

    private lh a(int i, int i2) {
        a1.a(i >= 0 && i2 >= i && i2 <= this.l.size());
        int iT = t();
        go goVarN = n();
        int size = this.l.size();
        this.w++;
        b(i, i2);
        go goVarR = R();
        lh lhVarA = a(this.G, goVarR, a(goVarN, goVarR));
        int i3 = lhVarA.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iT >= lhVarA.f631a.b()) {
            lhVarA = lhVarA.a(4);
        }
        this.h.b(i, i2, this.B);
        return lhVarA;
    }

    @Override // com.applovin.impl.nh
    public void a(int i, long j) {
        go goVar = this.G.f631a;
        if (i >= 0 && (goVar.c() || i < goVar.b())) {
            this.w++;
            if (d()) {
                kc.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                c8.e eVar = new c8.e(this.G);
                eVar.a(1);
                this.g.a(eVar);
                return;
            }
            int i2 = o() != 1 ? 2 : 1;
            int iT = t();
            lh lhVarA = a(this.G.a(i2), goVar, a(goVar, i, j));
            this.h.a(goVar, i, r2.a(j));
            a(lhVarA, 0, 1, true, true, 1, a(lhVarA), iT);
            return;
        }
        throw new xa(goVar, i, j);
    }

    public void a(wd wdVar) {
        a(Collections.singletonList(wdVar));
    }

    public void a(List list) {
        a(list, true);
    }

    public void a(List list, boolean z) {
        a(list, -1, -9223372036854775807L, z);
    }

    private void a(List list, int i, long j, boolean z) {
        int iA;
        long j2;
        int iU = U();
        long currentPosition = getCurrentPosition();
        this.w++;
        if (!this.l.isEmpty()) {
            b(0, this.l.size());
        }
        List listA = a(0, list);
        go goVarR = R();
        if (!goVarR.c() && i >= goVarR.b()) {
            throw new xa(goVarR, i, j);
        }
        if (z) {
            j2 = -9223372036854775807L;
            iA = goVarR.a(this.v);
        } else if (i == -1) {
            iA = iU;
            j2 = currentPosition;
        } else {
            iA = i;
            j2 = j;
        }
        lh lhVarA = a(this.G, goVarR, a(goVarR, iA, j2));
        int i2 = lhVarA.e;
        if (iA != -1 && i2 != 1) {
            i2 = (goVarR.c() || iA >= goVarR.b()) ? 4 : 2;
        }
        lh lhVarA2 = lhVarA.a(i2);
        this.h.a(listA, iA, r2.a(j2), this.B);
        a(lhVarA2, 0, 1, false, (this.G.b.f1031a.equals(lhVarA2.b.f1031a) || this.G.f631a.c()) ? false : true, 4, a(lhVarA2), -1);
    }

    @Override // com.applovin.impl.nh
    public void a(boolean z) {
        a(z, 0, 1);
    }

    public void a(boolean z, int i, int i2) {
        lh lhVar = this.G;
        if (lhVar.l == z && lhVar.m == i) {
            return;
        }
        this.w++;
        lh lhVarA = lhVar.a(z, i);
        this.h.a(z, i);
        a(lhVarA, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.applovin.impl.nh
    public void a(final int i) {
        if (this.u != i) {
            this.u = i;
            this.h.a(i);
            this.i.a(8, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda11
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).c(i);
                }
            });
            X();
            this.i.a();
        }
    }

    public void a(boolean z, y7 y7Var) {
        lh lhVarA;
        if (z) {
            lhVarA = a(0, this.l.size()).a((y7) null);
        } else {
            lh lhVar = this.G;
            lhVarA = lhVar.a(lhVar.b);
            lhVarA.q = lhVarA.s;
            lhVarA.r = 0L;
        }
        lh lhVarA2 = lhVarA.a(1);
        if (y7Var != null) {
            lhVarA2 = lhVarA2.a(y7Var);
        }
        lh lhVar2 = lhVarA2;
        this.w++;
        this.h.G();
        a(lhVar2, 0, 1, false, lhVar2.f631a.c() && !this.G.f631a.c(), 4, a(lhVar2), -1);
    }

    private void a(final lh lhVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        lh lhVar2 = this.G;
        this.G = lhVar;
        Pair pairA = a(lhVar, lhVar2, z2, i3, !lhVar2.f631a.equals(lhVar.f631a));
        boolean zBooleanValue = ((Boolean) pairA.first).booleanValue();
        final int iIntValue = ((Integer) pairA.second).intValue();
        qd qdVarA = this.E;
        if (zBooleanValue) {
            odVar = lhVar.f631a.c() ? null : lhVar.f631a.a(lhVar.f631a.a(lhVar.b.f1031a, this.k).c, this.f309a).c;
            qdVarA = odVar != null ? odVar.d : qd.H;
        }
        if (!lhVar2.j.equals(lhVar.j)) {
            qdVarA = qdVarA.a().a(lhVar.j).a();
        }
        boolean z3 = !qdVarA.equals(this.E);
        this.E = qdVarA;
        if (!lhVar2.f631a.equals(lhVar.f631a)) {
            this.i.a(0, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda5
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.b(lhVar, i, (nh.c) obj);
                }
            });
        }
        if (z2) {
            final nh.f fVarA = a(i3, lhVar2, i4);
            final nh.f fVarD = d(j);
            this.i.a(11, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda15
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.a(i3, fVarA, fVarD, (nh.c) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.i.a(1, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda7
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).a(odVar, iIntValue);
                }
            });
        }
        if (lhVar2.f != lhVar.f) {
            this.i.a(10, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.a(lhVar, (nh.c) obj);
                }
            });
            if (lhVar.f != null) {
                this.i.a(10, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda19
                    @Override // com.applovin.impl.cc.a
                    public final void a(Object obj) {
                        a8.b(lhVar, (nh.c) obj);
                    }
                });
            }
        }
        xo xoVar = lhVar2.i;
        xo xoVar2 = lhVar.i;
        if (xoVar != xoVar2) {
            this.e.a(xoVar2.d);
            final uo uoVar = new uo(lhVar.i.c);
            this.i.a(2, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda6
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.a(lhVar, uoVar, (nh.c) obj);
                }
            });
        }
        if (z3) {
            final qd qdVar = this.E;
            this.i.a(14, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda8
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).a(qdVar);
                }
            });
        }
        if (lhVar2.g != lhVar.g) {
            this.i.a(3, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda18
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.c(lhVar, (nh.c) obj);
                }
            });
        }
        if (lhVar2.e != lhVar.e || lhVar2.l != lhVar.l) {
            this.i.a(-1, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda20
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.d(lhVar, (nh.c) obj);
                }
            });
        }
        if (lhVar2.e != lhVar.e) {
            this.i.a(4, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda21
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.e(lhVar, (nh.c) obj);
                }
            });
        }
        if (lhVar2.l != lhVar.l) {
            this.i.a(5, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda4
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.a(lhVar, i2, (nh.c) obj);
                }
            });
        }
        if (lhVar2.m != lhVar.m) {
            this.i.a(6, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.f(lhVar, (nh.c) obj);
                }
            });
        }
        if (c(lhVar2) != c(lhVar)) {
            this.i.a(7, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda3
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.g(lhVar, (nh.c) obj);
                }
            });
        }
        if (!lhVar2.n.equals(lhVar.n)) {
            this.i.a(12, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda22
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    a8.h(lhVar, (nh.c) obj);
                }
            });
        }
        if (z) {
            this.i.a(-1, new cc.a() { // from class: com.applovin.impl.a8$$ExternalSyntheticLambda12
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).b();
                }
            });
        }
        X();
        this.i.a();
        if (lhVar2.o != lhVar.o) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((z7) it.next()).f(lhVar.o);
            }
        }
        if (lhVar2.p != lhVar.p) {
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((z7) it2.next()).g(lhVar.p);
            }
        }
    }

    public oh a(oh.b bVar) {
        return new oh(this.h, bVar, this.G.f631a, t(), this.t, this.h.g());
    }

    private List a(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ae.c cVar = new ae.c((wd) list.get(i2), this.m);
            arrayList.add(cVar);
            this.l.add(i2 + i, new a(cVar.b, cVar.f267a.i()));
        }
        this.B = this.B.b(i, arrayList.size());
        return arrayList;
    }
}
