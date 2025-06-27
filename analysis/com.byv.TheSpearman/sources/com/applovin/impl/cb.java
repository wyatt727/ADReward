package com.applovin.impl;

import com.applovin.impl.ya;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class cb implements Map, Serializable {
    static final Map.Entry[] d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient eb f324a;
    private transient eb b;
    private transient ya c;

    cb() {
    }

    public static cb h() {
        return ji.i;
    }

    abstract eb b();

    abstract eb c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    abstract ya d();

    abstract boolean f();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f325a;
        Object[] b;
        int c;
        boolean d;

        public a() {
            this(4);
        }

        public cb a() {
            b();
            this.d = true;
            return ji.a(this.c, this.b);
        }

        void b() {
            int i;
            if (this.f325a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, this.c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, tg.a(this.f325a).a(qc.c()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, ya.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        public a a(Object obj, Object obj2) {
            a(this.c + 1);
            n3.a(obj, obj2);
            Object[] objArr = this.b;
            int i = this.c;
            int i2 = i * 2;
            objArr[i2] = obj;
            objArr[i2 + 1] = obj2;
            this.c = i + 1;
            return this;
        }

        public a a(Map.Entry entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a a(Iterable iterable) {
            if (iterable instanceof Collection) {
                a(this.c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((Map.Entry) it.next());
            }
            return this;
        }
    }

    public static cb a(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public eb entrySet() {
        eb ebVar = this.f324a;
        if (ebVar != null) {
            return ebVar;
        }
        eb ebVarB = b();
        this.f324a = ebVarB;
        return ebVarB;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public eb keySet() {
        eb ebVar = this.b;
        if (ebVar != null) {
            return ebVar;
        }
        eb ebVarC = c();
        this.b = ebVarC;
        return ebVarC;
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ya values() {
        ya yaVar = this.c;
        if (yaVar != null) {
            return yaVar;
        }
        ya yaVarD = d();
        this.c = yaVarD;
        return yaVarD;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return qc.a((Map) this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return nj.a(entrySet());
    }

    public String toString() {
        return qc.a(this);
    }

    public static cb a(Map map) {
        if ((map instanceof cb) && !(map instanceof SortedMap)) {
            cb cbVar = (cb) map;
            if (!cbVar.f()) {
                return cbVar;
            }
        }
        return a(map.entrySet());
    }

    public static a a() {
        return new a();
    }
}
