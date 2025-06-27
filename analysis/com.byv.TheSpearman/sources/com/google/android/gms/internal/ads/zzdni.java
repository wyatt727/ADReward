package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdni implements zzhiv {
    private final zzdnb zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzdni(zzdnb zzdnbVar, zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzdnbVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdgf(((zzdqi) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
