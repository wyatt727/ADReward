package com.json.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.logger.LogListener;
import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.InitializationListener;
import com.json.mediationsdk.sdk.InterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.json.mediationsdk.sdk.OfferwallListener;
import com.json.mediationsdk.sdk.RewardedVideoListener;
import com.json.mediationsdk.sdk.RewardedVideoManualListener;
import com.json.mediationsdk.sdk.SegmentListener;
import com.my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class IronSource {

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER(AdFormat.BANNER),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        private String f1900a;

        AD_UNIT(String str) {
            this.f1900a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f1900a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        p.p().b(impressionDataListener);
    }

    public static void clearRewardedVideoServerParameters() {
        p.p().b();
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        return p.p().b(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return p.p().a(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        p.p().a(ironSourceBannerLayout);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        p.p().c(str);
    }

    public static String getAdvertiserId(Context context) {
        return p.p().b(context);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return p.p().a(context);
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return p.p().g(str);
    }

    @Deprecated
    public static void getOfferwallCredits() {
        p.p().getOfferwallCredits();
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return p.p().i(str);
    }

    public static void init(Context context, String str) {
        init(context, str, (AD_UNIT[]) null);
    }

    public static void init(Context context, String str, InitializationListener initializationListener) {
        init(context, str, initializationListener, null);
    }

    public static void init(Context context, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        p.p().a(context, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Context context, String str, AD_UNIT... ad_unitArr) {
        p.p().a(context, str, false, null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        p.p().a(context, str, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return p.p().u(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return p.p().f(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return p.p().k(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return p.p().v(str);
    }

    public static boolean isInterstitialReady() {
        return p.p().F();
    }

    @Deprecated
    public static boolean isOfferwallAvailable() {
        return p.p().isOfferwallAvailable();
    }

    public static boolean isRewardedVideoAvailable() {
        return p.p().M();
    }

    public static boolean isRewardedVideoPlacementCapped(String str) {
        return p.p().w(str);
    }

    public static void launchTestSuite(Context context) {
        p.p().c(context);
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        p.p().b(ironSourceBannerLayout);
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        p.p().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        p.p().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        p.p().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        p.p().a(activity, str);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        p.p().b(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        p.p().b(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        p.p().a(activity, str, str2);
    }

    public static void loadInterstitial() {
        p.p().R();
    }

    public static void loadRewardedVideo() {
        p.p().S();
    }

    public static void onPause(Activity activity) {
        p.p().a(activity);
    }

    public static void onResume(Activity activity) {
        p.p().b(activity);
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        p.p().a(impressionDataListener);
    }

    public static void removeInterstitialListener() {
        p.p().f();
    }

    @Deprecated
    public static void removeOfferwallListener() {
        p.p().e();
    }

    public static void removeRewardedVideoListener() {
        p.p().d();
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        p.p().a(str, jSONObject);
    }

    public static void setAdaptersDebug(boolean z) {
        p.p().a(z);
    }

    public static void setConsent(boolean z) {
        p.p().b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return p.p().e(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        p.p().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        p.p().a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        p.p().a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        p.p().a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        p.p().a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        p.p().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        p.p().a(logListener);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        p.p().a(rewardedVideoManualListener);
    }

    public static void setMediationType(String str) {
        p.p().h(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        p.p().a(str, arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        p.p().a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        p.p().b(str, jSONObject);
    }

    @Deprecated
    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        p.p().a(offerwallListener);
    }

    @Deprecated
    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        p.p().a(rewardedVideoListener);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        p.p().a(map);
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        p.p().a(ironSourceSegment);
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        p.p().a(segmentListener);
    }

    public static void setUserId(String str) {
        p.p().x(str);
    }

    public static void setWaterfallConfiguration(WaterfallConfiguration waterfallConfiguration, AD_UNIT ad_unit) {
        p.p().a(ad_unit, waterfallConfiguration);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        p.p().a(context, z);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        p.p().b(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        p.p().a(str);
    }

    public static void showInterstitial() {
        p.p().c((Activity) null);
    }

    public static void showInterstitial(Activity activity) {
        p.p().c(activity);
    }

    public static void showInterstitial(Activity activity, String str) {
        p.p().c(activity, str);
    }

    public static void showInterstitial(String str) {
        p.p().c(null, str);
    }

    @Deprecated
    public static void showOfferwall() {
        p.p().c();
    }

    @Deprecated
    public static void showOfferwall(String str) {
        p.p().j(str);
    }

    public static void showRewardedVideo() {
        p.p().d((Activity) null);
    }

    public static void showRewardedVideo(Activity activity) {
        p.p().d(activity);
    }

    public static void showRewardedVideo(Activity activity, String str) {
        p.p().f(activity, str);
    }

    public static void showRewardedVideo(String str) {
        p.p().f(null, str);
    }
}
