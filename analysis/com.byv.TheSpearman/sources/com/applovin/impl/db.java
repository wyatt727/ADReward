package com.applovin.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class db extends a2 implements Serializable {
    final transient cb d;
    final transient int f;

    @Override // com.applovin.impl.h
    Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.impl.h
    Set c() {
        throw new AssertionError("unreachable");
    }

    @Override // com.applovin.impl.pf
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ya d() {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public qp f() {
        return new a();
    }

    @Override // com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        Map f360a = jh.a();
        Comparator b;
        Comparator c;

        Collection b() {
            return new ArrayList();
        }

        public db a() {
            Collection collectionEntrySet = this.f360a.entrySet();
            Comparator comparator = this.b;
            if (comparator != null) {
                collectionEntrySet = tg.a(comparator).b().a(collectionEntrySet);
            }
            return bb.a(collectionEntrySet, this.c);
        }

        public b a(Object obj, Iterable iterable) {
            if (obj != null) {
                Collection collection = (Collection) this.f360a.get(obj);
                if (collection != null) {
                    for (Object obj2 : iterable) {
                        n3.a(obj, obj2);
                        collection.add(obj2);
                    }
                    return this;
                }
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection collectionB = b();
                while (it.hasNext()) {
                    Object next = it.next();
                    n3.a(obj, next);
                    collectionB.add(next);
                }
                this.f360a.put(obj, collectionB);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + rb.d(iterable));
        }

        public b a(Object obj, Object... objArr) {
            return a(obj, Arrays.asList(objArr));
        }
    }

    db(cb cbVar, int i) {
        this.d = cbVar;
        this.f = i;
    }

    @Override // com.applovin.impl.pf
    public int size() {
        return this.f;
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public cb a() {
        return this.d;
    }

    @Override // com.applovin.impl.h
    public boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ya values() {
        return (ya) super.values();
    }

    class a extends qp {

        /* renamed from: a, reason: collision with root package name */
        Iterator f359a;
        Iterator b = sb.a();

        a() {
            this.f359a = db.this.d.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext() || this.f359a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.b.hasNext()) {
                this.b = ((ya) this.f359a.next()).iterator();
            }
            return this.b.next();
        }
    }

    private static final class c extends ya {
        private final transient db b;

        c(db dbVar) {
            this.b = dbVar;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.b.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public qp iterator() {
            return this.b.f();
        }

        @Override // com.applovin.impl.ya
        int a(Object[] objArr, int i) {
            qp it = this.b.d.values().iterator();
            while (it.hasNext()) {
                i = ((ya) it.next()).a(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.b.size();
        }
    }
}
