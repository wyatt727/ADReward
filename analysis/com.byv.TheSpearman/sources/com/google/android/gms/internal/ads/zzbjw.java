package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzbjw implements zzbky {
    public final /* synthetic */ zzdgn zza;
    public final /* synthetic */ zzcpk zzb;

    public /* synthetic */ zzbjw(zzdgn zzdgnVar, zzcpk zzcpkVar) {
        this.zza = zzdgnVar;
        this.zzb = zzcpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        zzbkx.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
        } else {
            final zzcpk zzcpkVar = this.zzb;
            zzgee.zzr(zzgee.zzn(zzgdv.zzu(zzbkx.zza(zzcgmVar, str)), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzbjy
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj2) {
                    zzcpk zzcpkVar2;
                    String str2 = (String) obj2;
                    zzbky zzbkyVar = zzbkx.zza;
                    return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjR)).booleanValue() && (zzcpkVar2 = zzcpkVar) != null && zzcpk.zzj(str)) ? zzcpkVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgee.zzh(str2);
                }
            }, zzcbr.zza), new zzbkm(zzcgmVar), zzcbr.zza);
        }
    }
}
