package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes3.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzb) {
            zzh zzhVar = this.zza;
            if (zzhVar.zzc != null) {
                zzhVar.zzc.onCanceled();
            }
        }
    }
}
