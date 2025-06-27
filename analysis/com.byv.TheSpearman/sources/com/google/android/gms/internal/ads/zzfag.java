package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfag implements zzewr {
    private final zzcbh zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgep zze;
    private final String zzf;
    private final zzcaw zzg;

    zzfag(zzcbh zzcbhVar, boolean z, boolean z2, zzcaw zzcawVar, zzgep zzgepVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzcbhVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzcawVar;
        this.zze = zzgepVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhk)).booleanValue() && this.zzc) {
            return zzgee.zzh(null);
        }
        if (!this.zzb) {
            return zzgee.zzh(null);
        }
        return zzgee.zze(zzgee.zzo(zzgee.zzm(zzgee.zzh(null), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzfah(str);
            }
        }, this.zze), ((Long) zzbgg.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    final /* synthetic */ zzfah zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}
