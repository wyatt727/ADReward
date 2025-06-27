package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.entity.b;
import com.my.tracker.ads.AdFormat;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.util.FileUtility;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonTransformingSerializer;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: AdPayload.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 o2\u00020\u0001:\tlmnopqrstBo\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0013J\b\u0010<\u001a\u0004\u0018\u00010 J\b\u0010=\u001a\u0004\u0018\u00010\u000bJ\b\u0010>\u001a\u0004\u0018\u00010\bJ\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u0004\u0018\u00010\u000bJ\b\u0010B\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010C\u001a\u00020\u000bJ\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00052\u0006\u0010F\u001a\u00020,J\u0006\u0010G\u001a\u00020\u0003J\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rJ\u0015\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010KJ.\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0006\u0010M\u001a\u00020\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005J\u0006\u0010Q\u001a\u00020\u000fJ\u0006\u0010R\u001a\u00020\u000fJ\u000e\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000bJ\u0006\u0010U\u001a\u00020\u000fJ\u0006\u0010V\u001a\u00020\u000fJ\b\u0010W\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010X\u001a\u00020YJ&\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000bJ\b\u0010_\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010`\u001a\u00020Y2\b\u0010a\u001a\u0004\u0018\u00010EJ\u0012\u0010b\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u000bH\u0002J!\u0010c\u001a\u00020Y2\u0006\u0010d\u001a\u00020\u00002\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hHÇ\u0001J\u001e\u0010i\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010j\u001a\u00020\u000b2\b\u0010k\u001a\u0004\u0018\u00010\u000bH\u0002R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R&\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u001aR*\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010,8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b5\u0010\u001aR0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b;\u0010\u001a¨\u0006u"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload;", "", "seen1", "", b.JSON_KEY_ADS, "", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "config", "Lcom/vungle/ads/internal/model/ConfigExtension;", "mraidFiles", "Ljava/util/concurrent/ConcurrentHashMap;", "", "incentivizedTextSettings", "", "assetsFullyDownloaded", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/vungle/ads/internal/model/ConfigExtension;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigExtension;)V", "ad", "getAd", "()Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig$annotations", "()V", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "setAdConfig", "(Lcom/vungle/ads/AdConfig;)V", "adMarkup", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", t2.h.O, "Lcom/vungle/ads/BannerAdSize;", "getAdSize$annotations", "getAdSize", "()Lcom/vungle/ads/BannerAdSize;", "setAdSize", "(Lcom/vungle/ads/BannerAdSize;)V", "getAds$annotations", "<set-?>", "Ljava/io/File;", "assetDirectory", "getAssetDirectory$annotations", "getAssetDirectory", "()Ljava/io/File;", "getAssetsFullyDownloaded", "()Z", "setAssetsFullyDownloaded", "(Z)V", "getConfig$annotations", "getIncentivizedTextSettings$annotations", "getIncentivizedTextSettings", "()Ljava/util/Map;", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "getMraidFiles$annotations", "adUnit", RemoteConfigConstants.RequestFieldKey.APP_ID, "configExt", "createMRAIDArgs", "Lkotlinx/serialization/json/JsonObject;", "eventId", "getAdType", "getCreativeId", "getDownloadableAssets", "Lcom/vungle/ads/internal/model/AdAsset;", "dir", "getExpiry", "getMRAIDArgsInMap", "getShowCloseDelay", "incentivized", "(Ljava/lang/Boolean;)I", "getTpatUrls", NotificationCompat.CATEGORY_EVENT, "value", "secondValue", "getWinNotifications", "hasExpired", "isClickCoordinatesTrackingEnabled", "isCriticalAsset", "failingUrl", "isNativeTemplateType", "omEnabled", t2.k, "setAssetFullyDownloaded", "", "setIncentivizedText", "title", "body", "keepWatching", "close", "templateType", "updateAdAssetPath", "adAsset", "valueOrEmpty", "write$Self", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "complexReplace", "oldValue", "newValue", "$serializer", "AdUnit", "CacheableReplacement", "Companion", "PlacementAdUnit", "TemplateSettings", "TpatSerializer", "Viewability", "ViewabilityInfo", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final class AdPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_TEMPLATE = "template";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private AdConfig adConfig;
    private BannerAdSize adSize;
    private final List<PlacementAdUnit> ads;
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    private final ConfigExtension config;
    private Map<String, String> incentivizedTextSettings;
    private ConcurrentHashMap<String, String> mraidFiles;

    /* JADX WARN: Multi-variable type inference failed */
    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Transient
    public static /* synthetic */ void getAdConfig$annotations() {
    }

    @Transient
    public static /* synthetic */ void getAdSize$annotations() {
    }

    @SerialName(b.JSON_KEY_ADS)
    private static /* synthetic */ void getAds$annotations() {
    }

    @Transient
    public static /* synthetic */ void getAssetDirectory$annotations() {
    }

    @SerialName("config")
    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    private final String valueOrEmpty(String value) {
        return value == null ? "" : value;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AdPayload(int i, @SerialName(b.JSON_KEY_ADS) List list, @SerialName("config") ConfigExtension configExtension, ConcurrentHashMap concurrentHashMap, Map map, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = configExtension;
        }
        if ((i & 4) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i & 8) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i & 16) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z;
        }
        this.adConfig = null;
        this.adSize = null;
        this.assetDirectory = null;
    }

    public AdPayload(List<PlacementAdUnit> list, ConfigExtension configExtension) {
        this.ads = list;
        this.config = configExtension;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
    }

    @JvmStatic
    public static final void write$Self(AdPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ads != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), self.ads);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.config != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConfigExtension$$serializer.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.mraidFiles, new ConcurrentHashMap())) {
            output.encodeSerializableElement(serialDesc, 2, new ContextualSerializer(Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class), null, new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE}), self.mraidFiles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.incentivizedTextSettings, new HashMap())) {
            output.encodeSerializableElement(serialDesc, 3, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), self.incentivizedTextSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.assetsFullyDownloaded) {
            output.encodeBooleanElement(serialDesc, 4, self.assetsFullyDownloaded);
        }
    }

    public /* synthetic */ AdPayload(List list, ConfigExtension configExtension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : configExtension);
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Companion;", "", "()V", "FILE_SCHEME", "", AdPayload.INCENTIVIZED_BODY_TEXT, AdPayload.INCENTIVIZED_CLOSE_TEXT, AdPayload.INCENTIVIZED_CONTINUE_TEXT, AdPayload.INCENTIVIZED_TITLE_TEXT, "KEY_TEMPLATE", "TPAT_CLICK_COORDINATES_URLS", "UNKNOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdPayload> serializer() {
            return AdPayload$$serializer.INSTANCE;
        }
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null) {
            return null;
        }
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    public final String placementId() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final String appId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    /* renamed from: configExt, reason: from getter */
    public final ConfigExtension getConfig() {
        return this.config;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final void setAssetsFullyDownloaded(boolean z) {
        this.assetsFullyDownloaded = z;
    }

    public final String getAdType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdType();
        }
        return null;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final BannerAdSize getAdSize() {
        return this.adSize;
    }

    public final void setAdSize(BannerAdSize bannerAdSize) {
        this.adSize = bannerAdSize;
    }

    public final File getAssetDirectory() {
        return this.assetDirectory;
    }

    public final boolean omEnabled() {
        Viewability viewability;
        ViewabilityInfo om;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewability = adMarkup.getViewability()) == null || (om = viewability.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (Intrinsics.areEqual(adMarkup != null ? adMarkup.getTemplateURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final List<AdAsset> getDownloadableAssets(File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        boolean z;
        AdUnit adMarkup;
        String templateURL;
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.assetDirectory = dir;
        ArrayList arrayList = new ArrayList();
        if (!isNativeTemplateType() && (adMarkup = getAdMarkup()) != null && (templateURL = adMarkup.getTemplateURL()) != null && FileUtility.INSTANCE.isValidUrl(templateURL)) {
            String filePath = new File(dir, "template").getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
            arrayList.add(new AdAsset("template", templateURL, filePath, AdAsset.FileType.ZIP, true));
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                CacheableReplacement value = entry.getValue();
                if (value.getUrl() != null && FileUtility.INSTANCE.isValidUrl(value.getUrl())) {
                    Boolean required = value.getRequired();
                    boolean zBooleanValue = required != null ? required.booleanValue() : false;
                    if (!isNativeTemplateType() && ConfigManager.INSTANCE.adLoadOptimizationEnabled()) {
                        z = !ConfigManager.INSTANCE.isCacheableAssetsRequired() ? false : zBooleanValue;
                    } else {
                        z = true;
                    }
                    String filePath2 = new File(dir, FileUtility.INSTANCE.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                    String key = entry.getKey();
                    String url = value.getUrl();
                    Intrinsics.checkNotNullExpressionValue(filePath2, "filePath");
                    arrayList.add(new AdAsset(key, url, filePath2, AdAsset.FileType.ASSET, z));
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(((AdAsset) t2).getIsRequired()), Boolean.valueOf(((AdAsset) t).getIsRequired()));
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final List<String> getTpatUrls(String event, String value, String secondValue) {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        Intrinsics.checkNotNullParameter(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup == null || (tpat2 = adMarkup.getTpat()) == null || tpat2.containsKey(event)) ? false : true) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(128, "Invalid tpat key: " + event, placementId(), getCreativeId(), eventId());
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: " + event, placementId(), getCreativeId(), eventId());
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (event.equals(Constants.CHECKPOINT_0)) {
                    List<String> list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), Constants.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), Constants.NETWORK_OPERATOR_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                    }
                    break;
                }
                break;
            case -132489083:
                if (event.equals(Constants.AD_LOAD_DURATION_TPAT_KEY)) {
                    List<String> list4 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(complexReplace((String) it2.next(), Constants.AD_LOAD_DURATION_KEY, value));
                    }
                    break;
                }
                break;
            case 1516630125:
                if (event.equals(Constants.AD_CLOSE_TPAT_KEY)) {
                    List<String> list5 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(complexReplace(complexReplace((String) it3.next(), Constants.AD_DURATION_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                    }
                    break;
                }
                break;
            case 1940309120:
                if (event.equals(Constants.DEEPLINK_CLICK)) {
                    List<String> list6 = list;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(complexReplace((String) it4.next(), Constants.DEEPLINK_SUCCESS_KEY, value));
                    }
                    break;
                }
                break;
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (expiry = adMarkup.getExpiry()) != null) {
            if (((long) expiry.intValue()) < System.currentTimeMillis() / 1000) {
                return true;
            }
        }
        return false;
    }

    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean isNativeTemplateType() {
        AdUnit adMarkup = getAdMarkup();
        return Intrinsics.areEqual(AdFormat.NATIVE, adMarkup != null ? adMarkup.getTemplateType() : null);
    }

    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final void setIncentivizedText(String title, String body, String keepWatching, String close) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(keepWatching, "keepWatching");
        Intrinsics.checkNotNullParameter(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            JsonElementBuildersKt.put(jsonObjectBuilder, entry.getKey(), entry.getValue());
        }
        return jsonObjectBuilder.build();
    }

    public final int getShowCloseDelay(Boolean incentivized) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (Intrinsics.areEqual((Object) incentivized, (Object) true)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final String getCreativeId() {
        String campaign;
        AdUnit adMarkup = getAdMarkup();
        String str = null;
        if (adMarkup != null && (campaign = adMarkup.getCampaign()) != null) {
            String str2 = campaign;
            if (str2.length() > 0) {
                Object[] array = new Regex("\\|").split(str2, 0).toArray(new String[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                if (strArr.length >= 2) {
                    str = strArr[1];
                }
            }
        }
        return str == null ? "unknown" : str;
    }

    public final int getExpiry() {
        Integer expiry;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (expiry = adMarkup.getExpiry()) == null) {
            return 0;
        }
        return expiry.intValue();
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(oldValue)");
        return new Regex(strQuote).replace(str, valueOrEmpty(str3));
    }

    public final synchronized void updateAdAssetPath(AdAsset adAsset) {
        if (adAsset != null) {
            if (!Intrinsics.areEqual("template", adAsset.getAdIdentifier())) {
                File file = new File(adAsset.getLocalPath());
                if (file.exists()) {
                    String adIdentifier = adAsset.getAdIdentifier();
                    this.mraidFiles.put(adIdentifier, FILE_SCHEME + file.getPath());
                }
            }
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "", "seen1", "", "placementReferenceId", "", "adMarkup", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)V", "getAdMarkup$annotations", "()V", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getPlacementReferenceId$annotations", "getPlacementReferenceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class PlacementAdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdUnit adMarkup;
        private final String placementReferenceId;

        /* JADX WARN: Multi-variable type inference failed */
        public PlacementAdUnit() {
            this((String) null, (AdUnit) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            return placementAdUnit.copy(str, adUnit);
        }

        @SerialName("ad_markup")
        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        @SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* renamed from: component2, reason: from getter */
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final PlacementAdUnit copy(String placementReferenceId, AdUnit adMarkup) {
            return new PlacementAdUnit(placementReferenceId, adMarkup);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) other;
            return Intrinsics.areEqual(this.placementReferenceId, placementAdUnit.placementReferenceId) && Intrinsics.areEqual(this.adMarkup, placementAdUnit.adMarkup);
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            return iHashCode + (adUnit != null ? adUnit.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        /* compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PlacementAdUnit> serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ PlacementAdUnit(int i, @SerialName("placement_reference_id") String str, @SerialName("ad_markup") AdUnit adUnit, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$PlacementAdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
        }

        public PlacementAdUnit(String str, AdUnit adUnit) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
        }

        @JvmStatic
        public static final void write$Self(PlacementAdUnit self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placementReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.placementReferenceId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adMarkup != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AdPayload$AdUnit$$serializer.INSTANCE, self.adMarkup);
            }
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adUnit);
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 |2\u00020\u0001:\u0002{|BË\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u001c\b\u0001\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010&BÛ\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010'J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010U\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010^\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00107Jä\u0002\u0010n\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u000e2\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0003HÖ\u0001J\t\u0010s\u001a\u00020\u0005HÖ\u0001J!\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u00002\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zHÇ\u0001R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010+\u001a\u0004\b,\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010+\u001a\u0004\b0\u0010)R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010+\u001a\u0004\b2\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00108\u0012\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R \u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010=\u0012\u0004\b:\u0010+\u001a\u0004\b;\u0010<R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010=\u001a\u0004\b>\u0010<R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010+\u001a\u0004\bB\u0010CR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010=\u001a\u0004\bE\u0010<R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010=\u001a\u0004\bF\u0010<R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010=\u001a\u0004\bG\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010+\u001a\u0004\bL\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010)R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010=\u001a\u0004\bN\u0010<R0\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010+\u001a\u0004\bP\u0010QR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006}"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "", "seen1", "", "id", "", "adType", "adSource", FirebaseAnalytics.Param.CAMPAIGN, "expiry", "advAppId", "callToActionUrl", "deeplinkUrl", "clickCoordinatesEnabled", "", "tpat", "", "", "templateURL", "templateId", "templateType", "templateSettings", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "bidToken", "adMarketId", "info", "sleep", "viewability", "Lcom/vungle/ads/internal/model/AdPayload$Viewability;", "adExt", "notification", "loadAdUrls", "timestamp", "showCloseIncentivized", "showClose", IronSourceConstants.EVENTS_ERROR_CODE, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$Viewability;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$Viewability;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAdExt", "()Ljava/lang/String;", "getAdMarketId$annotations", "()V", "getAdMarketId", "getAdSource", "getAdType", "getAdvAppId$annotations", "getAdvAppId", "getBidToken$annotations", "getBidToken", "getCallToActionUrl", "getCampaign", "getClickCoordinatesEnabled$annotations", "getClickCoordinatesEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeeplinkUrl", "getErrorCode$annotations", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiry", "getId", "getInfo", "getLoadAdUrls$annotations", "getLoadAdUrls", "()Ljava/util/List;", "getNotification", "getShowClose", "getShowCloseIncentivized", "getSleep", "getTemplateId", "getTemplateSettings", "()Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateType$annotations", "getTemplateType", "getTemplateURL", "getTimestamp", "getTpat$annotations", "getTpat", "()Ljava/util/Map;", "getViewability", "()Lcom/vungle/ads/internal/model/AdPayload$Viewability;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$Viewability;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class AdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adExt;
        private final String adMarketId;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final String bidToken;
        private final String callToActionUrl;
        private final String campaign;
        private final Boolean clickCoordinatesEnabled;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;
        private final String id;
        private final String info;
        private final List<String> loadAdUrls;
        private final List<String> notification;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final String templateId;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final String templateURL;
        private final Integer timestamp;
        private final Map<String, List<String>> tpat;
        private final Viewability viewability;

        public AdUnit() {
            this((String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Map) null, (String) null, (String) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (String) null, (Integer) null, (Viewability) null, (String) null, (List) null, (List) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 67108863, (DefaultConstructorMarker) null);
        }

        @SerialName("ad_market_id")
        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        @SerialName("app_id")
        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        @SerialName("bid_token")
        public static /* synthetic */ void getBidToken$annotations() {
        }

        @SerialName("click_coordinates_enabled")
        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        @SerialName(AndroidBridgeConstants.ERROR_CODE)
        public static /* synthetic */ void getErrorCode$annotations() {
        }

        @SerialName("load_ad")
        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        @SerialName("template_type")
        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @Serializable(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Map<String, List<String>> component10() {
            return this.tpat;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTemplateURL() {
            return this.templateURL;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        /* renamed from: component14, reason: from getter */
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        /* renamed from: component15, reason: from getter */
        public final String getBidToken() {
            return this.bidToken;
        }

        /* renamed from: component16, reason: from getter */
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        /* renamed from: component17, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* renamed from: component18, reason: from getter */
        public final Integer getSleep() {
            return this.sleep;
        }

        /* renamed from: component19, reason: from getter */
        public final Viewability getViewability() {
            return this.viewability;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAdType() {
            return this.adType;
        }

        /* renamed from: component20, reason: from getter */
        public final String getAdExt() {
            return this.adExt;
        }

        public final List<String> component21() {
            return this.notification;
        }

        public final List<String> component22() {
            return this.loadAdUrls;
        }

        /* renamed from: component23, reason: from getter */
        public final Integer getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component24, reason: from getter */
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        /* renamed from: component25, reason: from getter */
        public final Integer getShowClose() {
            return this.showClose;
        }

        /* renamed from: component26, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAdSource() {
            return this.adSource;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCampaign() {
            return this.campaign;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getExpiry() {
            return this.expiry;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCallToActionUrl() {
            return this.callToActionUrl;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        /* renamed from: component9, reason: from getter */
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final AdUnit copy(String id, String adType, String adSource, String campaign, Integer expiry, String advAppId, String callToActionUrl, String deeplinkUrl, Boolean clickCoordinatesEnabled, Map<String, ? extends List<String>> tpat, String templateURL, String templateId, String templateType, TemplateSettings templateSettings, String bidToken, String adMarketId, String info, Integer sleep, Viewability viewability, String adExt, List<String> notification, List<String> loadAdUrls, Integer timestamp, Integer showCloseIncentivized, Integer showClose, Integer errorCode) {
            return new AdUnit(id, adType, adSource, campaign, expiry, advAppId, callToActionUrl, deeplinkUrl, clickCoordinatesEnabled, tpat, templateURL, templateId, templateType, templateSettings, bidToken, adMarketId, info, sleep, viewability, adExt, notification, loadAdUrls, timestamp, showCloseIncentivized, showClose, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) other;
            return Intrinsics.areEqual(this.id, adUnit.id) && Intrinsics.areEqual(this.adType, adUnit.adType) && Intrinsics.areEqual(this.adSource, adUnit.adSource) && Intrinsics.areEqual(this.campaign, adUnit.campaign) && Intrinsics.areEqual(this.expiry, adUnit.expiry) && Intrinsics.areEqual(this.advAppId, adUnit.advAppId) && Intrinsics.areEqual(this.callToActionUrl, adUnit.callToActionUrl) && Intrinsics.areEqual(this.deeplinkUrl, adUnit.deeplinkUrl) && Intrinsics.areEqual(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && Intrinsics.areEqual(this.tpat, adUnit.tpat) && Intrinsics.areEqual(this.templateURL, adUnit.templateURL) && Intrinsics.areEqual(this.templateId, adUnit.templateId) && Intrinsics.areEqual(this.templateType, adUnit.templateType) && Intrinsics.areEqual(this.templateSettings, adUnit.templateSettings) && Intrinsics.areEqual(this.bidToken, adUnit.bidToken) && Intrinsics.areEqual(this.adMarketId, adUnit.adMarketId) && Intrinsics.areEqual(this.info, adUnit.info) && Intrinsics.areEqual(this.sleep, adUnit.sleep) && Intrinsics.areEqual(this.viewability, adUnit.viewability) && Intrinsics.areEqual(this.adExt, adUnit.adExt) && Intrinsics.areEqual(this.notification, adUnit.notification) && Intrinsics.areEqual(this.loadAdUrls, adUnit.loadAdUrls) && Intrinsics.areEqual(this.timestamp, adUnit.timestamp) && Intrinsics.areEqual(this.showCloseIncentivized, adUnit.showCloseIncentivized) && Intrinsics.areEqual(this.showClose, adUnit.showClose) && Intrinsics.areEqual(this.errorCode, adUnit.errorCode);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.campaign;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.advAppId;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.callToActionUrl;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.deeplinkUrl;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
            String str8 = this.templateURL;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.templateId;
            int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode14 = (iHashCode13 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.bidToken;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.adMarketId;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.info;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Integer num2 = this.sleep;
            int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Viewability viewability = this.viewability;
            int iHashCode19 = (iHashCode18 + (viewability == null ? 0 : viewability.hashCode())) * 31;
            String str14 = this.adExt;
            int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode22 = (iHashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num3 = this.timestamp;
            int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.showCloseIncentivized;
            int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.errorCode;
            return iHashCode25 + (num6 != null ? num6.hashCode() : 0);
        }

        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", campaign=" + this.campaign + ", expiry=" + this.expiry + ", advAppId=" + this.advAppId + ", callToActionUrl=" + this.callToActionUrl + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", tpat=" + this.tpat + ", templateURL=" + this.templateURL + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", bidToken=" + this.bidToken + ", adMarketId=" + this.adMarketId + ", info=" + this.info + ", sleep=" + this.sleep + ", viewability=" + this.viewability + ", adExt=" + this.adExt + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", timestamp=" + this.timestamp + ", showCloseIncentivized=" + this.showCloseIncentivized + ", showClose=" + this.showClose + ", errorCode=" + this.errorCode + ')';
        }

        /* compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AdUnit> serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, TemplateSettings templateSettings, String str11, String str12, String str13, Integer num2, Viewability viewability, String str14, List<String> list, List<String> list2, Integer num3, Integer num4, Integer num5, Integer num6) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.campaign = str4;
            this.expiry = num;
            this.advAppId = str5;
            this.callToActionUrl = str6;
            this.deeplinkUrl = str7;
            this.clickCoordinatesEnabled = bool;
            this.tpat = map;
            this.templateURL = str8;
            this.templateId = str9;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.bidToken = str11;
            this.adMarketId = str12;
            this.info = str13;
            this.sleep = num2;
            this.viewability = viewability;
            this.adExt = str14;
            this.notification = list;
            this.loadAdUrls = list2;
            this.timestamp = num3;
            this.showCloseIncentivized = num4;
            this.showClose = num5;
            this.errorCode = num6;
        }

        @JvmStatic
        public static final void write$Self(AdUnit self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adType != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.adType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adSource != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.adSource);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.campaign != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.campaign);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.expiry != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.expiry);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.advAppId != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.advAppId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.callToActionUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.callToActionUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.deeplinkUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.deeplinkUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.clickCoordinatesEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.clickCoordinatesEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.tpat != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, TpatSerializer.INSTANCE, self.tpat);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.templateURL != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.templateURL);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || self.templateId != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.templateId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.templateType != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.templateType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.templateSettings != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, AdPayload$TemplateSettings$$serializer.INSTANCE, self.templateSettings);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 14) || self.bidToken != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.bidToken);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.adMarketId != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.adMarketId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.info != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.info);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 17) || self.sleep != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, IntSerializer.INSTANCE, self.sleep);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 18) || self.viewability != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, AdPayload$Viewability$$serializer.INSTANCE, self.viewability);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 19) || self.adExt != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.adExt);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 20) || self.notification != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, new ArrayListSerializer(StringSerializer.INSTANCE), self.notification);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 21) || self.loadAdUrls != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, new ArrayListSerializer(StringSerializer.INSTANCE), self.loadAdUrls);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 22) || self.timestamp != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, IntSerializer.INSTANCE, self.timestamp);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 23) || (num = self.showCloseIncentivized) == null || num.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 23, IntSerializer.INSTANCE, self.showCloseIncentivized);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 24) || (num2 = self.showClose) == null || num2.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 24, IntSerializer.INSTANCE, self.showClose);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 25) || self.errorCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, IntSerializer.INSTANCE, self.errorCode);
            }
        }

        public final String getId() {
            return this.id;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getCampaign() {
            return this.campaign;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final String getCallToActionUrl() {
            return this.callToActionUrl;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final String getTemplateURL() {
            return this.templateURL;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getBidToken() {
            return this.bidToken;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final String getInfo() {
            return this.info;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final Viewability getViewability() {
            return this.viewability;
        }

        public final String getAdExt() {
            return this.adExt;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final Integer getTimestamp() {
            return this.timestamp;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ AdUnit(int i, String str, String str2, String str3, String str4, Integer num, @SerialName("app_id") String str5, String str6, String str7, @SerialName("click_coordinates_enabled") Boolean bool, @Serializable(with = TpatSerializer.class) Map map, String str8, String str9, @SerialName("template_type") String str10, TemplateSettings templateSettings, @SerialName("bid_token") String str11, @SerialName("ad_market_id") String str12, String str13, Integer num2, Viewability viewability, String str14, List list, @SerialName("load_ad") List list2, Integer num3, Integer num4, Integer num5, @SerialName(AndroidBridgeConstants.ERROR_CODE) Integer num6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$AdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i & 8) == 0) {
                this.campaign = null;
            } else {
                this.campaign = str4;
            }
            if ((i & 16) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i & 32) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str5;
            }
            if ((i & 64) == 0) {
                this.callToActionUrl = null;
            } else {
                this.callToActionUrl = str6;
            }
            if ((i & 128) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str7;
            }
            if ((i & 256) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i & 512) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i & 1024) == 0) {
                this.templateURL = null;
            } else {
                this.templateURL = str8;
            }
            if ((i & 2048) == 0) {
                this.templateId = null;
            } else {
                this.templateId = str9;
            }
            if ((i & 4096) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((i & 8192) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((i & 16384) == 0) {
                this.bidToken = null;
            } else {
                this.bidToken = str11;
            }
            if ((32768 & i) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str12;
            }
            if ((65536 & i) == 0) {
                this.info = null;
            } else {
                this.info = str13;
            }
            if ((131072 & i) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num2;
            }
            if ((262144 & i) == 0) {
                this.viewability = null;
            } else {
                this.viewability = viewability;
            }
            if ((524288 & i) == 0) {
                this.adExt = null;
            } else {
                this.adExt = str14;
            }
            if ((1048576 & i) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((2097152 & i) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((4194304 & i) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = num3;
            }
            if ((8388608 & i) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num4;
            }
            if ((16777216 & i) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((i & 33554432) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num6;
            }
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map map, String str8, String str9, String str10, TemplateSettings templateSettings, String str11, String str12, String str13, Integer num2, Viewability viewability, String str14, List list, List list2, Integer num3, Integer num4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : templateSettings, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : num2, (i & 262144) != 0 ? null : viewability, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? null : list, (i & 2097152) != 0 ? null : list2, (i & 4194304) != 0 ? null : num3, (i & 8388608) != 0 ? 0 : num4, (i & 16777216) != 0 ? 0 : num5, (i & 33554432) != 0 ? null : num6);
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TpatSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "", "", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TpatSerializer extends JsonTransformingSerializer<Map<String, ? extends List<? extends String>>> {
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        private TpatSerializer() {
            super(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE))));
        }

        @Override // kotlinx.serialization.json.JsonTransformingSerializer
        protected JsonElement transformDeserialize(JsonElement element) {
            Intrinsics.checkNotNullParameter(element, "element");
            JsonObject jsonObject = JsonElementKt.getJsonObject(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new JsonObject(linkedHashMap);
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB5\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "", "seen1", "", "normalReplacements", "", "", "cacheableReplacements", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Map;Ljava/util/Map;)V", "getCacheableReplacements$annotations", "()V", "getCacheableReplacements", "()Ljava/util/Map;", "getNormalReplacements$annotations", "getNormalReplacements", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class TemplateSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        @SerialName("cacheable_replacements")
        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        @SerialName("normal_replacements")
        public static /* synthetic */ void getNormalReplacements$annotations() {
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> normalReplacements, Map<String, CacheableReplacement> cacheableReplacements) {
            return new TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) other;
            return Intrinsics.areEqual(this.normalReplacements, templateSettings.normalReplacements) && Intrinsics.areEqual(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        /* compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TemplateSettings> serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ TemplateSettings(int i, @SerialName("normal_replacements") Map map, @SerialName("cacheable_replacements") Map map2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$TemplateSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        @JvmStatic
        public static final void write$Self(TemplateSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.normalReplacements != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), self.normalReplacements);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cacheableReplacements != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdPayload$CacheableReplacement$$serializer.INSTANCE), self.cacheableReplacements);
            }
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "", "seen1", "", "url", "", "extension", "required", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getExtension", "()Ljava/lang/String;", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUrl", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class CacheableReplacement {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String extension;
        private final Boolean required;
        private final String url;

        public CacheableReplacement() {
            this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i & 4) != 0) {
                bool = cacheableReplacement.required;
            }
            return cacheableReplacement.copy(str, str2, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        public final CacheableReplacement copy(String url, String extension, Boolean required) {
            return new CacheableReplacement(url, extension, required);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) other;
            return Intrinsics.areEqual(this.url, cacheableReplacement.url) && Intrinsics.areEqual(this.extension, cacheableReplacement.extension) && Intrinsics.areEqual(this.required, cacheableReplacement.required);
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.required;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", required=" + this.required + ')';
        }

        /* compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CacheableReplacement> serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ CacheableReplacement(int i, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$CacheableReplacement$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i & 4) == 0) {
                this.required = null;
            } else {
                this.required = bool;
            }
        }

        public CacheableReplacement(String str, String str2, Boolean bool) {
            this.url = str;
            this.extension = str2;
            this.required = bool;
        }

        @JvmStatic
        public static final void write$Self(CacheableReplacement self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.url != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.url);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extension != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extension);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.required != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.required);
            }
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
        }

        public final String getExtension() {
            return this.extension;
        }

        public final Boolean getRequired() {
            return this.required;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Viewability;", "", "seen1", "", "om", "Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;)V", "getOm", "()Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class Viewability {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewabilityInfo om;

        /* JADX WARN: Multi-variable type inference failed */
        public Viewability() {
            this((ViewabilityInfo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Viewability copy$default(Viewability viewability, ViewabilityInfo viewabilityInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                viewabilityInfo = viewability.om;
            }
            return viewability.copy(viewabilityInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ViewabilityInfo getOm() {
            return this.om;
        }

        public final Viewability copy(ViewabilityInfo om) {
            return new Viewability(om);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Viewability) && Intrinsics.areEqual(this.om, ((Viewability) other).om);
        }

        public int hashCode() {
            ViewabilityInfo viewabilityInfo = this.om;
            if (viewabilityInfo == null) {
                return 0;
            }
            return viewabilityInfo.hashCode();
        }

        public String toString() {
            return "Viewability(om=" + this.om + ')';
        }

        /* compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Viewability$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$Viewability;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Viewability> serializer() {
                return AdPayload$Viewability$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Viewability(int i, ViewabilityInfo viewabilityInfo, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$Viewability$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewabilityInfo;
            }
        }

        public Viewability(ViewabilityInfo viewabilityInfo) {
            this.om = viewabilityInfo;
        }

        @JvmStatic
        public static final void write$Self(Viewability self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            boolean z = true;
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.om == null) {
                z = false;
            }
            if (z) {
                output.encodeNullableSerializableElement(serialDesc, 0, AdPayload$ViewabilityInfo$$serializer.INSTANCE, self.om);
            }
        }

        public /* synthetic */ Viewability(ViewabilityInfo viewabilityInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewabilityInfo);
        }

        public final ViewabilityInfo getOm() {
            return this.om;
        }
    }

    /* compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0004\u0010\u0011¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;", "", "seen1", "", "isEnabled", "", "extraVast", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getExtraVast$annotations", "()V", "getExtraVast", "()Ljava/lang/String;", "isEnabled$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class ViewabilityInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewabilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewabilityInfo copy$default(ViewabilityInfo viewabilityInfo, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = viewabilityInfo.isEnabled;
            }
            if ((i & 2) != 0) {
                str = viewabilityInfo.extraVast;
            }
            return viewabilityInfo.copy(bool, str);
        }

        @SerialName("extra_vast")
        public static /* synthetic */ void getExtraVast$annotations() {
        }

        @SerialName("is_enabled")
        public static /* synthetic */ void isEnabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExtraVast() {
            return this.extraVast;
        }

        public final ViewabilityInfo copy(Boolean isEnabled, String extraVast) {
            return new ViewabilityInfo(isEnabled, extraVast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewabilityInfo)) {
                return false;
            }
            ViewabilityInfo viewabilityInfo = (ViewabilityInfo) other;
            return Intrinsics.areEqual(this.isEnabled, viewabilityInfo.isEnabled) && Intrinsics.areEqual(this.extraVast, viewabilityInfo.extraVast);
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ViewabilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        /* compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewabilityInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ViewabilityInfo> serializer() {
                return AdPayload$ViewabilityInfo$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ ViewabilityInfo(int i, @SerialName("is_enabled") Boolean bool, @SerialName("extra_vast") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, AdPayload$ViewabilityInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewabilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        @JvmStatic
        public static final void write$Self(ViewabilityInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extraVast != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extraVast);
            }
        }

        public /* synthetic */ ViewabilityInfo(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public final String getExtraVast() {
            return this.extraVast;
        }
    }
}
