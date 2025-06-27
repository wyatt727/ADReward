package com.my.tracker.obfuscated;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4265a = Charset.forName(C.UTF8_NAME);

    static int a(double d, OutputStream outputStream) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        outputStream.write(((int) jDoubleToRawLongBits) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 8)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 16)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 24)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 32)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 40)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 48)) & 255);
        outputStream.write(((int) (jDoubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    static int a(float f, OutputStream outputStream) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        outputStream.write(iFloatToRawIntBits & 255);
        outputStream.write((iFloatToRawIntBits >> 8) & 255);
        outputStream.write((iFloatToRawIntBits >> 16) & 255);
        outputStream.write((iFloatToRawIntBits >> 24) & 255);
        return 4;
    }

    public static int a(int i, double d, OutputStream outputStream) {
        return a(i, 1, outputStream) + a(d, outputStream);
    }

    public static int a(int i, float f, OutputStream outputStream) {
        return a(i, 5, outputStream) + a(f, outputStream);
    }

    static int a(int i, int i2, OutputStream outputStream) {
        return a((i << 3) | i2, outputStream);
    }

    public static int a(int i, long j, OutputStream outputStream) {
        return a(i, 0, outputStream) + a(j, outputStream);
    }

    public static int a(int i, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (byteArrayOutputStream == null) {
            return 0;
        }
        return a(i, 2, outputStream) + a(byteArrayOutputStream, outputStream);
    }

    static int a(int i, OutputStream outputStream) throws IOException {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & (-128)) == 0) {
                outputStream.write(i);
                return i2;
            }
            outputStream.write((i & 127) | 128);
            i >>>= 7;
        }
    }

    public static int a(int i, String str, OutputStream outputStream) {
        if (str == null) {
            return 0;
        }
        return a(i, 2, outputStream) + a(str, outputStream);
    }

    public static int a(int i, byte[] bArr, OutputStream outputStream) {
        if (bArr == null) {
            return 0;
        }
        return a(i, 2, outputStream) + a(bArr, outputStream);
    }

    public static int a(int i, String[] strArr, OutputStream outputStream) {
        if (strArr == null) {
            return 0;
        }
        int iA = 0;
        for (String str : strArr) {
            iA += a(i, str, outputStream);
        }
        return iA;
    }

    static int a(long j, OutputStream outputStream) throws IOException {
        int i = 0;
        while (true) {
            i++;
            if (((-128) & j) == 0) {
                outputStream.write((int) j);
                return i;
            }
            outputStream.write(((int) (127 & j)) | 128);
            j >>>= 7;
        }
    }

    static int a(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        int size = byteArrayOutputStream.size();
        int iB = b(size, outputStream) + size;
        byteArrayOutputStream.writeTo(outputStream);
        return iB;
    }

    static int a(String str, OutputStream outputStream) {
        return a(str.getBytes(f4265a), outputStream);
    }

    static int a(byte[] bArr, OutputStream outputStream) throws IOException {
        int iB = b(bArr.length, outputStream) + bArr.length;
        outputStream.write(bArr);
        return iB;
    }

    public static int b(int i, int i2, OutputStream outputStream) {
        return a(i, 0, outputStream) + b(i2, outputStream);
    }

    static int b(int i, OutputStream outputStream) {
        return i < 0 ? a(i, outputStream) : a(i, outputStream);
    }
}
