package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaqg implements Runnable {
    private final zzaqq zza;
    private final zzaqw zzb;
    private final Runnable zzc;

    public zzaqg(zzaqq zzaqqVar, zzaqw zzaqwVar, Runnable runnable) {
        this.zza = zzaqqVar;
        this.zzb = zzaqwVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzaqw zzaqwVar = this.zzb;
        if (zzaqwVar.zzc()) {
            this.zza.zzo(zzaqwVar.zza);
        } else {
            this.zza.zzn(zzaqwVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
