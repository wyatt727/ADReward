package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.core.DownloaderReporter;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.thrid.okhttp.CacheControl;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
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
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private ResponseBody _responseBody;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
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
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() throws IOException {
        Response responseExecute;
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
        OkHttpClient okHttpClientBuild = GlobalComponent.getInstance().getOkHttpClient().newBuilder().connectTimeout(this._downloadRequest.getConnectTimeout(), TimeUnit.MILLISECONDS).readTimeout(this._downloadRequest.getReadTimeout(), TimeUnit.MILLISECONDS).writeTimeout(this._downloadRequest.getWriteTimeout(), TimeUnit.MILLISECONDS).callTimeout(this._downloadRequest.getTimeout(), TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).build();
        Request requestBuild = new Request.Builder().url(downloadUrl).cacheControl(new CacheControl.Builder().noCache().build()).addHeader("Connection", "close").addHeader("Range", String.format(Locale.ENGLISH, FORMAT_RANGE, Long.valueOf(downloadedBytes))).removeHeader("User-Agent").addHeader("User-Agent", Command.DEFAULT_USER_AGENT).build();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, requestBuild.url().host());
        this._downloaderReporter.add("url", downloadUrl);
        Call callNewCall = okHttpClientBuild.newCall(requestBuild);
        try {
            try {
                responseExecute = callNewCall.execute();
            } catch (Exception e) {
                handlerException(saveFileName, cacheDirectoryPath, downloadId, e);
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                Objects.closeResponse(null);
                Objects.closeResponseBody(this._responseBody);
                if (!callNewCall.isCanceled()) {
                }
            }
            if (!Objects.isNull(responseExecute) && !Objects.isNull(responseExecute.body())) {
                int iCode = responseExecute.code();
                this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iCode));
                if (responseExecute.isSuccessful()) {
                    this._etag = responseExecute.header("ETag", "");
                    this._downloadResponse = handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, responseExecute, iCode);
                    Objects.closeInputStream(this._inputStream);
                    Objects.closeOutputStream(this._outputStream);
                    Objects.closeResponse(responseExecute);
                    Objects.closeResponseBody(this._responseBody);
                    if (!callNewCall.isCanceled()) {
                        callNewCall.cancel();
                    }
                    reportDownloadMessage();
                    return this._downloadResponse;
                }
                this._downloadResponse.setError(new IOException(RESPONSE_CODE + iCode + "\n" + responseExecute.body().string()));
                DownloadResponse downloadResponse = this._downloadResponse;
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                Objects.closeResponse(responseExecute);
                Objects.closeResponseBody(this._responseBody);
                if (!callNewCall.isCanceled()) {
                    callNewCall.cancel();
                }
                reportDownloadMessage();
                return downloadResponse;
            }
            this._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
            DownloadResponse downloadResponse2 = this._downloadResponse;
            Objects.closeInputStream(this._inputStream);
            Objects.closeOutputStream(this._outputStream);
            Objects.closeResponse(responseExecute);
            Objects.closeResponseBody(this._responseBody);
            if (!callNewCall.isCanceled()) {
                callNewCall.cancel();
            }
            reportDownloadMessage();
            return downloadResponse2;
        } catch (Throwable th) {
            Objects.closeInputStream(this._inputStream);
            Objects.closeOutputStream(this._outputStream);
            Objects.closeResponse(null);
            Objects.closeResponseBody(this._responseBody);
            if (!callNewCall.isCanceled()) {
                callNewCall.cancel();
            }
            reportDownloadMessage();
            throw th;
        }
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, Response response, int i) throws IllegalAccessException, IOException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean z = !isSupportResume(i, this._downloadModel);
        boolean z2 = (response == null || this._downloadRequest == null || i != 206 || response.body() == null || this._downloadRequest.getTotalBytes() <= 0 || response.body().contentLength() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (z && z2) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        ResponseBody responseBodyBody = response.body();
        this._responseBody = responseBodyBody;
        if (Objects.isNull(responseBodyBody)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long jContentLength = this._responseBody.contentLength();
        if (jContentLength <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(jContentLength);
        }
        InputStream inputStreamByteStream = this._responseBody.byteStream();
        this._inputStream = inputStreamByteStream;
        if (Objects.isNull(inputStreamByteStream)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        return handleInputStream(str, str2, str3, this._etag);
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

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        return i == 206 && !TextUtils.isEmpty(this._etag) && (downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.foundation.download.DownloadResponse handleInputStream(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) throws java.lang.IllegalAccessException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.handleInputStream(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }
}
