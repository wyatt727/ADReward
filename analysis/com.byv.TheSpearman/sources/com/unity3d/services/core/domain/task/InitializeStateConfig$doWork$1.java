package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InitializeStateConfig.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfig", f = "InitializeStateConfig.kt", i = {}, l = {22}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes4.dex */
final class InitializeStateConfig$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, Continuation<? super InitializeStateConfig$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM840doWorkgIAlus = this.this$0.m840doWorkgIAlus((InitializeStateConfig.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        return objM840doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM840doWorkgIAlus : Result.m1061boximpl(objM840doWorkgIAlus);
    }
}
