package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
interface RtpDataChannel extends DataSource {

    public interface Factory {

        /* renamed from: com.google.android.exoplayer2.source.rtsp.RtpDataChannel$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Factory $default$createFallbackDataChannelFactory(Factory _this) {
                return null;
            }
        }

        RtpDataChannel createAndOpenDataChannel(int i) throws IOException;

        Factory createFallbackDataChannelFactory();
    }

    RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener();

    int getLocalPort();

    String getTransport();

    boolean needsClosingOnLoadCompletion();
}
