package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.nh;
import com.applovin.impl.wd;
import java.io.IOException;

/* loaded from: classes.dex */
public interface s0 {
    void a(nh nhVar, b bVar);

    void a(a aVar);

    void a(a aVar, float f);

    void a(a aVar, int i);

    void a(a aVar, int i, int i2);

    void a(a aVar, int i, int i2, int i3, float f);

    void a(a aVar, int i, long j);

    void a(a aVar, int i, long j, long j2);

    void a(a aVar, int i, d9 d9Var);

    void a(a aVar, int i, l5 l5Var);

    void a(a aVar, int i, String str, long j);

    void a(a aVar, long j);

    void a(a aVar, long j, int i);

    void a(a aVar, d9 d9Var);

    void a(a aVar, d9 d9Var, o5 o5Var);

    void a(a aVar, ic icVar, pd pdVar);

    void a(a aVar, ic icVar, pd pdVar, IOException iOException, boolean z);

    void a(a aVar, kh khVar);

    void a(a aVar, l5 l5Var);

    void a(a aVar, mh mhVar);

    void a(a aVar, nh.b bVar);

    void a(a aVar, nh.f fVar, nh.f fVar2, int i);

    void a(a aVar, od odVar, int i);

    void a(a aVar, pd pdVar);

    void a(a aVar, qd qdVar);

    void a(a aVar, qo qoVar, uo uoVar);

    void a(a aVar, we weVar);

    void a(a aVar, yq yqVar);

    void a(a aVar, Exception exc);

    void a(a aVar, Object obj, long j);

    void a(a aVar, String str);

    void a(a aVar, String str, long j);

    void a(a aVar, String str, long j, long j2);

    void a(a aVar, boolean z);

    void a(a aVar, boolean z, int i);

    void b(a aVar);

    void b(a aVar, int i);

    void b(a aVar, int i, long j, long j2);

    void b(a aVar, int i, l5 l5Var);

    void b(a aVar, d9 d9Var);

    void b(a aVar, d9 d9Var, o5 o5Var);

    void b(a aVar, ic icVar, pd pdVar);

    void b(a aVar, l5 l5Var);

    void b(a aVar, Exception exc);

    void b(a aVar, String str);

    void b(a aVar, String str, long j);

    void b(a aVar, String str, long j, long j2);

    void b(a aVar, boolean z);

    void b(a aVar, boolean z, int i);

    void c(a aVar);

    void c(a aVar, int i);

    void c(a aVar, ic icVar, pd pdVar);

    void c(a aVar, l5 l5Var);

    void c(a aVar, Exception exc);

    void c(a aVar, boolean z);

    void d(a aVar);

    void d(a aVar, int i);

    void d(a aVar, l5 l5Var);

    void d(a aVar, Exception exc);

    void d(a aVar, boolean z);

    void e(a aVar);

    void e(a aVar, int i);

    void e(a aVar, boolean z);

    void f(a aVar);

    void f(a aVar, int i);

    void g(a aVar);

    void h(a aVar);

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final z8 f872a;
        private final SparseArray b;

        public b(z8 z8Var, SparseArray sparseArray) {
            this.f872a = z8Var;
            SparseArray sparseArray2 = new SparseArray(z8Var.a());
            for (int i = 0; i < z8Var.a(); i++) {
                int iB = z8Var.b(i);
                sparseArray2.append(iB, (a) a1.a((a) sparseArray.get(iB)));
            }
            this.b = sparseArray2;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f871a;
        public final go b;
        public final int c;
        public final wd.a d;
        public final long e;
        public final go f;
        public final int g;
        public final wd.a h;
        public final long i;
        public final long j;

        public a(long j, go goVar, int i, wd.a aVar, long j2, go goVar2, int i2, wd.a aVar2, long j3, long j4) {
            this.f871a = j;
            this.b = goVar;
            this.c = i;
            this.d = aVar;
            this.e = j2;
            this.f = goVar2;
            this.g = i2;
            this.h = aVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f871a == aVar.f871a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equal(this.b, aVar.b) && Objects.equal(this.d, aVar.d) && Objects.equal(this.f, aVar.f) && Objects.equal(this.h, aVar.h);
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f871a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }
}
