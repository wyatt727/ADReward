package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05045u implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C05045u(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        this.A00.onAdClicked(ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        this.A00.onAdLoaded(ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        this.A00.onError(ad, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        this.A00.onLoggingImpression(ad);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) rewardedInterstitialAdListener).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) rewardedInterstitialAdListener).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof RewardedInterstitialAdExtendedListener) {
            ((RewardedInterstitialAdExtendedListener) rewardedInterstitialAdListener).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
