package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InitializeStateCreate.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateCreate", f = "InitializeStateCreate.kt", i = {}, l = {28}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes4.dex */
final class InitializeStateCreate$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateCreate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateCreate$doWork$1(InitializeStateCreate initializeStateCreate, Continuation<? super InitializeStateCreate$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateCreate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM843doWorkgIAlus = this.this$0.m843doWorkgIAlus((InitializeStateCreate.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        return objM843doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM843doWorkgIAlus : Result.m1061boximpl(objM843doWorkgIAlus);
    }
}
