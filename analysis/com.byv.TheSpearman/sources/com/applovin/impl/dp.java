package com.applovin.impl;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class dp implements i8 {
    public static final m8 t = new m8() { // from class: com.applovin.impl.dp$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return dp.c();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f369a;
    private final int b;
    private final List c;
    private final yg d;
    private final SparseIntArray e;
    private final ep.c f;
    private final SparseArray g;
    private final SparseBooleanArray h;
    private final SparseBooleanArray i;
    private final cp j;
    private bp k;
    private k8 l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private ep q;
    private int r;
    private int s;

    @Override // com.applovin.impl.i8
    public void a() {
    }

    static /* synthetic */ int d(dp dpVar) {
        int i = dpVar.m;
        dpVar.m = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] c() {
        return new i8[]{new dp()};
    }

    public dp() {
        this(0);
    }

    public dp(int i) {
        this(1, i, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public dp(int i, int i2, int i3) {
        this(i, new io(0L), new l6(i2), i3);
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.l = k8Var;
    }

    private class a implements cj {

        /* renamed from: a, reason: collision with root package name */
        private final xg f370a = new xg(new byte[4]);

        @Override // com.applovin.impl.cj
        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        public a() {
        }

        @Override // com.applovin.impl.cj
        public void a(yg ygVar) {
            if (ygVar.w() == 0 && (ygVar.w() & 128) != 0) {
                ygVar.g(6);
                int iA = ygVar.a() / 4;
                for (int i = 0; i < iA; i++) {
                    ygVar.a(this.f370a, 4);
                    int iA2 = this.f370a.a(16);
                    this.f370a.d(3);
                    if (iA2 == 0) {
                        this.f370a.d(13);
                    } else {
                        int iA3 = this.f370a.a(13);
                        if (dp.this.g.get(iA3) == null) {
                            dp.this.g.put(iA3, new dj(dp.this.new b(iA3)));
                            dp.d(dp.this);
                        }
                    }
                }
                if (dp.this.f369a != 2) {
                    dp.this.g.remove(0);
                }
            }
        }
    }

    private boolean b(j8 j8Var) {
        byte[] bArrC = this.d.c();
        if (9400 - this.d.d() < 188) {
            int iA = this.d.a();
            if (iA > 0) {
                System.arraycopy(bArrC, this.d.d(), bArrC, 0, iA);
            }
            this.d.a(bArrC, iA);
        }
        while (this.d.a() < 188) {
            int iE = this.d.e();
            int iA2 = j8Var.a(bArrC, iE, 9400 - iE);
            if (iA2 == -1) {
                return false;
            }
            this.d.e(iE + iA2);
        }
        return true;
    }

    private void d() {
        this.h.clear();
        this.g.clear();
        SparseArray sparseArrayA = this.f.a();
        int size = sparseArrayA.size();
        for (int i = 0; i < size; i++) {
            this.g.put(sparseArrayA.keyAt(i), (ep) sparseArrayA.valueAt(i));
        }
        this.g.put(0, new dj(new a()));
        this.q = null;
    }

    private class b implements cj {

        /* renamed from: a, reason: collision with root package name */
        private final xg f371a = new xg(new byte[5]);
        private final SparseArray b = new SparseArray();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        @Override // com.applovin.impl.cj
        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        public b(int i) {
            this.d = i;
        }

        @Override // com.applovin.impl.cj
        public void a(yg ygVar) {
            io ioVar;
            if (ygVar.w() != 2) {
                return;
            }
            if (dp.this.f369a == 1 || dp.this.f369a == 2 || dp.this.m == 1) {
                ioVar = (io) dp.this.c.get(0);
            } else {
                ioVar = new io(((io) dp.this.c.get(0)).a());
                dp.this.c.add(ioVar);
            }
            if ((ygVar.w() & 128) == 0) {
                return;
            }
            ygVar.g(1);
            int iC = ygVar.C();
            int i = 3;
            ygVar.g(3);
            ygVar.a(this.f371a, 2);
            this.f371a.d(3);
            int i2 = 13;
            dp.this.s = this.f371a.a(13);
            ygVar.a(this.f371a, 2);
            int i3 = 4;
            this.f371a.d(4);
            ygVar.g(this.f371a.a(12));
            if (dp.this.f369a == 2 && dp.this.q == null) {
                ep.b bVar = new ep.b(21, null, null, yp.f);
                dp dpVar = dp.this;
                dpVar.q = dpVar.f.a(21, bVar);
                if (dp.this.q != null) {
                    dp.this.q.a(ioVar, dp.this.l, new ep.d(iC, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            int iA = ygVar.a();
            while (iA > 0) {
                ygVar.a(this.f371a, 5);
                int iA2 = this.f371a.a(8);
                this.f371a.d(i);
                int iA3 = this.f371a.a(i2);
                this.f371a.d(i3);
                int iA4 = this.f371a.a(12);
                ep.b bVarA = a(ygVar, iA4);
                if (iA2 == 6 || iA2 == 5) {
                    iA2 = bVarA.f396a;
                }
                iA -= iA4 + 5;
                int i4 = dp.this.f369a == 2 ? iA2 : iA3;
                if (!dp.this.h.get(i4)) {
                    ep epVarA = (dp.this.f369a == 2 && iA2 == 21) ? dp.this.q : dp.this.f.a(iA2, bVarA);
                    if (dp.this.f369a != 2 || iA3 < this.c.get(i4, 8192)) {
                        this.c.put(i4, iA3);
                        this.b.put(i4, epVarA);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.c.keyAt(i5);
                int iValueAt = this.c.valueAt(i5);
                dp.this.h.put(iKeyAt, true);
                dp.this.i.put(iValueAt, true);
                ep epVar = (ep) this.b.valueAt(i5);
                if (epVar != null) {
                    if (epVar != dp.this.q) {
                        epVar.a(ioVar, dp.this.l, new ep.d(iC, iKeyAt, 8192));
                    }
                    dp.this.g.put(iValueAt, epVar);
                }
            }
            if (dp.this.f369a == 2) {
                if (dp.this.n) {
                    return;
                }
                dp.this.l.c();
                dp.this.m = 0;
                dp.this.n = true;
                return;
            }
            dp.this.g.remove(this.d);
            dp dpVar2 = dp.this;
            dpVar2.m = dpVar2.f369a == 1 ? 0 : dp.this.m - 1;
            if (dp.this.m == 0) {
                dp.this.l.c();
                dp.this.n = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.applovin.impl.ep.b a(com.applovin.impl.yg r12, int r13) {
            /*
                r11 = this;
                int r0 = r12.d()
                int r13 = r13 + r0
                r1 = 0
                r2 = -1
                r3 = r2
                r2 = r1
            L9:
                int r4 = r12.d()
                if (r4 >= r13) goto Lb8
                int r4 = r12.w()
                int r5 = r12.w()
                int r6 = r12.d()
                int r6 = r6 + r5
                if (r6 <= r13) goto L20
                goto Lb8
            L20:
                r5 = 5
                r7 = 89
                if (r4 != r5) goto L4b
                long r4 = r12.y()
                r7 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L31
                goto L4f
            L31:
                r7 = 1161904947(0x45414333, double:5.74057318E-315)
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L39
                goto L56
            L39:
                r7 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L41
                goto L65
            L41:
                r7 = 1212503619(0x48455643, double:5.990563836E-315)
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 != 0) goto Lae
                r3 = 36
                goto Lae
            L4b:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L52
            L4f:
                r3 = 129(0x81, float:1.81E-43)
                goto Lae
            L52:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L59
            L56:
                r3 = 135(0x87, float:1.89E-43)
                goto Lae
            L59:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 != r5) goto L68
                int r4 = r12.w()
                r5 = 21
                if (r4 != r5) goto Lae
            L65:
                r3 = 172(0xac, float:2.41E-43)
                goto Lae
            L68:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L6f
                r3 = 138(0x8a, float:1.93E-43)
                goto Lae
            L6f:
                r5 = 10
                r8 = 3
                if (r4 != r5) goto L7d
                java.lang.String r1 = r12.c(r8)
                java.lang.String r1 = r1.trim()
                goto Lae
            L7d:
                if (r4 != r7) goto La8
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L84:
                int r3 = r12.d()
                if (r3 >= r6) goto La6
                java.lang.String r3 = r12.c(r8)
                java.lang.String r3 = r3.trim()
                int r4 = r12.w()
                r5 = 4
                byte[] r9 = new byte[r5]
                r10 = 0
                r12.a(r9, r10, r5)
                com.applovin.impl.ep$a r5 = new com.applovin.impl.ep$a
                r5.<init>(r3, r4, r9)
                r2.add(r5)
                goto L84
            La6:
                r3 = r7
                goto Lae
            La8:
                r5 = 111(0x6f, float:1.56E-43)
                if (r4 != r5) goto Lae
                r3 = 257(0x101, float:3.6E-43)
            Lae:
                int r4 = r12.d()
                int r6 = r6 - r4
                r12.g(r6)
                goto L9
            Lb8:
                r12.f(r13)
                com.applovin.impl.ep$b r4 = new com.applovin.impl.ep$b
                byte[] r12 = r12.c()
                byte[] r12 = java.util.Arrays.copyOfRange(r12, r0, r13)
                r4.<init>(r3, r1, r2, r12)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dp.b.a(com.applovin.impl.yg, int):com.applovin.impl.ep$b");
        }
    }

    public dp(int i, io ioVar, ep.c cVar, int i2) {
        this.f = (ep.c) a1.a(cVar);
        this.b = i2;
        this.f369a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(ioVar);
        } else {
            this.c = Collections.singletonList(ioVar);
        }
        this.d = new yg(new byte[9400], 0);
        this.h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.g = new SparseArray();
        this.e = new SparseIntArray();
        this.j = new cp(i2);
        this.l = k8.e;
        this.s = -1;
        d();
    }

    private void a(long j) {
        if (this.o) {
            return;
        }
        this.o = true;
        if (this.j.a() != -9223372036854775807L) {
            bp bpVar = new bp(this.j.b(), this.j.a(), j, this.s, this.b);
            this.k = bpVar;
            this.l.a(bpVar.a());
            return;
        }
        this.l.a(new ej.b(this.j.a()));
    }

    private int b() throws ah {
        int iD = this.d.d();
        int iE = this.d.e();
        int iA = fp.a(this.d.c(), iD, iE);
        this.d.f(iA);
        int i = iA + 188;
        if (i > iE) {
            int i2 = this.r + (iA - iD);
            this.r = i2;
            if (this.f369a == 2 && i2 > 376) {
                throw ah.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.r = 0;
        }
        return i;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        long jA = j8Var.a();
        if (this.n) {
            if (jA != -1 && this.f369a != 2 && !this.j.c()) {
                return this.j.a(j8Var, qhVar, this.s);
            }
            a(jA);
            if (this.p) {
                this.p = false;
                a(0L, 0L);
                if (j8Var.f() != 0) {
                    qhVar.f835a = 0L;
                    return 1;
                }
            }
            bp bpVar = this.k;
            if (bpVar != null && bpVar.b()) {
                return this.k.a(j8Var, qhVar);
            }
        }
        if (!b(j8Var)) {
            return -1;
        }
        int iB = b();
        int iE = this.d.e();
        if (iB > iE) {
            return 0;
        }
        int iJ = this.d.j();
        if ((8388608 & iJ) != 0) {
            this.d.f(iB);
            return 0;
        }
        int i = (4194304 & iJ) != 0 ? 1 : 0;
        int i2 = (2096896 & iJ) >> 8;
        boolean z = (iJ & 32) != 0;
        ep epVar = (iJ & 16) != 0 ? (ep) this.g.get(i2) : null;
        if (epVar == null) {
            this.d.f(iB);
            return 0;
        }
        if (this.f369a != 2) {
            int i3 = iJ & 15;
            int i4 = this.e.get(i2, i3 - 1);
            this.e.put(i2, i3);
            if (i4 == i3) {
                this.d.f(iB);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                epVar.a();
            }
        }
        if (z) {
            int iW = this.d.w();
            i |= (this.d.w() & 64) != 0 ? 2 : 0;
            this.d.g(iW - 1);
        }
        boolean z2 = this.n;
        if (a(i2)) {
            this.d.e(iB);
            epVar.a(this.d, i);
            this.d.e(iE);
        }
        if (this.f369a != 2 && !z2 && this.n && jA != -1) {
            this.p = true;
        }
        this.d.f(iB);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r10, long r12) {
        /*
            r9 = this;
            int r10 = r9.f369a
            r11 = 1
            r0 = 0
            r1 = 2
            if (r10 == r1) goto L9
            r10 = r11
            goto La
        L9:
            r10 = r0
        La:
            com.applovin.impl.a1.b(r10)
            java.util.List r10 = r9.c
            int r10 = r10.size()
            r1 = r0
        L14:
            r2 = 0
            if (r1 >= r10) goto L4b
            java.util.List r4 = r9.c
            java.lang.Object r4 = r4.get(r1)
            com.applovin.impl.io r4 = (com.applovin.impl.io) r4
            long r5 = r4.c()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L2f
            r5 = r11
            goto L30
        L2f:
            r5 = r0
        L30:
            if (r5 != 0) goto L43
            long r5 = r4.a()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L48
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L48
            goto L45
        L43:
            if (r5 == 0) goto L48
        L45:
            r4.d(r12)
        L48:
            int r1 = r1 + 1
            goto L14
        L4b:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L56
            com.applovin.impl.bp r10 = r9.k
            if (r10 == 0) goto L56
            r10.b(r12)
        L56:
            com.applovin.impl.yg r10 = r9.d
            r10.d(r0)
            android.util.SparseIntArray r10 = r9.e
            r10.clear()
            r10 = r0
        L61:
            android.util.SparseArray r11 = r9.g
            int r11 = r11.size()
            if (r10 >= r11) goto L77
            android.util.SparseArray r11 = r9.g
            java.lang.Object r11 = r11.valueAt(r10)
            com.applovin.impl.ep r11 = (com.applovin.impl.ep) r11
            r11.a()
            int r10 = r10 + 1
            goto L61
        L77:
            r9.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dp.a(long, long):void");
    }

    private boolean a(int i) {
        return this.f369a == 2 || this.n || !this.i.get(i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.impl.j8 r7) {
        /*
            r6 = this;
            com.applovin.impl.yg r0 = r6.d
            byte[] r0 = r0.c()
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.c(r0, r1, r2)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dp.a(com.applovin.impl.j8):boolean");
    }
}
