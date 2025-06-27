package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbvj extends zzbvd {
    final /* synthetic */ List zza;

    zzbvj(zzbvm zzbvmVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbve
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbve
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
