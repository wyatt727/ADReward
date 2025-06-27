package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class qd implements m2 {
    public static final qd H = new b().a();
    public static final m2.a I = new m2.a() { // from class: com.applovin.impl.qd$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return qd.a(bundle);
        }
    };
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f833a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final Uri i;
    public final gi j;
    public final gi k;
    public final byte[] l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    public static final class b {
        private Integer A;
        private Integer B;
        private CharSequence C;
        private CharSequence D;
        private Bundle E;

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f834a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private Uri h;
        private gi i;
        private gi j;
        private byte[] k;
        private Integer l;
        private Uri m;
        private Integer n;
        private Integer o;
        private Integer p;
        private Boolean q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;
        private Integer v;
        private Integer w;
        private CharSequence x;
        private CharSequence y;
        private CharSequence z;

        public b() {
        }

        private b(qd qdVar) {
            this.f834a = qdVar.f833a;
            this.b = qdVar.b;
            this.c = qdVar.c;
            this.d = qdVar.d;
            this.e = qdVar.f;
            this.f = qdVar.g;
            this.g = qdVar.h;
            this.h = qdVar.i;
            this.i = qdVar.j;
            this.j = qdVar.k;
            this.k = qdVar.l;
            this.l = qdVar.m;
            this.m = qdVar.n;
            this.n = qdVar.o;
            this.o = qdVar.p;
            this.p = qdVar.q;
            this.q = qdVar.r;
            this.r = qdVar.t;
            this.s = qdVar.u;
            this.t = qdVar.v;
            this.u = qdVar.w;
            this.v = qdVar.x;
            this.w = qdVar.y;
            this.x = qdVar.z;
            this.y = qdVar.A;
            this.z = qdVar.B;
            this.A = qdVar.C;
            this.B = qdVar.D;
            this.C = qdVar.E;
            this.D = qdVar.F;
            this.E = qdVar.G;
        }

        public b k(CharSequence charSequence) {
            this.f834a = charSequence;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public b b(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public b g(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public b a(byte[] bArr, int i) {
            if (this.k == null || yp.a((Object) Integer.valueOf(i), (Object) 3) || !yp.a((Object) this.l, (Object) 3)) {
                this.k = (byte[]) bArr.clone();
                this.l = Integer.valueOf(i);
            }
            return this;
        }

        public b l(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.z = charSequence;
            return this;
        }

        public b k(Integer num) {
            this.n = num;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b d(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b b(Integer num) {
            this.p = num;
            return this;
        }

        public b j(Integer num) {
            this.o = num;
            return this;
        }

        public b c(Integer num) {
            this.t = num;
            return this;
        }

        public b h(Integer num) {
            this.u = num;
            return this;
        }

        public b g(Integer num) {
            this.v = num;
            return this;
        }

        public b b(Uri uri) {
            this.h = uri;
            return this;
        }

        public b e(Integer num) {
            this.r = num;
            return this;
        }

        public b a(we weVar) {
            for (int i = 0; i < weVar.c(); i++) {
                weVar.a(i).a(this);
            }
            return this;
        }

        public b d(Integer num) {
            this.s = num;
            return this;
        }

        public b f(Integer num) {
            this.w = num;
            return this;
        }

        public b i(Integer num) {
            this.B = num;
            return this;
        }

        public b b(gi giVar) {
            this.i = giVar;
            return this;
        }

        public b a(List list) {
            for (int i = 0; i < list.size(); i++) {
                we weVar = (we) list.get(i);
                for (int i2 = 0; i2 < weVar.c(); i2++) {
                    weVar.a(i2).a(this);
                }
            }
            return this;
        }

        public b a(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b a(byte[] bArr, Integer num) {
            this.k = bArr == null ? null : (byte[]) bArr.clone();
            this.l = num;
            return this;
        }

        public b a(Uri uri) {
            this.m = uri;
            return this;
        }

        public b a(Integer num) {
            this.A = num;
            return this;
        }

        public b a(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public b a(Boolean bool) {
            this.q = bool;
            return this;
        }

        public b a(gi giVar) {
            this.j = giVar;
            return this;
        }

        public qd a() {
            return new qd(this);
        }
    }

    private qd(b bVar) {
        this.f833a = bVar.f834a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        this.n = bVar.m;
        this.o = bVar.n;
        this.p = bVar.o;
        this.q = bVar.p;
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.r;
        this.u = bVar.s;
        this.v = bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.y;
        this.B = bVar.z;
        this.C = bVar.A;
        this.D = bVar.B;
        this.E = bVar.C;
        this.F = bVar.D;
        this.G = bVar.E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qd.class != obj.getClass()) {
            return false;
        }
        qd qdVar = (qd) obj;
        return yp.a(this.f833a, qdVar.f833a) && yp.a(this.b, qdVar.b) && yp.a(this.c, qdVar.c) && yp.a(this.d, qdVar.d) && yp.a(this.f, qdVar.f) && yp.a(this.g, qdVar.g) && yp.a(this.h, qdVar.h) && yp.a(this.i, qdVar.i) && yp.a(this.j, qdVar.j) && yp.a(this.k, qdVar.k) && Arrays.equals(this.l, qdVar.l) && yp.a(this.m, qdVar.m) && yp.a(this.n, qdVar.n) && yp.a(this.o, qdVar.o) && yp.a(this.p, qdVar.p) && yp.a(this.q, qdVar.q) && yp.a(this.r, qdVar.r) && yp.a(this.t, qdVar.t) && yp.a(this.u, qdVar.u) && yp.a(this.v, qdVar.v) && yp.a(this.w, qdVar.w) && yp.a(this.x, qdVar.x) && yp.a(this.y, qdVar.y) && yp.a(this.z, qdVar.z) && yp.a(this.A, qdVar.A) && yp.a(this.B, qdVar.B) && yp.a(this.C, qdVar.C) && yp.a(this.D, qdVar.D) && yp.a(this.E, qdVar.E) && yp.a(this.F, qdVar.F);
    }

    public int hashCode() {
        return Objects.hashCode(this.f833a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qd a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.k(bundle.getCharSequence(a(0))).c(bundle.getCharSequence(a(1))).b(bundle.getCharSequence(a(2))).a(bundle.getCharSequence(a(3))).h(bundle.getCharSequence(a(4))).j(bundle.getCharSequence(a(5))).g(bundle.getCharSequence(a(6))).b((Uri) bundle.getParcelable(a(7))).a(bundle.getByteArray(a(10)), bundle.containsKey(a(29)) ? Integer.valueOf(bundle.getInt(a(29))) : null).a((Uri) bundle.getParcelable(a(11))).l(bundle.getCharSequence(a(22))).e(bundle.getCharSequence(a(23))).f(bundle.getCharSequence(a(24))).i(bundle.getCharSequence(a(27))).d(bundle.getCharSequence(a(28))).a(bundle.getBundle(a(1000)));
        if (bundle.containsKey(a(8)) && (bundle3 = bundle.getBundle(a(8))) != null) {
            bVar.b((gi) gi.f461a.a(bundle3));
        }
        if (bundle.containsKey(a(9)) && (bundle2 = bundle.getBundle(a(9))) != null) {
            bVar.a((gi) gi.f461a.a(bundle2));
        }
        if (bundle.containsKey(a(12))) {
            bVar.k(Integer.valueOf(bundle.getInt(a(12))));
        }
        if (bundle.containsKey(a(13))) {
            bVar.j(Integer.valueOf(bundle.getInt(a(13))));
        }
        if (bundle.containsKey(a(14))) {
            bVar.b(Integer.valueOf(bundle.getInt(a(14))));
        }
        if (bundle.containsKey(a(15))) {
            bVar.a(Boolean.valueOf(bundle.getBoolean(a(15))));
        }
        if (bundle.containsKey(a(16))) {
            bVar.e(Integer.valueOf(bundle.getInt(a(16))));
        }
        if (bundle.containsKey(a(17))) {
            bVar.d(Integer.valueOf(bundle.getInt(a(17))));
        }
        if (bundle.containsKey(a(18))) {
            bVar.c(Integer.valueOf(bundle.getInt(a(18))));
        }
        if (bundle.containsKey(a(19))) {
            bVar.h(Integer.valueOf(bundle.getInt(a(19))));
        }
        if (bundle.containsKey(a(20))) {
            bVar.g(Integer.valueOf(bundle.getInt(a(20))));
        }
        if (bundle.containsKey(a(21))) {
            bVar.f(Integer.valueOf(bundle.getInt(a(21))));
        }
        if (bundle.containsKey(a(25))) {
            bVar.a(Integer.valueOf(bundle.getInt(a(25))));
        }
        if (bundle.containsKey(a(26))) {
            bVar.i(Integer.valueOf(bundle.getInt(a(26))));
        }
        return bVar.a();
    }
}
