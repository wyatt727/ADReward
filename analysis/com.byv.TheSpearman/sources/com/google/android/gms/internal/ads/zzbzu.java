package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbzu implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzbzu(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzt zzb() {
        return new zzbzt((Clock) this.zza.zzb(), (zzbzr) this.zzb.zzb());
    }
}
