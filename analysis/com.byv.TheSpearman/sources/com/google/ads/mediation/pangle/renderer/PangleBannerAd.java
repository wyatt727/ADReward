package com.google.ads.mediation.pangle.renderer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PangleBannerAd implements MediationBannerAd, PAGBannerAdInteractionListener {
    public static final String ERROR_MESSAGE_BANNER_SIZE_MISMATCH = "Failed to request banner ad from Pangle. Invalid banner size.";
    private final MediationBannerAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> adLoadCallback;
    private MediationBannerAdCallback bannerAdCallback;
    private final PangleFactory pangleFactory;
    private final PangleInitializer pangleInitializer;
    private final PanglePrivacyConfig panglePrivacyConfig;
    private final PangleSdkWrapper pangleSdkWrapper;
    FrameLayout wrappedAdView;

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public PangleBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }

    public void render() {
        this.panglePrivacyConfig.setCoppa(this.adConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        final String string = serverParameters.getString(PangleConstants.PLACEMENT_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            final String bidResponse = this.adConfiguration.getBidResponse();
            final Context context = this.adConfiguration.getContext();
            this.pangleInitializer.initialize(context, serverParameters.getString("appid"), new PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleBannerAd.1
                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeSuccess() {
                    AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, PangleBannerAd.this.adConfiguration.getAdSize(), PangleBannerAd.getSupportedBannerSizes());
                    if (adSizeFindClosestSize == null) {
                        AdError adErrorCreateAdapterError2 = PangleConstants.createAdapterError(102, PangleBannerAd.ERROR_MESSAGE_BANNER_SIZE_MISMATCH);
                        Log.w(PangleMediationAdapter.TAG, adErrorCreateAdapterError2.toString());
                        PangleBannerAd.this.adLoadCallback.onFailure(adErrorCreateAdapterError2);
                    } else {
                        PangleBannerAd.this.wrappedAdView = new FrameLayout(context);
                        PAGBannerRequest pAGBannerRequestCreatePagBannerRequest = PangleBannerAd.this.pangleFactory.createPagBannerRequest(new PAGBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight()));
                        pAGBannerRequestCreatePagBannerRequest.setAdString(bidResponse);
                        PangleRequestHelper.setWatermarkString(pAGBannerRequestCreatePagBannerRequest, bidResponse, PangleBannerAd.this.adConfiguration);
                        PangleBannerAd.this.pangleSdkWrapper.loadBannerAd(string, pAGBannerRequestCreatePagBannerRequest, new PAGBannerAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleBannerAd.1.1
                            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
                            public void onError(int i, String str) {
                                AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
                                Log.w(PangleMediationAdapter.TAG, adErrorCreateSdkError.toString());
                                PangleBannerAd.this.adLoadCallback.onFailure(adErrorCreateSdkError);
                            }

                            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                                pAGBannerAd.setAdInteractionListener(PangleBannerAd.this);
                                PangleBannerAd.this.wrappedAdView.addView(pAGBannerAd.getBannerView());
                                PangleBannerAd.this.bannerAdCallback = (MediationBannerAdCallback) PangleBannerAd.this.adLoadCallback.onSuccess(PangleBannerAd.this);
                            }
                        });
                    }
                }

                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeError(AdError adError) {
                    Log.w(PangleMediationAdapter.TAG, adError.toString());
                    PangleBannerAd.this.adLoadCallback.onFailure(adError);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.wrappedAdView;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    static List<AdSize> getSupportedBannerSizes() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(Strategy.TTL_SECONDS_DEFAULT, 250));
        arrayList.add(new AdSize(728, 90));
        return arrayList;
    }
}
