package com.my.target.mediation;

import android.content.Context;
import android.view.View;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* loaded from: classes4.dex */
public interface MediationNativeBannerAdAdapter extends MediationAdapter {

    public interface MediationNativeBannerAdListener {
        void closeIfAutomaticallyDisabled(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onAdChoicesIconLoad(ImageData imageData, boolean z, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onCloseAutomatically(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        boolean shouldCloseAutomatically();
    }

    View getIconView(Context context);

    void load(MediationNativeBannerAdConfig mediationNativeBannerAdConfig, MediationNativeBannerAdListener mediationNativeBannerAdListener, Context context);

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
