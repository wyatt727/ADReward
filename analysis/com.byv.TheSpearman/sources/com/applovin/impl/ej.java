package com.applovin.impl;

import com.json.t2;

/* loaded from: classes.dex */
public interface ej {
    a b(long j);

    boolean b();

    long d();

    public static class b implements ej {

        /* renamed from: a, reason: collision with root package name */
        private final long f390a;
        private final a b;

        @Override // com.applovin.impl.ej
        public boolean b() {
            return false;
        }

        public b(long j) {
            this(j, 0L);
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.f390a;
        }

        @Override // com.applovin.impl.ej
        public a b(long j) {
            return this.b;
        }

        public b(long j, long j2) {
            this.f390a = j;
            this.b = new a(j2 == 0 ? gj.c : new gj(0L, j2));
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final gj f389a;
        public final gj b;

        public a(gj gjVar) {
            this(gjVar, gjVar);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(t2.i.d);
            sb.append(this.f389a);
            if (this.f389a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append(t2.i.e);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f389a.equals(aVar.f389a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.f389a.hashCode() * 31) + this.b.hashCode();
        }

        public a(gj gjVar, gj gjVar2) {
            this.f389a = (gj) a1.a(gjVar);
            this.b = (gj) a1.a(gjVar2);
        }
    }
}
