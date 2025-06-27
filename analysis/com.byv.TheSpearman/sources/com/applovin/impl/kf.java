package com.applovin.impl;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.i1;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class kf implements i8, ej {
    public static final m8 y = new m8() { // from class: com.applovin.impl.kf$$ExternalSyntheticLambda1
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return kf.f();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f599a;
    private final yg b;
    private final yg c;
    private final yg d;
    private final yg e;
    private final ArrayDeque f;
    private final ij g;
    private final List h;
    private int i;
    private int j;
    private long k;
    private int l;
    private yg m;
    private int n;
    private int o;
    private int p;
    private int q;
    private k8 r;
    private a[] s;
    private long[][] t;
    private int u;
    private long v;
    private int w;
    private Cif x;

    private static int a(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mo a(mo moVar) {
        return moVar;
    }

    private static boolean b(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean c(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    public kf() {
        this(0);
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.v;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        long j2;
        long jA;
        long j3;
        long j4;
        int iB;
        if (((a[]) a1.a(this.s)).length == 0) {
            return new ej.a(gj.c);
        }
        int i = this.u;
        if (i != -1) {
            so soVar = this.s[i].b;
            int iA = a(soVar, j);
            if (iA == -1) {
                return new ej.a(gj.c);
            }
            long j5 = soVar.f[iA];
            j2 = soVar.c[iA];
            if (j5 >= j || iA >= soVar.b - 1 || (iB = soVar.b(j)) == -1 || iB == iA) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = soVar.f[iB];
                j4 = soVar.c[iB];
            }
            jA = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jA = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.u) {
                so soVar2 = aVarArr[i2].b;
                long jA2 = a(soVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jA = a(soVar2, j3, jA);
                }
                j2 = jA2;
            }
            i2++;
        }
        gj gjVar = new gj(j, j2);
        if (j3 == -9223372036854775807L) {
            return new ej.a(gjVar);
        }
        return new ej.a(gjVar, new gj(j3, jA));
    }

    private void e() {
        this.i = 0;
        this.l = 0;
    }

    public kf(int i) {
        this.f599a = i;
        this.i = (i & 4) != 0 ? 3 : 0;
        this.g = new ij();
        this.h = new ArrayList();
        this.e = new yg(16);
        this.f = new ArrayDeque();
        this.b = new yg(uf.f1064a);
        this.c = new yg(4);
        this.d = new yg();
        this.n = -1;
    }

    private int c(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((a[]) yp.a((Object) this.s)).length; i3++) {
            a aVar = this.s[i3];
            int i4 = aVar.d;
            so soVar = aVar.b;
            if (i4 != soVar.b) {
                long j5 = soVar.c[i4];
                long j6 = ((long[][]) yp.a((Object) this.t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    private void d(long j) {
        while (!this.f.isEmpty() && ((i1.a) this.f.peek()).b == j) {
            i1.a aVar = (i1.a) this.f.pop();
            if (aVar.f514a == 1836019574) {
                a(aVar);
                this.f.clear();
                this.i = 2;
            } else if (!this.f.isEmpty()) {
                ((i1.a) this.f.peek()).a(aVar);
            }
        }
        if (this.i != 2) {
            e();
        }
    }

    private void f(long j) {
        for (a aVar : this.s) {
            so soVar = aVar.b;
            int iA = soVar.a(j);
            if (iA == -1) {
                iA = soVar.b(j);
            }
            aVar.d = iA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] f() {
        return new i8[]{new kf()};
    }

    private void g() {
        if (this.w != 2 || (this.f599a & 2) == 0) {
            return;
        }
        k8 k8Var = (k8) a1.a(this.r);
        k8Var.a(0, 4).a(new d9.b().a(this.x == null ? null : new we(this.x)).a());
        k8Var.c();
        k8Var.a(new ej.b(-9223372036854775807L));
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            so soVar = aVarArr[i3].b;
            j += soVar.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = soVar.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final mo f600a;
        public final so b;
        public final ro c;
        public int d;

        public a(mo moVar, so soVar, ro roVar) {
            this.f600a = moVar;
            this.b = soVar;
            this.c = roVar;
        }
    }

    private boolean c(j8 j8Var) throws ah {
        i1.a aVar;
        if (this.l == 0) {
            if (!j8Var.a(this.e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.l = 8;
            this.e.f(0);
            this.k = this.e.y();
            this.j = this.e.j();
        }
        long j = this.k;
        if (j == 1) {
            j8Var.d(this.e.c(), 8, 8);
            this.l += 8;
            this.k = this.e.B();
        } else if (j == 0) {
            long jA = j8Var.a();
            if (jA == -1 && (aVar = (i1.a) this.f.peek()) != null) {
                jA = aVar.b;
            }
            if (jA != -1) {
                this.k = (jA - j8Var.f()) + this.l;
            }
        }
        if (this.k >= this.l) {
            if (b(this.j)) {
                long jF = j8Var.f();
                long j2 = this.k;
                long j3 = this.l;
                long j4 = (jF + j2) - j3;
                if (j2 != j3 && this.j == 1835365473) {
                    b(j8Var);
                }
                this.f.push(new i1.a(this.j, j4));
                if (this.k == this.l) {
                    d(j4);
                } else {
                    e();
                }
            } else if (c(this.j)) {
                a1.b(this.l == 8);
                a1.b(this.k <= 2147483647L);
                yg ygVar = new yg((int) this.k);
                System.arraycopy(this.e.c(), 0, ygVar.c(), 0, 8);
                this.m = ygVar;
                this.i = 1;
            } else {
                e(j8Var.f() - this.l);
                this.m = null;
                this.i = 1;
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private void b(j8 j8Var) {
        this.d.d(8);
        j8Var.c(this.d.c(), 0, 8);
        j1.a(this.d);
        j8Var.a(this.d.d());
        j8Var.b();
    }

    private void e(long j) {
        if (this.j == 1836086884) {
            long j2 = this.l;
            this.x = new Cif(0L, j, -9223372036854775807L, j + j2, this.k - j2);
        }
    }

    private int d(j8 j8Var, qh qhVar) throws ah {
        int iA = this.g.a(j8Var, qhVar, this.h);
        if (iA == 1 && qhVar.f835a == 0) {
            e();
        }
        return iA;
    }

    private boolean b(j8 j8Var, qh qhVar) {
        boolean z;
        long j = this.k - this.l;
        long jF = j8Var.f() + j;
        yg ygVar = this.m;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), this.l, (int) j);
            if (this.j == 1718909296) {
                this.w = a(ygVar);
            } else if (!this.f.isEmpty()) {
                ((i1.a) this.f.peek()).a(new i1.b(this.j, ygVar));
            }
        } else if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            j8Var.a((int) j);
        } else {
            qhVar.f835a = j8Var.f() + j;
            z = true;
            d(jF);
            return (z || this.i == 2) ? false : true;
        }
        z = false;
        d(jF);
        if (z) {
        }
    }

    private static int a(so soVar, long j) {
        int iA = soVar.a(j);
        return iA == -1 ? soVar.b(j) : iA;
    }

    private int c(j8 j8Var, qh qhVar) throws ah {
        long jF = j8Var.f();
        if (this.n == -1) {
            int iC = c(jF);
            this.n = iC;
            if (iC == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) yp.a((Object) this.s))[this.n];
        ro roVar = aVar.c;
        int i = aVar.d;
        so soVar = aVar.b;
        long j = soVar.c[i];
        int i2 = soVar.d[i];
        long j2 = (j - jF) + this.o;
        if (j2 >= 0 && j2 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            if (aVar.f600a.g == 1) {
                j2 += 8;
                i2 -= 8;
            }
            j8Var.a((int) j2);
            mo moVar = aVar.f600a;
            if (moVar.j != 0) {
                byte[] bArrC = this.c.c();
                bArrC[0] = 0;
                bArrC[1] = 0;
                bArrC[2] = 0;
                int i3 = aVar.f600a.j;
                int i4 = 4 - i3;
                while (this.p < i2) {
                    int i5 = this.q;
                    if (i5 == 0) {
                        j8Var.d(bArrC, i4, i3);
                        this.o += i3;
                        this.c.f(0);
                        int iJ = this.c.j();
                        if (iJ >= 0) {
                            this.q = iJ;
                            this.b.f(0);
                            roVar.a(this.b, 4);
                            this.p += 4;
                            i2 += i4;
                        } else {
                            throw ah.a("Invalid NAL length", null);
                        }
                    } else {
                        int iA = roVar.a((e5) j8Var, i5, false);
                        this.o += iA;
                        this.p += iA;
                        this.q -= iA;
                    }
                }
            } else {
                if (MimeTypes.AUDIO_AC4.equals(moVar.f.m)) {
                    if (this.p == 0) {
                        n.a(i2, this.d);
                        roVar.a(this.d, 7);
                        this.p += 7;
                    }
                    i2 += 7;
                }
                while (true) {
                    int i6 = this.p;
                    if (i6 >= i2) {
                        break;
                    }
                    int iA2 = roVar.a((e5) j8Var, i2 - i6, false);
                    this.o += iA2;
                    this.p += iA2;
                    this.q -= iA2;
                }
            }
            so soVar2 = aVar.b;
            roVar.a(soVar2.f[i], soVar2.g[i], i2, 0, null);
            aVar.d++;
            this.n = -1;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            return 0;
        }
        qhVar.f835a = j;
        return 1;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.r = k8Var;
    }

    private static long a(so soVar, long j, long j2) {
        int iA = a(soVar, j);
        return iA == -1 ? j2 : Math.min(soVar.c[iA], j2);
    }

    private static int a(yg ygVar) {
        ygVar.f(8);
        int iA = a(ygVar.j());
        if (iA != 0) {
            return iA;
        }
        ygVar.g(4);
        while (ygVar.a() > 0) {
            int iA2 = a(ygVar.j());
            if (iA2 != 0) {
                return iA2;
            }
        }
        return 0;
    }

    private void a(i1.a aVar) {
        we weVar;
        we weVar2;
        ArrayList arrayList;
        List list;
        int i;
        we weVar3;
        char c;
        int size;
        int i2;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.w == 1;
        x9 x9Var = new x9();
        i1.b bVarE = aVar.e(Atom.TYPE_udta);
        if (bVarE != null) {
            Pair pairA = j1.a(bVarE);
            we weVar4 = (we) pairA.first;
            we weVar5 = (we) pairA.second;
            if (weVar4 != null) {
                x9Var.a(weVar4);
            }
            weVar = weVar5;
            weVar2 = weVar4;
        } else {
            weVar = null;
            weVar2 = null;
        }
        i1.a aVarD = aVar.d(Atom.TYPE_meta);
        we weVarB = aVarD != null ? j1.b(aVarD) : null;
        List listA = j1.a(aVar, x9Var, -9223372036854775807L, (w6) null, (this.f599a & 1) != 0, z, new Function() { // from class: com.applovin.impl.kf$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return kf.a((mo) obj);
            }
        });
        k8 k8Var = (k8) a1.a(this.r);
        int size2 = listA.size();
        int i3 = 0;
        int i4 = -1;
        long j = -9223372036854775807L;
        while (i3 < size2) {
            so soVar = (so) listA.get(i3);
            if (soVar.b == 0) {
                list = listA;
                i = size2;
                size = i4;
                arrayList = arrayList2;
            } else {
                mo moVar = soVar.f1005a;
                int i5 = i4;
                arrayList = arrayList2;
                long j2 = moVar.e;
                if (j2 == -9223372036854775807L) {
                    j2 = soVar.h;
                }
                long jMax = Math.max(j, j2);
                list = listA;
                i = size2;
                a aVar2 = new a(moVar, soVar, k8Var.a(i3, moVar.b));
                int i6 = soVar.e + 30;
                d9.b bVarA = moVar.f.a();
                bVarA.i(i6);
                if (moVar.b == 2 && j2 > 0 && (i2 = soVar.b) > 1) {
                    bVarA.a(i2 / (j2 / 1000000.0f));
                }
                cf.a(moVar.b, x9Var, bVarA);
                int i7 = moVar.b;
                we[] weVarArr = new we[2];
                weVarArr[0] = weVar;
                if (this.h.isEmpty()) {
                    c = 1;
                    weVar3 = null;
                } else {
                    weVar3 = new we(this.h);
                    c = 1;
                }
                weVarArr[c] = weVar3;
                cf.a(i7, weVar2, weVarB, bVarA, weVarArr);
                aVar2.c.a(bVarA.a());
                size = (moVar.b == 2 && i5 == -1) ? arrayList.size() : i5;
                arrayList.add(aVar2);
                j = jMax;
            }
            i3++;
            i4 = size;
            arrayList2 = arrayList;
            listA = list;
            size2 = i;
        }
        this.u = i4;
        this.v = j;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.s = aVarArr;
        this.t = a(aVarArr);
        k8Var.c();
        k8Var.a(this);
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return c(j8Var, qhVar);
                    }
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    return d(j8Var, qhVar);
                }
                if (b(j8Var, qhVar)) {
                    return 1;
                }
            } else if (!c(j8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j == 0) {
            if (this.i != 3) {
                e();
                return;
            } else {
                this.g.a();
                this.h.clear();
                return;
            }
        }
        if (this.s != null) {
            f(j2);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return ik.a(j8Var, (this.f599a & 2) != 0);
    }
}
