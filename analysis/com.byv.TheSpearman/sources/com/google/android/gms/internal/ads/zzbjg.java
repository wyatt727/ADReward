package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbjg extends zzbih {
    final /* synthetic */ zzbjj zza;

    /* synthetic */ zzbjg(zzbjj zzbjjVar, zzbjf zzbjfVar) {
        this.zza = zzbjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zze(zzbhy zzbhyVar, String str) {
        zzbjj zzbjjVar = this.zza;
        if (zzbjjVar.zzb == null) {
            return;
        }
        zzbjjVar.zzb.zzb(zzbjjVar.zzf(zzbhyVar), str);
    }
}
