package com.google.android.exoplayer2.source.rtsp.reader;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import org.objectweb.asm.Opcodes;

@Deprecated
/* loaded from: classes2.dex */
final class RtpH263Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int PICTURE_START_CODE = 128;
    private static final String TAG = "RtpH263Reader";
    private int fragmentedSampleSizeBytes;
    private long fragmentedSampleTimeUs;
    private boolean gotFirstPacketOfH263Frame;
    private int height;
    private boolean isKeyFrame;
    private boolean isOutputFormatSet;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private int width;
    private long firstReceivedTimestamp = -9223372036854775807L;
    private int previousSequenceNumber = -1;

    public RtpH263Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput trackOutputTrack = extractorOutput.track(i, 2);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i) {
        Assertions.checkState(this.firstReceivedTimestamp == -9223372036854775807L);
        this.firstReceivedTimestamp = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z) {
        Assertions.checkStateNotNull(this.trackOutput);
        int position = parsableByteArray.getPosition();
        int unsignedShort = parsableByteArray.readUnsignedShort();
        boolean z2 = (unsignedShort & 1024) > 0;
        if ((unsignedShort & 512) != 0 || (unsignedShort & TypedValues.PositionType.TYPE_PERCENT_HEIGHT) != 0 || (unsignedShort & 7) != 0) {
            Log.w(TAG, "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z2) {
            if (this.gotFirstPacketOfH263Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfH263Frame = true;
            if ((parsableByteArray.peekUnsignedByte() & 252) < 128) {
                Log.w(TAG, "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                parsableByteArray.getData()[position] = 0;
                parsableByteArray.getData()[position + 1] = 0;
                parsableByteArray.setPosition(position);
            }
        } else if (this.gotFirstPacketOfH263Frame) {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i < nextSequenceNumber) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i)));
                return;
            }
        } else {
            Log.w(TAG, "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
            return;
        }
        if (this.fragmentedSampleSizeBytes == 0) {
            parseVopHeader(parsableByteArray, this.isOutputFormatSet);
            if (!this.isOutputFormatSet && this.isKeyFrame) {
                if (this.width != this.payloadFormat.format.width || this.height != this.payloadFormat.format.height) {
                    this.trackOutput.format(this.payloadFormat.format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.isOutputFormatSet = true;
            }
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        this.fragmentedSampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY);
        if (z) {
            outputSampleMetadataForFragmentedPackets();
        }
        this.previousSequenceNumber = i;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j2) {
        this.firstReceivedTimestamp = j;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j2;
    }

    private void parseVopHeader(ParsableByteArray parsableByteArray, boolean z) {
        int position = parsableByteArray.getPosition();
        if (((parsableByteArray.readUnsignedInt() >> 10) & 63) == 32) {
            int iPeekUnsignedByte = parsableByteArray.peekUnsignedByte();
            int i = (iPeekUnsignedByte >> 1) & 1;
            if (!z && i == 0) {
                int i2 = (iPeekUnsignedByte >> 2) & 7;
                if (i2 == 1) {
                    this.width = 128;
                    this.height = 96;
                } else {
                    int i3 = i2 - 2;
                    this.width = Opcodes.ARETURN << i3;
                    this.height = Opcodes.D2F << i3;
                }
            }
            parsableByteArray.setPosition(position);
            this.isKeyFrame = i == 0;
            return;
        }
        parsableByteArray.setPosition(position);
        this.isKeyFrame = false;
    }

    private void outputSampleMetadataForFragmentedPackets() {
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.trackOutput);
        long j = this.fragmentedSampleTimeUs;
        boolean z = this.isKeyFrame;
        trackOutput.sampleMetadata(j, z ? 1 : 0, this.fragmentedSampleSizeBytes, 0, null);
        this.fragmentedSampleSizeBytes = 0;
        this.fragmentedSampleTimeUs = -9223372036854775807L;
        this.isKeyFrame = false;
        this.gotFirstPacketOfH263Frame = false;
    }
}
