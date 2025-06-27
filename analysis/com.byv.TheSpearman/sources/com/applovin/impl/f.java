package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.h;
import com.applovin.impl.qc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
abstract class f extends com.applovin.impl.h implements Serializable {
    private transient Map d;
    private transient int f;

    abstract Collection a(Object obj, Collection collection);

    abstract Collection c(Collection collection);

    @Override // com.applovin.impl.h
    Collection d() {
        return new h.a();
    }

    @Override // com.applovin.impl.h
    Iterator f() {
        return new a();
    }

    abstract Collection g();

    static /* synthetic */ int b(f fVar) {
        int i2 = fVar.f;
        fVar.f = i2 + 1;
        return i2;
    }

    static /* synthetic */ int c(f fVar) {
        int i2 = fVar.f;
        fVar.f = i2 - 1;
        return i2;
    }

    protected f(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.d = map;
    }

    static /* synthetic */ int b(f fVar, int i2) {
        int i3 = fVar.f - i2;
        fVar.f = i3;
        return i3;
    }

    @Override // com.applovin.impl.pf
    public int size() {
        return this.f;
    }

    @Override // com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.d.get(obj);
        if (collection == null) {
            Collection collectionB = b(obj);
            if (collectionB.add(obj2)) {
                this.f++;
                this.d.put(obj, collectionB);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f++;
        return true;
    }

    static /* synthetic */ int a(f fVar, int i2) {
        int i3 = fVar.f + i2;
        fVar.f = i3;
        return i3;
    }

    @Override // com.applovin.impl.pf
    public void clear() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.d.clear();
        this.f = 0;
    }

    class j extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        final Object f405a;
        Collection b;
        final j c;
        final Collection d;

        j(Object obj, Collection collection, j jVar) {
            this.f405a = obj;
            this.b = collection;
            this.c = jVar;
            this.d = jVar == null ? null : jVar.c();
        }

        void e() {
            Collection collection;
            j jVar = this.c;
            if (jVar != null) {
                jVar.e();
                if (this.c.c() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.b.isEmpty() || (collection = (Collection) f.this.d.get(this.f405a)) == null) {
                    return;
                }
                this.b = collection;
            }
        }

        void f() {
            j jVar = this.c;
            if (jVar != null) {
                jVar.f();
            } else if (this.b.isEmpty()) {
                f.this.d.remove(this.f405a);
            }
        }

        Object d() {
            return this.f405a;
        }

