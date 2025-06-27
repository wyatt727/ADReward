package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: classes.dex */
final class vf extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final vf f1093a = new vf();

    @Override // com.applovin.impl.tg
    public tg c() {
        return si.f995a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    private vf() {
    }
}
