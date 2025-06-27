package com.bytedance.sdk.component.Pm.Td.EYQ.EYQ;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes2.dex */
class Td implements Closeable {
    private final InputStream EYQ;
    private int Kbd;
    private int Pm;
    private byte[] Td;
    private final Charset mZx;

    public Td(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public Td(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(Pm.EYQ)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.EYQ = inputStream;
        this.mZx = charset;
        this.Td = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.EYQ) {
            if (this.Td != null) {
                this.Td = null;
                this.EYQ.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String EYQ() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.EYQ
            monitor-enter(r0)
            byte[] r1 = r7.Td     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.Pm     // Catch: java.lang.Throwable -> L87
            int r2 = r7.Kbd     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.Td()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.Pm     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.Kbd     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.Td     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.Pm     // Catch: java.lang.Throwable -> L87
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L87
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.mZx     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.Pm = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.Td$1 r1 = new com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.Td$1     // Catch: java.lang.Throwable -> L87
            int r2 = r7.Kbd     // Catch: java.lang.Throwable -> L87
            int r4 = r7.Pm     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.Td     // Catch: java.lang.Throwable -> L87
            int r4 = r7.Pm     // Catch: java.lang.Throwable -> L87
            int r5 = r7.Kbd     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.Kbd = r2     // Catch: java.lang.Throwable -> L87
            r7.Td()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.Pm     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.Kbd     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.Td     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.Pm     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.Pm = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.Td.EYQ():java.lang.String");
    }

    public boolean mZx() {
        return this.Kbd == -1;
    }

    private void Td() throws IOException {
        InputStream inputStream = this.EYQ;
        byte[] bArr = this.Td;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.Pm = 0;
        this.Kbd = i;
    }
}
