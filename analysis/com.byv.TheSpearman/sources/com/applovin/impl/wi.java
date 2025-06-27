package com.applovin.impl;

import com.applovin.impl.ro;
import com.applovin.impl.xi;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
class wi {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f1131a;
    private final int b;
    private final yg c;
    private a d;
    private a e;
    private a f;
    private long g;

    public wi(n0 n0Var) {
        this.f1131a = n0Var;
        int iC = n0Var.c();
        this.b = iC;
        this.c = new yg(32);
        a aVar = new a(0L, iC);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public void c() {
        this.e = this.d;
    }

    private void a(a aVar) {
        if (aVar.c) {
            a aVar2 = this.f;
            boolean z = aVar2.c;
            int i = (z ? 1 : 0) + (((int) (aVar2.f1132a - aVar.f1132a)) / this.b);
            m0[] m0VarArr = new m0[i];
            for (int i2 = 0; i2 < i; i2++) {
                m0VarArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.f1131a.a(m0VarArr);
        }
    }

    private int b(int i) {
        a aVar = this.f;
        if (!aVar.c) {
            aVar.a(this.f1131a.b(), new a(this.f.b, this.b));
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    public void a(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            this.f1131a.a(aVar.d);
            this.d = this.d.a();
        }
        if (this.e.f1132a < aVar.f1132a) {
            this.e = aVar;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1132a;
        public final long b;
        public boolean c;
        public m0 d;
        public a e;

        public a(long j, int i) {
            this.f1132a = j;
            this.b = j + i;
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void a(m0 m0Var, a aVar) {
            this.d = m0Var;
            this.e = aVar;
            this.c = true;
        }

        public int a(long j) {
            return ((int) (j - this.f1132a)) + this.d.b;
        }
    }

    private static a b(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        if (n5Var.h()) {
            aVar = a(aVar, n5Var, bVar, ygVar);
        }
        if (n5Var.c()) {
            ygVar.d(4);
            a aVarA = a(aVar, bVar.b, ygVar.c(), 4);
            int iA = ygVar.A();
            bVar.b += 4;
            bVar.f1176a -= 4;
            n5Var.g(iA);
            a aVarA2 = a(aVarA, bVar.b, n5Var.c, iA);
            bVar.b += iA;
            int i = bVar.f1176a - iA;
            bVar.f1176a = i;
            n5Var.h(i);
            return a(aVarA2, bVar.b, n5Var.g, bVar.f1176a);
        }
        n5Var.g(bVar.f1176a);
        return a(aVar, bVar.b, n5Var.c, bVar.f1176a);
    }

    public void b(n5 n5Var, xi.b bVar) {
        this.e = b(this.e, n5Var, bVar, this.c);
    }

    public void b() {
        a(this.d);
        a aVar = new a(0L, this.b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.f1131a.a();
    }

    private static a a(a aVar, long j) {
        while (j >= aVar.b) {
            aVar = aVar.e;
        }
        return aVar;
    }

    public long a() {
        return this.g;
    }

    public void a(n5 n5Var, xi.b bVar) {
        b(this.e, n5Var, bVar, this.c);
    }

    private void a(int i) {
        long j = this.g + i;
        this.g = j;
        a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.e;
        }
    }

    private static a a(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a aVarA = a(aVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVarA.b - j));
            byteBuffer.put(aVarA.d.f636a, aVarA.a(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == aVarA.b) {
                aVarA = aVarA.e;
            }
        }
        return aVarA;
    }

    private static a a(a aVar, long j, byte[] bArr, int i) {
        a aVarA = a(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVarA.b - j));
            System.arraycopy(aVarA.d.f636a, aVarA.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == aVarA.b) {
                aVarA = aVarA.e;
            }
        }
        return aVarA;
    }

    private static a a(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        long j = bVar.b;
        int iC = 1;
        ygVar.d(1);
        a aVarA = a(aVar, j, ygVar.c(), 1);
        long j2 = j + 1;
        byte b = ygVar.c()[0];
        boolean z = (b & 128) != 0;
        int i = b & Byte.MAX_VALUE;
        y4 y4Var = n5Var.b;
        byte[] bArr = y4Var.f1190a;
        if (bArr == null) {
            y4Var.f1190a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarA2 = a(aVarA, j2, y4Var.f1190a, i);
        long j3 = j2 + i;
        if (z) {
            ygVar.d(2);
            aVarA2 = a(aVarA2, j3, ygVar.c(), 2);
            j3 += 2;
            iC = ygVar.C();
        }
        int i2 = iC;
        int[] iArr = y4Var.d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = y4Var.e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            ygVar.d(i3);
            aVarA2 = a(aVarA2, j3, ygVar.c(), i3);
            j3 += i3;
            ygVar.f(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = ygVar.C();
                iArr4[i4] = ygVar.A();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f1176a - ((int) (j3 - bVar.b));
        }
        ro.a aVar2 = (ro.a) yp.a(bVar.c);
        y4Var.a(i2, iArr2, iArr4, aVar2.b, y4Var.f1190a, aVar2.f867a, aVar2.c, aVar2.d);
        long j4 = bVar.b;
        int i5 = (int) (j3 - j4);
        bVar.b = j4 + i5;
        bVar.f1176a -= i5;
        return aVarA2;
    }

    public int a(e5 e5Var, int i, boolean z) throws EOFException {
        int iB = b(i);
        a aVar = this.f;
        int iA = e5Var.a(aVar.d.f636a, aVar.a(this.g), iB);
        if (iA != -1) {
            a(iA);
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(yg ygVar, int i) {
        while (i > 0) {
            int iB = b(i);
            a aVar = this.f;
            ygVar.a(aVar.d.f636a, aVar.a(this.g), iB);
            i -= iB;
            a(iB);
        }
    }
}
