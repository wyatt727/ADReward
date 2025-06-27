package com.applovin.impl;

import android.net.Uri;
import android.util.Pair;
import com.applovin.impl.d9;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class mr implements i8 {
    public static final m8 f = new m8() { // from class: com.applovin.impl.mr$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return mr.c();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private k8 f700a;
    private ro b;
    private b c;
    private int d = -1;
    private long e = -1;

    private interface b {
        void a(int i, long j);

        void a(long j);

        boolean a(j8 j8Var, long j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] c() {
        return new i8[]{new mr()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f700a = k8Var;
        this.b = k8Var.a(0, 1);
        k8Var.c();
    }

    private void b() {
        a1.b(this.b);
        yp.a(this.f700a);
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        b();
        if (this.c == null) {
            nr nrVarA = or.a(j8Var);
            if (nrVarA != null) {
                int i = nrVarA.f730a;
                if (i == 17) {
                    this.c = new a(this.f700a, this.b, nrVarA);
                } else if (i == 6) {
                    this.c = new c(this.f700a, this.b, nrVarA, "audio/g711-alaw", -1);
                } else if (i == 7) {
                    this.c = new c(this.f700a, this.b, nrVarA, "audio/g711-mlaw", -1);
                } else {
                    int iA = qr.a(i, nrVarA.f);
                    if (iA != 0) {
                        this.c = new c(this.f700a, this.b, nrVarA, "audio/raw", iA);
                    } else {
                        throw ah.a("Unsupported WAV format type: " + nrVarA.f730a);
                    }
                }
            } else {
                throw ah.a("Unsupported or unrecognized wav header.", null);
            }
        }
        if (this.d == -1) {
            Pair pairB = or.b(j8Var);
            this.d = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.e = jLongValue;
            this.c.a(this.d, jLongValue);
        } else if (j8Var.f() == 0) {
            j8Var.a(this.d);
        }
        a1.b(this.e != -1);
        return this.c.a(j8Var, this.e - j8Var.f()) ? -1 : 0;
    }

    private static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final k8 f702a;
        private final ro b;
        private final nr c;
        private final d9 d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(k8 k8Var, ro roVar, nr nrVar, String str, int i) throws ah {
            this.f702a = k8Var;
            this.b = roVar;
            this.c = nrVar;
            int i2 = (nrVar.b * nrVar.f) / 8;
            if (nrVar.e == i2) {
                int i3 = nrVar.c * i2;
                int i4 = i3 * 8;
                int iMax = Math.max(i2, i3 / 10);
                this.e = iMax;
                this.d = new d9.b().f(str).b(i4).k(i4).i(iMax).c(nrVar.b).n(nrVar.c).j(i).a();
                return;
            }
            throw ah.a("Expected block size: " + i2 + "; got: " + nrVar.e, null);
        }

        @Override // com.applovin.impl.mr.b
        public void a(int i, long j) {
            this.f702a.a(new pr(this.c, 1, i, j));
            this.b.a(this.d);
        }

        @Override // com.applovin.impl.mr.b
        public void a(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // com.applovin.impl.mr.b
        public boolean a(j8 j8Var, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iA = this.b.a((e5) j8Var, (int) Math.min(i2 - i, j2), true);
                if (iA == -1) {
                    j2 = 0;
                } else {
                    this.g += iA;
                    j2 -= iA;
                }
            }
            int i3 = this.c.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long jC = this.f + yp.c(this.h, 1000000L, r1.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(jC, 1, i5, i6, null);
                this.h += i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    private static final class a implements b {
        private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, Opcodes.D2L, 157, Opcodes.LRETURN, Opcodes.ARRAYLENGTH, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final k8 f701a;
        private final ro b;
        private final nr c;
        private final int d;
        private final byte[] e;
        private final yg f;
        private final int g;
        private final d9 h;
        private int i;
        private long j;
        private int k;
        private long l;

        private static int a(int i, int i2) {
            return i * 2 * i2;
        }

        public a(k8 k8Var, ro roVar, nr nrVar) throws ah {
            this.f701a = k8Var;
            this.b = roVar;
            this.c = nrVar;
            int iMax = Math.max(1, nrVar.c / 10);
            this.g = iMax;
            yg ygVar = new yg(nrVar.g);
            ygVar.r();
            int iR = ygVar.r();
            this.d = iR;
            int i = nrVar.b;
            int i2 = (((nrVar.e - (i * 4)) * 8) / (nrVar.f * i)) + 1;
            if (iR == i2) {
                int iA = yp.a(iMax, iR);
                this.e = new byte[nrVar.e * iA];
                this.f = new yg(iA * a(iR, i));
                int i3 = ((nrVar.c * nrVar.e) * 8) / iR;
                this.h = new d9.b().f("audio/raw").b(i3).k(i3).i(a(iMax, i)).c(nrVar.b).n(nrVar.c).j(2).a();
                return;
            }
            throw ah.a("Expected frames per block: " + i2 + "; got: " + iR, null);
        }

        private void c(int i) {
            long jC = this.j + yp.c(this.l, 1000000L, this.c.c);
            int iB = b(i);
            this.b.a(jC, 1, iB, this.k - iB, null);
            this.l += i;
            this.k -= iB;
        }

        private void a(byte[] bArr, int i, yg ygVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.c.b; i3++) {
                    a(bArr, i2, i3, ygVar.c());
                }
            }
            int iB = b(this.d * i);
            ygVar.f(0);
            ygVar.e(iB);
        }

        private int b(int i) {
            return a(i, this.c.b);
        }

        private void a(byte[] bArr, int i, int i2, byte[] bArr2) {
            nr nrVar = this.c;
            int i3 = nrVar.e;
            int i4 = nrVar.b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iA = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = n[iMin];
            int i9 = ((i * this.d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iA & 255);
            bArr2[i9 + 1] = (byte) (iA >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iA = yp.a(iA + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iA & 255);
                bArr2[i9 + 1] = (byte) (iA >> 8);
                int i13 = iMin + m[i11];
                int[] iArr = n;
                iMin = yp.a(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        @Override // com.applovin.impl.mr.b
        public void a(int i, long j) {
            this.f701a.a(new pr(this.c, this.d, i, j));
            this.b.a(this.h);
        }

        private int a(int i) {
            return i / (this.c.b * 2);
        }

        @Override // com.applovin.impl.mr.b
        public void a(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please report as a decompilation issue!!! */
        @Override // com.applovin.impl.mr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(com.applovin.impl.j8 r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.k
                int r1 = r6.a(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = com.applovin.impl.yp.a(r0, r1)
                com.applovin.impl.nr r1 = r6.c
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r1 != 0) goto L1c
                r2 = r6
                goto L37
            L1c:
                r1 = 0
                r2 = r6
            L1e:
                if (r1 != 0) goto L3f
                int r3 = r2.i
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r2.e
                int r5 = r2.i
                int r3 = r7.a(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L39
            L37:
                r1 = 1
                goto L1e
            L39:
                int r4 = r2.i
                int r4 = r4 + r3
                r2.i = r4
                goto L1e
            L3f:
                int r7 = r2.i
                com.applovin.impl.nr r8 = r2.c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L76
                byte[] r8 = r2.e
                com.applovin.impl.yg r9 = r2.f
                r2.a(r8, r7, r9)
                int r8 = r2.i
                com.applovin.impl.nr r9 = r2.c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r2.i = r8
                com.applovin.impl.yg r7 = r2.f
                int r7 = r7.e()
                com.applovin.impl.ro r8 = r2.b
                com.applovin.impl.yg r9 = r2.f
                r8.a(r9, r7)
                int r8 = r2.k
                int r8 = r8 + r7
                r2.k = r8
                int r7 = r2.a(r8)
                int r8 = r2.g
                if (r7 < r8) goto L76
                r2.c(r8)
            L76:
                if (r1 == 0) goto L83
                int r7 = r2.k
                int r7 = r2.a(r7)
                if (r7 <= 0) goto L83
                r2.c(r7)
            L83:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mr.a.a(com.applovin.impl.j8, long):boolean");
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return or.a(j8Var) != null;
    }
}
