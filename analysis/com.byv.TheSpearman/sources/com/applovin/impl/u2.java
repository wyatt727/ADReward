package com.applovin.impl;

import com.applovin.impl.mi;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u2 extends d2 {
    private final n5 n;
    private final yg o;
    private long p;
    private t2 q;
    private long r;

    @Override // com.applovin.impl.li
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "CameraMotionRenderer";
    }

    public u2() {
        super(6);
        this.n = new n5(1);
        this.o = new yg();
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.oh.b
    public void a(int i, Object obj) {
        if (i == 8) {
            this.q = (t2) obj;
        } else {
            super.a(i, obj);
        }
    }

    @Override // com.applovin.impl.d2
    protected void v() {
        z();
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return j();
    }

    private void z() {
        t2 t2Var = this.q;
        if (t2Var != null) {
            t2Var.a();
        }
    }

    @Override // com.applovin.impl.d2
    protected void a(long j, boolean z) {
        this.r = Long.MIN_VALUE;
        z();
    }

    @Override // com.applovin.impl.d2
    protected void a(d9[] d9VarArr, long j, long j2) {
        this.p = j2;
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.o.a(byteBuffer.array(), byteBuffer.limit());
        this.o.f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.o.m());
        }
        return fArr;
    }

    @Override // com.applovin.impl.li
    public void a(long j, long j2) {
        while (!j() && this.r < 100000 + j) {
            this.n.b();
            if (a(r(), this.n, 0) != -4 || this.n.e()) {
                return;
            }
            n5 n5Var = this.n;
            this.r = n5Var.f;
            if (this.q != null && !n5Var.d()) {
                this.n.g();
                float[] fArrA = a((ByteBuffer) yp.a(this.n.c));
                if (fArrA != null) {
                    ((t2) yp.a(this.q)).a(this.r - this.p, fArrA);
                }
            }
        }
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if ("application/x-camera-motion".equals(d9Var.m)) {
            return mi.CC.a(4);
        }
        return mi.CC.a(0);
    }
}
