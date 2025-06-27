package com.json.mediationsdk.ads.nativead.internal;

import com.json.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/internal/InternalNativeAdListener;", "", "onNativeAdClicked", "", "adInfo", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "onNativeAdImpression", "onNativeAdLoadFailed", "error", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "onNativeAdLoaded", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "nativeAdViewBinder", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(AdInfo adInfo);

    void onNativeAdImpression(AdInfo adInfo);

    void onNativeAdLoadFailed(IronSourceError error);

    void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder);
}
