package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdss implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzdss(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeQ)).booleanValue() ? Collections.singleton(new zzdgf(((zzdtl) this.zzb).zzb(), zzgepVar)) : Collections.emptySet();
        zzhjd.zzb(setSingleton);
        return setSingleton;
    }
}
