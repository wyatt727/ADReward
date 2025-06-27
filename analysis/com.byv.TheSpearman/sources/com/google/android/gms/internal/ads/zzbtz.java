package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbtz extends zzbih {
    final /* synthetic */ zzbuc zza;

    /* synthetic */ zzbtz(zzbuc zzbucVar, zzbty zzbtyVar) {
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zze(zzbhy zzbhyVar, String str) {
        zzbuc zzbucVar = this.zza;
        if (zzbucVar.zzb == null) {
            return;
        }
        zzbucVar.zzb.onCustomClick(zzbucVar.zzf(zzbhyVar), str);
    }
}
