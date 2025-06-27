package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class DownloadHelper {

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    public abstract DownloadAction getDownloadAction(byte[] bArr, List<TrackKey> list);

    public abstract int getPeriodCount();

    public abstract DownloadAction getRemoveAction(byte[] bArr);

    public abstract TrackGroupArray getTrackGroups(int i);

    protected abstract void prepareInternal() throws IOException;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper$1] */
    public void prepare(final Callback callback) {
        final Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    DownloadHelper.this.prepareInternal();
                    handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            callback.onPrepared(DownloadHelper.this);
                        }
                    });
                } catch (IOException e) {
                    handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            callback.onPrepareError(DownloadHelper.this, e);
                        }
                    });
                }
            }
        }.start();
    }
}
