package com.mbridge.msdk.e.a.a;

import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.z;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkUtility.java */
/* loaded from: classes4.dex */
final class h {
    static byte[] a(InputStream inputStream, int i, c cVar) throws Throwable {
        byte[] bArrA;
        j jVar = new j(cVar, i);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrA);
                    if (i2 == -1) {
                        break;
                    }
                    jVar.write(bArrA, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            aa.a("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.a(bArrA);
                    jVar.close();
                    throw th;
                }
            }
            byte[] byteArray = jVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    aa.a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            cVar.a(bArrA);
            jVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    /* compiled from: NetworkUtility.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f2694a;
        private final z b;

        private a(String str, z zVar) {
            this.f2694a = str;
            this.b = zVar;
        }
    }
}
