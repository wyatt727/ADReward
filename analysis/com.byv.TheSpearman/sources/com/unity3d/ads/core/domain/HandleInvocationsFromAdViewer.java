package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.di.KoinModule;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.koin.core.Koin;
import org.koin.core.annotation.Factory;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* compiled from: HandleInvocationsFromAdViewer.kt */
@Factory
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002Jc\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "", "()V", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocations", "Lkotlinx/coroutines/flow/SharedFlow;", "adData", "", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "onSubscription", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer {
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    private final Scope scope;

    public HandleInvocationsFromAdViewer() {
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        this.scope = koin.getScopeRegistry().createScope(KoinPlatformTools.INSTANCE.generateId(), new TypeQualifier(Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class)), null);
    }

    public final Scope getScope() {
        return this.scope;
    }

    public final Object invoke(SharedFlow<Invocation> sharedFlow, String str, String str2, String str3, final AdObject adObject, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Flow<Invocation>> continuation) {
        final Scope scope = this.scope;
        final AdData adDataM702boximpl = AdData.m702boximpl(AdData.m703constructorimpl(str));
        final List listEmptyList = CollectionsKt.emptyList();
        final Qualifier qualifier = null;
        final boolean z = true;
        KoinPlatformTools.INSTANCE.m2860synchronized(scope, new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InstanceRegistry instanceRegistry = scope.get_koin().getInstanceRegistry();
                final Object obj = adDataM702boximpl;
                Qualifier qualifier2 = qualifier;
                List list = listEmptyList;
                boolean z2 = z;
                Qualifier scopeQualifier = scope.getScopeQualifier();
                String id = scope.getId();
                BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(AdData.class), qualifier2, new Function2<Scope, ParametersHolder, AdData>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.model.AdData, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public final AdData invoke(Scope _createDefinition, ParametersHolder it) {
                        Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
                        Intrinsics.checkNotNullParameter(it, "it");
                        return obj;
                    }
                }, Kind.Scoped, list);
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
                InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
                ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
                if (scopedInstanceFactory != null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    scopedInstanceFactory.refreshInstance(id, obj);
                    return;
                }
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
                InstanceRegistry.saveMapping$default(instanceRegistry, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
                Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
                while (it.hasNext()) {
                    InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
                }
            }
        });
        final Scope scope2 = this.scope;
        final ImpressionConfig impressionConfigM716boximpl = ImpressionConfig.m716boximpl(ImpressionConfig.m717constructorimpl(str3));
        final List listEmptyList2 = CollectionsKt.emptyList();
        KoinPlatformTools.INSTANCE.m2860synchronized(scope2, new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InstanceRegistry instanceRegistry = scope2.get_koin().getInstanceRegistry();
                final Object obj = impressionConfigM716boximpl;
                Qualifier qualifier2 = qualifier;
                List list = listEmptyList2;
                boolean z2 = z;
                Qualifier scopeQualifier = scope2.getScopeQualifier();
                String id = scope2.getId();
                BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(ImpressionConfig.class), qualifier2, new Function2<Scope, ParametersHolder, ImpressionConfig>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.model.ImpressionConfig, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public final ImpressionConfig invoke(Scope _createDefinition, ParametersHolder it) {
                        Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
                        Intrinsics.checkNotNullParameter(it, "it");
                        return obj;
                    }
                }, Kind.Scoped, list);
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
                InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
                ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
                if (scopedInstanceFactory != null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    scopedInstanceFactory.refreshInstance(id, obj);
                    return;
                }
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
                InstanceRegistry.saveMapping$default(instanceRegistry, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
                Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
                while (it.hasNext()) {
                    InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
                }
            }
        });
        final Scope scope3 = this.scope;
        final AdDataRefreshToken adDataRefreshTokenM709boximpl = AdDataRefreshToken.m709boximpl(AdDataRefreshToken.m710constructorimpl(str2));
        final List listEmptyList3 = CollectionsKt.emptyList();
        KoinPlatformTools.INSTANCE.m2860synchronized(scope3, new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InstanceRegistry instanceRegistry = scope3.get_koin().getInstanceRegistry();
                final Object obj = adDataRefreshTokenM709boximpl;
                Qualifier qualifier2 = qualifier;
                List list = listEmptyList3;
                boolean z2 = z;
                Qualifier scopeQualifier = scope3.getScopeQualifier();
                String id = scope3.getId();
                BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(AdDataRefreshToken.class), qualifier2, new Function2<Scope, ParametersHolder, AdDataRefreshToken>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.model.AdDataRefreshToken, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public final AdDataRefreshToken invoke(Scope _createDefinition, ParametersHolder it) {
                        Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
                        Intrinsics.checkNotNullParameter(it, "it");
                        return obj;
                    }
                }, Kind.Scoped, list);
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
                InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
                ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
                if (scopedInstanceFactory != null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    scopedInstanceFactory.refreshInstance(id, obj);
                    return;
                }
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
                InstanceRegistry.saveMapping$default(instanceRegistry, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
                Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
                while (it.hasNext()) {
                    InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
                }
            }
        });
        final Scope scope4 = this.scope;
        final List listEmptyList4 = CollectionsKt.emptyList();
        KoinPlatformTools.INSTANCE.m2860synchronized(scope4, new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InstanceRegistry instanceRegistry = scope4.get_koin().getInstanceRegistry();
                final Object obj = adObject;
                Qualifier qualifier2 = qualifier;
                List list = listEmptyList4;
                boolean z2 = z;
                Qualifier scopeQualifier = scope4.getScopeQualifier();
                String id = scope4.getId();
                BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(AdObject.class), qualifier2, new Function2<Scope, ParametersHolder, AdObject>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$$inlined$declare$default$4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.model.AdObject, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public final AdObject invoke(Scope _createDefinition, ParametersHolder it) {
                        Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
                        Intrinsics.checkNotNullParameter(it, "it");
                        return obj;
                    }
                }, Kind.Scoped, list);
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
                InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
                ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
                if (scopedInstanceFactory != null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    scopedInstanceFactory.refreshInstance(id, obj);
                    return;
                }
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
                InstanceRegistry.saveMapping$default(instanceRegistry, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
                Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
                while (it.hasNext()) {
                    InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
                }
            }
        });
        return FlowKt.onCompletion(FlowKt.onEach(FlowKt.onSubscription(sharedFlow, new AnonymousClass2(function1, null)), new AnonymousClass3(null)), new AnonymousClass4(null));
    }

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super Invocation>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onSubscription = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$onSubscription, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Invocation> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.$onSubscription;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Invocation, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = HandleInvocationsFromAdViewer.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Invocation invocation, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(invocation, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Invocation invocation = (Invocation) this.L$0;
                ExposedFunction exposedFunction = (ExposedFunction) HandleInvocationsFromAdViewer.this.getScope().getOrNull(Reflection.getOrCreateKotlinClass(ExposedFunction.class), QualifierKt.named(invocation.getLocation()), null);
                if (exposedFunction == null) {
                    return Unit.INSTANCE;
                }
                this.label = 1;
                if (invocation.handle(new AnonymousClass1(exposedFunction, invocation, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HandleInvocationsFromAdViewer.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
                return invoke2((Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<Object> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExposedFunction exposedFunction = this.$exposedFunction;
                    Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    obj = exposedFunction.invoke(parameters, this);
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
    }

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/Invocation;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$4", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function3<FlowCollector<? super Invocation>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Invocation> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return HandleInvocationsFromAdViewer.this.new AnonymousClass4(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HandleInvocationsFromAdViewer.this.getScope().close();
            return Unit.INSTANCE;
        }
    }
}
