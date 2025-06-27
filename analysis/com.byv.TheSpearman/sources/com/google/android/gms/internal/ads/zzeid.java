package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeid implements zzegj {
    private final zzcsm zza;
    private final zzehk zzb;
    private final zzgep zzc;
    private final zzcys zzd;
    private final ScheduledExecutorService zze;
    private final zzduc zzf;

    public zzeid(zzcsm zzcsmVar, zzehk zzehkVar, zzcys zzcysVar, ScheduledExecutorService scheduledExecutorService, zzgep zzgepVar, zzduc zzducVar) {
        this.zza = zzcsmVar;
        this.zzb = zzehkVar;
        this.zzd = zzcysVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgepVar;
        this.zzf = zzducVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeib
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzffzVar, zzffnVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzbiv zzbivVarZza = zzffzVar.zza.zza.zza();
        boolean zZzb = this.zzb.zzb(zzffzVar, zzffnVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlE)).booleanValue()) {
            this.zzf.zzb().put("has_dbl", zzbivVarZza != null ? "1" : "0");
            this.zzf.zzb().put("crdb", true != zZzb ? "0" : "1");
        }
        return zzbivVarZza != null && zZzb;
    }

    final /* synthetic */ zzcrm zzc(final zzffz zzffzVar, final zzffn zzffnVar) throws Exception {
        return this.zza.zzb(new zzcul(zzffzVar, zzffnVar, null), new zzctd(zzffzVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeia
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzffzVar, zzffnVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(zzffz zzffzVar, zzffn zzffnVar) {
        zzgee.zzr(zzgee.zzo(this.zzb.zza(zzffzVar, zzffnVar), zzffnVar.zzS, TimeUnit.SECONDS, this.zze), new zzeic(this), this.zzc);
    }
}
