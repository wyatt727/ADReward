package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzccr zzc;

    zzccl(zzccr zzccrVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccr zzccrVar = this.zzc;
        if (zzccrVar.zzq != null) {
            zzccrVar.zzq.zzb(this.zza, this.zzb);
        }
    }
}
