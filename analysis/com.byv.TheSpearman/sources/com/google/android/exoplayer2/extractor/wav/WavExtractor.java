package com.google.android.exoplayer2.extractor.wav;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

@Deprecated
/* loaded from: classes2.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.wav.WavExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.lambda$static$0();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return createExtractors();
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    private interface OutputWriter {
        void init(int i, long j) throws ParserException;

        void reset(long j);

        boolean sampleData(ExtractorInput extractorInput, long j) throws IOException;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return WavHeaderReader.checkFileType(extractorInput);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.state = j == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i = this.state;
        if (i == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i == 4) {
            return readSampleData(extractorInput);
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private void readFileType(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(extractorInput.getPosition() == 0);
        int i = this.dataStartPosition;
        if (i != -1) {
            extractorInput.skipFully(i);
            this.state = 4;
        } else {
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void readFormat(ExtractorInput extractorInput) throws IOException {
        WavFormat format = WavHeaderReader.readFormat(extractorInput);
        if (format.formatType == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, format);
        } else if (format.formatType == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, "audio/g711-alaw", -1);
        } else if (format.formatType == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(format.formatType, format.bitsPerSample);
            if (pcmEncodingForType == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.formatType);
            }
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, "audio/raw", pcmEncodingForType);
        }
        this.state = 3;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j = this.rf64SampleDataSize;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.dataEndPosition = this.dataStartPosition + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + ", " + length);
            this.dataEndPosition = length;
        }
        ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    private int readSampleData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    private static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i2 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize != i2) {
                throw ParserException.createForMalformedContainer("Expected block size: " + i2 + "; got: " + wavFormat.blockSize, null);
            }
            int i3 = wavFormat.frameRateHz * i2 * 8;
            int iMax = Math.max(i2, (wavFormat.frameRateHz * i2) / 10);
            this.targetSampleSizeBytes = iMax;
            this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(iMax).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i).build();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, 1, i, j));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.pendingOutputBytes) < (i2 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i2 - i, j2), true);
                if (iSampleData == -1) {
                    j2 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j2 -= iSampleData;
                }
            }
            int i3 = this.wavFormat.blockSize;
            int i4 = this.pendingOutputBytes / i3;
            if (i4 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
                int i5 = i4 * i3;
                int i6 = this.pendingOutputBytes - i5;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i5, i6, null);
                this.outputFrameCount += i4;
                this.pendingOutputBytes = i6;
            }
            return j2 <= 0;
        }
    }

    private static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, Opcodes.D2L, 157, Opcodes.LRETURN, Opcodes.ARRAYLENGTH, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int iMax = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i = wavFormat.numChannels;
            int i2 = (((wavFormat.blockSize - (i * 4)) * 8) / (wavFormat.bitsPerSample * i)) + 1;
            if (littleEndianUnsignedShort != i2) {
                throw ParserException.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + littleEndianUnsignedShort, null);
            }
            int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
            this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
            this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i));
            int i3 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / littleEndianUnsignedShort;
            this.format = new Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(numOutputFramesToBytes(iMax, i)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, this.framesPerBlock, i, j));
            this.trackOutput.format(this.format);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)
                com.google.android.exoplayer2.extractor.wav.WavFormat r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.inputData
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r8 = r6.trackOutput
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        private void writeSampleMetadata(int i) {
            long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += i;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        private void decode(byte[] bArr, int i, ParsableByteArray parsableByteArray) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.wavFormat.numChannels; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.wavFormat.blockSize;
            int i4 = this.wavFormat.numChannels;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iConstrainValue = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = STEP_TABLE[iMin];
            int i9 = ((i * this.framesPerBlock * i4) + i2) * 2;
            bArr2[i9] = (byte) (iConstrainValue & 255);
            bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                int i11 = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)] & 255;
                int i12 = i10 % 2 == 0 ? i11 & 15 : i11 >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i8) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + i13, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iConstrainValue & 255);
                bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
                int i14 = iMin + INDEX_TABLE[i12];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(i14, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.wavFormat.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.wavFormat.numChannels);
        }
    }
}
