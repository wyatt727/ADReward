package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeStateLoadWeb.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", i = {0, 0, 1}, l = {46, 64, 71}, m = "invokeSuspend", n = {"$this$withContext", AdActivity.REQUEST_KEY_EXTRA, AdActivity.REQUEST_KEY_EXTRA}, s = {"L$0", "L$3", "L$2"})
/* loaded from: classes4.dex */
final class InitializeStateLoadWeb$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, Continuation<? super InitializeStateLoadWeb$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, continuation);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<InitializeStateLoadWeb.LoadWebResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return ((InitializeStateLoadWeb$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #2 {all -> 0x0044, blocks: (B:13:0x0037, B:43:0x0159, B:40:0x0136), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172 A[Catch: all -> 0x01fc, CancellationException -> 0x0229, TryCatch #6 {CancellationException -> 0x0229, all -> 0x01fc, blocks: (B:8:0x0018, B:51:0x0195, B:55:0x01b8, B:57:0x01c2, B:60:0x01cd, B:61:0x01df, B:63:0x01e2, B:64:0x01ee, B:46:0x016c, B:48:0x0172, B:52:0x0198, B:53:0x01aa, B:45:0x0162, B:38:0x0130, B:54:0x01ab, B:37:0x0126, B:23:0x006f), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198 A[Catch: all -> 0x01fc, CancellationException -> 0x0229, TryCatch #6 {CancellationException -> 0x0229, all -> 0x01fc, blocks: (B:8:0x0018, B:51:0x0195, B:55:0x01b8, B:57:0x01c2, B:60:0x01cd, B:61:0x01df, B:63:0x01e2, B:64:0x01ee, B:46:0x016c, B:48:0x0172, B:52:0x0198, B:53:0x01aa, B:45:0x0162, B:38:0x0130, B:54:0x01ab, B:37:0x0126, B:23:0x006f), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ab A[Catch: all -> 0x01fc, CancellationException -> 0x0229, TryCatch #6 {CancellationException -> 0x0229, all -> 0x01fc, blocks: (B:8:0x0018, B:51:0x0195, B:55:0x01b8, B:57:0x01c2, B:60:0x01cd, B:61:0x01df, B:63:0x01e2, B:64:0x01ee, B:46:0x016c, B:48:0x0172, B:52:0x0198, B:53:0x01aa, B:45:0x0162, B:38:0x0130, B:54:0x01ab, B:37:0x0126, B:23:0x006f), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2 A[Catch: all -> 0x01fc, CancellationException -> 0x0229, TryCatch #6 {CancellationException -> 0x0229, all -> 0x01fc, blocks: (B:8:0x0018, B:51:0x0195, B:55:0x01b8, B:57:0x01c2, B:60:0x01cd, B:61:0x01df, B:63:0x01e2, B:64:0x01ee, B:46:0x016c, B:48:0x0172, B:52:0x0198, B:53:0x01aa, B:45:0x0162, B:38:0x0130, B:54:0x01ab, B:37:0x0126, B:23:0x006f), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2 A[Catch: all -> 0x01fc, CancellationException -> 0x0229, TryCatch #6 {CancellationException -> 0x0229, all -> 0x01fc, blocks: (B:8:0x0018, B:51:0x0195, B:55:0x01b8, B:57:0x01c2, B:60:0x01cd, B:61:0x01df, B:63:0x01e2, B:64:0x01ee, B:46:0x016c, B:48:0x0172, B:52:0x0198, B:53:0x01aa, B:45:0x0162, B:38:0x0130, B:54:0x01ab, B:37:0x0126, B:23:0x006f), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
