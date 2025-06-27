package com.applovin.impl;

import java.io.Serializable;

/* loaded from: classes.dex */
class za extends g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f1234a;
    final Object b;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    za(Object obj, Object obj2) {
        this.f1234a = obj;
        this.b = obj2;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getKey() {
        return this.f1234a;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }
}
