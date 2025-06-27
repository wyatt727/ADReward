package com.applovin.impl;

import com.applovin.impl.h2;
import com.applovin.impl.u8;
import java.util.Objects;

/* loaded from: classes.dex */
final class s8 extends h2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(final y8 y8Var, int i, long j, long j2) {
        super(new h2.d() { // from class: com.applovin.impl.s8$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.h2.d
            public final long a(long j3) {
                return y8Var.a(j3);
            }
        }, new b(y8Var, i), y8Var.b(), 0L, y8Var.j, j, j2, y8Var.a(), Math.max(6, y8Var.c));
        Objects.requireNonNull(y8Var);
    }

    private static final class b implements h2.f {

        /* renamed from: a, reason: collision with root package name */
        private final y8 f880a;
        private final int b;
        private final u8.a c;

        @Override // com.applovin.impl.h2.f
        public /* synthetic */ void a() {
            h2.f.CC.$default$a(this);
        }

        private b(y8 y8Var, int i) {
            this.f880a = y8Var;
            this.b = i;
            this.c = new u8.a();
        }

        private long a(j8 j8Var) {
            while (j8Var.d() < j8Var.a() - 6 && !u8.a(j8Var, this.f880a, this.b, this.c)) {
                j8Var.c(1);
            }
            if (j8Var.d() >= j8Var.a() - 6) {
                j8Var.c((int) (j8Var.a() - j8Var.d()));
                return this.f880a.j;
            }
            return this.c.f1059a;
        }

        @Override // com.applovin.impl.h2.f
        public h2.e a(j8 j8Var, long j) {
            long jF = j8Var.f();
            long jA = a(j8Var);
            long jD = j8Var.d();
            j8Var.c(Math.max(6, this.f880a.c));
            long jA2 = a(j8Var);
            long jD2 = j8Var.d();
            if (jA <= j && jA2 > j) {
                return h2.e.a(jD);
            }
            if (jA2 <= j) {
                return h2.e.b(jA2, jD2);
            }
            return h2.e.a(jA, jF);
        }
    }
}
