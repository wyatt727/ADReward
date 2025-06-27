package org.koin.ksp.generated;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.webkit.WebViewClientCompat;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.GetAdAssetLoader;
import com.unity3d.ads.adplayer.GetAdAssetLoaderKt;
import com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt;
import com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBoldExperimentHandler;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BoldExperimentHandler;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ClearCache;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonClearCache;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAdRequestPolicy;
import com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.ads.core.domain.GetAndroidAdRequest;
import com.unity3d.ads.core.domain.GetAndroidClientInfo;
import com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetAndroidInitializationRequest;
import com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken;
import com.unity3d.ads.core.domain.GetAndroidOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetAndroidSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetCommonWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.GetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.HandleAndroidGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAndroidTransactionData;
import com.unity3d.ads.core.domain.events.GetCommonTransactionRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayAndroidEventResponse;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.KoinModule;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.domain.task.MetricTask;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import defpackage.ByteStringStoreOuterClass;
import defpackage.UniversalRequestStoreOuterClass;
import defpackage.WebviewConfigurationStore;
import gateway.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;
import org.koin.dsl.ScopeDSL;

/* compiled from: KoinModuleGencom$unity3d$services$core$di.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com_unity3d_services_core_di_KoinModule", "Lorg/koin/core/module/Module;", "getCom_unity3d_services_core_di_KoinModule", "()Lorg/koin/core/module/Module;", "module", "Lcom/unity3d/services/core/di/KoinModule;", "getModule", "(Lcom/unity3d/services/core/di/KoinModule;)Lorg/koin/core/module/Module;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KoinModuleGencom_unity3d_services_core_diKt {
    private static final Module com_unity3d_services_core_di_KoinModule = ModuleDSLKt.module$default(false, new Function1<Module, Unit>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Module module) {
            Intrinsics.checkNotNullParameter(module, "$this$module");
            final KoinModule koinModule = new KoinModule();
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Context.class), null, new Function2<Scope, ParametersHolder, Context>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Context invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.androidContext();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
            module.indexPrimaryType(singleInstanceFactory2);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory2), Reflection.getOrCreateKotlinClass(Context.class));
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.MAIN_DISPATCHER), new Function2<Scope, ParametersHolder, CoroutineDispatcher>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineDispatcher invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.mainDispatcher();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
            module.indexPrimaryType(singleInstanceFactory4);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory3);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory4), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class));
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), new Function2<Scope, ParametersHolder, CoroutineDispatcher>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineDispatcher invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.defaultDispatcher();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory6 = singleInstanceFactory5;
            module.indexPrimaryType(singleInstanceFactory6);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory5);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory6), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class));
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), new Function2<Scope, ParametersHolder, CoroutineDispatcher>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.4
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineDispatcher invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.ioDispatcher();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory8 = singleInstanceFactory7;
            module.indexPrimaryType(singleInstanceFactory8);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory7);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory8), Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class));
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, new Function2<Scope, ParametersHolder, ISDKDispatchers>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.5
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ISDKDispatchers invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.sdkDispatchers();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory10 = singleInstanceFactory9;
            module.indexPrimaryType(singleInstanceFactory10);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory9);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory10), Reflection.getOrCreateKotlinClass(ISDKDispatchers.class));
            SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SDKMetricsSender.class), null, new Function2<Scope, ParametersHolder, SDKMetricsSender>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.6
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final SDKMetricsSender invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.sdkMetrics();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory12 = singleInstanceFactory11;
            module.indexPrimaryType(singleInstanceFactory12);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory11);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory12), Reflection.getOrCreateKotlinClass(SDKMetricsSender.class));
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_INIT_SCOPE), new Function2<Scope, ParametersHolder, CoroutineScope>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.7
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineScope invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.initCoroutineScope((ISDKDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (CoroutineExceptionHandler) factory.get(Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class), new StringQualifier(ServiceProvider.NAMED_SDK), null), (Job) factory.get(Reflection.getOrCreateKotlinClass(Job.class), new StringQualifier(ServiceProvider.NAMED_PUBLIC_JOB), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory), Reflection.getOrCreateKotlinClass(CoroutineScope.class));
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_LOAD_SCOPE), new Function2<Scope, ParametersHolder, CoroutineScope>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.8
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineScope invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.loadCoroutineScope((ISDKDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (CoroutineExceptionHandler) factory.get(Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class), new StringQualifier(ServiceProvider.NAMED_SDK), null), (Job) factory.get(Reflection.getOrCreateKotlinClass(Job.class), new StringQualifier(ServiceProvider.NAMED_PUBLIC_JOB), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory2);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory2), Reflection.getOrCreateKotlinClass(CoroutineScope.class));
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_SHOW_SCOPE), new Function2<Scope, ParametersHolder, CoroutineScope>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.9
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineScope invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.showCoroutineScope((ISDKDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (CoroutineExceptionHandler) factory.get(Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class), new StringQualifier(ServiceProvider.NAMED_SDK), null), (Job) factory.get(Reflection.getOrCreateKotlinClass(Job.class), new StringQualifier(ServiceProvider.NAMED_PUBLIC_JOB), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory3);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory3), Reflection.getOrCreateKotlinClass(CoroutineScope.class));
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_TRANSACTION_SCOPE), new Function2<Scope, ParametersHolder, CoroutineScope>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.10
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineScope invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.transactionCoroutineScope((ISDKDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (CoroutineExceptionHandler) factory.get(Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class), new StringQualifier(ServiceProvider.NAMED_SDK), null), (Job) factory.get(Reflection.getOrCreateKotlinClass(Job.class), new StringQualifier(ServiceProvider.NAMED_PUBLIC_JOB), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory4);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory4), Reflection.getOrCreateKotlinClass(CoroutineScope.class));
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_GET_TOKEN_SCOPE), new Function2<Scope, ParametersHolder, CoroutineScope>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.11
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final CoroutineScope invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.getTokenCoroutineScope((ISDKDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (CoroutineExceptionHandler) factory.get(Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class), new StringQualifier(ServiceProvider.NAMED_SDK), null), (Job) factory.get(Reflection.getOrCreateKotlinClass(Job.class), new StringQualifier(ServiceProvider.NAMED_PUBLIC_JOB), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory5);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory5), Reflection.getOrCreateKotlinClass(CoroutineScope.class));
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Job.class), new StringQualifier(ServiceProvider.NAMED_PUBLIC_JOB), new Function2<Scope, ParametersHolder, Job>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.12
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Job invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.publicApiJob((DiagnosticEventRepository) factory.get(Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory6);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory6), Reflection.getOrCreateKotlinClass(Job.class));
            SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier("unityads-installinfo"), new Function2<Scope, ParametersHolder, DataMigration<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.13
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.idfiDataMigration((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory14 = singleInstanceFactory13;
            module.indexPrimaryType(singleInstanceFactory14);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory13);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory14), Reflection.getOrCreateKotlinClass(DataMigration.class));
            SingleInstanceFactory<?> singleInstanceFactory15 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier("supersonic_shared_preferen"), new Function2<Scope, ParametersHolder, DataMigration<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.14
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.auidDataMigration((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory16 = singleInstanceFactory15;
            module.indexPrimaryType(singleInstanceFactory16);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory15);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory16), Reflection.getOrCreateKotlinClass(DataMigration.class));
            SingleInstanceFactory<?> singleInstanceFactory17 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier(ServiceProvider.PREF_DEFAULT), new Function2<Scope, ParametersHolder, DataMigration<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.15
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.defaultByteStringMigration();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory18 = singleInstanceFactory17;
            module.indexPrimaryType(singleInstanceFactory18);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory17);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory18), Reflection.getOrCreateKotlinClass(DataMigration.class));
            SingleInstanceFactory<?> singleInstanceFactory19 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_GATEWAY_CACHE), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.16
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.gatewayDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory20 = singleInstanceFactory19;
            module.indexPrimaryType(singleInstanceFactory20);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory19);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory20), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory21 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.17
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.privacyDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory22 = singleInstanceFactory21;
            module.indexPrimaryType(singleInstanceFactory22);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory21);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory22), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory23 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.18
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.privacyDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory24 = singleInstanceFactory23;
            module.indexPrimaryType(singleInstanceFactory24);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory23);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory24), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory25 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY_FSM), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.19
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.privacyFsmDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory26 = singleInstanceFactory25;
            module.indexPrimaryType(singleInstanceFactory26);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory25);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory26), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory27 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY_FSM), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.20
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.privacyFsmDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY_FSM), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory28 = singleInstanceFactory27;
            module.indexPrimaryType(singleInstanceFactory28);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory27);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory28), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory29 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_NATIVE_CONFIG), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.21
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.nativeConfigurationDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory30 = singleInstanceFactory29;
            module.indexPrimaryType(singleInstanceFactory30);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory29);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory30), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory31 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_NATIVE_CONFIG), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.22
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.nativeConfigurationDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_NATIVE_CONFIG), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory32 = singleInstanceFactory31;
            module.indexPrimaryType(singleInstanceFactory32);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory31);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory32), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory33 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_IDFI), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.23
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.idfiDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null), (DataMigration) single.get(Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier("unityads-installinfo"), null), (DataMigration) single.get(Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier(ServiceProvider.PREF_DEFAULT), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory34 = singleInstanceFactory33;
            module.indexPrimaryType(singleInstanceFactory34);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory33);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory34), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory35 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_IDFI), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.24
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.idfiDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_IDFI), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory36 = singleInstanceFactory35;
            module.indexPrimaryType(singleInstanceFactory36);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory35);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory36), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory37 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_AUID), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.25
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.auidDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null), (DataMigration) single.get(Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier("supersonic_shared_preferen"), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory38 = singleInstanceFactory37;
            module.indexPrimaryType(singleInstanceFactory38);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory37);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory38), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory39 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_AUID), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.26
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.auidDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_AUID), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory40 = singleInstanceFactory39;
            module.indexPrimaryType(singleInstanceFactory40);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory39);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory40), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory41 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_GL_INFO), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.27
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.glInfoDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null), (DataMigration) single.get(Reflection.getOrCreateKotlinClass(DataMigration.class), new StringQualifier(ServiceProvider.PREF_GL_INFO), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory42 = singleInstanceFactory41;
            module.indexPrimaryType(singleInstanceFactory42);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory41);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory42), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory43 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_GL_INFO), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.28
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.glInfoDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_GL_INFO), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory44 = singleInstanceFactory43;
            module.indexPrimaryType(singleInstanceFactory44);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory43);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory44), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory45 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST), new Function2<Scope, ParametersHolder, DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.29
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.universalRequestDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory46 = singleInstanceFactory45;
            module.indexPrimaryType(singleInstanceFactory46);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory45);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory46), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory47 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_IAP_TRANSACTION), new Function2<Scope, ParametersHolder, DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.30
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.iapTransactionDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory48 = singleInstanceFactory47;
            module.indexPrimaryType(singleInstanceFactory48);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory47);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory48), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory49 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_IAP_TRANSACTION), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.31
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.iapTransactionDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_IAP_TRANSACTION), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory50 = singleInstanceFactory49;
            module.indexPrimaryType(singleInstanceFactory50);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory49);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory50), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory51 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG), new Function2<Scope, ParametersHolder, DataStore<WebviewConfigurationStore.WebViewConfigurationStore>>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.32
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.webViewConfigurationDataStore((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory52 = singleInstanceFactory51;
            module.indexPrimaryType(singleInstanceFactory52);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory51);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory52), Reflection.getOrCreateKotlinClass(DataStore.class));
            SingleInstanceFactory<?> singleInstanceFactory53 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AsyncTokenStorage.class), null, new Function2<Scope, ParametersHolder, AsyncTokenStorage>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.33
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final AsyncTokenStorage invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.asyncTokenStorage((InMemoryTokenStorage) single.get(Reflection.getOrCreateKotlinClass(InMemoryTokenStorage.class), null, null), (SDKMetricsSender) single.get(Reflection.getOrCreateKotlinClass(SDKMetricsSender.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory54 = singleInstanceFactory53;
            module.indexPrimaryType(singleInstanceFactory54);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory53);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory54), Reflection.getOrCreateKotlinClass(AsyncTokenStorage.class));
            SingleInstanceFactory<?> singleInstanceFactory55 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VolumeChangeMonitor.class), null, new Function2<Scope, ParametersHolder, VolumeChangeMonitor>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.34
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final VolumeChangeMonitor invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.volumeChangeMonitor((VolumeChange) single.get(Reflection.getOrCreateKotlinClass(VolumeChange.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory56 = singleInstanceFactory55;
            module.indexPrimaryType(singleInstanceFactory56);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory55);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory56), Reflection.getOrCreateKotlinClass(VolumeChangeMonitor.class));
            SingleInstanceFactory<?> singleInstanceFactory57 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JsonStorage.class), new StringQualifier("PUBLIC"), new Function2<Scope, ParametersHolder, JsonStorage>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.35
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final JsonStorage invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.publicJsonStorage();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory58 = singleInstanceFactory57;
            module.indexPrimaryType(singleInstanceFactory58);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory57);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory58), Reflection.getOrCreateKotlinClass(JsonStorage.class));
            SingleInstanceFactory<?> singleInstanceFactory59 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JsonStorage.class), new StringQualifier("PRIVATE"), new Function2<Scope, ParametersHolder, JsonStorage>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.36
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final JsonStorage invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.privateJsonStorage();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory60 = singleInstanceFactory59;
            module.indexPrimaryType(singleInstanceFactory60);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory59);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory60), Reflection.getOrCreateKotlinClass(JsonStorage.class));
            SingleInstanceFactory<?> singleInstanceFactory61 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class), null, new Function2<Scope, ParametersHolder, NativeConfigurationOuterClass.NativeConfiguration>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.37
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final NativeConfigurationOuterClass.NativeConfiguration invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.defaultNativeConfiguration();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory62 = singleInstanceFactory61;
            module.indexPrimaryType(singleInstanceFactory62);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory61);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory62), Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class));
            SingleInstanceFactory<?> singleInstanceFactory63 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_GATEWAY_CACHE), new Function2<Scope, ParametersHolder, ByteStringDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.38
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final ByteStringDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.gatewayCacheDataStore((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_GATEWAY_CACHE), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory64 = singleInstanceFactory63;
            module.indexPrimaryType(singleInstanceFactory64);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory63);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory64), Reflection.getOrCreateKotlinClass(ByteStringDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory65 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MeasurementsService.class), null, new Function2<Scope, ParametersHolder, MeasurementsService>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.39
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final MeasurementsService invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.measurementService((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory66 = singleInstanceFactory65;
            module.indexPrimaryType(singleInstanceFactory66);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory65);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory66), Reflection.getOrCreateKotlinClass(MeasurementsService.class));
            SingleInstanceFactory<?> singleInstanceFactory67 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TopicsService.class), null, new Function2<Scope, ParametersHolder, TopicsService>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.40
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final TopicsService invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.topicsService((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory68 = singleInstanceFactory67;
            module.indexPrimaryType(singleInstanceFactory68);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory67);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory68), Reflection.getOrCreateKotlinClass(TopicsService.class));
            SingleInstanceFactory<?> singleInstanceFactory69 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HttpClient.class), null, new Function2<Scope, ParametersHolder, HttpClient>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.41
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final HttpClient invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return koinModule.provideHttpClient((ConfigFileFromLocalStorage) single.get(Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class), null, null), (AlternativeFlowReader) single.get(Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class), null, null), (ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory70 = singleInstanceFactory69;
            module.indexPrimaryType(singleInstanceFactory70);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory69);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory70), Reflection.getOrCreateKotlinClass(HttpClient.class));
            SingleInstanceFactory<?> singleInstanceFactory71 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class), null, new Function2<Scope, ParametersHolder, AlternativeFlowReader>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.42
                @Override // kotlin.jvm.functions.Function2
                public final AlternativeFlowReader invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AlternativeFlowReader((ConfigurationReader) single.get(Reflection.getOrCreateKotlinClass(ConfigurationReader.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory72 = singleInstanceFactory71;
            module.indexPrimaryType(singleInstanceFactory72);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory71);
            }
            new KoinDefinition(module, singleInstanceFactory72);
            SingleInstanceFactory<?> singleInstanceFactory73 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GameServerIdReader.class), null, new Function2<Scope, ParametersHolder, GameServerIdReader>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.43
                @Override // kotlin.jvm.functions.Function2
                public final GameServerIdReader invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GameServerIdReader((JsonStorage) single.get(Reflection.getOrCreateKotlinClass(JsonStorage.class), new StringQualifier("PUBLIC"), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory74 = singleInstanceFactory73;
            module.indexPrimaryType(singleInstanceFactory74);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory73);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory74), Reflection.getOrCreateKotlinClass(MetadataReader.class));
            SingleInstanceFactory<?> singleInstanceFactory75 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidAnalyticsDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidAnalyticsDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.44
                @Override // kotlin.jvm.functions.Function2
                public final AndroidAnalyticsDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidAnalyticsDataSource();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory76 = singleInstanceFactory75;
            module.indexPrimaryType(singleInstanceFactory76);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory75);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory76), Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory77 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidDeveloperConsentDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidDeveloperConsentDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.45
                @Override // kotlin.jvm.functions.Function2
                public final AndroidDeveloperConsentDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) single.get(Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class), new StringQualifier(ServiceProvider.DEV_CONSENT_PRIVACY_RULES), null), (JsonStorage) single.get(Reflection.getOrCreateKotlinClass(JsonStorage.class), new StringQualifier("PUBLIC"), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory78 = singleInstanceFactory77;
            module.indexPrimaryType(singleInstanceFactory78);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory77);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory78), Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory79 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidDynamicDeviceInfoDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidDynamicDeviceInfoDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.46
                @Override // kotlin.jvm.functions.Function2
                public final AndroidDynamicDeviceInfoDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidDynamicDeviceInfoDataSource((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (LifecycleDataSource) single.get(Reflection.getOrCreateKotlinClass(LifecycleDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory80 = singleInstanceFactory79;
            module.indexPrimaryType(singleInstanceFactory80);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory79);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory80), Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory81 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidLegacyUserConsentDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidLegacyUserConsentDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.47
                @Override // kotlin.jvm.functions.Function2
                public final AndroidLegacyUserConsentDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) single.get(Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class), new StringQualifier(ServiceProvider.LEGACY_PRIVACY_RULES), null), (JsonStorage) single.get(Reflection.getOrCreateKotlinClass(JsonStorage.class), new StringQualifier("PRIVATE"), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory82 = singleInstanceFactory81;
            module.indexPrimaryType(singleInstanceFactory82);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory81);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory82), Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory83 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidLifecycleDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidLifecycleDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.48
                @Override // kotlin.jvm.functions.Function2
                public final AndroidLifecycleDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidLifecycleDataSource();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory84 = singleInstanceFactory83;
            module.indexPrimaryType(singleInstanceFactory84);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory83);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module, singleInstanceFactory84), new KClass[]{Reflection.getOrCreateKotlinClass(LifecycleDataSource.class), Reflection.getOrCreateKotlinClass(LifecycleEventObserver.class)});
            SingleInstanceFactory<?> singleInstanceFactory85 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidLocalCacheDataSource.class), new StringQualifier("local"), new Function2<Scope, ParametersHolder, AndroidLocalCacheDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.49
                @Override // kotlin.jvm.functions.Function2
                public final AndroidLocalCacheDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidLocalCacheDataSource();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory86 = singleInstanceFactory85;
            module.indexPrimaryType(singleInstanceFactory86);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory85);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory86), Reflection.getOrCreateKotlinClass(CacheDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory87 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidMediationDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidMediationDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.50
                @Override // kotlin.jvm.functions.Function2
                public final AndroidMediationDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidMediationDataSource((JsonStorage) single.get(Reflection.getOrCreateKotlinClass(JsonStorage.class), new StringQualifier("PUBLIC"), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory88 = singleInstanceFactory87;
            module.indexPrimaryType(singleInstanceFactory88);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory87);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory88), Reflection.getOrCreateKotlinClass(MediationDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory89 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidPrivacyDeviceInfoDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidPrivacyDeviceInfoDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.51
                @Override // kotlin.jvm.functions.Function2
                public final AndroidPrivacyDeviceInfoDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidPrivacyDeviceInfoDataSource((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory90 = singleInstanceFactory89;
            module.indexPrimaryType(singleInstanceFactory90);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory89);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory90), Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory91 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidRemoteCacheDataSource.class), new StringQualifier(ServiceProvider.NAMED_REMOTE), new Function2<Scope, ParametersHolder, AndroidRemoteCacheDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.52
                @Override // kotlin.jvm.functions.Function2
                public final AndroidRemoteCacheDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidRemoteCacheDataSource((HttpClient) single.get(Reflection.getOrCreateKotlinClass(HttpClient.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory92 = singleInstanceFactory91;
            module.indexPrimaryType(singleInstanceFactory92);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory91);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory92), Reflection.getOrCreateKotlinClass(CacheDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory93 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidStaticDeviceInfoDataSource.class), null, new Function2<Scope, ParametersHolder, AndroidStaticDeviceInfoDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.53
                @Override // kotlin.jvm.functions.Function2
                public final AndroidStaticDeviceInfoDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidStaticDeviceInfoDataSource((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_IDFI), null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_AUID), null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_GL_INFO), null), (AnalyticsDataSource) single.get(Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory94 = singleInstanceFactory93;
            module.indexPrimaryType(singleInstanceFactory94);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory93);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory94), Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactory95 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchGLInfoDataMigration.class), new StringQualifier(ServiceProvider.PREF_GL_INFO), new Function2<Scope, ParametersHolder, FetchGLInfoDataMigration>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.54
                @Override // kotlin.jvm.functions.Function2
                public final FetchGLInfoDataMigration invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) single.get(Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory96 = singleInstanceFactory95;
            module.indexPrimaryType(singleInstanceFactory96);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory95);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory96), Reflection.getOrCreateKotlinClass(DataMigration.class));
            SingleInstanceFactory<?> singleInstanceFactory97 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class), null, new Function2<Scope, ParametersHolder, UniversalRequestDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.55
                @Override // kotlin.jvm.functions.Function2
                public final UniversalRequestDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new UniversalRequestDataSource((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory98 = singleInstanceFactory97;
            module.indexPrimaryType(singleInstanceFactory98);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory97);
            }
            new KoinDefinition(module, singleInstanceFactory98);
            SingleInstanceFactory<?> singleInstanceFactory99 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class), null, new Function2<Scope, ParametersHolder, WebviewConfigurationDataSource>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.56
                @Override // kotlin.jvm.functions.Function2
                public final WebviewConfigurationDataSource invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new WebviewConfigurationDataSource((DataStore) single.get(Reflection.getOrCreateKotlinClass(DataStore.class), new StringQualifier(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory100 = singleInstanceFactory99;
            module.indexPrimaryType(singleInstanceFactory100);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory99);
            }
            new KoinDefinition(module, singleInstanceFactory100);
            SingleInstanceFactory<?> singleInstanceFactory101 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidOmidManager.class), null, new Function2<Scope, ParametersHolder, AndroidOmidManager>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.57
                @Override // kotlin.jvm.functions.Function2
                public final AndroidOmidManager invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidOmidManager();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory102 = singleInstanceFactory101;
            module.indexPrimaryType(singleInstanceFactory102);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory101);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory102), Reflection.getOrCreateKotlinClass(OmidManager.class));
            SingleInstanceFactory<?> singleInstanceFactory103 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidSDKPropertiesManager.class), null, new Function2<Scope, ParametersHolder, AndroidSDKPropertiesManager>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.58
                @Override // kotlin.jvm.functions.Function2
                public final AndroidSDKPropertiesManager invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidSDKPropertiesManager();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory104 = singleInstanceFactory103;
            module.indexPrimaryType(singleInstanceFactory104);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory103);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory104), Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class));
            SingleInstanceFactory<?> singleInstanceFactory105 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidStorageManager.class), null, new Function2<Scope, ParametersHolder, AndroidStorageManager>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.59
                @Override // kotlin.jvm.functions.Function2
                public final AndroidStorageManager invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidStorageManager();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory106 = singleInstanceFactory105;
            module.indexPrimaryType(singleInstanceFactory106);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory105);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory106), Reflection.getOrCreateKotlinClass(StorageManager.class));
            SingleInstanceFactory<?> singleInstanceFactory107 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TransactionEventManager.class), null, new Function2<Scope, ParametersHolder, TransactionEventManager>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.60
                @Override // kotlin.jvm.functions.Function2
                public final TransactionEventManager invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new TransactionEventManager((CoroutineScope) single.get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_TRANSACTION_SCOPE), null), (StoreMonitor) single.get(Reflection.getOrCreateKotlinClass(StoreMonitor.class), null, null), (GetTransactionData) single.get(Reflection.getOrCreateKotlinClass(GetTransactionData.class), null, null), (GetTransactionRequest) single.get(Reflection.getOrCreateKotlinClass(GetTransactionRequest.class), null, null), (TransactionEventRepository) single.get(Reflection.getOrCreateKotlinClass(TransactionEventRepository.class), null, null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_IAP_TRANSACTION), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory108 = singleInstanceFactory107;
            module.indexPrimaryType(singleInstanceFactory108);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory107);
            }
            new KoinDefinition(module, singleInstanceFactory108);
            SingleInstanceFactory<?> singleInstanceFactory109 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidAdRepository.class), null, new Function2<Scope, ParametersHolder, AndroidAdRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.61
                @Override // kotlin.jvm.functions.Function2
                public final AndroidAdRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidAdRepository();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory110 = singleInstanceFactory109;
            module.indexPrimaryType(singleInstanceFactory110);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory109);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory110), Reflection.getOrCreateKotlinClass(AdRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory111 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidCacheRepository.class), null, new Function2<Scope, ParametersHolder, AndroidCacheRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.62
                @Override // kotlin.jvm.functions.Function2
                public final AndroidCacheRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidCacheRepository((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null), (CacheDataSource) single.get(Reflection.getOrCreateKotlinClass(CacheDataSource.class), new StringQualifier("local"), null), (CacheDataSource) single.get(Reflection.getOrCreateKotlinClass(CacheDataSource.class), new StringQualifier(ServiceProvider.NAMED_REMOTE), null), (Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory112 = singleInstanceFactory111;
            module.indexPrimaryType(singleInstanceFactory112);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory111);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory112), Reflection.getOrCreateKotlinClass(CacheRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory113 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidCampaignRepository.class), null, new Function2<Scope, ParametersHolder, AndroidCampaignRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.63
                @Override // kotlin.jvm.functions.Function2
                public final AndroidCampaignRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidCampaignRepository((GetSharedDataTimestamps) single.get(Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory114 = singleInstanceFactory113;
            module.indexPrimaryType(singleInstanceFactory114);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory113);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory114), Reflection.getOrCreateKotlinClass(CampaignRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory115 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidDeveloperConsentRepository.class), null, new Function2<Scope, ParametersHolder, AndroidDeveloperConsentRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.64
                @Override // kotlin.jvm.functions.Function2
                public final AndroidDeveloperConsentRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) single.get(Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory116 = singleInstanceFactory115;
            module.indexPrimaryType(singleInstanceFactory116);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory115);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory116), Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory117 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidDeviceInfoRepository.class), null, new Function2<Scope, ParametersHolder, AndroidDeviceInfoRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.65
                @Override // kotlin.jvm.functions.Function2
                public final AndroidDeviceInfoRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) single.get(Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class), null, null), (DynamicDeviceInfoDataSource) single.get(Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class), null, null), (PrivacyDeviceInfoDataSource) single.get(Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory118 = singleInstanceFactory117;
            module.indexPrimaryType(singleInstanceFactory118);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory117);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory118), Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory119 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidDiagnosticEventRepository.class), null, new Function2<Scope, ParametersHolder, AndroidDiagnosticEventRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.66
                @Override // kotlin.jvm.functions.Function2
                public final AndroidDiagnosticEventRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidDiagnosticEventRepository();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory120 = singleInstanceFactory119;
            module.indexPrimaryType(singleInstanceFactory120);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory119);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory120), Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory121 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidLegacyUserConsentRepository.class), null, new Function2<Scope, ParametersHolder, AndroidLegacyUserConsentRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.67
                @Override // kotlin.jvm.functions.Function2
                public final AndroidLegacyUserConsentRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) single.get(Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory122 = singleInstanceFactory121;
            module.indexPrimaryType(singleInstanceFactory122);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory121);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory122), Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory123 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidMediationRepository.class), null, new Function2<Scope, ParametersHolder, AndroidMediationRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.68
                @Override // kotlin.jvm.functions.Function2
                public final AndroidMediationRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidMediationRepository((MediationDataSource) single.get(Reflection.getOrCreateKotlinClass(MediationDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory124 = singleInstanceFactory123;
            module.indexPrimaryType(singleInstanceFactory124);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory123);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory124), Reflection.getOrCreateKotlinClass(MediationRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory125 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidOpenMeasurementRepository.class), null, new Function2<Scope, ParametersHolder, AndroidOpenMeasurementRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.69
                @Override // kotlin.jvm.functions.Function2
                public final AndroidOpenMeasurementRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidOpenMeasurementRepository((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.MAIN_DISPATCHER), null), (OmidManager) single.get(Reflection.getOrCreateKotlinClass(OmidManager.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory126 = singleInstanceFactory125;
            module.indexPrimaryType(singleInstanceFactory126);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory125);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory126), Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory127 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidSessionRepository.class), null, new Function2<Scope, ParametersHolder, AndroidSessionRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.70
                @Override // kotlin.jvm.functions.Function2
                public final AndroidSessionRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidSessionRepository((ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_GATEWAY_CACHE), null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY), null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_PRIVACY_FSM), null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_NATIVE_CONFIG), null), (NativeConfigurationOuterClass.NativeConfiguration) single.get(Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory128 = singleInstanceFactory127;
            module.indexPrimaryType(singleInstanceFactory128);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory127);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory128), Reflection.getOrCreateKotlinClass(SessionRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory129 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidTransactionEventRepository.class), null, new Function2<Scope, ParametersHolder, AndroidTransactionEventRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.71
                @Override // kotlin.jvm.functions.Function2
                public final AndroidTransactionEventRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidTransactionEventRepository();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory130 = singleInstanceFactory129;
            module.indexPrimaryType(singleInstanceFactory130);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory129);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory130), Reflection.getOrCreateKotlinClass(TransactionEventRepository.class));
            SingleInstanceFactory<?> singleInstanceFactory131 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(OperativeEventRepository.class), null, new Function2<Scope, ParametersHolder, OperativeEventRepository>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.72
                @Override // kotlin.jvm.functions.Function2
                public final OperativeEventRepository invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new OperativeEventRepository();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory132 = singleInstanceFactory131;
            module.indexPrimaryType(singleInstanceFactory132);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory131);
            }
            new KoinDefinition(module, singleInstanceFactory132);
            SingleInstanceFactory<?> singleInstanceFactory133 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidBoldExperimentHandler.class), null, new Function2<Scope, ParametersHolder, AndroidBoldExperimentHandler>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.73
                @Override // kotlin.jvm.functions.Function2
                public final AndroidBoldExperimentHandler invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidBoldExperimentHandler((ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_GATEWAY_CACHE), null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory134 = singleInstanceFactory133;
            module.indexPrimaryType(singleInstanceFactory134);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory133);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory134), Reflection.getOrCreateKotlinClass(BoldExperimentHandler.class));
            SingleInstanceFactory<?> singleInstanceFactory135 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidExecuteAdViewerRequest.class), null, new Function2<Scope, ParametersHolder, AndroidExecuteAdViewerRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.74
                @Override // kotlin.jvm.functions.Function2
                public final AndroidExecuteAdViewerRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null), (HttpClient) single.get(Reflection.getOrCreateKotlinClass(HttpClient.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory136 = singleInstanceFactory135;
            module.indexPrimaryType(singleInstanceFactory136);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory135);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory136), Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory137 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidGenerateByteStringId.class), null, new Function2<Scope, ParametersHolder, AndroidGenerateByteStringId>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.75
                @Override // kotlin.jvm.functions.Function2
                public final AndroidGenerateByteStringId invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidGenerateByteStringId();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory138 = singleInstanceFactory137;
            module.indexPrimaryType(singleInstanceFactory138);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory137);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory138), Reflection.getOrCreateKotlinClass(GetByteStringId.class));
            SingleInstanceFactory<?> singleInstanceFactory139 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidHandleOpenUrl.class), null, new Function2<Scope, ParametersHolder, AndroidHandleOpenUrl>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.76
                @Override // kotlin.jvm.functions.Function2
                public final AndroidHandleOpenUrl invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidHandleOpenUrl((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory140 = singleInstanceFactory139;
            module.indexPrimaryType(singleInstanceFactory140);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory139);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory140), Reflection.getOrCreateKotlinClass(HandleOpenUrl.class));
            SingleInstanceFactory<?> singleInstanceFactory141 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidRefresh.class), null, new Function2<Scope, ParametersHolder, AndroidRefresh>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.77
                @Override // kotlin.jvm.functions.Function2
                public final AndroidRefresh invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidRefresh((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (GetAdDataRefreshRequest) single.get(Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class), null, null), (GetRequestPolicy) single.get(Reflection.getOrCreateKotlinClass(GetRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_AD_REQ), null), (GatewayClient) single.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory142 = singleInstanceFactory141;
            module.indexPrimaryType(singleInstanceFactory142);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory141);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory142), Reflection.getOrCreateKotlinClass(Refresh.class));
            SingleInstanceFactory<?> singleInstanceFactory143 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidSendDiagnosticEvent.class), null, new Function2<Scope, ParametersHolder, AndroidSendDiagnosticEvent>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.78
                @Override // kotlin.jvm.functions.Function2
                public final AndroidSendDiagnosticEvent invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) single.get(Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class), null, null), (GetDiagnosticEventRequest) single.get(Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory144 = singleInstanceFactory143;
            module.indexPrimaryType(singleInstanceFactory144);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory143);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory144), Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            SingleInstanceFactory<?> singleInstanceFactory145 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidSendWebViewClientErrorDiagnostics.class), null, new Function2<Scope, ParametersHolder, AndroidSendWebViewClientErrorDiagnostics>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.79
                @Override // kotlin.jvm.functions.Function2
                public final AndroidSendWebViewClientErrorDiagnostics invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory146 = singleInstanceFactory145;
            module.indexPrimaryType(singleInstanceFactory146);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory145);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory146), Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class));
            SingleInstanceFactory<?> singleInstanceFactory147 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidShow.class), null, new Function2<Scope, ParametersHolder, AndroidShow>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.80
                @Override // kotlin.jvm.functions.Function2
                public final AndroidShow invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidShow((AdRepository) single.get(Reflection.getOrCreateKotlinClass(AdRepository.class), null, null), (GameServerIdReader) single.get(Reflection.getOrCreateKotlinClass(GameServerIdReader.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory148 = singleInstanceFactory147;
            module.indexPrimaryType(singleInstanceFactory148);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory147);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory148), Reflection.getOrCreateKotlinClass(Show.class));
            SingleInstanceFactory<?> singleInstanceFactory149 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonCacheFile.class), null, new Function2<Scope, ParametersHolder, CommonCacheFile>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.81
                @Override // kotlin.jvm.functions.Function2
                public final CommonCacheFile invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonCacheFile((CacheRepository) single.get(Reflection.getOrCreateKotlinClass(CacheRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory150 = singleInstanceFactory149;
            module.indexPrimaryType(singleInstanceFactory150);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory149);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory150), Reflection.getOrCreateKotlinClass(CacheFile.class));
            SingleInstanceFactory<?> singleInstanceFactory151 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonClearCache.class), null, new Function2<Scope, ParametersHolder, CommonClearCache>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.82
                @Override // kotlin.jvm.functions.Function2
                public final CommonClearCache invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonClearCache((CacheRepository) single.get(Reflection.getOrCreateKotlinClass(CacheRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory152 = singleInstanceFactory151;
            module.indexPrimaryType(singleInstanceFactory152);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory151);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory152), Reflection.getOrCreateKotlinClass(ClearCache.class));
            SingleInstanceFactory<?> singleInstanceFactory153 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonGetAdObject.class), null, new Function2<Scope, ParametersHolder, CommonGetAdObject>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.83
                @Override // kotlin.jvm.functions.Function2
                public final CommonGetAdObject invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonGetAdObject((AdRepository) single.get(Reflection.getOrCreateKotlinClass(AdRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory154 = singleInstanceFactory153;
            module.indexPrimaryType(singleInstanceFactory154);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory153);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory154), Reflection.getOrCreateKotlinClass(GetAdObject.class));
            SingleInstanceFactory<?> singleInstanceFactory155 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonGetHeaderBiddingToken.class), null, new Function2<Scope, ParametersHolder, CommonGetHeaderBiddingToken>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.84
                @Override // kotlin.jvm.functions.Function2
                public final CommonGetHeaderBiddingToken invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonGetHeaderBiddingToken((GetByteStringId) single.get(Reflection.getOrCreateKotlinClass(GetByteStringId.class), null, null), (GetClientInfo) single.get(Reflection.getOrCreateKotlinClass(GetClientInfo.class), null, null), (GetSharedDataTimestamps) single.get(Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (CampaignRepository) single.get(Reflection.getOrCreateKotlinClass(CampaignRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory156 = singleInstanceFactory155;
            module.indexPrimaryType(singleInstanceFactory156);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory155);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory156), Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class));
            SingleInstanceFactory<?> singleInstanceFactory157 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonGetInitializationState.class), null, new Function2<Scope, ParametersHolder, CommonGetInitializationState>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.85
                @Override // kotlin.jvm.functions.Function2
                public final CommonGetInitializationState invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonGetInitializationState((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory158 = singleInstanceFactory157;
            module.indexPrimaryType(singleInstanceFactory158);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory157);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory158), Reflection.getOrCreateKotlinClass(GetInitializationState.class));
            SingleInstanceFactory<?> singleInstanceFactory159 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonGetIsFileCache.class), null, new Function2<Scope, ParametersHolder, CommonGetIsFileCache>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.86
                @Override // kotlin.jvm.functions.Function2
                public final CommonGetIsFileCache invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonGetIsFileCache((CacheRepository) single.get(Reflection.getOrCreateKotlinClass(CacheRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory160 = singleInstanceFactory159;
            module.indexPrimaryType(singleInstanceFactory160);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory159);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory160), Reflection.getOrCreateKotlinClass(GetIsFileCache.class));
            SingleInstanceFactory<?> singleInstanceFactory161 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonSetInitializationState.class), null, new Function2<Scope, ParametersHolder, CommonSetInitializationState>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.87
                @Override // kotlin.jvm.functions.Function2
                public final CommonSetInitializationState invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonSetInitializationState((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory162 = singleInstanceFactory161;
            module.indexPrimaryType(singleInstanceFactory162);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory161);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory162), Reflection.getOrCreateKotlinClass(SetInitializationState.class));
            SingleInstanceFactory<?> singleInstanceFactory163 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAdRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_AD_REQ), new Function2<Scope, ParametersHolder, GetAdRequestPolicy>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.88
                @Override // kotlin.jvm.functions.Function2
                public final GetAdRequestPolicy invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAdRequestPolicy((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory164 = singleInstanceFactory163;
            module.indexPrimaryType(singleInstanceFactory164);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory163);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory164), Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            SingleInstanceFactory<?> singleInstanceFactory165 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidAdDataRefreshRequest.class), null, new Function2<Scope, ParametersHolder, GetAndroidAdDataRefreshRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.89
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidAdDataRefreshRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidAdDataRefreshRequest((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (CampaignRepository) single.get(Reflection.getOrCreateKotlinClass(CampaignRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory166 = singleInstanceFactory165;
            module.indexPrimaryType(singleInstanceFactory166);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory165);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory166), Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory167 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidAdPlayerConfigRequest.class), null, new Function2<Scope, ParametersHolder, GetAndroidAdPlayerConfigRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.90
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidAdPlayerConfigRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidAdPlayerConfigRequest((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory168 = singleInstanceFactory167;
            module.indexPrimaryType(singleInstanceFactory168);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory167);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory168), Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory169 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidAdPlayerContext.class), null, new Function2<Scope, ParametersHolder, GetAndroidAdPlayerContext>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.91
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidAdPlayerContext invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidAdPlayerContext((DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory170 = singleInstanceFactory169;
            module.indexPrimaryType(singleInstanceFactory170);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory169);
            }
            new KoinDefinition(module, singleInstanceFactory170);
            SingleInstanceFactory<?> singleInstanceFactory171 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidAdRequest.class), null, new Function2<Scope, ParametersHolder, GetAndroidAdRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.92
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidAdRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidAdRequest((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (CampaignRepository) single.get(Reflection.getOrCreateKotlinClass(CampaignRepository.class), null, null), (WebviewConfigurationDataSource) single.get(Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory172 = singleInstanceFactory171;
            module.indexPrimaryType(singleInstanceFactory172);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory171);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory172), Reflection.getOrCreateKotlinClass(GetAdRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory173 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidClientInfo.class), null, new Function2<Scope, ParametersHolder, GetAndroidClientInfo>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.93
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidClientInfo invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidClientInfo((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (MediationRepository) single.get(Reflection.getOrCreateKotlinClass(MediationRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory174 = singleInstanceFactory173;
            module.indexPrimaryType(singleInstanceFactory174);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory173);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory174), Reflection.getOrCreateKotlinClass(GetClientInfo.class));
            SingleInstanceFactory<?> singleInstanceFactory175 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidInitializationCompletedRequest.class), null, new Function2<Scope, ParametersHolder, GetAndroidInitializationCompletedRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.94
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidInitializationCompletedRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidInitializationCompletedRequest((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory176 = singleInstanceFactory175;
            module.indexPrimaryType(singleInstanceFactory176);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory175);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory176), Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory177 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidInitializationRequest.class), null, new Function2<Scope, ParametersHolder, GetAndroidInitializationRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.95
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidInitializationRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidInitializationRequest((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (GetClientInfo) single.get(Reflection.getOrCreateKotlinClass(GetClientInfo.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (LegacyUserConsentRepository) single.get(Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory178 = singleInstanceFactory177;
            module.indexPrimaryType(singleInstanceFactory178);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory177);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory178), Reflection.getOrCreateKotlinClass(GetInitializationRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory179 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidLimitedSessionToken.class), null, new Function2<Scope, ParametersHolder, GetAndroidLimitedSessionToken>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.96
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidLimitedSessionToken invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidLimitedSessionToken((DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (MediationRepository) single.get(Reflection.getOrCreateKotlinClass(MediationRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory180 = singleInstanceFactory179;
            module.indexPrimaryType(singleInstanceFactory180);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory179);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory180), Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class));
            SingleInstanceFactory<?> singleInstanceFactory181 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidOpenGLRendererInfo.class), null, new Function2<Scope, ParametersHolder, GetAndroidOpenGLRendererInfo>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.97
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidOpenGLRendererInfo invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidOpenGLRendererInfo((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory182 = singleInstanceFactory181;
            module.indexPrimaryType(singleInstanceFactory182);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory181);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory182), Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class));
            SingleInstanceFactory<?> singleInstanceFactory183 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidSharedDataTimestamps.class), null, new Function2<Scope, ParametersHolder, GetAndroidSharedDataTimestamps>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.98
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidSharedDataTimestamps invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidSharedDataTimestamps();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory184 = singleInstanceFactory183;
            module.indexPrimaryType(singleInstanceFactory184);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory183);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory184), Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class));
            SingleInstanceFactory<?> singleInstanceFactory185 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidUniversalRequestForPayLoad.class), null, new Function2<Scope, ParametersHolder, GetAndroidUniversalRequestForPayLoad>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.99
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidUniversalRequestForPayLoad invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidUniversalRequestForPayLoad((GetUniversalRequestSharedData) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory186 = singleInstanceFactory185;
            module.indexPrimaryType(singleInstanceFactory186);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory185);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory186), Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class));
            SingleInstanceFactory<?> singleInstanceFactory187 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidUniversalRequestSharedData.class), null, new Function2<Scope, ParametersHolder, GetAndroidUniversalRequestSharedData>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.100
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidUniversalRequestSharedData invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidUniversalRequestSharedData((GetSharedDataTimestamps) single.get(Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (GetLimitedSessionToken) single.get(Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class), null, null), (DeveloperConsentRepository) single.get(Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory188 = singleInstanceFactory187;
            module.indexPrimaryType(singleInstanceFactory188);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory187);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory188), Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class));
            SingleInstanceFactory<?> singleInstanceFactory189 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetCachedAsset.class), null, new Function2<Scope, ParametersHolder, GetCachedAsset>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.101
                @Override // kotlin.jvm.functions.Function2
                public final GetCachedAsset invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetCachedAsset((CacheRepository) single.get(Reflection.getOrCreateKotlinClass(CacheRepository.class), null, null), (Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory190 = singleInstanceFactory189;
            module.indexPrimaryType(singleInstanceFactory190);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory189);
            }
            new KoinDefinition(module, singleInstanceFactory190);
            SingleInstanceFactory<?> singleInstanceFactory191 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetCommonWebViewBridgeUseCase.class), null, new Function2<Scope, ParametersHolder, GetCommonWebViewBridgeUseCase>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.102
                @Override // kotlin.jvm.functions.Function2
                public final GetCommonWebViewBridgeUseCase invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetCommonWebViewBridgeUseCase(null, 1, null);
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory192 = singleInstanceFactory191;
            module.indexPrimaryType(singleInstanceFactory192);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory191);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory192), Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class));
            SingleInstanceFactory<?> singleInstanceFactory193 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetInitRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_INIT_REQ), new Function2<Scope, ParametersHolder, GetInitRequestPolicy>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.103
                @Override // kotlin.jvm.functions.Function2
                public final GetInitRequestPolicy invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetInitRequestPolicy((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory194 = singleInstanceFactory193;
            module.indexPrimaryType(singleInstanceFactory194);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory193);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory194), Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            SingleInstanceFactory<?> singleInstanceFactory195 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class), null, new Function2<Scope, ParametersHolder, GetLatestWebViewConfiguration>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.104
                @Override // kotlin.jvm.functions.Function2
                public final GetLatestWebViewConfiguration invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) single.get(Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory196 = singleInstanceFactory195;
            module.indexPrimaryType(singleInstanceFactory196);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory195);
            }
            new KoinDefinition(module, singleInstanceFactory196);
            SingleInstanceFactory<?> singleInstanceFactory197 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetOperativeEventRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_OPERATIVE_REQ), new Function2<Scope, ParametersHolder, GetOperativeEventRequestPolicy>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.105
                @Override // kotlin.jvm.functions.Function2
                public final GetOperativeEventRequestPolicy invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetOperativeEventRequestPolicy((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory198 = singleInstanceFactory197;
            module.indexPrimaryType(singleInstanceFactory198);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory197);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory198), Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            SingleInstanceFactory<?> singleInstanceFactory199 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetOtherRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_OTHER_REQ), new Function2<Scope, ParametersHolder, GetOtherRequestPolicy>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.106
                @Override // kotlin.jvm.functions.Function2
                public final GetOtherRequestPolicy invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetOtherRequestPolicy((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory200 = singleInstanceFactory199;
            module.indexPrimaryType(singleInstanceFactory200);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory199);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory200), Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            SingleInstanceFactory<?> singleInstanceFactory201 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class), null, new Function2<Scope, ParametersHolder, GetPrivacyUpdateRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.107
                @Override // kotlin.jvm.functions.Function2
                public final GetPrivacyUpdateRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory202 = singleInstanceFactory201;
            module.indexPrimaryType(singleInstanceFactory202);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory201);
            }
            new KoinDefinition(module, singleInstanceFactory202);
            SingleInstanceFactory<?> singleInstanceFactory203 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandleAndroidGatewayInitializationResponse.class), null, new Function2<Scope, ParametersHolder, HandleAndroidGatewayInitializationResponse>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.108
                @Override // kotlin.jvm.functions.Function2
                public final HandleAndroidGatewayInitializationResponse invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new HandleAndroidGatewayInitializationResponse((TransactionEventManager) single.get(Reflection.getOrCreateKotlinClass(TransactionEventManager.class), null, null), (TriggerInitializationCompletedRequest) single.get(Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (CoroutineScope) single.get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), new StringQualifier(ServiceProvider.NAMED_INIT_SCOPE), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory204 = singleInstanceFactory203;
            module.indexPrimaryType(singleInstanceFactory204);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory203);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory204), Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class));
            SingleInstanceFactory<?> singleInstanceFactory205 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandleAndroidGatewayUniversalResponse.class), null, new Function2<Scope, ParametersHolder, HandleAndroidGatewayUniversalResponse>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.109
                @Override // kotlin.jvm.functions.Function2
                public final HandleAndroidGatewayUniversalResponse invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new HandleAndroidGatewayUniversalResponse((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory206 = singleInstanceFactory205;
            module.indexPrimaryType(singleInstanceFactory206);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory205);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory206), Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class));
            SingleInstanceFactory<?> singleInstanceFactory207 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeAndroidBoldSDK.class), null, new Function2<Scope, ParametersHolder, InitializeAndroidBoldSDK>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.110
                @Override // kotlin.jvm.functions.Function2
                public final InitializeAndroidBoldSDK invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeAndroidBoldSDK((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (InitializeOMSDK) single.get(Reflection.getOrCreateKotlinClass(InitializeOMSDK.class), null, null), (GetInitializationRequest) single.get(Reflection.getOrCreateKotlinClass(GetInitializationRequest.class), null, null), (GetRequestPolicy) single.get(Reflection.getOrCreateKotlinClass(GetRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_INIT_REQ), null), (ClearCache) single.get(Reflection.getOrCreateKotlinClass(ClearCache.class), null, null), (HandleGatewayInitializationResponse) single.get(Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class), null, null), (GatewayClient) single.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (EventObservers) single.get(Reflection.getOrCreateKotlinClass(EventObservers.class), null, null), (TriggerInitializeListener) single.get(Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (DiagnosticEventRepository) single.get(Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class), null, null), (StorageManager) single.get(Reflection.getOrCreateKotlinClass(StorageManager.class), null, null), (ConfigurationReader) single.get(Reflection.getOrCreateKotlinClass(ConfigurationReader.class), null, null), (SDKPropertiesManager) single.get(Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory208 = singleInstanceFactory207;
            module.indexPrimaryType(singleInstanceFactory208);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory207);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory208), Reflection.getOrCreateKotlinClass(InitializeBoldSDK.class));
            SingleInstanceFactory<?> singleInstanceFactory209 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LegacyShowUseCase.class), null, new Function2<Scope, ParametersHolder, LegacyShowUseCase>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.111
                @Override // kotlin.jvm.functions.Function2
                public final LegacyShowUseCase invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new LegacyShowUseCase((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.MAIN_DISPATCHER), null), (Show) single.get(Reflection.getOrCreateKotlinClass(Show.class), null, null), (AdRepository) single.get(Reflection.getOrCreateKotlinClass(AdRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (GetOperativeEventApi) single.get(Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class), null, null), (GetInitializationState) single.get(Reflection.getOrCreateKotlinClass(GetInitializationState.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory210 = singleInstanceFactory209;
            module.indexPrimaryType(singleInstanceFactory210);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory209);
            }
            new KoinDefinition(module, singleInstanceFactory210);
            SingleInstanceFactory<?> singleInstanceFactory211 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class), null, new Function2<Scope, ParametersHolder, SendPrivacyUpdateRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.112
                @Override // kotlin.jvm.functions.Function2
                public final SendPrivacyUpdateRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) single.get(Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class), null, null), (GetRequestPolicy) single.get(Reflection.getOrCreateKotlinClass(GetRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_OTHER_REQ), null), (GatewayClient) single.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory212 = singleInstanceFactory211;
            module.indexPrimaryType(singleInstanceFactory212);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory211);
            }
            new KoinDefinition(module, singleInstanceFactory212);
            SingleInstanceFactory<?> singleInstanceFactory213 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TriggerAndroidInitializationCompletedRequest.class), null, new Function2<Scope, ParametersHolder, TriggerAndroidInitializationCompletedRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.113
                @Override // kotlin.jvm.functions.Function2
                public final TriggerAndroidInitializationCompletedRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new TriggerAndroidInitializationCompletedRequest((GetInitializationCompletedRequest) single.get(Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class), null, null), (GetRequestPolicy) single.get(Reflection.getOrCreateKotlinClass(GetRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_INIT_REQ), null), (GatewayClient) single.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory214 = singleInstanceFactory213;
            module.indexPrimaryType(singleInstanceFactory214);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory213);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory214), Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory215 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class), null, new Function2<Scope, ParametersHolder, TriggerInitializeListener>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.114
                @Override // kotlin.jvm.functions.Function2
                public final TriggerInitializeListener invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new TriggerInitializeListener((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.MAIN_DISPATCHER), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory216 = singleInstanceFactory215;
            module.indexPrimaryType(singleInstanceFactory216);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory215);
            }
            new KoinDefinition(module, singleInstanceFactory216);
            SingleInstanceFactory<?> singleInstanceFactory217 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class), null, new Function2<Scope, ParametersHolder, DiagnosticEventObserver>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.115
                @Override // kotlin.jvm.functions.Function2
                public final DiagnosticEventObserver invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (GetDiagnosticEventBatchRequest) single.get(Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (DiagnosticEventRepository) single.get(Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class), null, null), (UniversalRequestDataSource) single.get(Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class), null, null), (BackgroundWorker) single.get(Reflection.getOrCreateKotlinClass(BackgroundWorker.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory218 = singleInstanceFactory217;
            module.indexPrimaryType(singleInstanceFactory218);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory217);
            }
            new KoinDefinition(module, singleInstanceFactory218);
            SingleInstanceFactory<?> singleInstanceFactory219 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EventObservers.class), null, new Function2<Scope, ParametersHolder, EventObservers>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.116
                @Override // kotlin.jvm.functions.Function2
                public final EventObservers invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new EventObservers((OperativeEventObserver) single.get(Reflection.getOrCreateKotlinClass(OperativeEventObserver.class), null, null), (DiagnosticEventObserver) single.get(Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class), null, null), (TransactionEventObserver) single.get(Reflection.getOrCreateKotlinClass(TransactionEventObserver.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory220 = singleInstanceFactory219;
            module.indexPrimaryType(singleInstanceFactory220);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory219);
            }
            new KoinDefinition(module, singleInstanceFactory220);
            SingleInstanceFactory<?> singleInstanceFactory221 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAndroidTransactionData.class), null, new Function2<Scope, ParametersHolder, GetAndroidTransactionData>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.117
                @Override // kotlin.jvm.functions.Function2
                public final GetAndroidTransactionData invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetAndroidTransactionData((GetByteStringId) single.get(Reflection.getOrCreateKotlinClass(GetByteStringId.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory222 = singleInstanceFactory221;
            module.indexPrimaryType(singleInstanceFactory222);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory221);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory222), Reflection.getOrCreateKotlinClass(GetTransactionData.class));
            SingleInstanceFactory<?> singleInstanceFactory223 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetCommonTransactionRequest.class), null, new Function2<Scope, ParametersHolder, GetCommonTransactionRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.118
                @Override // kotlin.jvm.functions.Function2
                public final GetCommonTransactionRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetCommonTransactionRequest((DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory224 = singleInstanceFactory223;
            module.indexPrimaryType(singleInstanceFactory224);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory223);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory224), Reflection.getOrCreateKotlinClass(GetTransactionRequest.class));
            SingleInstanceFactory<?> singleInstanceFactory225 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class), null, new Function2<Scope, ParametersHolder, GetDiagnosticEventBatchRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.119
                @Override // kotlin.jvm.functions.Function2
                public final GetDiagnosticEventBatchRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetDiagnosticEventBatchRequest();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory226 = singleInstanceFactory225;
            module.indexPrimaryType(singleInstanceFactory226);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory225);
            }
            new KoinDefinition(module, singleInstanceFactory226);
            SingleInstanceFactory<?> singleInstanceFactory227 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class), null, new Function2<Scope, ParametersHolder, GetDiagnosticEventRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.120
                @Override // kotlin.jvm.functions.Function2
                public final GetDiagnosticEventRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetDiagnosticEventRequest((GetSharedDataTimestamps) single.get(Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory228 = singleInstanceFactory227;
            module.indexPrimaryType(singleInstanceFactory228);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory227);
            }
            new KoinDefinition(module, singleInstanceFactory228);
            SingleInstanceFactory<?> singleInstanceFactory229 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class), null, new Function2<Scope, ParametersHolder, GetOperativeEventApi>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.121
                @Override // kotlin.jvm.functions.Function2
                public final GetOperativeEventApi invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetOperativeEventApi((OperativeEventRepository) single.get(Reflection.getOrCreateKotlinClass(OperativeEventRepository.class), null, null), (GetOperativeEventRequest) single.get(Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory230 = singleInstanceFactory229;
            module.indexPrimaryType(singleInstanceFactory230);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory229);
            }
            new KoinDefinition(module, singleInstanceFactory230);
            SingleInstanceFactory<?> singleInstanceFactory231 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class), null, new Function2<Scope, ParametersHolder, GetOperativeEventRequest>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.122
                @Override // kotlin.jvm.functions.Function2
                public final GetOperativeEventRequest invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GetOperativeEventRequest((GetByteStringId) single.get(Reflection.getOrCreateKotlinClass(GetByteStringId.class), null, null), (DeviceInfoRepository) single.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (CampaignRepository) single.get(Reflection.getOrCreateKotlinClass(CampaignRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory232 = singleInstanceFactory231;
            module.indexPrimaryType(singleInstanceFactory232);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory231);
            }
            new KoinDefinition(module, singleInstanceFactory232);
            SingleInstanceFactory<?> singleInstanceFactory233 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandleGatewayAndroidEventResponse.class), null, new Function2<Scope, ParametersHolder, HandleGatewayAndroidEventResponse>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.123
                @Override // kotlin.jvm.functions.Function2
                public final HandleGatewayAndroidEventResponse invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new HandleGatewayAndroidEventResponse();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory234 = singleInstanceFactory233;
            module.indexPrimaryType(singleInstanceFactory234);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory233);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory234), Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class));
            SingleInstanceFactory<?> singleInstanceFactory235 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(OperativeEventObserver.class), null, new Function2<Scope, ParametersHolder, OperativeEventObserver>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.124
                @Override // kotlin.jvm.functions.Function2
                public final OperativeEventObserver invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new OperativeEventObserver((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (OperativeEventRepository) single.get(Reflection.getOrCreateKotlinClass(OperativeEventRepository.class), null, null), (UniversalRequestDataSource) single.get(Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class), null, null), (BackgroundWorker) single.get(Reflection.getOrCreateKotlinClass(BackgroundWorker.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory236 = singleInstanceFactory235;
            module.indexPrimaryType(singleInstanceFactory236);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory235);
            }
            new KoinDefinition(module, singleInstanceFactory236);
            SingleInstanceFactory<?> singleInstanceFactory237 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TransactionEventObserver.class), null, new Function2<Scope, ParametersHolder, TransactionEventObserver>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.125
                @Override // kotlin.jvm.functions.Function2
                public final TransactionEventObserver invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new TransactionEventObserver((GetUniversalRequestForPayLoad) single.get(Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class), null, null), (CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (TransactionEventRepository) single.get(Reflection.getOrCreateKotlinClass(TransactionEventRepository.class), null, null), (GatewayClient) single.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null), (GetRequestPolicy) single.get(Reflection.getOrCreateKotlinClass(GetRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_OTHER_REQ), null), (ByteStringDataSource) single.get(Reflection.getOrCreateKotlinClass(ByteStringDataSource.class), new StringQualifier(ServiceProvider.DATA_STORE_IAP_TRANSACTION), null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory238 = singleInstanceFactory237;
            module.indexPrimaryType(singleInstanceFactory238);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory237);
            }
            new KoinDefinition(module, singleInstanceFactory238);
            SingleInstanceFactory<?> singleInstanceFactory239 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class), null, new Function2<Scope, ParametersHolder, UniversalRequestEventSender>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.126
                @Override // kotlin.jvm.functions.Function2
                public final UniversalRequestEventSender invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new UniversalRequestEventSender((GatewayClient) single.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null), (HandleGatewayEventResponse) single.get(Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory240 = singleInstanceFactory239;
            module.indexPrimaryType(singleInstanceFactory240);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory239);
            }
            new KoinDefinition(module, singleInstanceFactory240);
            SingleInstanceFactory<?> singleInstanceFactory241 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidOmFinishSession.class), null, new Function2<Scope, ParametersHolder, AndroidOmFinishSession>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.127
                @Override // kotlin.jvm.functions.Function2
                public final AndroidOmFinishSession invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidOmFinishSession((OpenMeasurementRepository) single.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory242 = singleInstanceFactory241;
            module.indexPrimaryType(singleInstanceFactory242);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory241);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory242), Reflection.getOrCreateKotlinClass(OmFinishSession.class));
            SingleInstanceFactory<?> singleInstanceFactory243 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidOmImpressionOccurred.class), null, new Function2<Scope, ParametersHolder, AndroidOmImpressionOccurred>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.128
                @Override // kotlin.jvm.functions.Function2
                public final AndroidOmImpressionOccurred invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidOmImpressionOccurred((OpenMeasurementRepository) single.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory244 = singleInstanceFactory243;
            module.indexPrimaryType(singleInstanceFactory244);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory243);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory244), Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class));
            SingleInstanceFactory<?> singleInstanceFactory245 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidOmStartSession.class), null, new Function2<Scope, ParametersHolder, AndroidOmStartSession>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.129
                @Override // kotlin.jvm.functions.Function2
                public final AndroidOmStartSession invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidOmStartSession((OpenMeasurementRepository) single.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory246 = singleInstanceFactory245;
            module.indexPrimaryType(singleInstanceFactory246);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory245);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory246), Reflection.getOrCreateKotlinClass(AndroidOmInteraction.class));
            SingleInstanceFactory<?> singleInstanceFactory247 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonGetOmData.class), null, new Function2<Scope, ParametersHolder, CommonGetOmData>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.130
                @Override // kotlin.jvm.functions.Function2
                public final CommonGetOmData invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonGetOmData((OpenMeasurementRepository) single.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory248 = singleInstanceFactory247;
            module.indexPrimaryType(singleInstanceFactory248);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory247);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory248), Reflection.getOrCreateKotlinClass(GetOmData.class));
            SingleInstanceFactory<?> singleInstanceFactory249 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonIsOMActivated.class), null, new Function2<Scope, ParametersHolder, CommonIsOMActivated>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.131
                @Override // kotlin.jvm.functions.Function2
                public final CommonIsOMActivated invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonIsOMActivated((OpenMeasurementRepository) single.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory250 = singleInstanceFactory249;
            module.indexPrimaryType(singleInstanceFactory250);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory249);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory250), Reflection.getOrCreateKotlinClass(IsOMActivated.class));
            SingleInstanceFactory<?> singleInstanceFactory251 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeOMAndroidSDK.class), null, new Function2<Scope, ParametersHolder, InitializeOMAndroidSDK>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.132
                @Override // kotlin.jvm.functions.Function2
                public final InitializeOMAndroidSDK invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeOMAndroidSDK((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (OpenMeasurementRepository) single.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory252 = singleInstanceFactory251;
            module.indexPrimaryType(singleInstanceFactory252);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory251);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory252), Reflection.getOrCreateKotlinClass(InitializeOMSDK.class));
            SingleInstanceFactory<?> singleInstanceFactory253 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeveloperConsentFlattenerRulesUseCase.class), new StringQualifier(ServiceProvider.DEV_CONSENT_PRIVACY_RULES), new Function2<Scope, ParametersHolder, DeveloperConsentFlattenerRulesUseCase>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.133
                @Override // kotlin.jvm.functions.Function2
                public final DeveloperConsentFlattenerRulesUseCase invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new DeveloperConsentFlattenerRulesUseCase();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory254 = singleInstanceFactory253;
            module.indexPrimaryType(singleInstanceFactory254);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory253);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory254), Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class));
            SingleInstanceFactory<?> singleInstanceFactory255 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LegacyUserConsentFlattenerRulesUseCase.class), new StringQualifier(ServiceProvider.LEGACY_PRIVACY_RULES), new Function2<Scope, ParametersHolder, LegacyUserConsentFlattenerRulesUseCase>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.134
                @Override // kotlin.jvm.functions.Function2
                public final LegacyUserConsentFlattenerRulesUseCase invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new LegacyUserConsentFlattenerRulesUseCase();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory256 = singleInstanceFactory255;
            module.indexPrimaryType(singleInstanceFactory256);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory255);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory256), Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class));
            SingleInstanceFactory<?> singleInstanceFactory257 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BackgroundWorker.class), null, new Function2<Scope, ParametersHolder, BackgroundWorker>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.135
                @Override // kotlin.jvm.functions.Function2
                public final BackgroundWorker invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new BackgroundWorker((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory258 = singleInstanceFactory257;
            module.indexPrimaryType(singleInstanceFactory258);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory257);
            }
            new KoinDefinition(module, singleInstanceFactory258);
            SingleInstanceFactory<?> singleInstanceFactory259 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class), null, new Function2<Scope, ParametersHolder, DiagnosticEventRequestWorkModifier>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.136
                @Override // kotlin.jvm.functions.Function2
                public final DiagnosticEventRequestWorkModifier invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new DiagnosticEventRequestWorkModifier((SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (LifecycleDataSource) single.get(Reflection.getOrCreateKotlinClass(LifecycleDataSource.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory260 = singleInstanceFactory259;
            module.indexPrimaryType(singleInstanceFactory260);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory259);
            }
            new KoinDefinition(module, singleInstanceFactory260);
            SingleInstanceFactory<?> singleInstanceFactory261 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonGatewayClient.class), null, new Function2<Scope, ParametersHolder, CommonGatewayClient>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.137
                @Override // kotlin.jvm.functions.Function2
                public final CommonGatewayClient invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonGatewayClient((HttpClient) single.get(Reflection.getOrCreateKotlinClass(HttpClient.class), null, null), (HandleGatewayUniversalResponse) single.get(Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (SessionRepository) single.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory262 = singleInstanceFactory261;
            module.indexPrimaryType(singleInstanceFactory262);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory261);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory262), Reflection.getOrCreateKotlinClass(GatewayClient.class));
            SingleInstanceFactory<?> singleInstanceFactory263 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SDKErrorHandler.class), new StringQualifier(ServiceProvider.NAMED_SDK), new Function2<Scope, ParametersHolder, SDKErrorHandler>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.138
                @Override // kotlin.jvm.functions.Function2
                public final SDKErrorHandler invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new SDKErrorHandler((CoroutineDispatcher) single.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.IO_DISPATCHER), null), (AlternativeFlowReader) single.get(Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class), null, null), (SendDiagnosticEvent) single.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (SDKMetricsSender) single.get(Reflection.getOrCreateKotlinClass(SDKMetricsSender.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory264 = singleInstanceFactory263;
            module.indexPrimaryType(singleInstanceFactory264);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory263);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory264), Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class));
            SingleInstanceFactory<?> singleInstanceFactory265 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InMemoryTokenStorage.class), null, new Function2<Scope, ParametersHolder, InMemoryTokenStorage>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.139
                @Override // kotlin.jvm.functions.Function2
                public final InMemoryTokenStorage invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InMemoryTokenStorage();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory266 = singleInstanceFactory265;
            module.indexPrimaryType(singleInstanceFactory266);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory265);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module, singleInstanceFactory266), new KClass[]{Reflection.getOrCreateKotlinClass(TokenStorage.class), Reflection.getOrCreateKotlinClass(IServiceComponent.class)});
            SingleInstanceFactory<?> singleInstanceFactory267 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VolumeChangeContentObserver.class), null, new Function2<Scope, ParametersHolder, VolumeChangeContentObserver>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.140
                @Override // kotlin.jvm.functions.Function2
                public final VolumeChangeContentObserver invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new VolumeChangeContentObserver();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory268 = singleInstanceFactory267;
            module.indexPrimaryType(singleInstanceFactory268);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory267);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory268), Reflection.getOrCreateKotlinClass(VolumeChange.class));
            SingleInstanceFactory<?> singleInstanceFactory269 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class), null, new Function2<Scope, ParametersHolder, ConfigFileFromLocalStorage>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.141
                @Override // kotlin.jvm.functions.Function2
                public final ConfigFileFromLocalStorage invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ConfigFileFromLocalStorage((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory270 = singleInstanceFactory269;
            module.indexPrimaryType(singleInstanceFactory270);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory269);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory270), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory271 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeSDK.class), null, new Function2<Scope, ParametersHolder, InitializeSDK>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.142
                @Override // kotlin.jvm.functions.Function2
                public final InitializeSDK invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeSDK((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (ConfigFileFromLocalStorage) single.get(Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class), null, null), (InitializeStateReset) single.get(Reflection.getOrCreateKotlinClass(InitializeStateReset.class), null, null), (InitializeStateError) single.get(Reflection.getOrCreateKotlinClass(InitializeStateError.class), null, null), (InitializeStateConfig) single.get(Reflection.getOrCreateKotlinClass(InitializeStateConfig.class), null, null), (InitializeStateCreate) single.get(Reflection.getOrCreateKotlinClass(InitializeStateCreate.class), null, null), (InitializeStateLoadCache) single.get(Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class), null, null), (InitializeStateLoadWeb) single.get(Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class), null, null), (InitializeStateComplete) single.get(Reflection.getOrCreateKotlinClass(InitializeStateComplete.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory272 = singleInstanceFactory271;
            module.indexPrimaryType(singleInstanceFactory272);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory271);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory272), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory273 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateComplete.class), null, new Function2<Scope, ParametersHolder, InitializeStateComplete>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.143
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateComplete invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateComplete((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory274 = singleInstanceFactory273;
            module.indexPrimaryType(singleInstanceFactory274);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory273);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory274), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory275 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateConfig.class), null, new Function2<Scope, ParametersHolder, InitializeStateConfig>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.144
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateConfig invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateConfig((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (InitializeStateConfigWithLoader) single.get(Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory276 = singleInstanceFactory275;
            module.indexPrimaryType(singleInstanceFactory276);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory275);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory276), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory277 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class), null, new Function2<Scope, ParametersHolder, InitializeStateConfigWithLoader>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.145
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateConfigWithLoader invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateConfigWithLoader((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (InitializeStateNetworkError) single.get(Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class), null, null), (TokenStorage) single.get(Reflection.getOrCreateKotlinClass(TokenStorage.class), null, null), (SDKMetricsSender) single.get(Reflection.getOrCreateKotlinClass(SDKMetricsSender.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory278 = singleInstanceFactory277;
            module.indexPrimaryType(singleInstanceFactory278);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory277);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory278), Reflection.getOrCreateKotlinClass(BaseTask.class));
            SingleInstanceFactory<?> singleInstanceFactory279 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateCreate.class), null, new Function2<Scope, ParametersHolder, InitializeStateCreate>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.146
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateCreate invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateCreate((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory280 = singleInstanceFactory279;
            module.indexPrimaryType(singleInstanceFactory280);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory279);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory280), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory281 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateError.class), null, new Function2<Scope, ParametersHolder, InitializeStateError>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.147
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateError invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateError((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory282 = singleInstanceFactory281;
            module.indexPrimaryType(singleInstanceFactory282);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory281);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory282), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory283 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class), null, new Function2<Scope, ParametersHolder, InitializeStateLoadCache>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.148
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateLoadCache invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateLoadCache((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory284 = singleInstanceFactory283;
            module.indexPrimaryType(singleInstanceFactory284);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory283);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory284), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory285 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class), null, new Function2<Scope, ParametersHolder, InitializeStateLoadWeb>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.149
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateLoadWeb invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateLoadWeb((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null), (InitializeStateNetworkError) single.get(Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class), null, null), (HttpClient) single.get(Reflection.getOrCreateKotlinClass(HttpClient.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory286 = singleInstanceFactory285;
            module.indexPrimaryType(singleInstanceFactory286);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory285);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory286), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory287 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateReset.class), null, new Function2<Scope, ParametersHolder, InitializeStateReset>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.150
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateReset invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateReset((ISDKDispatchers) single.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory288 = singleInstanceFactory287;
            module.indexPrimaryType(singleInstanceFactory288);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory287);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory288), Reflection.getOrCreateKotlinClass(MetricTask.class));
            SingleInstanceFactory<?> singleInstanceFactory289 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreMonitor.class), null, new Function2<Scope, ParametersHolder, StoreMonitor>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.151
                @Override // kotlin.jvm.functions.Function2
                public final StoreMonitor invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new StoreMonitor((StoreExceptionHandler) single.get(Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory290 = singleInstanceFactory289;
            module.indexPrimaryType(singleInstanceFactory290);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory289);
            }
            new KoinDefinition(module, singleInstanceFactory290);
            SingleInstanceFactory<?> singleInstanceFactory291 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreWebViewEventSender.class), null, new Function2<Scope, ParametersHolder, StoreWebViewEventSender>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.152
                @Override // kotlin.jvm.functions.Function2
                public final StoreWebViewEventSender invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new StoreWebViewEventSender(null, 1, null);
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory292 = singleInstanceFactory291;
            module.indexPrimaryType(singleInstanceFactory292);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory291);
            }
            new KoinDefinition(module, singleInstanceFactory292);
            SingleInstanceFactory<?> singleInstanceFactory293 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GatewayStoreExceptionHandler.class), null, new Function2<Scope, ParametersHolder, GatewayStoreExceptionHandler>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.153
                @Override // kotlin.jvm.functions.Function2
                public final GatewayStoreExceptionHandler invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new GatewayStoreExceptionHandler();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory294 = singleInstanceFactory293;
            module.indexPrimaryType(singleInstanceFactory294);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory293);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory294), Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class));
            SingleInstanceFactory<?> singleInstanceFactory295 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreEventListenerFactory.class), null, new Function2<Scope, ParametersHolder, StoreEventListenerFactory>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.154
                @Override // kotlin.jvm.functions.Function2
                public final StoreEventListenerFactory invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new StoreEventListenerFactory((StoreWebViewEventSender) single.get(Reflection.getOrCreateKotlinClass(StoreWebViewEventSender.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory296 = singleInstanceFactory295;
            module.indexPrimaryType(singleInstanceFactory296);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory295);
            }
            new KoinDefinition(module, singleInstanceFactory296);
            SingleInstanceFactory<?> singleInstanceFactory297 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ConfigurationReader.class), null, new Function2<Scope, ParametersHolder, ConfigurationReader>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.155
                @Override // kotlin.jvm.functions.Function2
                public final ConfigurationReader invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ConfigurationReader();
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory298 = singleInstanceFactory297;
            module.indexPrimaryType(singleInstanceFactory298);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory297);
            }
            new KoinDefinition(module, singleInstanceFactory298);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AdPlayerScope.class), null, new Function2<Scope, ParametersHolder, AdPlayerScope>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.156
                @Override // kotlin.jvm.functions.Function2
                public final AdPlayerScope invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AdPlayerScope((CoroutineDispatcher) factory.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory7);
            DefinitionBindingKt.binds(new KoinDefinition(module, factoryInstanceFactory7), new KClass[]{Reflection.getOrCreateKotlinClass(KoinScopeComponent.class), Reflection.getOrCreateKotlinClass(CoroutineScope.class)});
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class), null, new Function2<Scope, ParametersHolder, AndroidWebViewClient>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.157
                @Override // kotlin.jvm.functions.Function2
                public final AndroidWebViewClient invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidWebViewClient((GetWebViewCacheAssetLoader) factory.get(Reflection.getOrCreateKotlinClass(GetWebViewCacheAssetLoader.class), null, null), (GetAdAssetLoader) factory.get(Reflection.getOrCreateKotlinClass(GetAdAssetLoader.class), null, null), (GetCachedAsset) factory.get(Reflection.getOrCreateKotlinClass(GetCachedAsset.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory8);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory8), Reflection.getOrCreateKotlinClass(WebViewClientCompat.class));
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class), null, new Function2<Scope, ParametersHolder, AndroidGetWebViewContainerUseCase>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.158
                @Override // kotlin.jvm.functions.Function2
                public final AndroidGetWebViewContainerUseCase invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidGetWebViewContainerUseCase((Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (AndroidWebViewClient) factory.get(Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class), null, null), (SendWebViewClientErrorDiagnostics) factory.get(Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class), null, null), (CoroutineDispatcher) factory.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.MAIN_DISPATCHER), null), (CoroutineDispatcher) factory.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory9);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory9), Reflection.getOrCreateKotlinClass(GetWebViewContainerUseCase.class));
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AndroidLoad.class), null, new Function2<Scope, ParametersHolder, AndroidLoad>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.159
                @Override // kotlin.jvm.functions.Function2
                public final AndroidLoad invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AndroidLoad((CoroutineDispatcher) factory.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (GetAdRequest) factory.get(Reflection.getOrCreateKotlinClass(GetAdRequest.class), null, null), (GetAdPlayerConfigRequest) factory.get(Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class), null, null), (GetRequestPolicy) factory.get(Reflection.getOrCreateKotlinClass(GetRequestPolicy.class), new StringQualifier(ServiceProvider.NAMED_AD_REQ), null), (HandleGatewayAdResponse) factory.get(Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class), null, null), (SessionRepository) factory.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (GatewayClient) factory.get(Reflection.getOrCreateKotlinClass(GatewayClient.class), null, null), (AdRepository) factory.get(Reflection.getOrCreateKotlinClass(AdRepository.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory10);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory10), Reflection.getOrCreateKotlinClass(Load.class));
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonAwaitInitialization.class), null, new Function2<Scope, ParametersHolder, CommonAwaitInitialization>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.160
                @Override // kotlin.jvm.functions.Function2
                public final CommonAwaitInitialization invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonAwaitInitialization((SessionRepository) factory.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory11);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory11), Reflection.getOrCreateKotlinClass(AwaitInitialization.class));
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CommonInitAwaitingGetHeaderBiddingToken.class), null, new Function2<Scope, ParametersHolder, CommonInitAwaitingGetHeaderBiddingToken>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.161
                @Override // kotlin.jvm.functions.Function2
                public final CommonInitAwaitingGetHeaderBiddingToken invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) factory.get(Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class), null, null), (SendDiagnosticEvent) factory.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (GetInitializationState) factory.get(Reflection.getOrCreateKotlinClass(GetInitializationState.class), null, null), (AwaitInitialization) factory.get(Reflection.getOrCreateKotlinClass(AwaitInitialization.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory12);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory12), Reflection.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class));
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandleGatewayAndroidAdResponse.class), null, new Function2<Scope, ParametersHolder, HandleGatewayAndroidAdResponse>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.162
                @Override // kotlin.jvm.functions.Function2
                public final HandleGatewayAndroidAdResponse invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new HandleGatewayAndroidAdResponse((AdRepository) factory.get(Reflection.getOrCreateKotlinClass(AdRepository.class), null, null), (AndroidGetWebViewContainerUseCase) factory.get(Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class), null, null), (GetWebViewBridgeUseCase) factory.get(Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class), null, null), (CoroutineDispatcher) factory.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.DEFAULT_DISPATCHER), null), (DeviceInfoRepository) factory.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), (HandleInvocationsFromAdViewer) factory.get(Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class), null, null), (SessionRepository) factory.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (CampaignRepository) factory.get(Reflection.getOrCreateKotlinClass(CampaignRepository.class), null, null), (ExecuteAdViewerRequest) factory.get(Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class), null, null), (SendDiagnosticEvent) factory.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (GetOperativeEventApi) factory.get(Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class), null, null), (GetLatestWebViewConfiguration) factory.get(Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class), null, null), (AdPlayerScope) factory.get(Reflection.getOrCreateKotlinClass(AdPlayerScope.class), null, null), (OpenMeasurementRepository) factory.get(Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory13);
            DefinitionBindingKt.bind(new KoinDefinition(module, factoryInstanceFactory13), Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class));
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class), null, new Function2<Scope, ParametersHolder, HandleInvocationsFromAdViewer>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.163
                @Override // kotlin.jvm.functions.Function2
                public final HandleInvocationsFromAdViewer invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new HandleInvocationsFromAdViewer();
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory14);
            new KoinDefinition(module, factoryInstanceFactory14);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LegacyLoadUseCase.class), null, new Function2<Scope, ParametersHolder, LegacyLoadUseCase>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.164
                @Override // kotlin.jvm.functions.Function2
                public final LegacyLoadUseCase invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new LegacyLoadUseCase((CoroutineDispatcher) factory.get(Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class), new StringQualifier(ServiceProvider.MAIN_DISPATCHER), null), (Load) factory.get(Reflection.getOrCreateKotlinClass(Load.class), null, null), (SendDiagnosticEvent) factory.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (GetInitializationState) factory.get(Reflection.getOrCreateKotlinClass(GetInitializationState.class), null, null), (AwaitInitialization) factory.get(Reflection.getOrCreateKotlinClass(AwaitInitialization.class), null, null), (SessionRepository) factory.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null), (AdRepository) factory.get(Reflection.getOrCreateKotlinClass(AdRepository.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory15);
            new KoinDefinition(module, factoryInstanceFactory15);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class), null, new Function2<Scope, ParametersHolder, InitializeStateNetworkError>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.165
                @Override // kotlin.jvm.functions.Function2
                public final InitializeStateNetworkError invoke(Scope factory, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(factory, "$this$factory");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new InitializeStateNetworkError((ISDKDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ISDKDispatchers.class), null, null));
                }
            }, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory16);
            DefinitionBindingKt.binds(new KoinDefinition(module, factoryInstanceFactory16), new KClass[]{Reflection.getOrCreateKotlinClass(MetricTask.class), Reflection.getOrCreateKotlinClass(IConnectivityListener.class)});
            SingleInstanceFactory<?> singleInstanceFactory299 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAdAssetLoader.class), null, new Function2<Scope, ParametersHolder, GetAdAssetLoader>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.166
                @Override // kotlin.jvm.functions.Function2
                public final GetAdAssetLoader invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return GetAdAssetLoaderKt.provideGetAdCacheAssetLoader((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory300 = singleInstanceFactory299;
            module.indexPrimaryType(singleInstanceFactory300);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory299);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory300), Reflection.getOrCreateKotlinClass(GetAdAssetLoader.class));
            SingleInstanceFactory<?> singleInstanceFactory301 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetWebViewCacheAssetLoader.class), null, new Function2<Scope, ParametersHolder, GetWebViewCacheAssetLoader>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1.167
                @Override // kotlin.jvm.functions.Function2
                public final GetWebViewCacheAssetLoader invoke(Scope single, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(single, "$this$single");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
                }
            }, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory302 = singleInstanceFactory301;
            module.indexPrimaryType(singleInstanceFactory302);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory301);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory302), Reflection.getOrCreateKotlinClass(GetWebViewCacheAssetLoader.class));
            TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class));
            ScopeDSL scopeDSL = new ScopeDSL(typeQualifier, module);
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_AD_CONTEXT), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$1
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.m727getAdContextyLuu4LI((GetAndroidAdPlayerContext) scoped.get(Reflection.getOrCreateKotlinClass(GetAndroidAdPlayerContext.class), null, null), ((AdData) scoped.get(Reflection.getOrCreateKotlinClass(AdData.class), null, null)).m708unboximpl(), ((ImpressionConfig) scoped.get(Reflection.getOrCreateKotlinClass(ImpressionConfig.class), null, null)).m722unboximpl(), ((AdDataRefreshToken) scoped.get(Reflection.getOrCreateKotlinClass(AdDataRefreshToken.class), null, null)).m715unboximpl(), (IsOMActivated) scoped.get(Reflection.getOrCreateKotlinClass(IsOMActivated.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_CONNECTION_TYPE), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$2
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory2);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory2), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_DEVICE_VOLUME), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$3
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory3);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory3), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$4
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory4);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory4), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_SCREEN_HEIGHT), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$5
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory5);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory5), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_SCREEN_WIDTH), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$6
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory6);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory6), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.OPEN_URL), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$7
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.openUrl((HandleOpenUrl) scoped.get(Reflection.getOrCreateKotlinClass(HandleOpenUrl.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory7);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory7), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.SEND_OPERATIVE_EVENT), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$8
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) scoped.get(Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory8);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory8), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_WRITE), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$9
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.writeStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory9);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory9), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_READ), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$10
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.readStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory10);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory10), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_DELETE), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$11
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.deleteStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory11);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory11), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_CLEAR), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$12
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.clearStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory12);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory12), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_GET_KEYS), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$13
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getKeysStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory13);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory13), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_GET), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$14
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory14);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory14), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory15 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.STORAGE_SET), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$15
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.setStorage();
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory15);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory15), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory16 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_PRIVACY_FSM), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$16
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) scoped.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory16);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory16), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory17 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.SET_PRIVACY_FSM), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$17
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) scoped.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory17);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory17), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory18 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_PRIVACY), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$18
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) scoped.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory18);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory18), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory19 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.SET_PRIVACY), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$19
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) scoped.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory19);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory19), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory20 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_ALLOWED_PII), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$20
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory20);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory20), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory21 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.SET_ALLOWED_PII), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$21
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) scoped.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory21);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory21), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory22 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.GET_SESSION_TOKEN), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$22
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) scoped.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory22);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory22), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory23 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$23
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) scoped.get(Reflection.getOrCreateKotlinClass(CampaignRepository.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory23);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory23), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory24 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.REFRESH_AD_DATA), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$24
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) scoped.get(Reflection.getOrCreateKotlinClass(Refresh.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory24);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory24), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory25 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$25
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.updateTrackingToken((AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory25);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory25), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory26 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$26
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) scoped.get(Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory26);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory26), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory27 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$27
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) scoped.get(Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory27);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory27), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory28 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$28
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) scoped.get(Reflection.getOrCreateKotlinClass(SessionRepository.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory28);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory28), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory29 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.DOWNLOAD), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$29
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.download((CacheFile) scoped.get(Reflection.getOrCreateKotlinClass(CacheFile.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory29);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory29), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory30 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.IS_FILE_CACHED), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$30
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) scoped.get(Reflection.getOrCreateKotlinClass(GetIsFileCache.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory30);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory30), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory31 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.OM_START_SESSION), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$31
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmStartSession) scoped.get(Reflection.getOrCreateKotlinClass(AndroidOmStartSession.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory31);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory31), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory32 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.OM_FINISH_SESSION), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$32
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) scoped.get(Reflection.getOrCreateKotlinClass(OmFinishSession.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory32);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory32), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory33 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.OM_IMPRESSION), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$33
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) scoped.get(Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class), null, null), (AdObject) scoped.get(Reflection.getOrCreateKotlinClass(AdObject.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory33);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory33), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            ScopedInstanceFactory scopedInstanceFactory34 = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExposedFunction.class), new StringQualifier(ExposedFunctionLocation.OM_GET_DATA), new Function2<Scope, ParametersHolder, ExposedFunction>() { // from class: org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt$com_unity3d_services_core_di_KoinModule$1$168$34
                @Override // kotlin.jvm.functions.Function2
                public final ExposedFunction invoke(Scope scoped, ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) scoped.get(Reflection.getOrCreateKotlinClass(GetOmData.class), null, null));
                }
            }, Kind.Scoped, CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory34);
            DefinitionBindingKt.bind(new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory34), Reflection.getOrCreateKotlinClass(ExposedFunction.class));
            module.getScopes().add(typeQualifier);
        }
    }, 1, null);

    public static final Module getCom_unity3d_services_core_di_KoinModule() {
        return com_unity3d_services_core_di_KoinModule;
    }

    public static final Module getModule(KoinModule koinModule) {
        Intrinsics.checkNotNullParameter(koinModule, "<this>");
        return com_unity3d_services_core_di_KoinModule;
    }
}
