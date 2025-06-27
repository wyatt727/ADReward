package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes2.dex */
public class RewardedInterstitialAd implements FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedInterstitialAdApi mRewardedInterstitialAdApi;

    public interface RewardedInterstitialLoadAdConfig extends Ad.LoadAdConfig {
    }

    public interface RewardedInterstitialShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    public interface RewardedInterstitialAdLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        RewardedInterstitialLoadAdConfig build();

        RewardedInterstitialAdLoadConfigBuilder withAdListener(RewardedInterstitialAdListener rewardedInterstitialAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        RewardedInterstitialAdLoadConfigBuilder withBid(String str);

        RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z);

        RewardedInterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData);

        /* renamed from: com.facebook.ads.RewardedInterstitialAd$RewardedInterstitialAdLoadConfigBuilder$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public interface RewardedInterstitialAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        RewardedInterstitialShowAdConfig build();

        RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i);

        /* renamed from: com.facebook.ads.RewardedInterstitialAd$RewardedInterstitialAdShowConfigBuilder$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public RewardedInterstitialAd(Context context, String str) {
        this.mRewardedInterstitialAdApi = DynamicLoaderFactory.makeLoader(context).createRewardedInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mRewardedInterstitialAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mRewardedInterstitialAdApi.loadAd();
    }

    public void loadAd(RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        this.mRewardedInterstitialAdApi.loadAd(rewardedInterstitialLoadAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mRewardedInterstitialAdApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedInterstitialAdApi.show();
    }

    public boolean show(RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        return this.mRewardedInterstitialAdApi.show(rewardedInterstitialShowAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedInterstitialAdApi.destroy();
    }

    public boolean isAdLoaded() {
        return this.mRewardedInterstitialAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mRewardedInterstitialAdApi.getPlacementId();
    }

    public int getVideoDuration() {
        return this.mRewardedInterstitialAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedInterstitialAdApi.buildShowAdConfig();
    }
}
