package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class PF extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0758Gu A02;
    public final Uri A03;
    public final C1206Ym A04;
    public final InterfaceC0757Gt A05;
    public final String A06;

    public PF(C1206Ym c1206Ym, Uri uri, InterfaceC0757Gt interfaceC0757Gt) throws IOException {
        this.A04 = c1206Ym;
        this.A05 = interfaceC0757Gt;
        this.A03 = uri;
        this.A06 = R0.A08(c1206Ym, uri);
        A00(0);
    }

    private void A00(int i) throws IOException {
        InterfaceC0758Gu interfaceC0758Gu = this.A02;
        if (interfaceC0758Gu != null) {
            interfaceC0758Gu.close();
        }
        this.A02 = this.A05.A4X();
        this.A01 = (int) this.A02.ADl(new C0762Gy(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A02.read(bArr, i, i2);
        int read = this.A00;
        this.A00 = read + i3;
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01;
        int i = this.A00;
        long skipped = j2 - i;
        if (skipped <= 0) {
            return 0L;
        }
        if (j > skipped) {
            j = skipped;
        }
        int i2 = (int) (i + j);
        this.A00 = i2;
        A00(i2);
        return j;
    }
}
