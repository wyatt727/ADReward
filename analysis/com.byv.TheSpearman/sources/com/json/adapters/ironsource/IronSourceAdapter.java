package com.json.adapters.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.json.ab;
import com.json.adapters.ironsource.IronSourceLoadParameters;
import com.json.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.json.adapters.supersonicads.SupersonicConfig;
import com.json.bb;
import com.json.ca;
import com.json.environment.ContextProvider;
import com.json.g7;
import com.json.i8;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.ISBannerSize;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceBannerLayout;
import com.json.mediationsdk.LoadWhileShowSupportState;
import com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.metadata.MetaDataUtils;
import com.json.mediationsdk.metadata.a;
import com.json.mediationsdk.p;
import com.json.mediationsdk.sdk.BannerSmashListener;
import com.json.mediationsdk.sdk.InterstitialSmashListener;
import com.json.mediationsdk.sdk.RewardedVideoSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.q8;
import com.json.r8;
import com.json.sa;
import com.json.sdk.IronSourceNetwork;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import com.json.td;
import com.json.w6;
import com.json.x7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IronSourceAdapter extends AbstractAdapter implements sa, bb, ContextProvider.a {
    public static final String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "7.9.0";
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    public final String ADM_KEY;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String LWS_SUPPORT_STATE;
    private final String OW_CLIENT_SIDE_CALLBACKS;
    private final String OW_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    ConcurrentHashMap<String, ArrayList<q8>> mDemandSourceToBnAd;
    ConcurrentHashMap<String, q8> mDemandSourceToISAd;
    ConcurrentHashMap<String, q8> mDemandSourceToRvAd;
    private i8 mOfferwallListener;
    private final x7 sessionDepthService;

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = td.g1;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.OW_PLACEMENT_ID = t2.k;
        this.OW_CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.sessionDepthService = ca.h().d();
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new ConcurrentHashMap<>();
        setNativeAdAdapter(new IronSourceNativeAdAdapter(this));
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a A[PHI: r5
      0x006a: PHI (r5v3 int) = (r5v0 int), (r5v4 int) binds: [B:26:0x0050, B:36:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.json.w6 convertBannerSize(android.content.Context r7, com.json.mediationsdk.ISBannerSize r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.getDescription()
            r0.hashCode()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -387072689: goto L3f;
                case 72205083: goto L34;
                case 79011241: goto L29;
                case 1951953708: goto L1e;
                case 1999208305: goto L13;
                default: goto L12;
            }
        L12:
            goto L49
        L13:
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1c
            goto L49
        L1c:
            r2 = 4
            goto L49
        L1e:
            java.lang.String r1 = "BANNER"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L27
            goto L49
        L27:
            r2 = 3
            goto L49
        L29:
            java.lang.String r1 = "SMART"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L32
            goto L49
        L32:
            r2 = 2
            goto L49
        L34:
            java.lang.String r1 = "LARGE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3d
            goto L49
        L3d:
            r2 = 1
            goto L49
        L3f:
            java.lang.String r1 = "RECTANGLE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            r1 = 0
            r3 = 50
            r4 = 90
            r5 = 320(0x140, float:4.48E-43)
            switch(r2) {
                case 0: goto L6c;
                case 1: goto L6a;
                case 2: goto L5f;
                case 3: goto L70;
                case 4: goto L54;
                default: goto L53;
            }
        L53:
            return r1
        L54:
            int r8 = r8.getHeight()
            if (r8 == r3) goto L5d
            if (r8 == r4) goto L5d
            return r1
        L5d:
            r3 = r8
            goto L70
        L5f:
            boolean r8 = com.json.mediationsdk.AdapterUtils.isLargeScreen(r7)
            if (r8 == 0) goto L68
            r1 = 728(0x2d8, float:1.02E-42)
            r5 = r1
        L68:
            if (r8 == 0) goto L70
        L6a:
            r3 = r4
            goto L70
        L6c:
            r5 = 300(0x12c, float:4.2E-43)
            r3 = 250(0xfa, float:3.5E-43)
        L70:
            int r8 = com.json.mediationsdk.AdapterUtils.dpToPixels(r7, r5)
            int r7 = com.json.mediationsdk.AdapterUtils.dpToPixels(r7, r3)
            com.ironsource.w6 r1 = new com.ironsource.w6
            r1.<init>(r8, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.content.Context, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.w6");
    }

    private q8 createBannerAdInstance(String str, w6 w6Var, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new r8(str, new IronSourceBannerListener(this, bannerSmashListener, str)).a(getInitParams()).a(jSONObject.optInt("instanceType", 2) == 2).c(jSONObject.optBoolean("isOneFlow")).a(w6Var).a();
    }

    private q8 createInterstitialAdInstance(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z);
        return new r8(str, new IronSourceInterstitialListener(interstitialSmashListener, str)).a(getInitParams()).c(zOptBoolean).a(z).a();
    }

    private q8 createRewardedVideoAdInstance(String str, boolean z, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z2 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z + " isBidder=" + z2);
        return new r8(str, new IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z)).a(getInitParams()).b().c(zOptBoolean).a(z2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams() {
        HashMap<String, String> initParams = getInitParams();
        initParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            initParams.putAll(offerwallCustomParams);
        }
        return initParams;
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private void loadBannerInternal(Activity activity, ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            w6 w6VarConvertBannerSize = convertBannerSize(ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (w6VarConvertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            } else {
                IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, w6VarConvertBannerSize, jSONObject, bannerSmashListener), new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str)).value());
            }
        } catch (Exception e) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e.getMessage()));
        }
    }

    private void loadInterstitialAdInternal(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        q8 q8VarCreateInterstitialAdInstance = this.mDemandSourceToISAd.get(str);
        if (q8VarCreateInterstitialAdInstance == null) {
            q8VarCreateInterstitialAdInstance = createInterstitialAdInstance(str, jSONObject, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, q8VarCreateInterstitialAdInstance);
        }
        IronSourceNetwork.loadAd(q8VarCreateInterstitialAdInstance, withLog.value());
    }

    private void loadRewardedVideoAdInternal(JSONObject jSONObject, String str, String str2, RewardedVideoSmashListener rewardedVideoSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        q8 q8VarCreateRewardedVideoAdInstance = this.mDemandSourceToRvAd.get(str);
        if (q8VarCreateRewardedVideoAdInstance == null) {
            q8VarCreateRewardedVideoAdInstance = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, q8VarCreateRewardedVideoAdInstance);
        }
        IronSourceNetwork.loadAd(q8VarCreateRewardedVideoAdInstance, withLog.value());
    }

    private void showAdInternal(q8 q8Var, IronSource.AD_UNIT ad_unit) throws Exception {
        int iA = this.sessionDepthService.a(ad_unit);
        HashMap map = new HashMap();
        map.put("sessionDepth", String.valueOf(iA));
        IronLog.ADAPTER_API.verbose("demandSourceName=" + q8Var.e() + " showParams=" + map);
        IronSourceNetwork.showAd(ContextProvider.getInstance().getCurrentActiveActivity(), q8Var, map);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        ArrayList<q8> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                Iterator<q8> it = arrayList.iterator();
                while (it.hasNext()) {
                    IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (Exception e) {
                IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (p.p().q() == null) {
            IronLog.ADAPTER_API.error("Appkey is null for early init");
            return;
        }
        IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
        initSDK(p.p().q(), jSONObject);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    public Map<String, Object> getBiddingData() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose();
        HashMap map = new HashMap();
        String token = IronSourceNetwork.getToken(ContextProvider.getInstance().getApplicationContext());
        if (token != null) {
            map.put("token", token);
        } else {
            ironLog.error("bidding token is null");
            map.put("token", "");
        }
        return map;
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public HashMap<String, String> getInitParams() {
        HashMap<String, String> map = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            map.put(td.g1, pluginType);
        }
        if (!TextUtils.isEmpty(p.p().v())) {
            map.put("sessionid", p.p().v());
        }
        return map;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.json.sa
    public void getOfferwallCredits() {
        IronLog.ADAPTER_API.verbose(getProviderName() + " getOfferwallCredits");
        try {
            IronSourceNetwork.getOfferWallCredits(this);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public JSONObject getPlayerBiddingData() {
        JSONObject rawToken;
        IronLog.ADAPTER_API.verbose();
        JSONObject jSONObject = new JSONObject();
        try {
            rawToken = IronSourceNetwork.getRawToken(ContextProvider.getInstance().getApplicationContext());
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("getRawToken exception: " + e.getLocalizedMessage());
            rawToken = null;
        }
        if (rawToken != null) {
            return rawToken;
        }
        IronLog.ADAPTER_API.error("Player's bidding token is null");
        return jSONObject;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "7.9.0";
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.json.sa
    public void initOfferwall(String str, String str2, JSONObject jSONObject) {
        initSDK(str, jSONObject);
        IronLog.ADAPTER_API.verbose(":initOfferwall");
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronSourceNetwork.initOfferWall(IronSourceAdapter.this.getOfferwallExtraParams(), IronSourceAdapter.this);
                } catch (Exception e) {
                    IronLog.ADAPTER_API.error(IronSourceAdapter.this.getProviderName() + ":initOfferwall " + e);
                    IronSourceAdapter.this.mOfferwallListener.a(false, ErrorBuilder.buildInitFailedError("Adapter initialization failure - " + IronSourceAdapter.this.getProviderName() + " - " + e.getMessage(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int iOptInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                iOptInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + iOptInt);
            SDKUtils.setDebugMode(iOptInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("controllerConfig");
            String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
            SDKUtils.setControllerConfig(string);
            ironLog.verbose("IronSourceNetwork setting controller config to " + string);
            HashMap<String, String> initParams = getInitParams();
            String strQ = p.p().q();
            ironLog.verbose("with appKey=" + strQ + " userId=" + mediationUserId + " parameters " + initParams);
            IronSourceNetwork.setInitListener(new ab() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.json.ab
                public void onFail(g7 g7Var) {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + g7Var.a() + " message:" + g7Var.b());
                }

                @Override // com.json.ab
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), strQ, mediationUserId, initParams);
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        q8 q8Var = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return q8Var != null && IronSourceNetwork.isAdAvailableForInstance(q8Var);
    }

    @Override // com.json.sa
    public boolean isOfferwallAvailable() {
        return true;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        q8 q8Var = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return q8Var != null && IronSourceNetwork.isAdAvailableForInstance(q8Var);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        if (ironSourceBannerLayout != null) {
            loadBannerInternal(ironSourceBannerLayout.getActivity(), ironSourceBannerLayout.getSize(), jSONObject, bannerSmashListener, str);
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str);
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadInterstitialAdInternal(demandSourceName, null, jSONObject, interstitialSmashListener);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadInterstitialAdInternal(demandSourceName, str, jSONObject, interstitialSmashListener);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("for bidding exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, rewardedVideoSmashListener);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, rewardedVideoSmashListener);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
        }
    }

    @Override // com.json.bb
    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.json.bb
    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        i8 i8Var = this.mOfferwallListener;
        if (i8Var != null) {
            i8Var.onOfferwallClosed();
        }
    }

    @Override // com.json.bb
    public boolean onOWAdCredited(int i, int i2, boolean z) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        i8 i8Var = this.mOfferwallListener;
        return i8Var != null && i8Var.onOfferwallAdCredited(i, i2, z);
    }

    @Override // com.json.bb
    public void onOWShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onOfferwallShowFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.json.bb
    public void onOWShowSuccess(String str) {
        IronLog.ADAPTER_CALLBACK.verbose("onOWShowSuccess(placementId:" + str + ")");
        i8 i8Var = this.mOfferwallListener;
        if (i8Var != null) {
            i8Var.onOfferwallOpened();
        }
    }

    @Override // com.json.bb
    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        }
    }

    @Override // com.json.bb
    public void onOfferwallInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(false, ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.json.bb
    public void onOfferwallInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        i8 i8Var = this.mOfferwallListener;
        if (i8Var != null) {
            i8Var.onOfferwallAvailable(true);
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z) throws JSONException {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(z ? a.g : "false");
        sb.append(")");
        ironLog.verbose(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consent", z ? "1" : "0");
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
        }
    }

    @Override // com.json.sa
    public void setInternalOfferwallListener(i8 i8Var) {
        this.mOfferwallListener = i8Var;
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    protected void setMetaData(String str, List<String> list) throws JSONException {
        if (list.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        if (mDidInitSdk.get()) {
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("key=" + str + ", value=" + str2);
        if (!MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            ironLog.verbose("MetaData not valid");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e) {
            IronLog.ADAPTER_API.error("error - " + e);
            e.printStackTrace();
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), IronSource.AD_UNIT.INTERSTITIAL);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e.getMessage()));
        }
    }

    @Override // com.json.sa
    public void showOfferwall(String str, JSONObject jSONObject) {
        IronLog.ADAPTER_API.verbose(getProviderName() + " showOfferWall");
        try {
            HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams();
            offerwallExtraParams.put(t2.k, str);
            IronSourceNetwork.showOfferWall(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter, com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), IronSource.AD_UNIT.REWARDED_VIDEO);
        } catch (Exception e) {
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e.getMessage()));
        }
    }
}
