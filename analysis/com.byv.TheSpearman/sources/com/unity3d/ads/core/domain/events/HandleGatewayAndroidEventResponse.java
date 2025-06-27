package com.unity3d.ads.core.domain.events;

import com.json.mediationsdk.utils.c;
import gateway.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.koin.core.annotation.Single;

/* compiled from: HandleGatewayAndroidEventResponse.kt */
@Single
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/HandleGatewayAndroidEventResponse;", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "()V", "invoke", "", c.Y1, "Lgateway/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgateway/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HandleGatewayAndroidEventResponse implements HandleGatewayEventResponse {
    @Override // com.unity3d.ads.core.domain.events.HandleGatewayEventResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
