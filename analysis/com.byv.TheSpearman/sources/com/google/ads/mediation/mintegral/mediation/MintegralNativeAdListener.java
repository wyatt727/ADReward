package com.google.ads.mediation.mintegral.mediation;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* loaded from: classes2.dex */
public class MintegralNativeAdListener extends NativeAdWithCodeListener {
    protected MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    private MintegralNativeAd mintegralNativeAd;
    protected MediationNativeAdCallback nativeCallback;

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
    }

    public MintegralNativeAdListener(MintegralNativeAd mintegralNativeAd) {
        this.mintegralNativeAd = mintegralNativeAd;
        this.adLoadCallback = mintegralNativeAd.adLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i) {
        if (list == null || list.size() == 0) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(104, "Mintegral SDK failed to return a native ad.");
            Log.w(MintegralMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            this.mintegralNativeAd.mapNativeAd(list.get(0));
            this.nativeCallback = this.adLoadCallback.onSuccess(this.mintegralNativeAd);
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i, String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorCreateSdkError.toString());
        this.adLoadCallback.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.nativeCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }
}
