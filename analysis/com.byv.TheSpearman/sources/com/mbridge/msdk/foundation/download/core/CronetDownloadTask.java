package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.core.DownloaderReporter;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.net.a.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public class CronetDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private String _etag = "";
    private BlockingQueue<DownloadResponse> callbackResults = new ArrayBlockingQueue(2, true);

    private CronetDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new CronetDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() throws Exception {
        DownloadResponse downloadResponsePoll;
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        String str = String.format(Locale.ENGLISH, FORMAT_RANGE, Long.valueOf(downloadedBytes));
        try {
            CronetEngine cronetEngineC = a.a().c();
            CronetDownloadCallback cronetDownloadCallback = new CronetDownloadCallback(this._downloadResponse, this._downloadRequest, this._downloadMessage, this._databaseHelper, this._downloadModel, this._downloaderReporter);
            cronetDownloadCallback.setBlockingQueue(this.callbackResults);
            UrlRequest.Builder builderAllowDirectExecutor = cronetEngineC.newUrlRequestBuilder(downloadUrl, cronetDownloadCallback, a.a().b()).setPriority(getPriority(this._downloadRequest)).setHttpMethod("GET").disableCache().addHeader("User-Agent", Command.DEFAULT_USER_AGENT).addHeader("Range", str).allowDirectExecutor();
            try {
                this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, URI.create(downloadUrl).getHost());
            } catch (Exception unused) {
                this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, "");
            }
            this._downloaderReporter.add("url", downloadUrl);
            long writeTimeout = this._downloadRequest.getWriteTimeout() == 0 ? 30000L : this._downloadRequest.getWriteTimeout();
            long readTimeout = this._downloadRequest.getReadTimeout() != 0 ? this._downloadRequest.getReadTimeout() : 30000L;
            UrlRequest urlRequestBuild = builderAllowDirectExecutor.build();
            urlRequestBuild.start();
            try {
                try {
                    downloadResponsePoll = this.callbackResults.poll(writeTimeout, TimeUnit.MILLISECONDS);
                } catch (Exception e) {
                    handlerException(saveFileName, cacheDirectoryPath, downloadId, e);
                }
                if (downloadResponsePoll == null) {
                    cancelRequest(urlRequestBuild, this._downloadRequest);
                    this.callbackResults.clear();
                    ad.b(IDownloadTask.TAG, "Request cancel because request timeout");
                    throw new IOException("request timeout.");
                }
                if (downloadResponsePoll.isResponseStart()) {
                    downloadResponsePoll = this.callbackResults.poll(readTimeout, TimeUnit.MILLISECONDS);
                }
                if (downloadResponsePoll.isSuccessful()) {
                    this._downloadResponse = downloadResponsePoll;
                }
                if (downloadResponsePoll.isFailed()) {
                    throw new IOException(this._downloadResponse.getErrorMessage());
                }
                if (this._downloadResponse == null) {
                    cancelRequest(urlRequestBuild, this._downloadRequest);
                    this.callbackResults.clear();
                    ad.b(IDownloadTask.TAG, "response cancel because response timeout");
                    throw new IOException("Response timeout.");
                }
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                reportDownloadMessage();
                return this._downloadResponse;
            } catch (Throwable th) {
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                reportDownloadMessage();
                throw th;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.download.core.CronetDownloadTask$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$mbridge$msdk$foundation$download$DownloadPriority;

        static {
            int[] iArr = new int[DownloadPriority.values().length];
            $SwitchMap$com$mbridge$msdk$foundation$download$DownloadPriority = iArr;
            try {
                iArr[DownloadPriority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$foundation$download$DownloadPriority[DownloadPriority.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$foundation$download$DownloadPriority[DownloadPriority.IMMEDIATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private int getPriority(DownloadRequest<?> downloadRequest) {
        int i = AnonymousClass1.$SwitchMap$com$mbridge$msdk$foundation$download$DownloadPriority[downloadRequest.getDownloadPriority().ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 4 : 3;
        }
        return 2;
    }

    private void cancelRequest(UrlRequest urlRequest, DownloadRequest<?> downloadRequest) {
        if (urlRequest != null) {
            urlRequest.cancel();
        }
        if (downloadRequest != null) {
            downloadRequest.cancel(this._downloadMessage);
        }
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!af.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private void reportDownloadMessage() {
        boolean zIsSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(zIsSuccessful));
        boolean zIsCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(zIsCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!zIsSuccessful && !zIsCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        this._downloaderReporter.build().report();
    }
}
