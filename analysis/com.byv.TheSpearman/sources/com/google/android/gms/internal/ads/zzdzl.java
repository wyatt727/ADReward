package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdzl implements zzgea {
    final /* synthetic */ zzdzm zza;

    zzdzl(zzdzm zzdzmVar) {
        this.zza = zzdzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
            Matcher matcher = zzdzm.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffz zzffzVar = (zzffz) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
            this.zza.zzf.zzi(zzffzVar.zzb.zzb.zze);
            this.zza.zzf.zzj(zzffzVar.zzb.zzb.zzf);
        }
    }
}
