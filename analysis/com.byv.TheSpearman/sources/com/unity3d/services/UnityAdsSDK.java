package com.unity3d.services;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.i1;
import com.json.mediationsdk.metadata.a;
import com.json.o1;
import com.json.t2;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.KoinModule;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.TimeSource;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.objectweb.asm.Opcodes;

/* compiled from: UnityAdsSDK.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020AH\u0002J\u000e\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AJ\b\u0010F\u001a\u0004\u0018\u00010AJ\u0010\u0010F\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010HJ\u0006\u0010I\u001a\u00020DJ.\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010A2\u0006\u0010M\u001a\u00020N2\b\u0010G\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010QJ\"\u0010R\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010A2\b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010G\u001a\u00020UR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b=\u0010>¨\u0006V"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "getAlternativeFlowReader", "()Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader$delegate", "Lkotlin/Lazy;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "getAdObject", "Lcom/unity3d/ads/core/domain/GetAdObject;", "getGetAdObject", "()Lcom/unity3d/ads/core/domain/GetAdObject;", "getAdObject$delegate", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getGetAsyncHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getAsyncHeaderBiddingToken$delegate", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken$delegate", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState$delegate", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "getInitializeBoldSDK", "()Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "initializeBoldSDK$delegate", "initializeSDK", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "getInitializeSDK", "()Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeSDK$delegate", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "getOmFinishSession", "()Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omFinishSession$delegate", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "setInitializationState", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "getSetInitializationState", "()Lcom/unity3d/ads/core/domain/SetInitializationState;", "setInitializationState$delegate", "showBoldSDK", "Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "getShowBoldSDK", "()Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "showBoldSDK$delegate", "fetchToken", "", "sync", "finishOMIDSession", "", "opportunityId", "getToken", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", MobileAdsBridgeBase.initializeMethodName, "load", "Lkotlinx/coroutines/Job;", t2.k, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "Lcom/unity3d/ads/IUnityAdsLoadListener;", o1.u, "Lcom/unity3d/services/banners/UnityBannerSize;", i1.u, "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Lcom/unity3d/ads/core/data/model/Listeners;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnityAdsSDK implements IServiceComponent {
    public static final UnityAdsSDK INSTANCE = new UnityAdsSDK();

    /* renamed from: alternativeFlowReader$delegate, reason: from kotlin metadata */
    private static final Lazy alternativeFlowReader;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private static final Lazy context;

    /* renamed from: getAdObject$delegate, reason: from kotlin metadata */
    private static final Lazy getAdObject;

    /* renamed from: getAsyncHeaderBiddingToken$delegate, reason: from kotlin metadata */
    private static final Lazy getAsyncHeaderBiddingToken;

    /* renamed from: getHeaderBiddingToken$delegate, reason: from kotlin metadata */
    private static final Lazy getHeaderBiddingToken;

    /* renamed from: getInitializationState$delegate, reason: from kotlin metadata */
    private static final Lazy getInitializationState;

    /* renamed from: initializeBoldSDK$delegate, reason: from kotlin metadata */
    private static final Lazy initializeBoldSDK;

    /* renamed from: initializeSDK$delegate, reason: from kotlin metadata */
    private static final Lazy initializeSDK;

    /* renamed from: omFinishSession$delegate, reason: from kotlin metadata */
    private static final Lazy omFinishSession;

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    private static final Lazy sendDiagnosticEvent;

    /* renamed from: setInitializationState$delegate, reason: from kotlin metadata */
    private static final Lazy setInitializationState;

    /* renamed from: showBoldSDK$delegate, reason: from kotlin metadata */
    private static final Lazy showBoldSDK;

    private UnityAdsSDK() {
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed = QualifierKt.named("");
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Function0 function0 = null;
        initializeSDK = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InitializeSDK>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.services.core.domain.task.InitializeSDK, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final InitializeSDK invoke() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(InitializeSDK.class), stringQualifierNamed, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        Koin koin2 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed2 = QualifierKt.named("");
        final Scope rootScope2 = koin2.getScopeRegistry().getRootScope();
        alternativeFlowReader = LazyKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final AlternativeFlowReader invoke() {
                return rootScope2.get(Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class), stringQualifierNamed2, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode3 = LazyThreadSafetyMode.NONE;
        Koin koin3 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed3 = QualifierKt.named("");
        final Scope rootScope3 = koin3.getScopeRegistry().getRootScope();
        initializeBoldSDK = LazyKt.lazy(lazyThreadSafetyMode3, (Function0) new Function0<InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final InitializeBoldSDK invoke() {
                return rootScope3.get(Reflection.getOrCreateKotlinClass(InitializeBoldSDK.class), stringQualifierNamed3, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode4 = LazyThreadSafetyMode.NONE;
        Koin koin4 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed4 = QualifierKt.named("");
        final Scope rootScope4 = koin4.getScopeRegistry().getRootScope();
        showBoldSDK = LazyKt.lazy(lazyThreadSafetyMode4, (Function0) new Function0<LegacyShowUseCase>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.LegacyShowUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final LegacyShowUseCase invoke() {
                return rootScope4.get(Reflection.getOrCreateKotlinClass(LegacyShowUseCase.class), stringQualifierNamed4, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode5 = LazyThreadSafetyMode.NONE;
        Koin koin5 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed5 = QualifierKt.named("");
        final Scope rootScope5 = koin5.getScopeRegistry().getRootScope();
        getHeaderBiddingToken = LazyKt.lazy(lazyThreadSafetyMode5, (Function0) new Function0<GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetHeaderBiddingToken invoke() {
                return rootScope5.get(Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class), stringQualifierNamed5, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode6 = LazyThreadSafetyMode.NONE;
        Koin koin6 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed6 = QualifierKt.named("");
        final Scope rootScope6 = koin6.getScopeRegistry().getRootScope();
        getAsyncHeaderBiddingToken = LazyKt.lazy(lazyThreadSafetyMode6, (Function0) new Function0<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetAsyncHeaderBiddingToken invoke() {
                return rootScope6.get(Reflection.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class), stringQualifierNamed6, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode7 = LazyThreadSafetyMode.NONE;
        Koin koin7 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed7 = QualifierKt.named("");
        final Scope rootScope7 = koin7.getScopeRegistry().getRootScope();
        getInitializationState = LazyKt.lazy(lazyThreadSafetyMode7, (Function0) new Function0<GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetInitializationState invoke() {
                return rootScope7.get(Reflection.getOrCreateKotlinClass(GetInitializationState.class), stringQualifierNamed7, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode8 = LazyThreadSafetyMode.NONE;
        Koin koin8 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed8 = QualifierKt.named("");
        final Scope rootScope8 = koin8.getScopeRegistry().getRootScope();
        sendDiagnosticEvent = LazyKt.lazy(lazyThreadSafetyMode8, (Function0) new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SendDiagnosticEvent invoke() {
                return rootScope8.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), stringQualifierNamed8, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode9 = LazyThreadSafetyMode.NONE;
        Koin koin9 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed9 = QualifierKt.named("");
        final Scope rootScope9 = koin9.getScopeRegistry().getRootScope();
        omFinishSession = LazyKt.lazy(lazyThreadSafetyMode9, (Function0) new Function0<OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final OmFinishSession invoke() {
                return rootScope9.get(Reflection.getOrCreateKotlinClass(OmFinishSession.class), stringQualifierNamed9, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode10 = LazyThreadSafetyMode.NONE;
        Koin koin10 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed10 = QualifierKt.named("");
        final Scope rootScope10 = koin10.getScopeRegistry().getRootScope();
        getAdObject = LazyKt.lazy(lazyThreadSafetyMode10, (Function0) new Function0<GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetAdObject invoke() {
                return rootScope10.get(Reflection.getOrCreateKotlinClass(GetAdObject.class), stringQualifierNamed10, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode11 = LazyThreadSafetyMode.NONE;
        Koin koin11 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed11 = QualifierKt.named("");
        final Scope rootScope11 = koin11.getScopeRegistry().getRootScope();
        setInitializationState = LazyKt.lazy(lazyThreadSafetyMode11, (Function0) new Function0<SetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.unity3d.ads.core.domain.SetInitializationState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SetInitializationState invoke() {
                return rootScope11.get(Reflection.getOrCreateKotlinClass(SetInitializationState.class), stringQualifierNamed11, function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode12 = LazyThreadSafetyMode.NONE;
        Koin koin12 = KoinModule.INSTANCE.getSystem().getKoin();
        final StringQualifier stringQualifierNamed12 = QualifierKt.named("");
        final Scope rootScope12 = koin12.getScopeRegistry().getRootScope();
        context = LazyKt.lazy(lazyThreadSafetyMode12, (Function0) new Function0<Context>() { // from class: com.unity3d.services.UnityAdsSDK$special$$inlined$inject$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Context invoke() {
                return rootScope12.get(Reflection.getOrCreateKotlinClass(Context.class), stringQualifierNamed12, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InitializeSDK getInitializeSDK() {
        return (InitializeSDK) initializeSDK.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlternativeFlowReader getAlternativeFlowReader() {
        return (AlternativeFlowReader) alternativeFlowReader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InitializeBoldSDK getInitializeBoldSDK() {
        return (InitializeBoldSDK) initializeBoldSDK.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegacyShowUseCase getShowBoldSDK() {
        return (LegacyShowUseCase) showBoldSDK.getValue();
    }

    private final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return (GetHeaderBiddingToken) getHeaderBiddingToken.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetAsyncHeaderBiddingToken getGetAsyncHeaderBiddingToken() {
        return (GetAsyncHeaderBiddingToken) getAsyncHeaderBiddingToken.getValue();
    }

    private final GetInitializationState getGetInitializationState() {
        return (GetInitializationState) getInitializationState.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) sendDiagnosticEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OmFinishSession getOmFinishSession() {
        return (OmFinishSession) omFinishSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetAdObject getGetAdObject() {
        return (GetAdObject) getAdObject.getValue();
    }

    private final SetInitializationState getSetInitializationState() {
        return (SetInitializationState) setInitializationState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        return (Context) context.getValue();
    }

    public final void initialize() {
        getSetInitializationState().invoke(InitializationState.INITIALIZING);
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        CoroutineScope coroutineScope = (CoroutineScope) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), QualifierKt.named(ServiceProvider.NAMED_INIT_SCOPE), null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15381(coroutineScope, null), 3, null);
    }

    /* compiled from: UnityAdsSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", i = {}, l = {73, 75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$initialize$1, reason: invalid class name and case insensitive filesystem */
    static final class C15381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $initScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15381(CoroutineScope coroutineScope, Continuation<? super C15381> continuation) {
            super(2, continuation);
            this.$initScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15381(this.$initScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (UnityAdsSDK.INSTANCE.getAlternativeFlowReader().invoke()) {
                    this.label = 1;
                    if (UnityAdsSDK.INSTANCE.getInitializeBoldSDK().invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (UnityAdsSDK.INSTANCE.getInitializeSDK().mo833invokegIAlus(EmptyParams.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            CoroutineScopeKt.cancel$default(this.$initScope, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Job load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    public final Job load(String placementId, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener listener, UnityBannerSize bannerSize) {
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        CoroutineScope coroutineScope = (CoroutineScope) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), QualifierKt.named(ServiceProvider.NAMED_LOAD_SCOPE), null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15391(placementId, loadOptions, listener, bannerSize, coroutineScope, null), 3, null);
    }

    /* compiled from: UnityAdsSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    static final class C15391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ IUnityAdsLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ CoroutineScope $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15391(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, CoroutineScope coroutineScope, Continuation<? super C15391> continuation) {
            super(2, continuation);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15391(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UnityAdsSDK unityAdsSDK = UnityAdsSDK.INSTANCE;
                Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
                StringQualifier stringQualifierNamed = QualifierKt.named("");
                this.label = 1;
                if (((LegacyLoadUseCase) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(LegacyLoadUseCase.class), stringQualifierNamed, null)).invoke(UnityAdsSDK.INSTANCE.getContext(), this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(this.$loadScope, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UnityAdsSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    static final class C15401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ CoroutineScope $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15401(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, CoroutineScope coroutineScope, Continuation<? super C15401> continuation) {
            super(2, continuation);
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15401(this.$placementId, this.$showOptions, this.$listener, this.$showScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (UnityAdsSDK.INSTANCE.getShowBoldSDK().invoke(UnityAdsSDK.INSTANCE.getContext(), this.$placementId, this.$showOptions, this.$listener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(this.$showScope, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public final Job show(String placementId, UnityAdsShowOptions showOptions, Listeners listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        CoroutineScope coroutineScope = (CoroutineScope) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), QualifierKt.named(ServiceProvider.NAMED_SHOW_SCOPE), null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15401(placementId, showOptions, listener, coroutineScope, null), 3, null);
    }

    public final String getToken() {
        return fetchToken(a.g);
    }

    /* compiled from: UnityAdsSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name and case insensitive filesystem */
    static final class C15371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15371(IUnityAdsTokenListener iUnityAdsTokenListener, CoroutineScope coroutineScope, Continuation<? super C15371> continuation) {
            super(2, continuation);
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15371(this.$listener, this.$getTokenScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (UnityAdsSDK.INSTANCE.getGetAsyncHeaderBiddingToken().invoke(this.$listener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScopeKt.cancel$default(this.$getTokenScope, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public final void getToken(IUnityAdsTokenListener listener) {
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        CoroutineScope coroutineScope = (CoroutineScope) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), QualifierKt.named(ServiceProvider.NAMED_GET_TOKEN_SCOPE), null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15371(listener, coroutineScope, null), 3, null);
    }

    private final String fetchToken(String sync) {
        String strRetrieveUnityCrashValue;
        String str;
        String str2;
        String str3;
        long jM2527markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m2527markNowz9LOYto();
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_gateway_token_started", null, MapsKt.mapOf(TuplesKt.to("sync", sync), TuplesKt.to("state", getGetInitializationState().invoke().toString())), null, null, 26, null);
        String strInvoke = null;
        if (getGetInitializationState().invoke() != InitializationState.INITIALIZED) {
            str3 = "not_initialized";
            str2 = null;
        } else {
            try {
                str = null;
                strInvoke = getGetHeaderBiddingToken().invoke();
                strRetrieveUnityCrashValue = null;
            } catch (Exception e) {
                strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(e);
                str = "uncaught_exception";
            }
            String str4 = str;
            str2 = strRetrieveUnityCrashValue;
            str3 = str4;
        }
        SendDiagnosticEvent sendDiagnosticEvent2 = getSendDiagnosticEvent();
        String str5 = strInvoke == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m2528boximpl(jM2527markNowz9LOYto)));
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("sync", sync);
        mapCreateMapBuilder.put("state", INSTANCE.getGetInitializationState().invoke().toString());
        if (str3 != null) {
        }
        if (str2 != null) {
            mapCreateMapBuilder.put("reason_debug", str2);
        }
        Unit unit = Unit.INSTANCE;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str5, dValueOf, MapsKt.build(mapCreateMapBuilder), null, null, 24, null);
        return strInvoke;
    }

    /* compiled from: UnityAdsSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", i = {}, l = {Opcodes.IF_ICMPLE, Opcodes.IF_ACMPEQ}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$opportunityId = str;
            this.$omidScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$opportunityId, this.$omidScope, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r6)
                goto L54
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L41
            L1e:
                kotlin.ResultKt.throwOnFailure(r6)
                com.unity3d.services.UnityAdsSDK r6 = com.unity3d.services.UnityAdsSDK.INSTANCE
                com.unity3d.ads.core.configuration.AlternativeFlowReader r6 = com.unity3d.services.UnityAdsSDK.access$getAlternativeFlowReader(r6)
                boolean r6 = r6.invoke()
                if (r6 == 0) goto L54
                com.unity3d.services.UnityAdsSDK r6 = com.unity3d.services.UnityAdsSDK.INSTANCE
                com.unity3d.ads.core.domain.GetAdObject r6 = com.unity3d.services.UnityAdsSDK.access$getGetAdObject(r6)
                java.lang.String r1 = r5.$opportunityId
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.label = r3
                java.lang.Object r6 = r6.invoke(r1, r4)
                if (r6 != r0) goto L41
                return r0
            L41:
                com.unity3d.ads.core.data.model.AdObject r6 = (com.unity3d.ads.core.data.model.AdObject) r6
                if (r6 == 0) goto L54
                com.unity3d.services.UnityAdsSDK r1 = com.unity3d.services.UnityAdsSDK.INSTANCE
                com.unity3d.ads.core.domain.om.OmFinishSession r1 = com.unity3d.services.UnityAdsSDK.access$getOmFinishSession(r1)
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L54
                return r0
            L54:
                kotlinx.coroutines.CoroutineScope r6 = r5.$omidScope
                r0 = 0
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(r6, r0, r3, r0)
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void finishOMIDSession(String opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        CoroutineScope coroutineScope = (CoroutineScope) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), QualifierKt.named(ServiceProvider.NAMED_OMID_SCOPE), null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(opportunityId, coroutineScope, null), 3, null);
    }
}
