package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: classes4.dex */
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

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void open(DataSpec dataSpec) throws IOException {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new AesFlushingCipher(1, this.secretKey, CryptoUtil.getFNV64Hash(dataSpec.key), dataSpec.absoluteStreamPosition);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.scratch == null) {
            this.cipher.updateInPlace(bArr, i, i2);
            this.wrappedDataSink.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i2 - i3, this.scratch.length);
            this.cipher.update(bArr, i + i3, iMin, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, iMin);
            i3 += iMin;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void close() throws IOException {
        this.cipher = null;
        this.wrappedDataSink.close();
    }
}
