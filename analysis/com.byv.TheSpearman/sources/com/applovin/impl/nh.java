package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;
import com.applovin.impl.nh;
import com.applovin.impl.z8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface nh {

    public interface c {

        /* renamed from: com.applovin.impl.nh$c$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(c _this, int i) {
            }

            public static void $default$a(c _this, go goVar, int i) {
            }

            public static void $default$a(c _this, kh khVar) {
            }

            public static void $default$a(c _this, mh mhVar) {
            }

            public static void $default$a(c _this, b bVar) {
            }

            public static void $default$a(c _this, f fVar, f fVar2, int i) {
            }

            public static void $default$a(c _this, nh nhVar, d dVar) {
            }

            public static void $default$a(c _this, od odVar, int i) {
            }

            public static void $default$a(c _this, qd qdVar) {
            }

            public static void $default$a(c _this, qo qoVar, uo uoVar) {
            }

            public static void $default$a(c _this, boolean z, int i) {
            }

            public static void $default$b(c _this) {
            }

            public static void $default$b(c _this, kh khVar) {
            }

            public static void $default$b(c _this, boolean z) {
            }

            public static void $default$b(c _this, boolean z, int i) {
            }

            public static void $default$c(c _this, int i) {
            }

            public static void $default$c(c _this, boolean z) {
            }

            public static void $default$d(c _this, boolean z) {
            }

            public static void $default$e(c _this, int i) {
            }

            public static void $default$e(c _this, boolean z) {
            }
        }

        void a(int i);

        void a(go goVar, int i);

        void a(kh khVar);

        void a(mh mhVar);

        void a(b bVar);

        void a(f fVar, f fVar2, int i);

        void a(nh nhVar, d dVar);

        void a(od odVar, int i);

        void a(qd qdVar);

        void a(qo qoVar, uo uoVar);

        void a(boolean z, int i);

        void b();

        void b(int i);

        void b(kh khVar);

        void b(boolean z);

        void b(boolean z, int i);

        void c(int i);

        void c(boolean z);

        void d(boolean z);

        void e(int i);

        void e(boolean z);
    }

    public interface e extends c {

        /* renamed from: com.applovin.impl.nh$e$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(e _this) {
            }

            public static void $default$a(e _this, float f) {
            }

            public static void $default$a(e _this, int i) {
            }

            public static void $default$a(e _this, int i, int i2) {
            }

            public static void $default$a(e _this, go goVar, int i) {
            }

            public static void $default$a(e _this, kh khVar) {
            }

            public static void $default$a(e _this, mh mhVar) {
            }

            public static void $default$a(e _this, b bVar) {
            }

            public static void $default$a(e _this, f fVar, f fVar2, int i) {
            }

            public static void $default$a(e _this, nh nhVar, d dVar) {
            }

            public static void $default$a(e _this, od odVar, int i) {
            }

            public static void $default$a(e _this, p6 p6Var) {
            }

            public static void $default$a(e _this, qd qdVar) {
            }

            public static void $default$a(e _this, qo qoVar, uo uoVar) {
            }

            public static void $default$a(e _this, we weVar) {
            }

            public static void $default$a(e _this, yq yqVar) {
            }

            public static void $default$a(e _this, List list) {
            }

            public static void $default$a(e _this, boolean z) {
            }

            public static void $default$a(e _this, boolean z, int i) {
            }

            public static void $default$b(e _this, int i) {
            }

            public static void $default$b(e _this, int i, boolean z) {
            }

            public static void $default$b(e _this, kh khVar) {
            }

            public static void $default$b(e _this, boolean z) {
            }

            public static void $default$c(e _this, int i) {
            }

            public static void $default$c(e _this, boolean z) {
            }

            public static void $default$d(e _this, boolean z) {
            }
        }

        void a();

        void a(float f);

        @Override // com.applovin.impl.nh.c
        void a(int i);

        void a(int i, int i2);

        @Override // com.applovin.impl.nh.c
        void a(go goVar, int i);

        @Override // com.applovin.impl.nh.c
        void a(kh khVar);

        @Override // com.applovin.impl.nh.c
        void a(mh mhVar);

        @Override // com.applovin.impl.nh.c
        void a(b bVar);

        @Override // com.applovin.impl.nh.c
        void a(f fVar, f fVar2, int i);

        @Override // com.applovin.impl.nh.c
        void a(nh nhVar, d dVar);

        @Override // com.applovin.impl.nh.c
        void a(od odVar, int i);

        void a(p6 p6Var);

        @Override // com.applovin.impl.nh.c
        void a(qd qdVar);

        @Override // com.applovin.impl.nh.c
        void a(qo qoVar, uo uoVar);

        void a(we weVar);

        void a(yq yqVar);

        void a(List list);

        void a(boolean z);

        @Override // com.applovin.impl.nh.c
        void a(boolean z, int i);

        @Override // com.applovin.impl.nh.c
        void b(int i);

        void b(int i, boolean z);

        @Override // com.applovin.impl.nh.c
        void b(kh khVar);

        @Override // com.applovin.impl.nh.c
        void b(boolean z);

        @Override // com.applovin.impl.nh.c
        void c(int i);

        @Override // com.applovin.impl.nh.c
        void c(boolean z);

        @Override // com.applovin.impl.nh.c
        void d(boolean z);
    }

    uo A();

    void B();

    qd C();

    void D();

    int E();

    long F();

    mh a();

    void a(int i);

    void a(int i, long j);

    void a(long j);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(e eVar);

    void a(boolean z);

    void b();

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(e eVar);

    void b(boolean z);

    boolean b(int i);

    kh c();

    boolean d();

    long e();

    int f();

    long g();

    long getCurrentPosition();

    long getDuration();

    long h();

    b i();

    boolean isPlaying();

    int j();

    qo k();

    boolean l();

    int m();

    go n();

    int o();

    Looper p();

    long q();

    boolean r();

    long s();

    int t();

    void u();

    int v();

    void w();

    List x();

    boolean y();

    yq z();

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final z8 f720a;

        public d(z8 z8Var) {
            this.f720a = z8Var;
        }

        public boolean a(int i) {
            return this.f720a.a(i);
        }

        public int hashCode() {
            return this.f720a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f720a.equals(((d) obj).f720a);
            }
            return false;
        }

        public boolean a(int... iArr) {
            return this.f720a.a(iArr);
        }
    }

    public static final class f implements m2 {
        public static final m2.a k = new m2.a() { // from class: com.applovin.impl.nh$f$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return nh.f.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Object f721a;
        public final int b;
        public final od c;
        public final Object d;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public f(Object obj, int i, od odVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f721a = obj;
            this.b = i;
            this.c = odVar;
            this.d = obj2;
            this.f = i2;
            this.g = j;
            this.h = j2;
            this.i = i3;
            this.j = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i && this.j == fVar.j && Objects.equal(this.f721a, fVar.f721a) && Objects.equal(this.d, fVar.d) && Objects.equal(this.c, fVar.c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f721a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.f), Integer.valueOf(this.b), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static f a(Bundle bundle) {
            return new f(null, bundle.getInt(a(0), -1), (od) n2.a(od.h, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }

    public static final class b implements m2 {
        public static final b b = new a().a();
        public static final m2.a c = new m2.a() { // from class: com.applovin.impl.nh$b$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return nh.b.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final z8 f718a;

        public static final class a {
            private static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: a, reason: collision with root package name */
            private final z8.b f719a = new z8.b();

            public a a(int i) {
                this.f719a.a(i);
                return this;
            }

            public a a(b bVar) {
                this.f719a.a(bVar.f718a);
                return this;
            }

            public a a(int... iArr) {
                this.f719a.a(iArr);
                return this;
            }

            public a a(int i, boolean z) {
                this.f719a.a(i, z);
                return this;
            }

            public b a() {
                return new b(this.f719a.a());
            }
        }

        private b(z8 z8Var) {
            this.f718a = z8Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f718a.equals(((b) obj).f718a);
            }
            return false;
        }

        public int hashCode() {
            return this.f718a.hashCode();
        }

        private static String b(int i) {
            return Integer.toString(i, 36);
        }

        public boolean a(int i) {
            return this.f718a.a(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.a(integerArrayList.get(i).intValue());
            }
            return aVar.a();
        }
    }
}
