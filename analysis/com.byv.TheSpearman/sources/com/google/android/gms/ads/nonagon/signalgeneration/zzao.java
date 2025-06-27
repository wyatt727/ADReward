package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzdzi;
import com.google.android.gms.internal.ads.zzgep;
import com.google.android.gms.internal.ads.zzhiv;
import com.google.android.gms.internal.ads.zzhjd;
import com.google.android.gms.internal.ads.zzhjm;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzao implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzao(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzan zzb() {
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzan(zzgepVar, ((zzdzi) this.zzb).zzb());
    }
}
