package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* compiled from: VungleError.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/AdNotLoadedCantPlay;", "Lcom/vungle/ads/VungleError;", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AdNotLoadedCantPlay extends VungleError {
    public AdNotLoadedCantPlay() {
        super(Integer.valueOf(VungleError.AD_UNABLE_TO_PLAY), Sdk.SDKError.Reason.AD_NOT_LOADED, "Failed to retrieve the ad object.", null, null, null, 56, null);
    }
}
