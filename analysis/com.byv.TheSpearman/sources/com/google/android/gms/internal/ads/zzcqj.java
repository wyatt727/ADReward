package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqj implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzcqj(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzazu zzazuVar = (zzazu) this.zza.zzb();
        zzbpz zzbpzVar = (zzbpz) this.zzb.zzb();
        zzgep zzgepVarZza = zzfja.zza();
        zzhjd.zzb(zzgepVarZza);
        return new zzcqc(zzazuVar.zzc(), zzbpzVar, zzgepVarZza);
    }
}
