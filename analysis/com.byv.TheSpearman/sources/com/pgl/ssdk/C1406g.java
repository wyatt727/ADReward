package com.pgl.ssdk;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1406g {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static C1407h a(InterfaceC1413n interfaceC1413n, C1415p c1415p, int i) throws C1408i {
        try {
            C1404e c1404eA = AbstractC1403d.a(interfaceC1413n, c1415p);
            long jB = c1404eA.b();
            C1410k c1410k = (C1410k) c1404eA.a();
            ByteBuffer byteBufferA = c1410k.a(0L, (int) c1410k.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBufferA.order() != ByteOrder.LITTLE_ENDIAN) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBufferA.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBufferA.capacity();
            if (iCapacity > byteBufferA.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBufferA.limit();
            int iPosition = byteBufferA.position();
            int i2 = 0;
            try {
                byteBufferA.position(0);
                byteBufferA.limit(iCapacity);
                byteBufferA.position(8);
                ByteBuffer byteBufferSlice = byteBufferA.slice();
                byteBufferSlice.order(byteBufferA.order());
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new C1408i("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
                    }
                    long j = byteBufferSlice.getLong();
                    if (j < 4 || j > 2147483647L) {
                        throw new C1408i("APK Signing Block entry #" + i2 + " size out of range: " + j);
                    }
                    int i3 = (int) j;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new C1408i("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == i) {
                        return new C1407h(a(byteBufferSlice, i3 - 4), jB, c1415p.a(), c1415p.e(), c1415p.d());
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new C1408i("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
            } finally {
                byteBufferA.position(0);
                byteBufferA.limit(iLimit);
                byteBufferA.position(iPosition);
            }
        } catch (C1401b e) {
            throw new C1408i(e.getMessage(), e);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws C1400a {
        if (byteBuffer.remaining() < 4) {
            throw new C1400a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return a(byteBuffer, i);
        }
        throw new C1400a("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static byte[] b(ByteBuffer byteBuffer) throws C1400a {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C1400a("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new C1400a("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }
}
