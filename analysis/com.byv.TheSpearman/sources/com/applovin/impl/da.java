package com.applovin.impl;

import com.applovin.impl.ep;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class da implements o7 {
    private static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f357a;
    private ro b;
    private final wp c;
    private final yg d;
    private final tf e;
    private final boolean[] f;
    private final a g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public da() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // com.applovin.impl.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.yg r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.yg):void");
    }

    da(wp wpVar) {
        this.c = wpVar;
        this.f = new boolean[4];
        this.g = new a(128);
        if (wpVar != null) {
            this.e = new tf(Opcodes.GETSTATIC, 128);
            this.d = new yg();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    private static final class a {
        private static final byte[] e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f358a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f358a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b + i3;
                if (length < i4) {
                    this.d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean a(int i, int i2) {
            if (this.f358a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c == 0 && i == 181) {
                    this.c = i3;
                } else {
                    this.f358a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f358a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f358a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f357a = dVar.b();
        this.b = k8Var.a(dVar.c(), 2);
        wp wpVar = this.c;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        this.l = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair a(com.applovin.impl.da.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.d
            int r1 = r8.b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3c
            r7 = 3
            if (r6 == r7) goto L36
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L41
        L36:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L41
        L3c:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L41:
            float r6 = (float) r6
            float r1 = r1 / r6
        L43:
            com.applovin.impl.d9$b r6 = new com.applovin.impl.d9$b
            r6.<init>()
            com.applovin.impl.d9$b r9 = r6.c(r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.impl.d9$b r9 = r9.f(r6)
            com.applovin.impl.d9$b r9 = r9.q(r2)
            com.applovin.impl.d9$b r9 = r9.g(r4)
            com.applovin.impl.d9$b r9 = r9.b(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.impl.d9$b r9 = r9.a(r1)
            com.applovin.impl.d9 r9 = r9.a()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L98
            double[] r5 = com.applovin.impl.da.q
            int r6 = r5.length
            if (r4 >= r6) goto L98
            r1 = r5[r4]
            int r8 = r8.c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L91
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L91:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L98:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.da$a, java.lang.String):android.util.Pair");
    }

    @Override // com.applovin.impl.o7
    public void a() {
        uf.a(this.f);
        this.g.a();
        tf tfVar = this.e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
