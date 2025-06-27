package com.unity3d.services.core.di;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: KoinModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.di.KoinModule$provideHttpClient$1$config$1", f = "KoinModule.kt", i = {}, l = {452}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class KoinModule$provideHttpClient$1$config$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Configuration>, Object> {
    final /* synthetic */ ConfigFileFromLocalStorage $configFileFromLocalStorage;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KoinModule$provideHttpClient$1$config$1(ConfigFileFromLocalStorage configFileFromLocalStorage, Continuation<? super KoinModule$provideHttpClient$1$config$1> continuation) {
        super(2, continuation);
        this.$configFileFromLocalStorage = configFileFromLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KoinModule$provideHttpClient$1$config$1 koinModule$provideHttpClient$1$config$1 = new KoinModule$provideHttpClient$1$config$1(this.$configFileFromLocalStorage, continuation);
        koinModule$provideHttpClient$1$config$1.L$0 = obj;
        return koinModule$provideHttpClient$1$config$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Configuration> continuation) {
        return ((KoinModule$provideHttpClient$1$config$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM1062constructorimpl;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConfigFileFromLocalStorage configFileFromLocalStorage = this.$configFileFromLocalStorage;
                Result.Companion companion = Result.INSTANCE;
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                value = configFileFromLocalStorage.mo833invokegIAlus(params, this);
                if (value == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            objM1062constructorimpl = Result.m1062constructorimpl(Result.m1061boximpl(value));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM1062constructorimpl = Result.m1062constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1068isFailureimpl(objM1062constructorimpl)) {
            objM1062constructorimpl = null;
        }
        Result result = (Result) objM1062constructorimpl;
        if (result == null) {
            return null;
        }
        Object value2 = result.getValue();
        return (Configuration) (Result.m1068isFailureimpl(value2) ? null : value2);
    }
}
