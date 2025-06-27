package com.google.android.gms.internal.ads;

import com.my.tracker.ads.AdFormat;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdjj implements zzhiv {
    private final zzhjm zza;

    public zzdjj(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdjg) this.zza).zza().zze() != null ? Collections.singleton(AdFormat.BANNER) : Collections.emptySet();
        zzhjd.zzb(setSingleton);
        return setSingleton;
    }
}
