package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzczd extends zzdee implements zzcyu {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzczd(zzczc zzczcVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzczcVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzcyu) obj).zza(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzb() {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzcyu) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzc(final zzdit zzditVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzcyu) obj).zzc(zzditVar);
            }
        });
    }

    final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdit("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzks)).intValue(), TimeUnit.MILLISECONDS);
    }
}
