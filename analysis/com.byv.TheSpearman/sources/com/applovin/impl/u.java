package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.m2;
import com.applovin.impl.u;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u implements m2 {
    public static final u h = new u(null, new a[0], 0, -9223372036854775807L, 0);
    private static final a i = new a(0).c(0);
    public static final m2.a j = new m2.a() { // from class: com.applovin.impl.u$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return u.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Object f1044a;
    public final int b;
    public final long c;
    public final long d;
    public final int f;
    private final a[] g;

    public static final class a implements m2 {
        public static final m2.a i = new m2.a() { // from class: com.applovin.impl.u$a$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return u.a.a(bundle);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f1045a;
        public final int b;
        public final Uri[] c;
        public final int[] d;
        public final long[] f;
        public final long g;
        public final boolean h;

        public a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public boolean c() {
            return this.b == -1 || a() < this.b;
        }

        public boolean b() {
            if (this.b == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.d[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1045a == aVar.f1045a && this.b == aVar.b && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
        }

        public int hashCode() {
            int i2 = this.b * 31;
            long j = this.f1045a;
            int iHashCode = (((((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.f)) * 31;
            long j2 = this.g;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.h ? 1 : 0);
        }

        private a(long j, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            a1.a(iArr.length == uriArr.length);
            this.f1045a = j;
            this.b = i2;
            this.d = iArr;
            this.c = uriArr;
            this.f = jArr;
            this.g = j2;
            this.h = z;
        }

        private static long[] a(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = Math.max(i2, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        public a c(int i2) {
            int[] iArrA = a(this.d, i2);
            long[] jArrA = a(this.f, i2);
            return new a(this.f1045a, i2, iArrA, (Uri[]) Arrays.copyOf(this.c, i2), jArrA, this.g, this.h);
        }

        private static String b(int i2) {
            return Integer.toString(i2, 36);
        }

        private static int[] a(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = Math.max(i2, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            long j = bundle.getLong(b(0));
            int i2 = bundle.getInt(b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j2 = bundle.getLong(b(5));
            boolean z = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.d;
                if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }
    }

    private u(Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.f1044a = obj;
        this.c = j2;
        this.d = j3;
        this.b = aVarArr.length + i2;
        this.g = aVarArr;
        this.f = i2;
    }

    public int b(long j2, long j3) {
        int i2 = this.b - 1;
        while (i2 >= 0 && a(j2, j3, i2)) {
            i2--;
        }
        if (i2 < 0 || !a(i2).b()) {
            return -1;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return yp.a(this.f1044a, uVar.f1044a) && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d && this.f == uVar.f && Arrays.equals(this.g, uVar.g);
    }

    public int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.f1044a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.f) * 31) + Arrays.hashCode(this.g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f1044a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.g.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.g[i2].f1045a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.g[i2].d.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.g[i2].d[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.g[i2].f[i3]);
                sb.append(')');
                if (i3 < this.g[i2].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                aVarArr2[i2] = (a) a.i.a((Bundle) parcelableArrayList.get(i2));
            }
            aVarArr = aVarArr2;
        }
        return new u(null, aVarArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    public a a(int i2) {
        int i3 = this.f;
        if (i2 < i3) {
            return i;
        }
        return this.g[i2 - i3];
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public int a(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i2 = this.f;
        while (i2 < this.b && ((a(i2).f1045a != Long.MIN_VALUE && a(i2).f1045a <= j2) || !a(i2).c())) {
            i2++;
        }
        if (i2 < this.b) {
            return i2;
        }
        return -1;
    }

    private boolean a(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        long j4 = a(i2).f1045a;
        return j4 == Long.MIN_VALUE ? j3 == -9223372036854775807L || j2 < j3 : j2 < j4;
    }
}
