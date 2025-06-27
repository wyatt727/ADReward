package com.applovin.impl;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.i1;
import com.applovin.impl.w6;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class h9 implements i8 {
    public static final m8 I = new m8() { // from class: com.applovin.impl.h9$$ExternalSyntheticLambda1
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return h9.d();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final d9 K = new d9.b().f("application/x-emsg").a();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private k8 E;
    private ro[] F;
    private ro[] G;
    private boolean H;

    /* renamed from: a, reason: collision with root package name */
    private final int f493a;
    private final mo b;
    private final List c;
    private final SparseArray d;
    private final yg e;
    private final yg f;
    private final yg g;
    private final byte[] h;
    private final yg i;
    private final io j;
    private final w7 k;
    private final yg l;
    private final ArrayDeque m;
    private final ArrayDeque n;
    private final ro o;
    private int p;
    private int q;
    private long r;
    private int s;
    private yg t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private b z;

    private static boolean b(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean c(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    protected mo a(mo moVar) {
        return moVar;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public h9() {
        this(0);
    }

    private void b() {
        this.p = 0;
        this.s = 0;
    }

    public h9(int i) {
        this(i, null);
    }

    public h9(int i, io ioVar) {
        this(i, ioVar, null, Collections.emptyList());
    }

    private void c() {
        int i;
        ro[] roVarArr = new ro[2];
        this.F = roVarArr;
        ro roVar = this.o;
        int i2 = 0;
        if (roVar != null) {
            roVarArr[0] = roVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f493a & 4) != 0) {
            roVarArr[i] = this.E.a(100, 5);
            i++;
            i3 = 101;
        }
        ro[] roVarArr2 = (ro[]) yp.a(this.F, i);
        this.F = roVarArr2;
        for (ro roVar2 : roVarArr2) {
            roVar2.a(K);
        }
        this.G = new ro[this.c.size()];
        while (i2 < this.G.length) {
            ro roVarA = this.E.a(i3, 3);
            roVarA.a((d9) this.c.get(i2));
            this.G[i2] = roVarA;
            i2++;
            i3++;
        }
    }

    private static Pair d(yg ygVar) {
        ygVar.f(12);
        return Pair.create(Integer.valueOf(ygVar.j()), new j6(ygVar.j() - 1, ygVar.j(), ygVar.j(), ygVar.j()));
    }

    public h9(int i, io ioVar, mo moVar, List list) {
        this(i, ioVar, moVar, list, null);
    }

    private void b(i1.a aVar) throws ah {
        a(aVar, this.d, this.b != null, this.f493a, this.h);
        w6 w6VarA = a(aVar.c);
        if (w6VarA != null) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                ((b) this.d.valueAt(i)).a(w6VarA);
            }
        }
        if (this.w != -9223372036854775807L) {
            int size2 = this.d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((b) this.d.valueAt(i2)).a(this.w);
            }
            this.w = -9223372036854775807L;
        }
    }

    public h9(int i, io ioVar, mo moVar, List list, ro roVar) {
        this.f493a = i;
        this.j = ioVar;
        this.b = moVar;
        this.c = Collections.unmodifiableList(list);
        this.o = roVar;
        this.k = new w7();
        this.l = new yg(16);
        this.e = new yg(uf.f1064a);
        this.f = new yg(5);
        this.g = new yg();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new yg(bArr);
        this.m = new ArrayDeque();
        this.n = new ArrayDeque();
        this.d = new SparseArray();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.E = k8.e;
        this.F = new ro[0];
        this.G = new ro[0];
    }

    private static int a(int i) throws ah {
        if (i >= 0) {
            return i;
        }
        throw ah.a("Unexpected negative value: " + i, null);
    }

    private void c(i1.a aVar) {
        int i = 0;
        a1.b(this.b == null, "Unexpected moov box.");
        w6 w6VarA = a(aVar.c);
        i1.a aVar2 = (i1.a) a1.a(aVar.d(Atom.TYPE_mvex));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.c.size();
        long jB = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            i1.b bVar = (i1.b) aVar2.c.get(i2);
            int i3 = bVar.f514a;
            if (i3 == 1953654136) {
                Pair pairD = d(bVar.b);
                sparseArray.put(((Integer) pairD.first).intValue(), (j6) pairD.second);
            } else if (i3 == 1835362404) {
                jB = b(bVar.b);
            }
        }
        List listA = j1.a(aVar, new x9(), jB, w6VarA, (this.f493a & 16) != 0, false, new Function() { // from class: com.applovin.impl.h9$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return this.f$0.a((mo) obj);
            }
        });
        int size2 = listA.size();
        if (this.d.size() == 0) {
            while (i < size2) {
                so soVar = (so) listA.get(i);
                mo moVar = soVar.f1005a;
                this.d.put(moVar.f698a, new b(this.E.a(i, moVar.b), soVar, a(sparseArray, moVar.f698a)));
                this.x = Math.max(this.x, moVar.e);
                i++;
            }
            this.E.c();
            return;
        }
        a1.b(this.d.size() == size2);
        while (i < size2) {
            so soVar2 = (so) listA.get(i);
            mo moVar2 = soVar2.f1005a;
            ((b) this.d.get(moVar2.f698a)).a(soVar2, a(sparseArray, moVar2.f698a));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(j8 j8Var) throws ah {
        int iA;
        b bVarA = this.z;
        Throwable th = null;
        if (bVarA == null) {
            bVarA = a(this.d);
            if (bVarA == null) {
                int iF = (int) (this.u - j8Var.f());
                if (iF >= 0) {
                    j8Var.a(iF);
                    b();
                    return false;
                }
                throw ah.a("Offset to end of mdat was negative.", null);
            }
            int iB = (int) (bVarA.b() - j8Var.f());
            if (iB < 0) {
                kc.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iB = 0;
            }
            j8Var.a(iB);
            this.z = bVarA;
        }
        int i = 4;
        int i2 = 1;
        if (this.p == 3) {
            int iD = bVarA.d();
            this.A = iD;
            if (bVarA.f < bVarA.i) {
                j8Var.a(iD);
                bVarA.h();
                if (!bVarA.f()) {
                    this.z = null;
                }
                this.p = 3;
                return true;
            }
            if (bVarA.d.f1005a.g == 1) {
                this.A = iD - 8;
                j8Var.a(8);
            }
            if (MimeTypes.AUDIO_AC4.equals(bVarA.d.f1005a.f.m)) {
                this.B = bVarA.a(this.A, 7);
                n.a(this.A, this.i);
                bVarA.f495a.a(this.i, 7);
                this.B += 7;
            } else {
                this.B = bVarA.a(this.A, 0);
            }
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        mo moVar = bVarA.d.f1005a;
        ro roVar = bVarA.f495a;
        long jC = bVarA.c();
        io ioVar = this.j;
        if (ioVar != null) {
            jC = ioVar.a(jC);
        }
        long j = jC;
        if (moVar.j == 0) {
            while (true) {
                int i3 = this.B;
                int i4 = this.A;
                if (i3 >= i4) {
                    break;
                }
                this.B += roVar.a((e5) j8Var, i4 - i3, false);
            }
        } else {
            byte[] bArrC = this.f.c();
            bArrC[0] = 0;
            bArrC[1] = 0;
            bArrC[2] = 0;
            int i5 = moVar.j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.B < this.A) {
                int i8 = this.C;
                if (i8 == 0) {
                    j8Var.d(bArrC, i7, i6);
                    this.f.f(0);
                    int iJ = this.f.j();
                    if (iJ >= i2) {
                        this.C = iJ - 1;
                        this.e.f(0);
                        roVar.a(this.e, i);
                        roVar.a(this.f, i2);
                        this.D = (this.G.length <= 0 || !uf.a(moVar.f.m, bArrC[i])) ? 0 : i2;
                        this.B += 5;
                        this.A += i7;
                    } else {
                        throw ah.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.g.d(i8);
                        j8Var.d(this.g.c(), 0, this.C);
                        roVar.a(this.g, this.C);
                        iA = this.C;
                        int iC = uf.c(this.g.c(), this.g.e());
                        this.g.f("video/hevc".equals(moVar.f.m) ? 1 : 0);
                        this.g.e(iC);
                        a3.a(j, this.g, this.G);
                    } else {
                        iA = roVar.a((e5) j8Var, i8, false);
                    }
                    this.B += iA;
                    this.C -= iA;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iA2 = bVarA.a();
        no noVarE = bVarA.e();
        roVar.a(j, iA2, this.A, 0, noVarE != null ? noVarE.c : null);
        a(j);
        if (!bVarA.f()) {
            this.z = null;
        }
        this.p = 3;
        return true;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f494a;
        public final int b;

        public a(long j, int i) {
            this.f494a = j;
            this.b = i;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ro f495a;
        public so d;
        public j6 e;
        public int f;
        public int g;
        public int h;
        public int i;
        private boolean l;
        public final oo b = new oo();
        public final yg c = new yg();
        private final yg j = new yg(1);
        private final yg k = new yg();

        public b(ro roVar, so soVar, j6 j6Var) {
            this.f495a = roVar;
            this.d = soVar;
            this.e = j6Var;
            a(soVar, j6Var);
        }

        public void g() {
            this.b.a();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public long c() {
            if (!this.l) {
                return this.d.f[this.f];
            }
            return this.b.a(this.f);
        }

        public long b() {
            if (!this.l) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }

        public int d() {
            if (!this.l) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }

        public boolean f() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public void h() {
            no noVarE = e();
            if (noVarE == null) {
                return;
            }
            yg ygVar = this.b.p;
            int i = noVarE.d;
            if (i != 0) {
                ygVar.g(i);
            }
            if (this.b.c(this.f)) {
                ygVar.g(ygVar.C() * 6);
            }
        }

        public no e() {
            if (!this.l) {
                return null;
            }
            int i = ((j6) yp.a(this.b.f765a)).f562a;
            no noVarA = this.b.o;
            if (noVarA == null) {
                noVarA = this.d.f1005a.a(i);
            }
            if (noVarA == null || !noVarA.f727a) {
                return null;
            }
            return noVarA;
        }

        public int a() {
            int i;
            if (!this.l) {
                i = this.d.g[this.f];
            } else {
                i = this.b.l[this.f] ? 1 : 0;
            }
            return e() != null ? i | 1073741824 : i;
        }

        public int a(int i, int i2) {
            yg ygVar;
            no noVarE = e();
            if (noVarE == null) {
                return 0;
            }
            int length = noVarE.d;
            if (length != 0) {
                ygVar = this.b.p;
            } else {
                byte[] bArr = (byte[]) yp.a((Object) noVarE.e);
                this.k.a(bArr, bArr.length);
                yg ygVar2 = this.k;
                length = bArr.length;
                ygVar = ygVar2;
            }
            boolean zC = this.b.c(this.f);
            boolean z = zC || i2 != 0;
            this.j.c()[0] = (byte) ((z ? 128 : 0) | length);
            this.j.f(0);
            this.f495a.a(this.j, 1, 1);
            this.f495a.a(ygVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zC) {
                this.c.d(8);
                byte[] bArrC = this.c.c();
                bArrC[0] = 0;
                bArrC[1] = 1;
                bArrC[2] = (byte) ((i2 >> 8) & 255);
                bArrC[3] = (byte) (i2 & 255);
                bArrC[4] = (byte) ((i >> 24) & 255);
                bArrC[5] = (byte) ((i >> 16) & 255);
                bArrC[6] = (byte) ((i >> 8) & 255);
                bArrC[7] = (byte) (i & 255);
                this.f495a.a(this.c, 8, 1);
                return length + 9;
            }
            yg ygVar3 = this.b.p;
            int iC = ygVar3.C();
            ygVar3.g(-2);
            int i3 = (iC * 6) + 2;
            if (i2 != 0) {
                this.c.d(i3);
                byte[] bArrC2 = this.c.c();
                ygVar3.a(bArrC2, 0, i3);
                int i4 = (((bArrC2[2] & 255) << 8) | (bArrC2[3] & 255)) + i2;
                bArrC2[2] = (byte) ((i4 >> 8) & 255);
                bArrC2[3] = (byte) (i4 & 255);
                ygVar3 = this.c;
            }
            this.f495a.a(ygVar3, i3, 1);
            return length + 1 + i3;
        }

        public void a(so soVar, j6 j6Var) {
            this.d = soVar;
            this.e = j6Var;
            this.f495a.a(soVar.f1005a.f);
            g();
        }

        public void a(long j) {
            int i = this.f;
            while (true) {
                oo ooVar = this.b;
                if (i >= ooVar.f || ooVar.a(i) >= j) {
                    return;
                }
                if (this.b.l[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void a(w6 w6Var) {
            no noVarA = this.d.f1005a.a(((j6) yp.a(this.b.f765a)).f562a);
            this.f495a.a(this.d.f1005a.f.a().a(w6Var.a(noVarA != null ? noVarA.b : null)).a());
        }
    }

    private j6 a(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (j6) sparseArray.valueAt(0);
        }
        return (j6) a1.a((j6) sparseArray.get(i));
    }

    private static long b(yg ygVar) {
        ygVar.f(8);
        return i1.c(ygVar.j()) == 0 ? ygVar.y() : ygVar.B();
    }

    private void d(j8 j8Var) throws ah {
        int size = this.d.size();
        long j = Long.MAX_VALUE;
        b bVar = null;
        for (int i = 0; i < size; i++) {
            oo ooVar = ((b) this.d.valueAt(i)).b;
            if (ooVar.q) {
                long j2 = ooVar.d;
                if (j2 < j) {
                    bVar = (b) this.d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.p = 3;
            return;
        }
        int iF = (int) (j - j8Var.f());
        if (iF >= 0) {
            j8Var.a(iF);
            bVar.b.a(j8Var);
            return;
        }
        throw ah.a("Offset to encryption data was negative.", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] d() {
        return new i8[]{new h9()};
    }

    private static long c(yg ygVar) {
        ygVar.f(8);
        return i1.c(ygVar.j()) == 1 ? ygVar.B() : ygVar.y();
    }

    private void c(j8 j8Var) throws ah {
        int i = ((int) this.r) - this.s;
        yg ygVar = this.t;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), 8, i);
            a(new i1.b(this.q, ygVar), j8Var.f());
        } else {
            j8Var.a(i);
        }
        b(j8Var.f());
    }

    private static void b(yg ygVar, oo ooVar) throws ah {
        a(ygVar, 0, ooVar);
    }

    private static w6 a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            i1.b bVar = (i1.b) list.get(i);
            if (bVar.f514a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrC = bVar.b.c();
                UUID uuidC = fi.c(bArrC);
                if (uuidC == null) {
                    kc.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new w6.b(uuidC, "video/mp4", bArrC));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w6(arrayList);
    }

    private static void b(i1.a aVar, SparseArray sparseArray, boolean z, int i, byte[] bArr) throws ah {
        b bVarA = a(((i1.b) a1.a(aVar.e(Atom.TYPE_tfhd))).b, sparseArray, z);
        if (bVarA == null) {
            return;
        }
        oo ooVar = bVarA.b;
        long j = ooVar.r;
        boolean z2 = ooVar.s;
        bVarA.g();
        bVarA.l = true;
        i1.b bVarE = aVar.e(Atom.TYPE_tfdt);
        if (bVarE != null && (i & 2) == 0) {
            ooVar.r = c(bVarE.b);
            ooVar.s = true;
        } else {
            ooVar.r = j;
            ooVar.s = z2;
        }
        a(aVar, bVarA, i);
        no noVarA = bVarA.d.f1005a.a(((j6) a1.a(ooVar.f765a)).f562a);
        i1.b bVarE2 = aVar.e(Atom.TYPE_saiz);
        if (bVarE2 != null) {
            a((no) a1.a(noVarA), bVarE2.b, ooVar);
        }
        i1.b bVarE3 = aVar.e(Atom.TYPE_saio);
        if (bVarE3 != null) {
            a(bVarE3.b, ooVar);
        }
        i1.b bVarE4 = aVar.e(Atom.TYPE_senc);
        if (bVarE4 != null) {
            b(bVarE4.b, ooVar);
        }
        a(aVar, noVarA != null ? noVarA.b : null, ooVar);
        int size = aVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            i1.b bVar = (i1.b) aVar.c.get(i2);
            if (bVar.f514a == 1970628964) {
                a(bVar.b, ooVar, bArr);
            }
        }
    }

    private void b(long j) throws ah {
        while (!this.m.isEmpty() && ((i1.a) this.m.peek()).b == j) {
            a((i1.a) this.m.pop());
        }
        b();
    }

    private boolean b(j8 j8Var) throws ah {
        if (this.s == 0) {
            if (!j8Var.a(this.l.c(), 0, 8, true)) {
                return false;
            }
            this.s = 8;
            this.l.f(0);
            this.r = this.l.y();
            this.q = this.l.j();
        }
        long j = this.r;
        if (j == 1) {
            j8Var.d(this.l.c(), 8, 8);
            this.s += 8;
            this.r = this.l.B();
        } else if (j == 0) {
            long jA = j8Var.a();
            if (jA == -1 && !this.m.isEmpty()) {
                jA = ((i1.a) this.m.peek()).b;
            }
            if (jA != -1) {
                this.r = (jA - j8Var.f()) + this.s;
            }
        }
        if (this.r >= this.s) {
            long jF = j8Var.f() - this.s;
            int i = this.q;
            if ((i == 1836019558 || i == 1835295092) && !this.H) {
                this.E.a(new ej.b(this.x, jF));
                this.H = true;
            }
            if (this.q == 1836019558) {
                int size = this.d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    oo ooVar = ((b) this.d.valueAt(i2)).b;
                    ooVar.b = jF;
                    ooVar.d = jF;
                    ooVar.c = jF;
                }
            }
            int i3 = this.q;
            if (i3 == 1835295092) {
                this.z = null;
                this.u = jF + this.r;
                this.p = 2;
                return true;
            }
            if (b(i3)) {
                long jF2 = (j8Var.f() + this.r) - 8;
                this.m.push(new i1.a(this.q, jF2));
                if (this.r == this.s) {
                    b(jF2);
                } else {
                    b();
                }
            } else if (c(this.q)) {
                if (this.s == 8) {
                    long j2 = this.r;
                    if (j2 <= 2147483647L) {
                        yg ygVar = new yg((int) j2);
                        System.arraycopy(this.l.c(), 0, ygVar.c(), 0, 8);
                        this.t = ygVar;
                        this.p = 1;
                    } else {
                        throw ah.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ah.a("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.r <= 2147483647L) {
                this.t = null;
                this.p = 1;
            } else {
                throw ah.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private static b a(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b bVar2 = (b) sparseArray.valueAt(i);
            if ((bVar2.l || bVar2.f != bVar2.d.b) && (!bVar2.l || bVar2.h != bVar2.b.e)) {
                long jB = bVar2.b();
                if (jB < j) {
                    bVar = bVar2;
                    j = jB;
                }
            }
        }
        return bVar;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.E = k8Var;
        b();
        c();
        mo moVar = this.b;
        if (moVar != null) {
            this.d.put(0, new b(k8Var.a(0, moVar.b), new so(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new j6(0, 0, 0, 0)));
            this.E.c();
        }
    }

    private void a(i1.a aVar) throws ah {
        int i = aVar.f514a;
        if (i == 1836019574) {
            c(aVar);
        } else if (i == 1836019558) {
            b(aVar);
        } else {
            if (this.m.isEmpty()) {
                return;
            }
            ((i1.a) this.m.peek()).a(aVar);
        }
    }

    private void a(yg ygVar) {
        long jC;
        String str;
        long jC2;
        String str2;
        long jY;
        long jA;
        if (this.F.length == 0) {
            return;
        }
        ygVar.f(8);
        int iC = i1.c(ygVar.j());
        if (iC != 0) {
            if (iC != 1) {
                kc.d("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jY2 = ygVar.y();
            jA = yp.c(ygVar.B(), 1000000L, jY2);
            long jC3 = yp.c(ygVar.y(), 1000L, jY2);
            long jY3 = ygVar.y();
            str = (String) a1.a((Object) ygVar.t());
            jC2 = jC3;
            jY = jY3;
            str2 = (String) a1.a((Object) ygVar.t());
            jC = -9223372036854775807L;
        } else {
            String str3 = (String) a1.a((Object) ygVar.t());
            String str4 = (String) a1.a((Object) ygVar.t());
            long jY4 = ygVar.y();
            jC = yp.c(ygVar.y(), 1000000L, jY4);
            long j = this.y;
            long j2 = j != -9223372036854775807L ? j + jC : -9223372036854775807L;
            str = str3;
            jC2 = yp.c(ygVar.y(), 1000L, jY4);
            str2 = str4;
            jY = ygVar.y();
            jA = j2;
        }
        byte[] bArr = new byte[ygVar.a()];
        ygVar.a(bArr, 0, ygVar.a());
        yg ygVar2 = new yg(this.k.a(new u7(str, str2, jC2, jY, bArr)));
        int iA = ygVar2.a();
        for (ro roVar : this.F) {
            ygVar2.f(0);
            roVar.a(ygVar2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.n.addLast(new a(jC, iA));
            this.v += iA;
            return;
        }
        io ioVar = this.j;
        if (ioVar != null) {
            jA = ioVar.a(jA);
        }
        for (ro roVar2 : this.F) {
            roVar2.a(jA, 1, iA, 0, null);
        }
    }

    private void a(i1.b bVar, long j) throws ah {
        if (!this.m.isEmpty()) {
            ((i1.a) this.m.peek()).a(bVar);
            return;
        }
        int i = bVar.f514a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                a(bVar.b);
            }
        } else {
            Pair pairA = a(bVar.b, j);
            this.y = ((Long) pairA.first).longValue();
            this.E.a((ej) pairA.second);
            this.H = true;
        }
    }

    private void a(long j) {
        while (!this.n.isEmpty()) {
            a aVar = (a) this.n.removeFirst();
            this.v -= aVar.b;
            long jA = aVar.f494a + j;
            io ioVar = this.j;
            if (ioVar != null) {
                jA = ioVar.a(jA);
            }
            for (ro roVar : this.F) {
                roVar.a(jA, 1, aVar.b, this.v, null);
            }
        }
    }

    private static void a(i1.a aVar, SparseArray sparseArray, boolean z, int i, byte[] bArr) throws ah {
        int size = aVar.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            i1.a aVar2 = (i1.a) aVar.d.get(i2);
            if (aVar2.f514a == 1953653094) {
                b(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void a(yg ygVar, oo ooVar) throws ah {
        ygVar.f(8);
        int iJ = ygVar.j();
        if ((i1.b(iJ) & 1) == 1) {
            ygVar.g(8);
        }
        int iA = ygVar.A();
        if (iA == 1) {
            ooVar.d += i1.c(iJ) == 0 ? ygVar.y() : ygVar.B();
        } else {
            throw ah.a("Unexpected saio entry count: " + iA, null);
        }
    }

    private static void a(no noVar, yg ygVar, oo ooVar) throws ah {
        int i;
        int i2 = noVar.d;
        ygVar.f(8);
        if ((i1.b(ygVar.j()) & 1) == 1) {
            ygVar.g(8);
        }
        int iW = ygVar.w();
        int iA = ygVar.A();
        if (iA <= ooVar.f) {
            if (iW == 0) {
                boolean[] zArr = ooVar.n;
                i = 0;
                for (int i3 = 0; i3 < iA; i3++) {
                    int iW2 = ygVar.w();
                    i += iW2;
                    zArr[i3] = iW2 > i2;
                }
            } else {
                i = iW * iA;
                Arrays.fill(ooVar.n, 0, iA, iW > i2);
            }
            Arrays.fill(ooVar.n, iA, ooVar.f, false);
            if (i > 0) {
                ooVar.b(i);
                return;
            }
            return;
        }
        throw ah.a("Saiz sample count " + iA + " is greater than fragment sample count" + ooVar.f, null);
    }

    private static void a(i1.a aVar, String str, oo ooVar) throws ah {
        byte[] bArr = null;
        yg ygVar = null;
        yg ygVar2 = null;
        for (int i = 0; i < aVar.c.size(); i++) {
            i1.b bVar = (i1.b) aVar.c.get(i);
            yg ygVar3 = bVar.b;
            int i2 = bVar.f514a;
            if (i2 == 1935828848) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar = ygVar3;
                }
            } else if (i2 == 1936158820) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar2 = ygVar3;
                }
            }
        }
        if (ygVar == null || ygVar2 == null) {
            return;
        }
        ygVar.f(8);
        int iC = i1.c(ygVar.j());
        ygVar.g(4);
        if (iC == 1) {
            ygVar.g(4);
        }
        if (ygVar.j() == 1) {
            ygVar2.f(8);
            int iC2 = i1.c(ygVar2.j());
            ygVar2.g(4);
            if (iC2 == 1) {
                if (ygVar2.y() == 0) {
                    throw ah.a("Variable length description in sgpd found (unsupported)");
                }
            } else if (iC2 >= 2) {
                ygVar2.g(4);
            }
            if (ygVar2.y() == 1) {
                ygVar2.g(1);
                int iW = ygVar2.w();
                int i3 = (iW & 240) >> 4;
                int i4 = iW & 15;
                boolean z = ygVar2.w() == 1;
                if (z) {
                    int iW2 = ygVar2.w();
                    byte[] bArr2 = new byte[16];
                    ygVar2.a(bArr2, 0, 16);
                    if (iW2 == 0) {
                        int iW3 = ygVar2.w();
                        bArr = new byte[iW3];
                        ygVar2.a(bArr, 0, iW3);
                    }
                    ooVar.m = true;
                    ooVar.o = new no(z, str, iW2, bArr2, i3, i4, bArr);
                    return;
                }
                return;
            }
            throw ah.a("Entry count in sgpd != 1 (unsupported).");
        }
        throw ah.a("Entry count in sbgp != 1 (unsupported).");
    }

    private static void a(yg ygVar, int i, oo ooVar) throws ah {
        ygVar.f(i + 8);
        int iB = i1.b(ygVar.j());
        if ((iB & 1) == 0) {
            boolean z = (iB & 2) != 0;
            int iA = ygVar.A();
            if (iA == 0) {
                Arrays.fill(ooVar.n, 0, ooVar.f, false);
                return;
            }
            if (iA == ooVar.f) {
                Arrays.fill(ooVar.n, 0, iA, z);
                ooVar.b(ygVar.a());
                ooVar.a(ygVar);
                return;
            } else {
                throw ah.a("Senc sample count " + iA + " is different from fragment sample count" + ooVar.f, null);
            }
        }
        throw ah.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static Pair a(yg ygVar, long j) throws ah {
        long jB;
        long jB2;
        ygVar.f(8);
        int iC = i1.c(ygVar.j());
        ygVar.g(4);
        long jY = ygVar.y();
        if (iC == 0) {
            jB = ygVar.y();
            jB2 = ygVar.y();
        } else {
            jB = ygVar.B();
            jB2 = ygVar.B();
        }
        long j2 = jB;
        long j3 = j + jB2;
        long jC = yp.c(j2, 1000000L, jY);
        ygVar.g(2);
        int iC2 = ygVar.C();
        int[] iArr = new int[iC2];
        long[] jArr = new long[iC2];
        long[] jArr2 = new long[iC2];
        long[] jArr3 = new long[iC2];
        long j4 = jC;
        int i = 0;
        long j5 = j2;
        while (i < iC2) {
            int iJ = ygVar.j();
            if ((iJ & Integer.MIN_VALUE) == 0) {
                long jY2 = ygVar.y();
                iArr[i] = iJ & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                long j6 = j5 + jY2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = iC2;
                long jC2 = yp.c(j6, 1000000L, jY);
                jArr4[i] = jC2 - jArr5[i];
                ygVar.g(4);
                j3 += r1[i];
                i++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                iC2 = i2;
                j5 = j6;
                j4 = jC2;
            } else {
                throw ah.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(jC), new e3(iArr, jArr, jArr2, jArr3));
    }

    private static b a(yg ygVar, SparseArray sparseArray, boolean z) {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        ygVar.f(8);
        int iB = i1.b(ygVar.j());
        b bVar = (b) (z ? sparseArray.valueAt(0) : sparseArray.get(ygVar.j()));
        if (bVar == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jB = ygVar.B();
            oo ooVar = bVar.b;
            ooVar.c = jB;
            ooVar.d = jB;
        }
        j6 j6Var = bVar.e;
        if ((iB & 2) != 0) {
            iJ = ygVar.j() - 1;
        } else {
            iJ = j6Var.f562a;
        }
        if ((iB & 8) != 0) {
            iJ2 = ygVar.j();
        } else {
            iJ2 = j6Var.b;
        }
        if ((iB & 16) != 0) {
            iJ3 = ygVar.j();
        } else {
            iJ3 = j6Var.c;
        }
        if ((iB & 32) != 0) {
            iJ4 = ygVar.j();
        } else {
            iJ4 = j6Var.d;
        }
        bVar.b.f765a = new j6(iJ, iJ2, iJ3, iJ4);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.applovin.impl.h9.b r36, int r37, int r38, com.applovin.impl.yg r39, int r40) throws com.applovin.impl.ah {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h9.a(com.applovin.impl.h9$b, int, int, com.applovin.impl.yg, int):int");
    }

    private static void a(i1.a aVar, b bVar, int i) throws ah {
        List list = aVar.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i1.b bVar2 = (i1.b) list.get(i4);
            if (bVar2.f514a == 1953658222) {
                yg ygVar = bVar2.b;
                ygVar.f(12);
                int iA = ygVar.A();
                if (iA > 0) {
                    i3 += iA;
                    i2++;
                }
            }
        }
        bVar.h = 0;
        bVar.g = 0;
        bVar.f = 0;
        bVar.b.a(i2, i3);
        int i5 = 0;
        int iA2 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i1.b bVar3 = (i1.b) list.get(i6);
            if (bVar3.f514a == 1953658222) {
                iA2 = a(bVar, i5, i, bVar3.b, iA2);
                i5++;
            }
        }
    }

    private static void a(yg ygVar, oo ooVar, byte[] bArr) throws ah {
        ygVar.f(8);
        ygVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            a(ygVar, 16, ooVar);
        }
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        while (true) {
            int i = this.p;
            if (i != 0) {
                if (i == 1) {
                    c(j8Var);
                } else if (i != 2) {
                    if (e(j8Var)) {
                        return 0;
                    }
                } else {
                    d(j8Var);
                }
            } else if (!b(j8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((b) this.d.valueAt(i)).g();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        b();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return ik.a(j8Var);
    }
}
