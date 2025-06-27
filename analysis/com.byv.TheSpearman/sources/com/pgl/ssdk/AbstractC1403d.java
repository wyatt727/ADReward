package com.pgl.ssdk;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipFile;

/* renamed from: com.pgl.ssdk.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1403d {
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static C1402c a(InterfaceC1413n interfaceC1413n) throws C1414o {
        C1411l c1411lA = AbstractC1412m.a(interfaceC1413n);
        if (c1411lA == null) {
            throw new C1414o("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBuffer = (ByteBuffer) c1411lA.a();
        long jLongValue = ((Long) c1411lA.b()).longValue();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long jB = AbstractC1412m.b(byteBuffer);
        if (jB > jLongValue) {
            throw new C1414o("ZIP Central Directory start offset out of range: " + jB + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        long jC = AbstractC1412m.c(byteBuffer);
        long j = jB + jC;
        if (j <= jLongValue) {
            C1415p c1415p = new C1415p(jB, jC, AbstractC1412m.d(byteBuffer), jLongValue, byteBuffer);
            return new C1402c(c1415p.a(), c1415p.c(), c1415p.b(), c1415p.e(), c1415p.d());
        }
        throw new C1414o("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j + ", EoCD start: " + jLongValue);
    }

    public static C1404e a(InterfaceC1413n interfaceC1413n, C1415p c1415p) throws C1401b {
        long jA = c1415p.a();
        long jC = c1415p.c() + jA;
        long jE = c1415p.e();
        if (jC != jE) {
            throw new C1401b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + jC + ", EoCD start: " + jE);
        }
        if (jA < 32) {
            throw new C1401b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
        }
        C1410k c1410k = (C1410k) interfaceC1413n;
        ByteBuffer byteBufferA = c1410k.a(jA - 24, 24);
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBufferA.getLong(8) != 2334950737559900225L || byteBufferA.getLong(16) != 3617552046287187010L) {
            throw new C1401b("No APK Signing Block before ZIP Central Directory");
        }
        long j = byteBufferA.getLong(0);
        if (j < byteBufferA.capacity() || j > 2147483639) {
            throw new C1401b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
        }
        long j2 = (int) (8 + j);
        long j3 = jA - j2;
        if (j3 < 0) {
            throw new C1401b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
        }
        ByteBuffer byteBufferA2 = c1410k.a(j3, 8);
        byteBufferA2.order(ByteOrder.LITTLE_ENDIAN);
        long j4 = byteBufferA2.getLong(0);
        if (j4 == j) {
            return new C1404e(j3, c1410k.a(j3, j2));
        }
        throw new C1401b("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j);
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void a(ZipFile zipFile) throws IOException {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }

    public static void a(Runnable runnable) {
        X xC = W.a().c();
        if (xC != null) {
            xC.post(runnable);
        }
    }
}
