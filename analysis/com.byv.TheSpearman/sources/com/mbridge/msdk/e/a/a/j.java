package com.mbridge.msdk.e.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PoolingByteArrayOutputStream.java */
/* loaded from: classes4.dex */
public final class j extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final c f2695a;

    public j(c cVar, int i) {
        this.f2695a = cVar;
        this.buf = cVar.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2695a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f2695a.a(this.buf);
    }

    private void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] bArrA = this.f2695a.a((this.count + i) * 2);
        System.arraycopy(this.buf, 0, bArrA, 0, this.count);
        this.f2695a.a(this.buf);
        this.buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        if (bArr != null) {
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
