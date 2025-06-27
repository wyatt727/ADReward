package com.google.android.gms.internal.nearby;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzhx<T> extends zzhy<T> {
    static final zzhx<Object> zza = new zzhx<>();

    private zzhx() {
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.nearby.zzhy
    public final boolean zza() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzhy
    public final T zzb() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
