package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    final CrashlyticsCore core;

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred<CrashlyticsNativeComponent> deferred, Deferred<AnalyticsConnector> deferred2, Deferred<FirebaseRemoteConfigInterop> deferred3) throws Resources.NotFoundException {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        Logger.getLogger().i("Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName);
        FileStore fileStore = new FileStore(applicationContext);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        ExecutorService executorServiceBuildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler");
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
        final CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, executorServiceBuildSingleThreadExecutorService, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3));
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
        List<BuildIdInfo> buildIdInfo = CommonUtils.getBuildIdInfo(applicationContext);
        Logger.getLogger().d("Mapping file ID is: " + mappingFileId);
        for (BuildIdInfo buildIdInfo2 : buildIdInfo) {
            Logger.getLogger().d(String.format("Build id for %s on %s: %s", buildIdInfo2.getLibraryName(), buildIdInfo2.getArch(), buildIdInfo2.getBuildId()));
        }
        try {
            AppData appDataCreate = AppData.create(applicationContext, idManager, applicationId, mappingFileId, buildIdInfo, new DevelopmentPlatformProvider(applicationContext));
            Logger.getLogger().v("Installer package name is: " + appDataCreate.installerPackageName);
            ExecutorService executorServiceBuildSingleThreadExecutorService2 = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
            final SettingsController settingsControllerCreate = SettingsController.create(applicationContext, applicationId, idManager, new HttpRequestFactory(), appDataCreate.versionCode, appDataCreate.versionName, fileStore, dataCollectionArbiter);
            settingsControllerCreate.loadSettingsData(executorServiceBuildSingleThreadExecutorService2).continueWith(executorServiceBuildSingleThreadExecutorService2, new Continuation<Void, Object>() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics.1
                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task<Void> task) throws Exception {
                    if (task.isSuccessful()) {
                        return null;
                    }
                    Logger.getLogger().e("Error fetching settings.", task.getException());
                    return null;
                }
            });
            final boolean zOnPreExecute = crashlyticsCore.onPreExecute(appDataCreate, settingsControllerCreate);
            Tasks.call(executorServiceBuildSingleThreadExecutorService2, new Callable<Void>() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics.2
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    if (!zOnPreExecute) {
                        return null;
                    }
                    crashlyticsCore.doBackgroundInitializationAsync(settingsControllerCreate);
                    return null;
                }
            });
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().e("Error retrieving app package info.", e);
            return null;
        }
    }

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        Objects.requireNonNull(firebaseCrashlytics, "FirebaseCrashlytics component is not present.");
        return firebaseCrashlytics;
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th);
        }
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }

    public void setCustomKey(String str, boolean z) {
        this.core.setCustomKey(str, Boolean.toString(z));
    }

    public void setCustomKey(String str, double d) {
        this.core.setCustomKey(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.core.setCustomKey(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i) {
        this.core.setCustomKey(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.core.setCustomKey(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }

    public void setCustomKeys(CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.keysAndValues);
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z));
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }
}
