package com.vungle.ads.internal.model;

import com.json.m4;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ConfigPayload.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/CleverCache;", "", "seen1", "", m4.r, "", "diskSize", "", "diskPercentage", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)V", "getDiskPercentage$annotations", "()V", "getDiskPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiskSize$annotations", "getDiskSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnabled$annotations", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/CleverCache;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class CleverCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer diskPercentage;
    private final Long diskSize;
    private final Boolean enabled;

    public CleverCache() {
        this((Boolean) null, (Long) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cleverCache.enabled;
        }
        if ((i & 2) != 0) {
            l = cleverCache.diskSize;
        }
        if ((i & 4) != 0) {
            num = cleverCache.diskPercentage;
        }
        return cleverCache.copy(bool, l, num);
    }

    @SerialName("disk_percentage")
    public static /* synthetic */ void getDiskPercentage$annotations() {
    }

    @SerialName("disk_size")
    public static /* synthetic */ void getDiskSize$annotations() {
    }

    @SerialName(m4.r)
    public static /* synthetic */ void getEnabled$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getDiskSize() {
        return this.diskSize;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDiskPercentage() {
        return this.diskPercentage;
    }

    public final CleverCache copy(Boolean enabled, Long diskSize, Integer diskPercentage) {
        return new CleverCache(enabled, diskSize, diskPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CleverCache)) {
            return false;
        }
        CleverCache cleverCache = (CleverCache) other;
        return Intrinsics.areEqual(this.enabled, cleverCache.enabled) && Intrinsics.areEqual(this.diskSize, cleverCache.diskSize) && Intrinsics.areEqual(this.diskPercentage, cleverCache.diskPercentage);
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.diskSize;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.diskPercentage;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CleverCache$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CleverCache;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CleverCache> serializer() {
            return CleverCache$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CleverCache(int i, @SerialName(m4.r) Boolean bool, @SerialName("disk_size") Long l, @SerialName("disk_percentage") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, CleverCache$$serializer.INSTANCE.getDescriptor());
        }
        this.enabled = (i & 1) == 0 ? false : bool;
        if ((i & 2) == 0) {
            this.diskSize = 1000L;
        } else {
            this.diskSize = l;
        }
        if ((i & 4) == 0) {
            this.diskPercentage = 3;
        } else {
            this.diskPercentage = num;
        }
    }

    public CleverCache(Boolean bool, Long l, Integer num) {
        this.enabled = bool;
        this.diskSize = l;
        this.diskPercentage = num;
    }

    @JvmStatic
    public static final void write$Self(CleverCache self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Long l;
        Integer num;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual((Object) self.enabled, (Object) false)) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (l = self.diskSize) == null || l.longValue() != 1000) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.diskSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.diskPercentage);
        }
    }

    public /* synthetic */ CleverCache(Boolean bool, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : bool, (i & 2) != 0 ? 1000L : l, (i & 4) != 0 ? 3 : num);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Long getDiskSize() {
        return this.diskSize;
    }

    public final Integer getDiskPercentage() {
        return this.diskPercentage;
    }
}
