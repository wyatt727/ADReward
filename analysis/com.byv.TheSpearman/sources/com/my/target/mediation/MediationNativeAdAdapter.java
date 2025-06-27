package com.my.target.mediation;

import android.content.Context;
import android.view.View;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.banners.NativePromoBanner;
import java.util.List;

/* loaded from: classes4.dex */
public interface MediationNativeAdAdapter extends MediationAdapter {

    public interface MediationNativeAdListener {
        void closeIfAutomaticallyDisabled(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onAdChoicesIconLoad(ImageData imageData, boolean z, MediationNativeAdAdapter mediationNativeAdAdapter);

        void onClick(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onCloseAutomatically(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter);

        void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeAdAdapter mediationNativeAdAdapter);

        void onShow(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter);

        boolean shouldCloseAutomatically();
    }

    View getMediaView(Context context);

    void load(MediationNativeAdConfig mediationNativeAdConfig, MediationNativeAdListener mediationNativeAdListener, Context context);

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
