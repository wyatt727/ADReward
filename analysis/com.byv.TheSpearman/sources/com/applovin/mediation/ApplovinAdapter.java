package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.ads.mediation.applovin.AppLovinInterstitialRenderer;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ApplovinAdapter extends AppLovinMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, OnContextChangedListener {
    private static final boolean LOGGING_ENABLED = true;
    private static final HashMap<String, WeakReference<ApplovinAdapter>> appLovinInterstitialAds = new HashMap<>();
    private AppLovinAdView adView;
    private AppLovinAd appLovinInterstitialAd;
    private Context context;
    private boolean enableMultipleAdLoading = false;
    private MediationInterstitialListener mediationInterstitialListener;
    private Bundle networkExtras;
    private AppLovinSdk sdk;
    private String zoneId;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(bundle)) {
                this.enableMultipleAdLoading = true;
            }
            AppLovinInitializer.getInstance().initialize(context, string, new AnonymousClass1(bundle, mediationInterstitialListener, context, bundle2));
        }
    }

    /* renamed from: com.applovin.mediation.ApplovinAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements AppLovinInitializer.OnInitializeSuccessListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ MediationInterstitialListener val$interstitialListener;
        final /* synthetic */ Bundle val$networkExtras;
        final /* synthetic */ Bundle val$serverParameters;

        AnonymousClass1(Bundle bundle, MediationInterstitialListener mediationInterstitialListener, Context context, Bundle bundle2) {
            this.val$serverParameters = bundle;
            this.val$interstitialListener = mediationInterstitialListener;
            this.val$context = context;
            this.val$networkExtras = bundle2;
        }

        @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
        public void onInitializeSuccess(String str) {
            ApplovinAdapter.this.zoneId = AppLovinUtils.retrieveZoneId(this.val$serverParameters);
            if (!ApplovinAdapter.appLovinInterstitialAds.containsKey(ApplovinAdapter.this.zoneId) || ((WeakReference) ApplovinAdapter.appLovinInterstitialAds.get(ApplovinAdapter.this.zoneId)).get() == null) {
                ApplovinAdapter.appLovinInterstitialAds.put(ApplovinAdapter.this.zoneId, new WeakReference(ApplovinAdapter.this));
                ApplovinAdapter.this.sdk = AppLovinInitializer.getInstance().retrieveSdk(this.val$serverParameters, this.val$context);
                ApplovinAdapter.this.context = this.val$context;
                ApplovinAdapter.this.networkExtras = this.val$networkExtras;
                ApplovinAdapter.this.mediationInterstitialListener = this.val$interstitialListener;
                ApplovinAdapter.log(3, "Requesting interstitial for zone: " + ApplovinAdapter.this.zoneId);
                AppLovinAdLoadListener appLovinAdLoadListener = new AppLovinAdLoadListener() { // from class: com.applovin.mediation.ApplovinAdapter.1.1
                    @Override // com.applovin.sdk.AppLovinAdLoadListener
                    public void adReceived(AppLovinAd appLovinAd) {
                        ApplovinAdapter.log(3, "Interstitial did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + ApplovinAdapter.this.zoneId);
                        ApplovinAdapter.this.appLovinInterstitialAd = appLovinAd;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ApplovinAdapter.this.mediationInterstitialListener.onAdLoaded(ApplovinAdapter.this);
                            }
                        });
                    }

                    @Override // com.applovin.sdk.AppLovinAdLoadListener
                    public void failedToReceiveAd(int i) {
                        final AdError adError = AppLovinUtils.getAdError(i);
                        ApplovinAdapter.log(5, adError.getMessage());
                        ApplovinAdapter.this.unregister();
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ApplovinAdapter.this.mediationInterstitialListener.onAdFailedToLoad(ApplovinAdapter.this, adError);
                            }
                        });
                    }
                };
                if (!TextUtils.isEmpty(ApplovinAdapter.this.zoneId)) {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(ApplovinAdapter.this.zoneId, appLovinAdLoadListener);
                    return;
                } else {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
                    return;
                }
            }
            AdError adError = new AdError(105, AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError.getMessage());
            this.val$interstitialListener.onAdFailedToLoad(ApplovinAdapter.this, adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.sdk, this.context);
        AppLovinInterstitialAdListener appLovinInterstitialAdListener = new AppLovinInterstitialAdListener(this, this.mediationInterstitialListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(appLovinInterstitialAdListener);
        appLovinInterstitialAdDialogCreate.setAdClickListener(appLovinInterstitialAdListener);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(appLovinInterstitialAdListener);
        if (this.appLovinInterstitialAd == null) {
            log(3, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                log(3, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogCreate.show();
                return;
            } else {
                this.mediationInterstitialListener.onAdOpened(this);
                this.mediationInterstitialListener.onAdClosed(this);
                return;
            }
        }
        log(3, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogCreate.showAndRender(this.appLovinInterstitialAd);
        if (this.enableMultipleAdLoading) {
            unregister();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final Context context, final MediationBannerListener mediationBannerListener, final Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        final AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError2.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        AppLovinInitializer.getInstance().initialize(context, string, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.applovin.mediation.ApplovinAdapter.2
            @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
            public void onInitializeSuccess(String str) {
                ApplovinAdapter.this.sdk = AppLovinInitializer.getInstance().retrieveSdk(bundle, context);
                ApplovinAdapter.this.zoneId = AppLovinUtils.retrieveZoneId(bundle);
                ApplovinAdapter.log(3, "Requesting banner of size " + appLovinAdSizeAppLovinAdSizeFromAdMobAdSize + " for zone: " + ApplovinAdapter.this.zoneId);
                ApplovinAdapter.this.adView = new AppLovinAdView(ApplovinAdapter.this.sdk, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, context);
                AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(ApplovinAdapter.this.zoneId, ApplovinAdapter.this.adView, ApplovinAdapter.this, mediationBannerListener);
                ApplovinAdapter.this.adView.setAdDisplayListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adView.setAdClickListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adView.setAdViewEventListener(appLovinBannerAdListener);
                if (!TextUtils.isEmpty(ApplovinAdapter.this.zoneId)) {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(ApplovinAdapter.this.zoneId, appLovinBannerAdListener);
                } else {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAd(appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, appLovinBannerAdListener);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.adView;
    }

    @Override // com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(Context context) {
        log(3, "Context changed: " + context);
        this.context = context;
    }

    public static void log(int i, String str) {
        Log.println(i, "AppLovinAdapter", str);
    }

    void unregister() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<ApplovinAdapter>> map = appLovinInterstitialAds;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }
}
