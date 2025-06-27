package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.bg;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.sessions.BuildConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NimbusMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter {
    private static final String ADAPTER_VERSION = "1.0.0.0";
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static bg nimbusApiService;
    private static MaxAdapter.InitializationStatus status;
    private AppLovinAdView loadedAdView;

    public class NimbusAdapterAdViewListener implements AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;
        private final NimbusMediationAdapter parentAdapter;

        public NimbusAdapterAdViewListener(NimbusMediationAdapter nimbusMediationAdapter, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.parentAdapter = nimbusMediationAdapter;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked(NimbusMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
            this.parentAdapter.log(this.adFormat.getLabel() + " failed to display with error code: " + appLovinAdViewDisplayErrorCode);
            this.listener.onAdViewAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad hidden");
            this.listener.onAdViewAdHidden(NimbusMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad left application");
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad expanded");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            this.parentAdapter.log(this.adFormat.getLabel() + " ad loaded");
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.NimbusMediationAdapter$NimbusAdapterAdViewListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m256x6484799f(appLovinAd);
                }
            });
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            MaxAdapterError maxError = NimbusMediationAdapter.toMaxError(i);
            this.parentAdapter.log(this.adFormat.getLabel() + " ad failed to load with error code: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        /* renamed from: lambda$adReceived$0$com-applovin-mediation-adapters-NimbusMediationAdapter$NimbusAdapterAdViewListener, reason: not valid java name */
        public /* synthetic */ void m256x6484799f(AppLovinAd appLovinAd) {
            this.parentAdapter.loadedAdView = new AppLovinAdView(this.parentAdapter.getWrappingSdk(), appLovinAd.getSize(), this.parentAdapter.getApplicationContext());
            this.parentAdapter.loadedAdView.setAdDisplayListener(this);
            this.parentAdapter.loadedAdView.setAdClickListener(this);
            this.parentAdapter.loadedAdView.setAdViewEventListener(this);
            this.listener.onAdViewAdLoaded(this.parentAdapter.loadedAdView);
            this.parentAdapter.loadedAdView.renderAd(appLovinAd);
        }
    }

    public NimbusMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    protected static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle("ad_values", ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    protected static MaxAdapterError toMaxError(int i) {
        MaxAdapterError maxAdapterError = i == -1009 ? MaxAdapterError.NO_CONNECTION : i == 204 ? MaxAdapterError.NO_FILL : i >= 500 ? MaxAdapterError.SERVER_ERROR : MaxAdapterError.UNSPECIFIED;
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), i, "");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return ADAPTER_VERSION;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(maxAdapterInitializationParameters.getServerParameters().getString("app_id", ""));
            String string = JsonUtils.getString(jSONObject, "api_key", null);
            String string2 = JsonUtils.getString(jSONObject, "pub_id", null);
            String string3 = JsonUtils.getString(jSONObject, "base_url", null);
            if (TextUtils.isEmpty(string)) {
                MaxAdapter.InitializationStatus initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                status = initializationStatus;
                onCompletionListener.onCompletion(initializationStatus, "API Key cannot be null.");
            } else {
                status = MaxAdapter.InitializationStatus.INITIALIZING;
                bg bgVar = new bg(string, string2, string3, getWrappingSdk().a());
                nimbusApiService = bgVar;
                bgVar.a(maxAdapterInitializationParameters);
                log("Nimbus API successfully initialized");
                status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
            }
        } catch (JSONException unused) {
            MaxAdapter.InitializationStatus initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
            status = initializationStatus2;
            onCompletionListener.onCompletion(initializationStatus2, "Failed to serialize app id json string.");
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) throws JSONException {
        if (nimbusApiService == null) {
            log("Nimbus Service is not initialized");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        nimbusApiService.a(maxAdapterResponseParameters, maxAdFormat, new NimbusAdapterAdViewListener(this, maxAdFormat, maxAdViewAdapterListener));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        AppLovinAdView appLovinAdView = this.loadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.loadedAdView = null;
        }
    }
}
