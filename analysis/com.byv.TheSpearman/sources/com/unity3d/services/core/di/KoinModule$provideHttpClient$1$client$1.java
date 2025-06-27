package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: KoinModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.di.KoinModule$provideHttpClient$1$client$1", f = "KoinModule.kt", i = {}, l = {445}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class KoinModule$provideHttpClient$1$client$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpClient>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ISDKDispatchers $dispatchers;
    int label;
    final /* synthetic */ KoinModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KoinModule$provideHttpClient$1$client$1(KoinModule koinModule, Context context, ISDKDispatchers iSDKDispatchers, Continuation<? super KoinModule$provideHttpClient$1$client$1> continuation) {
        super(2, continuation);
        this.this$0 = koinModule;
        this.$context = context;
        this.$dispatchers = iSDKDispatchers;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KoinModule$provideHttpClient$1$client$1(this.this$0, this.$context, this.$dispatchers, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpClient> continuation) {
        return ((KoinModule$provideHttpClient$1$client$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.buildNetworkClient(this.$context, this.$dispatchers, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
