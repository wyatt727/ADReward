package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.objectweb.asm.Opcodes;

/* compiled from: HandleGatewayAndroidAdResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$loadEvent$1", f = "HandleGatewayAndroidAdResponse.kt", i = {}, l = {Opcodes.IFNONNULL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HandleGatewayAndroidAdResponse$invoke$loadEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoadEvent>, Object> {
    final /* synthetic */ WebViewAdPlayer $webViewAdPlayer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$invoke$loadEvent$1(WebViewAdPlayer webViewAdPlayer, Continuation<? super HandleGatewayAndroidAdResponse$invoke$loadEvent$1> continuation) {
        super(2, continuation);
        this.$webViewAdPlayer = webViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HandleGatewayAndroidAdResponse$invoke$loadEvent$1(this.$webViewAdPlayer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoadEvent> continuation) {
        return ((HandleGatewayAndroidAdResponse$invoke$loadEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = FlowKt.single(this.$webViewAdPlayer.getOnLoadEvent(), this);
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
