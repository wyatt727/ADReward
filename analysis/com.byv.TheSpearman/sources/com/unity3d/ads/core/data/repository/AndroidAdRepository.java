package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.koin.core.annotation.Single;

/* compiled from: AndroidAdRepository.kt */
@Single
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRepository;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "()V", "loadedAds", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/google/protobuf/ByteString;", "Lcom/unity3d/ads/core/data/model/AdObject;", "addAd", "", "opportunityId", "adObject", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAd", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasOpportunityId", "", "removeAd", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object addAd(ByteString byteString, AdObject adObject, Continuation<? super Unit> continuation) {
        this.loadedAds.put(byteString, adObject);
        return Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object getAd(ByteString byteString, Continuation<? super AdObject> continuation) {
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object removeAd(ByteString byteString, Continuation<? super Unit> continuation) {
        this.loadedAds.remove(byteString);
        return Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object hasOpportunityId(ByteString byteString, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.loadedAds.containsKey(byteString));
    }
}
