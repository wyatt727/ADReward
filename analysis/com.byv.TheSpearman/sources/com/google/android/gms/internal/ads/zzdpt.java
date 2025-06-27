package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpt {
    private final zzcyo zza;
    private final zzczx zzb;
    private final zzdak zzc;
    private final zzdaw zzd;
    private final zzddk zze;
    private final zzffn zzf;
    private final zzffq zzg;
    private final zzcpk zzh;

    public zzdpt(zzcyo zzcyoVar, zzczx zzczxVar, zzdak zzdakVar, zzdaw zzdawVar, zzddk zzddkVar, zzffn zzffnVar, zzffq zzffqVar, zzcpk zzcpkVar) {
        this.zza = zzcyoVar;
        this.zzb = zzczxVar;
        this.zzc = zzdakVar;
        this.zzd = zzdawVar;
        this.zze = zzddkVar;
        this.zzf = zzffnVar;
        this.zzg = zzffqVar;
        this.zzh = zzcpkVar;
    }

    public final void zza(zzdpx zzdpxVar) {
        final zzczx zzczxVar = this.zzb;
        zzdpk zzdpkVar = zzdpxVar.zza;
        Objects.requireNonNull(zzczxVar);
        zzdpkVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdps
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzczxVar.zzb();
            }
        });
        zzdpxVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
