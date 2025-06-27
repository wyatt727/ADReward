package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgbc extends zzfzs {
    private final transient zzfzq zza;
    private final transient zzfzn zzb;

    zzgbc(zzfzq zzfzqVar, zzfzn zzfznVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi
    public final zzfzn zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi
    /* renamed from: zze */
    public final zzgbt iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final boolean zzf() {
        return true;
    }
}
