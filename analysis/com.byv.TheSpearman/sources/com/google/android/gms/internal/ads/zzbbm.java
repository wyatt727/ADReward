package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbbm extends zzbbt {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbbm(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzd(zzbbr zzbbrVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbbn(zzbbrVar, this.zzb));
        }
    }
}
