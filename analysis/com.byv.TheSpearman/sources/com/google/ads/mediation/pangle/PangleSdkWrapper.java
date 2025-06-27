package com.google.ads.mediation.pangle;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;

/* loaded from: classes2.dex */
public class PangleSdkWrapper {
    public void init(Context context, PAGConfig pAGConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        PAGSdk.init(context, pAGConfig, pAGInitCallback);
    }

    boolean isInitSuccess() {
        return PAGSdk.isInitSuccess();
    }

    void setChildDirected(int i) {
        PAGConfig.setChildDirected(i);
    }

    void setGdprConsent(int i) {
        PAGConfig.setGDPRConsent(i);
    }

    void setDoNotSell(int i) {
        PAGConfig.setDoNotSell(i);
    }

    void setUserData(String str) {
        PAGConfig.setUserData(str);
    }

    void getBiddingToken(BiddingTokenCallback biddingTokenCallback) {
        PAGSdk.getBiddingToken(biddingTokenCallback);
    }

    String getSdkVersion() {
        return PAGSdk.getSDKVersion();
    }

    public void loadBannerAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        PAGBannerAd.loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
    }

    public void loadInterstitialAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        PAGInterstitialAd.loadAd(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener);
    }

    public void loadNativeAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        PAGNativeAd.loadAd(str, pAGNativeRequest, pAGNativeAdLoadListener);
    }

    public void loadRewardedAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        PAGRewardedAd.loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
    }

    public void loadAppOpenAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        PAGAppOpenAd.loadAd(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener);
    }
}
