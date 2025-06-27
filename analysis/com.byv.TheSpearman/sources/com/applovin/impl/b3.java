package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class b3 extends y1 {
    private int[] i;
    private int[] j;

    b3() {
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) throws o1.b {
        int[] iArr = this.i;
        if (iArr == null) {
            return o1.a.e;
        }
        if (aVar.c == 2) {
            boolean z = aVar.b != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 >= aVar.b) {
                    throw new o1.b(aVar);
                }
                z |= i2 != i;
                i++;
            }
            if (z) {
                return new o1.a(aVar.f734a, iArr.length, 2);
            }
            return o1.a.e;
        }
        throw new o1.b(aVar);
    }

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a1.a(this.j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // com.applovin.impl.y1
    protected void g() {
        this.j = this.i;
    }

    @Override // com.applovin.impl.y1
    protected void i() {
        this.j = null;
        this.i = null;
    }

    public void a(int[] iArr) {
        this.i = iArr;
    }
}
