package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
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
import com.mbridge.msdk.foundation.same.net.d.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CronetDownloadCallback extends UrlRequest.Callback {
    private static final String TAG = "CronetDownloadCallback";
    private long contentLength;
    private IDatabaseHelper databaseHelper;
    private DownloadMessage<?> downloadMessage;
    private DownloadModel downloadModel;
    private DownloaderReporter.Builder downloadReporter;
    private DownloadRequest<?> downloadRequest;
    private DownloadResponse downloadResponse;
    private String etag;
    private DownloadFileOutputStream outputStream;
    private int responseCode;
    private BlockingQueue<DownloadResponse> responseQueue;
    AtomicBoolean startResponse = new AtomicBoolean(false);
    private ByteArrayOutputStream bytesReceived = null;
    private WritableByteChannel receiveChannel = null;

    private boolean isSuccessful(int i) {
        return i >= 200 && i < 300;
    }

    public CronetDownloadCallback(DownloadResponse downloadResponse, DownloadRequest<?> downloadRequest, DownloadMessage<?> downloadMessage, IDatabaseHelper iDatabaseHelper, DownloadModel downloadModel, DownloaderReporter.Builder builder) {
        this.downloadResponse = downloadResponse;
        this.downloadRequest = downloadRequest;
        this.downloadMessage = downloadMessage;
        this.databaseHelper = iDatabaseHelper;
        this.downloadModel = downloadModel;
        this.downloadReporter = builder;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        if (urlRequest == null) {
            return;
        }
        try {
            urlRequest.followRedirect();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a(TAG, "onRedirectReceived error: ", e);
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        if (urlRequest == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.startResponse;
        if (atomicBoolean != null && !atomicBoolean.get() && this.responseQueue != null) {
            DownloadResponse downloadResponse = new DownloadResponse();
            downloadResponse.setResponseStart(true);
            this.responseQueue.add(downloadResponse);
            DownloadRequest<?> downloadRequest = this.downloadRequest;
            if (downloadRequest != null) {
                downloadRequest.putExtraData("responseHeaders", getResponseHeadersWithJSON(urlResponseInfo));
            }
        }
        if (checkDownloadRequestInfo(urlRequest, urlResponseInfo)) {
            try {
                GlobalComponent.getInstance().getLogger().log(TAG, "onResponseStarted");
                String saveFileName = this.downloadMessage.getSaveFileName();
                DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(this.downloadRequest.getCacheDirectoryPath(), saveFileName));
                this.outputStream = downloadFileOutputStream;
                downloadFileOutputStream.seek(this.downloadRequest.getDownloadedBytes());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                this.bytesReceived = byteArrayOutputStream;
                this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
                urlRequest.read(ByteBuffer.allocateDirect(GlobalComponent.getInstance().getByteBufferSize()));
                return;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a(TAG, "onResponseStarted error: ", e);
                }
                cancelRequestSafety(urlRequest);
                return;
            }
        }
        GlobalComponent.getInstance().getLogger().log(TAG, "onResponseStarted failed");
        cancelRequestSafety(urlRequest);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        if (urlRequest == null || urlResponseInfo == null || byteBuffer == null) {
            return;
        }
        try {
            byteBuffer.flip();
            this.receiveChannel.write(byteBuffer);
            byte[] byteArray = this.bytesReceived.toByteArray();
            int length = byteArray.length;
            this.outputStream.write(byteArray, 0, length);
            this.outputStream.flushAndSync();
            DownloadRequest<?> downloadRequest = this.downloadRequest;
            downloadRequest.setDownloadedBytes(downloadRequest.getDownloadedBytes() + length);
            int downloadRate = Utils.getDownloadRate(this.downloadRequest.getTotalBytes(), this.downloadRequest.getDownloadedBytes());
            DownloadRequest<?> downloadRequest2 = this.downloadRequest;
            sendProgress(downloadRequest2, this.downloadMessage, downloadRequest2.getDownloadedBytes(), this.downloadRequest.getTotalBytes(), downloadRate);
            if (this.downloadMessage.getDownloadRate() != 100 && downloadRate >= this.downloadMessage.getDownloadRate()) {
                cancelRequestSafety(urlRequest);
            } else if (this.downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                this.downloadResponse.setCancelled(true);
                cancelRequestSafety(urlRequest);
            } else {
                this.bytesReceived.flush();
                this.bytesReceived.reset();
                byteBuffer.clear();
                urlRequest.read(byteBuffer);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a(TAG, "onReadCompleted error: ", e);
            }
            cancelRequestSafety(urlRequest);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        GlobalComponent.getInstance().getLogger().log(TAG, "onSucceeded");
        insertDownloadInfo(this.downloadRequest.getDownloadId(), this.downloadRequest.getCacheDirectoryPath());
        if (this.responseQueue != null) {
            DownloadResponse downloadResponse = new DownloadResponse();
            downloadResponse.setSuccessful(true);
            this.responseQueue.add(downloadResponse);
        }
    }

    private void insertDownloadInfo(String str, String str2) {
        IDatabaseHelper databaseHelper = GlobalComponent.getInstance().getDatabaseHelper();
        String downloadUrl = this.downloadMessage.getDownloadUrl();
        String resourceUrl = this.downloadMessage.getResourceUrl();
        String str3 = this.etag;
        String saveFileName = this.downloadMessage.getSaveFileName();
        long totalBytes = this.downloadRequest.getTotalBytes();
        long downloadedBytes = this.downloadRequest.getDownloadedBytes();
        int downloadRate = this.downloadMessage.getDownloadRate();
        DownloadModel downloadModel = this.downloadModel;
        databaseHelper.updateProgress(str, str2, DownloadModel.create(str, downloadUrl, resourceUrl, str3, str2, saveFileName, totalBytes, downloadedBytes, downloadRate, downloadModel == null ? 0 : downloadModel.getUsageCounter(), this.downloadMessage.getDownloadResourceType()));
        if (this.downloadResponse.isCancelled()) {
            return;
        }
        this.downloadResponse.setSuccessful(true);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        GlobalComponent.getInstance().getLogger().log(TAG, "onFailed");
        try {
            if (Objects.isNotNull(this.databaseHelper) && Objects.isNotNull(this.downloadRequest)) {
                if (!af.a().a("r_f_s_d_e", true)) {
                    this.databaseHelper.remove(this.downloadRequest.getDownloadId(), this.downloadRequest.getCacheDirectoryPath());
                    MBResourceManager.getInstance().deleteFile(new File(this.downloadRequest.getCacheDirectoryPath() + this.downloadMessage.getSaveFileName()));
                }
                this.downloadRequest.setDownloadedBytes(0L);
                this.downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(TAG, e.getMessage());
        }
        this.downloadResponse.setError(cronetException);
        if (this.responseQueue != null) {
            this.downloadResponse.setFailed(true);
            this.responseQueue.add(this.downloadResponse);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        GlobalComponent.getInstance().getLogger().log(TAG, "onCanceled");
        super.onCanceled(urlRequest, urlResponseInfo);
        insertDownloadInfo(this.downloadRequest.getDownloadId(), this.downloadRequest.getCacheDirectoryPath());
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }

    private String getResponseHeadersWithJSON(UrlResponseInfo urlResponseInfo) {
        String string = "";
        if (urlResponseInfo == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", urlResponseInfo.getUrl());
            jSONObject.put("statusCode", urlResponseInfo.getHttpStatusCode());
            jSONObject.put("protocol", urlResponseInfo.getNegotiatedProtocol());
            List<Map.Entry<String, String>> allHeadersAsList = urlResponseInfo.getAllHeadersAsList();
            if (allHeadersAsList == null) {
                jSONObject.put("headers", "");
                string = jSONObject.toString();
            } else {
                for (Map.Entry<String, String> entry : allHeadersAsList) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return string;
        }
    }

    private boolean checkDownloadRequestInfo(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        String downloadId = this.downloadRequest.getDownloadId();
        String cacheDirectoryPath = this.downloadRequest.getCacheDirectoryPath();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        this.responseCode = httpStatusCode;
        this.downloadReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(httpStatusCode));
        if (isSuccessful(this.responseCode)) {
            this.contentLength = getContentLength(urlResponseInfo);
            this.etag = getETagFromHeader(urlResponseInfo.getAllHeadersAsList());
            handlerDownloadResume(downloadId, cacheDirectoryPath);
            if (this.contentLength <= 0) {
                this.downloadResponse.setError(new IOException("response content length is null"));
                return false;
            }
            if (this.downloadRequest.getTotalBytes() == 0) {
                this.downloadRequest.setTotalBytes(this.contentLength);
            }
            handlerDownloadModel(cacheDirectoryPath);
            return true;
        }
        this.downloadResponse.setError(new IOException("responseCode " + this.responseCode));
        return false;
    }

    private static void cancelRequestSafety(UrlRequest urlRequest) {
        try {
            urlRequest.cancel();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a(TAG, "cancelRequest error: ", e);
            }
        }
    }

    private int getContentLength(UrlResponseInfo urlResponseInfo) {
        List<String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null) {
            return 0;
        }
        return Integer.parseInt(list.get(0));
    }

    private String getETagFromHeader(List<Map.Entry<String, String>> list) {
        List<b> responseHeaders = getResponseHeaders(list);
        if (responseHeaders.isEmpty()) {
            return "";
        }
        for (b bVar : responseHeaders) {
            if (bVar != null) {
                String strA = bVar.a();
                if (!TextUtils.isEmpty(strA) && strA.equalsIgnoreCase("ETag")) {
                    return bVar.b();
                }
            }
        }
        return "";
    }

    private void handlerDownloadResume(String str, String str2) {
        boolean z = !isSupportResume(this.responseCode, this.downloadModel);
        DownloadRequest<?> downloadRequest = this.downloadRequest;
        boolean z2 = downloadRequest != null && this.responseCode == 206 && downloadRequest.getTotalBytes() > 0 && this.contentLength != this.downloadRequest.getTotalBytes() - this.downloadRequest.getDownloadedBytes();
        if (z && z2) {
            this.downloadRequest.setDownloadedBytes(0L);
            this.downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this.databaseHelper)) {
                this.databaseHelper.remove(str, str2);
            }
            this.downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this.downloadRequest.getCacheDirectoryPath() + this.downloadMessage.getSaveFileName()));
        }
    }

    private void handlerDownloadModel(String str) {
        if (Objects.isNull(this.downloadModel)) {
            DownloadModel downloadModelCreate = DownloadModel.create(this.downloadRequest.getDownloadId(), this.downloadMessage.getDownloadUrl(), this.downloadMessage.getResourceUrl(), this.etag, str, this.downloadMessage.getSaveFileName(), this.downloadRequest.getTotalBytes(), 0L, this.downloadMessage.getDownloadRate(), 1, this.downloadMessage.getDownloadResourceType());
            this.downloadModel = downloadModelCreate;
            this.databaseHelper.insert(downloadModelCreate);
        } else {
            DownloadModel downloadModelCreate2 = DownloadModel.create(this.downloadModel.getDownloadId(), this.downloadModel.getDownloadUrl(), this.downloadMessage.getResourceUrl(), this.downloadModel.getEtag(), this.downloadModel.getSaveDirectorPath(), this.downloadModel.getSaveFileName(), this.downloadRequest.getTotalBytes(), this.downloadModel.getDownloadedBytes(), this.downloadMessage.getDownloadRate(), this.downloadModel.getUsageCounter() + 1, this.downloadMessage.getDownloadResourceType());
            this.downloadModel = downloadModelCreate2;
            this.databaseHelper.update(downloadModelCreate2, str);
        }
    }

    private List<b> getResponseHeaders(List<Map.Entry<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Map.Entry<String, String> entry : list) {
                arrayList.add(new b(entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        return i == 206 && !TextUtils.isEmpty(this.etag) && (downloadModel == null || TextUtils.equals(this.etag, downloadModel.getEtag()));
    }

    public void setBlockingQueue(BlockingQueue<DownloadResponse> blockingQueue) {
        this.responseQueue = blockingQueue;
    }
}
