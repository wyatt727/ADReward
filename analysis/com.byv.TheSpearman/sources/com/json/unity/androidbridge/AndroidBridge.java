package com.json.unity.androidbridge;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.json.adapters.supersonicads.SupersonicConfig;
import com.json.mediationsdk.ISBannerSize;
import com.json.mediationsdk.ISContainerParams;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceBannerLayout;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.WaterfallConfiguration;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.integration.IntegrationHelper;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.BannerListener;
import com.json.mediationsdk.sdk.InitializationListener;
import com.json.mediationsdk.sdk.InterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayBannerListener;
import com.json.mediationsdk.sdk.OfferwallListener;
import com.json.mediationsdk.sdk.RewardedVideoListener;
import com.json.mediationsdk.sdk.RewardedVideoManualListener;
import com.json.mediationsdk.sdk.SegmentListener;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AndroidBridge implements InitializationListener, RewardedVideoManualListener, RewardedVideoListener, ImpressionDataListener, InterstitialListener, ISDemandOnlyInterstitialListener, ISDemandOnlyRewardedVideoListener, SegmentListener, OfferwallListener {
    private static final AndroidBridge mInstance = new AndroidBridge();
    private IronSourceBannerLayout mBanner;
    private FrameLayout mBannerContainer;
    private int mBannerVisibilityState;
    private boolean mIsBannerLoadCalled;
    private boolean mIsBannerLoadedFirst;
    private boolean mIsInitBannerCalled;
    private LevelPlayInterstitialWrapper mLevelPlayInterstitialWrapper;
    private LevelPlayRewardedVideoWrapper mLevelPlayRewardedVideoWrapper;
    private Handler mUIHandler;
    private UnityBannerListener mUnityBannerListener;
    private UnityImpressionDataListener mUnityImpressionDataListener;
    private UnityInitializationListener mUnityInitializationListener;
    private UnityInterstitialListener mUnityInterstitialListener;
    private UnityLevelPlayBannerListener mUnityLevelPlayBannerListener;
    private UnityOfferwallListener mUnityOfferwallListener;
    private UnityRewardedVideoListener mUnityRewardedVideoListener;
    private UnityRewardedVideoManualListener mUnityRewardedVideoManualListener;
    private UnitySegmentListener mUnitySegmentListener;

    public static synchronized AndroidBridge getInstance() {
        return mInstance;
    }

    private AndroidBridge() {
        IronSource.addImpressionDataListener(this);
        IronSource.setInterstitialListener(this);
        IronSource.setOfferwallListener(this);
        IronSource.setISDemandOnlyRewardedVideoListener(this);
        IronSource.setSegmentListener(this);
        IronSource.setRewardedVideoListener(this);
        this.mLevelPlayRewardedVideoWrapper = new LevelPlayRewardedVideoWrapper();
        this.mLevelPlayInterstitialWrapper = new LevelPlayInterstitialWrapper();
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mBannerContainer = null;
        this.mBanner = null;
        this.mIsBannerLoadedFirst = false;
        this.mIsBannerLoadCalled = false;
        this.mIsInitBannerCalled = false;
        this.mBannerVisibilityState = 0;
    }

    public void setUnityInitializationListener(UnityInitializationListener listener) {
        this.mUnityInitializationListener = listener;
    }

    public void setUnityRewardedVideoListener(UnityRewardedVideoListener listener) {
        this.mUnityRewardedVideoListener = listener;
    }

    public void setUnityRewardedVideoManualListener(UnityRewardedVideoManualListener listener) {
        this.mUnityRewardedVideoManualListener = listener;
    }

    public void setUnityRewardedVideoLevelPlayListener(UnityLevelPlayRewardedVideoListener listener) {
        this.mLevelPlayRewardedVideoWrapper.setLevelPlayRewardedVideoListener(listener);
    }

    public void setUnityRewardedVideoManualLevelPlayListener(UnityLevelPlayRewardedVideoManualListener listener) {
        this.mLevelPlayRewardedVideoWrapper.setLevelPlayManualRewardedVideoListener(listener);
    }

    public void setUnityInterstitialListener(UnityInterstitialListener listener) {
        this.mUnityInterstitialListener = listener;
    }

    public void setUnityInterstitialLevelPlayListener(UnityLevelPlayInterstitialListener listener) {
        this.mLevelPlayInterstitialWrapper.setInterstitialLevelPlaylistener(listener);
    }

    public void setUnityOfferwallListener(UnityOfferwallListener listener) {
        this.mUnityOfferwallListener = listener;
    }

    public void setUnitySegmentListener(UnitySegmentListener listener) {
        this.mUnitySegmentListener = listener;
    }

    public void setUnityBannerListener(UnityBannerListener listener) {
        this.mUnityBannerListener = listener;
    }

    public void setUnityBannerLevelPlayListener(UnityLevelPlayBannerListener listener) {
        this.mUnityLevelPlayBannerListener = listener;
    }

    public void setUnityImpressionDataListener(UnityImpressionDataListener listener) {
        this.mUnityImpressionDataListener = listener;
    }

    @Override // com.json.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(final ImpressionData impressionData) {
        if (this.mUnityImpressionDataListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.1
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityImpressionDataListener.onImpressionDataReady(AndroidBridgeUtilities.getImpressionDataString(impressionData));
                    AndroidBridge.this.mUnityImpressionDataListener.onImpressionSuccess(AndroidBridgeUtilities.getImpressionDataString(impressionData));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InitializationListener
    public void onInitializationComplete() {
        if (this.mUnityInitializationListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.2
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInitializationListener.onSdkInitializationCompleted();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(final String segment) {
        try {
            if (this.mUnitySegmentListener != null) {
                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AndroidBridge.this.mUnitySegmentListener.onSegmentRecieved(segment);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallAvailable(final boolean available) {
        if (this.mUnityOfferwallListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.4
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityOfferwallListener.onOfferwallAvailable(String.valueOf(available));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallOpened() {
        if (this.mUnityOfferwallListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.5
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityOfferwallListener.onOfferwallOpened();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallShowFailed(final IronSourceError ironSourceError) {
        if (this.mUnityOfferwallListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.6
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityOfferwallListener.onOfferwallShowFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public boolean onOfferwallAdCredited(int credits, int totalCredits, boolean totalCreditsFlag) {
        HashMap map = new HashMap();
        try {
            map.put("credits", String.valueOf(credits));
            map.put(AndroidBridgeConstants.OFFERWALL_TOTAL_CREDITS, String.valueOf(totalCredits));
            map.put(AndroidBridgeConstants.OFFERWALL_TOTAL_CREDITS_FLAG, String.valueOf(totalCreditsFlag));
            final String string = new JSONObject(map).toString();
            if (this.mUnityOfferwallListener == null) {
                return true;
            }
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.7
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityOfferwallListener.onOfferwallAdCredited(string);
                }
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onGetOfferwallCreditsFailed(final IronSourceError ironSourceError) {
        if (this.mUnityOfferwallListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.8
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityOfferwallListener.onGetOfferwallCreditsFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallClosed() {
        if (this.mUnityOfferwallListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.9
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityOfferwallListener.onOfferwallClosed();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdReady() {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.10
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdReady();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdLoadFailed(final IronSourceError ironSourceError) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.11
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdLoadFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdOpened() {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.12
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdOpened();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdClosed() {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.13
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdClosed();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdShowSucceeded() {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.14
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdShowSucceeded();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdShowFailed(final IronSourceError ironSourceError) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.15
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdShowFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdClicked() {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.16
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdClicked();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(final String instanceId) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.17
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdReadyDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String instanceId, final IronSourceError ironSourceError) {
        try {
            if (this.mUnityInterstitialListener != null) {
                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.18
                    @Override // java.lang.Runnable
                    public void run() {
                        AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdLoadFailedDemandOnly(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(final String instanceId) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.19
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdOpenedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(final String instanceId) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.20
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdClosedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String instanceId, final IronSourceError ironSourceError) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.21
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdShowFailedDemandOnly(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(final String instanceId) {
        if (this.mUnityInterstitialListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.22
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityInterstitialListener.onInterstitialAdClickedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdOpened() {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.23
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdOpened();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdClosed() {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.24
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdClosed();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAvailabilityChanged(final boolean b) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.25
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAvailabilityChanged(String.valueOf(b));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdStarted() {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.26
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdStarted();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdEnded() {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.27
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdEnded();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdRewarded(Placement placement) {
        final String placememtJson = AndroidBridgeUtilities.getPlacememtJson(placement);
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.28
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdRewarded(placememtJson);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdShowFailed(final IronSourceError ironSourceError) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.29
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdShowFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdClicked(final Placement placement) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.30
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdClicked(AndroidBridgeUtilities.getPlacememtJson(placement));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(final String instanceId) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.31
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdLoadedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String instanceId, final IronSourceError ironSourceError) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.32
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdLoadFailedDemandOnly(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(final String instanceId) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.33
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdOpenedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(final String instanceId) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.34
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdClosedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(final String instanceId) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.35
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdRewardedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String instanceId, final IronSourceError ironSourceError) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.36
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdShowFailedDemandOnly(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(final String instanceId) {
        if (this.mUnityRewardedVideoListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.37
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoListener.onRewardedVideoAdClickedDemandOnly(instanceId);
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoManualListener
    public void onRewardedVideoAdReady() {
        if (this.mUnityRewardedVideoManualListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.38
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoManualListener.onRewardedVideoAdReady();
                }
            });
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoManualListener
    public void onRewardedVideoAdLoadFailed(final IronSourceError ironSourceError) {
        if (this.mUnityRewardedVideoManualListener != null) {
            AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.39
                @Override // java.lang.Runnable
                public void run() {
                    AndroidBridge.this.mUnityRewardedVideoManualListener.onRewardedVideoAdLoadFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                }
            });
        }
    }

    public Activity getUnityActivity() {
        return UnityPlayer.currentActivity;
    }

    public void setPluginData(String pluginType, String pluginVersion, String pluginFrameworkVersion) {
        ConfigFile.getConfigFile().setPluginData(pluginType, pluginVersion, pluginFrameworkVersion);
    }

    public String getAdvertiserId() {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.40
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                return IronSource.getAdvertiserId(AndroidBridge.this.getUnityActivity());
            }
        });
        futureTask.run();
        try {
            return (String) futureTask.get(1L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void validateIntegration() {
        IntegrationHelper.validateIntegration(getUnityActivity());
    }

    public void shouldTrackNetworkState(boolean track) {
        IronSource.shouldTrackNetworkState(getUnityActivity(), track);
    }

    public boolean setDynamicUserId(String dynamicUserId) {
        return IronSource.setDynamicUserId(dynamicUserId);
    }

    public void setAdaptersDebug(boolean enabled) {
        IronSource.setAdaptersDebug(enabled);
    }

    public void setManualLoadRewardedVideo(boolean isOn) {
        this.mLevelPlayRewardedVideoWrapper.setIronSourceManualLoadListener(isOn);
        if (isOn) {
            IronSource.setManualLoadRewardedVideo(this);
        } else {
            Log.d("AndroidBrdige", "Set Rewarded Video Manual to false it is a defualt behavior");
        }
    }

    public void setNetworkData(String networkKey, String networkData) {
        if (networkKey == null || networkData == null) {
            return;
        }
        try {
            IronSource.setNetworkData(networkKey, new JSONObject(networkData));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void onResume() {
        IronSource.onResume(getUnityActivity());
    }

    public void onPause() {
        IronSource.onPause(getUnityActivity());
    }

    public void setUserId(String userId) {
        IronSource.setUserId(userId);
    }

    public void init(String appKey) {
        this.mIsInitBannerCalled = true;
        IronSource.init(getUnityActivity(), appKey, this);
    }

    public void init(String appKey, String[] adUnits) {
        ArrayList arrayList = new ArrayList();
        for (String str : adUnits) {
            if (IronSource.AD_UNIT.REWARDED_VIDEO.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else if (IronSource.AD_UNIT.INTERSTITIAL.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            } else if (IronSource.AD_UNIT.OFFERWALL.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.OFFERWALL);
            } else if (IronSource.AD_UNIT.BANNER.toString().equalsIgnoreCase(str)) {
                this.mIsInitBannerCalled = true;
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        }
        IronSource.init(getUnityActivity(), appKey, this, (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]));
    }

    public void initISDemandOnly(String appKey, String[] adUnits) {
        ArrayList arrayList = new ArrayList();
        for (String str : adUnits) {
            if (IronSource.AD_UNIT.REWARDED_VIDEO.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else if (IronSource.AD_UNIT.INTERSTITIAL.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            } else if (IronSource.AD_UNIT.OFFERWALL.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.OFFERWALL);
            } else if (IronSource.AD_UNIT.BANNER.toString().equalsIgnoreCase(str)) {
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        }
        IronSource.initISDemandOnly(getUnityActivity().getApplicationContext(), appKey, (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]));
    }

    public void loadRewardedVideo() {
        IronSource.loadRewardedVideo();
    }

    public void showRewardedVideo() {
        IronSource.showRewardedVideo();
    }

    public void showRewardedVideo(String placementName) {
        IronSource.showRewardedVideo(placementName);
    }

    public boolean isRewardedVideoAvailable() {
        return IronSource.isRewardedVideoAvailable();
    }

    public boolean isRewardedVideoPlacementCapped(String placementName) {
        return IronSource.isRewardedVideoPlacementCapped(placementName);
    }

    public String getPlacementInfo(String placementName) {
        Placement rewardedVideoPlacementInfo = IronSource.getRewardedVideoPlacementInfo(placementName);
        HashMap map = new HashMap();
        try {
            map.put(AndroidBridgeConstants.PLACEMENT_NAME, rewardedVideoPlacementInfo.getPlacementName());
            map.put("reward_name", rewardedVideoPlacementInfo.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            map.put("reward_amount", Integer.valueOf(rewardedVideoPlacementInfo.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String()));
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setRewardedVideoServerParams(String paramsJson) {
        IronSource.setRewardedVideoServerParameters(AndroidBridgeUtilities.getHashMapFromJsonString(paramsJson));
    }

    public void clearRewardedVideoServerParams() {
        IronSource.clearRewardedVideoServerParameters();
    }

    public void showISDemandOnlyRewardedVideo(String instanceId) {
        IronSource.showISDemandOnlyRewardedVideo(instanceId);
    }

    public void loadISDemandOnlyRewardedVideo(String instanceId) {
        IronSource.loadISDemandOnlyRewardedVideo(getUnityActivity(), instanceId);
    }

    public boolean isISDemandOnlyRewardedVideoAvailable(String instanceId) {
        return IronSource.isISDemandOnlyRewardedVideoAvailable(instanceId);
    }

    public void loadInterstitial() {
        IronSource.loadInterstitial();
    }

    public void showInterstitial() {
        IronSource.showInterstitial();
    }

    public void showInterstitial(String placementName) {
        IronSource.showInterstitial(placementName);
    }

    public boolean isInterstitialReady() {
        return IronSource.isInterstitialReady();
    }

    public boolean isInterstitialPlacementCapped(String placementName) {
        return IronSource.isInterstitialPlacementCapped(placementName);
    }

    public void loadISDemandOnlyInterstitial(String instanceId) {
        IronSource.loadISDemandOnlyInterstitial(getUnityActivity(), instanceId);
    }

    public void showISDemandOnlyInterstitial(String instanceId) {
        IronSource.showISDemandOnlyInterstitial(instanceId);
    }

    public boolean isISDemandOnlyInterstitialReady(String instanceId) {
        return IronSource.isISDemandOnlyInterstitialReady(instanceId);
    }

    public void showOfferwall() {
        IronSource.showOfferwall();
    }

    public void showOfferwall(String placementName) {
        IronSource.showOfferwall(placementName);
    }

    public boolean isOfferwallAvailable() {
        return IronSource.isOfferwallAvailable();
    }

    public void getOfferwallCredits() {
        IronSource.getOfferwallCredits();
    }

    public void loadBanner(String description, int width, int height, int position, String placementName, boolean isAdaptive, boolean isRespectCutoutsEnabled, float containerWidth, float containerHeight) {
        synchronized (mInstance) {
            if (this.mIsInitBannerCalled && !this.mIsBannerLoadCalled) {
                this.mIsBannerLoadCalled = true;
                loadAndShowBanner(description, width, height, position, placementName, isAdaptive, isRespectCutoutsEnabled, containerWidth, containerHeight);
            }
        }
    }

    /* renamed from: com.ironsource.unity.androidbridge.AndroidBridge$41, reason: invalid class name */
    class AnonymousClass41 implements Runnable {
        final /* synthetic */ float val$containerHeight;
        final /* synthetic */ float val$containerWidth;
        final /* synthetic */ String val$description;
        final /* synthetic */ int val$height;
        final /* synthetic */ boolean val$isAdaptive;
        final /* synthetic */ boolean val$isRespectCutoutsEnabled;
        final /* synthetic */ String val$placementName;
        final /* synthetic */ int val$position;
        final /* synthetic */ int val$width;

        AnonymousClass41(final int val$position, final String val$description, final int val$width, final int val$height, final boolean val$isAdaptive, final float val$containerWidth, final float val$containerHeight, final boolean val$isRespectCutoutsEnabled, final String val$placementName) {
            this.val$position = val$position;
            this.val$description = val$description;
            this.val$width = val$width;
            this.val$height = val$height;
            this.val$isAdaptive = val$isAdaptive;
            this.val$containerWidth = val$containerWidth;
            this.val$containerHeight = val$containerHeight;
            this.val$isRespectCutoutsEnabled = val$isRespectCutoutsEnabled;
            this.val$placementName = val$placementName;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (AndroidBridge.mInstance) {
                try {
                    int i = 48;
                    if (AndroidBridge.this.mBannerContainer == null) {
                        AndroidBridge.this.mBannerContainer = new FrameLayout(UnityPlayer.currentActivity);
                        AndroidBridge.this.mBannerContainer.setBackgroundColor(0);
                        AndroidBridge.this.mBannerContainer.setVisibility(AndroidBridge.this.mBannerVisibilityState);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = this.val$position == 1 ? 48 : 80;
                        UnityPlayer.currentActivity.addContentView(AndroidBridge.this.mBannerContainer, layoutParams);
                    }
                    ISBannerSize bannerSize = AndroidBridge.this.getBannerSize(this.val$description, this.val$width, this.val$height);
                    boolean z = this.val$isAdaptive;
                    if (z) {
                        bannerSize.setAdaptive(z);
                        bannerSize.setContainerParams(new ISContainerParams((int) this.val$containerWidth, (int) this.val$containerHeight));
                    }
                    if (this.val$isRespectCutoutsEnabled && Build.VERSION.SDK_INT >= 28) {
                        AndroidBridge.this.mBannerContainer.setFitsSystemWindows(true);
                        AndroidBridge.this.mBannerContainer.setSystemUiVisibility(1280);
                    }
                    AndroidBridge androidBridge = AndroidBridge.this;
                    androidBridge.mBanner = IronSource.createBanner(androidBridge.getUnityActivity(), bannerSize);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    if (this.val$position != 1) {
                        i = 80;
                    }
                    layoutParams2.gravity = i;
                    AndroidBridge.this.mBannerContainer.addView(AndroidBridge.this.mBanner, layoutParams2);
                    AndroidBridge.this.mBanner.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.1
                        @Override // android.view.ViewGroup.OnHierarchyChangeListener
                        public void onChildViewRemoved(View view, View view1) {
                        }

                        @Override // android.view.ViewGroup.OnHierarchyChangeListener
                        public void onChildViewAdded(View view, View view1) {
                            AndroidBridge.this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    synchronized (AndroidBridge.mInstance) {
                                        if (AndroidBridge.this.mBanner != null) {
                                            AndroidBridge.this.mBanner.setVisibility(AndroidBridge.this.mBannerVisibilityState);
                                        }
                                        AndroidBridge.this.mBannerContainer.requestLayout();
                                    }
                                }
                            });
                        }
                    });
                    if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                        AndroidBridge.this.mBanner.setLevelPlayBannerListener(new LevelPlayBannerListener() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2
                            @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
                            public void onAdLoaded(final AdInfo adInfo) {
                                AndroidBridge.this.mIsBannerLoadedFirst = true;
                                if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                    AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                                AndroidBridge.this.mUnityLevelPlayBannerListener.onAdLoaded(AndroidBridgeUtilities.getAdInfoString(adInfo));
                                            }
                                        }
                                    });
                                }
                            }

                            @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
                            public void onAdLoadFailed(final IronSourceError ironSourceError) {
                                if (!AndroidBridge.this.mIsBannerLoadedFirst) {
                                    AndroidBridge.this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            synchronized (AndroidBridge.mInstance) {
                                                AndroidBridge.this.mBannerContainer.removeAllViews();
                                                if (AndroidBridge.this.mBanner != null) {
                                                    AndroidBridge.this.mBanner = null;
                                                }
                                                AndroidBridge.this.mIsBannerLoadCalled = false;
                                            }
                                        }
                                    });
                                }
                                if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                    AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.3
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            AndroidBridge.this.mUnityLevelPlayBannerListener.onAdLoadFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                                        }
                                    });
                                }
                            }

                            @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
                            public void onAdClicked(final AdInfo adInfo) {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.4
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                            AndroidBridge.this.mUnityLevelPlayBannerListener.onAdClicked(AndroidBridgeUtilities.getAdInfoString(adInfo));
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
                            public void onAdLeftApplication(final AdInfo adInfo) {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.5
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                            AndroidBridge.this.mUnityLevelPlayBannerListener.onAdLeftApplication(AndroidBridgeUtilities.getAdInfoString(adInfo));
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
                            public void onAdScreenPresented(final AdInfo adInfo) {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.6
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                            AndroidBridge.this.mUnityLevelPlayBannerListener.onAdScreenPresented(AndroidBridgeUtilities.getAdInfoString(adInfo));
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
                            public void onAdScreenDismissed(final AdInfo adInfo) {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.2.7
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityLevelPlayBannerListener != null) {
                                            AndroidBridge.this.mUnityLevelPlayBannerListener.onAdScreenDismissed(AndroidBridgeUtilities.getAdInfoString(adInfo));
                                        }
                                    }
                                });
                            }
                        });
                    }
                    if (AndroidBridge.this.mUnityBannerListener != null) {
                        AndroidBridge.this.mBanner.setBannerListener(new BannerListener() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3
                            @Override // com.json.mediationsdk.sdk.BannerListener
                            public void onBannerAdLoaded() {
                                AndroidBridge.this.mIsBannerLoadedFirst = true;
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityBannerListener != null) {
                                            AndroidBridge.this.mUnityBannerListener.onBannerAdLoaded();
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.BannerListener
                            public void onBannerAdLoadFailed(final IronSourceError ironSourceError) {
                                if (!AndroidBridge.this.mIsBannerLoadedFirst) {
                                    AndroidBridge.this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            synchronized (AndroidBridge.mInstance) {
                                                AndroidBridge.this.mBannerContainer.removeAllViews();
                                                if (AndroidBridge.this.mBanner != null) {
                                                    AndroidBridge.this.mBanner = null;
                                                }
                                                AndroidBridge.this.mIsBannerLoadCalled = false;
                                            }
                                        }
                                    });
                                }
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityBannerListener != null) {
                                            AndroidBridge.this.mUnityBannerListener.onBannerAdLoadFailed(AndroidBridgeUtilities.parseIronSourceError(ironSourceError));
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.BannerListener
                            public void onBannerAdClicked() {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.4
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityBannerListener != null) {
                                            AndroidBridge.this.mUnityBannerListener.onBannerAdClicked();
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.BannerListener
                            public void onBannerAdScreenPresented() {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.5
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityBannerListener != null) {
                                            AndroidBridge.this.mUnityBannerListener.onBannerAdScreenPresented();
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.BannerListener
                            public void onBannerAdScreenDismissed() {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.6
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityBannerListener != null) {
                                            AndroidBridge.this.mUnityBannerListener.onBannerAdScreenDismissed();
                                        }
                                    }
                                });
                            }

                            @Override // com.json.mediationsdk.sdk.BannerListener
                            public void onBannerAdLeftApplication() {
                                AndroidBridgeUtilities.postBackgroundTask(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.41.3.7
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (AndroidBridge.this.mUnityBannerListener != null) {
                                            AndroidBridge.this.mUnityBannerListener.onBannerAdLeftApplication();
                                        }
                                    }
                                });
                            }
                        });
                    }
                    if (this.val$placementName != null) {
                        IronSource.loadBanner(AndroidBridge.this.mBanner, this.val$placementName);
                    } else {
                        IronSource.loadBanner(AndroidBridge.this.mBanner);
                    }
                } finally {
                }
            }
        }
    }

    private void loadAndShowBanner(final String description, final int width, final int height, final int position, final String placementName, final boolean isAdaptive, final boolean isRespectCutoutsEnabled, final float containerWidth, final float containerHeight) {
        this.mUIHandler.post(new AnonymousClass41(position, description, width, height, isAdaptive, containerWidth, containerHeight, isRespectCutoutsEnabled, placementName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ISBannerSize getBannerSize(String description, int width, int height) {
        if (description.equals("CUSTOM")) {
            return new ISBannerSize(width, height);
        }
        if (description.equals("SMART")) {
            return ISBannerSize.SMART;
        }
        if (description.equals("RECTANGLE")) {
            return ISBannerSize.RECTANGLE;
        }
        if (description.equals("LARGE")) {
            return ISBannerSize.LARGE;
        }
        return ISBannerSize.BANNER;
    }

    public void destroyBanner() {
        synchronized (mInstance) {
            this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.42
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AndroidBridge.mInstance) {
                        try {
                            AndroidBridge.this.mBannerContainer.removeAllViews();
                            if (AndroidBridge.this.mBanner != null) {
                                IronSource.destroyBanner(AndroidBridge.this.mBanner);
                                AndroidBridge.this.mBanner = null;
                                AndroidBridge.this.mBannerVisibilityState = 0;
                            }
                            AndroidBridge.this.mBannerContainer.setVisibility(0);
                        } catch (Exception unused) {
                        }
                        AndroidBridge.this.mIsBannerLoadCalled = false;
                        AndroidBridge.this.mIsBannerLoadedFirst = false;
                    }
                }
            });
        }
    }

    public void displayBanner() {
        synchronized (mInstance) {
            this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.43
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AndroidBridge.mInstance) {
                        try {
                            AndroidBridge.this.mBannerVisibilityState = 0;
                            if (AndroidBridge.this.mBannerContainer != null) {
                                AndroidBridge.this.mBanner.setVisibility(0);
                                AndroidBridge.this.mBannerContainer.setVisibility(0);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void hideBanner() {
        synchronized (mInstance) {
            this.mUIHandler.post(new Runnable() { // from class: com.ironsource.unity.androidbridge.AndroidBridge.44
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AndroidBridge.mInstance) {
                        try {
                            AndroidBridge.this.mBannerVisibilityState = 8;
                            if (AndroidBridge.this.mBannerContainer != null) {
                                AndroidBridge.this.mBanner.setVisibility(8);
                                AndroidBridge.this.mBannerContainer.setVisibility(8);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public boolean isBannerPlacementCapped(String placementName) {
        return IronSource.isBannerPlacementCapped(placementName);
    }

    public float getMaximalAdaptiveHeight(float width) {
        return ISBannerSize.getMaximalAdaptiveHeight((int) width);
    }

    public float getDeviceScreenWidth() {
        return getUnityActivity().getApplicationContext().getResources().getConfiguration().screenWidthDp;
    }

    public void setSegment(String segmentJson) {
        try {
            IronSource.setSegmentListener(this);
            JSONObject jSONObject = new JSONObject(segmentJson);
            IronSourceSegment ironSourceSegment = new IronSourceSegment();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("age")) {
                    ironSourceSegment.setAge(jSONObject.optInt(next));
                } else if (next.equals(AndroidBridgeConstants.SEGMENT_GENDER)) {
                    ironSourceSegment.setGender(jSONObject.optString(next));
                } else if (next.equals("level")) {
                    ironSourceSegment.setLevel(jSONObject.optInt(next));
                } else if (next.equals(AndroidBridgeConstants.SEGMENT_PAYING)) {
                    ironSourceSegment.setIsPaying(jSONObject.optInt(next) != 0);
                } else if (next.equals(AndroidBridgeConstants.SEGMENT_CREATION_DATE)) {
                    ironSourceSegment.setUserCreationDate(jSONObject.optLong(next));
                } else if (next.equals("segmentName")) {
                    ironSourceSegment.setSegmentName(jSONObject.optString(next));
                } else if (next.equals("iapt")) {
                    ironSourceSegment.setIAPTotal(jSONObject.optDouble(next));
                } else {
                    ironSourceSegment.setCustom(next, jSONObject.optString(next));
                }
            }
            IronSource.setSegment(ironSourceSegment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setConsent(boolean consent) {
        IronSource.setConsent(consent);
    }

    public void setMetaData(String key, String value) {
        IronSource.setMetaData(key, value);
    }

    public void setMetaData(String key, String[] values) {
        ArrayList arrayList = new ArrayList();
        for (String str : values) {
            arrayList.add(str);
        }
        IronSource.setMetaData(key, arrayList);
    }

    public void setClientSideCallbacks(boolean status) throws JSONException {
        SupersonicConfig.getConfigObj().setClientSideCallbacks(status);
    }

    public void setRewardedVideoCustomParams(String paramsJson) {
        SupersonicConfig.getConfigObj().setRewardedVideoCustomParams(AndroidBridgeUtilities.getHashMapFromJsonString(paramsJson));
    }

    public void setOfferwallCustomParams(String paramsJson) {
        SupersonicConfig.getConfigObj().setOfferwallCustomParams(AndroidBridgeUtilities.getHashMapFromJsonString(paramsJson));
    }

    public void setWaterfallConfiguration(String configurationParams, String adUnit) {
        try {
            WaterfallConfiguration.WaterfallConfigurationBuilder waterfallConfigurationBuilderBuilder = WaterfallConfiguration.builder();
            JSONObject jSONObject = new JSONObject(configurationParams);
            if (jSONObject.has(AndroidBridgeConstants.WATERFALL_CONFIG_CEILING_KEY)) {
                waterfallConfigurationBuilderBuilder.setCeiling(jSONObject.getDouble(AndroidBridgeConstants.WATERFALL_CONFIG_CEILING_KEY));
            }
            if (jSONObject.has(AndroidBridgeConstants.WATERFALL_CONFIG_FLOOR_KEY)) {
                waterfallConfigurationBuilderBuilder.setFloor(jSONObject.getDouble(AndroidBridgeConstants.WATERFALL_CONFIG_FLOOR_KEY));
            }
            IronSource.setWaterfallConfiguration(waterfallConfigurationBuilderBuilder.build(), IronSource.AD_UNIT.valueOf(adUnit));
        } catch (JSONException unused) {
            Log.e("LevelPlayAndroidBridge", String.format("Internal exception occurred while parsing configuration parameters for ad unit: %s. Please check the format of the configuration parameters.", adUnit));
        }
    }

    public void setAdRevenueData(String dataSource, String paramsJson) {
        IronSource.setAdRevenueData(dataSource, new JSONObject(AndroidBridgeUtilities.getHashMapFromJsonString(paramsJson)));
    }

    public void launchTestSuite() {
        IronSource.launchTestSuite(getUnityActivity());
    }
}
