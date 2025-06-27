package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ji extends cb {
    static final cb i = new ji(null, new Object[0], 0);
    private final transient int[] f;
    final transient Object[] g;
    private final transient int h;

    @Override // com.applovin.impl.cb
    eb b() {
        return new a(this, this.g, 0, this.h);
    }

    @Override // com.applovin.impl.cb
    eb c() {
        return new b(this, new c(this.g, 0, this.h));
    }

    @Override // com.applovin.impl.cb
    ya d() {
        return new c(this.g, 1, this.h);
    }

    @Override // com.applovin.impl.cb
    boolean f() {
        return false;
    }

    static ji a(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (ji) i;
        }
        if (i2 == 1) {
            n3.a(objArr[0], objArr[1]);
            return new ji(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i2, objArr.length >> 1);
        return new ji(a(objArr, i2, eb.a(i2), 0), objArr, i2);
    }

    private ji(int[] iArr, Object[] objArr, int i2) {
        this.f = iArr;
        this.g = objArr;
        this.h = i2;
    }

    @Override // java.util.Map
    public int size() {
        return this.h;
    }

    @Override // com.applovin.impl.cb, java.util.Map
    public Object get(Object obj) {
        return a(this.f, this.g, this.h, 0, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.impl.n3.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L77
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.impl.n3.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.impl.ia.a(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ji.a(java.lang.Object[], int, int, int):int[]");
    }

    static class a extends eb {
        private final transient cb c;
        private final transient Object[] d;
        private final transient int f;
        private final transient int g;

        @Override // com.applovin.impl.ya
        boolean e() {
            return true;
        }

        @Override // com.applovin.impl.eb
        ab f() {
            return new C0028a();
        }

        a(cb cbVar, Object[] objArr, int i, int i2) {
            this.c = cbVar;
            this.d = objArr;
            this.f = i;
            this.g = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public qp iterator() {
            return a().iterator();
        }

        /* renamed from: com.applovin.impl.ji$a$a, reason: collision with other inner class name */
        class C0028a extends ab {
            @Override // com.applovin.impl.ya
            public boolean e() {
                return true;
            }

            C0028a() {
            }

            @Override // java.util.List
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i) {
                Preconditions.checkElementIndex(i, a.this.g);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.d[a.this.f + i2], a.this.d[i2 + (a.this.f ^ 1)]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.g;
            }
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.c.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.g;
        }

        @Override // com.applovin.impl.ya
        int a(Object[] objArr, int i) {
            return a().a(objArr, i);
        }
    }

    static final class c extends ab {
        private final transient Object[] c;
        private final transient int d;
        private final transient int f;

        @Override // com.applovin.impl.ya
        boolean e() {
            return true;
        }

        c(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.f = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.f);
            return this.c[(i * 2) + this.d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f;
        }
    }

    static final class b extends eb {
        private final transient cb c;
        private final transient ab d;

        @Override // com.applovin.impl.ya
        boolean e() {
            return true;
        }

        b(cb cbVar, ab abVar) {
            this.c = cbVar;
            this.d = abVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public qp iterator() {
            return a().iterator();
        }

        @Override // com.applovin.impl.eb, com.applovin.impl.ya
        public ab a() {
            return this.d;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.c.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.c.size();
        }

        @Override // com.applovin.impl.ya
        int a(Object[] objArr, int i) {
            return a().a(objArr, i);
        }
    }

    static Object a(int[] iArr, Object[] objArr, int i2, int i3, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iA = ia.a(obj.hashCode());
        while (true) {
            int i4 = iA & length;
            int i5 = iArr[i4];
            if (i5 == -1) {
                return null;
            }
            if (objArr[i5].equals(obj)) {
                return objArr[i5 ^ 1];
            }
            iA = i4 + 1;
        }
    }
}
