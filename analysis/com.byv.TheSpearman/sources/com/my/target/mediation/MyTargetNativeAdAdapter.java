package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.my.target.ba;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.m;
import com.my.target.mediation.MediationNativeAdAdapter;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.q6;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MyTargetNativeAdAdapter implements MediationNativeAdAdapter, AdChoicesClickHandler {
    private NativeAd ad;
    private q6 section;

    public class AdListener implements NativeAd.NativeAdListener, NativeAd.NativeAdChoicesListener, NativeAd.NativeAdChoicesOptionListener {
        private final MediationNativeAdAdapter.MediationNativeAdListener mediationListener;

        public AdListener(MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener) {
            this.mediationListener = mediationNativeAdListener;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public void closeIfAutomaticallyDisabled(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: the ad [" + nativeAd + "] should close manually");
            this.mediationListener.closeIfAutomaticallyDisabled(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: AdChoices icon downloading successfully");
            this.mediationListener.onAdChoicesIconLoad(imageData, z, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: Ad clicked");
            this.mediationListener.onClick(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public void onCloseAutomatically(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: the ad [" + nativeAd + "] should close automatically");
            this.mediationListener.onCloseAutomatically(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: Ad loaded");
            this.mediationListener.onLoad(nativePromoBanner, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.mediationListener.onNoAd(iAdLoadingError, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onShow(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: Ad shown");
            this.mediationListener.onShow(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoComplete(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: Video completed");
            this.mediationListener.onVideoComplete(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPause(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: Video paused");
            this.mediationListener.onVideoPause(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPlay(NativeAd nativeAd) {
            ba.a("MyTargetNativeAdAdapter: Video playing");
            this.mediationListener.onVideoPlay(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public boolean shouldCloseAutomatically() {
            ba.a("MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            return this.mediationListener.shouldCloseAutomatically();
        }
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        NativeAd nativeAd = this.ad;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
        this.ad.setListener(null);
        this.ad = null;
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public View getMediaView(Context context) {
        return null;
    }

    @Override // com.my.target.mediation.AdChoicesClickHandler
    public void handleAdChoicesClick(Context context) {
        NativeAd nativeAd = this.ad;
        if (nativeAd == null) {
            return;
        }
        nativeAd.handleAdChoicesClick(context);
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void load(MediationNativeAdConfig mediationNativeAdConfig, MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener, Context context) {
        String placementId = mediationNativeAdConfig.getPlacementId();
        try {
            int i = Integer.parseInt(placementId);
            NativeAd nativeAd = new NativeAd(i, mediationNativeAdConfig.getMenuFactory(), context);
            this.ad = nativeAd;
            nativeAd.setMediationEnabled(false);
            this.ad.setCachePolicy(mediationNativeAdConfig.getCachePolicy());
            AdListener adListener = new AdListener(mediationNativeAdListener);
            this.ad.setListener(adListener);
            this.ad.setAdChoicesListener(adListener);
            this.ad.setAdChoicesOptionListener(adListener);
            CustomParams customParams = this.ad.getCustomParams();
            customParams.setAge(mediationNativeAdConfig.getAge());
            customParams.setGender(mediationNativeAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationNativeAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationNativeAdConfig.getPayload();
            if (this.section != null) {
                ba.a("MyTargetNativeAdAdapter: Got banner from mediation response");
                this.ad.handleSection(this.section);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                ba.a("MyTargetNativeAdAdapter: Load id " + i);
                this.ad.load();
                return;
            }
            ba.a("MyTargetNativeAdAdapter: Load id " + i + " from BID " + payload);
            this.ad.loadFromBid(payload);
        } catch (Throwable unused) {
            ba.b("MyTargetNativeAdAdapter error: " + ("failed to request ad, unable to convert slotId " + placementId + " to int"));
            mediationNativeAdListener.onNoAd(m.o, this);
        }
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void registerView(View view, List<View> list, int i) {
        NativeAd nativeAd = this.ad;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setAdChoicesPlacement(i);
        this.ad.registerView(view, list);
    }

    public void setSection(q6 q6Var) {
        this.section = q6Var;
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void unregisterView() {
        NativeAd nativeAd = this.ad;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }
}
