package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcdp implements Runnable {
    private final zzcdb zza;
    private boolean zzb = false;

    zzcdp(zzcdb zzcdbVar) {
        this.zza = zzcdbVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
