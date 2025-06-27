package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.f8;
import com.applovin.impl.wd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class i0 extends e2 {
    private final x1 h;
    private final long i;
    private final long j;
    private final long k;
    private final float l;
    private final float m;
    private final ab n;
    private final j3 o;
    private float p;
    private int q;
    private int r;
    private long s;

    /* JADX INFO: Access modifiers changed from: private */
    public static ab b(f8.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (f8.a aVar : aVarArr) {
            if (aVar == null || aVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                ab.a aVarF = ab.f();
                aVarF.b(new a(0L, 0L));
                arrayList.add(aVarF);
            }
        }
        long[][] jArrC = c(aVarArr);
        int[] iArr = new int[jArrC.length];
        long[] jArr = new long[jArrC.length];
        for (int i = 0; i < jArrC.length; i++) {
            long[] jArr2 = jArrC[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        a(arrayList, jArr);
        ab abVarA = a(jArrC);
        for (int i2 = 0; i2 < abVarA.size(); i2++) {
            int iIntValue = ((Integer) abVarA.get(i2)).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrC[iIntValue][i3];
            a(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        a(arrayList, jArr);
        ab.a aVarF2 = ab.f();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ab.a aVar2 = (ab.a) arrayList.get(i5);
            aVarF2.b(aVar2 == null ? ab.h() : aVar2.a());
        }
        return aVarF2.a();
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.f8
    public void f() {
    }

    public static class b implements f8.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f513a;
        private final int b;
        private final int c;
        private final float d;
        private final float e;
        private final j3 f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, j3.f557a);
        }

        @Override // com.applovin.impl.f8.b
        public final f8[] a(f8.a[] aVarArr, x1 x1Var, wd.a aVar, go goVar) {
            f8 f8VarA;
            ab abVarB = i0.b(aVarArr);
            f8[] f8VarArr = new f8[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                f8.a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            f8VarA = new r8(aVar2.f416a, iArr[0], aVar2.c);
                        } else {
                            f8VarA = a(aVar2.f416a, iArr, aVar2.c, x1Var, (ab) abVarB.get(i));
                        }
                        f8VarArr[i] = f8VarA;
                    }
                }
            }
            return f8VarArr;
        }

        protected i0 a(po poVar, int[] iArr, int i, x1 x1Var, ab abVar) {
            return new i0(poVar, iArr, i, x1Var, this.f513a, this.b, this.c, this.d, this.e, abVar, this.f);
        }

        public b(int i, int i2, int i3, float f, float f2, j3 j3Var) {
            this.f513a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = f2;
            this.f = j3Var;
        }
    }

    protected i0(po poVar, int[] iArr, int i, x1 x1Var, long j, long j2, long j3, float f, float f2, List list, j3 j3Var) {
        super(poVar, iArr, i);
        if (j3 < j) {
            kc.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = x1Var;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j3 * 1000;
        this.l = f;
        this.m = f2;
        this.n = ab.a((Collection) list);
        this.o = j3Var;
        this.p = 1.0f;
        this.r = 0;
        this.s = -9223372036854775807L;
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.f8
    public void i() {
        this.s = -9223372036854775807L;
    }

    @Override // com.applovin.impl.f8
    public int h() {
        return this.q;
    }

    private static long[][] c(f8.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            f8.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.b.length];
                int i2 = 0;
                while (true) {
                    if (i2 >= aVar.b.length) {
                        break;
                    }
                    jArr[i][i2] = aVar.f416a.a(r5[i2]).i;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f512a;
        public final long b;

        public a(long j, long j2) {
            this.f512a = j;
            this.b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f512a == aVar.f512a && this.b == aVar.b;
        }

        public int hashCode() {
            return (((int) this.f512a) * 31) + ((int) this.b);
        }
    }

    private static void a(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ab.a aVar = (ab.a) list.get(i);
            if (aVar != null) {
                aVar.b(new a(j, jArr[i]));
            }
        }
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.f8
    public void a(float f) {
        this.p = f;
    }

    private static ab a(long[][] jArr) {
        ac acVarB = rf.a().a().b();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    int length2 = jArr3.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i2 >= length2) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    acVarB.put(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return ab.a(acVarB.values());
    }
}
