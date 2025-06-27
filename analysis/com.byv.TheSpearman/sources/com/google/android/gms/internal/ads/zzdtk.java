package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdtk implements zzfko {
    private final Map zza;
    private final zzbcx zzb;

    zzdtk(zzbcx zzbcxVar, Map map) {
        this.zza = map;
        this.zzb = zzbcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzd(zzfkh zzfkhVar, String str) {
        if (this.zza.containsKey(zzfkhVar)) {
            this.zzb.zzb(((zzdtj) this.zza.get(zzfkhVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdC(zzfkh zzfkhVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdD(zzfkh zzfkhVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfkhVar)) {
            this.zzb.zzb(((zzdtj) this.zza.get(zzfkhVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdE(zzfkh zzfkhVar, String str) {
        if (this.zza.containsKey(zzfkhVar)) {
            this.zzb.zzb(((zzdtj) this.zza.get(zzfkhVar)).zza);
        }
    }
}
