package com.applovin.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.ab;
import com.applovin.impl.ae;
import com.applovin.impl.f6;
import com.applovin.impl.go;
import com.applovin.impl.li;
import com.applovin.impl.od;
import com.applovin.impl.oh;
import com.applovin.impl.rd;
import com.applovin.impl.wd;
import com.applovin.impl.we;
import com.applovin.impl.wo;
import com.applovin.impl.x6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class c8 implements Handler.Callback, rd.a, wo.a, ae.d, f6.a, oh.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private h L;
    private long M;
    private int N;
    private boolean O;
    private y7 P;
    private long Q;

    /* renamed from: a, reason: collision with root package name */
    private final li[] f315a;
    private final Set b;
    private final mi[] c;
    private final wo d;
    private final xo f;
    private final gc g;
    private final x1 h;
    private final ha i;
    private final HandlerThread j;
    private final Looper k;
    private final go.d l;
    private final go.b m;
    private final long n;
    private final boolean o;
    private final f6 p;
    private final ArrayList q;
    private final j3 r;
    private final f s;
    private final vd t;
    private final ae u;
    private final fc v;
    private final long w;
    private fj x;
    private lh y;
    private e z;

    private static class c {
    }

    public interface f {
        void a(e eVar);
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f319a;
        public lh b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public e(lh lhVar) {
            this.b = lhVar;
        }

        public void c(int i) {
            if (this.d && this.e != 5) {
                a1.a(i == 5);
                return;
            }
            this.f319a = true;
            this.d = true;
            this.e = i;
        }

        public void b(int i) {
            this.f319a = true;
            this.f = true;
            this.g = i;
        }

        public void a(int i) {
            this.f319a |= i > 0;
            this.c += i;
        }

        public void a(lh lhVar) {
            this.f319a |= this.b != lhVar;
            this.b = lhVar;
        }
    }

    public c8(li[] liVarArr, wo woVar, xo xoVar, gc gcVar, x1 x1Var, int i, boolean z, r0 r0Var, fj fjVar, fc fcVar, long j, boolean z2, Looper looper, j3 j3Var, f fVar) {
        this.s = fVar;
        this.f315a = liVarArr;
        this.d = woVar;
        this.f = xoVar;
        this.g = gcVar;
        this.h = x1Var;
        this.F = i;
        this.G = z;
        this.x = fjVar;
        this.v = fcVar;
        this.w = j;
        this.Q = j;
        this.B = z2;
        this.r = j3Var;
        this.n = gcVar.d();
        this.o = gcVar.a();
        lh lhVarA = lh.a(xoVar);
        this.y = lhVarA;
        this.z = new e(lhVarA);
        this.c = new mi[liVarArr.length];
        for (int i2 = 0; i2 < liVarArr.length; i2++) {
            liVarArr[i2].b(i2);
            this.c[i2] = liVarArr[i2].n();
        }
        this.p = new f6(this, j3Var);
        this.q = new ArrayList();
        this.b = nj.b();
        this.l = new go.d();
        this.m = new go.b();
        woVar.a(this, x1Var);
        this.O = true;
        Handler handler = new Handler(looper);
        this.t = new vd(r0Var, handler);
        this.u = new ae(this, r0Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k = looper2;
        this.i = j3Var.a(looper2, this);
    }

    private void a(tj tjVar) throws Throwable {
        this.z.a(1);
        a(this.u.a(tjVar), false);
    }

    public void v() {
        this.i.d(0).a();
    }

    public void G() {
        this.i.d(6).a();
    }

    public synchronized boolean x() {
        if (!this.A && this.j.isAlive()) {
            this.i.c(7);
            a(new Supplier() { // from class: com.applovin.impl.c8$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return this.f$0.l();
                }
            }, this.w);
            return this.A;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l() {
        return Boolean.valueOf(this.A);
    }

    public Looper g() {
        return this.k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        sd sdVarF;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    a((h) message.obj);
                    break;
                case 4:
                    b((mh) message.obj);
                    break;
                case 5:
                    a((fj) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    c((rd) message.obj);
                    break;
                case 9:
                    b((rd) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    b(message.arg1);
                    break;
                case 12:
                    g(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d((oh) message.obj);
                    break;
                case 15:
                    f((oh) message.obj);
                    break;
                case 16:
                    a((mh) message.obj, false);
                    break;
                case 17:
                    a((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    b8.a(message.obj);
                    a((c) null);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (tj) message.obj);
                    break;
                case 21:
                    a((tj) message.obj);
                    break;
                case 22:
                    s();
                    break;
                case 23:
                    e(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    b();
                    break;
                default:
                    return false;
            }
        } catch (ah e2) {
            int i = e2.b;
            if (i == 1) {
                i = e2.f272a ? 3001 : 3003;
            } else if (i == 4) {
                i = e2.f272a ? 3002 : 3004;
            }
            a(e2, i);
        } catch (h5 e3) {
            a(e3, e3.f490a);
        } catch (x6.a e4) {
            a(e4, e4.f1159a);
        } catch (y7 e5) {
            e = e5;
            if (e.d == 1 && (sdVarF = this.t.f()) != null) {
                e = e.a(sdVarF.f.f1062a);
            }
            if (e.k && this.P == null) {
                kc.c("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                ha haVar = this.i;
                haVar.a(haVar.a(25, e));
            } else {
                y7 y7Var = this.P;
                if (y7Var != null) {
                    y7Var.addSuppressed(e);
                    e = this.P;
                }
                kc.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.y = this.y.a(e);
            }
        } catch (IOException e6) {
            a(e6, 2000);
        } catch (RuntimeException e7) {
            y7 y7VarA = y7.a(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            kc.a("ExoPlayerImplInternal", "Playback error", y7VarA);
            a(true, false);
            this.y = this.y.a(y7VarA);
        }
        n();
        return true;
    }

    private void n() {
        this.z.a(this.y);
        if (this.z.f319a) {
            this.s.a(this.z);
            this.z = new e(this.y);
        }
    }

    private void w() {
        this.z.a(1);
        a(false, false, false, true);
        this.g.f();
        c(this.y.f631a.c() ? 4 : 2);
        this.u.a(this.h.a());
        this.i.c(2);
    }

    private void s() throws Throwable {
        a(this.u.a(), true);
    }

    private void a(b bVar, int i) throws Throwable {
        this.z.a(1);
        ae aeVar = this.u;
        if (i == -1) {
            i = aeVar.c();
        }
        a(aeVar.a(i, bVar.f317a, bVar.b), false);
    }

    private void F() {
        this.D = false;
        this.p.b();
        for (li liVar : this.f315a) {
            if (c(liVar)) {
                liVar.start();
            }
        }
    }

    private void H() {
        this.p.c();
        for (li liVar : this.f315a) {
            if (c(liVar)) {
                b(liVar);
            }
        }
    }

    private void b() throws y7 {
        c(true);
    }

    private void K() {
        sd sdVarE = this.t.e();
        if (sdVarE == null) {
            return;
        }
        long jH = sdVarE.d ? sdVarE.f890a.h() : -9223372036854775807L;
        if (jH != -9223372036854775807L) {
            c(jH);
            if (jH != this.y.s) {
                lh lhVar = this.y;
                this.y = a(lhVar.b, jH, lhVar.c, jH, true, 5);
            }
        } else {
            long jB = this.p.b(sdVarE != this.t.f());
            this.M = jB;
            long jD = sdVarE.d(jB);
            b(this.y.s, jD);
            this.y.s = jD;
        }
        this.y.q = this.t.d().c();
        this.y.r = h();
        lh lhVar2 = this.y;
        if (lhVar2.l && lhVar2.e == 3 && a(lhVar2.f631a, lhVar2.b) && this.y.n.f697a == 1.0f) {
            float fA = this.v.a(e(), h());
            if (this.p.a().f697a != fA) {
                this.p.a(this.y.n.a(fA));
                a(this.y.n, this.p.a().f697a, false, false);
            }
        }
    }

    private void u() {
        for (sd sdVarE = this.t.e(); sdVarE != null; sdVarE = sdVarE.d()) {
            for (f8 f8Var : sdVarE.i().c) {
                if (f8Var != null) {
                    f8Var.k();
                }
            }
        }
    }

    private void c() throws y7 {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        long jA = this.r.a();
        J();
        int i2 = this.y.e;
        if (i2 != 1 && i2 != 4) {
            sd sdVarE = this.t.e();
            if (sdVarE == null) {
                c(jA, 10L);
                return;
            }
            lo.a("doSomeWork");
            K();
            if (sdVarE.d) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                sdVarE.f890a.a(this.y.s - this.n, this.o);
                z = true;
                z2 = true;
                int i3 = 0;
                while (true) {
                    li[] liVarArr = this.f315a;
                    if (i3 >= liVarArr.length) {
                        break;
                    }
                    li liVar = liVarArr[i3];
                    if (c(liVar)) {
                        liVar.a(this.M, jElapsedRealtime);
                        z = z && liVar.c();
                        boolean z4 = sdVarE.c[i3] != liVar.o();
                        boolean z5 = z4 || (!z4 && liVar.j()) || liVar.d() || liVar.c();
                        z2 = z2 && z5;
                        if (!z5) {
                            liVar.h();
                        }
                    }
                    i3++;
                }
            } else {
                sdVarE.f890a.f();
                z = true;
                z2 = true;
            }
            long j = sdVarE.f.e;
            boolean z6 = z && sdVarE.d && (j == -9223372036854775807L || j <= this.y.s);
            if (z6 && this.C) {
                this.C = false;
                a(false, this.y.m, false, 5);
            }
            if (z6 && sdVarE.f.i) {
                c(4);
                H();
            } else if (this.y.e == 2 && h(z2)) {
                c(3);
                this.P = null;
                if (E()) {
                    F();
                }
            } else if (this.y.e == 3 && (this.K != 0 ? !z2 : !k())) {
                this.D = E();
                c(2);
                if (this.D) {
                    u();
                    this.v.a();
                }
                H();
            }
            if (this.y.e == 2) {
                int i4 = 0;
                while (true) {
                    li[] liVarArr2 = this.f315a;
                    if (i4 >= liVarArr2.length) {
                        break;
                    }
                    if (c(liVarArr2[i4]) && this.f315a[i4].o() == sdVarE.c[i4]) {
                        this.f315a[i4].h();
                    }
                    i4++;
                }
                lh lhVar = this.y;
                if (!lhVar.g && lhVar.r < 500000 && j()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z7 = this.J;
            lh lhVar2 = this.y;
            if (z7 != lhVar2.o) {
                this.y = lhVar2.b(z7);
            }
            if ((E() && this.y.e == 3) || (i = this.y.e) == 2) {
                z3 = !a(jA, 10L);
            } else {
                if (this.K != 0 && i != 4) {
                    c(jA, 1000L);
                } else {
                    this.i.b(2);
                }
                z3 = false;
            }
            lh lhVar3 = this.y;
            if (lhVar3.p != z3) {
                this.y = lhVar3.c(z3);
            }
            this.I = false;
            lo.a();
            return;
        }
        this.i.b(2);
    }

    private long e() {
        lh lhVar = this.y;
        return a(lhVar.f631a, lhVar.b.f1031a, lhVar.s);
    }

    private void g(boolean z) throws y7 {
        this.G = z;
        if (!this.t.a(this.y.f631a, z)) {
            c(true);
        }
        a(false);
    }

    private void y() {
        a(true, false, true, false);
        this.g.e();
        c(1);
        this.j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private boolean a(go goVar, wd.a aVar) {
        if (aVar.a() || goVar.c()) {
            return false;
        }
        goVar.a(goVar.a(aVar.f1031a, this.m).c, this.l);
        if (!this.l.e()) {
            return false;
        }
        go.d dVar = this.l;
        return dVar.j && dVar.g != -9223372036854775807L;
    }

    private void A() throws y7 {
        float f2 = this.p.a().f697a;
        sd sdVarF = this.t.f();
        boolean z = true;
        for (sd sdVarE = this.t.e(); sdVarE != null && sdVarE.d; sdVarE = sdVarE.d()) {
            xo xoVarB = sdVarE.b(f2, this.y.f631a);
            if (!xoVarB.a(sdVarE.i())) {
                if (z) {
                    sd sdVarE2 = this.t.e();
                    boolean zA = this.t.a(sdVarE2);
                    boolean[] zArr = new boolean[this.f315a.length];
                    long jA = sdVarE2.a(xoVarB, this.y.s, zA, zArr);
                    lh lhVar = this.y;
                    boolean z2 = (lhVar.e == 4 || jA == lhVar.s) ? false : true;
                    lh lhVar2 = this.y;
                    this.y = a(lhVar2.b, jA, lhVar2.c, lhVar2.d, z2, 5);
                    if (z2) {
                        c(jA);
                    }
                    boolean[] zArr2 = new boolean[this.f315a.length];
                    int i = 0;
                    while (true) {
                        li[] liVarArr = this.f315a;
                        if (i >= liVarArr.length) {
                            break;
                        }
                        li liVar = liVarArr[i];
                        boolean zC = c(liVar);
                        zArr2[i] = zC;
                        yi yiVar = sdVarE2.c[i];
                        if (zC) {
                            if (yiVar != liVar.o()) {
                                a(liVar);
                            } else if (zArr[i]) {
                                liVar.a(this.M);
                            }
                        }
                        i++;
                    }
                    a(zArr2);
                } else {
                    this.t.a(sdVarE);
                    if (sdVarE.d) {
                        sdVarE.a(xoVarB, Math.max(sdVarE.f.b, sdVarE.d(this.M)), false);
                    }
                }
                a(true);
                if (this.y.e != 4) {
                    m();
                    K();
                    this.i.c(2);
                    return;
                }
                return;
            }
            if (sdVarE == sdVarF) {
                z = false;
            }
        }
    }

    private void t() {
        for (sd sdVarE = this.t.e(); sdVarE != null; sdVarE = sdVarE.d()) {
            for (f8 f8Var : sdVarE.i().c) {
                if (f8Var != null) {
                    f8Var.j();
                }
            }
        }
    }

    private boolean k() {
        sd sdVarE = this.t.e();
        long j = sdVarE.f.e;
        return sdVarE.d && (j == -9223372036854775807L || this.y.s < j || !E());
    }

    private long f() {
        sd sdVarF = this.t.f();
        if (sdVarF == null) {
            return 0L;
        }
        long jF = sdVarF.f();
        if (!sdVarF.d) {
            return jF;
        }
        int i = 0;
        while (true) {
            li[] liVarArr = this.f315a;
            if (i >= liVarArr.length) {
                return jF;
            }
            if (c(liVarArr[i]) && this.f315a[i].o() == sdVarF.c[i]) {
                long jI = this.f315a[i].i();
                if (jI == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jF = Math.max(jI, jF);
            }
            i++;
        }
    }

    private void J() throws y7 {
        if (this.y.f631a.c() || !this.u.d()) {
            return;
        }
        o();
        q();
        r();
        p();
    }

    private void o() {
        ud udVarA;
        this.t.a(this.M);
        if (this.t.h() && (udVarA = this.t.a(this.M, this.y)) != null) {
            sd sdVarA = this.t.a(this.c, this.d, this.g.b(), this.u, udVarA, this.f);
            sdVarA.f890a.a(this, udVarA.b);
            if (this.t.e() == sdVarA) {
                c(sdVarA.g());
            }
            a(false);
        }
        if (this.E) {
            this.E = j();
            I();
        } else {
            m();
        }
    }

    private void q() {
        sd sdVarF = this.t.f();
        if (sdVarF == null) {
            return;
        }
        int i = 0;
        if (sdVarF.d() != null && !this.C) {
            if (i()) {
                if (sdVarF.d().d || this.M >= sdVarF.d().g()) {
                    xo xoVarI = sdVarF.i();
                    sd sdVarB = this.t.b();
                    xo xoVarI2 = sdVarB.i();
                    if (sdVarB.d && sdVarB.f890a.h() != -9223372036854775807L) {
                        d(sdVarB.g());
                        return;
                    }
                    for (int i2 = 0; i2 < this.f315a.length; i2++) {
                        boolean zA = xoVarI.a(i2);
                        boolean zA2 = xoVarI2.a(i2);
                        if (zA && !this.f315a[i2].k()) {
                            boolean z = this.c[i2].e() == -2;
                            ni niVar = xoVarI.b[i2];
                            ni niVar2 = xoVarI2.b[i2];
                            if (!zA2 || !niVar2.equals(niVar) || z) {
                                a(this.f315a[i2], sdVarB.g());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!sdVarF.f.i && !this.C) {
            return;
        }
        while (true) {
            li[] liVarArr = this.f315a;
            if (i >= liVarArr.length) {
                return;
            }
            li liVar = liVarArr[i];
            yi yiVar = sdVarF.c[i];
            if (yiVar != null && liVar.o() == yiVar && liVar.j()) {
                long j = sdVarF.f.e;
                a(liVar, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : sdVarF.f() + sdVarF.f.e);
            }
            i++;
        }
    }

    private void r() throws y7 {
        sd sdVarF = this.t.f();
        if (sdVarF == null || this.t.e() == sdVarF || sdVarF.g || !z()) {
            return;
        }
        d();
    }

    private boolean z() {
        sd sdVarF = this.t.f();
        xo xoVarI = sdVarF.i();
        int i = 0;
        boolean z = false;
        while (true) {
            li[] liVarArr = this.f315a;
            if (i >= liVarArr.length) {
                return !z;
            }
            li liVar = liVarArr[i];
            if (c(liVar)) {
                boolean z2 = liVar.o() != sdVarF.c[i];
                if (!xoVarI.a(i) || z2) {
                    if (!liVar.k()) {
                        liVar.a(a(xoVarI.c[i]), sdVarF.c[i], sdVarF.g(), sdVarF.f());
                    } else if (liVar.c()) {
                        a(liVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void p() {
        boolean z = false;
        while (C()) {
            if (z) {
                n();
            }
            sd sdVarE = this.t.e();
            sd sdVarA = this.t.a();
            ud udVar = sdVarA.f;
            wd.a aVar = udVar.f1062a;
            long j = udVar.b;
            lh lhVarA = a(aVar, j, udVar.c, j, true, 0);
            this.y = lhVarA;
            go goVar = lhVarA.f631a;
            a(goVar, sdVarA.f.f1062a, goVar, sdVarE.f.f1062a, -9223372036854775807L);
            B();
            K();
            z = true;
        }
    }

    private void B() {
        sd sdVarE = this.t.e();
        this.C = sdVarE != null && sdVarE.f.h && this.B;
    }

    private boolean C() {
        sd sdVarE;
        sd sdVarD;
        return E() && !this.C && (sdVarE = this.t.e()) != null && (sdVarD = sdVarE.d()) != null && this.M >= sdVarD.g() && sdVarD.g;
    }

    private boolean i() {
        sd sdVarF = this.t.f();
        if (!sdVarF.d) {
            return false;
        }
        int i = 0;
        while (true) {
            li[] liVarArr = this.f315a;
            if (i >= liVarArr.length) {
                return true;
            }
            li liVar = liVarArr[i];
            yi yiVar = sdVarF.c[i];
            if (liVar.o() != yiVar || (yiVar != null && !liVar.j() && !a(liVar, sdVarF))) {
                break;
            }
            i++;
        }
        return false;
    }

    private void m() {
        boolean zD = D();
        this.E = zD;
        if (zD) {
            this.t.d().a(this.M);
        }
        I();
    }

    private boolean D() {
        long jD;
        if (!j()) {
            return false;
        }
        sd sdVarD = this.t.d();
        long jB = b(sdVarD.e());
        if (sdVarD == this.t.e()) {
            jD = sdVarD.d(this.M);
        } else {
            jD = sdVarD.d(this.M) - sdVarD.f.b;
        }
        return this.g.a(jD, jB, this.p.a().f697a);
    }

    private boolean j() {
        sd sdVarD = this.t.d();
        return (sdVarD == null || sdVarD.e() == Long.MIN_VALUE) ? false : true;
    }

    private void I() {
        sd sdVarD = this.t.d();
        boolean z = this.E || (sdVarD != null && sdVarD.f890a.a());
        lh lhVar = this.y;
        if (z != lhVar.g) {
            this.y = lhVar.a(z);
        }
    }

    private void d() throws y7 {
        a(new boolean[this.f315a.length]);
    }

    private void b(oh ohVar) {
        if (ohVar.i()) {
            return;
        }
        try {
            ohVar.e().a(ohVar.g(), ohVar.c());
        } finally {
            ohVar.a(true);
        }
    }

    class a implements li.a {
        a() {
        }

        @Override // com.applovin.impl.li.a
        public void a(long j) {
            if (j >= 2000) {
                c8.this.I = true;
            }
        }

        @Override // com.applovin.impl.li.a
        public void a() {
            c8.this.i.c(2);
        }
    }

    private long h() {
        return b(this.y.q);
    }

    private void a(li liVar) {
        if (c(liVar)) {
            this.p.a(liVar);
            b(liVar);
            liVar.f();
            this.K--;
        }
    }

    private boolean E() {
        lh lhVar = this.y;
        return lhVar.l && lhVar.m == 0;
    }

    private void e(oh ohVar) {
        if (ohVar.b() == this.k) {
            b(ohVar);
            int i = this.y.e;
            if (i == 3 || i == 2) {
                this.i.c(2);
                return;
            }
            return;
        }
        this.i.a(15, ohVar).a();
    }

    private void a(boolean z, boolean z2) {
        a(z || !this.H, false, true, false);
        this.z.a(z2 ? 1 : 0);
        this.g.c();
        c(1);
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        this.i.a(9, rdVar).a();
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final go f321a;
        public final int b;
        public final long c;

        public h(go goVar, int i, long j) {
            this.f321a = goVar;
            this.b = i;
            this.c = j;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final wd.a f320a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(wd.a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f320a = aVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    private static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final oh f318a;
        public int b;
        public long c;
        public Object d;

        public d(oh ohVar) {
            this.f318a = ohVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.d;
            if ((obj == null) != (dVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - dVar.b;
            return i != 0 ? i : yp.a(this.c, dVar.c);
        }

        public void a(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f317a;
        private final tj b;
        private final int c;
        private final long d;

        private b(List list, tj tjVar, int i, long j) {
            this.f317a = list;
            this.b = tjVar;
            this.c = i;
            this.d = j;
        }

        /* synthetic */ b(List list, tj tjVar, int i, long j, a aVar) {
            this(list, tjVar, i, j);
        }
    }

    private void c(rd rdVar) throws y7 {
        if (this.t.a(rdVar)) {
            sd sdVarD = this.t.d();
            sdVarD.a(this.p.a().f697a, this.y.f631a);
            a(sdVarD.h(), sdVarD.i());
            if (sdVarD == this.t.e()) {
                c(sdVarD.f.b);
                d();
                lh lhVar = this.y;
                wd.a aVar = lhVar.b;
                long j = sdVarD.f.b;
                this.y = a(aVar, j, lhVar.c, j, false, 5);
            }
            m();
        }
    }

    private void e(boolean z) throws y7 {
        this.B = z;
        B();
        if (!this.C || this.t.f() == this.t.e()) {
            return;
        }
        c(true);
        a(false);
    }

    private void f(final oh ohVar) {
        Looper looperB = ohVar.b();
        if (!looperB.getThread().isAlive()) {
            kc.d("TAG", "Trying to send message on a dead thread.");
            ohVar.a(false);
        } else {
            this.r.a(looperB, null).a(new Runnable() { // from class: com.applovin.impl.c8$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(ohVar);
                }
            });
        }
    }

    public void f(boolean z) {
        this.i.a(12, z ? 1 : 0, 0).a();
    }

    private void b(li liVar) {
        if (liVar.b() == 2) {
            liVar.stop();
        }
    }

    private boolean h(boolean z) {
        if (this.K == 0) {
            return k();
        }
        if (!z) {
            return false;
        }
        lh lhVar = this.y;
        if (!lhVar.g) {
            return true;
        }
        long jB = a(lhVar.f631a, this.t.e().f.f1062a) ? this.v.b() : -9223372036854775807L;
        sd sdVarD = this.t.d();
        return (sdVarD.j() && sdVarD.f.i) || (sdVarD.f.f1062a.a() && !sdVarD.d) || this.g.a(h(), this.p.a().f697a, this.D, jB);
    }

    private void d(oh ohVar) {
        if (ohVar.d() == -9223372036854775807L) {
            e(ohVar);
            return;
        }
        if (this.y.f631a.c()) {
            this.q.add(new d(ohVar));
            return;
        }
        d dVar = new d(ohVar);
        go goVar = this.y.f631a;
        if (a(dVar, goVar, goVar, this.F, this.G, this.l, this.m)) {
            this.q.add(dVar);
            Collections.sort(this.q);
        } else {
            ohVar.a(false);
        }
    }

    private void a(go goVar, wd.a aVar, go goVar2, wd.a aVar2, long j) {
        if (!goVar.c() && a(goVar, aVar)) {
            goVar.a(goVar.a(aVar.f1031a, this.m).c, this.l);
            this.v.a((od.f) yp.a(this.l.l));
            if (j != -9223372036854775807L) {
                this.v.a(a(goVar, aVar.f1031a, j));
                return;
            }
            if (yp.a(goVar2.c() ? null : goVar2.a(goVar2.a(aVar2.f1031a, this.m).c, this.l).f467a, this.l.f467a)) {
                return;
            }
            this.v.a(-9223372036854775807L);
            return;
        }
        float f2 = this.p.a().f697a;
        mh mhVar = this.y.n;
        if (f2 != mhVar.f697a) {
            this.p.a(mhVar);
        }
    }

    private void a(int i, boolean z) throws y7 {
        li liVar = this.f315a[i];
        if (c(liVar)) {
            return;
        }
        sd sdVarF = this.t.f();
        boolean z2 = sdVarF == this.t.e();
        xo xoVarI = sdVarF.i();
        ni niVar = xoVarI.b[i];
        d9[] d9VarArrA = a(xoVarI.c[i]);
        boolean z3 = E() && this.y.e == 3;
        boolean z4 = !z && z3;
        this.K++;
        this.b.add(liVar);
        liVar.a(niVar, d9VarArrA, sdVarF.c[i], this.M, z4, z2, sdVarF.g(), sdVarF.f());
        liVar.a(11, new a());
        this.p.b(liVar);
        if (z3) {
            liVar.start();
        }
    }

    private static boolean c(li liVar) {
        return liVar.b() != 0;
    }

    private void d(long j) {
        for (li liVar : this.f315a) {
            if (liVar.o() != null) {
                a(liVar, j);
            }
        }
    }

    private long b(long j) {
        sd sdVarD = this.t.d();
        if (sdVarD == null) {
            return 0L;
        }
        return Math.max(0L, j - sdVarD.d(this.M));
    }

    private void a(qo qoVar, xo xoVar) {
        this.g.a(this.f315a, qoVar, xoVar.c);
    }

    private void d(boolean z) {
        if (z == this.J) {
            return;
        }
        this.J = z;
        lh lhVar = this.y;
        int i = lhVar.e;
        if (!z && i != 4 && i != 1) {
            this.i.c(2);
        } else {
            this.y = lhVar.b(z);
        }
    }

    private void a(boolean[] zArr) throws y7 {
        sd sdVarF = this.t.f();
        xo xoVarI = sdVarF.i();
        for (int i = 0; i < this.f315a.length; i++) {
            if (!xoVarI.a(i) && this.b.remove(this.f315a[i])) {
                this.f315a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f315a.length; i2++) {
            if (xoVarI.a(i2)) {
                a(i2, zArr[i2]);
            }
        }
        sdVarF.g = true;
    }

    public void a(long j) {
        this.Q = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(oh ohVar) {
        try {
            b(ohVar);
        } catch (y7 e2) {
            kc.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void b(rd rdVar) {
        if (this.t.a(rdVar)) {
            this.t.a(this.M);
            m();
        }
    }

    private void a(float f2) {
        for (sd sdVarE = this.t.e(); sdVarE != null; sdVarE = sdVarE.d()) {
            for (f8 f8Var : sdVarE.i().c) {
                if (f8Var != null) {
                    f8Var.a(f2);
                }
            }
        }
    }

    private void c(long j) {
        sd sdVarE = this.t.e();
        if (sdVarE != null) {
            j = sdVarE.e(j);
        }
        this.M = j;
        this.p.a(j);
        for (li liVar : this.f315a) {
            if (c(liVar)) {
                liVar.a(this.M);
            }
        }
        t();
    }

    private synchronized void a(Supplier supplier, long j) {
        long jC = this.r.c() + j;
        boolean z = false;
        while (!((Boolean) supplier.get()).booleanValue() && j > 0) {
            try {
                this.r.b();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jC - this.r.c();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private ab a(f8[] f8VarArr) {
        ab.a aVar = new ab.a();
        boolean z = false;
        for (f8 f8Var : f8VarArr) {
            if (f8Var != null) {
                we weVar = f8Var.a(0).k;
                if (weVar == null) {
                    aVar.b(new we(new we.b[0]));
                } else {
                    aVar.b(weVar);
                    z = true;
                }
            }
        }
        return z ? aVar.a() : ab.h();
    }

    private void c(long j, long j2) {
        this.i.b(2);
        this.i.a(2, j + j2);
    }

    private void b(long j, long j2) {
        c8 c8Var;
        d dVar;
        if (this.q.isEmpty() || this.y.b.a()) {
            return;
        }
        if (this.O) {
            j--;
            this.O = false;
        }
        lh lhVar = this.y;
        int iA = lhVar.f631a.a(lhVar.b.f1031a);
        int iMin = Math.min(this.N, this.q.size());
        d dVar2 = iMin > 0 ? (d) this.q.get(iMin - 1) : null;
        while (dVar2 != null) {
            int i = dVar2.b;
            if (i <= iA && (i != iA || dVar2.c <= j)) {
                break;
            }
            int i2 = iMin - 1;
            dVar2 = i2 > 0 ? (d) this.q.get(iMin - 2) : null;
            iMin = i2;
        }
        if (iMin < this.q.size()) {
            dVar = (d) this.q.get(iMin);
            c8Var = this;
        } else {
            c8Var = this;
            dVar = null;
        }
        while (dVar != null && dVar.d != null) {
            int i3 = dVar.b;
            if (i3 >= iA && (i3 != iA || dVar.c > j)) {
                break;
            }
            iMin++;
            if (iMin < c8Var.q.size()) {
                dVar = (d) c8Var.q.get(iMin);
            } else {
                c8Var = c8Var;
                dVar = null;
            }
        }
        while (dVar != null && dVar.d != null && dVar.b == iA) {
            long j3 = dVar.c;
            if (j3 <= j || j3 > j2) {
                break;
            }
            try {
                c8Var.e(dVar.f318a);
                if (dVar.f318a.a() || dVar.f318a.i()) {
                    c8Var.q.remove(iMin);
                } else {
                    iMin++;
                }
                dVar = iMin < c8Var.q.size() ? (d) c8Var.q.get(iMin) : null;
            } catch (Throwable th) {
                if (dVar.f318a.a() || dVar.f318a.i()) {
                    c8Var.q.remove(iMin);
                }
                throw th;
            }
        }
        c8Var.N = iMin;
    }

    private void c(boolean z) throws y7 {
        wd.a aVar = this.t.e().f.f1062a;
        long jA = a(aVar, this.y.s, true, false);
        if (jA != this.y.s) {
            lh lhVar = this.y;
            this.y = a(aVar, jA, lhVar.c, lhVar.d, z, 5);
        }
    }

    private void b(boolean z) {
        for (sd sdVarE = this.t.e(); sdVarE != null; sdVarE = sdVarE.d()) {
            for (f8 f8Var : sdVarE.i().c) {
                if (f8Var != null) {
                    f8Var.a(z);
                }
            }
        }
    }

    public void b(int i, int i2, tj tjVar) {
        this.i.a(20, i, i2, tjVar).a();
    }

    private void c(int i) {
        lh lhVar = this.y;
        if (lhVar.e != i) {
            this.y = lhVar.a(i);
        }
    }

    private void b(mh mhVar) {
        this.p.a(mhVar);
        a(this.p.a(), true);
    }

    private static d9[] a(f8 f8Var) {
        int iB = f8Var != null ? f8Var.b() : 0;
        d9[] d9VarArr = new d9[iB];
        for (int i = 0; i < iB; i++) {
            d9VarArr[i] = f8Var.a(i);
        }
        return d9VarArr;
    }

    private void b(int i) throws y7 {
        this.F = i;
        if (!this.t.a(this.y.f631a, i)) {
            c(true);
        }
        a(false);
    }

    private long a(go goVar, Object obj, long j) {
        goVar.a(goVar.a(obj, this.m).c, this.l);
        go.d dVar = this.l;
        if (dVar.g != -9223372036854775807L && dVar.e()) {
            go.d dVar2 = this.l;
            if (dVar2.j) {
                return r2.a(dVar2.a() - this.l.g) - (j + this.m.e());
            }
        }
        return -9223372036854775807L;
    }

    private Pair a(go goVar) {
        long jB = 0;
        if (goVar.c()) {
            return Pair.create(lh.a(), 0L);
        }
        Pair pairA = goVar.a(this.l, this.m, goVar.a(this.G), -9223372036854775807L);
        wd.a aVarA = this.t.a(goVar, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (aVarA.a()) {
            goVar.a(aVarA.f1031a, this.m);
            if (aVarA.c == this.m.d(aVarA.b)) {
                jB = this.m.b();
            }
        } else {
            jB = jLongValue;
        }
        return Pair.create(aVarA, Long.valueOf(jB));
    }

    private void a(IOException iOException, int i) {
        y7 y7VarA = y7.a(iOException, i);
        sd sdVarE = this.t.e();
        if (sdVarE != null) {
            y7VarA = y7VarA.a(sdVarE.f.f1062a);
        }
        kc.a("ExoPlayerImplInternal", "Playback error", y7VarA);
        a(false, false);
        this.y = this.y.a(y7VarA);
    }

    private void a(boolean z) {
        long jC;
        sd sdVarD = this.t.d();
        wd.a aVar = sdVarD == null ? this.y.b : sdVarD.f.f1062a;
        boolean z2 = !this.y.k.equals(aVar);
        if (z2) {
            this.y = this.y.a(aVar);
        }
        lh lhVar = this.y;
        if (sdVarD == null) {
            jC = lhVar.s;
        } else {
            jC = sdVarD.c();
        }
        lhVar.q = jC;
        this.y.r = h();
        if ((z2 || z) && sdVarD != null && sdVarD.d) {
            a(sdVarD.h(), sdVarD.i());
        }
    }

    private void a(go goVar, boolean z) throws Throwable {
        int i;
        int i2;
        boolean z2;
        g gVarA = a(goVar, this.y, this.L, this.t, this.F, this.G, this.l, this.m);
        wd.a aVar = gVarA.f320a;
        long j = gVarA.c;
        boolean z3 = gVarA.d;
        long jA = gVarA.b;
        boolean z4 = (this.y.b.equals(aVar) && jA == this.y.s) ? false : true;
        h hVar = null;
        try {
            if (gVarA.e) {
                if (this.y.e != 1) {
                    c(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z4) {
                    try {
                        i2 = 4;
                        z2 = false;
                        if (!this.t.a(goVar, this.M, f())) {
                            c(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i = 4;
                        lh lhVar = this.y;
                        h hVar2 = hVar;
                        a(goVar, aVar, lhVar.f631a, lhVar.b, gVarA.f ? jA : -9223372036854775807L);
                        if (z4 || j != this.y.c) {
                            lh lhVar2 = this.y;
                            Object obj = lhVar2.b.f1031a;
                            go goVar2 = lhVar2.f631a;
                            this.y = a(aVar, jA, j, this.y.d, z4 && z && !goVar2.c() && !goVar2.a(obj, this.m).g, goVar.a(obj) == -1 ? i : 3);
                        }
                        B();
                        a(goVar, this.y.f631a);
                        this.y = this.y.a(goVar);
                        if (!goVar.c()) {
                            this.L = hVar2;
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    i2 = 4;
                    z2 = false;
                    if (!goVar.c()) {
                        for (sd sdVarE = this.t.e(); sdVarE != null; sdVarE = sdVarE.d()) {
                            if (sdVarE.f.f1062a.equals(aVar)) {
                                sdVarE.f = this.t.a(goVar, sdVarE.f);
                                sdVarE.m();
                            }
                        }
                        jA = a(aVar, jA, z3);
                    }
                }
                lh lhVar3 = this.y;
                a(goVar, aVar, lhVar3.f631a, lhVar3.b, gVarA.f ? jA : -9223372036854775807L);
                if (z4 || j != this.y.c) {
                    lh lhVar4 = this.y;
                    Object obj2 = lhVar4.b.f1031a;
                    go goVar3 = lhVar4.f631a;
                    this.y = a(aVar, jA, j, this.y.d, (!z4 || !z || goVar3.c() || goVar3.a(obj2, this.m).g) ? z2 : true, goVar.a(obj2) == -1 ? i2 : 3);
                }
                B();
                a(goVar, this.y.f631a);
                this.y = this.y.a(goVar);
                if (!goVar.c()) {
                    this.L = null;
                }
                a(z2);
            } catch (Throwable th2) {
                th = th2;
                hVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 4;
        }
    }

    private void a(mh mhVar, float f2, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.z.a(1);
            }
            this.y = this.y.a(mhVar);
        }
        a(mhVar.f697a);
        for (li liVar : this.f315a) {
            if (liVar != null) {
                liVar.a(f2, mhVar.f697a);
            }
        }
    }

    private void a(mh mhVar, boolean z) {
        a(mhVar, mhVar.f697a, true, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    private lh a(wd.a aVar, long j, long j2, long j3, boolean z, int i) {
        ab abVarH;
        qo qoVar;
        xo xoVar;
        qo qoVarH;
        xo xoVarI;
        this.O = (!this.O && j == this.y.s && aVar.equals(this.y.b)) ? false : true;
        B();
        lh lhVar = this.y;
        qo qoVar2 = lhVar.h;
        xo xoVar2 = lhVar.i;
        ?? r1 = lhVar.j;
        if (this.u.d()) {
            sd sdVarE = this.t.e();
            if (sdVarE == null) {
                qoVarH = qo.d;
            } else {
                qoVarH = sdVarE.h();
            }
            if (sdVarE == null) {
                xoVarI = this.f;
            } else {
                xoVarI = sdVarE.i();
            }
            ab abVarA = a(xoVarI.c);
            if (sdVarE != null) {
                ud udVar = sdVarE.f;
                if (udVar.c != j2) {
                    sdVarE.f = udVar.a(j2);
                }
            }
            qoVar = qoVarH;
            xoVar = xoVarI;
            abVarH = abVarA;
        } else if (aVar.equals(this.y.b)) {
            abVarH = r1;
            qoVar = qoVar2;
            xoVar = xoVar2;
        } else {
            qoVar = qo.d;
            xoVar = this.f;
            abVarH = ab.h();
        }
        if (z) {
            this.z.c(i);
        }
        return this.y.a(aVar, j, j2, j3, h(), qoVar, xoVar, abVarH);
    }

    private boolean a(li liVar, sd sdVar) {
        sd sdVarD = sdVar.d();
        return sdVar.f.f && sdVarD.d && ((liVar instanceof co) || liVar.i() >= sdVarD.g());
    }

    private static boolean a(lh lhVar, go.b bVar) {
        wd.a aVar = lhVar.b;
        go goVar = lhVar.f631a;
        return goVar.c() || goVar.a(aVar.f1031a, bVar).g;
    }

    private boolean a(long j, long j2) {
        if (this.J && this.I) {
            return false;
        }
        c(j, j2);
        return true;
    }

    private void a(c cVar) {
        this.z.a(1);
        throw null;
    }

    @Override // com.applovin.impl.f6.a
    public void a(mh mhVar) {
        this.i.a(16, mhVar).a();
    }

    @Override // com.applovin.impl.ae.d
    public void a() {
        this.i.c(22);
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        this.i.a(8, rdVar).a();
    }

    private void a(int i, int i2, tj tjVar) throws Throwable {
        this.z.a(1);
        a(this.u.a(i, i2, tjVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[PHI: r4 r5 r7
      0x009f: PHI (r4v3 com.applovin.impl.wd$a) = (r4v2 com.applovin.impl.wd$a), (r4v9 com.applovin.impl.wd$a) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(boolean, boolean, boolean, boolean):void");
    }

    private static void a(go goVar, d dVar, go.d dVar2, go.b bVar) {
        int i = goVar.a(goVar.a(dVar.d, bVar).c, dVar2).q;
        Object obj = goVar.a(i, bVar, true).b;
        long j = bVar.d;
        dVar.a(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean a(d dVar, go goVar, go goVar2, int i, boolean z, go.d dVar2, go.b bVar) {
        Object obj = dVar.d;
        if (obj == null) {
            Pair pairA = a(goVar, new h(dVar.f318a.f(), dVar.f318a.h(), dVar.f318a.d() == Long.MIN_VALUE ? -9223372036854775807L : r2.a(dVar.f318a.d())), false, i, z, dVar2, bVar);
            if (pairA == null) {
                return false;
            }
            dVar.a(goVar.a(pairA.first), ((Long) pairA.second).longValue(), pairA.first);
            if (dVar.f318a.d() == Long.MIN_VALUE) {
                a(goVar, dVar, dVar2, bVar);
            }
            return true;
        }
        int iA = goVar.a(obj);
        if (iA == -1) {
            return false;
        }
        if (dVar.f318a.d() == Long.MIN_VALUE) {
            a(goVar, dVar, dVar2, bVar);
            return true;
        }
        dVar.b = iA;
        goVar2.a(dVar.d, bVar);
        if (bVar.g && goVar2.a(bVar.c, dVar2).p == goVar2.a(dVar.d)) {
            Pair pairA2 = goVar.a(dVar2, bVar, goVar.a(dVar.d, bVar).c, dVar.c + bVar.e());
            dVar.a(goVar.a(pairA2.first), ((Long) pairA2.second).longValue(), pairA2.first);
        }
        return true;
    }

    private void a(go goVar, go goVar2) {
        if (goVar.c() && goVar2.c()) {
            return;
        }
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (!a((d) this.q.get(size), goVar, goVar2, this.F, this.G, this.l, this.m)) {
                ((d) this.q.get(size)).f318a.a(false);
                this.q.remove(size);
            }
        }
        Collections.sort(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.c8.g a(com.applovin.impl.go r30, com.applovin.impl.lh r31, com.applovin.impl.c8.h r32, com.applovin.impl.vd r33, int r34, boolean r35, com.applovin.impl.go.d r36, com.applovin.impl.go.b r37) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(com.applovin.impl.go, com.applovin.impl.lh, com.applovin.impl.c8$h, com.applovin.impl.vd, int, boolean, com.applovin.impl.go$d, com.applovin.impl.go$b):com.applovin.impl.c8$g");
    }

    private static Pair a(go goVar, h hVar, boolean z, int i, boolean z2, go.d dVar, go.b bVar) {
        Pair pairA;
        Object objA;
        go goVar2 = hVar.f321a;
        if (goVar.c()) {
            return null;
        }
        go goVar3 = goVar2.c() ? goVar : goVar2;
        try {
            pairA = goVar3.a(dVar, bVar, hVar.b, hVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (goVar.equals(goVar3)) {
            return pairA;
        }
        if (goVar.a(pairA.first) != -1) {
            return (goVar3.a(pairA.first, bVar).g && goVar3.a(bVar.c, dVar).p == goVar3.a(pairA.first)) ? goVar.a(dVar, bVar, goVar.a(pairA.first, bVar).c, hVar.c) : pairA;
        }
        if (z && (objA = a(dVar, bVar, i, z2, pairA.first, goVar3, goVar)) != null) {
            return goVar.a(dVar, bVar, goVar.a(objA, bVar).c, -9223372036854775807L);
        }
        return null;
    }

    static Object a(go.d dVar, go.b bVar, int i, boolean z, Object obj, go goVar, go goVar2) {
        int iA = goVar.a(obj);
        int iA2 = goVar.a();
        int iA3 = iA;
        int iA4 = -1;
        for (int i2 = 0; i2 < iA2 && iA4 == -1; i2++) {
            iA3 = goVar.a(iA3, bVar, dVar, i, z);
            if (iA3 == -1) {
                break;
            }
            iA4 = goVar2.a(goVar.b(iA3));
        }
        if (iA4 == -1) {
            return null;
        }
        return goVar2.b(iA4);
    }

    public void a(go goVar, int i, long j) {
        this.i.a(3, new h(goVar, i, j)).a();
    }

    private void a(h hVar) throws Throwable {
        long j;
        long j2;
        boolean z;
        wd.a aVar;
        long j3;
        long jA;
        long j4;
        lh lhVar;
        int i;
        this.z.a(1);
        Pair pairA = a(this.y.f631a, hVar, true, this.F, this.G, this.l, this.m);
        if (pairA == null) {
            Pair pairA2 = a(this.y.f631a);
            aVar = (wd.a) pairA2.first;
            long jLongValue = ((Long) pairA2.second).longValue();
            z = !this.y.f631a.c();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairA.first;
            long jLongValue2 = ((Long) pairA.second).longValue();
            long j5 = hVar.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            wd.a aVarA = this.t.a(this.y.f631a, obj, jLongValue2);
            if (aVarA.a()) {
                this.y.f631a.a(aVarA.f1031a, this.m);
                jLongValue2 = this.m.d(aVarA.b) == aVarA.c ? this.m.b() : 0L;
            } else if (hVar.c != -9223372036854775807L) {
                j = jLongValue2;
                j2 = j5;
                z = false;
                aVar = aVarA;
            }
            j = jLongValue2;
            j2 = j5;
            aVar = aVarA;
            z = true;
        }
        try {
            if (this.y.f631a.c()) {
                this.L = hVar;
            } else if (pairA == null) {
                if (this.y.e != 1) {
                    c(4);
                }
                a(false, true, false, true);
            } else {
                if (aVar.equals(this.y.b)) {
                    sd sdVarE = this.t.e();
                    jA = (sdVarE == null || !sdVarE.d || j == 0) ? j : sdVarE.f890a.a(j, this.x);
                    if (r2.b(jA) == r2.b(this.y.s) && ((i = (lhVar = this.y).e) == 2 || i == 3)) {
                        long j6 = lhVar.s;
                        this.y = a(aVar, j6, j2, j6, z, 2);
                        return;
                    }
                } else {
                    jA = j;
                }
                long jA2 = a(aVar, jA, this.y.e == 4);
                boolean z2 = (j != jA2) | z;
                try {
                    lh lhVar2 = this.y;
                    go goVar = lhVar2.f631a;
                    a(goVar, aVar, goVar, lhVar2.b, j2);
                    z = z2;
                    j4 = jA2;
                    this.y = a(aVar, j4, j2, j4, z, 2);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    j3 = jA2;
                    this.y = a(aVar, j3, j2, j3, z, 2);
                    throw th;
                }
            }
            j4 = j;
            this.y = a(aVar, j4, j2, j4, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    private long a(wd.a aVar, long j, boolean z) {
        return a(aVar, j, this.t.e() != this.t.f(), z);
    }

    private long a(wd.a aVar, long j, boolean z, boolean z2) throws y7 {
        H();
        this.D = false;
        if (z2 || this.y.e == 3) {
            c(2);
        }
        sd sdVarE = this.t.e();
        sd sdVarD = sdVarE;
        while (sdVarD != null && !aVar.equals(sdVarD.f.f1062a)) {
            sdVarD = sdVarD.d();
        }
        if (z || sdVarE != sdVarD || (sdVarD != null && sdVarD.e(j) < 0)) {
            for (li liVar : this.f315a) {
                a(liVar);
            }
            if (sdVarD != null) {
                while (this.t.e() != sdVarD) {
                    this.t.a();
                }
                this.t.a(sdVarD);
                sdVarD.c(0L);
                d();
            }
        }
        if (sdVarD != null) {
            this.t.a(sdVarD);
            if (!sdVarD.d) {
                sdVarD.f = sdVarD.f.b(j);
            } else if (sdVarD.e) {
                long jA = sdVarD.f890a.a(j);
                sdVarD.f890a.a(jA - this.n, this.o);
                j = jA;
            }
            c(j);
            m();
        } else {
            this.t.c();
            c(j);
        }
        a(false);
        this.i.c(2);
        return j;
    }

    @Override // com.applovin.impl.oh.a
    public synchronized void a(oh ohVar) {
        if (!this.A && this.j.isAlive()) {
            this.i.a(14, ohVar).a();
            return;
        }
        kc.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ohVar.a(false);
    }

    private void a(li liVar, long j) {
        liVar.g();
        if (liVar instanceof co) {
            ((co) liVar).c(j);
        }
    }

    private void a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.H != z) {
            this.H = z;
            if (!z) {
                for (li liVar : this.f315a) {
                    if (!c(liVar) && this.b.remove(liVar)) {
                        liVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(b bVar) throws Throwable {
        this.z.a(1);
        if (bVar.c != -1) {
            this.L = new h(new ph(bVar.f317a, bVar.b), bVar.c, bVar.d);
        }
        a(this.u.a(bVar.f317a, bVar.b), false);
    }

    public void a(List list, int i, long j, tj tjVar) {
        this.i.a(17, new b(list, tjVar, i, j, null)).a();
    }

    public void a(boolean z, int i) {
        this.i.a(1, z ? 1 : 0, i).a();
    }

    private void a(boolean z, int i, boolean z2, int i2) {
        this.z.a(z2 ? 1 : 0);
        this.z.b(i2);
        this.y = this.y.a(z, i);
        this.D = false;
        b(z);
        if (!E()) {
            H();
            K();
            return;
        }
        int i3 = this.y.e;
        if (i3 == 3) {
            F();
            this.i.c(2);
        } else if (i3 == 2) {
            this.i.c(2);
        }
    }

    public void a(int i) {
        this.i.a(11, i, 0).a();
    }

    private void a(fj fjVar) {
        this.x = fjVar;
    }
}
