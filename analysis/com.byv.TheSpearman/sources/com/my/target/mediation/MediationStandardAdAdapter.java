package com.my.target.mediation;

import android.content.Context;
import android.view.View;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* loaded from: classes4.dex */
public interface MediationStandardAdAdapter extends MediationAdapter {

    public interface MediationStandardAdListener {
        void onClick(MediationStandardAdAdapter mediationStandardAdAdapter);

        void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter);

        void onNoAd(IAdLoadingError iAdLoadingError, MediationStandardAdAdapter mediationStandardAdAdapter);

        void onShow(MediationStandardAdAdapter mediationStandardAdAdapter);
    }

    void load(MediationAdConfig mediationAdConfig, MyTargetView.AdSize adSize, MediationStandardAdListener mediationStandardAdListener, Context context);
}
