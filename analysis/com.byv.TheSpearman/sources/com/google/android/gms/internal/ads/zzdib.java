package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdib implements zzhiv {
    private final zzdhp zza;
    private final zzhjm zzb;

    public zzdib(zzdhp zzdhpVar, zzhjm zzhjmVar) {
        this.zza = zzdhpVar;
        this.zzb = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdgf((zzcxn) this.zzb.zzb(), zzcbr.zzf));
        zzhjd.zzb(setSingleton);
        return setSingleton;
    }
}
