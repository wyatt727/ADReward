package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    long startUs;

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j, long j2) {
        this.mediaPeriod = mediaPeriod;
        this.pendingInitialDiscontinuityPositionUs = z ? j : -9223372036854775807L;
        this.startUs = j;
        this.endUs = j2;
    }

    public final void updateClipping(long j, long j2) {
        this.startUs = j;
        this.endUs = j2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long selectTracks(com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection[] r13, boolean[] r14, com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r2 = new com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream[r2]
            r0.sampleStreams = r2
            int r2 = r1.length
            com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[] r9 = new com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r3 = r0.sampleStreams
            r4 = r1[r2]
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r4 = (com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream r11 = r3.childStream
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod r2 = r0.mediaPeriod
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.selectTracks(r3, r4, r5, r6, r7)
            boolean r4 = r12.isPendingInitialDiscontinuity()
            if (r4 == 0) goto L47
            long r4 = r0.startUs
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = shouldKeepInitialDiscontinuity(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.pendingInitialDiscontinuityPositionUs = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.startUs
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L65
            long r4 = r0.endUs
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L67
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L65
            goto L67
        L65:
            r4 = r10
            goto L68
        L67:
            r4 = 1
        L68:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L99
            r4 = r9[r10]
            if (r4 != 0) goto L77
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4[r10] = r11
            goto L90
        L77:
            r4 = r1[r10]
            if (r4 == 0) goto L85
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4 = r4[r10]
            com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream r4 = r4.childStream
            r5 = r9[r10]
            if (r4 == r5) goto L90
        L85:
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r5 = new com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L90:
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.selectTracks(com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection[], boolean[], com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j, boolean z) {
        this.mediaPeriod.discardBuffer(j, z);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            long j = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        Assertions.checkState(discontinuity2 >= this.startUs);
        long j2 = this.endUs;
        if (j2 != Long.MIN_VALUE && discontinuity2 > j2) {
            z = false;
        }
        Assertions.checkState(z);
        return discontinuity2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.endUs;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.pendingInitialDiscontinuityPositionUs = r0
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r0 = r5.sampleStreams
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.clearSentEos()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod r0 = r5.mediaPeriod
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.startUs
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.endUs
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.seekToUs(long):long");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        long j2 = this.startUs;
        if (j == j2) {
            return j2;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j, clipSeekParameters(j, seekParameters));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.endUs;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        return this.mediaPeriod.continueLoading(j);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        this.callback.onPrepared(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader.Callback
    public final void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.callback.onContinueLoadingRequested(this);
    }

    final boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != -9223372036854775807L;
    }

    private SeekParameters clipSeekParameters(long j, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j - this.startUs);
        long j2 = seekParameters.toleranceAfterUs;
        long j3 = this.endUs;
        long jConstrainValue2 = Util.constrainValue(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j, TrackSelection[] trackSelectionArr) {
        if (j != 0) {
            for (TrackSelection trackSelection : trackSelectionArr) {
                if (trackSelection != null && !MimeTypes.isAudio(trackSelection.getSelectedFormat().sampleMimeType)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        public final void clearSentEos() {
            this.sentEos = false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
            this.childStream.maybeThrowError();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            int data = this.childStream.readData(formatHolder, decoderInputBuffer, z);
            if (data == -5) {
                Format format = formatHolder.format;
                if (format.encoderDelay != 0 || format.encoderPadding != 0) {
                    formatHolder.format = format.copyWithGaplessInfo(ClippingMediaPeriod.this.startUs != 0 ? 0 : format.encoderDelay, ClippingMediaPeriod.this.endUs == Long.MIN_VALUE ? format.encoderPadding : 0);
                }
                return -5;
            }
            if (ClippingMediaPeriod.this.endUs == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < ClippingMediaPeriod.this.endUs) && !(data == -3 && ClippingMediaPeriod.this.getBufferedPositionUs() == Long.MIN_VALUE))) {
                return data;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j);
        }
    }
}
