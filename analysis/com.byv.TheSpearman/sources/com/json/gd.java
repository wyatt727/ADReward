package com.json;

import android.app.Activity;
import android.content.Context;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.mediationsdk.ISBannerSize;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceBannerLayout;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.json.mediationsdk.c;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.p;
import com.json.mediationsdk.sdk.LevelPlayBannerListener;
import com.json.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000bJ\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0006\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0012J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!J\u0006\u0010#\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!J \u0010\u0006\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019J\u0016\u0010\u0006\u001a\u00020*2\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(J\u0010\u0010\t\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*J\u000e\u0010\t\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002¨\u00062"}, d2 = {"Lcom/ironsource/gd;", "", "", bd.c, "sdkVersion", "Lorg/json/JSONObject;", "a", "Landroid/content/Context;", "context", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "Ljava/util/concurrent/ConcurrentHashMap;", "", "d", "", "isDemandOnlyMode", "Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoBaseListener;", "Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lcom/ironsource/ed;", "loadAdConfig", "", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "networkSettings", "g", "e", "Landroid/app/Activity;", "activity", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "f", "description", "width", "height", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", AdFormat.BANNER, "message", "eventId", "data", t2.h.W, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class gd {

    /* renamed from: a, reason: collision with root package name */
    public static final gd f1795a = new gd();

    private gd() {
    }

    private final JSONObject a(String adapterVersion, String sdkVersion) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.to(bd.c, adapterVersion), TuplesKt.to("sdkVersion", sdkVersion)));
    }

    public final int a() {
        return ca.INSTANCE.d().c().j();
    }

    public final ISBannerSize a(String description, int width, int height) {
        return new ISBannerSize(description, width, height);
    }

    public final IronSourceBannerLayout a(Activity activity, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        IronSourceBannerLayout ironSourceBannerLayoutB = p.p().b(activity, size);
        Intrinsics.checkNotNullExpressionValue(ironSourceBannerLayoutB, "getInstance().createBanner(activity, size)");
        return ironSourceBannerLayoutB;
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return p0.a(context, c(context));
    }

    public final String a(NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final String a(Placement placement) {
        String placementName;
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? new String() : placementName;
    }

    public final String a(String key) {
        List listSplit$default;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (StringsKt.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
                String str = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) key, new String[]{"-"}, false, 0, 6, (Object) null));
                if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null)) {
                    return str;
                }
                listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
            } else {
                if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "_", false, 2, (Object) null)) {
                    return key;
                }
                listSplit$default = StringsKt.split$default((CharSequence) key, new String[]{"_"}, false, 0, 6, (Object) null);
            }
            return (String) CollectionsKt.first(listSplit$default);
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }

    public final JSONObject a(boolean isDemandOnlyMode) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(isDemandOnlyMode);
        Intrinsics.checkNotNullExpressionValue(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    public final void a(int eventId, JSONObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        dc.i().a(new l4(eventId, data));
    }

    public final void a(Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    public final void a(IronSource.AD_UNIT adUnit, ed loadAdConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        p.p().a(adUnit, loadAdConfig);
    }

    public final void a(IronSourceBannerLayout banner) {
        IronSource.destroyBanner(banner);
    }

    public final void a(LevelPlayBannerListener listener) {
        k1.a().b(listener);
    }

    public final void a(LevelPlayInterstitialListener listener) {
        v6.a().b(listener);
    }

    public final void a(LevelPlayRewardedVideoBaseListener listener) {
        wb.a().b(listener);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return p0.b(context, c(context));
    }

    public final JSONObject b() {
        JSONObject jSONObjectB = f5.a().b();
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final void b(Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    public final void b(IronSourceBannerLayout banner) {
        IronSource.loadBanner(banner);
    }

    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return p0.g(context);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = c.b().d();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    gd gdVar = f1795a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String strA = gdVar.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strA, gdVar.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(c.b().c());
        concurrentHashMap.putAll(m9.b().c());
        return concurrentHashMap;
    }

    public final boolean e() {
        return IronSource.isInterstitialReady();
    }

    public final boolean f() {
        return IronSource.isRewardedVideoAvailable();
    }

    public final void g() {
        IronSource.loadInterstitial();
    }

    public final void h() {
        IronSource.loadRewardedVideo();
    }

    public final void i() {
        p.p().T();
    }
}
