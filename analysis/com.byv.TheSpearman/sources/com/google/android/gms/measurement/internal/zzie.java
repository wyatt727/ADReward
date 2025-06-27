package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoe;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzie implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    zzie(zzhq zzhqVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, NumberFormatException {
        this.zzb.zza.zzr();
        zzni zzniVar = this.zzb.zza;
        zzo zzoVar = this.zza;
        zzniVar.zzl().zzt();
        zzniVar.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        if (zzniVar.zze().zza(zzbf.zzcp)) {
            zzniVar.zzf(zzoVar);
            zzniVar.zze(zzoVar);
            return;
        }
        zziq zziqVarZza = zziq.zza(zzoVar.zzt, zzoVar.zzy);
        zziq zziqVarZzb = zzniVar.zzb(zzoVar.zza);
        zzniVar.zzj().zzp().zza("Setting storage consent, package, consent", zzoVar.zza, zziqVarZza);
        zzniVar.zza(zzoVar.zza, zziqVarZza);
        if ((!zzoe.zza() || !zzniVar.zze().zza(zzbf.zzdf)) && zziqVarZza.zzc(zziqVarZzb)) {
            zzniVar.zzd(zzoVar);
        }
        zzav zzavVarZza = zzav.zza(zzoVar.zzz);
        if (zzav.zza.equals(zzavVarZza)) {
            return;
        }
        zzniVar.zzj().zzp().zza("Setting DMA consent. package, consent", zzoVar.zza, zzavVarZza);
        zzniVar.zza(zzoVar.zza, zzavVarZza);
    }
}
