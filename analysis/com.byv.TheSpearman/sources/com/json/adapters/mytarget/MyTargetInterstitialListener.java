package com.json.adapters.mytarget;

import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.sdk.InterstitialSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.models.IAdLoadingError;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class MyTargetInterstitialListener implements InterstitialAd.InterstitialAdListener {
    private WeakReference<MyTargetAdapter> mAdapter;
    private InterstitialSmashListener mListener;
    private String mPlacementId;

    public MyTargetInterstitialListener(MyTargetAdapter myTargetAdapter, InterstitialSmashListener interstitialSmashListener, String str) {
        this.mAdapter = new WeakReference<>(myTargetAdapter);
        this.mListener = interstitialSmashListener;
        this.mPlacementId = str;
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onLoad(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (this.mListener == null) {
                IronLog.INTERNAL.verbose("listener is null");
                return;
            }
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mPlacementId, true);
            this.mAdapter.get().mInterstitialPlacementIdToAd.put(this.mPlacementId, interstitialAd);
            this.mListener.onInterstitialAdReady();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onNoAd(IAdLoadingError iAdLoadingError, InterstitialAd interstitialAd) {
        String str = "error message = " + iAdLoadingError.getMessage() + ", error code = " + iAdLoadingError.getCode();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + " ," + str);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (this.mListener == null) {
                IronLog.INTERNAL.verbose("listener is null");
                return;
            }
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mPlacementId, false);
            this.mAdapter.get().mInterstitialPlacementIdToAd.remove(this.mPlacementId, interstitialAd);
            this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Interstitial", "MyTarget", str));
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onClick(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onDisplay(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdOpened();
            this.mListener.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onDismiss(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onVideoCompleted(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
    }
}
