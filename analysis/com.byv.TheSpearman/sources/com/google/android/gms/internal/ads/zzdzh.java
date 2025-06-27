package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzh {
    private final ScheduledExecutorService zza;
    private final zzgep zzb;
    private final zzgep zzc;
    private final zzdzy zzd;
    private final zzhip zze;

    public zzdzh(ScheduledExecutorService scheduledExecutorService, zzgep zzgepVar, zzgep zzgepVar2, zzdzy zzdzyVar, zzhip zzhipVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgepVar;
        this.zzc = zzgepVar2;
        this.zzd = zzdzyVar;
        this.zze = zzhipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzeam zza(zzbxd zzbxdVar) throws Exception {
        return (zzeam) this.zzd.zzb(zzbxdVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfz)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzb(final zzbxd zzbxdVar, int i, Throwable th) throws Exception {
        return zzgee.zzn(((zzecu) this.zze.zzb()).zzd(zzbxdVar, i), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(new zzeam((InputStream) obj, zzbxdVar));
            }
        }, this.zzb);
    }

    public final ListenableFuture zzc(final zzbxd zzbxdVar) {
        ListenableFuture listenableFutureZzb;
        String str = zzbxdVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            listenableFutureZzb = zzgee.zzg(new zzeal(1));
        } else {
            listenableFutureZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhB)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(zzbxdVar);
                }
            }) : this.zzd.zzb(zzbxdVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgee.zzf((zzgdv) zzgee.zzo(zzgdv.zzu(listenableFutureZzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfz)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbxdVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
