package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d9 implements m2 {
    private static final d9 H = new b().a();
    public static final m2.a I = new m2.a() { // from class: com.applovin.impl.d9$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return d9.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;

    /* renamed from: a, reason: collision with root package name */
    public final String f355a;
    public final String b;
    public final String c;
    public final int d;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final we k;
    public final String l;
    public final String m;
    public final int n;
    public final List o;
    public final w6 p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final byte[] w;
    public final int x;
    public final p3 y;
    public final int z;

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private static String c(int i) {
        return b(12) + "_" + Integer.toString(i, 36);
    }

    public String toString() {
        return "Format(" + this.f355a + ", " + this.b + ", " + this.l + ", " + this.m + ", " + this.j + ", " + this.i + ", " + this.c + ", [" + this.r + ", " + this.s + ", " + this.t + "], [" + this.z + ", " + this.A + "])";
    }

    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;

        /* renamed from: a, reason: collision with root package name */
        private String f356a;
        private String b;
        private String c;
        private int d;
        private int e;
        private int f;
        private int g;
        private String h;
        private we i;
        private String j;
        private String k;
        private int l;
        private List m;
        private w6 n;
        private long o;
        private int p;
        private int q;
        private float r;
        private int s;
        private float t;
        private byte[] u;
        private int v;
        private p3 w;
        private int x;
        private int y;
        private int z;

        public b() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b h(int i) {
            this.f356a = Integer.toString(i);
            return this;
        }

        private b(d9 d9Var) {
            this.f356a = d9Var.f355a;
            this.b = d9Var.b;
            this.c = d9Var.c;
            this.d = d9Var.d;
            this.e = d9Var.f;
            this.f = d9Var.g;
            this.g = d9Var.h;
            this.h = d9Var.j;
            this.i = d9Var.k;
            this.j = d9Var.l;
            this.k = d9Var.m;
            this.l = d9Var.n;
            this.m = d9Var.o;
            this.n = d9Var.p;
            this.o = d9Var.q;
            this.p = d9Var.r;
            this.q = d9Var.s;
            this.r = d9Var.t;
            this.s = d9Var.u;
            this.t = d9Var.v;
            this.u = d9Var.w;
            this.v = d9Var.x;
            this.w = d9Var.y;
            this.x = d9Var.z;
            this.y = d9Var.A;
            this.z = d9Var.B;
            this.A = d9Var.C;
            this.B = d9Var.D;
            this.C = d9Var.E;
            this.D = d9Var.F;
        }

        public b o(int i) {
            this.d = i;
            return this;
        }

        public b l(int i) {
            this.e = i;
            return this;
        }

        public b b(int i) {
            this.f = i;
            return this;
        }

        public b k(int i) {
            this.g = i;
            return this;
        }

        public b i(int i) {
            this.l = i;
            return this;
        }

        public b q(int i) {
            this.p = i;
            return this;
        }

        public b g(int i) {
            this.q = i;
            return this;
        }

        public b m(int i) {
            this.s = i;
            return this;
        }

        public b p(int i) {
            this.v = i;
            return this;
        }

        public b c(int i) {
            this.x = i;
            return this;
        }

        public b n(int i) {
            this.y = i;
            return this;
        }

        public b j(int i) {
            this.z = i;
            return this;
        }

        public b e(int i) {
            this.A = i;
            return this;
        }

        public b f(int i) {
            this.B = i;
            return this;
        }

        public b a(int i) {
            this.C = i;
            return this;
        }

        public b d(int i) {
            this.D = i;
            return this;
        }

        public b b(String str) {
            this.j = str;
            return this;
        }

        public b c(String str) {
            this.f356a = str;
            return this;
        }

        public b e(String str) {
            this.c = str;
            return this;
        }

        public b d(String str) {
            this.b = str;
            return this;
        }

        public b a(String str) {
            this.h = str;
            return this;
        }

        public b f(String str) {
            this.k = str;
            return this;
        }

        public b b(float f) {
            this.t = f;
            return this;
        }

        public b a(p3 p3Var) {
            this.w = p3Var;
            return this;
        }

        public b a(w6 w6Var) {
            this.n = w6Var;
            return this;
        }

        public b a(float f) {
            this.r = f;
            return this;
        }

        public b a(List list) {
            this.m = list;
            return this;
        }

        public b a(we weVar) {
            this.i = weVar;
            return this;
        }

        public b a(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public b a(long j) {
            this.o = j;
            return this;
        }

        public d9 a() {
            return new d9(this);
        }
    }

    private d9(b bVar) {
        this.f355a = bVar.f356a;
        this.b = bVar.b;
        this.c = yp.f(bVar.c);
        this.d = bVar.d;
        this.f = bVar.e;
        int i = bVar.f;
        this.g = i;
        int i2 = bVar.g;
        this.h = i2;
        this.i = i2 != -1 ? i2 : i;
        this.j = bVar.h;
        this.k = bVar.i;
        this.l = bVar.j;
        this.m = bVar.k;
        this.n = bVar.l;
        this.o = bVar.m == null ? Collections.emptyList() : bVar.m;
        w6 w6Var = bVar.n;
        this.p = w6Var;
        this.q = bVar.o;
        this.r = bVar.p;
        this.s = bVar.q;
        this.t = bVar.r;
        this.u = bVar.s == -1 ? 0 : bVar.s;
        this.v = bVar.t == -1.0f ? 1.0f : bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.y;
        this.B = bVar.z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        if (bVar.D != 0 || w6Var == null) {
            this.F = bVar.D;
        } else {
            this.F = 1;
        }
    }

    public d9 a(int i) {
        return a().d(i).a();
    }

    public int b() {
        int i;
        int i2 = this.r;
        if (i2 == -1 || (i = this.s) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int hashCode() {
        if (this.G == 0) {
            String str = this.f355a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            we weVar = this.k;
            int iHashCode5 = (iHashCode4 + (weVar == null ? 0 : weVar.hashCode())) * 31;
            String str5 = this.l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m;
            this.G = ((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31) + Float.floatToIntBits(this.t)) * 31) + this.u) * 31) + Float.floatToIntBits(this.v)) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.class != obj.getClass()) {
            return false;
        }
        d9 d9Var = (d9) obj;
        int i2 = this.G;
        if (i2 == 0 || (i = d9Var.G) == 0 || i2 == i) {
            return this.d == d9Var.d && this.f == d9Var.f && this.g == d9Var.g && this.h == d9Var.h && this.n == d9Var.n && this.q == d9Var.q && this.r == d9Var.r && this.s == d9Var.s && this.u == d9Var.u && this.x == d9Var.x && this.z == d9Var.z && this.A == d9Var.A && this.B == d9Var.B && this.C == d9Var.C && this.D == d9Var.D && this.E == d9Var.E && this.F == d9Var.F && Float.compare(this.t, d9Var.t) == 0 && Float.compare(this.v, d9Var.v) == 0 && yp.a((Object) this.f355a, (Object) d9Var.f355a) && yp.a((Object) this.b, (Object) d9Var.b) && yp.a((Object) this.j, (Object) d9Var.j) && yp.a((Object) this.l, (Object) d9Var.l) && yp.a((Object) this.m, (Object) d9Var.m) && yp.a((Object) this.c, (Object) d9Var.c) && Arrays.equals(this.w, d9Var.w) && yp.a(this.k, d9Var.k) && yp.a(this.y, d9Var.y) && yp.a(this.p, d9Var.p) && a(d9Var);
        }
        return false;
    }

    public boolean a(d9 d9Var) {
        if (this.o.size() != d9Var.o.size()) {
            return false;
        }
        for (int i = 0; i < this.o.size(); i++) {
            if (!Arrays.equals((byte[]) this.o.get(i), (byte[]) d9Var.o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d9 a(Bundle bundle) {
        b bVar = new b();
        n2.a(bundle);
        int i = 0;
        String string = bundle.getString(b(0));
        d9 d9Var = H;
        bVar.c((String) a(string, d9Var.f355a)).d((String) a(bundle.getString(b(1)), d9Var.b)).e((String) a(bundle.getString(b(2)), d9Var.c)).o(bundle.getInt(b(3), d9Var.d)).l(bundle.getInt(b(4), d9Var.f)).b(bundle.getInt(b(5), d9Var.g)).k(bundle.getInt(b(6), d9Var.h)).a((String) a(bundle.getString(b(7)), d9Var.j)).a((we) a((we) bundle.getParcelable(b(8)), d9Var.k)).b((String) a(bundle.getString(b(9)), d9Var.l)).f((String) a(bundle.getString(b(10)), d9Var.m)).i(bundle.getInt(b(11), d9Var.n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i));
            if (byteArray == null) {
                b bVarA = bVar.a(arrayList).a((w6) bundle.getParcelable(b(13)));
                String strB = b(14);
                d9 d9Var2 = H;
                bVarA.a(bundle.getLong(strB, d9Var2.q)).q(bundle.getInt(b(15), d9Var2.r)).g(bundle.getInt(b(16), d9Var2.s)).a(bundle.getFloat(b(17), d9Var2.t)).m(bundle.getInt(b(18), d9Var2.u)).b(bundle.getFloat(b(19), d9Var2.v)).a(bundle.getByteArray(b(20))).p(bundle.getInt(b(21), d9Var2.x)).a((p3) n2.a(p3.g, bundle.getBundle(b(22)))).c(bundle.getInt(b(23), d9Var2.z)).n(bundle.getInt(b(24), d9Var2.A)).j(bundle.getInt(b(25), d9Var2.B)).e(bundle.getInt(b(26), d9Var2.C)).f(bundle.getInt(b(27), d9Var2.D)).a(bundle.getInt(b(28), d9Var2.E)).d(bundle.getInt(b(29), d9Var2.F));
                return bVar.a();
            }
            arrayList.add(byteArray);
            i++;
        }
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }
}
