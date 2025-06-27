package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccm implements Runnable {
    final /* synthetic */ zzccr zza;

    zzccm(zzccr zzccrVar) {
        this.zza = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccr zzccrVar = this.zza;
        if (zzccrVar.zzq != null) {
            zzccrVar.zzq.zzh();
        }
    }
}
