package com.google.ads.mediation.vungle.renderers;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.json.id;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VungleAppOpenAd.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010 \u001a\u00020\u0011J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/google/ads/mediation/vungle/renderers/VungleAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/vungle/ads/InterstitialAdListener;", "mediationAppOpenAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "vungleFactory", "Lcom/google/ads/mediation/vungle/VungleFactory;", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/vungle/VungleFactory;)V", "appOpenAd", "Lcom/vungle/ads/InterstitialAd;", "mediationAppOpenAdCallback", "getAdMarkup", "", "maybeAddWatermarkToVungleAdConfig", "", "adConfig", "Lcom/vungle/ads/AdConfig;", id.f, "baseAd", "Lcom/vungle/ads/BaseAd;", "onAdEnd", "onAdFailedToLoad", "adError", "Lcom/vungle/ads/VungleError;", "onAdFailedToPlay", "onAdImpression", id.k, id.j, "onAdStart", "render", "showAd", "context", "Landroid/content/Context;", "liftoffmonetize_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class VungleAppOpenAd implements MediationAppOpenAd, InterstitialAdListener {
    private InterstitialAd appOpenAd;
    private final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback;
    private MediationAppOpenAdCallback mediationAppOpenAdCallback;
    private final MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration;
    private final VungleFactory vungleFactory;

    public abstract String getAdMarkup(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void maybeAddWatermarkToVungleAdConfig(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    public VungleAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
        this.mediationAppOpenAdConfiguration = mediationAppOpenAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public final void render() {
        final Bundle mediationExtras = this.mediationAppOpenAdConfiguration.getMediationExtras();
        Intrinsics.checkNotNullExpressionValue(mediationExtras, "mediationAppOpenAdConfiguration.mediationExtras");
        Bundle serverParameters = this.mediationAppOpenAdConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "mediationAppOpenAdConfiguration.serverParameters");
        String string = serverParameters.getString("appid");
        String str = string;
        if (str == null || str.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        String str2 = string2;
        if (str2 == null || str2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.mediationAdLoadCallback.onFailure(adError2);
        } else {
            final Context context = this.mediationAppOpenAdConfiguration.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "mediationAppOpenAdConfiguration.context");
            VungleInitializer vungleInitializer = VungleInitializer.getInstance();
            Intrinsics.checkNotNull(string);
            vungleInitializer.initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.render.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    AdConfig adConfigCreateAdConfig = VungleAppOpenAd.this.vungleFactory.createAdConfig();
                    if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
                        adConfigCreateAdConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
                    }
                    VungleAppOpenAd vungleAppOpenAd = VungleAppOpenAd.this;
                    vungleAppOpenAd.maybeAddWatermarkToVungleAdConfig(adConfigCreateAdConfig, vungleAppOpenAd.mediationAppOpenAdConfiguration);
                    VungleAppOpenAd vungleAppOpenAd2 = VungleAppOpenAd.this;
                    VungleFactory vungleFactory = vungleAppOpenAd2.vungleFactory;
                    Context context2 = context;
                    String str3 = string2;
                    Intrinsics.checkNotNull(str3);
                    vungleAppOpenAd2.appOpenAd = vungleFactory.createInterstitialAd(context2, str3, adConfigCreateAdConfig);
                    InterstitialAd interstitialAd = VungleAppOpenAd.this.appOpenAd;
                    InterstitialAd interstitialAd2 = null;
                    if (interstitialAd == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
                        interstitialAd = null;
                    }
                    interstitialAd.setAdListener(VungleAppOpenAd.this);
                    InterstitialAd interstitialAd3 = VungleAppOpenAd.this.appOpenAd;
                    if (interstitialAd3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
                    } else {
                        interstitialAd2 = interstitialAd3;
                    }
                    VungleAppOpenAd vungleAppOpenAd3 = VungleAppOpenAd.this;
                    interstitialAd2.load(vungleAppOpenAd3.getAdMarkup(vungleAppOpenAd3.mediationAppOpenAdConfiguration));
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Log.w(VungleMediationAdapter.TAG, error.toString());
                    VungleAppOpenAd.this.mediationAdLoadCallback.onFailure(error);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterstitialAd interstitialAd = this.appOpenAd;
        InterstitialAd interstitialAd2 = null;
        if (interstitialAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            interstitialAd = null;
        }
        if (interstitialAd.canPlayAd().booleanValue()) {
            InterstitialAd interstitialAd3 = this.appOpenAd;
            if (interstitialAd3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.mediationAppOpenAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        this.mediationAdLoadCallback.onFailure(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }
}
