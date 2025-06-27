package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public class DownloadRequest<T> {
    private static final String TAG = "DownloadRequest";
    private int cacheDirectorPathType;
    private String cacheDirectoryPath;
    private long connectTimeout;
    private String directoryPathExternal;
    private String directoryPathInternal;
    private String downloadId;
    private DownloadMessage<T> downloadMessage;
    private DownloadPriority downloadPriority;
    private long downloadedBytes;
    private Map<String, String> extraMap;
    private Future future;
    private HashMap<String, List<String>> headerMap;
    private volatile OnDownloadStateListener onDownloadListener;
    private volatile OnProgressStateListener onProgressListener;
    private long readTimeout;
    private int retry;
    private int sequence;
    private DownloadStatus status;
    private long timeout;
    private String userAgent;
    private long writeTimeout;
    private volatile int retryedCount = 0;
    private long totalBytes = 0;

    DownloadRequest(DownloadRequestBuilder<T> downloadRequestBuilder) {
        this.headerMap = downloadRequestBuilder.headerMap;
        this.downloadPriority = downloadRequestBuilder.downloadPriority;
        this.readTimeout = downloadRequestBuilder.readTimeout;
        this.connectTimeout = downloadRequestBuilder.connectTimeout;
        this.userAgent = downloadRequestBuilder.userAgent;
        this.downloadMessage = downloadRequestBuilder.downloadMessage;
        this.writeTimeout = downloadRequestBuilder.writeTimeout;
        this.onDownloadListener = downloadRequestBuilder.downloadStateListener;
        this.onProgressListener = downloadRequestBuilder.progressStateListener;
        this.directoryPathExternal = downloadRequestBuilder.directoryPathExternal;
        this.directoryPathInternal = downloadRequestBuilder.directoryPathInternal;
        this.retry = downloadRequestBuilder.retry;
        this.timeout = downloadRequestBuilder.timeout;
        this.extraMap = downloadRequestBuilder.extraMap;
    }

    public static DownloadRequest create(DownloadRequestBuilder downloadRequestBuilder) {
        return new DownloadRequest(downloadRequestBuilder);
    }

    public void cancel(DownloadMessage<T> downloadMessage) {
        this.status = DownloadStatus.CANCELLED;
        Future future = this.future;
        if (future != null) {
            future.cancel(false);
        }
    }

    public String get(String str, String str2) {
        if (Objects.isNull(this.extraMap) || !this.extraMap.containsKey(str) || TextUtils.isEmpty(str)) {
            return str2;
        }
        String str3 = this.extraMap.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public int getCacheDirectorPathType() {
        return this.cacheDirectorPathType;
    }

    public void setCacheDirectorPathType(int i) {
        this.cacheDirectorPathType = i;
    }

    public String getCacheDirectoryPath() {
        return this.cacheDirectoryPath;
    }

    public void setCacheDirectoryPath(String str) {
        this.cacheDirectoryPath = str;
    }

    public long getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getDirectoryPathExternal() {
        return this.directoryPathExternal;
    }

    public String getDirectoryPathInternal() {
        return this.directoryPathInternal;
    }

    public String getDownloadId() {
        return this.downloadId;
    }

    public DownloadMessage<T> getDownloadMessage() {
        return this.downloadMessage;
    }

    public DownloadPriority getDownloadPriority() {
        return this.downloadPriority;
    }

    public long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public void setDownloadedBytes(long j) {
        this.downloadedBytes = j;
    }

    public HashMap<String, List<String>> getHeaders() {
        return this.headerMap;
    }

    public long getReadTimeout() {
        return this.readTimeout;
    }

    public int getRetry() {
        return this.retry;
    }

    public int getRetryedCount() {
        return this.retryedCount;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public DownloadStatus getStatus() {
        return this.status;
    }

    public void setStatus(DownloadStatus downloadStatus) {
        this.status = downloadStatus;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public long getWriteTimeout() {
        return this.writeTimeout;
    }

    public void handlerCancelEvent(final DownloadMessage<T> downloadMessage) {
        ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (DownloadRequest.this.onDownloadListener != null) {
                        DownloadRequest.this.onDownloadListener.onCancelDownload(downloadMessage);
                    }
                    DownloadRequest.this.finish();
                } catch (Exception e) {
                    ad.b(DownloadRequest.TAG, e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        destroy();
        DownloadRequestQueue.getInstance().finish(this);
    }

    private void destroy() {
        this.onProgressListener = null;
        this.onDownloadListener = null;
    }

    public void handlerErrorEvent(final DownloadMessage<T> downloadMessage, final DownloadError downloadError) {
        if (this.status != DownloadStatus.CANCELLED) {
            setStatus(DownloadStatus.FAILED);
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.retryedCount < DownloadRequest.this.retry) {
                            DownloadRequest.this.setStatus(DownloadStatus.RETRY);
                            DownloadRequest.this.retryedCount++;
                            DownloadRequest.this.setDownloadedBytes(0L);
                            DownloadRequest.this.setTotalBytes(0L);
                            DownloadRequestQueue.getInstance().finish(DownloadRequest.this);
                            DownloadRequestQueue.getInstance().addRequest(DownloadRequest.this);
                            return;
                        }
                        DownloadRequest.this.setStatus(DownloadStatus.FAILED);
                        if (DownloadRequest.this.onDownloadListener != null) {
                            DownloadRequest.this.onDownloadListener.onDownloadError(downloadMessage, downloadError);
                        }
                        DownloadRequest.this.finish();
                    } catch (Exception e) {
                        ad.b(DownloadRequest.TAG, e.getMessage());
                    }
                }
            });
        }
    }

    public void handlerProcessEvent(final DownloadMessage<T> downloadMessage, final DownloadProgress downloadProgress) {
        if (this.status != DownloadStatus.CANCELLED) {
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.onProgressListener != null) {
                            DownloadRequest.this.onProgressListener.onProgress(downloadMessage, downloadProgress);
                        }
                    } catch (Exception e) {
                        ad.b(DownloadRequest.TAG, e.getMessage());
                    }
                }
            });
        }
    }

    public void handlerStartEvent(final DownloadMessage<T> downloadMessage) {
        if (this.status != DownloadStatus.CANCELLED) {
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.onDownloadListener != null) {
                            DownloadRequest.this.onDownloadListener.onDownloadStart(downloadMessage);
                        }
                    } catch (Exception e) {
                        ad.b(DownloadRequest.TAG, e.getMessage());
                    }
                }
            });
        }
    }

    public void handlerSuccessEvent(final DownloadMessage<T> downloadMessage) {
        if (this.status != DownloadStatus.CANCELLED) {
            setStatus(DownloadStatus.COMPLETED);
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.extraMap != null && !DownloadRequest.this.extraMap.isEmpty()) {
                            String str = (String) DownloadRequest.this.extraMap.get("responseHeaders");
                            if (!TextUtils.isEmpty(str)) {
                                downloadMessage.addExtra("responseHeaders", str);
                            }
                        }
                        if (DownloadRequest.this.onDownloadListener != null) {
                            DownloadRequest.this.onDownloadListener.onDownloadComplete(downloadMessage);
                        }
                        DownloadRequest.this.finish();
                    } catch (Exception e) {
                        ad.b(DownloadRequest.TAG, e.getMessage());
                    }
                }
            });
        }
    }

    public void putExtraData(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (Objects.isNull(this.extraMap)) {
            this.extraMap = new HashMap();
        }
        this.extraMap.put(str, str2);
    }

    public void setFuture(Future future) {
        this.future = future;
    }

    public String start() {
        this.downloadId = MBResourceManager.getInstance().getDownloadId(this.downloadMessage.getResourceUrl());
        DownloadRequestQueue.getInstance().addRequest(this);
        return this.downloadId;
    }
}
