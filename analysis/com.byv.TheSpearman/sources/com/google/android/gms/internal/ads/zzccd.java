package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public class zzccd {
    private final zzcbw zza;
    private final AtomicInteger zzb;

    public zzccd() {
        zzcbw zzcbwVar = new zzcbw();
        this.zza = zzcbwVar;
        this.zzb = new AtomicInteger(0);
        zzgee.zzr(zzcbwVar, new zzccb(this), zzcbr.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhI)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcca zzccaVar, zzcby zzcbyVar) {
        zzgee.zzr(this.zza, new zzccc(this, zzccaVar, zzcbyVar), zzcbr.zzf);
    }
}
