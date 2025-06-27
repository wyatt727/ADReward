package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeby extends zzece {
    private zzbwi zzh;

    zzeby(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            try {
                this.zzd.zzp().zze(this.zzh, new zzecd(this));
            } catch (RemoteException unused) {
                this.zza.zzd(new zzeal(1));
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteAdsServiceProxyClientTask.onConnected");
            this.zza.zzd(th);
        }
    }

    public final synchronized ListenableFuture zza(zzbwi zzbwiVar, long j) {
        if (this.zzb) {
            return zzgee.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbwiVar;
        zzb();
        ListenableFuture listenableFutureZzo = zzgee.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        listenableFutureZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, zzcbr.zzf);
        return listenableFutureZzo;
    }
}
