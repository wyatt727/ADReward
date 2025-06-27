package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.my.target.ba;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.m;
import com.my.target.mediation.MediationNativeBannerAdAdapter;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.q6;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MyTargetNativeBannerAdAdapter implements MediationNativeBannerAdAdapter, AdChoicesClickHandler {
    private NativeBannerAd ad;
    private q6 section;

    public class AdListener implements NativeBannerAd.NativeBannerAdListener, NativeBannerAd.NativeBannerAdChoicesOptionListener, NativeBannerAd.NativeBannerAdChoicesListener {
        private final MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationListener;

        public AdListener(MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener) {
            this.mediationListener = mediationNativeBannerAdListener;
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeAdAdapter: the ad [" + nativeBannerAd + "] should close manually");
            this.mediationListener.closeIfAutomaticallyDisabled(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeBannerAdAdapter$AdListener: AdChoices icon downloading successfully");
            this.mediationListener.onAdChoicesIconLoad(imageData, z, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onClick(NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeBannerAdAdapter$AdListener: Ad clicked");
            this.mediationListener.onClick(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public void onCloseAutomatically(NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeAdAdapter: the ad [" + nativeBannerAd + "] should close automatically");
            this.mediationListener.onCloseAutomatically(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeBannerAdAdapter$AdListener: Ad loaded");
            this.mediationListener.onLoad(nativeBanner, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeBannerAdAdapter$AdListener: No ad (" + iAdLoadingError.getMessage() + ")");
            this.mediationListener.onNoAd(iAdLoadingError, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onShow(NativeBannerAd nativeBannerAd) {
            ba.a("MyTargetNativeBannerAdAdapter$AdListener: Ad shown");
            this.mediationListener.onShow(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public boolean shouldCloseAutomatically() {
            ba.a("MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            return this.mediationListener.shouldCloseAutomatically();
        }
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        NativeBannerAd nativeBannerAd = this.ad;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.unregisterView();
        this.ad.setListener(null);
        this.ad = null;
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public View getIconView(Context context) {
        return null;
    }

    @Override // com.my.target.mediation.AdChoicesClickHandler
    public void handleAdChoicesClick(Context context) {
        NativeBannerAd nativeBannerAd = this.ad;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.handleAdChoicesClick(context);
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void load(MediationNativeBannerAdConfig mediationNativeBannerAdConfig, MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener, Context context) {
        String placementId = mediationNativeBannerAdConfig.getPlacementId();
        try {
            int i = Integer.parseInt(placementId);
            NativeBannerAd nativeBannerAd = new NativeBannerAd(i, mediationNativeBannerAdConfig.getMenuFactory(), context);
            this.ad = nativeBannerAd;
            nativeBannerAd.setMediationEnabled(false);
            this.ad.setCachePolicy(mediationNativeBannerAdConfig.getCachePolicy());
            AdListener adListener = new AdListener(mediationNativeBannerAdListener);
            this.ad.setListener(adListener);
            this.ad.setAdChoicesListener(adListener);
            this.ad.setAdChoicesOptionListener(adListener);
            CustomParams customParams = this.ad.getCustomParams();
            customParams.setAge(mediationNativeBannerAdConfig.getAge());
            customParams.setGender(mediationNativeBannerAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationNativeBannerAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationNativeBannerAdConfig.getPayload();
            if (this.section != null) {
                ba.a("MyTargetNativeBannerAdAdapter: Got banner from mediation response");
                this.ad.handleSection(this.section);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                ba.a("MyTargetNativeBannerAdAdapter: Load id " + i);
                this.ad.load();
                return;
            }
            ba.a("MyTargetNativeBannerAdAdapter: Load id " + i + " from BID " + payload);
            this.ad.loadFromBid(payload);
        } catch (Throwable unused) {
            ba.b("MyTargetNativeBannerAdAdapter: Error - " + ("failed to request ad, unable to convert slotId " + placementId + " to int"));
            mediationNativeBannerAdListener.onNoAd(m.o, this);
        }
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void registerView(View view, List<View> list, int i) {
        NativeBannerAd nativeBannerAd = this.ad;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.setAdChoicesPlacement(i);
        this.ad.registerView(view, list);
    }

    public void setSection(q6 q6Var) {
        this.section = q6Var;
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void unregisterView() {
        NativeBannerAd nativeBannerAd = this.ad;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.unregisterView();
    }
}
