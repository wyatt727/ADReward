package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaqo implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaqq zzc;

    zzaqo(zzaqq zzaqqVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzaqq zzaqqVar = this.zzc;
        zzaqqVar.zza.zzb(zzaqqVar.toString());
    }
}
