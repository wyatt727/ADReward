package com.google.android.exoplayer2.offline;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(ProgressListener progressListener) throws InterruptedException, IOException;

    void remove();
}
