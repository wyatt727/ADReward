package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.m2;
import com.applovin.impl.od;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class od implements m2 {
    public static final od g = new c().a();
    public static final m2.a h = new m2.a() { // from class: com.applovin.impl.od$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return od.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f743a;
    public final g b;
    public final f c;
    public final qd d;
    public final d f;

    public static final class b {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f744a;
        private Uri b;
        private String c;
        private long d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private e.a i;
        private List j;
        private String k;
        private List l;
        private Object m;
        private qd n;
        private f.a o;

        public c() {
            this.e = Long.MIN_VALUE;
            this.i = new e.a();
            this.j = Collections.emptyList();
            this.l = Collections.emptyList();
            this.o = new f.a();
        }

        public c b(String str) {
            this.f744a = (String) a1.a((Object) str);
            return this;
        }

        private c(od odVar) {
            e.a aVar;
            this();
            d dVar = odVar.f;
            this.e = dVar.b;
            this.f = dVar.c;
            this.g = dVar.d;
            this.d = dVar.f745a;
            this.h = dVar.f;
            this.f744a = odVar.f743a;
            this.n = odVar.d;
            this.o = odVar.c.a();
            g gVar = odVar.b;
            if (gVar != null) {
                this.k = gVar.e;
                this.c = gVar.b;
                this.b = gVar.f750a;
                this.j = gVar.d;
                this.l = gVar.f;
                this.m = gVar.g;
                e eVar = gVar.c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new e.a();
                }
                this.i = aVar;
            }
        }

        public od a() {
            g gVar;
            a1.b(this.i.b == null || this.i.f747a != null);
            Uri uri = this.b;
            if (uri != null) {
                gVar = new g(uri, this.c, this.i.f747a != null ? this.i.a() : null, null, this.j, this.k, this.l, this.m);
            } else {
                gVar = null;
            }
            String str = this.f744a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            d dVar = new d(this.d, this.e, this.f, this.g, this.h);
            f fVarA = this.o.a();
            qd qdVar = this.n;
            if (qdVar == null) {
                qdVar = qd.H;
            }
            return new od(str2, dVar, gVar, fVarA, qdVar);
        }

        public c a(String str) {
            this.k = str;
            return this;
        }

        public c a(Object obj) {
            this.m = obj;
            return this;
        }

        public c a(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f746a;
        public final Uri b;
        public final cb c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final ab g;
        private final byte[] h;

        public a a() {
            return new a();
        }

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f747a;
            private Uri b;
            private cb c;
            private boolean d;
            private boolean e;
            private boolean f;
            private ab g;
            private byte[] h;

            public e a() {
                return new e(this);
            }

            private a() {
                this.c = cb.h();
                this.g = ab.h();
            }

            private a(e eVar) {
                this.f747a = eVar.f746a;
                this.b = eVar.b;
                this.c = eVar.c;
                this.d = eVar.d;
                this.e = eVar.e;
                this.f = eVar.f;
                this.g = eVar.g;
                this.h = eVar.h;
            }
        }

        private e(a aVar) {
            a1.b((aVar.f && aVar.b == null) ? false : true);
            this.f746a = (UUID) a1.a(aVar.f747a);
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.f = aVar.f;
            this.e = aVar.e;
            this.g = aVar.g;
            this.h = aVar.h != null ? Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f746a.equals(eVar.f746a) && yp.a(this.b, eVar.b) && yp.a(this.c, eVar.c) && this.d == eVar.d && this.f == eVar.f && this.e == eVar.e && this.g.equals(eVar.g) && Arrays.equals(this.h, eVar.h);
        }

        public int hashCode() {
            int iHashCode = this.f746a.hashCode() * 31;
            Uri uri = this.b;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f750a;
        public final String b;
        public final e c;
        public final List d;
        public final String e;
        public final List f;
        public final Object g;

        private g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj) {
            this.f750a = uri;
            this.b = str;
            this.c = eVar;
            this.d = list;
            this.e = str2;
            this.f = list2;
            this.g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f750a.equals(gVar.f750a) && yp.a((Object) this.b, (Object) gVar.b) && yp.a(this.c, gVar.c) && yp.a((Object) null, (Object) null) && this.d.equals(gVar.d) && yp.a((Object) this.e, (Object) gVar.e) && this.f.equals(gVar.f) && yp.a(this.g, gVar.g);
        }

        public int hashCode() {
            int iHashCode = this.f750a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.c;
            int iHashCode3 = (((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 961) + this.d.hashCode()) * 31;
            String str2 = this.e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f.hashCode()) * 31;
            Object obj = this.g;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class f implements m2 {
        public static final f g = new a().a();
        public static final m2.a h = new m2.a() { // from class: com.applovin.impl.od$f$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return od.f.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f748a;
        public final long b;
        public final long c;
        public final float d;
        public final float f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f749a;
            private long b;
            private long c;
            private float d;
            private float e;

            public f a() {
                return new f(this);
            }

            public a() {
                this.f749a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(f fVar) {
                this.f749a = fVar.f748a;
                this.b = fVar.b;
                this.c = fVar.c;
                this.d = fVar.d;
                this.e = fVar.f;
            }
        }

        public f(long j, long j2, long j3, float f, float f2) {
            this.f748a = j;
            this.b = j2;
            this.c = j3;
            this.d = f;
            this.f = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f748a == fVar.f748a && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.f == fVar.f;
        }

        public int hashCode() {
            long j = this.f748a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public a a() {
            return new a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ f a(Bundle bundle) {
            return new f(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private f(a aVar) {
            this(aVar.f749a, aVar.b, aVar.c, aVar.d, aVar.e);
        }
    }

    public static final class d implements m2 {
        public static final m2.a g = new m2.a() { // from class: com.applovin.impl.od$d$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return od.d.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f745a;
        public final long b;
        public final boolean c;
        public final boolean d;
        public final boolean f;

        private d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f745a = j;
            this.b = j2;
            this.c = z;
            this.d = z2;
            this.f = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f745a == dVar.f745a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.f == dVar.f;
        }

        public int hashCode() {
            long j = this.f745a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d a(Bundle bundle) {
            return new d(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }
    }

    private od(String str, d dVar, g gVar, f fVar, qd qdVar) {
        this.f743a = str;
        this.b = gVar;
        this.c = fVar;
        this.d = qdVar;
        this.f = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return yp.a((Object) this.f743a, (Object) odVar.f743a) && this.f.equals(odVar.f) && yp.a(this.b, odVar.b) && yp.a(this.c, odVar.c) && yp.a(this.d, odVar.d);
    }

    public int hashCode() {
        int iHashCode = this.f743a.hashCode() * 31;
        g gVar = this.b;
        return ((((((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static od a(Bundle bundle) {
        f fVar;
        qd qdVar;
        d dVar;
        String str = (String) a1.a((Object) bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fVar = f.g;
        } else {
            fVar = (f) f.h.a(bundle2);
        }
        f fVar2 = fVar;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            qdVar = qd.H;
        } else {
            qdVar = (qd) qd.I.a(bundle3);
        }
        qd qdVar2 = qdVar;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            dVar = new d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (d) d.g.a(bundle4);
        }
        return new od(str, dVar, null, fVar2, qdVar2);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static od a(Uri uri) {
        return new c().a(uri).a();
    }

    public c a() {
        return new c();
    }
}
