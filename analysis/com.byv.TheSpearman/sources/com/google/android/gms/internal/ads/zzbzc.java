package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbzc extends zzbyp {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbzd zzb;

    public zzbzc(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbzd zzbzdVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg() {
        zzbzd zzbzdVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbzdVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbzdVar);
    }
}
