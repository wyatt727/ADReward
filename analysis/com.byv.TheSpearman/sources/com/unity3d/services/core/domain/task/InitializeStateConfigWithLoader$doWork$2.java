package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeStateConfigWithLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", i = {0, 0, 0, 1, 1, 2}, l = {58, 101, 109}, m = "invokeSuspend", n = {"$this$withContext", "configurationLoader", "config", "configurationLoader", "config", "config"}, s = {"L$0", "L$3", "L$4", "L$2", "L$3", "L$0"})
/* loaded from: classes4.dex */
final class InitializeStateConfigWithLoader$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, Continuation<? super InitializeStateConfigWithLoader$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, continuation);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Configuration>> continuation) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0198 A[Catch: all -> 0x0251, CancellationException -> 0x027e, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x027e, all -> 0x0251, blocks: (B:8:0x001e, B:57:0x0215, B:63:0x0246, B:51:0x01db, B:53:0x01e3, B:58:0x021f, B:59:0x0231, B:50:0x01d1, B:38:0x018f, B:40:0x0198, B:60:0x0232, B:61:0x023f, B:62:0x0240, B:37:0x0185, B:23:0x007f), top: B:87:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3 A[Catch: all -> 0x0251, CancellationException -> 0x027e, TryCatch #7 {CancellationException -> 0x027e, all -> 0x0251, blocks: (B:8:0x001e, B:57:0x0215, B:63:0x0246, B:51:0x01db, B:53:0x01e3, B:58:0x021f, B:59:0x0231, B:50:0x01d1, B:38:0x018f, B:40:0x0198, B:60:0x0232, B:61:0x023f, B:62:0x0240, B:37:0x0185, B:23:0x007f), top: B:87:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f A[Catch: all -> 0x0251, CancellationException -> 0x027e, TryCatch #7 {CancellationException -> 0x027e, all -> 0x0251, blocks: (B:8:0x001e, B:57:0x0215, B:63:0x0246, B:51:0x01db, B:53:0x01e3, B:58:0x021f, B:59:0x0231, B:50:0x01d1, B:38:0x018f, B:40:0x0198, B:60:0x0232, B:61:0x023f, B:62:0x0240, B:37:0x0185, B:23:0x007f), top: B:87:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240 A[Catch: all -> 0x0251, CancellationException -> 0x027e, TryCatch #7 {CancellationException -> 0x027e, all -> 0x0251, blocks: (B:8:0x001e, B:57:0x0215, B:63:0x0246, B:51:0x01db, B:53:0x01e3, B:58:0x021f, B:59:0x0231, B:50:0x01d1, B:38:0x018f, B:40:0x0198, B:60:0x0232, B:61:0x023f, B:62:0x0240, B:37:0x0185, B:23:0x007f), top: B:87:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0269  */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
