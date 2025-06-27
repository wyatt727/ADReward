package com.applovin.impl;

import android.net.Uri;
import android.os.Handler;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.hc;
import com.applovin.impl.j5;
import com.applovin.impl.jc;
import com.applovin.impl.pa;
import com.applovin.impl.rd;
import com.applovin.impl.xd;
import com.applovin.impl.xi;
import com.applovin.impl.y6;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class xh implements rd, k8, jc.b, jc.f, xi.d {
    private static final Map N = l();
    private static final d9 O = new d9.b().c("icy").f(MimeTypes.APPLICATION_ICY).a();
    private boolean B;
    private boolean D;
    private boolean E;
    private int F;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f1170a;
    private final g5 b;
    private final z6 c;
    private final hc d;
    private final xd.a f;
    private final y6.a g;
    private final b h;
    private final n0 i;
    private final String j;
    private final long k;
    private final wh m;
    private rd.a r;
    private ra s;
    private boolean v;
    private boolean w;
    private boolean x;
    private e y;
    private ej z;
    private final jc l = new jc("ProgressiveMediaPeriod");
    private final a4 n = new a4();
    private final Runnable o = new Runnable() { // from class: com.applovin.impl.xh$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.r();
        }
    };
    private final Runnable p = new Runnable() { // from class: com.applovin.impl.xh$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.q();
        }
    };
    private final Handler q = yp.a();
    private d[] u = new d[0];
    private xi[] t = new xi[0];
    private long I = -9223372036854775807L;
    private long G = -1;
    private long A = -9223372036854775807L;
    private int C = 1;

    interface b {
        void a(long j, boolean z, boolean z2);
    }

    private static Map l() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    private void u() {
        a aVar = new a(this.f1170a, this.b, this.m, this, this.n);
        if (this.w) {
            a1.b(p());
            long j = this.A;
            if (j != -9223372036854775807L && this.I > j) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            aVar.a(((ej) a1.a(this.z)).b(this.I).f389a.b, this.I);
            for (xi xiVar : this.t) {
                xiVar.c(this.I);
            }
            this.I = -9223372036854775807L;
        }
        this.K = m();
        this.f.c(new ic(aVar.f1171a, aVar.k, this.l.a(aVar, this, this.d.a(this.C))), 1, -1, null, 0, null, aVar.j, this.A);
    }

    @Override // com.applovin.impl.rd
    public void c(long j) {
    }

    public xh(Uri uri, g5 g5Var, wh whVar, z6 z6Var, y6.a aVar, hc hcVar, xd.a aVar2, b bVar, n0 n0Var, String str, int i) {
        this.f1170a = uri;
        this.b = g5Var;
        this.c = z6Var;
        this.g = aVar;
        this.d = hcVar;
        this.f = aVar2;
        this.h = bVar;
        this.i = n0Var;
        this.j = str;
        this.k = i;
        this.m = whVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.M) {
            return;
        }
        ((rd.a) a1.a(this.r)).a((lj) this);
    }

    public void t() {
        if (this.w) {
            for (xi xiVar : this.t) {
                xiVar.k();
            }
        }
        this.l.a(this);
        this.q.removeCallbacksAndMessages(null);
        this.r = null;
        this.M = true;
    }

    @Override // com.applovin.impl.rd
    public void f() throws IOException {
        s();
        if (this.L && !this.w) {
            throw ah.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.impl.rd
    public long g() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    @Override // com.applovin.impl.rd
    public long h() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && m() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j) {
        if (this.L || this.l.c() || this.J) {
            return false;
        }
        if (this.w && this.F == 0) {
            return false;
        }
        boolean zE = this.n.e();
        if (this.l.d()) {
            return zE;
        }
        u();
        return true;
    }

    @Override // com.applovin.impl.rd
    public long e() {
        long jN;
        k();
        boolean[] zArr = this.y.b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.I;
        }
        if (this.x) {
            int length = this.t.length;
            jN = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.t[i].i()) {
                    jN = Math.min(jN, this.t[i].c());
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = n();
        }
        return jN == Long.MIN_VALUE ? this.H : jN;
    }

    void s() throws IOException {
        this.l.a(this.d.a(this.C));
    }

    void d(int i) throws IOException {
        this.t[i].j();
        s();
    }

    private boolean v() {
        return this.E || p();
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        k();
        return this.y.f1174a;
    }

    ro o() {
        return a(new d(0, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        we weVarA;
        if (this.M || this.w || !this.v || this.z == null) {
            return;
        }
        for (xi xiVar : this.t) {
            if (xiVar.f() == null) {
                return;
            }
        }
        this.n.c();
        int length = this.t.length;
        po[] poVarArr = new po[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            d9 d9VarA = (d9) a1.a(this.t[i].f());
            String str = d9VarA.m;
            boolean zG = df.g(str);
            boolean z = zG || df.i(str);
            zArr[i] = z;
            this.x = z | this.x;
            ra raVar = this.s;
            if (raVar != null) {
                if (zG || this.u[i].b) {
                    we weVar = d9VarA.k;
                    if (weVar == null) {
                        weVarA = new we(raVar);
                    } else {
                        weVarA = weVar.a(raVar);
                    }
                    d9VarA = d9VarA.a().a(weVarA).a();
                }
                if (zG && d9VarA.g == -1 && d9VarA.h == -1 && raVar.f857a != -1) {
                    d9VarA = d9VarA.a().b(raVar.f857a).a();
                }
            }
            poVarArr[i] = new po(d9VarA.a(this.c.a(d9VarA)));
        }
        this.y = new e(new qo(poVarArr), zArr);
        this.w = true;
        ((rd.a) a1.a(this.r)).a((rd) this);
    }

    @Override // com.applovin.impl.k8
    public void c() {
        this.v = true;
        this.q.post(this.o);
    }

    @Override // com.applovin.impl.jc.f
    public void d() {
        for (xi xiVar : this.t) {
            xiVar.l();
        }
        this.m.a();
    }

    private int m() {
        int iG = 0;
        for (xi xiVar : this.t) {
            iG += xiVar.g();
        }
        return iG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        long jMax = Long.MIN_VALUE;
        for (xi xiVar : this.t) {
            jMax = Math.max(jMax, xiVar.c());
        }
        return jMax;
    }

    private boolean p() {
        return this.I != -9223372036854775807L;
    }

    private void k() {
        a1.b(this.w);
        a1.a(this.y);
        a1.a(this.z);
    }

    private final class c implements yi {

        /* renamed from: a, reason: collision with root package name */
        private final int f1172a;

        public c(int i) {
            this.f1172a = i;
        }

        @Override // com.applovin.impl.yi
        public boolean d() {
            return xh.this.a(this.f1172a);
        }

        @Override // com.applovin.impl.yi
        public void a() throws IOException {
            xh.this.d(this.f1172a);
        }

        @Override // com.applovin.impl.yi
        public int a(e9 e9Var, n5 n5Var, int i) {
            return xh.this.a(this.f1172a, e9Var, n5Var, i);
        }

        @Override // com.applovin.impl.yi
        public int a(long j) {
            return xh.this.a(this.f1172a, j);
        }
    }

    final class a implements jc.e, pa.a {
        private final Uri b;
        private final cl c;
        private final wh d;
        private final k8 e;
        private final a4 f;
        private volatile boolean h;
        private long j;
        private ro m;
        private boolean n;
        private final qh g = new qh();
        private boolean i = true;
        private long l = -1;

        /* renamed from: a, reason: collision with root package name */
        private final long f1171a = ic.a();
        private j5 k = a(0);

        public a(Uri uri, g5 g5Var, wh whVar, k8 k8Var, a4 a4Var) {
            this.b = uri;
            this.c = new cl(g5Var);
            this.d = whVar;
            this.e = k8Var;
            this.f = a4Var;
        }

        @Override // com.applovin.impl.jc.e
        public void b() {
            this.h = true;
        }

        @Override // com.applovin.impl.jc.e
        public void a() {
            int iA = 0;
            while (iA == 0 && !this.h) {
                try {
                    long j = this.g.f835a;
                    j5 j5VarA = a(j);
                    this.k = j5VarA;
                    long jA = this.c.a(j5VarA);
                    this.l = jA;
                    if (jA != -1) {
                        this.l = jA + j;
                    }
                    xh.this.s = ra.a(this.c.e());
                    e5 paVar = this.c;
                    if (xh.this.s != null && xh.this.s.g != -1) {
                        paVar = new pa(this.c, xh.this.s.g, this);
                        ro roVarO = xh.this.o();
                        this.m = roVarO;
                        roVarO.a(xh.O);
                    }
                    long jB = j;
                    this.d.a(paVar, this.b, this.c.e(), j, this.l, this.e);
                    if (xh.this.s != null) {
                        this.d.c();
                    }
                    if (this.i) {
                        this.d.a(jB, this.j);
                        this.i = false;
                    }
                    while (true) {
                        long j2 = jB;
                        while (iA == 0 && !this.h) {
                            try {
                                this.f.a();
                                iA = this.d.a(this.g);
                                jB = this.d.b();
                                if (jB > xh.this.k + j2) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f.c();
                        xh.this.q.post(xh.this.p);
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (this.d.b() != -1) {
                        this.g.f835a = this.d.b();
                    }
                    yp.a((g5) this.c);
                } catch (Throwable th) {
                    if (iA != 1 && this.d.b() != -1) {
                        this.g.f835a = this.d.b();
                    }
                    yp.a((g5) this.c);
                    throw th;
                }
            }
        }

        @Override // com.applovin.impl.pa.a
        public void a(yg ygVar) {
            long jMax = !this.n ? this.j : Math.max(xh.this.n(), this.j);
            int iA = ygVar.a();
            ro roVar = (ro) a1.a(this.m);
            roVar.a(ygVar, iA);
            roVar.a(jMax, 1, iA, 0, null);
            this.n = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.g.f835a = j;
            this.j = j2;
            this.i = true;
            this.n = false;
        }

        private j5 a(long j) {
            return new j5.b().a(this.b).a(j).a(xh.this.j).a(6).a(xh.N).a();
        }
    }

    private boolean a(a aVar, int i) {
        ej ejVar;
        if (this.G == -1 && ((ejVar = this.z) == null || ejVar.d() == -9223372036854775807L)) {
            if (this.w && !v()) {
                this.J = true;
                return false;
            }
            this.E = this.w;
            this.H = 0L;
            this.K = 0;
            for (xi xiVar : this.t) {
                xiVar.n();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.K = i;
        return true;
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final qo f1174a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(qo qoVar, boolean[] zArr) {
            this.f1174a = qoVar;
            this.b = zArr;
            int i = qoVar.f848a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f1173a;
        public final boolean b;

        public d(int i, boolean z) {
            this.f1173a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1173a == dVar.f1173a && this.b == dVar.b;
        }

        public int hashCode() {
            return (this.f1173a * 31) + (this.b ? 1 : 0);
        }
    }

    private void c(int i) {
        k();
        boolean[] zArr = this.y.b;
        if (this.J && zArr[i]) {
            if (this.t[i].a(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (xi xiVar : this.t) {
                xiVar.n();
            }
            ((rd.a) a1.a(this.r)).a((lj) this);
        }
    }

    private void a(a aVar) {
        if (this.G == -1) {
            this.G = aVar.l;
        }
    }

    private void b(int i) {
        k();
        e eVar = this.y;
        boolean[] zArr = eVar.d;
        if (zArr[i]) {
            return;
        }
        d9 d9VarA = eVar.f1174a.a(i).a(0);
        this.f.a(df.e(d9VarA.m), d9VarA, 0, (Object) null, this.H);
        zArr[i] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(ej ejVar) {
        this.z = this.s == null ? ejVar : new ej.b(-9223372036854775807L);
        this.A = ejVar.d();
        boolean z = this.G == -1 && ejVar.d() == -9223372036854775807L;
        this.B = z;
        this.C = z ? 7 : 1;
        this.h.a(this.A, ejVar.b(), this.B);
        if (this.w) {
            return;
        }
        r();
    }

    @Override // com.applovin.impl.rd
    public void a(long j, boolean z) {
        k();
        if (p()) {
            return;
        }
        boolean[] zArr = this.y.c;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].b(j, z, zArr[i]);
        }
    }

    @Override // com.applovin.impl.rd
    public long a(long j, fj fjVar) {
        k();
        if (!this.z.b()) {
            return 0L;
        }
        ej.a aVarB = this.z.b(j);
        return fjVar.a(j, aVarB.f389a.f462a, aVarB.b.f462a);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        return this.l.d() && this.n.d();
    }

    boolean a(int i) {
        return !v() && this.t[i].a(this.L);
    }

    @Override // com.applovin.impl.jc.b
    public void a(a aVar, long j, long j2, boolean z) {
        cl clVar = aVar.c;
        ic icVar = new ic(aVar.f1171a, aVar.k, clVar.h(), clVar.i(), j, j2, clVar.g());
        this.d.a(aVar.f1171a);
        this.f.a(icVar, 1, -1, null, 0, null, aVar.j, this.A);
        if (z) {
            return;
        }
        a(aVar);
        for (xi xiVar : this.t) {
            xiVar.n();
        }
        if (this.F > 0) {
            ((rd.a) a1.a(this.r)).a((lj) this);
        }
    }

    @Override // com.applovin.impl.jc.b
    public void a(a aVar, long j, long j2) {
        ej ejVar;
        if (this.A == -9223372036854775807L && (ejVar = this.z) != null) {
            boolean zB = ejVar.b();
            long jN = n();
            long j3 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.A = j3;
            this.h.a(j3, zB, this.B);
        }
        cl clVar = aVar.c;
        ic icVar = new ic(aVar.f1171a, aVar.k, clVar.h(), clVar.i(), j, j2, clVar.g());
        this.d.a(aVar.f1171a);
        this.f.b(icVar, 1, -1, null, 0, null, aVar.j, this.A);
        a(aVar);
        this.L = true;
        ((rd.a) a1.a(this.r)).a((lj) this);
    }

    @Override // com.applovin.impl.jc.b
    public jc.c a(a aVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        a aVar2;
        jc.c cVarA;
        a(aVar);
        cl clVar = aVar.c;
        ic icVar = new ic(aVar.f1171a, aVar.k, clVar.h(), clVar.i(), j, j2, clVar.g());
        long jA = this.d.a(new hc.a(icVar, new pd(1, -1, null, 0, null, r2.b(aVar.j), r2.b(this.A)), iOException, i));
        if (jA == -9223372036854775807L) {
            cVarA = jc.g;
        } else {
            int iM = m();
            if (iM > this.K) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            if (a(aVar2, iM)) {
                cVarA = jc.a(z, jA);
            } else {
                cVarA = jc.f;
            }
        }
        boolean z2 = !cVarA.a();
        this.f.a(icVar, 1, -1, null, 0, null, aVar.j, this.A, iOException, z2);
        if (z2) {
            this.d.a(aVar.f1171a);
        }
        return cVarA;
    }

    @Override // com.applovin.impl.xi.d
    public void a(d9 d9Var) {
        this.q.post(this.o);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j) {
        this.r = aVar;
        this.n.e();
        u();
    }

    private ro a(d dVar) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.u[i])) {
                return this.t[i];
            }
        }
        xi xiVarA = xi.a(this.i, this.q.getLooper(), this.c, this.g);
        xiVarA.a(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.u, i2);
        dVarArr[length] = dVar;
        this.u = (d[]) yp.a((Object[]) dVarArr);
        xi[] xiVarArr = (xi[]) Arrays.copyOf(this.t, i2);
        xiVarArr[length] = xiVarA;
        this.t = (xi[]) yp.a((Object[]) xiVarArr);
        return xiVarA;
    }

    int a(int i, e9 e9Var, n5 n5Var, int i2) {
        if (v()) {
            return -3;
        }
        b(i);
        int iA = this.t[i].a(e9Var, n5Var, i2, this.L);
        if (iA == -3) {
            c(i);
        }
        return iA;
    }

    private boolean a(boolean[] zArr, long j) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (!this.t[i].b(j, false) && (zArr[i] || !this.x)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.impl.k8
    public void a(final ej ejVar) {
        this.q.post(new Runnable() { // from class: com.applovin.impl.xh$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(ejVar);
            }
        });
    }

    @Override // com.applovin.impl.rd
    public long a(long j) {
        k();
        boolean[] zArr = this.y.b;
        if (!this.z.b()) {
            j = 0;
        }
        int i = 0;
        this.E = false;
        this.H = j;
        if (p()) {
            this.I = j;
            return j;
        }
        if (this.C != 7 && a(zArr, j)) {
            return j;
        }
        this.J = false;
        this.I = j;
        this.L = false;
        if (this.l.d()) {
            xi[] xiVarArr = this.t;
            int length = xiVarArr.length;
            while (i < length) {
                xiVarArr[i].b();
                i++;
            }
            this.l.a();
        } else {
            this.l.b();
            xi[] xiVarArr2 = this.t;
            int length2 = xiVarArr2.length;
            while (i < length2) {
                xiVarArr2[i].n();
                i++;
            }
        }
        return j;
    }

    @Override // com.applovin.impl.rd
    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j) {
        f8 f8Var;
        k();
        e eVar = this.y;
        qo qoVar = eVar.f1174a;
        boolean[] zArr3 = eVar.c;
        int i = this.F;
        int i2 = 0;
        for (int i3 = 0; i3 < f8VarArr.length; i3++) {
            yi yiVar = yiVarArr[i3];
            if (yiVar != null && (f8VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) yiVar).f1172a;
                a1.b(zArr3[i4]);
                this.F--;
                zArr3[i4] = false;
                yiVarArr[i3] = null;
            }
        }
        boolean z = !this.D ? j == 0 : i != 0;
        for (int i5 = 0; i5 < f8VarArr.length; i5++) {
            if (yiVarArr[i5] == null && (f8Var = f8VarArr[i5]) != null) {
                a1.b(f8Var.b() == 1);
                a1.b(f8Var.b(0) == 0);
                int iA = qoVar.a(f8Var.a());
                a1.b(!zArr3[iA]);
                this.F++;
                zArr3[iA] = true;
                yiVarArr[i5] = new c(iA);
                zArr2[i5] = true;
                if (!z) {
                    xi xiVar = this.t[iA];
                    z = (xiVar.b(j, true) || xiVar.e() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.l.d()) {
                xi[] xiVarArr = this.t;
                int length = xiVarArr.length;
                while (i2 < length) {
                    xiVarArr[i2].b();
                    i2++;
                }
                this.l.a();
            } else {
                xi[] xiVarArr2 = this.t;
                int length2 = xiVarArr2.length;
                while (i2 < length2) {
                    xiVarArr2[i2].n();
                    i2++;
                }
            }
        } else if (z) {
            j = a(j);
            while (i2 < yiVarArr.length) {
                if (yiVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.D = true;
        return j;
    }

    int a(int i, long j) {
        if (v()) {
            return 0;
        }
        b(i);
        xi xiVar = this.t[i];
        int iA = xiVar.a(j, this.L);
        xiVar.f(iA);
        if (iA == 0) {
            c(i);
        }
        return iA;
    }

    @Override // com.applovin.impl.k8
    public ro a(int i, int i2) {
        return a(new d(i, false));
    }
}
