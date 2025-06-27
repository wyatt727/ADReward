package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeStateReset.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class InitializeStateReset$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, Continuation<? super InitializeStateReset$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Configuration>> continuation) {
        return ((InitializeStateReset$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x00b7, CancellationException -> 0x00e4, TryCatch #2 {CancellationException -> 0x00e4, all -> 0x00b7, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x0079, B:31:0x0087, B:32:0x0089, B:34:0x008c, B:36:0x0098, B:37:0x00a3, B:38:0x00a6, B:39:0x00af, B:40:0x00b6, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:53:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[Catch: all -> 0x00b7, CancellationException -> 0x00e4, TryCatch #2 {CancellationException -> 0x00e4, all -> 0x00b7, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x0079, B:31:0x0087, B:32:0x0089, B:34:0x008c, B:36:0x0098, B:37:0x00a3, B:38:0x00a6, B:39:0x00af, B:40:0x00b6, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:53:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r8.L$1
            com.unity3d.services.core.domain.task.InitializeStateReset r0 = (com.unity3d.services.core.domain.task.InitializeStateReset) r0
            java.lang.Object r1 = r8.L$0
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = (com.unity3d.services.core.domain.task.InitializeStateReset.Params) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            goto L5f
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = r8.$params
            com.unity3d.services.core.domain.task.InitializeStateReset r9 = r8.this$0
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.lang.String r4 = "Unity Ads init: starting init"
            com.unity3d.services.core.log.DeviceLog.debug(r4)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            if (r4 == 0) goto L37
            r4.resetWebViewAppInitialization()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
        L37:
            if (r4 == 0) goto L3e
            com.unity3d.services.core.webview.WebView r5 = r4.getWebView()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            goto L3f
        L3e:
            r5 = r2
        L3f:
            if (r5 == 0) goto L6d
            com.unity3d.services.core.configuration.Configuration r5 = r1.getConfig()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            long r5 = r5.getWebViewAppCreateTimeout()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1 r7 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            r7.<init>(r9, r4, r2)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            r8.L$0 = r1     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            r8.L$1 = r9     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            r8.label = r3     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.lang.Object r3 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r5, r7, r8)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            if (r3 != r0) goto L5d
            return r0
        L5d:
            r0 = r9
            r9 = r3
        L5f:
            kotlin.Unit r9 = (kotlin.Unit) r9     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            if (r9 == 0) goto L65
            r9 = r0
            goto L6d
        L65:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.lang.String r0 = "Reset failed on opening ConditionVariable"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            throw r9     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
        L6d:
            com.unity3d.services.core.domain.task.InitializeStateReset.access$unregisterLifecycleCallbacks(r9)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(r2)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.io.File r9 = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            if (r9 == 0) goto Laf
            r9 = 0
            com.unity3d.services.core.properties.SdkProperties.setInitialized(r9)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            com.unity3d.services.core.configuration.Configuration r0 = r1.getConfig()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.lang.Class[] r0 = r0.getModuleConfigurationList()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            if (r0 != 0) goto L89
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
        L89:
            int r2 = r0.length     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
        L8a:
            if (r9 >= r2) goto La6
            r3 = r0[r9]     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            com.unity3d.services.core.configuration.Configuration r4 = r1.getConfig()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            com.unity3d.services.core.configuration.IModuleConfiguration r3 = r4.getModuleConfiguration(r3)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            if (r3 == 0) goto La3
            com.unity3d.services.core.configuration.Configuration r4 = r1.getConfig()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            boolean r3 = r3.resetState(r4)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
        La3:
            int r9 = r9 + 1
            goto L8a
        La6:
            com.unity3d.services.core.configuration.Configuration r9 = r1.getConfig()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.lang.Object r9 = kotlin.Result.m1062constructorimpl(r9)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            goto Lc2
        Laf:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            java.lang.String r0 = "Cache directory is NULL"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
            throw r9     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Le4
        Lb7:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m1062constructorimpl(r9)
        Lc2:
            boolean r0 = kotlin.Result.m1069isSuccessimpl(r9)
            if (r0 == 0) goto Lcf
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.Result.m1062constructorimpl(r9)
            goto Ldf
        Lcf:
            java.lang.Throwable r0 = kotlin.Result.m1065exceptionOrNullimpl(r9)
            if (r0 == 0) goto Ldf
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r9 = kotlin.Result.m1062constructorimpl(r9)
        Ldf:
            kotlin.Result r9 = kotlin.Result.m1061boximpl(r9)
            return r9
        Le4:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
