package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.Logger;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: VungleAds.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/VungleAds;", "", "()V", "Companion", "WrapperFramework", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class VungleAds {
    public static final String TAG = "VungleAds";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();

    /* compiled from: VungleAds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/VungleAds$WrapperFramework;", "", "(Ljava/lang/String;I)V", AppLovinMediationProvider.ADMOB, "air", "cocos2dx", "corona", "dfp", AppLovinMediationProvider.HEYZAP, "marmalade", AppLovinMediationProvider.MOPUB, "unity", AppLovinMediationProvider.FYBER, AppLovinMediationProvider.IRONSOURCE, "upsight", AppLovinMediationProvider.APPODEAL, AppLovinMediationProvider.AERSERV, "adtoapp", AppLovinMediationProvider.TAPDAQ, "vunglehbs", AppLovinMediationProvider.MAX, "none", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    @JvmStatic
    public static final String getBiddingToken(Context context) {
        return INSTANCE.getBiddingToken(context);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    @JvmStatic
    public static final void init(Context context, String str, InitializationListener initializationListener) {
        INSTANCE.init(context, str, initializationListener);
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    @JvmStatic
    public static final void setIntegrationName(WrapperFramework wrapperFramework, String str) {
        INSTANCE.setIntegrationName(wrapperFramework, str);
    }

    /* compiled from: VungleAds.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J \u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/VungleAds$Companion;", "", "()V", "TAG", "", "initializer", "Lcom/vungle/ads/internal/VungleInitializer;", "vungleInternal", "Lcom/vungle/ads/internal/VungleInternal;", "deInit", "", "deInit$vungle_ads_release", "getBiddingToken", "context", "Landroid/content/Context;", "getSdkVersion", t2.a.e, RemoteConfigConstants.RequestFieldKey.APP_ID, "callback", "Lcom/vungle/ads/InitializationListener;", "isInitialized", "", "setIntegrationName", "wrapperFramework", "Lcom/vungle/ads/VungleAds$WrapperFramework;", "wrapperFrameworkVersion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void init(Context context, String appId, InitializationListener callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            VungleInitializer vungleInitializer = VungleAds.initializer;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            vungleInitializer.init(appId, context, callback);
        }

        @JvmStatic
        public final boolean isInitialized() {
            return VungleAds.initializer.getIsInitialized();
        }

        @JvmStatic
        public final String getBiddingToken(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return VungleAds.vungleInternal.getAvailableBidTokens(context);
        }

        @JvmStatic
        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        @JvmStatic
        public final void setIntegrationName(WrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
            String str;
            Intrinsics.checkNotNullParameter(wrapperFramework, "wrapperFramework");
            Intrinsics.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            if (wrapperFramework != WrapperFramework.none) {
                VungleApiClient.INSTANCE.setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(wrapperFramework);
                String headerUa = VungleApiClient.INSTANCE.getHeaderUa();
                if (wrapperFrameworkVersion.length() > 0) {
                    str = '/' + wrapperFrameworkVersion;
                } else {
                    str = "";
                }
                String str2 = wrapperFramework + str;
                if (new HashSet(StringsKt.split$default((CharSequence) headerUa, new String[]{";"}, false, 0, 6, (Object) null)).add(str2)) {
                    VungleApiClient.INSTANCE.setHeaderUa(headerUa + ';' + str2);
                }
            } else {
                Logger.INSTANCE.e(VungleAds.TAG, "Wrapper is null or is none");
            }
            if (isInitialized()) {
                Logger.INSTANCE.w(VungleAds.TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
            }
        }

        public final void deInit$vungle_ads_release() {
            VungleAds.initializer.deInit$vungle_ads_release();
        }
    }
}
