package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class AesCipherDataSink implements DataSink {
    private AesFlushingCipher cipher;
    private final byte[] scratch;
    private final byte[] secretKey;
    private final DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, DataSink dataSink) {
        this(bArr, dataSink, null);
    }

    public AesCipherDataSink(byte[] bArr, DataSink dataSink, byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws IOException {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.position + dataSpec.uriPositionOffset);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.scratch == null) {
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).updateInPlace(bArr, i, i2);
            this.wrappedDataSink.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i2 - i3, this.scratch.length);
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).update(bArr, i + i3, iMin, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, iMin);
            i3 += iMin;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
        this.cipher = null;
        this.wrappedDataSink.close();
    }
}
