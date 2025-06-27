package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* loaded from: classes2.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    LengthCountingOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.length++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.length += i2;
    }

    long getLength() {
        return this.length;
    }
}
