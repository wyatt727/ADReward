package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: classes.dex */
final class p2 extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Function f771a;
    final tg b;

    public String toString() {
        return this.b + ".onResultOf(" + this.f771a + ")";
    }

    p2(Function function, tg tgVar) {
        this.f771a = (Function) Preconditions.checkNotNull(function);
        this.b = (tg) Preconditions.checkNotNull(tgVar);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.b.compare(this.f771a.apply(obj), this.f771a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f771a.equals(p2Var.f771a) && this.b.equals(p2Var.b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f771a, this.b);
    }
}
