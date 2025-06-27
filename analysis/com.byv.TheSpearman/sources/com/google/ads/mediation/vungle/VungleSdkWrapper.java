package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VungleSdkWrapper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/google/ads/mediation/vungle/VungleSdkWrapper;", "", "()V", "delegate", "Lcom/google/ads/mediation/vungle/SdkWrapper;", "liftoffmonetize_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VungleSdkWrapper {
    public static final VungleSdkWrapper INSTANCE = new VungleSdkWrapper();
    public static SdkWrapper delegate = new SdkWrapper() { // from class: com.google.ads.mediation.vungle.VungleSdkWrapper$delegate$1
        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public String getBiddingToken(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return VungleAds.Companion.getBiddingToken(context);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public String getSdkVersion() {
            return VungleAds.Companion.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public void init(Context context, String appId, InitializationListener initializationListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
            VungleAds.Companion.init(context, appId, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public boolean isInitialized() {
            return VungleAds.Companion.isInitialized();
        }
    };

    private VungleSdkWrapper() {
    }
}
