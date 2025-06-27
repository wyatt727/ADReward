package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdie implements zzhiv {
    private final zzhjm zza;

    public zzdie(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdgf((zzdix) this.zza.zzb(), zzcbr.zzf));
        zzhjd.zzb(setSingleton);
        return setSingleton;
    }
}
