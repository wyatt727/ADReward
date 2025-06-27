package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejq extends zzejs {
    private final zzcik zza;
    private final zzdjd zzb;
    private final zzcxy zzc;
    private final zzdeh zzd;
    private final zzekd zze;
    private final zzego zzf;

    public zzejq(zzcik zzcikVar, zzdjd zzdjdVar, zzcxy zzcxyVar, zzdeh zzdehVar, zzekd zzekdVar, zzego zzegoVar) {
        this.zza = zzcikVar;
        this.zzb = zzdjdVar;
        this.zzc = zzcxyVar;
        this.zzd = zzdehVar;
        this.zze = zzekdVar;
        this.zzf = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    protected final ListenableFuture zzc(zzfgi zzfgiVar, Bundle bundle, zzffn zzffnVar, zzffz zzffzVar) {
        zzcxy zzcxyVar = this.zzc;
        zzcxyVar.zzi(zzfgiVar);
        zzcxyVar.zzf(bundle);
        zzcxyVar.zzg(new zzcxs(zzffzVar, zzffnVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdv)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzcik zzcikVar = this.zza;
        zzcxy zzcxyVar2 = this.zzc;
        zzdjh zzdjhVarZzh = zzcikVar.zzh();
        zzdjhVarZzh.zzf(zzcxyVar2.zzj());
        zzdjhVarZzh.zze(this.zzd);
        zzdjhVarZzh.zzd(this.zzb);
        zzdjhVarZzh.zzc(new zzcrj(null));
        zzcvd zzcvdVarZza = zzdjhVarZzh.zzg().zza();
        return zzcvdVarZza.zzi(zzcvdVarZza.zzj());
    }
}
