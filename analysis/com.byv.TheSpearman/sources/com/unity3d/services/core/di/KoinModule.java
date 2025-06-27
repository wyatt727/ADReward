package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.DefaultByteStringMigration;
import com.unity3d.ads.core.data.datasource.ForcefulPreservingByteStringPreferenceMigration;
import com.unity3d.ads.core.data.datasource.GetAuidData;
import com.unity3d.ads.core.data.datasource.GetIdfiData;
import com.unity3d.ads.core.data.datasource.PreservingByteStringPreferenceMigration;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import defpackage.ByteStringStoreOuterClass;
import defpackage.UniversalRequestStoreOuterClass;
import defpackage.WebviewConfigurationStore;
import gateway.v1.AdOperationsConfigurationKt;
import gateway.v1.DiagnosticEventsConfigurationKt;
import gateway.v1.NativeConfigurationKt;
import gateway.v1.NativeConfigurationOuterClass;
import gateway.v1.RequestPolicyKt;
import gateway.v1.RequestRetryPolicyKt;
import gateway.v1.RequestTimeoutPolicyKt;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import org.koin.core.KoinApplication;
import org.koin.core.annotation.ComponentScan;
import org.koin.core.annotation.Module;
import org.koin.core.annotation.Named;
import org.koin.core.annotation.Single;
import org.koin.dsl.KoinApplicationKt;
import org.koin.ksp.generated.KoinModuleGencom_unity3d_services_core_diKt;

