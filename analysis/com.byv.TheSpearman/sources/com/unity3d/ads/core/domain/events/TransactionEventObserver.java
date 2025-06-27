package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.core.di.ServiceProvider;
import gateway.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.core.annotation.Named;
import org.koin.core.annotation.Single;

/* compiled from: TransactionEventObserver.kt */
@Single
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0012\u001a\u00020\u0013H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionEventObserver {
    private final CoroutineDispatcher defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final MutableStateFlow<Boolean> isRunning;
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @Named(ServiceProvider.DEFAULT_DISPATCHER) CoroutineDispatcher defaultDispatcher, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, @Named(ServiceProvider.NAMED_OTHER_REQ) GetRequestPolicy getRequestPolicy, @Named(ServiceProvider.DATA_STORE_IAP_TRANSACTION) ByteStringDataSource iapTransactionStore) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = StateFlowKt.MutableStateFlow(false);
    }

    /* compiled from: TransactionEventObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransactionEventObserver.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Boolean bool;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = TransactionEventObserver.this.isRunning;
                do {
                    value = mutableStateFlow.getValue();
                    bool = (Boolean) value;
                    bool.booleanValue();
                } while (!mutableStateFlow.compareAndSet(value, Boxing.boxBoolean(true)));
                if (bool.booleanValue()) {
                    return Unit.INSTANCE;
                }
                FlowKt.launchIn(FlowKt.onEach(TransactionEventObserver.this.transactionEventRepository.getTransactionEvents(), new C03192(TransactionEventObserver.this, null)), CoroutineScopeKt.CoroutineScope(TransactionEventObserver.this.defaultDispatcher));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TransactionEventObserver.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgateway/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", i = {1}, l = {44, 46, 55}, m = "invokeSuspend", n = {"fullRequest"}, s = {"L$0"})
        /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        static final class C03192 extends SuspendLambda implements Function2<TransactionEventRequestOuterClass.TransactionEventRequest, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransactionEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03192(TransactionEventObserver transactionEventObserver, Continuation<? super C03192> continuation) {
                super(2, continuation);
                this.this$0 = transactionEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03192 c03192 = new C03192(this.this$0, continuation);
                c03192.L$0 = obj;
                return c03192;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, Continuation<? super Unit> continuation) {
                return ((C03192) create(transactionEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r4) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto Lb4
                L16:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1e:
                    java.lang.Object r1 = r12.L$0
                    gateway.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gateway.v1.UniversalRequestOuterClass.UniversalRequest) r1
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto L82
                L26:
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto L5b
                L2a:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Object r13 = r12.L$0
                    gateway.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gateway.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                    gateway.v1.UniversalRequestKt r1 = gateway.v1.UniversalRequestKt.INSTANCE
                    gateway.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gateway.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE
                    gateway.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gateway.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                    java.lang.String r6 = "newBuilder()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                    gateway.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)
                    r1.setTransactionEventRequest(r13)
                    gateway.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = r12.this$0
                    com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)
                    r5 = r12
                    kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                    r12.label = r4
                    java.lang.Object r13 = r1.invoke(r13, r5)
                    if (r13 != r0) goto L5b
                    return r0
                L5b:
                    r1 = r13
                    gateway.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gateway.v1.UniversalRequestOuterClass.UniversalRequest) r1
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)
                    r5 = 0
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT
                    r9 = r12
                    kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                    r10 = 1
                    r11 = 0
                    r12.L$0 = r1
                    r12.label = r3
                    r6 = r1
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L82
                    return r0
                L82:
                    gateway.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gateway.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    gateway.v1.ErrorOuterClass$Error r13 = r13.getError()
                    if (r13 == 0) goto Lb4
                    com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)
                    gateway.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()
                    gateway.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()
                    com.google.protobuf.Timestamp r1 = r1.getTimestamp()
                    com.google.protobuf.ByteString r1 = r1.toByteString()
                    java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                    r3 = r12
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                    r4 = 0
                    r12.L$0 = r4
                    r12.label = r2
                    java.lang.Object r13 = r13.set(r1, r3)
                    if (r13 != r0) goto Lb4
                    return r0
                Lb4:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C03192.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    public final Object invoke(Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
