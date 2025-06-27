package com.unity3d.ads.core.domain.events;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import com.unity3d.services.core.di.ServiceProvider;
import gateway.v1.OperativeEventRequestOuterClass;
import gateway.v1.UniversalRequestKt;
import gateway.v1.UniversalRequestOuterClass;
import java.util.UUID;
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

/* compiled from: OperativeEventObserver.kt */
@Single
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final CoroutineDispatcher defaultDispatcher;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MutableStateFlow<Boolean> isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final UniversalRequestDataSource universalRequestDataSource;

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @Named(ServiceProvider.DEFAULT_DISPATCHER) CoroutineDispatcher defaultDispatcher, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = StateFlowKt.MutableStateFlow(false);
    }

    /* compiled from: OperativeEventObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OperativeEventObserver.this.new AnonymousClass2(continuation);
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
                MutableStateFlow mutableStateFlow = OperativeEventObserver.this.isRunning;
                do {
                    value = mutableStateFlow.getValue();
                    bool = (Boolean) value;
                    bool.booleanValue();
                } while (!mutableStateFlow.compareAndSet(value, Boxing.boxBoolean(true)));
                if (bool.booleanValue()) {
                    return Unit.INSTANCE;
                }
                FlowKt.launchIn(FlowKt.onEach(OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new C03182(OperativeEventObserver.this, null)), CoroutineScopeKt.CoroutineScope(OperativeEventObserver.this.defaultDispatcher));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OperativeEventObserver.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "operativeEventRequest", "Lgateway/v1/OperativeEventRequestOuterClass$OperativeEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", i = {1}, l = {40, 43}, m = "invokeSuspend", n = {"workId"}, s = {"L$0"})
        /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        static final class C03182 extends SuspendLambda implements Function2<OperativeEventRequestOuterClass.OperativeEventRequest, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03182(OperativeEventObserver operativeEventObserver, Continuation<? super C03182> continuation) {
                super(2, continuation);
                this.this$0 = operativeEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03182 c03182 = new C03182(this.this$0, continuation);
                c03182.L$0 = obj;
                return c03182;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, Continuation<? super Unit> continuation) {
                return ((C03182) create(operativeEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setOperativeEvent(operativeEventRequest);
                    UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    this.label = 1;
                    obj = this.this$0.getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                        BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                        Intrinsics.checkNotNullExpressionValue(constraintsBuild, "Builder()\n            .s…TED)\n            .build()");
                        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setConstraints(constraintsBuild).setInputData(universalRequestWorkerData.invoke()).build();
                        Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…a())\n            .build()");
                        backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "fullRequest.toByteArray()");
                this.L$0 = string;
                this.label = 2;
                if (universalRequestDataSource.set(string, ByteStringsKt.toByteString(byteArray), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = string;
                UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                Constraints constraintsBuild2 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                Intrinsics.checkNotNullExpressionValue(constraintsBuild2, "Builder()\n            .s…TED)\n            .build()");
                OneTimeWorkRequest oneTimeWorkRequestBuild2 = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setConstraints(constraintsBuild2).setInputData(universalRequestWorkerData2.invoke()).build();
                Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…a())\n            .build()");
                backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                return Unit.INSTANCE;
            }
        }
    }

    public final Object invoke(Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
