package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class h implements pf {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f478a;
    private transient Collection b;
    private transient Map c;

    h() {
    }

    abstract Map b();

    abstract Set c();

    abstract Collection d();

    abstract Iterator f();

    public Set e() {
        Set set = this.f478a;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.f478a = setC;
        return setC;
    }

    @Override // com.applovin.impl.pf
    public Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        Collection collectionD = d();
        this.b = collectionD;
        return collectionD;
    }

    class a extends AbstractCollection {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return h.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }
    }

    @Override // com.applovin.impl.pf
    public Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.c = mapB;
        return mapB;
    }

    public boolean equals(Object obj) {
        return sf.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    public boolean a(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
