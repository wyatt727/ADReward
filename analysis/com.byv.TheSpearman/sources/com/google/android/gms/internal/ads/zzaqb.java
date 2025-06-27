package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaqb implements Runnable {
    final /* synthetic */ zzaqq zza;
    final /* synthetic */ zzaqc zzb;

    zzaqb(zzaqc zzaqcVar, zzaqq zzaqqVar) {
        this.zza = zzaqqVar;
        this.zzb = zzaqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
