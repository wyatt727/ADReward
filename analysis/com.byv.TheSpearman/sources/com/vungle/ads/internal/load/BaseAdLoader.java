package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import com.json.id;
import com.json.t2;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetDownloadError;
import com.vungle.ads.InternalError;
import com.vungle.ads.MraidJsError;
import com.vungle.ads.NativeAdInternal;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.MraidJsLoader;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.ConfigExtension;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.HackMraid;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.UnzipUtility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BaseAdLoader.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b&\u0018\u0000 [2\u00020\u0001:\u0002[\\B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020:2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0013H\u0002J\u0010\u0010A\u001a\u00020B2\u0006\u0010@\u001a\u00020\u0013H\u0002J\u0012\u0010C\u001a\u0004\u0018\u00010?2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0019H\u0002J\u000e\u0010G\u001a\u00020:2\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010H\u001a\u00020=2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010I\u001a\u00020=2\b\u0010J\u001a\u0004\u0018\u00010KH\u0002J\u000e\u0010L\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010M\u001a\u00020:2\u0006\u0010N\u001a\u00020OJ\b\u0010P\u001a\u00020:H&J\b\u0010Q\u001a\u00020:H\u0002J\u001a\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010KH\u0017J\u001a\u0010U\u001a\u00020=2\u0006\u0010V\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010W\u001a\u00020:H$J\u0018\u0010X\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020?H\u0002J\u0012\u0010Z\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\u0019H\u0002R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010)\u001a&\u0012\f\u0012\n +*\u0004\u0018\u00010*0* +*\u0012\u0012\f\u0012\n +*\u0004\u0018\u00010*0*\u0018\u00010,0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u000e\u00106\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006]²\u0006\n\u0010^\u001a\u00020_X\u008a\u0084\u0002²\u0006\n\u0010`\u001a\u00020aX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/load/BaseAdLoader;", "", "context", "Landroid/content/Context;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "adAssets", "", "Lcom/vungle/ads/internal/model/AdAsset;", "adLoaderCallback", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "getAdRequest", "()Lcom/vungle/ads/internal/load/AdRequest;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "assetDownloadDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "assetDownloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getAssetDownloadListener", "()Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getContext", "()Landroid/content/Context;", "downloadCount", "Ljava/util/concurrent/atomic/AtomicLong;", "downloadRequiredCount", "errors", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "kotlin.jvm.PlatformType", "", "mainVideoSizeMetric", "Lcom/vungle/ads/SingleValueMetric;", "notifyFailed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "notifySuccess", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "getSdkExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "templateSizeMetric", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "cancel", "", "downloadAssets", "fileIsValid", "", t2.h.b, "Ljava/io/File;", "adAsset", "getAssetPriority", "Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "getDestinationDir", "getErrorInfo", "Lcom/vungle/ads/internal/load/BaseAdLoader$ErrorInfo;", "adPayload", "handleAdMetaData", "injectOMIfNeeded", "isUrlValid", "url", "", "loadAd", id.b, "error", "Lcom/vungle/ads/VungleError;", "onAdLoadReady", id.f1816a, "onDownloadCompleted", AdActivity.REQUEST_KEY_EXTRA, "advertisementId", "processTemplate", "asset", "requestAd", "unzipFile", "downloadedFile", "validateAdMetadata", "Companion", "ErrorInfo", "vungle-ads_release", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAdLoader {
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<AdAsset> adAssets;
    private AdLoaderCallback adLoaderCallback;
    private final AdRequest adRequest;
    private AdPayload advertisement;
    private TimeIntervalMetric assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final AtomicLong downloadRequiredCount;
    private final Downloader downloader;
    private final List<AssetDownloadListener.DownloadError> errors;
    private SingleValueMetric mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final OMInjector omInjector;
    private final PathProvider pathProvider;
    private final Executors sdkExecutors;
    private SingleValueMetric templateSizeMetric;
    private final VungleApiClient vungleApiClient;

    public abstract void onAdLoadReady();

    protected abstract void requestAd();

    public BaseAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredCount = new AtomicLong(0L);
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.errors = Collections.synchronizedList(new ArrayList());
        this.mainVideoSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_ZIP_SIZE);
        this.assetDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
    }

    public final Context getContext() {
        return this.context;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final AdRequest getAdRequest() {
        return this.adRequest;
    }

    /* renamed from: getAdvertisement$vungle_ads_release, reason: from getter */
    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new BaseAdLoader$assetDownloadListener$1(this);
    }

    public final void loadAd(final AdLoaderCallback adLoaderCallback) {
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.sdkExecutors.getBACKGROUND_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader.m938loadAd$lambda0(this.f$0, adLoaderCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m938loadAd$lambda0(final BaseAdLoader this$0, final AdLoaderCallback adLoaderCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adLoaderCallback, "$adLoaderCallback");
        MraidJsLoader.INSTANCE.downloadJs(this$0.pathProvider, this$0.downloader, this$0.sdkExecutors.getBACKGROUND_EXECUTOR(), new MraidJsLoader.DownloadResultListener() { // from class: com.vungle.ads.internal.load.BaseAdLoader$loadAd$1$1
            @Override // com.vungle.ads.internal.load.MraidJsLoader.DownloadResultListener
            public void onDownloadResult(int downloadResult) {
                if (downloadResult == 10 || downloadResult == 13) {
                    if (downloadResult == 10) {
                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.MRAID_DOWNLOAD_JS_RETRY_SUCCESS, (34 & 2) != 0 ? 0L : 0L, (34 & 4) != 0 ? null : this.this$0.getAdRequest().getPlacement().getReferenceId(), (34 & 8) != 0 ? null : null, (34 & 16) != 0 ? null : null, (34 & 32) == 0 ? null : null);
                    }
                    this.this$0.requestAd();
                    return;
                }
                adLoaderCallback.onFailure(new MraidJsError(null, 1, null));
            }
        });
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    private final void downloadAssets(AdPayload advertisement) {
        this.assetDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        AtomicLong atomicLong = this.downloadRequiredCount;
        List<AdAsset> list = this.adAssets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AdAsset) obj).getIsRequired()) {
                arrayList.add(obj);
            }
        }
        atomicLong.set(arrayList.size());
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset, this.adRequest.getPlacement().getReferenceId(), advertisement.getCreativeId(), advertisement.eventId());
            if (downloadRequest.isTemplate()) {
                downloadRequest.startRecord();
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    public final void onAdLoadFailed(VungleError error) {
        AdLoaderCallback adLoaderCallback;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (adLoaderCallback = this.adLoaderCallback) == null) {
            return;
        }
        adLoaderCallback.onFailure(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdReady() {
        AdPayload adPayload = this.advertisement;
        if (adPayload == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        onAdLoadReady();
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(adPayload);
        }
    }

    private final boolean isUrlValid(String url) {
        String str = url;
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(url) || URLUtil.isHttpUrl(url);
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final boolean unzipFile(AdPayload advertisement, File downloadedFile) throws Throwable {
        final ArrayList arrayList = new ArrayList();
        for (AdAsset adAsset : this.adAssets) {
            if (adAsset.getFileType() == AdAsset.FileType.ASSET) {
                arrayList.add(adAsset.getLocalPath());
            }
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            throw new IOException("Unable to access Destination Directory");
        }
        try {
            UnzipUtility unzipUtility = UnzipUtility.INSTANCE;
            String path = downloadedFile.getPath();
            String path2 = destinationDir.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "destinationDir.path");
            unzipUtility.unzip(path, path2, new UnzipUtility.Filter() { // from class: com.vungle.ads.internal.load.BaseAdLoader.unzipFile.1
                @Override // com.vungle.ads.internal.util.UnzipUtility.Filter
                public boolean matches(String extractPath) {
                    String str = extractPath;
                    if (str == null || str.length() == 0) {
                        return true;
                    }
                    File file = new File(extractPath);
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = new File(it.next());
                        if (Intrinsics.areEqual(file2, file)) {
                            return false;
                        }
                        String path3 = file.getPath();
                        Intrinsics.checkNotNullExpressionValue(path3, "toExtract.path");
                        if (StringsKt.startsWith$default(path3, file2.getPath() + File.separator, false, 2, (Object) null)) {
                            return false;
                        }
                    }
                    return true;
                }
            });
            if (!new File(destinationDir.getPath() + File.separator + "index.html").exists()) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(115, "Failed to retrieve indexFileUrl from the Ad.", this.adRequest.getPlacement().getReferenceId(), advertisement.getCreativeId(), advertisement.eventId());
                return false;
            }
            if (Intrinsics.areEqual(downloadedFile.getName(), "template")) {
                File file = new File(destinationDir.getPath() + File.separator + "mraid.js");
                if (!file.exists() && !file.createNewFile()) {
                    throw new IOException("mraid.js can not be created");
                }
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                HackMraid.INSTANCE.apply(this.pathProvider, printWriter);
                printWriter.close();
            }
            FileUtility.printDirectoryTree(destinationDir);
            FileUtility.delete(downloadedFile);
            return true;
        } catch (Exception e) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(109, "Unzip failed: " + e.getMessage(), this.adRequest.getPlacement().getReferenceId(), advertisement.getCreativeId(), advertisement.eventId());
            return false;
        }
    }

    private final File getDestinationDir(AdPayload advertisement) {
        return this.pathProvider.getDownloadsDirForAd(advertisement.eventId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean injectOMIfNeeded(AdPayload advertisement) {
        if (advertisement == null) {
            return false;
        }
        if (!advertisement.omEnabled()) {
            return true;
        }
        try {
            File destinationDir = getDestinationDir(advertisement);
            if (destinationDir != null && destinationDir.isDirectory()) {
                this.omInjector.injectJsFiles(destinationDir);
                return true;
            }
            onAdLoadFailed(new AssetDownloadError());
            return false;
        } catch (IOException unused) {
            onAdLoadFailed(new AssetDownloadError());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processTemplate(AdAsset asset, AdPayload advertisement) {
        if (advertisement == null || asset.getStatus() != AdAsset.Status.DOWNLOAD_SUCCESS) {
            return false;
        }
        if (asset.getLocalPath().length() == 0) {
            return false;
        }
        File file = new File(asset.getLocalPath());
        if (fileIsValid(file, asset)) {
            return asset.getFileType() != AdAsset.FileType.ZIP || unzipFile(advertisement, file);
        }
        return false;
    }

    public void onDownloadCompleted(AdRequest request, String advertisementId) {
        Intrinsics.checkNotNullParameter(request, "request");
        Logger.INSTANCE.d(TAG, "download completed " + request);
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AdPayload adPayload2 = this.advertisement;
        String strPlacementId = adPayload2 != null ? adPayload2.placementId() : null;
        AdPayload adPayload3 = this.advertisement;
        String creativeId = adPayload3 != null ? adPayload3.getCreativeId() : null;
        AdPayload adPayload4 = this.advertisement;
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.assetDownloadDurationMetric, strPlacementId, creativeId, adPayload4 != null ? adPayload4.eventId() : null, (String) null, 16, (Object) null);
    }

    public final void handleAdMetaData(AdPayload advertisement) {
        List<String> loadAdUrls;
        String configExt;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        ErrorInfo errorInfoValidateAdMetadata = validateAdMetadata(advertisement);
        if (errorInfoValidateAdMetadata != null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(errorInfoValidateAdMetadata.getReason(), errorInfoValidateAdMetadata.getDescription(), this.adRequest.getPlacement().getReferenceId(), advertisement.getCreativeId(), advertisement.eventId());
            onAdLoadFailed(new InternalError(errorInfoValidateAdMetadata.getReason(), errorInfoValidateAdMetadata.getDescriptionExternal()));
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$handleAdMetaData$$inlined$inject$1
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
        ConfigExtension config = advertisement.getConfig();
        if (config != null && (configExt = config.getConfigExt()) != null) {
            ConfigManager.INSTANCE.updateConfigExtension(configExt);
            m936handleAdMetaData$lambda3(lazy).put(Cookie.CONFIG_EXTENSION, configExt).apply();
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetDownloadError());
            return;
        }
        ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
        final Context context2 = this.context;
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$handleAdMetaData$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(SignalManager.class);
            }
        });
        AdPayload.AdUnit adUnit = advertisement.adUnit();
        if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
            TpatSender tpatSender = new TpatSender(this.vungleApiClient, advertisement.placementId(), advertisement.getCreativeId(), advertisement.eventId(), this.sdkExecutors.getIO_EXECUTOR(), this.pathProvider, m937handleAdMetaData$lambda6(lazy2));
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                tpatSender.sendTpat((String) it.next(), this.sdkExecutors.getJOB_EXECUTOR());
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        downloadAssets(advertisement);
    }

    /* renamed from: handleAdMetaData$lambda-3, reason: not valid java name */
    private static final FilePreferences m936handleAdMetaData$lambda3(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* renamed from: handleAdMetaData$lambda-6, reason: not valid java name */
    private static final SignalManager m937handleAdMetaData$lambda6(Lazy<SignalManager> lazy) {
        return lazy.getValue();
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        if (adAsset.getIsRequired()) {
            return DownloadRequest.Priority.CRITICAL;
        }
        return DownloadRequest.Priority.HIGHEST;
    }

    private final ErrorInfo validateAdMetadata(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        if ((adUnit != null ? adUnit.getSleep() : null) != null) {
            return getErrorInfo(adPayload);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        AdPayload adPayload2 = this.advertisement;
        if (!Intrinsics.areEqual(referenceId, adPayload2 != null ? adPayload2.placementId() : null)) {
            return new ErrorInfo(215, "The ad response is missing placement reference id.", null, false, 12, null);
        }
        List<String> supportedTemplateTypes = this.adRequest.getPlacement().getSupportedTemplateTypes();
        AdPayload adPayload3 = this.advertisement;
        if (!CollectionsKt.contains(supportedTemplateTypes, adPayload3 != null ? adPayload3.templateType() : null)) {
            return new ErrorInfo(216, "The ad response has an unexpected template type.", null, false, 12, null);
        }
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        AdPayload.TemplateSettings templateSettings = adUnit2 != null ? adUnit2.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new ErrorInfo(113, "Missing assets URLs", null, false, 12, null);
        }
        Map<String, AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!adPayload.isNativeTemplateType()) {
            AdPayload.AdUnit adUnit3 = adPayload.adUnit();
            String templateURL = adUnit3 != null ? adUnit3.getTemplateURL() : null;
            String str = templateURL;
            if (str == null || str.length() == 0) {
                return new ErrorInfo(105, "Failed to prepare URL for template download.", null, false, 12, null);
            }
            if (!isUrlValid(templateURL)) {
                return new ErrorInfo(112, "Failed to load template asset.", null, false, 12, null);
            }
        } else if (cacheableReplacements != null) {
            AdPayload.CacheableReplacement cacheableReplacement = cacheableReplacements.get(NativeAdInternal.TOKEN_MAIN_IMAGE);
            if ((cacheableReplacement != null ? cacheableReplacement.getUrl() : null) == null) {
                return new ErrorInfo(600, "Unable to load main image.", null, false, 12, null);
            }
            AdPayload.CacheableReplacement cacheableReplacement2 = cacheableReplacements.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_ICON_URL);
            if ((cacheableReplacement2 != null ? cacheableReplacement2.getUrl() : null) == null) {
                return new ErrorInfo(600, "Unable to load privacy image.", null, false, 12, null);
            }
        }
        if (adPayload.hasExpired()) {
            return new ErrorInfo(304, "The ad markup has expired for playback.", null, false, 12, null);
        }
        String strEventId = adPayload.eventId();
        if (strEventId == null || strEventId.length() == 0) {
            return new ErrorInfo(200, "Event id is invalid.", null, false, 12, null);
        }
        if (cacheableReplacements != null) {
            Iterator<Map.Entry<String, AdPayload.CacheableReplacement>> it = cacheableReplacements.entrySet().iterator();
            while (it.hasNext()) {
                String url = it.next().getValue().getUrl();
                String str2 = url;
                if (str2 == null || str2.length() == 0) {
                    return new ErrorInfo(111, "Invalid asset URL " + url, null, false, 12, null);
                }
                if (!isUrlValid(url)) {
                    return new ErrorInfo(112, "Invalid asset URL " + url, null, false, 12, null);
                }
            }
        }
        return null;
    }

    private final ErrorInfo getErrorInfo(AdPayload adPayload) {
        Integer errorCode;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        int iIntValue = (adUnit == null || (errorCode = adUnit.getErrorCode()) == null) ? 212 : errorCode.intValue();
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        Integer sleep = adUnit2 != null ? adUnit2.getSleep() : null;
        AdPayload.AdUnit adUnit3 = adPayload.adUnit();
        String info = adUnit3 != null ? adUnit3.getInfo() : null;
        if (iIntValue == 10001 || iIntValue == 10002 || iIntValue == 20001 || iIntValue == 30001 || iIntValue == 30002) {
            return new ErrorInfo(iIntValue, "Response error: " + sleep, "Request failed with error: " + iIntValue + ", " + info, false, 8, null);
        }
        return new ErrorInfo(212, "Response error: " + sleep, "Request failed with error: 212, " + info, false, 8, null);
    }

    /* compiled from: BaseAdLoader.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/load/BaseAdLoader$ErrorInfo;", "", "reason", "", "description", "", "descriptionExternal", "errorIsTerminal", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getDescriptionExternal", "getErrorIsTerminal", "()Z", "getReason", "()I", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ErrorInfo {
        private final String description;
        private final String descriptionExternal;
        private final boolean errorIsTerminal;
        private final int reason;

        public ErrorInfo(int i, String description, String descriptionExternal, boolean z) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(descriptionExternal, "descriptionExternal");
            this.reason = i;
            this.description = description;
            this.descriptionExternal = descriptionExternal;
            this.errorIsTerminal = z;
        }

        public /* synthetic */ ErrorInfo(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? str : str2, (i2 & 8) != 0 ? false : z);
        }

        public final int getReason() {
            return this.reason;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDescriptionExternal() {
            return this.descriptionExternal;
        }

        public final boolean getErrorIsTerminal() {
            return this.errorIsTerminal;
        }
    }
}
