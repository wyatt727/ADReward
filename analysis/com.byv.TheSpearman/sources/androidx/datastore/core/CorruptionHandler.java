package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CorruptionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/CorruptionHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "handleCorruption", "ex", "Landroidx/datastore/core/CorruptionException;", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CorruptionHandler<T> {
    Object handleCorruption(CorruptionException corruptionException, Continuation<? super T> continuation);
}
