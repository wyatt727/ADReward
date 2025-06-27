package com.json.adapters.mytarget;

import android.content.Context;
import android.text.TextUtils;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.IntegrationData;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.LoadWhileShowSupportState;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.sdk.InterstitialSmashListener;
import com.json.mediationsdk.sdk.RewardedVideoSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MyTargetAdapter extends AbstractAdapter {
    private static final String GitHash = "be9f8ea7a";
    private static final String VERSION = "4.1.19";
    private final String IRONSOURCE_MEDIATION;
    private final String PLACEMENT_ID;
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    protected ConcurrentHashMap<String, InterstitialAd> mInterstitialPlacementIdToAd;
    private ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementIdToSmashListener;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    protected ConcurrentHashMap<String, InterstitialAd> mRewardedVideoPlacementIdToAd;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementIdToSmashListener;

    private interface ResultListener {
        void onFail(IronSourceError ironSourceError);

        void onSuccess();
    }

    public static String getAdapterSDKVersion() {
        return MyTargetVersion.VERSION;
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return MyTargetVersion.VERSION;
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.1.19";
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    public static MyTargetAdapter startAdapter(String str) {
        return new MyTargetAdapter(str);
    }

    private MyTargetAdapter(String str) {
        super(str);
        this.PLACEMENT_ID = "slotId";
        this.IRONSOURCE_MEDIATION = "8";
        IronLog.INTERNAL.verbose();
        this.mRewardedVideoPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToAd = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToAd = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("MyTarget", "4.1.19");
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z) {
        IronLog.ADAPTER_API.verbose("setConsent=" + z);
        MyTargetPrivacy.setUserConsent(z);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        IronLog.ADAPTER_API.verbose();
        return getBiddingData();
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initRewardedVideo(jSONObject, true, rewardedVideoSmashListener, new ResultListener() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.1
            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onSuccess() {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            }

            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onFail(IronSourceError ironSourceError) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ironSourceError);
            }
        });
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, final JSONObject jSONObject, JSONObject jSONObject2, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initRewardedVideo(jSONObject, false, rewardedVideoSmashListener, new ResultListener() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.2
            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onSuccess() {
                MyTargetAdapter.this.loadRewardedVideoInternal(jSONObject.optString("slotId"), rewardedVideoSmashListener, false, null);
            }

            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onFail(IronSourceError ironSourceError) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        });
    }

    private void initRewardedVideo(final JSONObject jSONObject, boolean z, final RewardedVideoSmashListener rewardedVideoSmashListener, final ResultListener resultListener) {
        validateParams(jSONObject, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, new ResultListener() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.3
            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onSuccess() {
                String strOptString = jSONObject.optString("slotId");
                IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
                MyTargetAdapter.this.mRewardedVideoPlacementIdToSmashListener.put(strOptString, rewardedVideoSmashListener);
                MyTargetAdapter.this.debugModeCapability();
                resultListener.onSuccess();
            }

            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onFail(IronSourceError ironSourceError) {
                resultListener.onFail(ironSourceError);
            }
        });
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        loadRewardedVideoInternal(jSONObject.optString("slotId"), rewardedVideoSmashListener, true, str);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        loadRewardedVideoInternal(jSONObject.optString("slotId"), rewardedVideoSmashListener, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewardedVideoInternal(String str, RewardedVideoSmashListener rewardedVideoSmashListener, boolean z, String str2) {
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.error("listener is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + str);
        this.mRewardedVideoAdsAvailability.put(str, false);
        try {
            InterstitialAd interstitialAd = new InterstitialAd(Integer.parseInt(str), ContextProvider.getInstance().getApplicationContext());
            interstitialAd.setListener(new MyTargetRewardedVideoListener(this, rewardedVideoSmashListener, str));
            addCustomParams(interstitialAd);
            if (z) {
                interstitialAd.loadFromBid(str2);
            } else {
                interstitialAd.load();
            }
        } catch (NumberFormatException unused) {
            IronLog.INTERNAL.error("error parsing placement");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String strOptString = jSONObject.optString("slotId");
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "MyTarget - show failed placement is empty"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        InterstitialAd interstitialAd = this.mRewardedVideoPlacementIdToAd.get(strOptString);
        if (interstitialAd != null) {
            interstitialAd.show();
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "MyTarget - show failed no ad for placement = " + strOptString));
        }
        this.mRewardedVideoAdsAvailability.put(strOptString, false);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("slotId");
        return this.mRewardedVideoAdsAvailability.containsKey(strOptString) && this.mRewardedVideoAdsAvailability.get(strOptString).booleanValue();
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        IronLog.ADAPTER_API.verbose();
        return getBiddingData();
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initInterstitialInternal(str, str2, true, jSONObject, interstitialSmashListener);
    }

    private void initInterstitialInternal(String str, String str2, boolean z, final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        validateParams(jSONObject, "Interstitial", new ResultListener() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.4
            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onSuccess() {
                String strOptString = jSONObject.optString("slotId");
                IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
                MyTargetAdapter.this.mInterstitialPlacementIdToSmashListener.put(strOptString, interstitialSmashListener);
                MyTargetAdapter.this.debugModeCapability();
                interstitialSmashListener.onInterstitialInitSuccess();
            }

            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onFail(IronSourceError ironSourceError) {
                interstitialSmashListener.onInterstitialInitFailed(ironSourceError);
            }
        });
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose();
        loadInterstitialInternal(jSONObject, interstitialSmashListener, str);
    }

    private void loadInterstitialInternal(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        String strOptString = jSONObject.optString("slotId");
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.error("listener is null");
            return;
        }
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildInitFailedError("Missing slotId", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        this.mInterstitialAdsAvailability.put(strOptString, false);
        try {
            InterstitialAd interstitialAd = new InterstitialAd(Integer.parseInt(strOptString), ContextProvider.getInstance().getApplicationContext());
            interstitialAd.setListener(new MyTargetInterstitialListener(this, interstitialSmashListener, strOptString));
            addCustomParams(interstitialAd);
            interstitialAd.loadFromBid(str);
        } catch (NumberFormatException unused) {
            IronLog.INTERNAL.error("error parsing placement");
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildInitFailedError("error parsing placement", "Interstitial"));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String strOptString = jSONObject.optString("slotId");
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "MyTarget - show failed placement is empty"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        this.mInterstitialAdsAvailability.put(strOptString, false);
        InterstitialAd interstitialAd = this.mInterstitialPlacementIdToAd.get(strOptString);
        if (interstitialAd != null) {
            interstitialAd.show();
        } else {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "MyTarget - show failed no ad for placement = " + strOptString));
        }
        this.mInterstitialPlacementIdToAd.remove(strOptString);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("slotId");
        return this.mInterstitialAdsAvailability.containsKey(strOptString) && this.mInterstitialAdsAvailability.get(strOptString).booleanValue();
    }

    private Map<String, Object> getBiddingData() {
        String bidderToken = MyTargetManager.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog.ADAPTER_API.verbose("token = " + bidderToken);
        HashMap map = new HashMap();
        map.put("token", bidderToken);
        return map;
    }

    private void validateParams(JSONObject jSONObject, String str, ResultListener resultListener) {
        IronLog.INTERNAL.verbose();
        if (TextUtils.isEmpty(jSONObject.optString("slotId"))) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            resultListener.onFail(ErrorBuilder.buildInitFailedError("missing param = slotId", str));
        } else {
            resultListener.onSuccess();
        }
    }

    private void addCustomParams(InterstitialAd interstitialAd) {
        interstitialAd.getCustomParams().setCustomParam("mediation", "8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debugModeCapability() {
        boolean zIsAdaptersDebugEnabled;
        try {
            zIsAdaptersDebugEnabled = isAdaptersDebugEnabled();
        } catch (NoSuchMethodError unused) {
            zIsAdaptersDebugEnabled = false;
        }
        MyTargetManager.setDebugMode(zIsAdaptersDebugEnabled);
    }
}
