package com.my.target.mediation;

import android.content.Context;
import com.my.target.common.models.IAdLoadingError;

/* loaded from: classes4.dex */
public interface MediationInterstitialAdAdapter extends MediationAdapter {

    public interface MediationInterstitialAdListener {
        void onClick(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDismiss(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDisplay(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onLoad(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onNoAd(IAdLoadingError iAdLoadingError, MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onVideoCompleted(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);
    }

    void dismiss();

    void load(MediationAdConfig mediationAdConfig, MediationInterstitialAdListener mediationInterstitialAdListener, Context context);

    void show(Context context);
}
