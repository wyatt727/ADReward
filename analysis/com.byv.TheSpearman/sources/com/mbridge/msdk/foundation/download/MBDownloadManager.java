package com.mbridge.msdk.foundation.download;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder;
import com.mbridge.msdk.foundation.download.core.DownloadRequestQueue;
import com.mbridge.msdk.foundation.download.core.ExecutorManager;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;

/* loaded from: classes4.dex */
public final class MBDownloadManager {
    private boolean initialize;

    private MBDownloadManager() {
        this.initialize = false;
    }

    public static MBDownloadManager getInstance() {
        return ClassHolder.MB_DOWNLOAD_MANAGER;
    }

    public final synchronized void cancel(String str) {
        DownloadRequestQueue.getInstance().cancel(str);
    }

    public final synchronized void cancelAll() {
        DownloadRequestQueue.getInstance().cancelAll();
    }

    public final synchronized DownloadRequestBuilder download(DownloadMessage<?> downloadMessage) {
        return new DownloadRequestBuilder(downloadMessage);
    }

    public final synchronized String getDownloadId(String str) {
        return MBResourceManager.getInstance().getDownloadId(str);
    }

    public final synchronized DownloadStatus getStatus(String str) {
        return DownloadRequestQueue.getInstance().getStatus(str);
    }

    public final void initialize(Context context, MBDownloadConfig mBDownloadConfig, ResourceConfig resourceConfig) {
        if (this.initialize) {
            return;
        }
        GlobalComponent.getInstance().initialize(context, mBDownloadConfig);
        DownloadRequestQueue.getInstance().initialize();
        MBResourceManager.getInstance().executeResourceStrategy(resourceConfig);
        this.initialize = true;
    }

    public final synchronized void shutDown() {
        ExecutorManager.shutDown();
    }

    public final synchronized void updateZipResource(String str, String str2, long j) {
        GlobalComponent.getInstance().getDatabaseHelper().updateUnzipResource(str, str2, j);
    }

    private static final class ClassHolder {
        private static final MBDownloadManager MB_DOWNLOAD_MANAGER = new MBDownloadManager();

        private ClassHolder() {
        }
    }
}
