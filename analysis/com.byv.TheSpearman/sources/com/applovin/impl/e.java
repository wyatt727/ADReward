package com.applovin.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class e extends f implements ac {
    protected e(Map map) {
        super(map);
    }

    @Override // com.applovin.impl.f
    Collection c(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.applovin.impl.f, com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
    public Map a() {
        return super.a();
    }

    @Override // com.applovin.impl.h
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.f
    Collection a(Object obj, Collection collection) {
        return a(obj, (List) collection, null);
    }
}
