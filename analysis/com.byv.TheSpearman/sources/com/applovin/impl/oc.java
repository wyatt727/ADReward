package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.mi;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public abstract class oc extends wo {
    private a c;

    protected abstract Pair a(a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f742a;
        private final String[] b;
        private final int[] c;
        private final qo[] d;
        private final int[] e;
        private final int[][][] f;
        private final qo g;

        a(String[] strArr, int[] iArr, qo[] qoVarArr, int[] iArr2, int[][][] iArr3, qo qoVar) {
            this.b = strArr;
            this.c = iArr;
            this.d = qoVarArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = qoVar;
            this.f742a = iArr.length;
        }

        public int a() {
            return this.f742a;
        }

        public qo b(int i) {
            return this.d[i];
        }

        public int a(int i) {
            return this.c[i];
        }
    }

    private static int a(mi[] miVarArr, po poVar, int[] iArr, boolean z) {
        int length = miVarArr.length;
        boolean z2 = true;
        int i = 0;
        for (int i2 = 0; i2 < miVarArr.length; i2++) {
            mi miVar = miVarArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < poVar.f785a; i3++) {
                iMax = Math.max(iMax, mi.CC.d(miVar.a(poVar.a(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] a(mi miVar, po poVar) {
        int[] iArr = new int[poVar.f785a];
        for (int i = 0; i < poVar.f785a; i++) {
            iArr[i] = miVar.a(poVar.a(i));
        }
        return iArr;
    }

    private static int[] a(mi[] miVarArr) {
        int length = miVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = miVarArr[i].m();
        }
        return iArr;
    }

    @Override // com.applovin.impl.wo
    public final void a(Object obj) {
        this.c = (a) obj;
    }

    @Override // com.applovin.impl.wo
    public final xo a(mi[] miVarArr, qo qoVar, wd.a aVar, go goVar) {
        int[] iArrA;
        int[] iArr = new int[miVarArr.length + 1];
        int length = miVarArr.length + 1;
        po[][] poVarArr = new po[length][];
        int[][][] iArr2 = new int[miVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = qoVar.f848a;
            poVarArr[i] = new po[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrA2 = a(miVarArr);
        for (int i3 = 0; i3 < qoVar.f848a; i3++) {
            po poVarA = qoVar.a(i3);
            int iA = a(miVarArr, poVarA, iArr, df.e(poVarA.a(0).m) == 5);
            if (iA == miVarArr.length) {
                iArrA = new int[poVarA.f785a];
            } else {
                iArrA = a(miVarArr[iA], poVarA);
            }
            int i4 = iArr[iA];
            poVarArr[iA][i4] = poVarA;
            iArr2[iA][i4] = iArrA;
            iArr[iA] = i4 + 1;
        }
        qo[] qoVarArr = new qo[miVarArr.length];
        String[] strArr = new String[miVarArr.length];
        int[] iArr3 = new int[miVarArr.length];
        for (int i5 = 0; i5 < miVarArr.length; i5++) {
            int i6 = iArr[i5];
            qoVarArr[i5] = new qo((po[]) yp.a(poVarArr[i5], i6));
            iArr2[i5] = (int[][]) yp.a(iArr2[i5], i6);
            strArr[i5] = miVarArr[i5].getName();
            iArr3[i5] = miVarArr[i5].e();
        }
        a aVar2 = new a(strArr, iArr3, qoVarArr, iArrA2, iArr2, new qo((po[]) yp.a(poVarArr[miVarArr.length], iArr[miVarArr.length])));
        Pair pairA = a(aVar2, iArr2, iArrA2, aVar, goVar);
        return new xo((ni[]) pairA.first, (f8[]) pairA.second, aVar2);
    }
}
