package com.applovin.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.cb;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.p1;
import com.applovin.impl.s0;
import com.applovin.impl.wd;
import com.applovin.impl.x1;
import com.applovin.impl.xq;
import com.applovin.impl.y6;
import com.json.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class r0 implements nh.e, p1, xq, xd, x1.a, y6 {

    /* renamed from: a, reason: collision with root package name */
    private final j3 f851a;
    private final go.b b;
    private final go.d c;
    private final a d;
    private final SparseArray f;
    private cc g;
    private nh h;
    private ha i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0 s0Var, z8 z8Var) {
    }

    @Override // com.applovin.impl.nh.e
    public /* synthetic */ void a() {
        nh.e.CC.$default$a(this);
    }

    @Override // com.applovin.impl.xq
    public /* synthetic */ void a(d9 d9Var) {
        xq.CC.$default$a(this, d9Var);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public /* synthetic */ void a(nh nhVar, nh.d dVar) {
        nh.e.CC.$default$a(this, nhVar, dVar);
    }

    @Override // com.applovin.impl.nh.e
    public /* synthetic */ void a(p6 p6Var) {
        nh.e.CC.$default$a(this, p6Var);
    }

    @Override // com.applovin.impl.nh.e
    public /* synthetic */ void a(List list) {
        nh.e.CC.$default$a(this, list);
    }

    @Override // com.applovin.impl.nh.e
    public /* synthetic */ void b(int i, boolean z) {
        nh.e.CC.$default$b(this, i, z);
    }

    @Override // com.applovin.impl.p1
    public /* synthetic */ void b(d9 d9Var) {
        p1.CC.$default$b(this, d9Var);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public /* synthetic */ void b(kh khVar) {
        nh.e.CC.$default$b(this, khVar);
    }

    @Override // com.applovin.impl.nh.c
    public /* synthetic */ void e(int i) {
        nh.c.CC.$default$e(this, i);
    }

    @Override // com.applovin.impl.y6
    public /* synthetic */ void e(int i, wd.a aVar) {
        y6.CC.$default$e(this, i, aVar);
    }

    @Override // com.applovin.impl.nh.c
    public /* synthetic */ void e(boolean z) {
        nh.c.CC.$default$e(this, z);
    }

    public r0(j3 j3Var) {
        this.f851a = (j3) a1.a(j3Var);
        this.g = new cc(yp.d(), j3Var, new cc.b() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda50
            @Override // com.applovin.impl.cc.b
            public final void a(Object obj, z8 z8Var) {
                r0.a((s0) obj, z8Var);
            }
        });
        go.b bVar = new go.b();
        this.b = bVar;
        this.c = new go.d();
        this.d = new a(bVar);
        this.f = new SparseArray();
    }

    public void i() {
        final s0.a aVarC = c();
        this.f.put(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, aVarC);
        a(aVarC, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda33
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).d(aVarC);
            }
        });
        ((ha) a1.b(this.i)).a(new Runnable() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        });
    }

    public final void h() {
        if (this.j) {
            return;
        }
        final s0.a aVarC = c();
        this.j = true;
        a(aVarC, -1, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.b(aVar, l5Var);
        s0Var.a(aVar, 1, l5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.g.b();
    }

    protected final s0.a c() {
        return a(this.d.a());
    }

    private s0.a a(wd.a aVar) {
        a1.a(this.h);
        go goVarA = aVar == null ? null : this.d.a(aVar);
        if (aVar != null && goVarA != null) {
            return a(goVarA, goVarA.a(aVar.f1031a, this.b).c, aVar);
        }
        int iT = this.h.t();
        go goVarN = this.h.n();
        if (iT >= goVarN.b()) {
            goVarN = go.f465a;
        }
        return a(goVarN, iT, (wd.a) null);
    }

    private s0.a e() {
        return a(this.d.c());
    }

    private s0.a d() {
        return a(this.d.b());
    }

    private s0.a f(int i, wd.a aVar) {
        a1.a(this.h);
        if (aVar != null) {
            if (this.d.a(aVar) != null) {
                return a(aVar);
            }
            return a(go.f465a, i, aVar);
        }
        go goVarN = this.h.n();
        if (i >= goVarN.b()) {
            goVarN = go.f465a;
        }
        return a(goVarN, i, (wd.a) null);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final go.b f852a;
        private ab b = ab.h();
        private cb c = cb.h();
        private wd.a d;
        private wd.a e;
        private wd.a f;

        public a(go.b bVar) {
            this.f852a = bVar;
        }

        public wd.a c() {
            return this.e;
        }

        public wd.a d() {
            return this.f;
        }

        public wd.a b() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (wd.a) rb.b(this.b);
        }

        private void a(cb.a aVar, wd.a aVar2, go goVar) {
            if (aVar2 == null) {
                return;
            }
            if (goVar.a(aVar2.f1031a) != -1) {
                aVar.a(aVar2, goVar);
                return;
            }
            go goVar2 = (go) this.c.get(aVar2);
            if (goVar2 != null) {
                aVar.a(aVar2, goVar2);
            }
        }

        public void b(nh nhVar) {
            this.d = a(nhVar, this.b, this.e, this.f852a);
            a(nhVar.n());
        }

        private static wd.a a(nh nhVar, ab abVar, wd.a aVar, go.b bVar) {
            go goVarN = nhVar.n();
            int iV = nhVar.v();
            Object objB = goVarN.c() ? null : goVarN.b(iV);
            int iA = (nhVar.d() || goVarN.c()) ? -1 : goVarN.a(iV, bVar).a(r2.a(nhVar.getCurrentPosition()) - bVar.e());
            for (int i = 0; i < abVar.size(); i++) {
                wd.a aVar2 = (wd.a) abVar.get(i);
                if (a(aVar2, objB, nhVar.d(), nhVar.E(), nhVar.f(), iA)) {
                    return aVar2;
                }
            }
            if (abVar.isEmpty() && aVar != null) {
                if (a(aVar, objB, nhVar.d(), nhVar.E(), nhVar.f(), iA)) {
                    return aVar;
                }
            }
            return null;
        }

        public wd.a a() {
            return this.d;
        }

        public go a(wd.a aVar) {
            return (go) this.c.get(aVar);
        }

        private static boolean a(wd.a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (aVar.f1031a.equals(obj)) {
                return (z && aVar.b == i && aVar.c == i2) || (!z && aVar.b == -1 && aVar.e == i3);
            }
            return false;
        }

        public void a(nh nhVar) {
            this.d = a(nhVar, this.b, this.e, this.f852a);
        }

        public void a(List list, wd.a aVar, nh nhVar) {
            this.b = ab.a((Collection) list);
            if (!list.isEmpty()) {
                this.e = (wd.a) list.get(0);
                this.f = (wd.a) a1.a(aVar);
            }
            if (this.d == null) {
                this.d = a(nhVar, this.b, this.e, this.f852a);
            }
            a(nhVar.n());
        }

        private void a(go goVar) {
            cb.a aVarA = cb.a();
            if (this.b.isEmpty()) {
                a(aVarA, this.e, goVar);
                if (!Objects.equal(this.f, this.e)) {
                    a(aVarA, this.f, goVar);
                }
                if (!Objects.equal(this.d, this.e) && !Objects.equal(this.d, this.f)) {
                    a(aVarA, this.d, goVar);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    a(aVarA, (wd.a) this.b.get(i), goVar);
                }
                if (!this.b.contains(this.d)) {
                    a(aVarA, this.d, goVar);
                }
            }
            this.c = aVarA.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.applovin.impl.s0.a a(com.applovin.impl.go r18, int r19, com.applovin.impl.wd.a r20) {
        /*
            r17 = this;
            r0 = r17
            r4 = r18
            r5 = r19
            boolean r1 = r18.c()
            if (r1 == 0) goto Lf
            r1 = 0
            r6 = r1
            goto L11
        Lf:
            r6 = r20
        L11:
            com.applovin.impl.j3 r1 = r0.f851a
            long r2 = r1.c()
            com.applovin.impl.nh r1 = r0.h
            com.applovin.impl.go r1 = r1.n()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L2d
            com.applovin.impl.nh r1 = r0.h
            int r1 = r1.t()
            if (r5 != r1) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r6 == 0) goto L53
            boolean r7 = r6.a()
            if (r7 == 0) goto L53
            if (r1 == 0) goto L62
            com.applovin.impl.nh r1 = r0.h
            int r1 = r1.E()
            int r7 = r6.b
            if (r1 != r7) goto L62
            com.applovin.impl.nh r1 = r0.h
            int r1 = r1.f()
            int r7 = r6.c
            if (r1 != r7) goto L62
            com.applovin.impl.nh r1 = r0.h
            long r7 = r1.getCurrentPosition()
            goto L6f
        L53:
            if (r1 == 0) goto L5c
            com.applovin.impl.nh r1 = r0.h
            long r7 = r1.g()
            goto L6f
        L5c:
            boolean r1 = r18.c()
            if (r1 == 0) goto L65
        L62:
            r7 = 0
            goto L6f
        L65:
            com.applovin.impl.go$d r1 = r0.c
            com.applovin.impl.go$d r1 = r4.a(r5, r1)
            long r7 = r1.b()
        L6f:
            com.applovin.impl.r0$a r1 = r0.d
            com.applovin.impl.wd$a r11 = r1.a()
            com.applovin.impl.s0$a r16 = new com.applovin.impl.s0$a
            com.applovin.impl.nh r1 = r0.h
            com.applovin.impl.go r9 = r1.n()
            com.applovin.impl.nh r1 = r0.h
            int r10 = r1.t()
            com.applovin.impl.nh r1 = r0.h
            long r12 = r1.getCurrentPosition()
            com.applovin.impl.nh r1 = r0.h
            long r14 = r1.h()
            r1 = r16
            r4 = r18
            r5 = r19
            r1.<init>(r2, r4, r5, r6, r7, r9, r10, r11, r12, r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.r0.a(com.applovin.impl.go, int, com.applovin.impl.wd$a):com.applovin.impl.s0$a");
    }

    private s0.a f() {
        return a(this.d.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, String str, long j, long j2, s0 s0Var) {
        s0Var.a(aVar, str, j);
        s0Var.b(aVar, str, j2, j);
        s0Var.a(aVar, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.c(aVar, l5Var);
        s0Var.b(aVar, 1, l5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, d9 d9Var, o5 o5Var, s0 s0Var) {
        s0Var.b(aVar, d9Var);
        s0Var.b(aVar, d9Var, o5Var);
        s0Var.a(aVar, 1, d9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.a(aVar, l5Var);
        s0Var.a(aVar, 2, l5Var);
    }

    @Override // com.applovin.impl.y6
    public final void d(int i, wd.a aVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda44
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarF);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.d(aVar, l5Var);
        s0Var.b(aVar, 2, l5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(s0.a aVar, String str, long j, long j2, s0 s0Var) {
        s0Var.b(aVar, str, j);
        s0Var.a(aVar, str, j2, j);
        s0Var.a(aVar, 2, str, j);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void d(final boolean z) {
        final s0.a aVarC = c();
        a(aVarC, 7, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda45
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarC, z);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void c(final Exception exc) {
        final s0.a aVarF = f();
        a(aVarF, IronSourceError.ERROR_IS_LOAD_DURING_SHOW, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda36
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void c(final l5 l5Var) {
        final s0.a aVarE = e();
        a(aVarE, 1014, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda21
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarE, l5Var, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void d(final l5 l5Var) {
        final s0.a aVarF = f();
        a(aVarF, 1020, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda19
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.d(aVarF, l5Var, (s0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(s0.a aVar, d9 d9Var, o5 o5Var, s0 s0Var) {
        s0Var.a(aVar, d9Var);
        s0Var.a(aVar, d9Var, o5Var);
        s0Var.a(aVar, 2, d9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, int i, s0 s0Var) {
        s0Var.f(aVar);
        s0Var.b(aVar, i);
    }

    @Override // com.applovin.impl.p1
    public final void b(final String str) {
        final s0.a aVarF = f();
        a(aVarF, 1013, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda39
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarF, str);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void b(final d9 d9Var, final o5 o5Var) {
        final s0.a aVarF = f();
        a(aVarF, 1010, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda13
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarF, d9Var, o5Var, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.y6
    public final void c(int i, wd.a aVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda22
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).c(aVarF);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void b(final int i, final long j, final long j2) {
        final s0.a aVarF = f();
        a(aVarF, 1012, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda7
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, i, j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, boolean z, s0 s0Var) {
        s0Var.c(aVar, z);
        s0Var.e(aVar, z);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void c(final boolean z) {
        final s0.a aVarC = c();
        a(aVarC, 3, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda46
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarC, z, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.y6
    public final void b(int i, wd.a aVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda53
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).g(aVarF);
            }
        });
    }

    @Override // com.applovin.impl.xd
    public final void c(int i, wd.a aVar, final ic icVar, final pd pdVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, 1001, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda14
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).c(aVarF, icVar, pdVar);
            }
        });
    }

    @Override // com.applovin.impl.xd
    public final void b(int i, wd.a aVar, final ic icVar, final pd pdVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, 1000, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda16
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, icVar, pdVar);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void c(final int i) {
        final s0.a aVarC = c();
        a(aVarC, 8, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda56
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).f(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void b(final int i) {
        final s0.a aVarC = c();
        a(aVarC, 4, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).c(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.c
    public final void b(final boolean z, final int i) {
        final s0.a aVarC = c();
        a(aVarC, -1, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda48
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, z, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.c
    public final void b() {
        final s0.a aVarC = c();
        a(aVarC, -1, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda52
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).e(aVarC);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void b(final boolean z) {
        final s0.a aVarC = c();
        a(aVarC, 9, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda42
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, z);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void b(final Exception exc) {
        final s0.a aVarF = f();
        a(aVarF, IronSourceError.ERROR_RV_SHOW_EXCEPTION, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda32
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void b(final String str, final long j, final long j2) {
        final s0.a aVarF = f();
        a(aVarF, 1021, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda40
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.b(aVarF, str, j2, j, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void b(final l5 l5Var) {
        final s0.a aVarE = e();
        a(aVarE, 1025, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda23
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.c(aVarE, l5Var, (s0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, int i, nh.f fVar, nh.f fVar2, s0 s0Var) {
        s0Var.a(aVar, i);
        s0Var.a(aVar, fVar, fVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, yq yqVar, s0 s0Var) {
        s0Var.a(aVar, yqVar);
        s0Var.a(aVar, yqVar.f1215a, yqVar.b, yqVar.c, yqVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(nh nhVar, s0 s0Var, z8 z8Var) {
        s0Var.a(nhVar, new s0.b(z8Var, this.f));
    }

    @Override // com.applovin.impl.p1
    public final void a(final String str, final long j, final long j2) {
        final s0.a aVarF = f();
        a(aVarF, 1009, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda41
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarF, str, j2, j, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void a(final l5 l5Var) {
        final s0.a aVarF = f();
        a(aVarF, 1008, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda20
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.b(aVarF, l5Var, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void a(final long j) {
        final s0.a aVarF = f();
        a(aVarF, 1011, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda9
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, j);
            }
        });
    }

    @Override // com.applovin.impl.p1
    public final void a(final Exception exc) {
        final s0.a aVarF = f();
        a(aVarF, 1018, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda34
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).d(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void a(final nh.b bVar) {
        final s0.a aVarC = c();
        a(aVarC, 13, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda25
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, bVar);
            }
        });
    }

    @Override // com.applovin.impl.x1.a
    public final void a(final int i, final long j, final long j2) {
        final s0.a aVarD = d();
        a(aVarD, 1006, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda6
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarD, i, j, j2);
            }
        });
    }

    @Override // com.applovin.impl.xd
    public final void a(int i, wd.a aVar, final pd pdVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, 1004, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda27
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, pdVar);
            }
        });
    }

    @Override // com.applovin.impl.y6
    public final void a(int i, wd.a aVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda11
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).h(aVarF);
            }
        });
    }

    @Override // com.applovin.impl.y6
    public final void a(int i, wd.a aVar, final int i2) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, 1030, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda55
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarF, i2, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.y6
    public final void a(int i, wd.a aVar, final Exception exc) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda35
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).c(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void a(final int i, final long j) {
        final s0.a aVarE = e();
        a(aVarE, 1023, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda5
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarE, i, j);
            }
        });
    }

    @Override // com.applovin.impl.xd
    public final void a(int i, wd.a aVar, final ic icVar, final pd pdVar) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, 1002, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda15
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarF, icVar, pdVar);
            }
        });
    }

    @Override // com.applovin.impl.xd
    public final void a(int i, wd.a aVar, final ic icVar, final pd pdVar, final IOException iOException, final boolean z) {
        final s0.a aVarF = f(i, aVar);
        a(aVarF, 1003, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda17
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, icVar, pdVar, iOException, z);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final od odVar, final int i) {
        final s0.a aVarC = c();
        a(aVarC, 1, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda26
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, odVar, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void a(final qd qdVar) {
        final s0.a aVarC = c();
        a(aVarC, 14, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda28
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, qdVar);
            }
        });
    }

    @Override // com.applovin.impl.nh.e
    public final void a(final we weVar) {
        final s0.a aVarC = c();
        a(aVarC, 1007, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda30
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, weVar);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final boolean z, final int i) {
        final s0.a aVarC = c();
        a(aVarC, 5, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda47
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).b(aVarC, z, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final mh mhVar) {
        final s0.a aVarC = c();
        a(aVarC, 12, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda24
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, mhVar);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final int i) {
        final s0.a aVarC = c();
        a(aVarC, 6, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).e(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final kh khVar) {
        td tdVar;
        final s0.a aVarA = (!(khVar instanceof y7) || (tdVar = ((y7) khVar).j) == null) ? null : a(new wd.a(tdVar));
        if (aVarA == null) {
            aVarA = c();
        }
        a(aVarA, 10, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda18
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarA, khVar);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final nh.f fVar, final nh.f fVar2, final int i) {
        if (i == 1) {
            this.j = false;
        }
        this.d.a((nh) a1.a(this.h));
        final s0.a aVarC = c();
        a(aVarC, 11, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda8
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarC, i, fVar, fVar2, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void a(final Object obj, final long j) {
        final s0.a aVarF = f();
        a(aVarF, 1027, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda37
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj2) {
                ((s0) obj2).a(aVarF, obj, j);
            }
        });
    }

    @Override // com.applovin.impl.nh.e
    public final void a(final boolean z) {
        final s0.a aVarF = f();
        a(aVarF, 1017, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda43
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).d(aVarF, z);
            }
        });
    }

    @Override // com.applovin.impl.nh.e
    public void a(final int i, final int i2) {
        final s0.a aVarF = f();
        a(aVarF, 1029, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda4
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, i, i2);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(go goVar, final int i) {
        this.d.b((nh) a1.a(this.h));
        final s0.a aVarC = c();
        a(aVarC, 0, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).d(aVarC, i);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final qo qoVar, final uo uoVar) {
        final s0.a aVarC = c();
        a(aVarC, 2, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda29
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarC, qoVar, uoVar);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void a(final String str) {
        final s0.a aVarF = f();
        a(aVarF, 1024, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda38
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, str);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void a(final long j, final int i) {
        final s0.a aVarE = e();
        a(aVarE, 1026, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda10
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarE, j, i);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void a(final d9 d9Var, final o5 o5Var) {
        final s0.a aVarF = f();
        a(aVarF, 1022, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda12
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.b(aVarF, d9Var, o5Var, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.nh.e
    public final void a(final yq yqVar) {
        final s0.a aVarF = f();
        a(aVarF, 1028, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda31
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                r0.a(aVarF, yqVar, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.nh.e
    public final void a(final float f) {
        final s0.a aVarF = f();
        a(aVarF, 1019, new cc.a() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda54
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((s0) obj).a(aVarF, f);
            }
        });
    }

    protected final void a(s0.a aVar, int i, cc.a aVar2) {
        this.f.put(i, aVar);
        this.g.b(i, aVar2);
    }

    public void a(final nh nhVar, Looper looper) {
        a1.b(this.h == null || this.d.b.isEmpty());
        this.h = (nh) a1.a(nhVar);
        this.i = this.f851a.a(looper, null);
        this.g = this.g.a(looper, new cc.b() { // from class: com.applovin.impl.r0$$ExternalSyntheticLambda49
            @Override // com.applovin.impl.cc.b
            public final void a(Object obj, z8 z8Var) {
                this.f$0.a(nhVar, (s0) obj, z8Var);
            }
        });
    }

    public final void a(List list, wd.a aVar) {
        this.d.a(list, aVar, (nh) a1.a(this.h));
    }
}
