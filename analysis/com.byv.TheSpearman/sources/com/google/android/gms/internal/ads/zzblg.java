package com.google.android.gms.internal.ads;

import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzblg implements zzgea {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzblk zzd;

    zzblg(zzblk zzblkVar, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str) {
        this.zza = zzaVar;
        this.zzb = map;
        this.zzc = str;
        this.zzd = zzblkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws URISyntaxException {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        Map map = this.zzb;
        String str = this.zzc;
        this.zzd.zzh((String) obj, zzaVar, map, str);
    }
}
