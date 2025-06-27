package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcwa implements zzdeb, zzdae {
    private final Clock zza;
    private final zzcwc zzb;
    private final zzfgi zzc;
    private final String zzd;

    zzcwa(Clock clock, zzcwc zzcwcVar, zzfgi zzfgiVar, String str) {
        this.zza = clock;
        this.zzb = zzcwcVar;
        this.zzc = zzfgiVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        zzfgi zzfgiVar = this.zzc;
        this.zzb.zzd(zzfgiVar.zzf, this.zzd, this.zza.elapsedRealtime());
    }
}
