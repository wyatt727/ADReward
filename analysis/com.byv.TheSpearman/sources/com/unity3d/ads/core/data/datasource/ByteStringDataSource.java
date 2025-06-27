package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import defpackage.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ByteStringDataSource.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "", "get", "LByteStringStoreOuterClass$ByteStringStore;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "data", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ByteStringDataSource {
    Object get(Continuation<? super ByteStringStoreOuterClass.ByteStringStore> continuation);

    Object set(ByteString byteString, Continuation<? super Unit> continuation);
}
