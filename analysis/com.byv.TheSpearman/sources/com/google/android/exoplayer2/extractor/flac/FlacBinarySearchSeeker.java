package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.util.Objects;

@Deprecated
/* loaded from: classes2.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlacBinarySearchSeeker(final FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j3) {
                return flacStreamMetadata.getSampleNumber(j3);
            }
        }, new FlacTimestampSeeker(flacStreamMetadata, i), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }

    private static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public /* synthetic */ void onSeekFinished() {
            BinarySearchSeeker.TimestampSeeker.CC.$default$onSeekFinished(this);
        }

        private FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i) {
            this.flacStreamMetadata = flacStreamMetadata;
            this.frameStartMarker = i;
            this.sampleNumberHolder = new FlacFrameReader.SampleNumberHolder();
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException {
            long position = extractorInput.getPosition();
            long jFindNextFrame = findNextFrame(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(Math.max(6, this.flacStreamMetadata.minFrameSize));
            long jFindNextFrame2 = findNextFrame(extractorInput);
            long peekPosition2 = extractorInput.getPeekPosition();
            if (jFindNextFrame <= j && jFindNextFrame2 > j) {
                return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
            }
            if (jFindNextFrame2 <= j) {
                return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jFindNextFrame2, peekPosition2);
            }
            return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jFindNextFrame, position);
        }

        private long findNextFrame(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() >= extractorInput.getLength() - 6) {
                extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
                return this.flacStreamMetadata.totalSamples;
            }
            return this.sampleNumberHolder.sampleNumber;
        }
    }
}
