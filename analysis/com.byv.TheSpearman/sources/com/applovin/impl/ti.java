package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: classes.dex */
final class ti extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final tg f1034a;

    public String toString() {
        return this.f1034a + ".reverse()";
    }

    ti(tg tgVar) {
        this.f1034a = (tg) Preconditions.checkNotNull(tgVar);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f1034a.compare(obj2, obj);
    }

    @Override // com.applovin.impl.tg
    public tg c() {
        return this.f1034a;
    }

    public int hashCode() {
        return -this.f1034a.hashCode();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ti) {
            return this.f1034a.equals(((ti) obj).f1034a);
        }
        return false;
    }
}
