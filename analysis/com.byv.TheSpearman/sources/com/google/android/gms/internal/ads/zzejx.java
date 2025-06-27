package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejx extends zzejs {
    private final zzcik zza;
    private final zzcxy zzb;
    private final zzemj zzc;
    private final zzdeh zzd;
    private final zzekd zze;
    private final zzego zzf;

    public zzejx(zzcik zzcikVar, zzcxy zzcxyVar, zzemj zzemjVar, zzdeh zzdehVar, zzekd zzekdVar, zzego zzegoVar) {
        this.zza = zzcikVar;
        this.zzb = zzcxyVar;
        this.zzc = zzemjVar;
        this.zzd = zzdehVar;
        this.zze = zzekdVar;
        this.zzf = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    protected final ListenableFuture zzc(zzfgi zzfgiVar, Bundle bundle, zzffn zzffnVar, zzffz zzffzVar) {
        zzcxy zzcxyVar = this.zzb;
        zzcxyVar.zzi(zzfgiVar);
        zzcxyVar.zzf(bundle);
        zzcxyVar.zzg(new zzcxs(zzffzVar, zzffnVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdv)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcik zzcikVar = this.zza;
        zzcxy zzcxyVar2 = this.zzb;
        zzdil zzdilVarZzg = zzcikVar.zzg();
        zzdilVarZzg.zze(zzcxyVar2.zzj());
        zzdilVarZzg.zzd(this.zzd);
        zzdilVarZzg.zzc(this.zzc);
        zzcvd zzcvdVarZza = zzdilVarZzg.zzf().zza();
        return zzcvdVarZza.zzi(zzcvdVarZza.zzj());
    }
}
