package com.vungle.ads.internal.model;

import android.util.Base64;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.Transient;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: BidPayload.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J8\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\"\u001a\u0004\u0018\u00010\nJ\b\u0010#\u001a\u0004\u0018\u00010\u0006J\b\u0010$\u001a\u0004\u0018\u00010\u0006J\b\u0010%\u001a\u0004\u0018\u00010\u0006J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0002J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u00064"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload;", "", "seen1", "", "version", "adunit", "", "impression", "", "ad", "Lcom/vungle/ads/internal/model/AdPayload;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getAdunit", "()Ljava/lang/String;", "getImpression", "()Ljava/util/List;", "json", "Lkotlinx/serialization/json/Json;", "getJson$annotations", "()V", MobileAdsBridge.versionMethodName, "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/vungle/ads/internal/model/BidPayload;", "equals", "", "other", "getAdPayload", "getDecodedAdsResponse", "getEventId", "getPlacementId", "gzipDecode", "compressed", "", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class BidPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdPayload ad;
    private final String adunit;
    private final List<String> impression;
    private final Json json;
    private final Integer version;

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    @Transient
    private static /* synthetic */ void getJson$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdunit() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final BidPayload copy(Integer version, String adunit, List<String> impression) {
        return new BidPayload(version, adunit, impression);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) other;
        return Intrinsics.areEqual(this.version, bidPayload.version) && Intrinsics.areEqual(this.adunit, bidPayload.adunit) && Intrinsics.areEqual(this.impression, bidPayload.impression);
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    /* compiled from: BidPayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/BidPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BidPayload> serializer() {
            return BidPayload$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BidPayload(int i, Integer num, String str, List list, AdPayload adPayload, SerializationConstructorMarker serializationConstructorMarker) {
        String decodedAdsResponse;
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, BidPayload$$serializer.INSTANCE.getDescriptor());
        }
        AdPayload adPayload2 = null;
        if ((i & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        Json jsonJson$default = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.model.BidPayload.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonBuilder Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        this.json = jsonJson$default;
        if ((i & 8) != 0) {
            this.ad = adPayload;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            Json json = jsonJson$default;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(AdPayload.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload2 = (AdPayload) json.decodeFromString(kSerializerSerializer, decodedAdsResponse);
        }
        this.ad = adPayload2;
    }

    public BidPayload(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        AdPayload adPayload = null;
        Json jsonJson$default = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.model.BidPayload$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonBuilder Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        this.json = jsonJson$default;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            Json json = jsonJson$default;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(AdPayload.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload = (AdPayload) json.decodeFromString(kSerializerSerializer, decodedAdsResponse);
        }
        this.ad = adPayload;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.vungle.ads.internal.model.BidPayload r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            boolean r1 = r9.shouldEncodeElementDefault(r10, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L1f
        L19:
            java.lang.Integer r1 = r8.version
            if (r1 == 0) goto L1e
            goto L17
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2a
            kotlinx.serialization.internal.IntSerializer r1 = kotlinx.serialization.internal.IntSerializer.INSTANCE
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            java.lang.Integer r3 = r8.version
            r9.encodeNullableSerializableElement(r10, r0, r1, r3)
        L2a:
            boolean r1 = r9.shouldEncodeElementDefault(r10, r2)
            if (r1 == 0) goto L32
        L30:
            r1 = r2
            goto L38
        L32:
            java.lang.String r1 = r8.adunit
            if (r1 == 0) goto L37
            goto L30
        L37:
            r1 = r0
        L38:
            if (r1 == 0) goto L43
            kotlinx.serialization.internal.StringSerializer r1 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            kotlinx.serialization.SerializationStrategy r1 = (kotlinx.serialization.SerializationStrategy) r1
            java.lang.String r3 = r8.adunit
            r9.encodeNullableSerializableElement(r10, r2, r1, r3)
        L43:
            r1 = 2
            boolean r3 = r9.shouldEncodeElementDefault(r10, r1)
            if (r3 == 0) goto L4c
        L4a:
            r3 = r2
            goto L52
        L4c:
            java.util.List<java.lang.String> r3 = r8.impression
            if (r3 == 0) goto L51
            goto L4a
        L51:
            r3 = r0
        L52:
            if (r3 == 0) goto L64
            kotlinx.serialization.internal.ArrayListSerializer r3 = new kotlinx.serialization.internal.ArrayListSerializer
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            kotlinx.serialization.KSerializer r4 = (kotlinx.serialization.KSerializer) r4
            r3.<init>(r4)
            kotlinx.serialization.SerializationStrategy r3 = (kotlinx.serialization.SerializationStrategy) r3
            java.util.List<java.lang.String> r4 = r8.impression
            r9.encodeNullableSerializableElement(r10, r1, r3, r4)
        L64:
            r1 = 3
            boolean r3 = r9.shouldEncodeElementDefault(r10, r1)
            if (r3 == 0) goto L6d
        L6b:
            r0 = r2
            goto La1
        L6d:
            com.vungle.ads.internal.model.AdPayload r3 = r8.ad
            java.lang.String r4 = r8.adunit
            r5 = 0
            if (r4 == 0) goto L9a
            java.lang.String r4 = r8.getDecodedAdsResponse()
            if (r4 == 0) goto L9a
            kotlinx.serialization.json.Json r5 = r8.json
            kotlinx.serialization.StringFormat r5 = (kotlinx.serialization.StringFormat) r5
            kotlinx.serialization.modules.SerializersModule r6 = r5.getSerializersModule()
            java.lang.Class<com.vungle.ads.internal.model.AdPayload> r7 = com.vungle.ads.internal.model.AdPayload.class
            kotlin.reflect.KType r7 = kotlin.jvm.internal.Reflection.typeOf(r7)
            kotlinx.serialization.KSerializer r6 = kotlinx.serialization.SerializersKt.serializer(r6, r7)
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r4 = r5.decodeFromString(r6, r4)
            com.vungle.ads.internal.model.AdPayload r4 = (com.vungle.ads.internal.model.AdPayload) r4
            r5 = r4
        L9a:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 != 0) goto La1
            goto L6b
        La1:
            if (r0 == 0) goto Lac
            com.vungle.ads.internal.model.AdPayload$$serializer r0 = com.vungle.ads.internal.model.AdPayload$$serializer.INSTANCE
            kotlinx.serialization.SerializationStrategy r0 = (kotlinx.serialization.SerializationStrategy) r0
            com.vungle.ads.internal.model.AdPayload r8 = r8.ad
            r9.encodeNullableSerializableElement(r10, r1, r0, r8)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.BidPayload.write$Self(com.vungle.ads.internal.model.BidPayload, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    public final String getEventId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    /* renamed from: getAdPayload, reason: from getter */
    public final AdPayload getAd() {
        return this.ad;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    private final String gzipDecode(byte[] compressed) throws Throwable {
        StringBuilder sb = new StringBuilder();
        GZIPInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            byteArrayInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            try {
                GZIPInputStream gZIPInputStream = byteArrayInputStream;
                byte[] bArr = new byte[32];
                while (true) {
                    int i = gZIPInputStream.read(bArr);
                    if (i != -1) {
                        sb.append(new String(bArr, 0, i, Charsets.UTF_8));
                    } else {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
                        return string;
                    }
                }
            } finally {
            }
        } finally {
        }
    }
}
