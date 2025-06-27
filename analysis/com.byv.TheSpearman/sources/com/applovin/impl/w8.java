package com.applovin.impl;

import com.applovin.impl.dl;
import com.applovin.impl.y8;
import java.util.Arrays;

/* loaded from: classes.dex */
final class w8 extends dl {
    private y8 n;
    private a o;

    w8() {
    }

    public static boolean c(yg ygVar) {
        return ygVar.a() >= 5 && ygVar.w() == 127 && ygVar.y() == 1179402563;
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int b(yg ygVar) {
        int i = (ygVar.c()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            ygVar.g(4);
            ygVar.D();
        }
        int iB = u8.b(ygVar, i);
        ygVar.f(0);
        return iB;
    }

    private static final class a implements gg {

        /* renamed from: a, reason: collision with root package name */
        private y8 f1125a;
        private y8.a b;
        private long c = -1;
        private long d = -1;

        public a(y8 y8Var, y8.a aVar) {
            this.f1125a = y8Var;
            this.b = aVar;
        }

        public void b(long j) {
            this.c = j;
        }

        @Override // com.applovin.impl.gg
        public ej a() {
            a1.b(this.c != -1);
            return new x8(this.f1125a, this.c);
        }

        @Override // com.applovin.impl.gg
        public long a(j8 j8Var) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // com.applovin.impl.gg
        public void a(long j) {
            long[] jArr = this.b.f1197a;
            this.d = jArr[yp.b(jArr, j, true, true)];
        }
    }

    @Override // com.applovin.impl.dl
    protected long a(yg ygVar) {
        if (a(ygVar.c())) {
            return b(ygVar);
        }
        return -1L;
    }

    @Override // com.applovin.impl.dl
    protected boolean a(yg ygVar, long j, dl.b bVar) {
        byte[] bArrC = ygVar.c();
        y8 y8Var = this.n;
        if (y8Var == null) {
            y8 y8Var2 = new y8(bArrC, 17);
            this.n = y8Var2;
            bVar.f368a = y8Var2.a(Arrays.copyOfRange(bArrC, 9, ygVar.e()), (we) null);
            return true;
        }
        if ((bArrC[0] & Byte.MAX_VALUE) == 3) {
            y8.a aVarA = v8.a(ygVar);
            y8 y8VarA = y8Var.a(aVarA);
            this.n = y8VarA;
            this.o = new a(y8VarA, aVarA);
            return true;
        }
        if (!a(bArrC)) {
            return true;
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.b(j);
            bVar.b = this.o;
        }
        a1.a(bVar.f368a);
        return false;
    }

    @Override // com.applovin.impl.dl
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
