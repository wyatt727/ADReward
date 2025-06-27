package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class tg implements Comparator {
    protected tg() {
    }

    public tg c() {
        return new ti(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public static tg a(Comparator comparator) {
        if (comparator instanceof tg) {
            return (tg) comparator;
        }
        return new v3(comparator);
    }

    tg b() {
        return a(qc.a());
    }

    public ab a(Iterable iterable) {
        return ab.a((Comparator) this, iterable);
    }

    public static tg a() {
        return vf.f1093a;
    }

    public tg a(Function function) {
        return new p2(function, this);
    }
}
