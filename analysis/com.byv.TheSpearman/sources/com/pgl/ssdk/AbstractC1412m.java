package com.pgl.ssdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* renamed from: com.pgl.ssdk.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1412m {
    public static C1411l a(InterfaceC1413n interfaceC1413n) {
        C1410k c1410k = (C1410k) interfaceC1413n;
        if (c1410k.a() < 22) {
            return null;
        }
        C1411l c1411lA = a(c1410k, 0);
        return c1411lA != null ? c1411lA : a(c1410k, 65535);
    }

    private static C1411l a(InterfaceC1413n interfaceC1413n, int i) {
        int i2;
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i)));
        }
        C1410k c1410k = (C1410k) interfaceC1413n;
        long jA = c1410k.a();
        if (jA < 22) {
            return null;
        }
        int iMin = ((int) Math.min(i, jA - 22)) + 22;
        long j = jA - iMin;
        ByteBuffer byteBufferA = c1410k.a(j, iMin);
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        a(byteBufferA);
        int iCapacity = byteBufferA.capacity();
        if (iCapacity >= 22) {
            int i3 = iCapacity - 22;
            int iMin2 = Math.min(i3, 65535);
            for (int i4 = 0; i4 <= iMin2; i4++) {
                i2 = i3 - i4;
                if (byteBufferA.getInt(i2) == 101010256 && (byteBufferA.getShort(i2 + 20) & UShort.MAX_VALUE) == i4) {
                    break;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferA.position(i2);
        ByteBuffer byteBufferSlice = byteBufferA.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return new C1411l(byteBufferSlice, Long.valueOf(j + i2));
    }

    static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L;
    }

    public static int d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getShort(byteBuffer.position() + 10) & UShort.MAX_VALUE;
    }
}
