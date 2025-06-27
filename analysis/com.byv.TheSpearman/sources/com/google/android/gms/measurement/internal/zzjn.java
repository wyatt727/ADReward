package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjn implements FutureCallback<Object> {
    private final /* synthetic */ zzna zza;
    private final /* synthetic */ zzjc zzb;

    zzjn(zzjc zzjcVar, zzna zznaVar) {
        this.zza = zznaVar;
        this.zzb = zzjcVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) throws IllegalStateException {
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbf.zzcj)) {
            this.zzb.zzap();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
            return;
        }
        this.zzb.zzaj().add(this.zza);
        if (this.zzb.zzi > 64) {
            this.zzb.zzi = 1;
            this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzfz.zza(this.zzb.zzg().zzad()), zzfz.zza(th.toString()));
            return;
        }
        this.zzb.zzj().zzu().zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzfz.zza(this.zzb.zzg().zzad()), zzfz.zza(String.valueOf(this.zzb.zzi)), zzfz.zza(th.toString()));
        zzjc zzjcVar = this.zzb;
        zzjc.zzb(zzjcVar, zzjcVar.zzi);
        this.zzb.zzi <<= 1;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj) throws IllegalStateException {
        this.zzb.zzt();
        if (this.zzb.zze().zza(zzbf.zzcj)) {
            SparseArray<Long> sparseArrayZzh = this.zzb.zzk().zzh();
            sparseArrayZzh.put(this.zza.zzc, Long.valueOf(this.zza.zzb));
            this.zzb.zzk().zza(sparseArrayZzh);
            this.zzb.zzh = false;
            this.zzb.zzi = 1;
            this.zzb.zzj().zzc().zza("Successfully registered trigger URI", this.zza.zza);
            this.zzb.zzap();
            return;
        }
        this.zzb.zzh = false;
        this.zzb.zzap();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }
}
