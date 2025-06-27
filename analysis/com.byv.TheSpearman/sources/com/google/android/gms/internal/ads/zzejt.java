package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejt extends zzejs {
    private final zzcik zza;
    private final zzcxy zzb;
    private final zzdeh zzc;
    private final zzekd zzd;
    private final zzego zze;

    zzejt(zzcik zzcikVar, zzcxy zzcxyVar, zzdeh zzdehVar, zzekd zzekdVar, zzego zzegoVar) {
        this.zza = zzcikVar;
        this.zzb = zzcxyVar;
        this.zzc = zzdehVar;
        this.zzd = zzekdVar;
        this.zze = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    protected final ListenableFuture zzc(zzfgi zzfgiVar, Bundle bundle, zzffn zzffnVar, zzffz zzffzVar) {
        zzcxy zzcxyVar = this.zzb;
        zzcxyVar.zzi(zzfgiVar);
        zzcxyVar.zzf(bundle);
        zzcxyVar.zzg(new zzcxs(zzffzVar, zzffnVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdv)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcik zzcikVar = this.zza;
        zzcxy zzcxyVar2 = this.zzb;
        zzcqz zzcqzVarZzd = zzcikVar.zzd();
        zzcqzVarZzd.zzd(zzcxyVar2.zzj());
        zzcqzVarZzd.zzc(this.zzc);
        zzcvd zzcvdVarZzb = zzcqzVarZzd.zze().zzb();
        return zzcvdVarZzb.zzi(zzcvdVarZzb.zzj());
    }
}
