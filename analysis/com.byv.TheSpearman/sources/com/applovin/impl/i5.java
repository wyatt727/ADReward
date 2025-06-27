package com.applovin.impl;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class i5 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f517a;
    private final j5 b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public i5(g5 g5Var, j5 j5Var) {
        this.f517a = g5Var;
        this.b = j5Var;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        this.f517a.close();
        this.e = true;
    }

    private void a() {
        if (this.d) {
            return;
        }
        this.f517a.a(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        a1.b(!this.e);
        a();
        int iA = this.f517a.a(bArr, i, i2);
        if (iA == -1) {
            return -1;
        }
        this.f += iA;
        return iA;
    }
}
