package com.unity3d.ads.core.data.manager;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.annotation.Named;
import org.koin.core.annotation.Single;

/* compiled from: TransactionEventManager.kt */
@Single
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "storeMonitor", "Lcom/unity3d/services/store/StoreMonitor;", "getTransactionData", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getTransactionRequest", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/services/store/StoreMonitor;Lcom/unity3d/ads/core/domain/events/GetTransactionData;Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;)V", "invoke", "", "onPurchasesReceived", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "purchases", "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionEventManager {
    private static final String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final CoroutineScope scope;
    private final StoreMonitor storeMonitor;
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventManager(@Named(ServiceProvider.NAMED_TRANSACTION_SCOPE) CoroutineScope scope, StoreMonitor storeMonitor, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, @Named(ServiceProvider.DATA_STORE_IAP_TRANSACTION) ByteStringDataSource iapTransactionStore) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storeMonitor, "storeMonitor");
        Intrinsics.checkNotNullParameter(getTransactionData, "getTransactionData");
        Intrinsics.checkNotNullParameter(getTransactionRequest, "getTransactionRequest");
        Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        this.scope = scope;
        this.storeMonitor = storeMonitor;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
    }

    public static final /* synthetic */ void access$onPurchasesReceived(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list);
    }

    /* compiled from: TransactionEventManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransactionEventManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!TransactionEventManager.this.storeMonitor.isInitialized()) {
                    final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    AnonymousClass1 anonymousClass1 = this;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(anonymousClass1));
                    final SafeContinuation safeContinuation2 = safeContinuation;
                    transactionEventManager.storeMonitor.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                        @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                        public void onIsAlreadyInitialized() {
                            Continuation<Unit> continuation = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            continuation.resumeWith(Result.m1062constructorimpl(Unit.INSTANCE));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingSetupFinished(BillingResultBridge billingResult) {
                            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                            if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                                Continuation<Unit> continuation = safeContinuation2;
                                Result.Companion companion = Result.INSTANCE;
                                continuation.resumeWith(Result.m1062constructorimpl(ResultKt.createFailure(new Exception("Billing setup failed"))));
                            } else {
                                Continuation<Unit> continuation2 = safeContinuation2;
                                Result.Companion companion2 = Result.INSTANCE;
                                continuation2.resumeWith(Result.m1062constructorimpl(Unit.INSTANCE));
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            Continuation<Unit> continuation = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            continuation.resumeWith(Result.m1062constructorimpl(ResultKt.createFailure(new Exception("Billing service disconnected"))));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                        public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
                            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                            transactionEventManager.onPurchasesReceived(billingResult, purchases);
                        }
                    });
                    Object orThrow = safeContinuation.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
                    }
                    if (orThrow == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            StoreMonitor storeMonitor = TransactionEventManager.this.storeMonitor;
            final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
            storeMonitor.getPurchases(42, "inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$$ExternalSyntheticLambda0
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    TransactionEventManager.access$onPurchasesReceived(transactionEventManager2, billingResultBridge, list);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public final void invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: TransactionEventManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", i = {0, 0, 0, 0, 0, 0, 1}, l = {83, 100, 103}, m = "invokeSuspend", n = {"transactionDataList", "deferredPurchaseList", FirebaseAnalytics.Event.PURCHASE, "index$iv", FirebaseAnalytics.Param.INDEX, "purchaseTime", "transactionDataList"}, s = {"L$0", "L$1", "L$4", "I$0", "I$1", "J$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    static final class C14571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14571(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, Continuation<? super C14571> continuation) {
            super(2, continuation);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14571(this.$purchases, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0188  */
        /* JADX WARN: Type inference failed for: r14v7, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e4 -> B:26:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C14571.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3$lambda$2(List list, int i, List list2, TransactionEventManager transactionEventManager, PurchaseBridge purchaseBridge, BillingResultBridge billingResultBridge, List list3) {
            if (list3 == null || billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                ((CompletableDeferred) list.get(i)).complete(Unit.INSTANCE);
                return;
            }
            List list4 = list3;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(transactionEventManager.getTransactionData.invoke(purchaseBridge, (SkuDetailsBridge) it.next()));
            }
            list2.addAll(arrayList);
            ((CompletableDeferred) list.get(i)).complete(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            List<? extends PurchaseBridge> list = purchases;
            if (list == null || list.isEmpty()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C14571(purchases, this, null), 3, null);
        }
    }
}
