package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class y1 implements o1 {
    protected o1.a b;
    protected o1.a c;
    private o1.a d;
    private o1.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    protected abstract o1.a b(o1.a aVar);

    protected void g() {
    }

    protected void h() {
    }

    protected void i() {
    }

    public y1() {
        ByteBuffer byteBuffer = o1.f733a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        o1.a aVar = o1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.applovin.impl.o1
    public final o1.a a(o1.a aVar) {
        this.d = aVar;
        this.e = b(aVar);
        return f() ? this.e : o1.a.e;
    }

    @Override // com.applovin.impl.o1
    public boolean f() {
        return this.e != o1.a.e;
    }

    @Override // com.applovin.impl.o1
    public final void e() {
        this.h = true;
        h();
    }

    @Override // com.applovin.impl.o1
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = o1.f733a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.o1
    public boolean c() {
        return this.h && this.g == o1.f733a;
    }

    @Override // com.applovin.impl.o1
    public final void b() {
        this.g = o1.f733a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // com.applovin.impl.o1
    public final void reset() {
        b();
        this.f = o1.f733a;
        o1.a aVar = o1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        i();
    }

    protected final boolean a() {
        return this.g.hasRemaining();
    }

    protected final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
