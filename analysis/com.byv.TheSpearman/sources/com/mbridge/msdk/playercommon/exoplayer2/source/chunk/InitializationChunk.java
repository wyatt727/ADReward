package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DefaultExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class InitializationChunk extends Chunk {
    private volatile int bytesLoaded;
    private final ChunkExtractorWrapper extractorWrapper;
    private volatile boolean loadCanceled;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, ChunkExtractorWrapper chunkExtractorWrapper) {
        super(dataSource, dataSpec, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.extractorWrapper = chunkExtractorWrapper;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk
    public final long bytesLoaded() {
        return this.bytesLoaded;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void load() throws InterruptedException, IOException {
        DataSpec dataSpecSubrange = this.dataSpec.subrange(this.bytesLoaded);
        try {
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.dataSource, dataSpecSubrange.absoluteStreamPosition, this.dataSource.open(dataSpecSubrange));
            if (this.bytesLoaded == 0) {
                this.extractorWrapper.init(null, -9223372036854775807L);
            }
            try {
                Extractor extractor = this.extractorWrapper.extractor;
                int i = 0;
                while (i == 0 && !this.loadCanceled) {
                    i = extractor.read(defaultExtractorInput, null);
                }
                Assertions.checkState(i != 1);
            } finally {
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
            }
        } finally {
            Util.closeQuietly(this.dataSource);
        }
    }
}
