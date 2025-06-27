package com.unity3d.ads.core.domain;

import gateway.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GetUniversalRequestForPayLoad.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "", "invoke", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest;", "payload", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "(Lgateway/v1/UniversalRequestOuterClass$UniversalRequest$Payload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GetUniversalRequestForPayLoad {
    Object invoke(UniversalRequestOuterClass.UniversalRequest.Payload payload, Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);
}
