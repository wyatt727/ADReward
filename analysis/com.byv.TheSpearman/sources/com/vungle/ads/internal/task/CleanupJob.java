package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.json.sdk.controller.f;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CleanupJob.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob;", "Lcom/vungle/ads/internal/task/Job;", "context", "Landroid/content/Context;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "checkIfSdkUpgraded", "", "dropV6Data", "dropV700Data", "dropV730TempData", "onRunJob", "", "bundle", "Landroid/os/Bundle;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "Companion", "vungle-ads_release", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class CleanupJob implements Job {
    private static final String AD_ID_KEY = "AD_ID_KEY";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final PathProvider pathProvider;

    public CleanupJob(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        File downloadsDirForAd;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        File downloadDir = this.pathProvider.getDownloadDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = downloadDir;
        }
        Logger.INSTANCE.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (Intrinsics.areEqual(downloadsDirForAd, downloadDir)) {
                checkIfSdkUpgraded();
                FileUtility.deleteContents(downloadsDirForAd);
                return 0;
            }
            FileUtility.delete(downloadsDirForAd);
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }

    private final void dropV6Data() {
        File filesDir;
        Logger.INSTANCE.d(TAG, "CleanupJob: drop old files data");
        File file = Build.VERSION.SDK_INT >= 21 ? new File(this.context.getNoBackupFilesDir(), "vungle_db") : null;
        if (file != null && file.exists()) {
            FileUtility.delete(file);
            FileUtility.delete(new File(file.getPath() + "-journal"));
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String string = sharedPreferences.getString("cache_path", null);
        if (Build.VERSION.SDK_INT >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            sharedPreferences.edit().clear().apply();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            filesDir = this.context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "{\n            context.noBackupFilesDir\n        }");
        } else {
            filesDir = this.context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "{\n            context.filesDir\n        }");
        }
        FileUtility.delete(new File(filesDir, "vungle_settings"));
        if (string != null) {
            FileUtility.delete(new File(string));
        }
    }

    private final void dropV700Data() {
        FileUtility.delete(new File(this.context.getApplicationInfo().dataDir, "vungle"));
    }

    private final void dropV730TempData() {
        try {
            FileUtility.delete(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"));
            FileUtility.delete(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"));
        } catch (Exception unused) {
        }
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.task.CleanupJob$checkIfSdkUpgraded$$inlined$inject$1
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
        int i = m976checkIfSdkUpgraded$lambda3(lazy).getInt("VERSION_CODE", -1);
        if (i < 70302) {
            if (i < 70000) {
                dropV6Data();
            }
            if (i < 70100) {
                dropV700Data();
            }
            if (i < 70301) {
                dropV730TempData();
            }
            m976checkIfSdkUpgraded$lambda3(lazy).put("VERSION_CODE", BuildConfig.VERSION_CODE).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-3, reason: not valid java name */
    private static final FilePreferences m976checkIfSdkUpgraded$lambda3(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* compiled from: CleanupJob.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob$Companion;", "", "()V", CleanupJob.AD_ID_KEY, "", "TAG", "makeJobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", f.b.AD_ID, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ JobInfo makeJobInfo$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.makeJobInfo(str);
        }

        public final JobInfo makeJobInfo(String adId) {
            JobInfo priority = new JobInfo(CleanupJob.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (adId != null) {
                bundle.putString(CleanupJob.AD_ID_KEY, adId);
            }
            return priority.setExtras(bundle).setUpdateCurrent(adId == null);
        }
    }
}
