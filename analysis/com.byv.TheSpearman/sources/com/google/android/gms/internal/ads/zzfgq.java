package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzfgq implements zzbky {
    public final /* synthetic */ zzdgn zza;
    public final /* synthetic */ zzcpk zzb;
    public final /* synthetic */ zzfmt zzc;
    public final /* synthetic */ zzefd zzd;

    public /* synthetic */ zzfgq(zzdgn zzdgnVar, zzcpk zzcpkVar, zzfmt zzfmtVar, zzefd zzefdVar) {
        this.zza = zzdgnVar;
        this.zzb = zzcpkVar;
        this.zzc = zzfmtVar;
        this.zzd = zzefdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        zzbkx.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
            return;
        }
        zzefd zzefdVar = this.zzd;
        zzfmt zzfmtVar = this.zzc;
        zzgee.zzr(zzbkx.zza(zzcgmVar, str), new zzfgs(zzcgmVar, this.zzb, zzfmtVar, zzefdVar), zzcbr.zza);
    }
}
