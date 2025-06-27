package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgaz extends zzfzn {
    static final zzfzn zza = new zzgaz(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzgaz(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfwr.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzn, com.google.android.gms.internal.ads.zzfzi
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final Object[] zzg() {
        return this.zzb;
    }
}
