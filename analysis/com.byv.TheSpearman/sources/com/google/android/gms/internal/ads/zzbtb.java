package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbtb implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {
    final zzbqu zza;

    zzbtb(zzbqu zzbquVar) {
        this.zza = zzbquVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(AdError adError) {
        try {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mediated ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
            this.zza.zzk(adError.zza());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        try {
            this.zza.zzp();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.zza.zzt(new zzbza(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        try {
            this.zza.zzv();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        try {
            this.zza.zzw();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        try {
            this.zza.zzx();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        try {
            this.zza.zzy();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        try {
            this.zza.zzm();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String str) {
        try {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mediated ad failed to show: " + str);
            this.zza.zzl(str);
        } catch (RemoteException unused) {
        }
    }
}
