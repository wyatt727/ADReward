package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gateway.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GetAdPlayerConfigRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦Bø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "", "invoke", "Lgateway/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "configToken", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GetAdPlayerConfigRequest {
    Object invoke(String str, ByteString byteString, ByteString byteString2, Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);
}
