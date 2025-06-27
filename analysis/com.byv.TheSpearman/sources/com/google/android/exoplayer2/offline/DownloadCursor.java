package com.google.android.exoplayer2.offline;

import java.io.Closeable;

@Deprecated
/* loaded from: classes2.dex */
public interface DownloadCursor extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    Download getDownload();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToLast();

    boolean moveToNext();

    boolean moveToPosition(int i);

    boolean moveToPrevious();

    /* renamed from: com.google.android.exoplayer2.offline.DownloadCursor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isFirst(DownloadCursor _this) {
            return _this.getPosition() == 0 && _this.getCount() != 0;
        }

        public static boolean $default$isLast(DownloadCursor _this) {
            int count = _this.getCount();
            return _this.getPosition() == count + (-1) && count != 0;
        }

        public static boolean $default$isBeforeFirst(DownloadCursor _this) {
            return _this.getCount() == 0 || _this.getPosition() == -1;
        }

        public static boolean $default$isAfterLast(DownloadCursor _this) {
            return _this.getCount() == 0 || _this.getPosition() == _this.getCount();
        }
    }
}
