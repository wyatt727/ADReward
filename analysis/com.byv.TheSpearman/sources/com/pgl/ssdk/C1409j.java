package com.pgl.ssdk;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.pgl.ssdk.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1409j {
    private static Collection a(ByteBuffer byteBuffer) throws C1400a {
        ByteBuffer byteBufferA = C1406g.a(byteBuffer);
        byteBufferA.get(new byte[byteBufferA.remaining()]);
        byteBufferA.flip();
        byteBufferA.position(0);
        C1406g.a(byteBufferA);
        return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificates(new ByteArrayInputStream(C1406g.b(C1406g.a(byteBufferA))));
    }

    public static List a(InterfaceC1413n interfaceC1413n, C1402c c1402c) {
        try {
            try {
                ByteBuffer byteBufferA = C1406g.a(C1406g.a(interfaceC1413n, c1402c, 1896449818).f4315a);
                if (!byteBufferA.hasRemaining()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (byteBufferA.hasRemaining()) {
                    try {
                        arrayList.addAll(a(C1406g.a(byteBufferA)));
                    } catch (NoSuchAlgorithmException | CertificateException unused) {
                    }
                }
                return arrayList;
            } catch (C1400a | BufferUnderflowException unused2) {
                return null;
            }
        } catch (C1408i e) {
            throw new C1405f(e.getMessage());
        }
    }
}
