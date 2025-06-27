package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.uf;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fa implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final jj f418a;
    private final boolean b;
    private final boolean c;
    private long g;
    private String i;
    private ro j;
    private b k;
    private boolean l;
    private boolean n;
    private final boolean[] h = new boolean[3];
    private final tf d = new tf(7, 128);
    private final tf e = new tf(8, 128);
    private final tf f = new tf(6, 128);
    private long m = -9223372036854775807L;
    private final yg o = new yg();

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public fa(jj jjVar, boolean z, boolean z2) {
        this.f418a = jjVar;
        this.b = z;
        this.c = z2;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        int iD = ygVar.d();
        int iE = ygVar.e();
        byte[] bArrC = ygVar.c();
        this.g += ygVar.a();
        this.j.a(ygVar, ygVar.a());
        while (true) {
            int iA = uf.a(bArrC, iD, iE, this.h);
            if (iA == iE) {
                a(bArrC, iD, iE);
                return;
            }
            int iB = uf.b(bArrC, iA);
            int i = iA - iD;
            if (i > 0) {
                a(bArrC, iD, iA);
            }
            int i2 = iE - iA;
            long j = this.g - i2;
            a(j, i2, i < 0 ? -i : 0, this.m);
            a(j, iB, this.m);
            iD = iA + 3;
        }
    }

    private void c() {
        a1.b(this.j);
        yp.a(this.k);
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.i = dVar.b();
        ro roVarA = k8Var.a(dVar.c(), 2);
        this.j = roVarA;
        this.k = new b(roVarA, this.b, this.c);
        this.f418a.a(k8Var, dVar);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ro f419a;
        private final boolean b;
        private final boolean c;
        private final SparseArray d = new SparseArray();
        private final SparseArray e = new SparseArray();
        private final zg f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m;
        private a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        public b(ro roVar, boolean z, boolean z2) {
            this.f419a = roVar;
            this.b = z;
            this.c = z2;
            this.m = new a();
            this.n = new a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new zg(bArr, 0, 0);
            b();
        }

        public void b() {
            this.k = false;
            this.o = false;
            this.n.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.b.a(byte[], int, int):void");
        }

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f420a;
            private boolean b;
            private uf.b c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private a() {
            }

            public boolean b() {
                int i;
                return this.b && ((i = this.e) == 7 || i == 2);
            }

            public void a() {
                this.b = false;
                this.f420a = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f420a) {
                    return false;
                }
                if (!aVar.f420a) {
                    return true;
                }
                uf.b bVar = (uf.b) a1.b(this.c);
                uf.b bVar2 = (uf.b) a1.b(aVar.c);
                return (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && (!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = bVar.k) != 0 || bVar2.k != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || bVar2.k != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.k) == aVar.k && (!z || this.l == aVar.l))))) ? false : true;
            }

            public void a(uf.b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = bVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.f420a = true;
                this.b = true;
            }

            public void a(int i) {
                this.e = i;
                this.b = true;
            }
        }

        public boolean a(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.a(this.m))) {
                if (z && this.o) {
                    a(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.b) {
                z2 = this.n.b();
            }
            boolean z4 = this.r;
            int i2 = this.i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        public boolean a() {
            return this.c;
        }

        private void a(int i) {
            long j = this.q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.r;
            this.f419a.a(j, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        public void a(uf.a aVar) {
            this.e.append(aVar.f1065a, aVar);
        }

        public void a(uf.b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void a(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.a();
            this.h = 0;
            this.k = true;
        }
    }

    private void a(long j, int i, int i2, long j2) {
        if (!this.l || this.k.a()) {
            this.d.a(i2);
            this.e.a(i2);
            if (!this.l) {
                if (this.d.a() && this.e.a()) {
                    ArrayList arrayList = new ArrayList();
                    tf tfVar = this.d;
                    arrayList.add(Arrays.copyOf(tfVar.d, tfVar.e));
                    tf tfVar2 = this.e;
                    arrayList.add(Arrays.copyOf(tfVar2.d, tfVar2.e));
                    tf tfVar3 = this.d;
                    uf.b bVarC = uf.c(tfVar3.d, 3, tfVar3.e);
                    tf tfVar4 = this.e;
                    uf.a aVarB = uf.b(tfVar4.d, 3, tfVar4.e);
                    this.j.a(new d9.b().c(this.i).f("video/avc").a(m3.a(bVarC.f1066a, bVarC.b, bVarC.c)).q(bVarC.e).g(bVarC.f).b(bVarC.g).a(arrayList).a());
                    this.l = true;
                    this.k.a(bVarC);
                    this.k.a(aVarB);
                    this.d.b();
                    this.e.b();
                }
            } else if (this.d.a()) {
                tf tfVar5 = this.d;
                this.k.a(uf.c(tfVar5.d, 3, tfVar5.e));
                this.d.b();
            } else if (this.e.a()) {
                tf tfVar6 = this.e;
                this.k.a(uf.b(tfVar6.d, 3, tfVar6.e));
                this.e.b();
            }
        }
        if (this.f.a(i2)) {
            tf tfVar7 = this.f;
            this.o.a(this.f.d, uf.c(tfVar7.d, tfVar7.e));
            this.o.f(4);
            this.f418a.a(j2, this.o);
        }
        if (this.k.a(j, i, this.l, this.n)) {
            this.n = false;
        }
    }

    private void a(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.a()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        this.n |= (i & 2) != 0;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        uf.a(this.h);
        this.d.b();
        this.e.b();
        this.f.b();
        b bVar = this.k;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void a(long j, int i, long j2) {
        if (!this.l || this.k.a()) {
            this.d.b(i);
            this.e.b(i);
        }
        this.f.b(i);
        this.k.a(j, i, j2);
    }
}
