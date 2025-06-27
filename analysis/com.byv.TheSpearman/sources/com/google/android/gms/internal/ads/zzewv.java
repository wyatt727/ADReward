package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewv implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzewv(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewu zzb() {
        Context contextZza = ((zzciq) this.zza).zza();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzewu(contextZza, zzgepVar, ((zzhjj) this.zzc).zzb(), (zzflh) this.zzd.zzb(), (zzduh) this.zze.zzb());
    }
}
