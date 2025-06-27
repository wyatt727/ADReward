package com.json.unity.androidbridge;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;

/* loaded from: classes4.dex */
class LevelPlayRewardedVideoWrapper implements LevelPlayRewardedVideoListener, LevelPlayRewardedVideoManualListener {
    private UnityLevelPlayRewardedVideoManualListener mUnityLevelPlayManualRewardedVideoListener;
    private UnityLevelPlayRewardedVideoListener mUnityLevelPlayRewardedVideoListener;

    public LevelPlayRewardedVideoWrapper() {
        IronSource.setLevelPlayRewardedVideoListener(this);
    }

    public void setIronSourceManualLoadListener(boolean isOn) {
        IronSource.setLevelPlayRewardedVideoManualListener(isOn ? this : null);
    }

    public void setLevelPlayRewardedVideoListener(UnityLevelPlayRewardedVideoListener listener) {
        this.mUnityLevelPlayRewardedVideoListener = listener;
    }

    public void setLevelPlayManualRewardedVideoListener(UnityLevelPlayRewardedVideoManualListener listener) {
        this.mUnityLevelPlayManualRewardedVideoListener = listener;
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener
    public void onAdAvailable(final AdInfo adInfo) {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdAvailable(AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener
    public void onAdUnavailable() {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdUnavailable();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    public void onAdOpened(final AdInfo adInfo) {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdOpened(AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    public void onAdShowFailed(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdShowFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError), AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    public void onAdClicked(Placement placement, final AdInfo adInfo) {
        final String placememtJson = AndroidBridgeUtilities.getPlacememtJson(placement);
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdClicked(placememtJson, AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    public void onAdRewarded(Placement placement, final AdInfo adInfo) {
        final String placememtJson = AndroidBridgeUtilities.getPlacememtJson(placement);
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdRewarded(placememtJson, AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    public void onAdClosed(final AdInfo adInfo) {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayRewardedVideoListener.onAdClosed(AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
    public void onAdReady(final AdInfo adInfo) {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.8
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayManualRewardedVideoListener.onAdReady(AndroidBridgeUtilities.getAdInfoString(adInfo));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
    public void onAdLoadFailed(final IronSourceError ironSourceError) {
        if (this.mUnityLevelPlayRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.LevelPlayRewardedVideoWrapper.9
                @Override // java.lang.Runnable
                public void run() {
                    LevelPlayRewardedVideoWrapper.this.mUnityLevelPlayManualRewardedVideoListener.onAdLoadFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }
}
