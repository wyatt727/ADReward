package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class a extends Optional {

    /* renamed from: a, reason: collision with root package name */
    static final a f210a = new a();

    private a() {
    }

    static Optional a() {
        return f210a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set asSet() {
        return Collections.emptySet();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object or(Object obj) {
        return Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object orNull() {
        return null;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional transform(Function function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional or(Optional optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object or(Supplier supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
