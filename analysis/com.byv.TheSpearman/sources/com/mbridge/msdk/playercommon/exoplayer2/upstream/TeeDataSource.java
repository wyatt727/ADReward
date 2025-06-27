package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class TeeDataSource implements DataSource {
    private long bytesRemaining;
    private final DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final DataSource upstream;

    public TeeDataSource(DataSource dataSource, DataSink dataSink) {
        this.upstream = (DataSource) Assertions.checkNotNull(dataSource);
        this.dataSink = (DataSink) Assertions.checkNotNull(dataSink);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        long jOpen = this.upstream.open(dataSpec);
        this.bytesRemaining = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (dataSpec.length == -1 && this.bytesRemaining != -1) {
            dataSpec = new DataSpec(dataSpec.uri, dataSpec.absoluteStreamPosition, dataSpec.position, this.bytesRemaining, dataSpec.key, dataSpec.flags);
        }
        this.dataSinkNeedsClosing = true;
        this.dataSink.open(dataSpec);
        return this.bytesRemaining;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int i3 = this.upstream.read(bArr, i, i2);
        if (i3 > 0) {
            this.dataSink.write(bArr, i, i3);
            long j = this.bytesRemaining;
            if (j != -1) {
                this.bytesRemaining = j - i3;
            }
        }
        return i3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        try {
            this.upstream.close();
        } finally {
            if (this.dataSinkNeedsClosing) {
                this.dataSinkNeedsClosing = false;
                this.dataSink.close();
            }
        }
    }
}
