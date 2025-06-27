package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqt implements zzewr {
    final zzcbh zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgep zzd;
    private final Context zze;

    zzeqt(Context context, zzcbh zzcbhVar, ScheduledExecutorService scheduledExecutorService, zzgep zzgepVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcJ)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcbhVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcF)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcK)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcG)).booleanValue()) {
                    return zzgee.zzm(zzftv.zza(this.zzb.getAppSetIdInfo(), null), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeqq
                        @Override // com.google.android.gms.internal.ads.zzfwf
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzequ(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcbr.zzf);
                }
                Task<AppSetIdInfo> taskZza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcJ)).booleanValue() ? zzfhn.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgee.zzh(new zzequ(null, -1));
                }
                ListenableFuture listenableFutureZzn = zzgee.zzn(zzftv.zza(taskZza, null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeqr
                    @Override // com.google.android.gms.internal.ads.zzgdl
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgee.zzh(new zzequ(null, -1)) : zzgee.zzh(new zzequ(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcbr.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcH)).booleanValue()) {
                    listenableFutureZzn = zzgee.zzo(listenableFutureZzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcI)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgee.zze(listenableFutureZzn, Exception.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeqs
                    @Override // com.google.android.gms.internal.ads.zzfwf
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzequ(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgee.zzh(new zzequ(null, -1));
    }
}
