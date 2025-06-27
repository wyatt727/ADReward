package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbvk extends zzbvd {
    final /* synthetic */ List zza;

    zzbvk(zzbvm zzbvmVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbve
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbve
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
