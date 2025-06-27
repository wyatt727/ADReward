package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private volatile long lastSampleTimestampUs = -9223372036854775807L;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        setFirstSampleTimestampUs(j);
    }

    public final synchronized void setFirstSampleTimestampUs(long j) {
        Assertions.checkState(this.lastSampleTimestampUs == -9223372036854775807L);
        this.firstSampleTimestampUs = j;
    }

    public final long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public final long getLastAdjustedTimestampUs() {
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            return this.timestampOffsetUs + this.lastSampleTimestampUs;
        }
        long j = this.firstSampleTimestampUs;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    public final long getTimestampOffsetUs() {
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.lastSampleTimestampUs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.timestampOffsetUs;
    }

    public final void reset() {
        this.lastSampleTimestampUs = -9223372036854775807L;
    }

    public final long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            long jUsToPts = usToPts(this.lastSampleTimestampUs);
            long j2 = (4294967296L + jUsToPts) / MAX_PTS_PLUS_ONE;
            long j3 = ((j2 - 1) * MAX_PTS_PLUS_ONE) + j;
            j += j2 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j3 - jUsToPts) < Math.abs(j - jUsToPts)) {
                j = j3;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public final long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            this.lastSampleTimestampUs = j;
        } else {
            long j2 = this.firstSampleTimestampUs;
            if (j2 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j2 - j;
            }
            synchronized (this) {
                this.lastSampleTimestampUs = j;
                notifyAll();
            }
        }
        return j + this.timestampOffsetUs;
    }

    public final synchronized void waitUntilInitialized() throws InterruptedException {
        while (this.lastSampleTimestampUs == -9223372036854775807L) {
            wait();
        }
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToPts(long j) {
        return (j * 90000) / 1000000;
    }
}
