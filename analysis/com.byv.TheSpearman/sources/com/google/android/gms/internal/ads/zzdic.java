package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdic implements zzhiv {
    private final zzdhp zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzdic(zzdhp zzdhpVar, zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzdhpVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzz zzb() {
        return new zzbzz(((zzciq) this.zzb).zza(), ((zzcyh) this.zzc).zza().zzf);
    }
}
