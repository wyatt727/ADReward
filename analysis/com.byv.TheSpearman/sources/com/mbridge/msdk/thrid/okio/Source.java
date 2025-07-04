package com.mbridge.msdk.thrid.okio;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface Source extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(Buffer buffer, long j) throws IOException;

    Timeout timeout();
}
