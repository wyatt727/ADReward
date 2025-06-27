package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcxn implements zzcyq, zzdfs, zzddi, zzczg, zzazy {
    private final zzczi zza;
    private final zzffn zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgex zze = zzgex.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    zzcxn(zzczi zzcziVar, zzffn zzffnVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcziVar;
        this.zzb = zzffnVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
        zzffn zzffnVar = this.zzb;
        if (zzffnVar.zzf == 3) {
            return;
        }
        int i = zzffnVar.zzZ;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlf)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlf)).booleanValue() && zzm() && zzazxVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzds(zzbxq zzbxqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdfs
    public final void zzk() {
        if (this.zzb.zzf == 3) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbw)).booleanValue()) {
            zzffn zzffnVar = this.zzb;
            if (zzffnVar.zzZ == 2) {
                if (zzffnVar.zzr == 0) {
                    this.zza.zza();
                } else {
                    zzgee.zzr(this.zze, new zzcxm(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxl
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzh();
                        }
                    }, this.zzb.zzr, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfs
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }
}
