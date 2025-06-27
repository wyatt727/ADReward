package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdyn {
    private final zzgep zza;
    private final zzgep zzb;
    private final zzdzu zzc;
    private final zzhip zzd;

    public zzdyn(zzgep zzgepVar, zzgep zzgepVar2, zzdzu zzdzuVar, zzhip zzhipVar) {
        this.zza = zzgepVar;
        this.zzb = zzgepVar2;
        this.zzc = zzdzuVar;
        this.zzd = zzhipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzeam zza(zzbxd zzbxdVar) throws Exception {
        zzcbw zzcbwVar;
        final zzdzu zzdzuVar = this.zzc;
        synchronized (zzdzuVar.zzb) {
            if (zzdzuVar.zzc) {
                zzcbwVar = zzdzuVar.zza;
            } else {
                zzdzuVar.zzc = true;
                zzdzuVar.zze = zzbxdVar;
                zzdzuVar.zzf.checkAvailabilityAndConnect();
                zzdzuVar.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdzuVar.zza();
                    }
                }, zzcbr.zzf);
                zzcbwVar = zzdzuVar.zza;
            }
        }
        return (zzeam) zzcbwVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfz)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzb(final zzbxd zzbxdVar, int i, zzeal zzealVar) throws Exception {
        return zzgee.zzn(((zzecu) this.zzd.zzb()).zzc(zzbxdVar, i), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(new zzeam((InputStream) obj, zzbxdVar));
            }
        }, this.zzb);
    }

    public final ListenableFuture zzc(final zzbxd zzbxdVar) {
        ListenableFuture listenableFutureZzf;
        String str = zzbxdVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            listenableFutureZzf = zzgee.zzg(new zzeal(1));
        } else {
            listenableFutureZzf = zzgee.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(zzbxdVar);
                }
            }), ExecutionException.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdyl
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzgee.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgee.zzf(listenableFutureZzf, zzeal.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdym
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbxdVar, callingUid, (zzeal) obj);
            }
        }, this.zzb);
    }
}
