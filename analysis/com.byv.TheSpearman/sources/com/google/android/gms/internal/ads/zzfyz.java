package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfyz extends zzfzc {
    zzfyz() {
        super(null);
    }

    static final zzfzc zzg(int i) {
        return i < 0 ? zzfzc.zzb : i > 0 ? zzfzc.zzc : zzfzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzb(int i, int i2) {
        return zzg(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzc(long j, long j2) {
        return zzg(j < j2 ? -1 : j > j2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzd(Object obj, Object obj2, Comparator comparator) {
        return zzg(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zze(boolean z, boolean z2) {
        return zzg(zzgch.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final zzfzc zzf(boolean z, boolean z2) {
        return zzg(zzgch.zza(z2, z));
    }
}
