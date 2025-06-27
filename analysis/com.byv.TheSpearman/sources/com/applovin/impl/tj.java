package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface tj {
    int a();

    int a(int i);

    tj a(int i, int i2);

    int b();

    int b(int i);

    tj b(int i, int i2);

    int c();

    tj d();

    public static class a implements tj {

        /* renamed from: a, reason: collision with root package name */
        private final Random f1035a;
        private final int[] b;
        private final int[] c;

        @Override // com.applovin.impl.tj
        public tj d() {
            return new a(0, new Random(this.f1035a.nextLong()));
        }

        public a(int i) {
            this(i, new Random());
        }

        @Override // com.applovin.impl.tj
        public int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.impl.tj
        public tj b(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f1035a.nextInt(this.b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f1035a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new a(iArr3, new Random(this.f1035a.nextLong()));
                }
            }
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        @Override // com.applovin.impl.tj
        public tj a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 < i || i6 >= i2) {
                        int i7 = i4 - i5;
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i7] = i6;
                    } else {
                        i5++;
                    }
                    i4++;
                } else {
                    return new a(iArr, new Random(this.f1035a.nextLong()));
                }
            }
        }

        private a(int[] iArr, Random random) {
            this.b = iArr;
            this.f1035a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        @Override // com.applovin.impl.tj
        public int b() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // com.applovin.impl.tj
        public int b(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }

        @Override // com.applovin.impl.tj
        public int a() {
            return this.b.length;
        }

        @Override // com.applovin.impl.tj
        public int a(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }
    }
}
