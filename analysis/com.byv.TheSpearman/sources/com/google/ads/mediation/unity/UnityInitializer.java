package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;

/* loaded from: classes2.dex */
public class UnityInitializer {
    static final String ADMOB = "AdMob";
    static final String KEY_ADAPTER_VERSION = "adapter_version";
    private static UnityInitializer unityInitializerInstance;
    private final UnityAdsWrapper unityAdsWrapper;

    static synchronized UnityInitializer getInstance() {
        if (unityInitializerInstance == null) {
            unityInitializerInstance = new UnityInitializer();
        }
        return unityInitializerInstance;
    }

    private UnityInitializer() {
        this.unityAdsWrapper = new UnityAdsWrapper();
    }

    UnityInitializer(UnityAdsWrapper unityAdsWrapper) {
        this.unityAdsWrapper = unityAdsWrapper;
    }

    public void initializeUnityAds(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (this.unityAdsWrapper.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaData = this.unityAdsWrapper.getMediationMetaData(context);
        mediationMetaData.setName(ADMOB);
        mediationMetaData.setVersion(this.unityAdsWrapper.getVersion());
        mediationMetaData.set(KEY_ADAPTER_VERSION, BuildConfig.ADAPTER_VERSION);
        mediationMetaData.commit();
        this.unityAdsWrapper.initialize(context, str, iUnityAdsInitializationListener);
    }
}
