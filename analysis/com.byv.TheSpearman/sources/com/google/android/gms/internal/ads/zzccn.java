package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzccr zzc;

    zzccn(zzccr zzccrVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccr zzccrVar = this.zzc;
        if (zzccrVar.zzq != null) {
            zzccrVar.zzq.zzj(this.zza, this.zzb);
        }
    }
}
