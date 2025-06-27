package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzbhz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface MediationNativeListener {
    void onAdClicked(MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i);

    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError);

    void onAdImpression(MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(MediationNativeAdapter mediationNativeAdapter);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbhz zzbhzVar);

    void zze(MediationNativeAdapter mediationNativeAdapter, zzbhz zzbhzVar, String str);
}
