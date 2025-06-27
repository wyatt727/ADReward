package com.my.target.mediation;

import android.content.Context;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;

/* loaded from: classes4.dex */
public interface MediationRewardedAdAdapter extends MediationAdapter {

    public interface MediationRewardedAdListener {
        void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onNoAd(IAdLoadingError iAdLoadingError, MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter);
    }

    void dismiss();

    void load(MediationAdConfig mediationAdConfig, MediationRewardedAdListener mediationRewardedAdListener, Context context);

    void show(Context context);
}
