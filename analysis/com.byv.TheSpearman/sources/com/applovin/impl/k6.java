package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.impl.f8;
import com.applovin.impl.i0;
import com.applovin.impl.k6;
import com.applovin.impl.m2;
import com.applovin.impl.mi;
import com.applovin.impl.oc;
import com.applovin.impl.vo;
import com.applovin.impl.wd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class k6 extends oc {
    private static final int[] f = new int[0];
    private static final tg g = tg.a(new Comparator() { // from class: com.applovin.impl.k6$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return k6.a((Integer) obj, (Integer) obj2);
        }
    });
    private static final tg h = tg.a(new Comparator() { // from class: com.applovin.impl.k6$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return k6.b((Integer) obj, (Integer) obj2);
        }
    });
    private final f8.b d;
    private final AtomicReference e;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.applovin.impl.wo
    public boolean b() {
        return true;
    }

    public static final class e extends vo.a {
        private boolean A;
        private boolean B;
        private boolean C;
        private boolean D;
        private int E;
        private boolean F;
        private boolean G;
        private boolean H;
        private final SparseArray I;
        private final SparseBooleanArray J;
        private boolean x;
        private boolean y;
        private boolean z;

        public e() {
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        public e(Context context) {
            super(context);
            this.I = new SparseArray();
            this.J = new SparseBooleanArray();
            c();
        }

        public e i(boolean z) {
            this.x = z;
            return this;
        }

        public e e(boolean z) {
            this.y = z;
            return this;
        }

        public e f(boolean z) {
            this.z = z;
            return this;
        }

        public e g(boolean z) {
            this.A = z;
            return this;
        }

        private e(Bundle bundle) {
            super(bundle);
            d dVar = d.O;
            i(bundle.getBoolean(d.b(1000), dVar.C));
            e(bundle.getBoolean(d.b(1001), dVar.D));
            f(bundle.getBoolean(d.b(1002), dVar.E));
            g(bundle.getBoolean(d.b(1003), dVar.F));
            b(bundle.getBoolean(d.b(1004), dVar.G));
            c(bundle.getBoolean(d.b(1005), dVar.H));
            a(bundle.getBoolean(d.b(1006), dVar.I));
            a(bundle.getInt(d.b(1007), dVar.B));
            h(bundle.getBoolean(d.b(1008), dVar.J));
            j(bundle.getBoolean(d.b(1009), dVar.K));
            d(bundle.getBoolean(d.b(1010), dVar.L));
            this.I = new SparseArray();
            a(bundle);
            this.J = a(bundle.getIntArray(d.b(1014)));
        }

        public e b(boolean z) {
            this.B = z;
            return this;
        }

        public e h(boolean z) {
            this.F = z;
            return this;
        }

        public e j(boolean z) {
            this.G = z;
            return this;
        }

        public e d(boolean z) {
            this.H = z;
            return this;
        }

        private void c() {
            this.x = true;
            this.y = false;
            this.z = true;
            this.A = true;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = 0;
            this.F = true;
            this.G = false;
            this.H = true;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(int i, int i2, boolean z) {
            super.a(i, i2, z);
            return this;
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i : iArr) {
                sparseBooleanArray.append(i, true);
            }
            return sparseBooleanArray;
        }

        public e c(boolean z) {
            this.C = z;
            return this;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(Context context, boolean z) {
            super.a(context, z);
            return this;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a() {
            return new d(this);
        }

        public e a(boolean z) {
            this.D = z;
            return this;
        }

        @Override // com.applovin.impl.vo.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(Context context) {
            super.a(context);
            return this;
        }

        public e a(int i) {
            this.E = i;
            return this;
        }

        public final e a(int i, qo qoVar, f fVar) {
            Map map = (Map) this.I.get(i);
            if (map == null) {
                map = new HashMap();
                this.I.put(i, map);
            }
            if (map.containsKey(qoVar) && yp.a(map.get(qoVar), fVar)) {
                return this;
            }
            map.put(qoVar, fVar);
            return this;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.b(1011));
            List listA = n2.a(qo.f, bundle.getParcelableArrayList(d.b(1012)), ab.h());
            SparseArray sparseArrayA = n2.a(f.f, bundle.getSparseParcelableArray(d.b(1013)), new SparseArray());
            if (intArray == null || intArray.length != listA.size()) {
                return;
            }
            for (int i = 0; i < intArray.length; i++) {
                a(intArray[i], (qo) listA.get(i), (f) sparseArrayA.get(i));
            }
        }
    }

    public static final class d extends vo implements m2 {
        public static final d O;
        public static final d P;
        public static final m2.a Q;
        public final int B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        private final SparseArray M;
        private final SparseBooleanArray N;

        static {
            d dVarA = new e().a();
            O = dVarA;
            P = dVarA;
            Q = new m2.a() { // from class: com.applovin.impl.k6$d$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.m2.a
                public final m2 a(Bundle bundle) {
                    return k6.d.b(bundle);
                }
            };
        }

        private d(e eVar) {
            super(eVar);
            this.C = eVar.x;
            this.D = eVar.y;
            this.E = eVar.z;
            this.F = eVar.A;
            this.G = eVar.B;
            this.H = eVar.C;
            this.I = eVar.D;
            this.B = eVar.E;
            this.J = eVar.F;
            this.K = eVar.G;
            this.L = eVar.H;
            this.M = eVar.I;
            this.N = eVar.J;
        }

        public final boolean d(int i) {
            return this.N.get(i);
        }

        public final boolean b(int i, qo qoVar) {
            Map map = (Map) this.M.get(i);
            return map != null && map.containsKey(qoVar);
        }

        @Override // com.applovin.impl.vo
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && a(this.N, dVar.N) && a(this.M, dVar.M);
        }

        @Override // com.applovin.impl.vo
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String b(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d b(Bundle bundle) {
            return new e(bundle).a();
        }

        private static boolean a(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !a((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                qo qoVar = (qo) entry.getKey();
                if (!map2.containsKey(qoVar) || !yp.a(entry.getValue(), map2.get(qoVar))) {
                    return false;
                }
            }
            return true;
        }

        public final f a(int i, qo qoVar) {
            Map map = (Map) this.M.get(i);
            if (map != null) {
                return (f) map.get(qoVar);
            }
            return null;
        }

        public static d a(Context context) {
            return new e(context).a();
        }
    }

    public static final class f implements m2 {
        public static final m2.a f = new m2.a() { // from class: com.applovin.impl.k6$f$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return k6.f.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f588a;
        public final int[] b;
        public final int c;
        public final int d;

        public f(int i, int[] iArr, int i2) {
            this.f588a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.b = iArrCopyOf;
            this.c = iArr.length;
            this.d = i2;
            Arrays.sort(iArrCopyOf);
        }

        public int hashCode() {
            return (((this.f588a * 31) + Arrays.hashCode(this.b)) * 31) + this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f588a == fVar.f588a && Arrays.equals(this.b, fVar.b) && this.d == fVar.d;
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ f a(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i2 = bundle.getInt(a(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            a1.a(z);
            a1.a(intArray);
            return new f(i, intArray, i2);
        }
    }

    public k6(Context context) {
        this(context, new i0.b());
    }

    private static int b(po poVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue = ((Integer) list.get(i11)).intValue();
            if (a(poVar.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    private static void a(po poVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = ((Integer) list.get(size)).intValue();
            if (!a(poVar.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    protected static final class h implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f590a;
        private final d b;
        private final boolean c;
        private final boolean d;
        private final int f;
        private final int g;
        private final int h;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(com.applovin.impl.d9 r7, com.applovin.impl.k6.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.r
                if (r4 == r3) goto L14
                int r5 = r8.f1104a
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.s
                if (r4 == r3) goto L1c
                int r5 = r8.b
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.t
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.c
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.i
                if (r4 == r3) goto L31
                int r5 = r8.d
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f590a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.r
                if (r10 == r3) goto L40
                int r4 = r8.f
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.s
                if (r10 == r3) goto L48
                int r4 = r8.g
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.t
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.h
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.i
                if (r10 == r3) goto L5f
                int r0 = r8.i
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.c = r1
                boolean r9 = com.applovin.impl.k6.a(r9, r2)
                r6.d = r9
                int r9 = r7.i
                r6.f = r9
                int r9 = r7.b()
                r6.g = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L74:
                com.applovin.impl.ab r10 = r8.m
                int r10 = r10.size()
                if (r2 >= r10) goto L91
                java.lang.String r10 = r7.m
                if (r10 == 0) goto L8e
                com.applovin.impl.ab r0 = r8.m
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L8e
                r9 = r2
                goto L91
            L8e:
                int r2 = r2 + 1
                goto L74
            L91:
                r6.h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.h.<init>(com.applovin.impl.d9, com.applovin.impl.k6$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            tg tgVarC = (this.f590a && this.d) ? k6.g : k6.g.c();
            return w3.e().a(this.d, hVar.d).a(this.f590a, hVar.f590a).a(this.c, hVar.c).a(Integer.valueOf(this.h), Integer.valueOf(hVar.h), tg.a().c()).a(Integer.valueOf(this.f), Integer.valueOf(hVar.f), this.b.v ? k6.g.c() : k6.h).a(Integer.valueOf(this.g), Integer.valueOf(hVar.g), tgVarC).a(Integer.valueOf(this.f), Integer.valueOf(hVar.f), tgVarC).d();
        }
    }

    protected static final class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f586a;
        private final String b;
        private final d c;
        private final boolean d;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final boolean k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;

        public b(d9 d9Var, d dVar, int i) {
            int i2;
            int iA;
            int iA2;
            this.c = dVar;
            this.b = k6.a(d9Var.c);
            int i3 = 0;
            this.d = k6.a(i, false);
            int i4 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i4 >= dVar.n.size()) {
                    iA = 0;
                    i4 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA = k6.a(d9Var, (String) dVar.n.get(i4), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.g = i4;
            this.f = iA;
            this.h = Integer.bitCount(d9Var.f & dVar.o);
            boolean z = true;
            this.k = (d9Var.d & 1) != 0;
            int i5 = d9Var.z;
            this.l = i5;
            this.m = d9Var.A;
            int i6 = d9Var.i;
            this.n = i6;
            if ((i6 != -1 && i6 > dVar.q) || (i5 != -1 && i5 > dVar.p)) {
                z = false;
            }
            this.f586a = z;
            String[] strArrE = yp.e();
            int i7 = 0;
            while (true) {
                if (i7 >= strArrE.length) {
                    iA2 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = k6.a(d9Var, strArrE[i7], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.i = i7;
            this.j = iA2;
            while (true) {
                if (i3 < dVar.r.size()) {
                    String str = d9Var.m;
                    if (str != null && str.equals(dVar.r.get(i3))) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            this.o = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            tg tgVarC = (this.f586a && this.d) ? k6.g : k6.g.c();
            w3 w3VarA = w3.e().a(this.d, bVar.d).a(Integer.valueOf(this.g), Integer.valueOf(bVar.g), tg.a().c()).a(this.f, bVar.f).a(this.h, bVar.h).a(this.f586a, bVar.f586a).a(Integer.valueOf(this.o), Integer.valueOf(bVar.o), tg.a().c()).a(Integer.valueOf(this.n), Integer.valueOf(bVar.n), this.c.v ? k6.g.c() : k6.h).a(this.k, bVar.k).a(Integer.valueOf(this.i), Integer.valueOf(bVar.i), tg.a().c()).a(this.j, bVar.j).a(Integer.valueOf(this.l), Integer.valueOf(bVar.l), tgVarC).a(Integer.valueOf(this.m), Integer.valueOf(bVar.m), tgVarC);
            Integer numValueOf = Integer.valueOf(this.n);
            Integer numValueOf2 = Integer.valueOf(bVar.n);
            if (!yp.a((Object) this.b, (Object) bVar.b)) {
                tgVarC = k6.h;
            }
            return w3VarA.a(numValueOf, numValueOf2, tgVarC).d();
        }
    }

    protected static final class g implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f589a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final boolean j;

        public g(d9 d9Var, d dVar, int i, String str) {
            ab abVarA;
            int iA;
            boolean z = false;
            this.b = k6.a(i, false);
            int i2 = d9Var.d & (~dVar.B);
            this.c = (i2 & 1) != 0;
            this.d = (i2 & 2) != 0;
            int i3 = Integer.MAX_VALUE;
            if (dVar.s.isEmpty()) {
                abVarA = ab.a("");
            } else {
                abVarA = dVar.s;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= abVarA.size()) {
                    iA = 0;
                    break;
                }
                iA = k6.a(d9Var, (String) abVarA.get(i4), dVar.u);
                if (iA > 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            this.f = i3;
            this.g = iA;
            int iBitCount = Integer.bitCount(d9Var.f & dVar.t);
            this.h = iBitCount;
            this.j = (d9Var.f & 1088) != 0;
            int iA2 = k6.a(d9Var, str, k6.a(str) == null);
            this.i = iA2;
            if (iA > 0 || ((dVar.s.isEmpty() && iBitCount > 0) || this.c || (this.d && iA2 > 0))) {
                z = true;
            }
            this.f589a = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            w3 w3VarA = w3.e().a(this.b, gVar.b).a(Integer.valueOf(this.f), Integer.valueOf(gVar.f), tg.a().c()).a(this.g, gVar.g).a(this.h, gVar.h).a(this.c, gVar.c).a(Boolean.valueOf(this.d), Boolean.valueOf(gVar.d), this.g == 0 ? tg.a() : tg.a().c()).a(this.i, gVar.i);
            if (this.h == 0) {
                w3VarA = w3VarA.b(this.j, gVar.j);
            }
            return w3VarA.d();
        }
    }

    protected static final class c implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f587a;
        private final boolean b;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return w3.e().a(this.b, cVar.b).a(this.f587a, cVar.f587a).d();
        }

        public c(d9 d9Var, int i) {
            this.f587a = (d9Var.d & 1) != 0;
            this.b = k6.a(i, false);
        }
    }

    public k6(Context context, f8.b bVar) {
        this(d.a(context), bVar);
    }

    protected f8.a b(qo qoVar, int[][] iArr, int i, d dVar, boolean z) {
        f8.a aVarA = (dVar.w || dVar.v || !z) ? null : a(qoVar, iArr, i, dVar);
        return aVarA == null ? a(qoVar, iArr, dVar) : aVarA;
    }

    private static int[] a(po poVar, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        d9 d9VarA = poVar.a(i);
        int[] iArr2 = new int[poVar.f785a];
        int i3 = 0;
        for (int i4 = 0; i4 < poVar.f785a; i4++) {
            if (i4 == i || a(poVar.a(i4), iArr[i4], d9VarA, i2, z, z2, z3)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return Arrays.copyOf(iArr2, i3);
    }

    public k6(d dVar, f8.b bVar) {
        this.d = bVar;
        this.e = new AtomicReference(dVar);
    }

    private static int[] a(po poVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        int i12;
        int i13;
        HashSet hashSet;
        if (poVar.f785a < 2) {
            return f;
        }
        List listA = a(poVar, i10, i11, z2);
        if (listA.size() < 2) {
            return f;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < listA.size()) {
                String str3 = poVar.a(((Integer) listA.get(i15)).intValue()).m;
                if (hashSet2.add(str3)) {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                    int iB = b(poVar, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, listA);
                    if (iB > i12) {
                        i14 = iB;
                        str2 = str3;
                    }
                    i15 = i13 + 1;
                    hashSet2 = hashSet;
                } else {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                }
                i14 = i12;
                i15 = i13 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        a(poVar, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, listA);
        return listA.size() < 2 ? f : pb.a(listA);
    }

    protected static int a(d9 d9Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(d9Var.c)) {
            return 4;
        }
        String strA = a(str);
        String strA2 = a(d9Var.c);
        if (strA2 == null || strA == null) {
            return (z && strA2 == null) ? 1 : 0;
        }
        if (strA2.startsWith(strA) || strA.startsWith(strA2)) {
            return 3;
        }
        return yp.b(strA2, "-")[0].equals(yp.b(strA, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.impl.yp.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.impl.yp.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.a(boolean, int, int, int, int):android.graphics.Point");
    }

    protected static boolean a(int i, boolean z) {
        int iD = mi.CC.d(i);
        return iD == 4 || (z && iD == 3);
    }

    private static boolean a(d9 d9Var, int i, d9 d9Var2, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        String str;
        int i5;
        if (!a(i, false) || (i3 = d9Var.i) == -1 || i3 > i2) {
            return false;
        }
        if (!z3 && ((i5 = d9Var.z) == -1 || i5 != d9Var2.z)) {
            return false;
        }
        if (z || ((str = d9Var.m) != null && TextUtils.equals(str, d9Var2.m))) {
            return z2 || ((i4 = d9Var.A) != -1 && i4 == d9Var2.A);
        }
        return false;
    }

    private static boolean a(d9 d9Var, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if ((d9Var.f & 16384) != 0 || !a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !yp.a((Object) d9Var.m, (Object) str)) {
            return false;
        }
        int i12 = d9Var.r;
        if (i12 != -1 && (i7 > i12 || i12 > i3)) {
            return false;
        }
        int i13 = d9Var.s;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        float f2 = d9Var.t;
        return (f2 == -1.0f || (((float) i9) <= f2 && f2 <= ((float) i5))) && (i11 = d9Var.i) != -1 && i10 <= i11 && i11 <= i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void a(oc.a aVar, int[][][] iArr, ni[] niVarArr, f8[] f8VarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < aVar.a(); i3++) {
            int iA = aVar.a(i3);
            f8 f8Var = f8VarArr[i3];
            if ((iA == 1 || iA == 2) && f8Var != null && a(iArr[i3], aVar.b(i3), f8Var)) {
                if (iA == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            ni niVar = new ni(true);
            niVarArr[i2] = niVar;
            niVarArr[i] = niVar;
        }
    }

    protected static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean a(int[][] iArr, qo qoVar, f8 f8Var) {
        if (f8Var == null) {
            return false;
        }
        int iA = qoVar.a(f8Var.a());
        for (int i = 0; i < f8Var.b(); i++) {
            if (mi.CC.c(iArr[iA][f8Var.b(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static f8.a a(qo qoVar, int[][] iArr, int i, d dVar) {
        qo qoVar2 = qoVar;
        d dVar2 = dVar;
        int i2 = dVar2.E ? 24 : 16;
        boolean z = dVar2.D && (i & i2) != 0;
        int i3 = 0;
        while (i3 < qoVar2.f848a) {
            po poVarA = qoVar2.a(i3);
            int i4 = i3;
            int[] iArrA = a(poVarA, iArr[i3], z, i2, dVar2.f1104a, dVar2.b, dVar2.c, dVar2.d, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.k, dVar2.l);
            if (iArrA.length > 0) {
                return new f8.a(poVarA, iArrA);
            }
            i3 = i4 + 1;
            qoVar2 = qoVar;
            dVar2 = dVar;
        }
        return null;
    }

    protected f8.a[] a(oc.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        boolean z;
        String str;
        int i;
        String str2;
        b bVar;
        int i2;
        int iA = aVar.a();
        f8.a[] aVarArr = new f8.a[iA];
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            if (i4 >= iA) {
                break;
            }
            if (2 == aVar.a(i4)) {
                if (!z2) {
                    f8.a aVarB = b(aVar.b(i4), iArr[i4], iArr2[i4], dVar, true);
                    aVarArr[i4] = aVarB;
                    z2 = aVarB != null;
                }
                z3 |= aVar.b(i4).f848a > 0;
            }
            i4++;
        }
        int i5 = 0;
        int i6 = -1;
        String str3 = null;
        b bVar2 = null;
        while (i5 < iA) {
            if (z == aVar.a(i5)) {
                boolean z4 = (dVar.L || !z3) ? z : false;
                i = i6;
                str2 = str3;
                bVar = bVar2;
                i2 = i5;
                Pair pairA = a(aVar.b(i5), iArr[i5], iArr2[i5], dVar, z4);
                if (pairA != null && (bVar == null || ((b) pairA.second).compareTo(bVar) > 0)) {
                    if (i != -1) {
                        aVarArr[i] = null;
                    }
                    f8.a aVar2 = (f8.a) pairA.first;
                    aVarArr[i2] = aVar2;
                    str3 = aVar2.f416a.a(aVar2.b[0]).c;
                    bVar2 = (b) pairA.second;
                    i6 = i2;
                }
                i5 = i2 + 1;
                z = true;
            } else {
                i = i6;
                str2 = str3;
                bVar = bVar2;
                i2 = i5;
            }
            i6 = i;
            bVar2 = bVar;
            str3 = str2;
            i5 = i2 + 1;
            z = true;
        }
        String str4 = str3;
        int i7 = -1;
        g gVar = null;
        while (i3 < iA) {
            int iA2 = aVar.a(i3);
            if (iA2 == 1) {
                str = str4;
            } else if (iA2 == 2) {
                str = str4;
            } else if (iA2 != 3) {
                aVarArr[i3] = a(iA2, aVar.b(i3), iArr[i3], dVar);
                str = str4;
            } else {
                str = str4;
                Pair pairA2 = a(aVar.b(i3), iArr[i3], dVar, str);
                if (pairA2 != null && (gVar == null || ((g) pairA2.second).compareTo(gVar) > 0)) {
                    if (i7 != -1) {
                        aVarArr[i7] = null;
                    }
                    aVarArr[i3] = (f8.a) pairA2.first;
                    gVar = (g) pairA2.second;
                    i7 = i3;
                }
            }
            i3++;
            str4 = str;
        }
        return aVarArr;
    }

    protected Pair a(qo qoVar, int[][] iArr, int i, d dVar, boolean z) {
        f8.a aVar = null;
        b bVar = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < qoVar.f848a; i4++) {
            po poVarA = qoVar.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < poVarA.f785a; i5++) {
                if (a(iArr2[i5], dVar.J)) {
                    b bVar2 = new b(poVarA.a(i5), dVar, iArr2[i5]);
                    if ((bVar2.f586a || dVar.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        po poVarA2 = qoVar.a(i2);
        if (!dVar.w && !dVar.v && z) {
            int[] iArrA = a(poVarA2, iArr[i2], i3, dVar.q, dVar.G, dVar.H, dVar.I);
            if (iArrA.length > 1) {
                aVar = new f8.a(poVarA2, iArrA);
            }
        }
        if (aVar == null) {
            aVar = new f8.a(poVarA2, i3);
        }
        return Pair.create(aVar, (b) a1.a(bVar));
    }

    private static f8.a a(qo qoVar, int[][] iArr, d dVar) {
        int i = -1;
        po poVar = null;
        h hVar = null;
        for (int i2 = 0; i2 < qoVar.f848a; i2++) {
            po poVarA = qoVar.a(i2);
            List listA = a(poVarA, dVar.j, dVar.k, dVar.l);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < poVarA.f785a; i3++) {
                d9 d9VarA = poVarA.a(i3);
                if ((d9VarA.f & 16384) == 0 && a(iArr2[i3], dVar.J)) {
                    h hVar2 = new h(d9VarA, dVar, iArr2[i3], listA.contains(Integer.valueOf(i3)));
                    if ((hVar2.f590a || dVar.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        poVar = poVarA;
                        i = i3;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i);
    }

    protected f8.a a(int i, qo qoVar, int[][] iArr, d dVar) {
        po poVar = null;
        c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < qoVar.f848a; i3++) {
            po poVarA = qoVar.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < poVarA.f785a; i4++) {
                if (a(iArr2[i4], dVar.J)) {
                    c cVar2 = new c(poVarA.a(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        poVar = poVarA;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return new f8.a(poVar, i2);
    }

    protected Pair a(qo qoVar, int[][] iArr, d dVar, String str) {
        int i = -1;
        po poVar = null;
        g gVar = null;
        for (int i2 = 0; i2 < qoVar.f848a; i2++) {
            po poVarA = qoVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < poVarA.f785a; i3++) {
                if (a(iArr2[i3], dVar.J)) {
                    g gVar2 = new g(poVarA.a(i3), dVar, iArr2[i3], str);
                    if (gVar2.f589a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        poVar = poVarA;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (poVar == null) {
            return null;
        }
        return Pair.create(new f8.a(poVar, i), (g) a1.a(gVar));
    }

    @Override // com.applovin.impl.oc
    protected final Pair a(oc.a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar) {
        d dVar = (d) this.e.get();
        int iA = aVar.a();
        f8.a[] aVarArrA = a(aVar, iArr, iArr2, dVar);
        int i = 0;
        while (true) {
            if (i >= iA) {
                break;
            }
            int iA2 = aVar.a(i);
            if (!dVar.d(i) && !dVar.x.contains(Integer.valueOf(iA2))) {
                qo qoVarB = aVar.b(i);
                if (dVar.b(i, qoVarB)) {
                    f fVarA = dVar.a(i, qoVarB);
                    aVarArrA[i] = fVarA != null ? new f8.a(qoVarB.a(fVarA.f588a), fVarA.b, fVarA.d) : null;
                }
            } else {
                aVarArrA[i] = null;
            }
            i++;
        }
        f8[] f8VarArrA = this.d.a(aVarArrA, a(), aVar2, goVar);
        ni[] niVarArr = new ni[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            niVarArr[i2] = (dVar.d(i2) || dVar.x.contains(Integer.valueOf(aVar.a(i2))) || (aVar.a(i2) != -2 && f8VarArrA[i2] == null)) ? null : ni.b;
        }
        if (dVar.K) {
            a(aVar, iArr, niVarArr, f8VarArrA);
        }
        return Pair.create(niVarArr, f8VarArrA);
    }

    private static List a(po poVar, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(poVar.f785a);
        for (int i4 = 0; i4 < poVar.f785a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < poVar.f785a; i6++) {
                d9 d9VarA = poVar.a(i6);
                int i7 = d9VarA.r;
                if (i7 > 0 && (i3 = d9VarA.s) > 0) {
                    Point pointA = a(z, i, i2, i7, i3);
                    int i8 = d9VarA.r;
                    int i9 = d9VarA.s;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (pointA.x * 0.98f)) && i9 >= ((int) (pointA.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iB = poVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (iB == -1 || iB > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }
}
