package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcyc implements zzhiv {
    private final zzcya zza;
    private final zzhjm zzb;

    public zzcyc(zzcya zzcyaVar, zzhjm zzhjmVar) {
        this.zza = zzcyaVar;
        this.zzb = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = this.zza.zza(((zzciq) this.zzb).zza());
        zzhjd.zzb(contextZza);
        return contextZza;
    }
}
