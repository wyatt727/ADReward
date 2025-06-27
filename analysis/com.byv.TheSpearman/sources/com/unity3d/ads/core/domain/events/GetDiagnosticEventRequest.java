package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.json.t2;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gateway.v1.DiagnosticEventKt;
import gateway.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.annotation.Single;

/* compiled from: GetDiagnosticEventRequest.kt */
@Single
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Jl\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "invoke", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", t2.h.k0, "", "tags", "", "intTags", "", "value", "", "hb", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "adType", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;ZLcom/google/protobuf/ByteString;Ljava/lang/String;Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String eventName, Map<String, String> tags, Map<String, Integer> intTags, Double value, boolean hb, ByteString opportunityId, String placement, DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adType, "adType");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.INSTANCE;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        dsl_create.setCustomEventType(eventName);
        if (tags != null) {
            dsl_create.putAllStringTags(dsl_create.getStringTagsMap(), tags);
        }
        if (intTags != null) {
            dsl_create.putAllIntTags(dsl_create.getIntTagsMap(), intTags);
        }
        if (value != null) {
            dsl_create.setTimeValue(value.doubleValue());
        }
        dsl_create.setIsHeaderBidding(hb);
        dsl_create.setImpressionOpportunityId(opportunityId);
        dsl_create.setPlacementId(placement);
        dsl_create.setAdType(adType);
        return dsl_create._build();
    }
}
