package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekn implements zzhiv {
    private final zzekm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzekn(zzekm zzekmVar, zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4) {
        this.zza = zzekmVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
        this.zzd = zzhjmVar3;
        this.zze = zzhjmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzekg) this.zzc).zzb(), (zzego) this.zzd.zzb(), (zzfmt) this.zze.zzb());
    }
}
