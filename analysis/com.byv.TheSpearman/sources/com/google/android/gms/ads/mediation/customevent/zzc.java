package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
final class zzc implements CustomEventNativeListener {
    private final CustomEventAdapter zza;
    private final MediationNativeListener zzb;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzm.zze("Custom event adapter called onAdClicked.");
        this.zzb.onAdClicked(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzm.zze("Custom event adapter called onAdClosed.");
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzm.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad(this.zza, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        zzm.zze("Custom event adapter called onAdImpression.");
        this.zzb.onAdImpression(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzm.zze("Custom event adapter called onAdLeftApplication.");
        this.zzb.onAdLeftApplication(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzm.zze("Custom event adapter called onAdLoaded.");
        this.zzb.onAdLoaded(this.zza, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzm.zze("Custom event adapter called onAdOpened.");
        this.zzb.onAdOpened(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzm.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad(this.zza, adError);
    }
}
