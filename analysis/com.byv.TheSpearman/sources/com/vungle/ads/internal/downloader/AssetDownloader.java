package com.vungle.ads.internal.downloader;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.t2;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;

/* compiled from: AssetDownloader.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\"\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010 \u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "transitioning", "", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "cancel", "", AdActivity.REQUEST_KEY_EXTRA, "cancelAll", "checkSpaceAvailable", "", "decodeGzipIfNeeded", "Lokhttp3/ResponseBody;", "networkResponse", "Lokhttp3/Response;", "deliverError", "downloadRequest", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadError", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "deliverSuccess", t2.h.b, "Ljava/io/File;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, NativeAdPresenter.DOWNLOAD, "isValidUrl", "httpUrl", "", "launchRequest", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final String TAG = "AssetDownloader";
    private static final int TIMEOUT = 30;
    private final VungleThreadPoolExecutor downloadExecutor;
    private OkHttpClient okHttpClient;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.transitioning = new ArrayList();
        OkHttpClient.Builder builderFollowSslRedirects = new OkHttpClient.Builder().readTimeout(30L, TimeUnit.SECONDS).connectTimeout(30L, TimeUnit.SECONDS).cache(null).followRedirects(true).followSslRedirects(true);
        if (ConfigManager.INSTANCE.isCleverCacheEnabled()) {
            long cleverCacheDiskSize = ConfigManager.INSTANCE.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = ConfigManager.INSTANCE.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
            if (jMin > 0) {
                builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
            } else {
                Logger.INSTANCE.w(TAG, "cache disk capacity size <=0, no clever cache active.");
            }
        }
        this.okHttpClient = builderFollowSslRedirects.build();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, downloadListener);
            }

            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m929download$lambda0(this.f$0, downloadRequest, downloadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: download$lambda-0, reason: not valid java name */
    public static final void m929download$lambda0(AssetDownloader this$0, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Cannot complete " + downloadRequest + " : Out of Memory"), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener downloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x055c A[Catch: all -> 0x0642, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x0642, blocks: (B:213:0x051c, B:219:0x055c, B:225:0x0570), top: B:302:0x051c }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0529 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131 A[Catch: all -> 0x0109, Exception -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #30 {Exception -> 0x0118, all -> 0x0109, blocks: (B:32:0x00ff, B:34:0x0105, B:43:0x0131), top: B:325:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v4, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r18v5, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r9v51, types: [okio.BufferedSink] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.DownloadRequest r35, com.vungle.ads.internal.downloader.AssetDownloadListener r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.AssetDownloader.launchRequest(com.vungle.ads.internal.downloader.DownloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener):void");
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody responseBodyBody = networkResponse.body();
        if (!StringsKt.equals(GZIP, Response.header$default(networkResponse, "Content-Encoding", null, 2, null), true) || responseBodyBody == null) {
            return responseBodyBody;
        }
        return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(responseBodyBody.getDelegateSource())));
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener listener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    private final boolean checkSpaceAvailable() {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= 20971520) {
            return true;
        }
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(126, "Insufficient space " + availableBytes, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
        return false;
    }

    private final boolean isValidUrl(String httpUrl) {
        String str = httpUrl;
        return ((str == null || str.length() == 0) || HttpUrl.INSTANCE.parse(httpUrl) == null) ? false : true;
    }
}
