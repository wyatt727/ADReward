package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
final class v3 extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f1080a;

    v3(Comparator comparator) {
        this.f1080a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f1080a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v3) {
            return this.f1080a.equals(((v3) obj).f1080a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1080a.hashCode();
    }

    public String toString() {
        return this.f1080a.toString();
    }
}
