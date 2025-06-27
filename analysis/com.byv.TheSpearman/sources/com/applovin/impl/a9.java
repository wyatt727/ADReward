package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a9 extends y1 {
    private static final int i = Float.floatToIntBits(Float.NaN);

    a9() {
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) throws o1.b {
        int i2 = aVar.c;
        if (!yp.f(i2)) {
            throw new o1.b(aVar);
        }
        if (i2 != 4) {
            return new o1.a(aVar.f734a, aVar.b, 4);
        }
        return o1.a.e;
    }

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            byteBufferA = a((i2 / 3) * 4);
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferA);
                iPosition += 3;
            }
        } else if (i3 == 805306368) {
            byteBufferA = a(i2);
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferA);
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    private static void a(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
