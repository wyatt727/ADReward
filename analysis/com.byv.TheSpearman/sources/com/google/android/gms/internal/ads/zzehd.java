package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzehd implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzehd(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehc zzb() {
        return new zzehc((Context) this.zza.zzb(), (zzcra) this.zzb.zzb());
    }
}
