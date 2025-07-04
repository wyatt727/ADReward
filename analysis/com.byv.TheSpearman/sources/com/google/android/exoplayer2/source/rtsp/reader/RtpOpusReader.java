package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
final class RtpOpusReader implements RtpPayloadReader {
    private static final int MEDIA_CLOCK_FREQUENCY = 48000;
    private static final String TAG = "RtpOpusReader";
    private boolean foundOpusCommentHeader;
    private boolean foundOpusIDHeader;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = -1;
    private int previousSequenceNumber = -1;

    public RtpOpusReader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput trackOutputTrack = extractorOutput.track(i, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i) {
        this.firstReceivedTimestamp = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z) {
        Assertions.checkStateNotNull(this.trackOutput);
        if (!this.foundOpusIDHeader) {
            validateOpusIdHeader(parsableByteArray);
            List<byte[]> listBuildInitializationData = OpusUtil.buildInitializationData(parsableByteArray.getData());
            Format.Builder builderBuildUpon = this.payloadFormat.format.buildUpon();
            builderBuildUpon.setInitializationData(listBuildInitializationData);
            this.trackOutput.format(builderBuildUpon.build());
            this.foundOpusIDHeader = true;
        } else {
            if (!this.foundOpusCommentHeader) {
                Assertions.checkArgument(parsableByteArray.limit() >= 8, "Comment Header has insufficient data");
                Assertions.checkArgument(parsableByteArray.readString(8).equals("OpusTags"), "Comment Header should follow ID Header");
                this.foundOpusCommentHeader = true;
            } else {
                int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
                if (i != nextSequenceNumber) {
                    Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i)));
                }
                int iBytesLeft = parsableByteArray.bytesLeft();
                this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
                this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp, 48000), 1, iBytesLeft, 0, null);
            }
        }
        this.previousSequenceNumber = i;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j2) {
        this.firstReceivedTimestamp = j;
        this.startTimeOffsetUs = j2;
    }

    private static void validateOpusIdHeader(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        Assertions.checkArgument(parsableByteArray.limit() > 18, "ID Header has insufficient data");
        Assertions.checkArgument(parsableByteArray.readString(8).equals("OpusHead"), "ID Header missing");
        Assertions.checkArgument(parsableByteArray.readUnsignedByte() == 1, "version number must always be 1");
        parsableByteArray.setPosition(position);
    }
}
