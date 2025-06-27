package com.applovin.impl;

import com.applovin.impl.cb;
import com.applovin.impl.db;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class bb extends db implements ac {
    public static a k() {
        return new a();
    }

    public static bb l() {
        return p7.g;
    }

    public static final class a extends db.b {
        @Override // com.applovin.impl.db.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj, Iterable iterable) {
            super.a(obj, iterable);
            return this;
        }

        public bb c() {
            return (bb) super.a();
        }

        public a b(Object obj, Object... objArr) {
            super.a(obj, objArr);
            return this;
        }
    }

    static bb a(Collection collection, Comparator comparator) {
        ab abVarA;
        if (collection.isEmpty()) {
            return l();
        }
        cb.a aVar = new cb.a(collection.size());
        int size = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                abVarA = ab.a(collection2);
            } else {
                abVarA = ab.a(comparator, (Iterable) collection2);
            }
            if (!abVarA.isEmpty()) {
                aVar.a(key, abVarA);
                size += abVarA.size();
            }
        }
        return new bb(aVar.a(), size);
    }

    bb(cb cbVar, int i) {
        super(cbVar, i);
    }

    public ab b(Object obj) {
        ab abVar = (ab) this.d.get(obj);
        return abVar == null ? ab.h() : abVar;
    }
}
