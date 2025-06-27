package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class AppLovinWaterfallInterstitialAd extends AppLovinInterstitialRenderer implements MediationInterstitialAd {
    protected static final HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> appLovinWaterfallInterstitialAds = new HashMap<>();
    private Context context;
    private boolean enableMultipleAdLoading;
    private Bundle networkExtras;
    private AppLovinSdk sdk;

    public AppLovinWaterfallInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
        this.enableMultipleAdLoading = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void loadAd() {
        this.context = this.interstitialAdConfiguration.getContext();
        final Bundle serverParameters = this.interstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(serverParameters)) {
                this.enableMultipleAdLoading = true;
            }
            this.appLovinInitializer.initialize(this.context, string, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.1
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(String str) {
                    AppLovinWaterfallInterstitialAd.this.zoneId = AppLovinUtils.retrieveZoneId(serverParameters);
                    if (AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds.containsKey(AppLovinWaterfallInterstitialAd.this.zoneId) && AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds.get(AppLovinWaterfallInterstitialAd.this.zoneId).get() != null) {
                        AdError adError2 = new AdError(105, AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                        Log.e(AppLovinInterstitialRenderer.TAG, adError2.getMessage());
                        AppLovinWaterfallInterstitialAd.this.interstitialAdLoadCallback.onFailure(adError2);
                        return;
                    }
                    AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds.put(AppLovinWaterfallInterstitialAd.this.zoneId, new WeakReference<>(AppLovinWaterfallInterstitialAd.this));
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = AppLovinWaterfallInterstitialAd.this;
                    appLovinWaterfallInterstitialAd.sdk = appLovinWaterfallInterstitialAd.appLovinInitializer.retrieveSdk(serverParameters, AppLovinWaterfallInterstitialAd.this.context);
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd2 = AppLovinWaterfallInterstitialAd.this;
                    appLovinWaterfallInterstitialAd2.networkExtras = appLovinWaterfallInterstitialAd2.networkExtras;
                    Log.d(AppLovinInterstitialRenderer.TAG, "Requesting interstitial for zone: " + AppLovinWaterfallInterstitialAd.this.zoneId);
                    if (!TextUtils.isEmpty(AppLovinWaterfallInterstitialAd.this.zoneId)) {
                        AppLovinWaterfallInterstitialAd.this.sdk.getAdService().loadNextAdForZoneId(AppLovinWaterfallInterstitialAd.this.zoneId, AppLovinWaterfallInterstitialAd.this);
                    } else {
                        AppLovinWaterfallInterstitialAd.this.sdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, AppLovinWaterfallInterstitialAd.this);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreateInterstitialAdDialog = this.appLovinAdFactory.createInterstitialAdDialog(this.sdk, context);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdDisplayListener(this);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdClickListener(this);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            Log.d(TAG, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(TAG, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogCreateInterstitialAdDialog.show();
                return;
            }
            return;
        }
        Log.d(TAG, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.showAndRender(this.appLovinInterstitialAd);
        if (this.enableMultipleAdLoading) {
            unregister();
        }
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        unregister();
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        unregister();
        super.adHidden(appLovinAd);
    }

    void unregister() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> map = appLovinWaterfallInterstitialAds;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }
}
