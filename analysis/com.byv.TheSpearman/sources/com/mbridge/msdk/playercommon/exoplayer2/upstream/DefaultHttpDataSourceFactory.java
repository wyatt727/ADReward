package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* loaded from: classes4.dex */
public final class DefaultHttpDataSourceFactory extends HttpDataSource.BaseFactory {
    private final boolean allowCrossProtocolRedirects;
    private final int connectTimeoutMillis;
    private final TransferListener<? super DataSource> listener;
    private final int readTimeoutMillis;
    private final String userAgent;

    public DefaultHttpDataSourceFactory(String str) {
        this(str, null);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener<? super DataSource> transferListener) {
        this(str, transferListener, 8000, 8000, false);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener<? super DataSource> transferListener, int i, int i2, boolean z) {
        this.userAgent = str;
        this.listener = transferListener;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.BaseFactory
    public final DefaultHttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties requestProperties) {
        return new DefaultHttpDataSource(this.userAgent, null, this.listener, this.connectTimeoutMillis, this.readTimeoutMillis, this.allowCrossProtocolRedirects, requestProperties);
    }
}
