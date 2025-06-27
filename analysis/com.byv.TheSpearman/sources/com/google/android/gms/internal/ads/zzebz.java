package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzebz implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzebz(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeby zzb() {
        return new zzeby(((zzciq) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
