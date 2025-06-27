package com.google.ads.mediation.unity;

import android.app.Activity;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

/* loaded from: classes2.dex */
class UnityBannerViewFactory {
    UnityBannerViewFactory() {
    }

    UnityBannerViewWrapper createBannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        return new UnityBannerViewWrapper(new BannerView(activity, str, unityBannerSize));
    }
}
