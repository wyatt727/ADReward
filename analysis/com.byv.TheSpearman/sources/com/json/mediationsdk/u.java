package com.json.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.json.e2;
import com.json.i9;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.json.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.bidding.BiddingDataCallback;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.sdk.BannerAdapterInterface;
import com.json.mediationsdk.sdk.BannerSmashListener;
import com.json.mediationsdk.sdk.InterstitialSmashListener;
import com.json.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class u implements AdapterAPSDataInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterMetaDataInterface, AdapterSettingsInterface, BannerSmashListener, e2, InterstitialSmashListener, NativeAdSmashListener, RewardedVideoSmashListener {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractAdapter f1999a;
    private NetworkInitializationListener b;

    public u(AbstractAdapter abstractAdapter) {
        this.f1999a = abstractAdapter;
    }

    @Override // com.json.e2
    public Map<String, Object> a(AdData adData) throws JSONException {
        JSONObject jSONObjectA = i9.a(adData.getConfiguration());
        JSONObject jSONObjectA2 = i9.a(adData.getAdUnitData());
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f1999a.getRewardedVideoBiddingData(jSONObjectA, jSONObjectA2);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f1999a.getInterstitialBiddingData(jSONObjectA, jSONObjectA2);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f1999a.getBannerBiddingData(jSONObjectA, jSONObjectA2);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return this.f1999a.getNativeAdBiddingData(jSONObjectA, jSONObjectA2);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        return null;
    }

    void a() {
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (TextUtils.isEmpty(pluginType)) {
            return;
        }
        this.f1999a.setPluginData(pluginType);
    }

    @Override // com.json.e2
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) throws JSONException {
        JSONObject jSONObjectA = i9.a(adData.getConfiguration());
        JSONObject jSONObjectA2 = i9.a(adData.getAdUnitData());
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f1999a.collectRewardedVideoBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f1999a.collectInterstitialBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f1999a.collectBannerBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            this.f1999a.collectNativeAdBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return this.f1999a.getVersion();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return this.f1999a.getBannerLoadWhileShowSupportState(networkSettings.getBannerSettings());
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return this.f1999a.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings());
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return this.f1999a.getCoreSDKVersion();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) throws JSONException {
        this.b = networkInitializationListener;
        String str = (String) adData.getAdUnitData().get("userId");
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        a();
        JSONObject jSONObjectA = i9.a(adData.getConfiguration());
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f1999a.initRewardedVideoWithCallback("", str, jSONObjectA, this);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            Integer num = adData.getInt("instanceType");
            if (num == null || num.intValue() != 1) {
                this.f1999a.initInterstitialForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f1999a.initInterstitial("", str, jSONObjectA, this);
                return;
            }
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            Integer num2 = adData.getInt("instanceType");
            if (num2 == null || num2.intValue() != 1) {
                this.f1999a.initBannerForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f1999a.initBanners("", str, jSONObjectA, this);
                return;
            }
        }
        if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
            return;
        }
        Integer num3 = adData.getInt("instanceType");
        if (num3 == null || num3.intValue() != 1) {
            this.f1999a.initNativeAdForBidding("", str, jSONObjectA, this);
        } else {
            this.f1999a.initNativeAds("", str, jSONObjectA, this);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return this.f1999a.isUsingActivityBeforeImpression(ad_unit);
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.b;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterface = this.f1999a;
        if (bannerAdapterInterface instanceof SetAPSInterface) {
            ((SetAPSInterface) bannerAdapterInterface).setAPSData(ad_unit, jSONObject);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
        this.f1999a.setAdapterDebug(Boolean.valueOf(z));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
        this.f1999a.setConsent(z);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        this.f1999a.setMetaData(str, list);
    }
}
