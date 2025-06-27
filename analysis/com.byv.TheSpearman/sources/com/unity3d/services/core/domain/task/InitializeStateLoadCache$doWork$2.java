package com.unity3d.services.core.domain.task;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeStateLoadCache.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class InitializeStateLoadCache$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InitializeStateLoadCache.LoadCacheResult>>, Object> {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, Continuation<? super InitializeStateLoadCache$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InitializeStateLoadCache.LoadCacheResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<InitializeStateLoadCache.LoadCacheResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<InitializeStateLoadCache.LoadCacheResult>> continuation) {
        return ((InitializeStateLoadCache$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM1062constructorimpl;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        InitializeStateLoadCache.Params params = this.$params;
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            byte[] webViewData = initializeStateLoadCache.getWebViewData();
            boolean z = true;
            if (webViewData == null) {
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                String strSha256 = Utilities.Sha256(webViewData);
                Charset charsetForName = Charset.forName(C.UTF8_NAME);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
                String str = new String(webViewData, charsetForName);
                boolean z2 = strSha256 == null || !Intrinsics.areEqual(strSha256, params.getConfig().getWebViewHash());
                if (!z2) {
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                }
                if (!z2) {
                    z = false;
                }
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(z, str);
            }
            objM1062constructorimpl = Result.m1062constructorimpl(loadCacheResult);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM1062constructorimpl = Result.m1062constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1069isSuccessimpl(objM1062constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            objM1062constructorimpl = Result.m1062constructorimpl(objM1062constructorimpl);
        } else {
            Throwable thM1065exceptionOrNullimpl = Result.m1065exceptionOrNullimpl(objM1062constructorimpl);
            if (thM1065exceptionOrNullimpl != null) {
                Result.Companion companion4 = Result.INSTANCE;
                objM1062constructorimpl = Result.m1062constructorimpl(ResultKt.createFailure(thM1065exceptionOrNullimpl));
            }
        }
        return Result.m1061boximpl(objM1062constructorimpl);
    }
}
