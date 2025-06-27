package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes2.dex */
public class AppLovinBannerAd implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private static final String TAG = "AppLovinBannerAd";
    private final AppLovinAdFactory appLovinAdFactory;
    private AppLovinAdViewWrapper appLovinAdViewWrapper;
    private final AppLovinInitializer appLovinInitializer;
    private MediationBannerAdCallback bannerAdCallback;
    private Context context;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback;
    private final MediationBannerAdConfiguration mediationBannerAdConfiguration;
    private AppLovinSdk sdk;
    private String zoneId;

    private AppLovinBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        this.mediationBannerAdConfiguration = mediationBannerAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
    }

    public static AppLovinBannerAd newInstance(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        return new AppLovinBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
    }

    public void loadAd() {
        this.context = this.mediationBannerAdConfiguration.getContext();
        final Bundle serverParameters = this.mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = this.mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(this.context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(TAG, adError2.getMessage());
            this.mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.appLovinInitializer.initialize(this.context, string, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinBannerAd.1
            @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
            public void onInitializeSuccess(String str) {
                AppLovinBannerAd appLovinBannerAd = AppLovinBannerAd.this;
                appLovinBannerAd.sdk = appLovinBannerAd.appLovinInitializer.retrieveSdk(serverParameters, AppLovinBannerAd.this.context);
                AppLovinBannerAd.this.zoneId = AppLovinUtils.retrieveZoneId(serverParameters);
                Log.d(AppLovinBannerAd.TAG, "Requesting banner of size " + appLovinAdSizeAppLovinAdSizeFromAdMobAdSize + " for zone: " + AppLovinBannerAd.this.zoneId);
                AppLovinBannerAd appLovinBannerAd2 = AppLovinBannerAd.this;
                appLovinBannerAd2.appLovinAdViewWrapper = appLovinBannerAd2.appLovinAdFactory.createAdView(AppLovinBannerAd.this.sdk, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, AppLovinBannerAd.this.context);
                AppLovinBannerAd.this.appLovinAdViewWrapper.setAdDisplayListener(AppLovinBannerAd.this);
                AppLovinBannerAd.this.appLovinAdViewWrapper.setAdClickListener(AppLovinBannerAd.this);
                AppLovinBannerAd.this.appLovinAdViewWrapper.setAdViewEventListener(AppLovinBannerAd.this);
                if (!TextUtils.isEmpty(AppLovinBannerAd.this.zoneId)) {
                    AppLovinBannerAd.this.sdk.getAdService().loadNextAdForZoneId(AppLovinBannerAd.this.zoneId, AppLovinBannerAd.this);
                } else {
                    AppLovinBannerAd.this.sdk.getAdService().loadNextAd(appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, AppLovinBannerAd.this);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.appLovinAdViewWrapper.getAppLovinAdView();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + this.zoneId);
        this.appLovinAdViewWrapper.renderAd(appLovinAd);
        this.bannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        AdError adError = AppLovinUtils.getAdError(i);
        Log.w(TAG, "Failed to load banner ad with error: " + i);
        this.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner dismissed.");
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(TAG, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }
}
