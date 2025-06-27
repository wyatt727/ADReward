package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdjb implements zzcty {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhjm zzd;
    private final zzdlj zze;

    zzdjb(Map map, Map map2, Map map3, zzhjm zzhjmVar, zzdlj zzdljVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhjmVar;
        this.zze = zzdljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcty
    public final zzegj zza(int i, String str) {
        zzegj zzegjVarZza;
        zzegj zzegjVar = (zzegj) this.zza.get(str);
        if (zzegjVar != null) {
            return zzegjVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzeix zzeixVar = (zzeix) this.zzc.get(str);
            if (zzeixVar != null) {
                return new zzegk(zzeixVar, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzcua
                    @Override // com.google.android.gms.internal.ads.zzfwf
                    public final Object apply(Object obj) {
                        return new zzcud((List) obj);
                    }
                });
            }
            zzegjVarZza = (zzegj) this.zzb.get(str);
            if (zzegjVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzegjVarZza = ((zzcty) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzegk(zzegjVarZza, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzcub
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return new zzcud((zzctv) obj);
            }
        });
    }
}
