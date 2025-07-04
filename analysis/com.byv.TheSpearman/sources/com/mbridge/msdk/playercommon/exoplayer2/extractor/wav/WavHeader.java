package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class WavHeader implements SeekMap {
    private final int averageBytesPerSecond;
    private final int bitsPerSample;
    private final int blockAlignment;
    private long dataSize;
    private long dataStartPosition;
    private final int encoding;
    private final int numChannels;
    private final int sampleRateHz;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public WavHeader(int i, int i2, int i3, int i4, int i5, int i6) {
        this.numChannels = i;
        this.sampleRateHz = i2;
        this.averageBytesPerSecond = i3;
        this.blockAlignment = i4;
        this.bitsPerSample = i5;
        this.encoding = i6;
    }

    public final void setDataBounds(long j, long j2) {
        this.dataStartPosition = j;
        this.dataSize = j2;
    }

    public final boolean hasDataBounds() {
        return (this.dataStartPosition == 0 || this.dataSize == 0) ? false : true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return ((this.dataSize / this.blockAlignment) * 1000000) / this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        int i = this.blockAlignment;
        long jConstrainValue = Util.constrainValue((((this.averageBytesPerSecond * j) / 1000000) / i) * i, 0L, this.dataSize - i);
        long j2 = this.dataStartPosition + jConstrainValue;
        long timeUs = getTimeUs(j2);
        SeekPoint seekPoint = new SeekPoint(timeUs, j2);
        if (timeUs < j) {
            long j3 = this.dataSize;
            int i2 = this.blockAlignment;
            if (jConstrainValue != j3 - i2) {
                long j4 = j2 + i2;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j4), j4));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.dataStartPosition) * 1000000) / this.averageBytesPerSecond;
    }

    public final int getBytesPerFrame() {
        return this.blockAlignment;
    }

    public final int getBitrate() {
        return this.sampleRateHz * this.bitsPerSample * this.numChannels;
    }

    public final int getSampleRateHz() {
        return this.sampleRateHz;
    }

    public final int getNumChannels() {
        return this.numChannels;
    }

    public final int getEncoding() {
        return this.encoding;
    }
}