/* compiled from: KoinModule.kt */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u0010\u000f\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\b\u0010\u001c\u001a\u00020\u0012H\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u0010\u001f\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J \u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0002J$\u0010)\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u0007J0\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u000e\b\u0001\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u0010/\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J \u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u00101\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J@\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u000e\b\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u00103\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J$\u00106\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u0007J\b\u00107\u001a\u00020\u0012H\u0007J$\u00108\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u0007J\b\u00109\u001a\u00020\u0012H\u0007J\u0018\u0010:\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J \u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010<\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J \u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010=\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J \u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010>\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007J\b\u0010?\u001a\u00020@H\u0007J\u0016\u0010A\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002J&\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010C\u001a\u00020DH\u0002J0\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010J\u001a\u00020K2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u00020QH\u0007J\b\u0010R\u001a\u00020@H\u0007J\b\u0010S\u001a\u00020\u0019H\u0007J\b\u0010T\u001a\u00020\nH\u0007J$\u0010U\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u0007J\u0018\u0010V\u001a\u00020W2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J$\u0010X\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u0007J \u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0007J \u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"Lcom/unity3d/services/core/di/KoinModule;", "", "()V", "androidContext", "Landroid/content/Context;", "asyncTokenStorage", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "tokenStorage", "Lcom/unity3d/services/ads/token/InMemoryTokenStorage;", "sdkMetricsSender", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "auidDataMigration", "Landroidx/datastore/core/DataMigration;", "LByteStringStoreOuterClass$ByteStringStore;", "context", "auidDataStore", "Landroidx/datastore/core/DataStore;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "auidMigration", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "dataStore", "buildNetworkClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultByteStringMigration", "defaultDispatcher", "defaultNativeConfiguration", "Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration;", "gatewayCacheDataStore", "gatewayDataStore", "getDefaultAdOperations", "Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getDefaultRequestPolicy", "Lgateway/v1/NativeConfigurationOuterClass$RequestPolicy;", "getDefaultRequestRetryPolicy", "Lgateway/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getDefaultRequestTimeoutPolicy", "Lgateway/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getTokenCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "parentJob", "Lkotlinx/coroutines/Job;", "glInfoDataStore", "fetchGLInfo", "iapTransactionDataStore", "idfiDataMigration", "idfiDataStore", "idfiMigration", "defaultIdfi", "initCoroutineScope", "ioDispatcher", "loadCoroutineScope", "mainDispatcher", "measurementService", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "nativeConfigurationDataStore", "privacyDataStore", "privacyFsmDataStore", "privateJsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "provideByteStringDataSource", "provideByteStringDataStore", "dataStoreFile", "", "provideHttpClient", "configFileFromLocalStorage", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "provideJsonStorage", "storageType", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "publicApiJob", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "publicJsonStorage", "sdkDispatchers", "sdkMetrics", "showCoroutineScope", "topicsService", "Lcom/unity3d/services/ads/topics/TopicsService;", "transactionCoroutineScope", "universalRequestDataStore", "LUniversalRequestStoreOuterClass$UniversalRequestStore;", "volumeChangeMonitor", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "volumeChange", "Lcom/unity3d/services/core/device/VolumeChange;", "webViewConfigurationDataStore", "LWebviewConfigurationStore$WebViewConfigurationStore;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Module
@ComponentScan(SDKErrorHandler.UNITY_PACKAGE)
/* loaded from: classes4.dex */
public final class KoinModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KoinApplication system = KoinApplicationKt.koinApplication$default(false, new Function1<KoinApplication, Unit>() { // from class: com.unity3d.services.core.di.KoinModule$Companion$system$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KoinApplication koinApplication) {
            invoke2(koinApplication);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KoinApplication koinApplication) {
            Intrinsics.checkNotNullParameter(koinApplication, "$this$koinApplication");
            koinApplication.modules(KoinModuleGencom_unity3d_services_core_diKt.getCom_unity3d_services_core_di_KoinModule());
        }
    }, 1, null);

    @Single
    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    @Single
    @Named(ServiceProvider.MAIN_DISPATCHER)
    public final CoroutineDispatcher mainDispatcher() {
        return Dispatchers.getMain();
    }

    @Single
    @Named(ServiceProvider.DEFAULT_DISPATCHER)
    public final CoroutineDispatcher defaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @Single
    @Named(ServiceProvider.IO_DISPATCHER)
    public final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }

    @Single
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @Single
    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        Intrinsics.checkNotNullExpressionValue(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    @org.koin.core.annotation.Factory
    @Named(ServiceProvider.NAMED_INIT_SCOPE)
    public final CoroutineScope initCoroutineScope(ISDKDispatchers dispatchers, @Named(ServiceProvider.NAMED_SDK) CoroutineExceptionHandler errorHandler, @Named(ServiceProvider.NAMED_PUBLIC_JOB) Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    @org.koin.core.annotation.Factory
    @Named(ServiceProvider.NAMED_LOAD_SCOPE)
    public final CoroutineScope loadCoroutineScope(ISDKDispatchers dispatchers, @Named(ServiceProvider.NAMED_SDK) CoroutineExceptionHandler errorHandler, @Named(ServiceProvider.NAMED_PUBLIC_JOB) Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    @org.koin.core.annotation.Factory
    @Named(ServiceProvider.NAMED_SHOW_SCOPE)
    public final CoroutineScope showCoroutineScope(ISDKDispatchers dispatchers, @Named(ServiceProvider.NAMED_SDK) CoroutineExceptionHandler errorHandler, @Named(ServiceProvider.NAMED_PUBLIC_JOB) Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    @org.koin.core.annotation.Factory
    @Named(ServiceProvider.NAMED_TRANSACTION_SCOPE)
    public final CoroutineScope transactionCoroutineScope(ISDKDispatchers dispatchers, @Named(ServiceProvider.NAMED_SDK) CoroutineExceptionHandler errorHandler, @Named(ServiceProvider.NAMED_PUBLIC_JOB) Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getMain()).plus(new CoroutineName(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    @org.koin.core.annotation.Factory
    @Named(ServiceProvider.NAMED_GET_TOKEN_SCOPE)
    public final CoroutineScope getTokenCoroutineScope(ISDKDispatchers dispatchers, @Named(ServiceProvider.NAMED_SDK) CoroutineExceptionHandler errorHandler, @Named(ServiceProvider.NAMED_PUBLIC_JOB) Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getMain()).plus(new CoroutineName(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    @org.koin.core.annotation.Factory
    @Named(ServiceProvider.NAMED_PUBLIC_JOB)
    public final Job publicApiJob(final DiagnosticEventRepository diagnosticEventRepository) {
        Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        completableJobJob$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.unity3d.services.core.di.KoinModule$publicApiJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                diagnosticEventRepository.flush();
            }
        });
        return completableJobJob$default;
    }

    @Single
    @Named("unityads-installinfo")
    public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> idfiDataMigration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PreservingByteStringPreferenceMigration(context, "unityads-installinfo", AndroidStaticDeviceInfoDataSource.PREF_KEY_IDFI, new GetIdfiData());
    }

    @Single
    @Named("supersonic_shared_preferen")
    public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> auidDataMigration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ForcefulPreservingByteStringPreferenceMigration(context, "supersonic_shared_preferen", "auid", new GetAuidData());
    }

    @Single
    @Named(ServiceProvider.PREF_DEFAULT)
    public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> defaultByteStringMigration() {
        return new DefaultByteStringMigration("unityads-installinfo", AndroidStaticDeviceInfoDataSource.PREF_KEY_IDFI, new GetIdfiData());
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_GATEWAY_CACHE)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_PRIVACY)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_PRIVACY_FSM)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_NATIVE_CONFIG)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_IDFI)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> idfiDataStore(final Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher, @Named("unityads-installinfo") DataMigration<ByteStringStoreOuterClass.ByteStringStore> idfiMigration, @Named(ServiceProvider.PREF_DEFAULT) DataMigration<ByteStringStoreOuterClass.ByteStringStore> defaultIdfi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(idfiMigration, "idfiMigration");
        Intrinsics.checkNotNullParameter(defaultIdfi, "defaultIdfi");
        return DataStoreFactory.INSTANCE.create(new ByteStringSerializer(), new ReplaceFileCorruptionHandler(new Function1<CorruptionException, ByteStringStoreOuterClass.ByteStringStore>() { // from class: com.unity3d.services.core.di.KoinModule.idfiDataStore.1
            @Override // kotlin.jvm.functions.Function1
            public final ByteStringStoreOuterClass.ByteStringStore invoke(CorruptionException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UUID idfi = UUID.randomUUID();
                AndroidPreferences.setString("unityads-installinfo", AndroidStaticDeviceInfoDataSource.PREF_KEY_IDFI, idfi.toString());
                ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                Intrinsics.checkNotNullExpressionValue(idfi, "idfi");
                ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = builderNewBuilder.setData(ProtobufExtensionsKt.toByteString(idfi)).build();
                Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder().setData(idfi.toByteString()).build()");
                return byteStringStoreBuild;
            }
        }), CollectionsKt.listOf((Object[]) new DataMigration[]{idfiMigration, defaultIdfi}), CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.services.core.di.KoinModule.idfiDataStore.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, ServiceProvider.DATA_STORE_IDFI);
            }
        });
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_AUID)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> auidDataStore(final Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher, @Named("supersonic_shared_preferen") DataMigration<ByteStringStoreOuterClass.ByteStringStore> auidMigration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(auidMigration, "auidMigration");
        DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
        ByteStringSerializer byteStringSerializer = new ByteStringSerializer();
        return dataStoreFactory.create(byteStringSerializer, new ReplaceFileCorruptionHandler(new Function1<CorruptionException, ByteStringStoreOuterClass.ByteStringStore>() { // from class: com.unity3d.services.core.di.KoinModule.auidDataStore.1
            @Override // kotlin.jvm.functions.Function1
            public final ByteStringStoreOuterClass.ByteStringStore invoke(CorruptionException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(ByteString.empty()).build();
                Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder().setData(ByteString.empty()).build()");
                return byteStringStoreBuild;
            }
        }), CollectionsKt.listOf(auidMigration), CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.services.core.di.KoinModule.auidDataStore.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, ServiceProvider.DATA_STORE_AUID);
            }
        });
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_GL_INFO)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(final Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher, @Named(ServiceProvider.PREF_GL_INFO) DataMigration<ByteStringStoreOuterClass.ByteStringStore> fetchGLInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(fetchGLInfo, "fetchGLInfo");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, CollectionsKt.listOf(fetchGLInfo), CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.services.core.di.KoinModule.glInfoDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
            }
        }, 2, null);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST)
    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestDataStore(final Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.services.core.di.KoinModule.universalRequestDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_IAP_TRANSACTION)
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG)
    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(final Context context, @Named(ServiceProvider.IO_DISPATCHER) CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new WebViewConfigurationStoreSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.services.core.di.KoinModule.webViewConfigurationDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
            }
        }, 4, null);
    }

    @Single
    public final AsyncTokenStorage asyncTokenStorage(InMemoryTokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    @Single
    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        Intrinsics.checkNotNullParameter(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    @Single
    @Named("PUBLIC")
    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    @Single
    @Named("PRIVATE")
    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_GATEWAY_CACHE)
    public final ByteStringDataSource gatewayCacheDataStore(@Named(ServiceProvider.DATA_STORE_GATEWAY_CACHE) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_PRIVACY)
    public final ByteStringDataSource privacyDataStore(@Named(ServiceProvider.DATA_STORE_PRIVACY) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_IDFI)
    public final ByteStringDataSource idfiDataStore(@Named(ServiceProvider.DATA_STORE_IDFI) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_AUID)
    public final ByteStringDataSource auidDataStore(@Named(ServiceProvider.DATA_STORE_AUID) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_PRIVACY_FSM)
    public final ByteStringDataSource privacyFsmDataStore(@Named(ServiceProvider.DATA_STORE_PRIVACY_FSM) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_NATIVE_CONFIG)
    public final ByteStringDataSource nativeConfigurationDataStore(@Named(ServiceProvider.DATA_STORE_NATIVE_CONFIG) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_GL_INFO)
    public final ByteStringDataSource glInfoDataStore(@Named(ServiceProvider.DATA_STORE_GL_INFO) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    @Named(ServiceProvider.DATA_STORE_IAP_TRANSACTION)
    public final ByteStringDataSource iapTransactionDataStore(@Named(ServiceProvider.DATA_STORE_IAP_TRANSACTION) DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @Single
    public final MeasurementsService measurementService(Context context, ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @Single
    public final TopicsService topicsService(Context context, ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    /* compiled from: KoinModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.core.di.KoinModule$provideHttpClient$1", f = "KoinModule.kt", i = {0}, l = {444}, m = "invokeSuspend", n = {"startTime"}, s = {"J$0"})
    /* renamed from: com.unity3d.services.core.di.KoinModule$provideHttpClient$1, reason: invalid class name and case insensitive filesystem */
    static final class C15451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpClient>, Object> {
        final /* synthetic */ AlternativeFlowReader $alternativeFlowReader;
        final /* synthetic */ ConfigFileFromLocalStorage $configFileFromLocalStorage;
        final /* synthetic */ Context $context;
        final /* synthetic */ ISDKDispatchers $dispatchers;
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        long J$0;
        int label;
        final /* synthetic */ KoinModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15451(AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, ISDKDispatchers iSDKDispatchers, KoinModule koinModule, Context context, ConfigFileFromLocalStorage configFileFromLocalStorage, Continuation<? super C15451> continuation) {
            super(2, continuation);
            this.$alternativeFlowReader = alternativeFlowReader;
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
            this.$dispatchers = iSDKDispatchers;
            this.this$0 = koinModule;
            this.$context = context;
            this.$configFileFromLocalStorage = configFileFromLocalStorage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15451(this.$alternativeFlowReader, this.$sendDiagnosticEvent, this.$dispatchers, this.this$0, this.$context, this.$configFileFromLocalStorage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpClient> continuation) {
            return ((C15451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IExperiments experiments;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.$alternativeFlowReader.invoke()) {
                    Configuration configuration = (Configuration) BuildersKt__BuildersKt.runBlocking$default(null, new KoinModule$provideHttpClient$1$config$1(this.$configFileFromLocalStorage, null), 1, null);
                    if ((configuration == null || (experiments = configuration.getExperiments()) == null || !experiments.isOkHttpEnabled()) ? false : true) {
                        return new OkHttp3Client(this.$dispatchers, new OkHttpClient());
                    }
                    return new LegacyHttpClient(this.$dispatchers);
                }
                long jM2527markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m2527markNowz9LOYto();
                this.J$0 = jM2527markNowz9LOYto;
                this.label = 1;
                obj = TimeoutKt.withTimeoutOrNull(500L, new KoinModule$provideHttpClient$1$client$1(this.this$0, this.$context, this.$dispatchers, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = jM2527markNowz9LOYto;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            HttpClient httpClient = (HttpClient) obj;
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.$sendDiagnosticEvent, httpClient == null ? "native_cronet_failure_time" : "native_cronet_success_time", Boxing.boxDouble(Duration.m2431toDoubleimpl(TimeSource.Monotonic.ValueTimeMark.m2532elapsedNowUwyO8pc(j), DurationUnit.MILLISECONDS)), null, null, null, 28, null);
            return httpClient == null ? new OkHttp3Client(this.$dispatchers, new OkHttpClient()) : httpClient;
        }
    }

    @Single
    public final HttpClient provideHttpClient(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context) {
        Intrinsics.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(context, "context");
        return (HttpClient) BuildersKt__BuildersKt.runBlocking$default(null, new C15451(alternativeFlowReader, sendDiagnosticEvent, dispatchers, this, context, configFileFromLocalStorage, null), 1, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize".toString());
        }
        Storage storage = StorageManager.getStorage(storageType);
        Intrinsics.checkNotNullExpressionValue(storage, "getStorage(storageType)");
        return storage;
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(final Context context, CoroutineDispatcher dispatcher, final String dataStoreFile) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.services.core.di.KoinModule.provideByteStringDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, dataStoreFile);
            }
        }, 4, null);
    }

    /* compiled from: KoinModule.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/di/KoinModule$Companion;", "", "()V", "system", "Lorg/koin/core/KoinApplication;", "getSystem", "()Lorg/koin/core/KoinApplication;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KoinApplication getSystem() {
            return KoinModule.system;
        }
    }

    @Single
    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        return dsl_create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, Continuation<? super HttpClient> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.services.core.di.KoinModule$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccessful()) {
                    CronetEngine cronetEngine = new CronetEngine.Builder(context).setStoragePath(context.getFilesDir().getAbsolutePath()).enableHttpCache(3, 5242880L).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint("cdn-creatives-cf-prd.acquire.unity3dusercontent.com", 443, 443).build();
                    CancellableContinuation<HttpClient> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(cronetEngine, "cronetEngine");
                    cancellableContinuation.resumeWith(Result.m1062constructorimpl(new CronetClient(cronetEngine, iSDKDispatchers)));
                    return;
                }
                CancellableContinuation<HttpClient> cancellableContinuation2 = cancellableContinuationImpl2;
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m1062constructorimpl(new OkHttp3Client(iSDKDispatchers, new OkHttpClient())));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(5000);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(20000);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(1000);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(10000);
        dsl_create.setReadTimeoutMs(10000);
        dsl_create.setWriteTimeoutMs(10000);
        dsl_create.setOverallTimeoutMs(10000);
        return dsl_create._build();
    }
}
