package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcuk {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcuk(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(final zzcuk zzcukVar, List list, final zzgea zzgeaVar) {
        if (list == null || list.isEmpty()) {
            zzcukVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuf
                @Override // java.lang.Runnable
                public final void run() {
                    zzgeaVar.zza(new zzdyi(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZzh = zzgee.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            listenableFutureZzh = zzgee.zzn(zzgee.zzf(listenableFutureZzh, Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcug
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    zzgeaVar.zza((Throwable) obj);
                    return zzgee.zzh(null);
                }
            }, zzcukVar.zza), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcuh
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zza(zzgeaVar, listenableFuture, (zzctv) obj);
                }
            }, zzcukVar.zza);
        }
        zzgee.zzr(listenableFutureZzh, new zzcuj(zzcukVar, zzgeaVar), zzcukVar.zza);
    }

    final /* synthetic */ ListenableFuture zza(zzgea zzgeaVar, ListenableFuture listenableFuture, zzctv zzctvVar) throws Exception {
        if (zzctvVar != null) {
            zzgeaVar.zzb(zzctvVar);
        }
        return zzgee.zzo(listenableFuture, ((Long) zzbgf.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgea zzgeaVar) {
        zzgee.zzr(this.zzc, new zzcui(this, zzgeaVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
