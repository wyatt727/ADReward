package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes2.dex */
class RtpReaderUtils {
    public static long toSampleTimeUs(long j, long j2, long j3, int i) {
        return j + Util.scaleLargeTimestamp(j2 - j3, 1000000L, i);
    }

    private RtpReaderUtils() {
    }
}
