package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejv extends zzejs {
    private final zzcik zza;
    private final zzcxy zzb;
    private final zzemj zzc;
    private final zzdeh zzd;
    private final zzdjd zze;
    private final zzdbf zzf;
    private final ViewGroup zzg;
    private final zzddm zzh;
    private final zzekd zzi;
    private final zzego zzj;

    public zzejv(zzcik zzcikVar, zzcxy zzcxyVar, zzemj zzemjVar, zzdeh zzdehVar, zzdjd zzdjdVar, zzdbf zzdbfVar, ViewGroup viewGroup, zzddm zzddmVar, zzekd zzekdVar, zzego zzegoVar) {
        this.zza = zzcikVar;
        this.zzb = zzcxyVar;
        this.zzc = zzemjVar;
        this.zzd = zzdehVar;
        this.zze = zzdjdVar;
        this.zzf = zzdbfVar;
        this.zzg = viewGroup;
        this.zzh = zzddmVar;
        this.zzi = zzekdVar;
        this.zzj = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    protected final ListenableFuture zzc(zzfgi zzfgiVar, Bundle bundle, zzffn zzffnVar, zzffz zzffzVar) {
        zzcxy zzcxyVar = this.zzb;
        zzcxyVar.zzi(zzfgiVar);
        zzcxyVar.zzf(bundle);
        zzcxyVar.zzg(new zzcxs(zzffzVar, zzffnVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdv)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcik zzcikVar = this.zza;
        zzcxy zzcxyVar2 = this.zzb;
        zzcsl zzcslVarZze = zzcikVar.zze();
        zzcslVarZze.zzi(zzcxyVar2.zzj());
        zzcslVarZze.zzf(this.zzd);
        zzcslVarZze.zze(this.zzc);
        zzcslVarZze.zzd(this.zze);
        zzcslVarZze.zzg(new zzctn(this.zzf, this.zzh));
        zzcslVarZze.zzc(new zzcrj(this.zzg));
        zzcvd zzcvdVarZzd = zzcslVarZze.zzk().zzd();
        return zzcvdVarZzd.zzi(zzcvdVarZzd.zzj());
    }
}
