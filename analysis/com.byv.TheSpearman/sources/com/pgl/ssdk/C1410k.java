package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.pgl.ssdk.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1410k implements InterfaceC1413n {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f4316a;
    private final long b;
    private final long c;

    public C1410k(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j2)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        this.f4316a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    private static void a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
        }
        if (j4 <= j3) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
    }

    public long a() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.f4316a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public ByteBuffer a(long j, int i) {
        int i2;
        if (i < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i)));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        a(j, i, a());
        if (i != 0) {
            if (i > byteBufferAllocate.remaining()) {
                throw new BufferOverflowException();
            }
            long j2 = this.b + j;
            int iLimit = byteBufferAllocate.limit();
            try {
                byteBufferAllocate.limit(byteBufferAllocate.position() + i);
                while (i > 0) {
                    synchronized (this.f4316a) {
                        this.f4316a.position(j2);
                        i2 = this.f4316a.read(byteBufferAllocate);
                    }
                    j2 += i2;
                    i -= i2;
                }
            } finally {
                byteBufferAllocate.limit(iLimit);
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public InterfaceC1413n a(long j, long j2) {
        long jA = a();
        a(j, j2, jA);
        return (j == 0 && j2 == jA) ? this : new C1410k(this.f4316a, this.b + j, j2);
    }
}
