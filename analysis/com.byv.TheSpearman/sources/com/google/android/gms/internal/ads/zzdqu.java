package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdg;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdqu implements zzhiv {
    private final zzhjm zza;

    public zzdqu(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdg.zza.EnumC0145zza enumC0145zza = ((zzcyh) this.zza).zza().zzo.zza == 3 ? zzbdg.zza.EnumC0145zza.REWARDED_INTERSTITIAL : zzbdg.zza.EnumC0145zza.REWARD_BASED_VIDEO_AD;
        zzhjd.zzb(enumC0145zza);
        return enumC0145zza;
    }
}
