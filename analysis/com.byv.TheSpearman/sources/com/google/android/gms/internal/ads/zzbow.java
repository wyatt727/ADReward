package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbow extends zzccd {
    private final Object zza = new Object();
    private final zzbpb zzb;
    private boolean zzc;

    public zzbow(zzbpb zzbpbVar) {
        this.zzb = zzbpbVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbot(this), new zzcbz());
            zzj(new zzbou(this), new zzbov(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}
