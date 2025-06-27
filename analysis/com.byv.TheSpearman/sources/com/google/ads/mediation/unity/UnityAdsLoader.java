package com.google.ads.mediation.unity;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;

/* loaded from: classes2.dex */
class UnityAdsLoader {
    UnityAdsLoader() {
    }

    public void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAds.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAds.show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }

    public UnityAdsLoadOptions createUnityAdsLoadOptions() {
        return new UnityAdsLoadOptions();
    }

    public UnityAdsLoadOptions createUnityAdsLoadOptionsWithId(String str) {
        UnityAdsLoadOptions unityAdsLoadOptionsCreateUnityAdsLoadOptions = createUnityAdsLoadOptions();
        unityAdsLoadOptionsCreateUnityAdsLoadOptions.setObjectId(str);
        return unityAdsLoadOptionsCreateUnityAdsLoadOptions;
    }

    public UnityAdsShowOptions createUnityAdsShowOptionsWithId(String str) {
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(str);
        return unityAdsShowOptions;
    }
}
