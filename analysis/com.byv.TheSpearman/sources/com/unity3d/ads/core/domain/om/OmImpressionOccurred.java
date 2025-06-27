package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: OmImpressionOccurred.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦Bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "signalLoaded", "", "(Lcom/unity3d/ads/core/data/model/AdObject;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OmImpressionOccurred {
    Object invoke(AdObject adObject, boolean z, Continuation<? super Unit> continuation);
}
