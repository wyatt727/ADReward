package com.unity3d.services.core.domain;

import com.json.t2;
import com.my.target.ads.Reward;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: ISDKDispatchers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/domain/ISDKDispatchers;", "", Reward.DEFAULT, "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io", "getIo", t2.h.Z, "getMain", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ISDKDispatchers {
    CoroutineDispatcher getDefault();

    CoroutineDispatcher getIo();

    CoroutineDispatcher getMain();
}
