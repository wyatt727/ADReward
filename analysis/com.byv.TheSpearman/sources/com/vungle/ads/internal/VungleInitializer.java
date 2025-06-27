package com.vungle.ads.internal;

import android.content.Context;
import androidx.core.content.PermissionChecker;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConfigurationError;
import com.vungle.ads.ConfigurationResponseError;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.Metric;
import com.vungle.ads.NetworkPermissionsNotGranted;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkAlreadyInitialized;
import com.vungle.ads.SdkInitializationInProgress;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.UnknownConfigurationError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.MraidJsLoader;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.ResendTpatJob;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.ThreadUtil;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: VungleInitializer.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u001e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0018J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/VungleInitializer;", "", "()V", "initRequestToResponseMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "isInitialized", "", "isInitialized$vungle_ads_release$annotations", "isInitialized$vungle_ads_release", "()Z", "setInitialized$vungle_ads_release", "(Z)V", "isInitializing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitializing$vungle_ads_release$annotations", "isInitializing$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setInitializing$vungle_ads_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "configure", "", "context", "Landroid/content/Context;", "callback", "Lcom/vungle/ads/InitializationListener;", "deInit", "deInit$vungle_ads_release", t2.a.e, RemoteConfigConstants.RequestFieldKey.APP_ID, "", "initializationCallback", "isAppIdInvalid", "onInitError", "initCallback", "exception", "Lcom/vungle/ads/VungleError;", "onInitSuccess", "Companion", "vungle-ads_release", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class VungleInitializer {
    private static final String TAG = "VungleInitializer";
    private boolean isInitialized;
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private TimeIntervalMetric initRequestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.INIT_REQUEST_TO_RESPONSE_DURATION_MS);

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    public final boolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final void setInitialized$vungle_ads_release(boolean z) {
        this.isInitialized = z;
    }

    /* renamed from: isInitializing$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsInitializing() {
        return this.isInitializing;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void init(final String appId, final Context context, final InitializationListener initializationCallback) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        if (isAppIdInvalid(appId)) {
            onInitError(initializationCallback, new InvalidAppId().logError$vungle_ads_release());
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        if (!m916init$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Platform>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Platform invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Platform.class);
            }
        })).isAtLeastMinimumSDK()) {
            Logger.INSTANCE.e(TAG, "SDK is supported only for API versions 21 and above");
            onInitError(initializationCallback, new SdkVersionTooLow().logError$vungle_ads_release());
            return;
        }
        if (getIsInitialized()) {
            Logger.INSTANCE.d(TAG, "init already complete");
            new SdkAlreadyInitialized().logErrorNoReturnValue$vungle_ads_release();
            onInitSuccess(initializationCallback);
        } else if (this.isInitializing.getAndSet(true)) {
            Logger.INSTANCE.d(TAG, "init ongoing");
            onInitError(initializationCallback, new SdkInitializationInProgress().logError$vungle_ads_release());
        } else {
            if (PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.INTERNET") != 0) {
                Logger.INSTANCE.e(TAG, "Network permissions not granted");
                onInitError(initializationCallback, new NetworkPermissionsNotGranted());
                return;
            }
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            });
            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
            final Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            });
            m917init$lambda1(lazy).getBACKGROUND_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.VungleInitializer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m919init$lambda3(context, appId, this, initializationCallback, lazy2);
                }
            }, new Runnable() { // from class: com.vungle.ads.internal.VungleInitializer$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m920init$lambda4(this.f$0, initializationCallback);
                }
            });
        }
    }

    /* renamed from: init$lambda-0, reason: not valid java name */
    private static final Platform m916init$lambda0(Lazy<? extends Platform> lazy) {
        return lazy.getValue();
    }

    /* renamed from: init$lambda-1, reason: not valid java name */
    private static final Executors m917init$lambda1(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: init$lambda-2, reason: not valid java name */
    private static final VungleApiClient m918init$lambda2(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-3, reason: not valid java name */
    public static final void m919init$lambda3(Context context, String appId, VungleInitializer this$0, InitializationListener initializationCallback, Lazy vungleApiClient$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(initializationCallback, "$initializationCallback");
        Intrinsics.checkNotNullParameter(vungleApiClient$delegate, "$vungleApiClient$delegate");
        PrivacyManager.INSTANCE.init(context);
        m918init$lambda2(vungleApiClient$delegate).initialize(appId);
        this$0.configure(context, initializationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-4, reason: not valid java name */
    public static final void m920init$lambda4(VungleInitializer this$0, InitializationListener initializationCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(initializationCallback, "$initializationCallback");
        this$0.onInitError(initializationCallback, new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String appId) {
        return StringsKt.isBlank(appId);
    }

    private final void configure(final Context context, InitializationListener callback) {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        try {
            this.initRequestToResponseMetric.markStart();
            Call<ConfigPayload> callConfig = m912configure$lambda5(lazy).config();
            Response<ConfigPayload> responseExecute = callConfig != null ? callConfig.execute() : null;
            if (responseExecute == null) {
                onInitError(callback, new SdkNotInitialized().logError$vungle_ads_release());
                return;
            }
            if (!responseExecute.isSuccessful()) {
                onInitError(callback, new ConfigurationError().logError$vungle_ads_release());
                return;
            }
            this.initRequestToResponseMetric.markEnd();
            ConfigPayload configPayloadBody = responseExecute.body();
            if ((configPayloadBody != null ? configPayloadBody.getEndpoints() : null) == null) {
                onInitError(callback, new ConfigurationResponseError().logError$vungle_ads_release());
                return;
            }
            ConfigManager.INSTANCE.initWithConfig(configPayloadBody);
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            });
            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
            AnalyticsClient.INSTANCE.init$vungle_ads_release(m912configure$lambda5(lazy), m913configure$lambda6(lazy2).getLOGGER_EXECUTOR(), ConfigManager.INSTANCE.getLogLevel(), ConfigManager.INSTANCE.getMetricsEnabled(), m914configure$lambda7(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final SignalManager invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(SignalManager.class);
                }
            })));
            if (!ConfigManager.INSTANCE.validateEndpoints()) {
                onInitError(callback, new ConfigurationError());
                return;
            }
            ServiceLocator.Companion companion4 = ServiceLocator.INSTANCE;
            Lazy lazy3 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final FilePreferences invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                }
            });
            String configExtension = configPayloadBody.getConfigExtension();
            ConfigManager.INSTANCE.updateConfigExtension(configExtension);
            String str = configExtension;
            if (str == null || str.length() == 0) {
                m915configure$lambda8(lazy3).remove(Cookie.CONFIG_EXTENSION).apply();
            } else {
                m915configure$lambda8(lazy3).put(Cookie.CONFIG_EXTENSION, configExtension).apply();
            }
            if (ConfigManager.INSTANCE.omEnabled()) {
                ServiceLocator.Companion companion5 = ServiceLocator.INSTANCE;
                m908configure$lambda10(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OMInjector>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final OMInjector invoke() {
                        return ServiceLocator.INSTANCE.getInstance(context).getService(OMInjector.class);
                    }
                })).init();
            }
            if (ConfigManager.INSTANCE.placements() == null) {
                onInitError(callback, new ConfigurationError());
                return;
            }
            PrivacyManager.INSTANCE.updateDisableAdId(ConfigManager.INSTANCE.shouldDisableAdId());
            ServiceLocator.Companion companion6 = ServiceLocator.INSTANCE;
            Lazy lazy4 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<JobRunner>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final JobRunner invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
                }
            });
            m909configure$lambda11(lazy4).execute(CleanupJob.Companion.makeJobInfo$default(CleanupJob.INSTANCE, null, 1, null));
            m909configure$lambda11(lazy4).execute(ResendTpatJob.INSTANCE.makeJobInfo());
            this.isInitialized = true;
            onInitSuccess(callback);
            ServiceLocator.Companion companion7 = ServiceLocator.INSTANCE;
            Lazy lazy5 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<PathProvider>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final PathProvider invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(PathProvider.class);
                }
            });
            ServiceLocator.Companion companion8 = ServiceLocator.INSTANCE;
            MraidJsLoader.downloadJs$default(MraidJsLoader.INSTANCE, m910configure$lambda12(lazy5), m911configure$lambda13(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Downloader>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.Downloader, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Downloader invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Downloader.class);
                }
            })), m913configure$lambda6(lazy2).getBACKGROUND_EXECUTOR(), null, 8, null);
        } catch (Throwable th) {
            this.isInitialized = false;
            Logger.INSTANCE.e(TAG, "Cannot finish init", th);
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                onInitError(callback, new NetworkUnreachable().logError$vungle_ads_release());
            } else if (th instanceof VungleError) {
                onInitError(callback, th);
            } else {
                onInitError(callback, new UnknownConfigurationError().logError$vungle_ads_release());
            }
        }
    }

    /* renamed from: configure$lambda-5, reason: not valid java name */
    private static final VungleApiClient m912configure$lambda5(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-6, reason: not valid java name */
    private static final Executors m913configure$lambda6(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-7, reason: not valid java name */
    private static final SignalManager m914configure$lambda7(Lazy<SignalManager> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-8, reason: not valid java name */
    private static final FilePreferences m915configure$lambda8(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-10, reason: not valid java name */
    private static final OMInjector m908configure$lambda10(Lazy<OMInjector> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-11, reason: not valid java name */
    private static final JobRunner m909configure$lambda11(Lazy<? extends JobRunner> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-12, reason: not valid java name */
    private static final PathProvider m910configure$lambda12(Lazy<PathProvider> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-13, reason: not valid java name */
    private static final Downloader m911configure$lambda13(Lazy<? extends Downloader> lazy) {
        return lazy.getValue();
    }

    private final void onInitError(final InitializationListener initCallback, final VungleError exception) {
        this.isInitializing.set(false);
        ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.internal.VungleInitializer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VungleInitializer.m921onInitError$lambda14(initCallback, exception);
            }
        });
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + exception.getCode();
        }
        Logger.INSTANCE.e(TAG, localizedMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInitError$lambda-14, reason: not valid java name */
    public static final void m921onInitError$lambda14(InitializationListener initCallback, VungleError exception) {
        Intrinsics.checkNotNullParameter(initCallback, "$initCallback");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        initCallback.onError(exception);
    }

    private final void onInitSuccess(final InitializationListener initCallback) {
        this.isInitializing.set(false);
        ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.internal.VungleInitializer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VungleInitializer.m922onInitSuccess$lambda15(initCallback);
            }
        });
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release((Metric) this.initRequestToResponseMetric, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : VungleApiClient.INSTANCE.getBASE_URL$vungle_ads_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInitSuccess$lambda-15, reason: not valid java name */
    public static final void m922onInitSuccess$lambda15(InitializationListener initCallback) {
        Intrinsics.checkNotNullParameter(initCallback, "$initCallback");
        Logger.INSTANCE.d(TAG, "onSuccess");
        initCallback.onSuccess();
    }

    /* renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.INSTANCE.deInit();
        VungleApiClient.INSTANCE.reset$vungle_ads_release();
        this.isInitialized = false;
        this.isInitializing.set(false);
    }
}
