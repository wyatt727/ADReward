package com.google.ads.mediation.mintegral.rtb;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MintegralRtbInterstitialAd extends MintegralInterstitialAd {
    private MintegralBidNewInterstitialAdWrapper mbBidNewInterstitialAdWrapper;

    public MintegralRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd() {
        String string = this.adConfiguration.getServerParameters().getString(MintegralConstants.AD_UNIT_ID);
        String string2 = this.adConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = this.adConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MintegralBidNewInterstitialAdWrapper mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler = MintegralFactory.createBidInterstitialHandler();
        this.mbBidNewInterstitialAdWrapper = mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler;
        mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler.createAd(this.adConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, this.adConfiguration.getWatermark());
            this.mbBidNewInterstitialAdWrapper.setExtraInfo(jSONObject);
        } catch (JSONException e) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e);
        }
        this.mbBidNewInterstitialAdWrapper.setInterstitialVideoListener(this);
        this.mbBidNewInterstitialAdWrapper.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.mbBidNewInterstitialAdWrapper.playVideoMute(MintegralUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()) ? 1 : 2);
        this.mbBidNewInterstitialAdWrapper.showFromBid();
    }
}
