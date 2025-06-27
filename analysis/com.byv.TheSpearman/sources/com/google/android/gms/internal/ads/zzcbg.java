package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcbg {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcbg() {
    }

    /* synthetic */ zzcbg(zzcbf zzcbfVar) {
    }

    public final void zza() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzga)).longValue() <= jCurrentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = jCurrentTimeMillis2;
            }
        }
    }
}
