package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcwu implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzcwu(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvy zzcvyVar = (zzcvy) this.zza.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        zzfzs zzfzsVarZzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfE)).booleanValue() ? zzfzs.zzo(new zzdgf(zzcvyVar, zzgepVar)) : zzfzs.zzn();
        zzhjd.zzb(zzfzsVarZzo);
        return zzfzsVarZzo;
    }
}
