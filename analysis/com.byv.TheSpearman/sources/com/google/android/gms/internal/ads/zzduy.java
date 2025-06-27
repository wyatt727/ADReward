package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduy implements zzhiv {
    private final zzduv zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzduy(zzduv zzduvVar, zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzduvVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdvf zzdvfVar = (zzdvf) this.zzb.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        Set setZzc = zzduv.zzc(zzdvfVar, zzgepVar);
        zzhjd.zzb(setZzc);
        return setZzc;
    }
}
