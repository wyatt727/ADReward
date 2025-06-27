package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class LatmReader implements ElementaryStreamReader {
    private static final int INITIAL_BUFFER_SIZE = 1024;
    private static final int STATE_FINDING_SYNC_1 = 0;
    private static final int STATE_FINDING_SYNC_2 = 1;
    private static final int STATE_READING_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 3;
    private static final int SYNC_BYTE_FIRST = 86;
    private static final int SYNC_BYTE_SECOND = 224;
    private int audioMuxVersionA;
    private int bytesRead;
    private int channelCount;
    private Format format;
    private String formatId;
    private int frameLengthType;
    private final String language;
    private int numSubframes;
    private long otherDataLenBits;
    private boolean otherDataPresent;
    private TrackOutput output;
    private final ParsableBitArray sampleBitArray;
    private final ParsableByteArray sampleDataBuffer;
    private long sampleDurationUs;
    private int sampleRateHz;
    private int sampleSize;
    private int secondHeaderByte;
    private int state;
    private boolean streamMuxRead;
    private long timeUs;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    public LatmReader(String str) {
        this.language = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.sampleDataBuffer = parsableByteArray;
        this.sampleBitArray = new ParsableBitArray(parsableByteArray.data);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.state = 0;
        this.streamMuxRead = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.formatId = trackIdGenerator.getFormatId();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetStarted(long j, boolean z) {
        this.timeUs = j;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) throws ParserException {
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i == 1) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.secondHeaderByte = unsignedByte;
                        this.state = 2;
                    } else if (unsignedByte != 86) {
                        this.state = 0;
                    }
                } else if (i == 2) {
                    int unsignedByte2 = ((this.secondHeaderByte & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                    this.sampleSize = unsignedByte2;
                    if (unsignedByte2 > this.sampleDataBuffer.data.length) {
                        resetBufferForSize(this.sampleSize);
                    }
                    this.bytesRead = 0;
                    this.state = 3;
                } else if (i == 3) {
                    int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    parsableByteArray.readBytes(this.sampleBitArray.data, this.bytesRead, iMin);
                    int i2 = this.bytesRead + iMin;
                    this.bytesRead = i2;
                    if (i2 == this.sampleSize) {
                        this.sampleBitArray.setPosition(0);
                        parseAudioMuxElement(this.sampleBitArray);
                        this.state = 0;
                    }
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.state = 1;
            }
        }
    }

    private void parseAudioMuxElement(ParsableBitArray parsableBitArray) throws ParserException {
        if (!parsableBitArray.readBit()) {
            this.streamMuxRead = true;
            parseStreamMuxConfig(parsableBitArray);
        } else if (!this.streamMuxRead) {
            return;
        }
        if (this.audioMuxVersionA == 0) {
            if (this.numSubframes != 0) {
                throw new ParserException();
            }
            parsePayloadMux(parsableBitArray, parsePayloadLengthInfo(parsableBitArray));
            if (this.otherDataPresent) {
                parsableBitArray.skipBits((int) this.otherDataLenBits);
                return;
            }
            return;
        }
        throw new ParserException();
    }

    private void parseStreamMuxConfig(ParsableBitArray parsableBitArray) throws ParserException {
        boolean bit;
        int bits = parsableBitArray.readBits(1);
        int bits2 = bits == 1 ? parsableBitArray.readBits(1) : 0;
        this.audioMuxVersionA = bits2;
        if (bits2 == 0) {
            if (bits == 1) {
                latmGetValue(parsableBitArray);
            }
            if (!parsableBitArray.readBit()) {
                throw new ParserException();
            }
            this.numSubframes = parsableBitArray.readBits(6);
            int bits3 = parsableBitArray.readBits(4);
            int bits4 = parsableBitArray.readBits(3);
            if (bits3 != 0 || bits4 != 0) {
                throw new ParserException();
            }
            if (bits == 0) {
                int position = parsableBitArray.getPosition();
                int audioSpecificConfig = parseAudioSpecificConfig(parsableBitArray);
                parsableBitArray.setPosition(position);
                byte[] bArr = new byte[(audioSpecificConfig + 7) / 8];
                parsableBitArray.readBits(bArr, 0, audioSpecificConfig);
                Format formatCreateAudioSampleFormat = Format.createAudioSampleFormat(this.formatId, "audio/mp4a-latm", null, -1, -1, this.channelCount, this.sampleRateHz, Collections.singletonList(bArr), null, 0, this.language);
                if (!formatCreateAudioSampleFormat.equals(this.format)) {
                    this.format = formatCreateAudioSampleFormat;
                    this.sampleDurationUs = 1024000000 / formatCreateAudioSampleFormat.sampleRate;
                    this.output.format(formatCreateAudioSampleFormat);
                }
            } else {
                parsableBitArray.skipBits(((int) latmGetValue(parsableBitArray)) - parseAudioSpecificConfig(parsableBitArray));
            }
            parseFrameLength(parsableBitArray);
            boolean bit2 = parsableBitArray.readBit();
            this.otherDataPresent = bit2;
            this.otherDataLenBits = 0L;
            if (bit2) {
                if (bits == 1) {
                    this.otherDataLenBits = latmGetValue(parsableBitArray);
                } else {
                    do {
                        bit = parsableBitArray.readBit();
                        this.otherDataLenBits = (this.otherDataLenBits << 8) + parsableBitArray.readBits(8);
                    } while (bit);
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
                return;
            }
            return;
        }
        throw new ParserException();
    }

    private void parseFrameLength(ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(3);
        this.frameLengthType = bits;
        if (bits == 0) {
            parsableBitArray.skipBits(8);
            return;
        }
        if (bits == 1) {
            parsableBitArray.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            parsableBitArray.skipBits(6);
        } else if (bits == 6 || bits == 7) {
            parsableBitArray.skipBits(1);
        }
    }

    private int parseAudioSpecificConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int iBitsLeft = parsableBitArray.bitsLeft();
        Pair<Integer, Integer> aacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(parsableBitArray, true);
        this.sampleRateHz = ((Integer) aacAudioSpecificConfig.first).intValue();
        this.channelCount = ((Integer) aacAudioSpecificConfig.second).intValue();
        return iBitsLeft - parsableBitArray.bitsLeft();
    }

    private int parsePayloadLengthInfo(ParsableBitArray parsableBitArray) throws ParserException {
        int bits;
        if (this.frameLengthType != 0) {
            throw new ParserException();
        }
        int i = 0;
        do {
            bits = parsableBitArray.readBits(8);
            i += bits;
        } while (bits == 255);
        return i;
    }

    private void parsePayloadMux(ParsableBitArray parsableBitArray, int i) {
        int position = parsableBitArray.getPosition();
        if ((position & 7) == 0) {
            this.sampleDataBuffer.setPosition(position >> 3);
        } else {
            parsableBitArray.readBits(this.sampleDataBuffer.data, 0, i * 8);
            this.sampleDataBuffer.setPosition(0);
        }
        this.output.sampleData(this.sampleDataBuffer, i);
        this.output.sampleMetadata(this.timeUs, 1, i, 0, null);
        this.timeUs += this.sampleDurationUs;
    }

    private void resetBufferForSize(int i) {
        this.sampleDataBuffer.reset(i);
        this.sampleBitArray.reset(this.sampleDataBuffer.data);
    }

    private static long latmGetValue(ParsableBitArray parsableBitArray) {
        return parsableBitArray.readBits((parsableBitArray.readBits(2) + 1) * 8);
    }
}
