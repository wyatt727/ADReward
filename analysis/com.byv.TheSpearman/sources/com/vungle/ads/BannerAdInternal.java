package com.vungle.ads;

import android.content.Context;
import com.json.t2;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerAd.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/BannerAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "context", "Landroid/content/Context;", t2.h.O, "Lcom/vungle/ads/BannerAdSize;", "(Landroid/content/Context;Lcom/vungle/ads/BannerAdSize;)V", "adLoadedAndUpdateConfigure", "", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "adLoadedAndUpdateConfigure$vungle_ads_release", "getAdSizeForAdRequest", "", "isBannerAdSize", "", "isBannerAdSize$vungle_ads_release", "isValidAdSize", "isValidAdTypeForPlacement", "placement", "Lcom/vungle/ads/internal/model/Placement;", "wrapCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "wrapCallback$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerAdInternal extends AdInternal {
    private final BannerAdSize adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdInternal(Context context, BannerAdSize adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.adSize = adSize;
    }

    public final AdPlayCallbackWrapper wrapCallback$vungle_ads_release(final AdPlayCallback adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        return new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.BannerAdInternal$wrapCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String id) {
                this.setAdState(AdInternal.AdState.PLAYING);
                super.onAdStart(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String id) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(error);
            }
        };
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isBanner();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // com.vungle.ads.internal.AdInternal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValidAdSize(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "adSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9.isBannerAdSize$vungle_ads_release(r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            com.vungle.ads.internal.model.Placement r3 = r9.getPlacement()
            if (r3 == 0) goto L1b
            boolean r3 = r3.isMREC()
            if (r3 != r1) goto L1b
            r3 = r1
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == 0) goto L2c
            com.vungle.ads.BannerAdSize r3 = com.vungle.ads.BannerAdSize.VUNGLE_MREC
            java.lang.String r3 = r3.getSizeName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r3)
            if (r3 != 0) goto L2c
        L2a:
            r0 = r2
            goto L4b
        L2c:
            if (r0 == 0) goto L4b
            com.vungle.ads.internal.model.Placement r3 = r9.getPlacement()
            if (r3 == 0) goto L3b
            boolean r3 = r3.isBannerNonMREC()
            if (r3 != r1) goto L3b
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r1 == 0) goto L4b
            com.vungle.ads.BannerAdSize r1 = com.vungle.ads.BannerAdSize.VUNGLE_MREC
            java.lang.String r1 = r1.getSizeName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r1)
            if (r1 == 0) goto L4b
            goto L2a
        L4b:
            if (r0 != 0) goto L87
            com.vungle.ads.AnalyticsClient r1 = com.vungle.ads.AnalyticsClient.INSTANCE
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalidate size "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r10 = " for banner ad"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.vungle.ads.internal.model.Placement r10 = r9.getPlacement()
            r4 = 0
            if (r10 == 0) goto L73
            java.lang.String r10 = r10.getReferenceId()
            goto L74
        L73:
            r10 = r4
        L74:
            r5 = 0
            com.vungle.ads.internal.model.AdPayload r6 = r9.getAdvertisement()
            if (r6 == 0) goto L7f
            java.lang.String r4 = r6.eventId()
        L7f:
            r6 = r4
            r7 = 8
            r8 = 0
            r4 = r10
            com.vungle.ads.AnalyticsClient.logError$vungle_ads_release$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.BannerAdInternal.isValidAdSize(java.lang.String):boolean");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public String getAdSizeForAdRequest() {
        return this.adSize.getSizeName();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        advertisement.setAdSize(this.adSize);
    }

    public final boolean isBannerAdSize$vungle_ads_release(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return Intrinsics.areEqual(adSize, BannerAdSize.BANNER.getSizeName()) || Intrinsics.areEqual(adSize, BannerAdSize.BANNER_LEADERBOARD.getSizeName()) || Intrinsics.areEqual(adSize, BannerAdSize.BANNER_SHORT.getSizeName()) || Intrinsics.areEqual(adSize, BannerAdSize.VUNGLE_MREC.getSizeName());
    }
}
