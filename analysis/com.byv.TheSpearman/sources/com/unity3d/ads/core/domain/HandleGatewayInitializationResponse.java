package com.unity3d.ads.core.domain;

import com.json.mediationsdk.utils.c;
import gateway.v1.InitializationResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: HandleGatewayInitializationResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "", "invoke", "", c.Y1, "Lgateway/v1/InitializationResponseOuterClass$InitializationResponse;", "(Lgateway/v1/InitializationResponseOuterClass$InitializationResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HandleGatewayInitializationResponse {
    Object invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse, Continuation<? super Unit> continuation);
}
