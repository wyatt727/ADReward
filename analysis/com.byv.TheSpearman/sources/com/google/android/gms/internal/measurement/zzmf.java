package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmf extends zzmn {
    private final /* synthetic */ zzmb zza;

    @Override // com.google.android.gms.internal.measurement.zzmn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzmd(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmf(zzmb zzmbVar) {
        super(zzmbVar);
        this.zza = zzmbVar;
    }
}
