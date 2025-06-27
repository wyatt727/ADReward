package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class n5 extends j2 {
    public final y4 b;
    public ByteBuffer c;
    public boolean d;
    public long f;
    public ByteBuffer g;
    private final int h;
    private final int i;

    public static n5 i() {
        return new n5(0);
    }

    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f708a;
        public final int b;

        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f708a = i;
            this.b = i2;
        }
    }

    public n5(int i) {
        this(i, 0);
    }

    public void g(int i) {
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = f(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferF = f(i3);
        byteBufferF.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferF.put(byteBuffer);
        }
        this.c = byteBufferF;
    }

    public final boolean h() {
        return d(1073741824);
    }

    @Override // com.applovin.impl.j2
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    private ByteBuffer f(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public n5(int i, int i2) {
        this.b = new y4();
        this.h = i;
        this.i = i2;
    }

    public void h(int i) {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.g.clear();
        } else {
            this.g = ByteBuffer.allocate(i);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
