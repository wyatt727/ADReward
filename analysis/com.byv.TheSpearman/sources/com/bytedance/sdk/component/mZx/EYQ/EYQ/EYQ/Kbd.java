package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: NetInputStram.java */
/* loaded from: classes2.dex */
public class Kbd extends InputStream {
    InputStream EYQ;
    HttpURLConnection mZx;

    public Kbd(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.EYQ = inputStream;
        this.mZx = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            inputStream.close();
            this.EYQ = null;
        }
        HttpURLConnection httpURLConnection = this.mZx;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mZx = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.EYQ;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
