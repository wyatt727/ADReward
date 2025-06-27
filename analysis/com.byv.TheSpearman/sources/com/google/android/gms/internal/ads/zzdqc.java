package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdqc {
    private final zzcyo zza;
    private final zzczx zzb;
    private final zzdak zzc;
    private final zzdaw zzd;
    private final zzddk zze;
    private final zzdgl zzf;
    private final zzduh zzg;
    private final zzfmt zzh;
    private final zzefd zzi;
    private final zzcpk zzj;

    zzdqc(zzcyo zzcyoVar, zzczx zzczxVar, zzdak zzdakVar, zzdaw zzdawVar, zzddk zzddkVar, zzdgl zzdglVar, zzduh zzduhVar, zzfmt zzfmtVar, zzefd zzefdVar, zzcpk zzcpkVar) {
        this.zza = zzcyoVar;
        this.zzb = zzczxVar;
        this.zzc = zzdakVar;
        this.zzd = zzdawVar;
        this.zze = zzddkVar;
        this.zzf = zzdglVar;
        this.zzg = zzduhVar;
        this.zzh = zzfmtVar;
        this.zzi = zzefdVar;
        this.zzj = zzcpkVar;
    }

    public final void zza(zzdqd zzdqdVar, zzcgm zzcgmVar) {
        zzdqa zzdqaVar = zzdqdVar.zza;
        final zzczx zzczxVar = this.zzb;
        Objects.requireNonNull(zzczxVar);
        zzdqaVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzczxVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjU)).booleanValue() || zzcgmVar == null || zzcgmVar.zzN() == null) {
            return;
        }
        zzcic zzcicVarZzN = zzcgmVar.zzN();
        zzcicVarZzN.zzI(this.zzj, this.zzi, this.zzh);
        zzcicVarZzN.zzK(this.zzj, this.zzi, this.zzg);
    }
}
