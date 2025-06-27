package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

/* loaded from: classes2.dex */
public interface NativeBannerAdViewApi {
    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type);

    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes);
}
