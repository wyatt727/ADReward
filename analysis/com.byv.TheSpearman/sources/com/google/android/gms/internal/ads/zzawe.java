package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzawe implements zzfqw {
    final /* synthetic */ zzfpp zza;

    zzawe(zzfpp zzfppVar) {
        this.zza = zzfppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
