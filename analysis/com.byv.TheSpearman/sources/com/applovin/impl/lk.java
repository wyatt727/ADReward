package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class lk implements o1 {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private o1.a e;
    private o1.a f;
    private o1.a g;
    private o1.a h;
    private boolean i;
    private kk j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public lk() {
        o1.a aVar = o1.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = o1.f733a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.applovin.impl.o1
    public o1.a a(o1.a aVar) throws o1.b {
        if (aVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = aVar.f734a;
            }
            this.e = aVar;
            o1.a aVar2 = new o1.a(i, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new o1.b(aVar);
    }

    @Override // com.applovin.impl.o1
    public boolean f() {
        return this.f.f734a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f734a != this.e.f734a);
    }

    @Override // com.applovin.impl.o1
    public void e() {
        kk kkVar = this.j;
        if (kkVar != null) {
            kkVar.e();
        }
        this.p = true;
    }

    @Override // com.applovin.impl.o1
    public ByteBuffer d() {
        int iB;
        kk kkVar = this.j;
        if (kkVar != null && (iB = kkVar.b()) > 0) {
            if (this.k.capacity() < iB) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                this.k = byteBufferOrder;
                this.l = byteBufferOrder.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            kkVar.a(this.l);
            this.o += iB;
            this.k.limit(iB);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = o1.f733a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.o1
    public boolean c() {
        kk kkVar;
        return this.p && ((kkVar = this.j) == null || kkVar.b() == 0);
    }

    @Override // com.applovin.impl.o1
    public void b() {
        if (f()) {
            o1.a aVar = this.e;
            this.g = aVar;
            o1.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new kk(aVar.f734a, aVar.b, this.c, this.d, aVar2.f734a);
            } else {
                kk kkVar = this.j;
                if (kkVar != null) {
                    kkVar.a();
                }
            }
        }
        this.m = o1.f733a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.applovin.impl.o1
    public void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        o1.a aVar = o1.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = o1.f733a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public long a(long j) {
        if (this.o >= 1024) {
            long jC = this.n - ((kk) a1.a(this.j)).c();
            int i = this.h.f734a;
            int i2 = this.g.f734a;
            if (i == i2) {
                return yp.c(j, jC, this.o);
            }
            return yp.c(j, jC * i, this.o * i2);
        }
        return (long) (this.c * j);
    }

    public void b(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            kk kkVar = (kk) a1.a(this.j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += iRemaining;
            kkVar.b(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    public void a(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }
}
