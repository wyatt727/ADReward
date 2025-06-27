package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
class u3 extends AbstractMap implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient int[] f1047a;
    transient long[] b;
    transient Object[] c;
    transient Object[] d;
    transient float f;
    transient int g;
    private transient int h;
    private transient int i;
    private transient Set j;
    private transient Set k;
    private transient Collection l;

    private static int a(long j) {
        return (int) (j >>> 32);
    }

    private static long a(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    private static int b(long j) {
        return (int) j;
    }

    int a(int i, int i2) {
        return i - 1;
    }

    void a(int i) {
    }

    u3() {
        a(3, 1.0f);
    }

    private static int[] e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    Iterator e() {
        return new b();
    }

    private static long[] d(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    Collection d() {
        return new h();
    }

    private int g() {
        return this.f1047a.length - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        Object[] objArr2 = this.d;
        int iA = ia.a(obj);
        int iG = g() & iA;
        int i = this.i;
        int[] iArr = this.f1047a;
        int i2 = iArr[iG];
        if (i2 == -1) {
            iArr[iG] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (a(j) == iA && Objects.equal(obj, objArr[i2])) {
                    Object obj3 = objArr2[i2];
                    objArr2[i2] = obj2;
                    a(i2);
                    return obj3;
                }
                int iB = b(j);
                if (iB == -1) {
                    jArr[i2] = a(j, i);
                    break;
                }
                i2 = iB;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            h(i3);
            a(i, obj, obj2, iA);
            this.i = i3;
            if (i >= this.h) {
                i(this.f1047a.length * 2);
            }
            this.g++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    private void h(int i) {
        int length = this.b.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                g(iMax);
            }
        }
    }

    Iterator h() {
        return new a();
    }

    private void i(int i) {
        if (this.f1047a.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f)) + 1;
        int[] iArrE = e(i);
        long[] jArr = this.b;
        int length = iArrE.length - 1;
        for (int i3 = 0; i3 < this.i; i3++) {
            int iA = a(jArr[i3]);
            int i4 = iA & length;
            int i5 = iArrE[i4];
            iArrE[i4] = i3;
            jArr[i3] = (iA << 32) | (i5 & 4294967295L);
        }
        this.h = i2;
        this.f1047a = iArrE;
    }

    Iterator i() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int iA = a(obj);
        a(iA);
        if (iA == -1) {
            return null;
        }
        return this.d[iA];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return a(obj, ia.a(obj));
    }

    void c(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.c;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.b;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int iA = a(j) & g();
            int[] iArr = this.f1047a;
            int i2 = iArr[iA];
            if (i2 == size) {
                iArr[iA] = i;
                return;
            }
            while (true) {
                long j2 = this.b[i2];
                int iB = b(j2);
                if (iB == size) {
                    this.b[i2] = a(j2, i);
                    return;
                }
                i2 = iB;
            }
        } else {
            this.c[i] = null;
            this.d[i] = null;
            this.b[i] = -1;
        }
    }

    Set c() {
        return new f();
    }

    int f() {
        return isEmpty() ? -1 : 0;
    }

    int b(int i) {
        int i2 = i + 1;
        if (i2 < this.i) {
            return i2;
        }
        return -1;
    }

    Set b() {
        return new d();
    }

    private abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f1049a;
        int b;
        int c;

        abstract Object a(int i);

        private e() {
            this.f1049a = u3.this.g;
            this.b = u3.this.f();
            this.c = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                Object objA = a(i);
                this.b = u3.this.b(this.b);
                return objA;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            n3.a(this.c >= 0);
            this.f1049a++;
            u3.this.f(this.c);
            this.b = u3.this.a(this.b, this.c);
            this.c = -1;
        }

        private void a() {
            if (u3.this.g != this.f1049a) {
                throw new ConcurrentModificationException();
            }
        }

        /* synthetic */ e(u3 u3Var, a aVar) {
            this();
        }
    }

    void g(int i) {
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.b = jArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.j = setC;
        return setC;
    }

    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return u3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iA = u3.this.a(obj);
            if (iA == -1) {
                return false;
            }
            u3.this.f(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return u3.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u3.this.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Object obj) {
        int iA = ia.a(obj);
        int iB = this.f1047a[g() & iA];
        while (iB != -1) {
            long j = this.b[iB];
            if (a(j) == iA && Objects.equal(obj, this.c[iB])) {
                return iB;
            }
            iB = b(j);
        }
        return -1;
    }

    class a extends e {
        a() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        Object a(int i) {
            return u3.this.c[i];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.k;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.k = setB;
        return setB;
    }

    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return u3.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = u3.this.a(entry.getKey());
            return iA != -1 && Objects.equal(u3.this.d[iA], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = u3.this.a(entry.getKey());
            if (iA == -1 || !Objects.equal(u3.this.d[iA], entry.getValue())) {
                return false;
            }
            u3.this.f(iA);
            return true;
        }
    }

    class b extends e {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.u3.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i) {
            return u3.this.new g(i);
        }

        b() {
            super(u3.this, null);
        }
    }

    final class g extends com.applovin.impl.g {

        /* renamed from: a, reason: collision with root package name */
        private final Object f1051a;
        private int b;

        g(int i) {
            this.f1051a = u3.this.c[i];
            this.b = i;
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public Object getKey() {
            return this.f1051a;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= u3.this.size() || !Objects.equal(this.f1051a, u3.this.c[this.b])) {
                this.b = u3.this.a(this.f1051a);
            }
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public Object getValue() {
            a();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return u3.this.d[i];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i = this.b;
            if (i == -1) {
                u3.this.put(this.f1051a, obj);
                return null;
            }
            Object[] objArr = u3.this.d;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.i == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.i; i++) {
            if (Objects.equal(obj, this.d[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.l;
        if (collection != null) {
            return collection;
        }
        Collection collectionD = d();
        this.l = collectionD;
        return collectionD;
    }

    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return u3.this.i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            u3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return u3.this.i();
        }
    }

    class c extends e {
        c() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        Object a(int i) {
            return u3.this.d[i];
        }
    }

    void a(int i, float f2) {
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f2 > 0.0f, "Illegal load factor");
        int iA = ia.a(i, f2);
        this.f1047a = e(iA);
        this.f = f2;
        this.c = new Object[i];
        this.d = new Object[i];
        this.b = d(i);
        this.h = Math.max(1, (int) (iA * f2));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.g++;
        Arrays.fill(this.c, 0, this.i, (Object) null);
        Arrays.fill(this.d, 0, this.i, (Object) null);
        Arrays.fill(this.f1047a, -1);
        Arrays.fill(this.b, -1L);
        this.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object f(int i) {
        return a(this.c[i], a(this.b[i]));
    }

    void a(int i, Object obj, Object obj2, int i2) {
        this.b[i] = (i2 << 32) | 4294967295L;
        this.c[i] = obj;
        this.d[i] = obj2;
    }

    private Object a(Object obj, int i) {
        int iG = g() & i;
        int i2 = this.f1047a[iG];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (a(this.b[i2]) == i && Objects.equal(obj, this.c[i2])) {
                Object obj2 = this.d[i2];
                if (i3 == -1) {
                    this.f1047a[iG] = b(this.b[i2]);
                } else {
                    long[] jArr = this.b;
                    jArr[i3] = a(jArr[i3], b(jArr[i2]));
                }
                c(i2);
                this.i--;
                this.g++;
                return obj2;
            }
            int iB = b(this.b[i2]);
            if (iB == -1) {
                return null;
            }
            i3 = i2;
            i2 = iB;
        }
    }

    public static u3 a() {
        return new u3();
    }
}
