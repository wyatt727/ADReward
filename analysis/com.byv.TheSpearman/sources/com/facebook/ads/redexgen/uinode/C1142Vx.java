package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1142Vx implements InterfaceC0758Gu {
    public static byte[] A00;
    public static final InterfaceC0757Gt A01;
    public static final C1142Vx A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, 26, 26, 14, 87, 4, 24, 2, 5, 20, 18};
    }

    static {
        A01();
        A02 = new C1142Vx();
        A01 = new C1143Vy();
    }

    public C1142Vx() {
    }

    public /* synthetic */ C1142Vx(C1143Vy c1143Vy) {
        this();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final long ADl(C0762Gy c0762Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
