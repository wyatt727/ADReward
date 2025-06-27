package com.json.adapters.mytarget;

import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.sdk.RewardedVideoSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.models.IAdLoadingError;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class MyTargetRewardedVideoListener implements InterstitialAd.InterstitialAdListener {
    private WeakReference<MyTargetAdapter> mAdapter;
    private RewardedVideoSmashListener mListener;
    private String mPlacementId;

    public MyTargetRewardedVideoListener(MyTargetAdapter myTargetAdapter, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.mAdapter = new WeakReference<>(myTargetAdapter);
        this.mListener = rewardedVideoSmashListener;
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
            this.mAdapter.get().mRewardedVideoPlacementIdToAd.put(this.mPlacementId, interstitialAd);
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mPlacementId, true);
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onNoAd(IAdLoadingError iAdLoadingError, InterstitialAd interstitialAd) {
        String str = "error message = " + iAdLoadingError.getMessage() + ", error code = " + iAdLoadingError.getCode();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + " ," + str);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        this.mAdapter.get().mRewardedVideoPlacementIdToAd.remove(this.mPlacementId);
        this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mPlacementId, false);
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "MyTarget", str));
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onClick(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onDisplay(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            this.mAdapter.get().mRewardedVideoPlacementIdToAd.remove(this.mPlacementId);
            this.mListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onDismiss(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onVideoCompleted(InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }
}
