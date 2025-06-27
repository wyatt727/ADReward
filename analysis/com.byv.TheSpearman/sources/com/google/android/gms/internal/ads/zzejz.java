package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejz extends zzejs {
    private final zzcik zza;
    private final zzcxy zzb;
    private final zzdeh zzc;
    private final zzekd zzd;

    @Nullable
    private final zzfga zze;
    private final zzego zzf;

    public zzejz(zzcik zzcikVar, zzcxy zzcxyVar, zzdeh zzdehVar, @Nullable zzfga zzfgaVar, zzekd zzekdVar, zzego zzegoVar) {
        this.zza = zzcikVar;
        this.zzb = zzcxyVar;
        this.zzc = zzdehVar;
        this.zze = zzfgaVar;
        this.zzd = zzekdVar;
        this.zzf = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    protected final ListenableFuture zzc(zzfgi zzfgiVar, Bundle bundle, zzffn zzffnVar, zzffz zzffzVar) {
        zzfga zzfgaVar;
        zzcxy zzcxyVar = this.zzb;
        zzcxyVar.zzi(zzfgiVar);
        zzcxyVar.zzf(bundle);
        zzcxyVar.zzg(new zzcxs(zzffzVar, zzffnVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdu)).booleanValue() && (zzfgaVar = this.zze) != null) {
            this.zzb.zzh(zzfgaVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdv)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcik zzcikVar = this.zza;
        zzcxy zzcxyVar2 = this.zzb;
        zzdqq zzdqqVarZzi = zzcikVar.zzi();
        zzdqqVarZzi.zzd(zzcxyVar2.zzj());
        zzdqqVarZzi.zzc(this.zzc);
        zzcvd zzcvdVarZzb = zzdqqVarZzi.zze().zzb();
        return zzcvdVarZzb.zzi(zzcvdVarZzb.zzj());
    }
}
