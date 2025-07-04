package kotlinx.coroutines.channels;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", FirebaseAnalytics.Param.INDEX, "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes5.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM2569receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m2569receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM2569receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM2569receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m2576boximpl(objM2569receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
