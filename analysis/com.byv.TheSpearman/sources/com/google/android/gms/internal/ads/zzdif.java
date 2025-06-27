package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdif implements zzhiv {
    private final zzdhp zza;
    private final zzhjm zzb;

    public zzdif(zzdhp zzdhpVar, zzhjm zzhjmVar) {
        this.zza = zzdhpVar;
        this.zzb = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
