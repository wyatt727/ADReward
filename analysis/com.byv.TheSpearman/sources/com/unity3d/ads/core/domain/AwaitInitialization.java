package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AwaitInitialization.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AwaitInitialization;", "", "invoke", "Lcom/unity3d/ads/core/data/model/InitializationState;", "timeout", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AwaitInitialization {
    Object invoke(long j, Continuation<? super InitializationState> continuation);

    /* compiled from: AwaitInitialization.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            return awaitInitialization.invoke(j, continuation);
        }
    }
}