        void a() {
            j jVar = this.c;
            if (jVar == null) {
                f.this.d.put(this.f405a, this.b);
            } else {
                jVar.a();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.b.size();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.b.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.b.toString();
        }

        Collection c() {
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            e();
            return new a();
        }

        class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f406a;
            final Collection b;

            a() {
                Collection collection = j.this.b;
                this.b = collection;
                this.f406a = f.b(collection);
            }

            void b() {
                j.this.e();
                if (j.this.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f406a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f406a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f406a.remove();
                f.c(f.this);
                j.this.f();
            }

            Iterator a() {
                b();
                return this.f406a;
            }

            a(Iterator it) {
                this.b = j.this.b;
                this.f406a = it;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e();
            boolean zIsEmpty = this.b.isEmpty();
            boolean zAdd = this.b.add(obj);
            if (zAdd) {
                f.b(f.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        j b() {
            return this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.b.addAll(collection);
            if (zAddAll) {
                f.a(f.this, this.b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            e();
            return this.b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            f.b(f.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean zRemove = this.b.remove(obj);
            if (zRemove) {
                f.c(f.this);
                f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.b.removeAll(collection);
            if (zRemoveAll) {
                f.a(f.this, this.b.size() - size);
                f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.b.retainAll(collection);
            if (zRetainAll) {
                f.a(f.this, this.b.size() - size);
                f();
            }
            return zRetainAll;
        }
    }

    Collection b(Object obj) {
        return g();
    }

    final List a(Object obj, List list, j jVar) {
        if (list instanceof RandomAccess) {
            return new g(obj, list, jVar);
        }
        return new k(obj, list, jVar);
    }

    class k extends j implements List {
        k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        List g() {
            return (List) c();
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i, collection);
            if (zAddAll) {
                f.a(f.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i) {
            e();
            return g().get(i);
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            e();
            return g().set(i, obj);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            e();
            boolean zIsEmpty = c().isEmpty();
            g().add(i, obj);
            f.b(f.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public Object remove(int i) {
            e();
            Object objRemove = g().remove(i);
            f.c(f.this);
            f();
            return objRemove;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            e();
            return f.this.a(d(), g().subList(i, i2), b() == null ? this : b());
        }

        private class a extends j.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = k.this.isEmpty();
                c().add(obj);
                f.b(f.this);
                if (zIsEmpty) {
                    k.this.a();
                }
            }

            public a(int i) {
                super(k.this.g().listIterator(i));
            }
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            e();
            return new a(i);
        }
    }

    private class g extends k implements RandomAccess {
        g(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    final Set i() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new C0025f((NavigableMap) this.d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.d);
        }
        return new d(this.d);
    }

    private class d extends qc.d {
        d(Map map) {
            super(map);
        }

        class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry f404a;
            final /* synthetic */ Iterator b;

            a(Iterator it) {
                this.b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.b.next();
                this.f404a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                n3.a(this.f404a != null);
                Collection collection = (Collection) this.f404a.getValue();
                this.b.remove();
                f.b(f.this, collection.size());
                collection.clear();
                this.f404a = null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                f.b(f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            sb.a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator b(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    private class i extends d implements SortedSet {
        public SortedSet headSet(Object obj) {
            return f.this.new i(b().headMap(obj));
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return f.this.new i(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return f.this.new i(b().tailMap(obj));
        }

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }
    }

    /* renamed from: com.applovin.impl.f$f, reason: collision with other inner class name */
    class C0025f extends i implements NavigableSet {
        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return f.this.new C0025f(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return f.this.new C0025f(b().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return f.this.new C0025f(b().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return f.this.new C0025f(b().tailMap(obj, z));
        }

        C0025f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.f.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return sb.c(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return sb.c(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }
    }

    private abstract class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f403a;
        Object b = null;
        Collection c = null;
        Iterator d = sb.c();

        abstract Object a(Object obj, Object obj2);

        c() {
            this.f403a = f.this.d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f403a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f403a.next();
                this.b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.c = collection;
                this.d = collection.iterator();
            }
            return a(this.b, this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            if (this.c.isEmpty()) {
                this.f403a.remove();
            }
            f.c(f.this);
        }
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
    public Collection values() {
        return super.values();
    }

    class a extends c {
        @Override // com.applovin.impl.f.c
        Object a(Object obj, Object obj2) {
            return obj2;
        }

        a() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) qc.d(this.d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f -= size;
        }
    }

    final Map h() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.d);
        }
        return new b(this.d);
    }

    private class b extends qc.f {
        final transient Map c;

        b(Map map) {
            this.c = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return qc.b(this.c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return f.this.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.c.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.c == f.this.d) {
                f.this.clear();
            } else {
                sb.a((Iterator) new C0024b());
            }
        }

        Map.Entry a(Map.Entry entry) {
            Object key = entry.getKey();
            return qc.a(key, f.this.a(key, (Collection) entry.getValue()));
        }

        @Override // com.applovin.impl.qc.f
        protected Set a() {
            return new a();
        }

        class a extends qc.c {
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return b.this.new C0024b();
            }

            a() {
            }

            @Override // com.applovin.impl.qc.c
            Map a() {
                return b.this;
            }

            @Override // com.applovin.impl.qc.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return o3.a(b.this.c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                f.this.c(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b, reason: collision with other inner class name */
        class C0024b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f402a;
            Collection b;

            C0024b() {
                this.f402a = b.this.c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f402a.hasNext();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f402a.next();
                this.b = (Collection) entry.getValue();
                return b.this.a(entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                n3.a(this.b != null);
                this.f402a.remove();
                f.b(f.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) qc.c(this.c, obj);
            if (collection == null) {
                return null;
            }
            return f.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionG = f.this.g();
            collectionG.addAll(collection);
            f.b(f.this, collection.size());
            collection.clear();
            return collectionG;
        }
    }

    private class h extends b implements SortedMap {
        SortedSet f;

        SortedSet c() {
            return f.this.new i(d());
        }

        public SortedMap headMap(Object obj) {
            return f.this.new h(d().headMap(obj));
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return f.this.new h(d().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return f.this.new h(d().tailMap(obj));
        }

        h(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap d() {
            return (SortedMap) this.c;
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return d().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return d().firstKey();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return d().lastKey();
        }

        @Override // com.applovin.impl.f.b, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetC = c();
            this.f = sortedSetC;
            return sortedSetC;
        }
    }

    class e extends h implements NavigableMap {
        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return f.this.new e(d().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.f.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet c() {
            return f.this.new C0025f(d());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return f.this.new e(d().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return f.this.new e(d().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return f.this.new e(d().tailMap(obj, z));
        }

        e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.f.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = d().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return d().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = d().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return d().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = d().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return d().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = d().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return d().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        @Override // com.applovin.impl.f.h, com.applovin.impl.f.b, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        Map.Entry a(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionG = f.this.g();
            collectionG.addAll((Collection) entry.getValue());
            it.remove();
            return qc.a(entry.getKey(), f.this.c(collectionG));
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }
}
