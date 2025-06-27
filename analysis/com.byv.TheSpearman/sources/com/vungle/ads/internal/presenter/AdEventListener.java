package com.vungle.ads.internal.presenter;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.t2;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdEventListener.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\"\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/internal/presenter/AdEventListener;", "", "playAdCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/Placement;)V", "adRewarded", "", "getPlayAdCallback$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "onError", "", "error", "Lcom/vungle/ads/VungleError;", t2.k, "", "onNext", CmcdHeadersFactory.STREAMING_FORMAT_SS, "value", "id", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class AdEventListener {
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final AdPlayCallback playAdCallback;

    public AdEventListener(AdPlayCallback adPlayCallback, Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    /* renamed from: getPlayAdCallback$vungle_ads_release, reason: from getter */
    public final AdPlayCallback getPlayAdCallback() {
        return this.playAdCallback;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String s, String value, String id) {
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        Intrinsics.checkNotNullParameter(s, "s");
        Logger.INSTANCE.d(TAG, "s=" + s + ", value=" + value + ", id=" + id);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals(MRAIDPresenter.SUCCESSFUL_VIEW)) {
                    Placement placement = this.placement;
                    boolean z = false;
                    if (placement != null && placement.getIsIncentivized()) {
                        z = true;
                    }
                    if (z && !this.adRewarded) {
                        this.adRewarded = true;
                        AdPlayCallback adPlayCallback5 = this.playAdCallback;
                        if (adPlayCallback5 != null) {
                            adPlayCallback5.onAdRewarded(id);
                            break;
                        }
                    }
                }
                break;
            case -1627831289:
                if (s.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(id);
                    break;
                }
                break;
            case 100571:
                if (s.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(id);
                    break;
                }
                break;
            case 3417674:
                if (s.equals("open")) {
                    if (!Intrinsics.areEqual(value, "adClick")) {
                        if (Intrinsics.areEqual(value, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                            adPlayCallback3.onAdLeftApplication(id);
                            break;
                        }
                    } else {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(id);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(id);
                    break;
                }
                break;
        }
    }

    public final void onError(VungleError error, String placementId) {
        Intrinsics.checkNotNullParameter(error, "error");
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            Logger.INSTANCE.e(TAG, "AdEventListener#PlayAdCallback " + placementId, error);
        }
    }
}
