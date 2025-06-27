package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeyt implements zzewr {
    private final Context zza;
    private final zzcbh zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcay zzf;

    public zzeyt(zzcay zzcayVar, int i, Context context, zzcbh zzcbhVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzcayVar;
        this.zza = context;
        this.zzb = zzcbhVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return zzgee.zze((zzgdv) zzgee.zzo(zzgee.zzm(zzgdv.zzu(zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // com.google.android.gms.internal.ads.zzgdk
            public final ListenableFuture zza() {
                return zzgee.zzh(null);
            }
        }, this.zzd)), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeyr
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzeyu(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaV)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, zzgev.zzb());
    }

    final /* synthetic */ zzeyu zzc(Exception exc) {
        this.zzb.zzw(exc, "AttestationTokenSignal");
        return null;
    }
}
