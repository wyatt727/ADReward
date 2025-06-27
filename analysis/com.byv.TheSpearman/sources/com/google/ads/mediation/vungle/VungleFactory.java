package com.google.ads.mediation.vungle;

import android.content.Context;
import com.json.t2;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.RewardedAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VungleFactory.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004¨\u0006\u0014"}, d2 = {"Lcom/google/ads/mediation/vungle/VungleFactory;", "", "()V", "createAdConfig", "Lcom/vungle/ads/AdConfig;", "createBannerAd", "Lcom/vungle/ads/BannerAd;", "context", "Landroid/content/Context;", t2.k, "", t2.h.O, "Lcom/vungle/ads/BannerAdSize;", "createInterstitialAd", "Lcom/vungle/ads/InterstitialAd;", "adConfig", "createNativeAd", "Lcom/vungle/ads/NativeAd;", "createRewardedAd", "Lcom/vungle/ads/RewardedAd;", "liftoffmonetize_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VungleFactory {
    public final BannerAd createBannerAd(Context context, String placementId, BannerAdSize adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new BannerAd(context, placementId, adSize);
    }

    public final InterstitialAd createInterstitialAd(Context context, String placementId, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        return new InterstitialAd(context, placementId, adConfig);
    }

    public final RewardedAd createRewardedAd(Context context, String placementId, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        return new RewardedAd(context, placementId, adConfig);
    }

    public final NativeAd createNativeAd(Context context, String placementId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new NativeAd(context, placementId);
    }

    public final AdConfig createAdConfig() {
        return new AdConfig();
    }
}
