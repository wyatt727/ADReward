package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcwh implements zzhiv {
    private final zzcwg zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzcwh(zzcwg zzcwgVar, zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzcwgVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzbzo) this.zzc.zzb(), null);
    }
}
