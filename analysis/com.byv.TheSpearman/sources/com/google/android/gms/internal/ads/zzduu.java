package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduu implements zzhiv {
    private final zzhjm zza;

    public zzduu(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdut((Clock) this.zza.zzb());
    }
}
