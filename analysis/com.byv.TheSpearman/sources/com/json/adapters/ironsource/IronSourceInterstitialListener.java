package com.json.adapters.ironsource;

import android.text.TextUtils;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.sdk.InterstitialSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.t2;
import com.json.ya;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IronSourceInterstitialListener implements ya {
    public final String AD_VISIBLE_EVENT_NAME = t2.h.z;
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.json.ya
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i);
    }

    @Override // com.json.ya
    public void onInterstitialClick() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.json.ya
    public void onInterstitialClose() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.json.ya
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if (t2.h.z.equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.json.ya
    public void onInterstitialInitFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.json.ya
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.json.ya
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.json.ya
    public void onInterstitialLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.json.ya
    public void onInterstitialOpen() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.json.ya
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.json.ya
    public void onInterstitialShowSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
