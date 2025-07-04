package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes4.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s, int i);

    void onTransferEnd(S s);

    void onTransferStart(S s, DataSpec dataSpec);
}
