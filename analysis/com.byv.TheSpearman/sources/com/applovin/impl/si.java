package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: classes.dex */
final class si extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final si f995a = new si();

    @Override // com.applovin.impl.tg
    public tg c() {
        return tg.a();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    private si() {
    }
}
