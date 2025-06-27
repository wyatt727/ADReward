package com.json.adapters.supersonicads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.json.bb;
import com.json.environment.ContextProvider;
import com.json.i8;
import com.json.jc;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.IntegrationData;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.metadata.MetaDataUtils;
import com.json.mediationsdk.metadata.a;
import com.json.mediationsdk.p;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.sa;
import com.json.sdk.IronSourceNetwork;
import com.json.sdk.SSAFactory;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import com.json.td;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class SupersonicAdsAdapter extends AbstractAdapter implements sa, bb, ContextProvider.a {
    private static final String VERSION = "7.9.0";
    private final String APPLICATION_PRIVATE_KEY;
    private final String CAMPAIGN_ID;
    private final String CLIENT_SIDE_CALLBACKS;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String ITEM_COUNT;
    private final String ITEM_NAME;
    private final String ITEM_SIGNATURE;
    private final String LANGUAGE;
    private final String MAX_VIDEO_LENGTH;
    private final String OW_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    private final String TIMESTAMP;
    private boolean mConsent;
    private boolean mDidSetConsent;
    private i8 mOfferwallListener;
    private jc mSSAPublisher;
    private static AtomicBoolean mDidSetInitParams = new AtomicBoolean(false);
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);

    private SupersonicAdsAdapter(String str) {
        super(str);
        this.TIMESTAMP = "timestamp";
        this.ITEM_SIGNATURE = "itemSignature";
        this.SDK_PLUGIN_TYPE = td.g1;
        this.OW_PLACEMENT_ID = t2.k;
        this.SESSION_ID = "sessionid";
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.LANGUAGE = "language";
        this.MAX_VIDEO_LENGTH = "maxVideoLength";
        this.CAMPAIGN_ID = "campaignId";
        this.ITEM_NAME = "itemName";
        this.ITEM_COUNT = "itemCount";
        this.APPLICATION_PRIVATE_KEY = "privateKey";
        this.CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
        IronLog.INTERNAL.verbose("");
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    private void addItemNameCountSignature(HashMap<String, String> map, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("itemName");
            int iOptInt = jSONObject.optInt("itemCount", -1);
            String strOptString2 = jSONObject.optString("privateKey");
            boolean z = true;
            boolean z2 = false;
            if (TextUtils.isEmpty(strOptString)) {
                z = false;
            } else {
                map.put("itemName", strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                z = false;
            }
            if (iOptInt != -1) {
                map.put("itemCount", String.valueOf(iOptInt));
                z2 = z;
            }
            if (z2) {
                int currentTimestamp = IronSourceUtils.getCurrentTimestamp();
                map.put("timestamp", String.valueOf(currentTimestamp));
                map.put("itemSignature", createItemSig(currentTimestamp, strOptString, iOptInt, strOptString2));
            }
        } catch (Exception e) {
            IronLog.ADAPTER_API.error(" addItemNameCountSignature" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyConsent(boolean z) throws JSONException {
        if (this.mSSAPublisher == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(t2.i.Z, String.valueOf(z));
            jSONObject.put("demandSourceName", getProviderName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.mSSAPublisher.a(jSONObject);
    }

    private String createItemSig(int i, String str, int i2, String str2) {
        return IronSourceUtils.getMD5(i + str + i2 + str2);
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    private HashMap<String, String> getGenenralExtraParams() {
        HashMap<String, String> map = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            map.put(td.g1, pluginType);
        }
        return map;
    }

    private HashMap<String, String> getInitParams() {
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

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData(IronSourceConstants.SUPERSONIC_CONFIG_NAME, "7.9.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String strOptString = jSONObject.optString("language");
        if (!TextUtils.isEmpty(strOptString)) {
            genenralExtraParams.put("language", strOptString);
        }
        genenralExtraParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            genenralExtraParams.putAll(offerwallCustomParams);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        return genenralExtraParams;
    }

    private void setParamsBeforeInit(JSONObject jSONObject) {
        if (mDidSetInitParams.compareAndSet(false, true)) {
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            int iOptInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                iOptInt = 3;
            }
            SDKUtils.setDebugMode(iOptInt);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("controllerConfig");
            String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
            SDKUtils.setControllerConfig(string);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + "setting controller url to " + jSONObject.optString("controllerUrl"));
            ironLog.verbose(getProviderName() + "setting controller config to " + string);
            ironLog.verbose(getProviderName() + "setting debug mode to " + iOptInt);
        }
    }

    public static SupersonicAdsAdapter startAdapter(String str) {
        return new SupersonicAdsAdapter(str);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        IronSourceUtils.sendAutomationLog(getProviderName() + ": earlyInit");
        if (mDidInitSdk.compareAndSet(false, true)) {
            SDKUtils.setDebugMode(isAdaptersDebugEnabled() ? 3 : jSONObject.optInt("debugMode", 0));
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller url to  " + jSONObject.optString("controllerUrl"));
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig", ""));
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller config to  " + jSONObject.optString("controllerConfig"));
            HashMap<String, String> initParams = getInitParams();
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), p.p().q(), str2, initParams);
            ironLog.verbose("initSDK with appKey=" + p.p().q() + " userId=" + str2 + " parameters " + initParams);
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    @Override // com.json.sa
    public void getOfferwallCredits() {
        if (this.mSSAPublisher == null) {
            IronLog.INTERNAL.error("Please call init before calling getOfferwallCredits");
            return;
        }
        p.p().q();
        String strR = p.p().r();
        IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.getOfferWallCredits userId=" + strR);
        this.mSSAPublisher.a(p.p().q(), strR, this);
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "7.9.0";
    }

    @Override // com.json.sa
    public void initOfferwall(String str, final String str2, final JSONObject jSONObject) {
        IronLog.ADAPTER_API.verbose(getProviderName() + " userId=" + str2);
        setParamsBeforeInit(jSONObject);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap offerwallExtraParams = SupersonicAdsAdapter.this.getOfferwallExtraParams(jSONObject);
                    SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                        supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                    }
                    IronLog.ADAPTER_API.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initOfferWall");
                    SupersonicAdsAdapter.this.mSSAPublisher.a(p.p().q(), str2, offerwallExtraParams, SupersonicAdsAdapter.this);
                    SupersonicAdsAdapter.mDidInitSdk.set(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    IronLog.ADAPTER_API.error(SupersonicAdsAdapter.this.getProviderName() + ":initOfferwall(userId:" + str2 + ")" + e);
                    SupersonicAdsAdapter.this.mOfferwallListener.a(false, ErrorBuilder.buildInitFailedError("Adapter initialization failure - " + SupersonicAdsAdapter.this.getProviderName() + " - " + e.getMessage(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    @Override // com.json.sa
    public boolean isOfferwallAvailable() {
        return true;
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
        if (TextUtils.isEmpty(str)) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        } else {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName() + ":onOWShowSuccess(placementId:" + str + ")");
        }
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
        if (this.mSSAPublisher != null) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.onPause");
            this.mSSAPublisher.onPause(activity);
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.onResume");
            this.mSSAPublisher.onResume(activity);
        }
    }

    @Override // com.json.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z) throws JSONException {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb = new StringBuilder();
        sb.append(getProviderName());
        sb.append(": setConsent (");
        sb.append(z ? a.g : "false");
        sb.append(")");
        ironLog.verbose(sb.toString());
        this.mDidSetConsent = true;
        this.mConsent = z;
        applyConsent(z);
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
            ironLog.verbose("not valid");
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

    @Override // com.json.sa
    public void showOfferwall(String str, JSONObject jSONObject) {
        HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams(jSONObject);
        if (offerwallExtraParams != null) {
            offerwallExtraParams.put(t2.k, str);
        }
        if (this.mSSAPublisher == null) {
            IronLog.INTERNAL.error("Please call init before calling showOfferwall");
            return;
        }
        IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.showOfferWall");
        this.mSSAPublisher.a(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
    }
}
