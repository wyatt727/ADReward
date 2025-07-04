package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import com.facebook.ads.Ad;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;

/* loaded from: classes2.dex */
public interface AdViewApi extends AdViewParentApi, Ad {
    AdView.AdViewLoadConfigBuilder buildLoadAdConfig();

    void loadAd(AdView.AdViewLoadConfig adViewLoadConfig);

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    void onConfigurationChanged(Configuration configuration);

    @Override // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
