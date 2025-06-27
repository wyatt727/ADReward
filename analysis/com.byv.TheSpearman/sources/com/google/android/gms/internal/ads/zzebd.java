package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzebd {
    private final zzgep zza;
    private final zzgep zzb;
    private final zzeby zzc;
    private final zzhip zzd;

    zzebd(zzgep zzgepVar, zzgep zzgepVar2, zzeby zzebyVar, zzhip zzhipVar) {
        this.zza = zzgepVar;
        this.zzb = zzgepVar2;
        this.zzc = zzebyVar;
        this.zzd = zzhipVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbwi zzbwiVar) throws Exception {
        return this.zzc.zza(zzbwiVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlm)).longValue());
    }

    final /* synthetic */ ListenableFuture zzb(zzbwi zzbwiVar, int i, zzeal zzealVar) throws Exception {
        return ((zzede) this.zzd.zzb()).zzb(zzbwiVar, i);
    }

    public final ListenableFuture zzc(final zzbwi zzbwiVar) {
        ListenableFuture listenableFutureZzf;
        String str = zzbwiVar.zzf;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            listenableFutureZzf = zzgee.zzg(new zzeal(1, "Ads service proxy force local"));
        } else {
            listenableFutureZzf = zzgee.zzf(zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzeba
                @Override // com.google.android.gms.internal.ads.zzgdk
                public final ListenableFuture zza() {
                    return this.zza.zza(zzbwiVar);
                }
            }, this.zza), ExecutionException.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebb
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable cause2 = executionException;
                    if (cause != null) {
                        cause2 = executionException.getCause();
                    }
                    return zzgee.zzg(cause2);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgee.zzf(listenableFutureZzf, zzeal.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebc
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbwiVar, callingUid, (zzeal) obj);
            }
        }, this.zzb);
    }
}
