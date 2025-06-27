package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: classes2.dex */
final class TransferRtpDataChannel extends BaseDataSource implements RtpDataChannel, RtspMessageChannel.InterleavedBinaryDataListener {
    private static final String DEFAULT_TCP_TRANSPORT_FORMAT = "RTP/AVP/TCP;unicast;interleaved=%d-%d";
    private int channelNumber;
    private final LinkedBlockingQueue<byte[]> packetQueue;
    private final long pollTimeoutMs;
    private byte[] unreadData;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public boolean needsClosingOnLoadCompletion() {
        return false;
    }

    public TransferRtpDataChannel(long j) {
        super(true);
        this.pollTimeoutMs = j;
        this.packetQueue = new LinkedBlockingQueue<>();
        this.unreadData = new byte[0];
        this.channelNumber = -1;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public String getTransport() {
        Assertions.checkState(this.channelNumber != -1);
        return Util.formatInvariant(DEFAULT_TCP_TRANSPORT_FORMAT, Integer.valueOf(this.channelNumber), Integer.valueOf(this.channelNumber + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public int getLocalPort() {
        return this.channelNumber;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        this.channelNumber = dataSpec.uri.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws InterruptedException {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.unreadData.length);
        System.arraycopy(this.unreadData, 0, bArr, i, iMin);
        int i3 = iMin + 0;
        byte[] bArr2 = this.unreadData;
        this.unreadData = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (i3 == i2) {
            return i3;
        }
        try {
            byte[] bArrPoll = this.packetQueue.poll(this.pollTimeoutMs, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i2 - i3, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i + i3, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.unreadData = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return i3 + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.InterleavedBinaryDataListener
    public void onInterleavedBinaryDataReceived(byte[] bArr) {
        this.packetQueue.add(bArr);
    }
}
