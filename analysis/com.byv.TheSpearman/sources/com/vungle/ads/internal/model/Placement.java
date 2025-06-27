package com.vungle.ads.internal.model;

import com.json.t2;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ConfigPayload.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002RSB\u0093\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\u0006\u0010A\u001a\u00020\bJ\u0006\u0010B\u001a\u00020\bJ\u0006\u0010C\u001a\u00020\bJ\u0006\u0010D\u001a\u00020\bJ\u0006\u0010E\u001a\u00020\bJ\u0006\u0010F\u001a\u00020\bJ\u0006\u0010G\u001a\u00020\bJ\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020-J\t\u0010K\u001a\u00020\u0005HÖ\u0001J!\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001bR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010$\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u001bR\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010)R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010)R(\u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u00103\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006T"}, d2 = {"Lcom/vungle/ads/internal/model/Placement;", "", "seen1", "", "identifier", "", "referenceId", "incentivized", "", "supportedTemplateTypes", "", "supportedAdFormats", "adRefreshDuration", "headerBidding", t2.h.O, "isIncentivized", "placementAdType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;IZLjava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;IZLjava/lang/String;)V", "getAdRefreshDuration$annotations", "()V", "getAdRefreshDuration", "()I", "getAdSize$annotations", "getAdSize", "()Ljava/lang/String;", "getHeaderBidding$annotations", "getHeaderBidding", "()Z", "getIdentifier$annotations", "getIdentifier", "getIncentivized$annotations", "getIncentivized", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReferenceId$annotations", "getReferenceId", "getSupportedAdFormats$annotations", "getSupportedAdFormats", "()Ljava/util/List;", "getSupportedTemplateTypes$annotations", "getSupportedTemplateTypes", "wakeupTime", "", "getWakeupTime$annotations", "getWakeupTime", "()Ljava/lang/Long;", "setWakeupTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;IZLjava/lang/String;)Lcom/vungle/ads/internal/model/Placement;", "equals", "other", "hashCode", t2.w, "isBannerNonMREC", "isDefault", "isInterstitial", "isMREC", "isNative", "isRewardedVideo", "snooze", "", "sleepTime", "toString", "write$Self", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class Placement {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int adRefreshDuration;
    private final String adSize;
    private final boolean headerBidding;
    private final String identifier;
    private final Boolean incentivized;
    private final boolean isIncentivized;
    private final String placementAdType;
    private final String referenceId;
    private final List<String> supportedAdFormats;
    private final List<String> supportedTemplateTypes;
    private Long wakeupTime;

    @SerialName("ad_refresh_duration")
    public static /* synthetic */ void getAdRefreshDuration$annotations() {
    }

    @SerialName("ad_size")
    public static /* synthetic */ void getAdSize$annotations() {
    }

    @SerialName("header_bidding")
    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @SerialName("is_incentivized")
    public static /* synthetic */ void getIncentivized$annotations() {
    }

    @SerialName("reference_id")
    public static /* synthetic */ void getReferenceId$annotations() {
    }

    @SerialName("supported_ad_formats")
    public static /* synthetic */ void getSupportedAdFormats$annotations() {
    }

    @SerialName("supported_template_types")
    public static /* synthetic */ void getSupportedTemplateTypes$annotations() {
    }

    @Transient
    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIncentivized() {
        return this.incentivized;
    }

    public final List<String> component4() {
        return this.supportedTemplateTypes;
    }

    public final List<String> component5() {
        return this.supportedAdFormats;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAdRefreshDuration() {
        return this.adRefreshDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAdSize() {
        return this.adSize;
    }

    public final Placement copy(String identifier, String referenceId, Boolean incentivized, List<String> supportedTemplateTypes, List<String> supportedAdFormats, int adRefreshDuration, boolean headerBidding, String adSize) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(supportedTemplateTypes, "supportedTemplateTypes");
        Intrinsics.checkNotNullParameter(supportedAdFormats, "supportedAdFormats");
        return new Placement(identifier, referenceId, incentivized, supportedTemplateTypes, supportedAdFormats, adRefreshDuration, headerBidding, adSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return Intrinsics.areEqual(this.identifier, placement.identifier) && Intrinsics.areEqual(this.referenceId, placement.referenceId) && Intrinsics.areEqual(this.incentivized, placement.incentivized) && Intrinsics.areEqual(this.supportedTemplateTypes, placement.supportedTemplateTypes) && Intrinsics.areEqual(this.supportedAdFormats, placement.supportedAdFormats) && this.adRefreshDuration == placement.adRefreshDuration && this.headerBidding == placement.headerBidding && Intrinsics.areEqual(this.adSize, placement.adSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + this.referenceId.hashCode()) * 31;
        Boolean bool = this.incentivized;
        int iHashCode2 = (((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.supportedTemplateTypes.hashCode()) * 31) + this.supportedAdFormats.hashCode()) * 31) + this.adRefreshDuration) * 31;
        boolean z = this.headerBidding;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        String str = this.adSize;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Placement(identifier=" + this.identifier + ", referenceId=" + this.referenceId + ", incentivized=" + this.incentivized + ", supportedTemplateTypes=" + this.supportedTemplateTypes + ", supportedAdFormats=" + this.supportedAdFormats + ", adRefreshDuration=" + this.adRefreshDuration + ", headerBidding=" + this.headerBidding + ", adSize=" + this.adSize + ')';
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/Placement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/Placement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Placement> serializer() {
            return Placement$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Placement(int i, @SerialName("id") String str, @SerialName("reference_id") String str2, @SerialName("is_incentivized") Boolean bool, @SerialName("supported_template_types") List list, @SerialName("supported_ad_formats") List list2, @SerialName("ad_refresh_duration") int i2, @SerialName("header_bidding") boolean z, @SerialName("ad_size") String str3, boolean z2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.referenceId = str2;
        if ((i & 4) == 0) {
            this.incentivized = false;
        } else {
            this.incentivized = bool;
        }
        if ((i & 8) == 0) {
            this.supportedTemplateTypes = CollectionsKt.emptyList();
        } else {
            this.supportedTemplateTypes = list;
        }
        if ((i & 16) == 0) {
            this.supportedAdFormats = CollectionsKt.emptyList();
        } else {
            this.supportedAdFormats = list2;
        }
        if ((i & 32) == 0) {
            this.adRefreshDuration = Integer.MIN_VALUE;
        } else {
            this.adRefreshDuration = i2;
        }
        if ((i & 64) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z;
        }
        if ((i & 128) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str3;
        }
        if ((i & 256) == 0) {
            Boolean bool2 = this.incentivized;
            this.isIncentivized = bool2 != null ? bool2.booleanValue() : false;
        } else {
            this.isIncentivized = z2;
        }
        this.wakeupTime = null;
        if ((i & 512) != 0) {
            this.placementAdType = str4;
        } else {
            List<String> list3 = this.supportedTemplateTypes;
            this.placementAdType = list3.contains(AdFormat.BANNER) ? "TYPE_BANNER" : list3.contains("mrec") ? "TYPE_MREC" : list3.contains(AdFormat.NATIVE) ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
    }

    public Placement(String identifier, String referenceId, Boolean bool, List<String> supportedTemplateTypes, List<String> supportedAdFormats, int i, boolean z, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(supportedTemplateTypes, "supportedTemplateTypes");
        Intrinsics.checkNotNullParameter(supportedAdFormats, "supportedAdFormats");
        this.identifier = identifier;
        this.referenceId = referenceId;
        this.incentivized = bool;
        this.supportedTemplateTypes = supportedTemplateTypes;
        this.supportedAdFormats = supportedAdFormats;
        this.adRefreshDuration = i;
        this.headerBidding = z;
        this.adSize = str;
        this.isIncentivized = bool != null ? bool.booleanValue() : false;
        if (supportedTemplateTypes.contains(AdFormat.BANNER)) {
            str2 = "TYPE_BANNER";
        } else if (supportedTemplateTypes.contains("mrec")) {
            str2 = "TYPE_MREC";
        } else {
            str2 = supportedTemplateTypes.contains(AdFormat.NATIVE) ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
        this.placementAdType = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.vungle.ads.internal.model.Placement r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.Placement.write$Self(com.vungle.ads.internal.model.Placement, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public /* synthetic */ Placement(String str, String str2, Boolean bool, List list, List list2, int i, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : bool, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? Integer.MIN_VALUE : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : str3);
    }

    public final Boolean getIncentivized() {
        return this.incentivized;
    }

    public final List<String> getSupportedTemplateTypes() {
        return this.supportedTemplateTypes;
    }

    public final List<String> getSupportedAdFormats() {
        return this.supportedAdFormats;
    }

    public final int getAdRefreshDuration() {
        return this.adRefreshDuration;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getAdSize() {
        return this.adSize;
    }

    /* renamed from: isIncentivized, reason: from getter */
    public final boolean getIsIncentivized() {
        return this.isIncentivized;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    public final void setWakeupTime(Long l) {
        this.wakeupTime = l;
    }

    public final boolean isNative() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_NATIVE");
    }

    public final boolean isBanner() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_BANNER") || isMREC();
    }

    public final boolean isBannerNonMREC() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_BANNER");
    }

    public final boolean isMREC() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_MREC");
    }

    public final boolean isDefault() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_DEFAULT");
    }

    public final boolean isInterstitial() {
        return isDefault() && !this.isIncentivized;
    }

    public final boolean isRewardedVideo() {
        return isDefault() && this.isIncentivized;
    }

    public final void snooze(long sleepTime) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (sleepTime * 1000));
    }
}
