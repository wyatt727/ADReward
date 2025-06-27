package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class VungleInterstitialAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private BannerAd bannerAd;
    private RelativeLayout bannerLayout;
    private InterstitialAd interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(final Context context, final MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        final String string2 = bundle.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
            final AdConfig adConfig = new AdConfig();
            if (bundle2 != null && bundle2.containsKey(VungleConstants.KEY_ORIENTATION)) {
                adConfig.setAdOrientation(bundle2.getInt(VungleConstants.KEY_ORIENTATION, 2));
            }
            VungleInitializer.getInstance().initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.vungle.mediation.VungleInterstitialAdapter.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    VungleInterstitialAdapter.this.interstitialAd = new InterstitialAd(context, string2, adConfig);
                    VungleInterstitialAdapter.this.interstitialAd.setAdListener(new VungleInterstitialListener());
                    VungleInterstitialAdapter.this.interstitialAd.load(null);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError3) {
                    mediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError3);
                    Log.w(VungleMediationAdapter.TAG, adError3.toString());
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.play(null);
        }
    }

    private class VungleInterstitialListener implements InterstitialAdListener {
        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
        }

        private VungleInterstitialListener() {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClicked(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.d(VungleMediationAdapter.TAG, "onDestroy: " + hashCode());
        if (this.bannerAd != null) {
            this.bannerLayout.removeAllViews();
            this.bannerAd.finishAd();
            this.bannerAd = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final Context context, MediationBannerListener mediationBannerListener, Bundle bundle, final AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
        final String string2 = bundle.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        final BannerAdSize vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(context, adSize);
        if (vungleBannerAdSizeFromGoogleAdSize == null) {
            AdError adError3 = new AdError(102, "Failed to load waterfall banner ad from Liftoff Monetize. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError3.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError3);
            return;
        }
        Log.d(VungleMediationAdapter.TAG, "requestBannerAd for Placement: " + string2 + " ### Adapter instance: " + hashCode());
        VungleInitializer.getInstance().initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.vungle.mediation.VungleInterstitialAdapter.2
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                VungleInterstitialAdapter.this.bannerLayout = new RelativeLayout(context);
                int heightInPixels = adSize.getHeightInPixels(context);
                if (heightInPixels <= 0) {
                    heightInPixels = Math.round(vungleBannerAdSizeFromGoogleAdSize.getHeight() * context.getResources().getDisplayMetrics().density);
                }
                VungleInterstitialAdapter.this.bannerLayout.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
                VungleInterstitialAdapter.this.bannerAd = new BannerAd(context, string2, vungleBannerAdSizeFromGoogleAdSize);
                VungleInterstitialAdapter.this.bannerAd.setAdListener(new VungleBannerListener());
                VungleInterstitialAdapter.this.bannerAd.load(null);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError4) {
                Log.w(VungleMediationAdapter.TAG, adError4.toString());
                if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                    VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError4);
                }
            }
        });
    }

    private class VungleBannerListener implements BannerAdListener {
        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
        }

        private VungleBannerListener() {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdClicked(VungleInterstitialAdapter.this);
                VungleInterstitialAdapter.this.mediationBannerListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleInterstitialAdapter.this.createBanner();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createBanner() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            AdError adError = new AdError(106, "Try to play banner ad but the Vungle BannerAd instance not created.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            MediationBannerListener mediationBannerListener = this.mediationBannerListener;
            if (mediationBannerListener != null) {
                mediationBannerListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        View bannerView = bannerAd.getBannerView();
        if (bannerView == null) {
            AdError adError2 = new AdError(106, "Vungle SDK returned a successful load callback, but getBannerView() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            MediationBannerListener mediationBannerListener2 = this.mediationBannerListener;
            if (mediationBannerListener2 != null) {
                mediationBannerListener2.onAdFailedToLoad(this, adError2);
                return;
            }
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14, -1);
        layoutParams.addRule(15, -1);
        bannerView.setLayoutParams(layoutParams);
        this.bannerLayout.addView(bannerView);
        MediationBannerListener mediationBannerListener3 = this.mediationBannerListener;
        if (mediationBannerListener3 != null) {
            mediationBannerListener3.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        Log.d(VungleMediationAdapter.TAG, "getBannerView # instance: " + hashCode());
        return this.bannerLayout;
    }

    public static BannerAdSize getVungleBannerAdSizeFromGoogleAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(BannerAdSize.BANNER_SHORT.getWidth(), BannerAdSize.BANNER_SHORT.getHeight()));
        arrayList.add(new AdSize(BannerAdSize.BANNER.getWidth(), BannerAdSize.BANNER.getHeight()));
        arrayList.add(new AdSize(BannerAdSize.BANNER_LEADERBOARD.getWidth(), BannerAdSize.BANNER_LEADERBOARD.getHeight()));
        arrayList.add(new AdSize(BannerAdSize.VUNGLE_MREC.getWidth(), BannerAdSize.VUNGLE_MREC.getHeight()));
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        Log.d(VungleMediationAdapter.TAG, "Found closest Liftoff Monetize banner ad size: " + adSizeFindClosestSize + " for requested ad size: " + adSize);
        if (adSizeFindClosestSize.getWidth() == BannerAdSize.BANNER_SHORT.getWidth() && adSizeFindClosestSize.getHeight() == BannerAdSize.BANNER_SHORT.getHeight()) {
            return BannerAdSize.BANNER_SHORT;
        }
        if (adSizeFindClosestSize.getWidth() == BannerAdSize.BANNER.getWidth() && adSizeFindClosestSize.getHeight() == BannerAdSize.BANNER.getHeight()) {
            return BannerAdSize.BANNER;
        }
        if (adSizeFindClosestSize.getWidth() == BannerAdSize.BANNER_LEADERBOARD.getWidth() && adSizeFindClosestSize.getHeight() == BannerAdSize.BANNER_LEADERBOARD.getHeight()) {
            return BannerAdSize.BANNER_LEADERBOARD;
        }
        if (adSizeFindClosestSize.getWidth() == BannerAdSize.VUNGLE_MREC.getWidth() && adSizeFindClosestSize.getHeight() == BannerAdSize.VUNGLE_MREC.getHeight()) {
            return BannerAdSize.VUNGLE_MREC;
        }
        return null;
    }
}
