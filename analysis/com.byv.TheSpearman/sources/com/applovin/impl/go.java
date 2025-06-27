package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.go;
import com.applovin.impl.m2;
import com.applovin.impl.od;
import com.applovin.impl.u;

/* loaded from: classes.dex */
public abstract class go implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final go f465a = new a();
    public static final m2.a b = new m2.a() { // from class: com.applovin.impl.go$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return go.a(bundle);
        }
    };

    class a extends go {
        @Override // com.applovin.impl.go
        public int a() {
            return 0;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            return -1;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return 0;
        }

        @Override // com.applovin.impl.go
        public Object b(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.go
        public d a(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.go
        public b a(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        a() {
        }
    }

    protected go() {
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i, b bVar, boolean z);

    public abstract d a(int i, d dVar, long j);

    public abstract int b();

    public abstract Object b(int i);

    public static final class d implements m2 {
        public static final Object s = new Object();
        private static final Object t = new Object();
        private static final od u = new od.c().b("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();
        public static final m2.a v = new m2.a() { // from class: com.applovin.impl.go$d$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return go.d.a(bundle);
            }
        };
        public Object b;
        public Object d;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public boolean j;
        public boolean k;
        public od.f l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;

        /* renamed from: a, reason: collision with root package name */
        public Object f467a = s;
        public od c = u;

        public long b() {
            return r2.b(this.n);
        }

        public long c() {
            return this.n;
        }

        public long d() {
            return r2.b(this.o);
        }

        public boolean e() {
            a1.b(this.k == (this.l != null));
            return this.l != null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return yp.a(this.f467a, dVar.f467a) && yp.a(this.c, dVar.c) && yp.a(this.d, dVar.d) && yp.a(this.l, dVar.l) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o && this.p == dVar.p && this.q == dVar.q && this.r == dVar.r;
        }

        public int hashCode() {
            int iHashCode = (((this.f467a.hashCode() + 217) * 31) + this.c.hashCode()) * 31;
            Object obj = this.d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            od.f fVar = this.l;
            int iHashCode3 = fVar != null ? fVar.hashCode() : 0;
            long j = this.f;
            int i = (((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.g;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.h;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
            long j4 = this.n;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.o;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31;
            long j6 = this.r;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            od odVar = bundle2 != null ? (od) od.h.a(bundle2) : null;
            long j = bundle.getLong(a(2), -9223372036854775807L);
            long j2 = bundle.getLong(a(3), -9223372036854775807L);
            long j3 = bundle.getLong(a(4), -9223372036854775807L);
            boolean z = bundle.getBoolean(a(5), false);
            boolean z2 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            od.f fVar = bundle3 != null ? (od.f) od.f.h.a(bundle3) : null;
            boolean z3 = bundle.getBoolean(a(8), false);
            long j4 = bundle.getLong(a(9), 0L);
            long j5 = bundle.getLong(a(10), -9223372036854775807L);
            int i = bundle.getInt(a(11), 0);
            int i2 = bundle.getInt(a(12), 0);
            long j6 = bundle.getLong(a(13), 0L);
            d dVar = new d();
            dVar.a(t, odVar, null, j, j2, j3, z, z2, fVar, j4, j5, i, i2, j6);
            dVar.m = z3;
            return dVar;
        }

        public long a() {
            return yp.a(this.h);
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public d a(Object obj, od odVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, od.f fVar, long j4, long j5, int i, int i2, long j6) {
            od.g gVar;
            this.f467a = obj;
            this.c = odVar != null ? odVar : u;
            this.b = (odVar == null || (gVar = odVar.b) == null) ? null : gVar.g;
            this.d = obj2;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = z;
            this.j = z2;
            this.k = fVar != null;
            this.l = fVar;
            this.n = j4;
            this.o = j5;
            this.p = i;
            this.q = i2;
            this.r = j6;
            this.m = false;
            return this;
        }
    }

    public static final class b implements m2 {
        public static final m2.a i = new m2.a() { // from class: com.applovin.impl.go$b$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return go.b.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public Object f466a;
        public Object b;
        public int c;
        public long d;
        public long f;
        public boolean g;
        private u h = u.h;

        public long e() {
            return this.f;
        }

        public int f() {
            return this.h.f;
        }

        public int d(int i2) {
            return this.h.a(i2).a();
        }

        public int b(long j) {
            return this.h.b(j, this.d);
        }

        public long c(int i2) {
            return this.h.a(i2).g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return yp.a(this.f466a, bVar.f466a) && yp.a(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.f == bVar.f && this.g == bVar.g && yp.a(this.h, bVar.h);
        }

        public int hashCode() {
            Object obj = this.f466a;
            int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            return ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + this.h.hashCode();
        }

        private static String g(int i2) {
            return Integer.toString(i2, 36);
        }

        public long d() {
            return r2.b(this.f);
        }

        public boolean e(int i2) {
            return !this.h.a(i2).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Bundle bundle) {
            u uVar;
            int i2 = bundle.getInt(g(0), 0);
            long j = bundle.getLong(g(1), -9223372036854775807L);
            long j2 = bundle.getLong(g(2), 0L);
            boolean z = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                uVar = (u) u.j.a(bundle2);
            } else {
                uVar = u.h;
            }
            u uVar2 = uVar;
            b bVar = new b();
            bVar.a(null, null, i2, j, j2, uVar2, z);
            return bVar;
        }

        public long b(int i2) {
            return this.h.a(i2).f1045a;
        }

        public long c() {
            return this.d;
        }

        public boolean f(int i2) {
            return this.h.a(i2).h;
        }

        public int a(int i2) {
            return this.h.a(i2).b;
        }

        public long b() {
            return this.h.c;
        }

        public int b(int i2, int i3) {
            return this.h.a(i2).a(i3);
        }

        public long a(int i2, int i3) {
            u.a aVarA = this.h.a(i2);
            if (aVarA.b != -1) {
                return aVarA.f[i3];
            }
            return -9223372036854775807L;
        }

        public int a() {
            return this.h.b;
        }

        public int a(long j) {
            return this.h.a(j, this.d);
        }

        public b a(Object obj, Object obj2, int i2, long j, long j2) {
            return a(obj, obj2, i2, j, j2, u.h, false);
        }

        public b a(Object obj, Object obj2, int i2, long j, long j2, u uVar, boolean z) {
            this.f466a = obj;
            this.b = obj2;
            this.c = i2;
            this.d = j;
            this.f = j2;
            this.h = uVar;
            this.g = z;
            return this;
        }
    }

    public final boolean c() {
        return b() == 0;
    }

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        if (goVar.b() != b() || goVar.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < b(); i++) {
            if (!a(i, dVar).equals(goVar.a(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < a(); i2++) {
            if (!a(i2, bVar, true).equals(goVar.a(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iB = b() + 217;
        for (int i = 0; i < b(); i++) {
            iB = (iB * 31) + a(i, dVar).hashCode();
        }
        int iA = (iB * 31) + a();
        for (int i2 = 0; i2 < a(); i2++) {
            iA = (iA * 31) + a(i2, bVar, true).hashCode();
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static go a(Bundle bundle) {
        ab abVarA = a(d.v, l2.a(bundle, c(0)));
        ab abVarA2 = a(b.i, l2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(abVarA.size());
        }
        return new c(abVarA, abVarA2, intArray);
    }

    public static final class c extends go {
        private final ab c;
        private final ab d;
        private final int[] f;
        private final int[] g;

        public c(ab abVar, ab abVar2, int[] iArr) {
            a1.a(abVar.size() == iArr.length);
            this.c = abVar;
            this.d = abVar2;
            this.f = iArr;
            this.g = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.g[iArr[i]] = i;
            }
        }

        @Override // com.applovin.impl.go
        public int b(boolean z) {
            if (c()) {
                return -1;
            }
            if (z) {
                return this.f[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.impl.go
        public int a(boolean z) {
            if (c()) {
                return -1;
            }
            if (z) {
                return this.f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.go
        public int a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != b(z)) {
                return z ? this.f[this.g[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }

        @Override // com.applovin.impl.go
        public int b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != a(z)) {
                return z ? this.f[this.g[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return b(z);
            }
            return -1;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return this.c.size();
        }

        @Override // com.applovin.impl.go
        public Object b(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.impl.go
        public b a(int i, b bVar, boolean z) {
            b bVar2 = (b) this.d.get(i);
            bVar.a(bVar2.f466a, bVar2.b, bVar2.c, bVar2.d, bVar2.f, bVar2.h, bVar2.g);
            return bVar;
        }

        @Override // com.applovin.impl.go
        public int a() {
            return this.d.size();
        }

        @Override // com.applovin.impl.go
        public d a(int i, d dVar, long j) {
            d dVar2 = (d) this.c.get(i);
            dVar.a(dVar2.f467a, dVar2.c, dVar2.d, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.l, dVar2.n, dVar2.o, dVar2.p, dVar2.q, dVar2.r);
            dVar.m = dVar2.m;
            return dVar;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public int b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? b(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }

    private static ab a(m2.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ab.h();
        }
        ab.a aVar2 = new ab.a();
        ab abVarA = k2.a(iBinder);
        for (int i = 0; i < abVarA.size(); i++) {
            aVar2.b(aVar.a((Bundle) abVarA.get(i)));
        }
        return aVar2.a();
    }

    public final boolean b(int i, b bVar, d dVar, int i2, boolean z) {
        return a(i, bVar, dVar, i2, z) == -1;
    }

    private static int[] a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public final int a(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = a(i, bVar).c;
        if (a(i3, dVar).q != i) {
            return i + 1;
        }
        int iA = a(i3, i2, z);
        if (iA == -1) {
            return -1;
        }
        return a(iA, dVar).p;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == b(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair a(d dVar, b bVar, int i, long j) {
        return (Pair) a1.a(a(dVar, bVar, i, j, 0L));
    }

    public final Pair a(d dVar, b bVar, int i, long j, long j2) {
        a1.a(i, 0, b());
        a(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.p;
        a(i2, bVar);
        while (i2 < dVar.q && bVar.f != j) {
            int i3 = i2 + 1;
            if (a(i3, bVar).f > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, bVar, true);
        long jMin = j - bVar.f;
        long j3 = bVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(a1.a(bVar.b), Long.valueOf(Math.max(0L, jMin)));
    }

    public final d a(int i, d dVar) {
        return a(i, dVar, 0L);
    }
}
