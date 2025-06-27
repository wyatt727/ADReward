package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class ap extends y1 {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = yp.f;
    private int n;
    private long o;

    public void k() {
        this.o = 0L;
    }

    public long j() {
        return this.o;
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) throws o1.b {
        if (aVar.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? o1.a.e : aVar;
        }
        throw new o1.b(aVar);
    }

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += iMin / this.b.d;
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferA = a(length);
        int iA = yp.a(length, 0, this.n);
        byteBufferA.put(this.m, 0, iA);
        int iA2 = yp.a(length - iA, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iA2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iA2;
        int i4 = this.n - iA;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iA, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferA.flip();
    }

    @Override // com.applovin.impl.y1, com.applovin.impl.o1
    public ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            a(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // com.applovin.impl.y1, com.applovin.impl.o1
    public boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // com.applovin.impl.y1
    protected void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.applovin.impl.y1
    protected void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.applovin.impl.y1
    protected void i() {
        this.m = yp.f;
    }

    public void a(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
