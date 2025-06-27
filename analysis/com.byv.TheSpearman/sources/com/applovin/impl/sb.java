package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class sb {
    public static String d(Iterator it) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private enum c implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            n3.a(false);
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static Object b(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    static rp b() {
        return b.f;
    }

    static Object c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static Iterator c() {
        return c.INSTANCE;
    }

    private static final class b extends com.applovin.impl.c {
        static final rp f = new b(new Object[0], 0, 0, 0);
        private final Object[] c;
        private final int d;

        b(Object[] objArr, int i, int i2, int i3) {
            super(i2, i3);
            this.c = objArr;
            this.d = i;
        }

        @Override // com.applovin.impl.c
        protected Object a(int i) {
            return this.c[this.d + i];
        }
    }

    class a extends qp {

        /* renamed from: a, reason: collision with root package name */
        boolean f888a;
        final /* synthetic */ Object b;

        a(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f888a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f888a) {
                this.f888a = true;
                return this.b;
            }
            throw new NoSuchElementException();
        }
    }

    static void a(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Object a(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean a(Iterator it, Collection collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    static qp a() {
        return b();
    }

    public static qp a(Object obj) {
        return new a(obj);
    }
}
