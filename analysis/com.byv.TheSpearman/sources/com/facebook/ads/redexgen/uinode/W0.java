package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class W0 implements InterfaceC0758Gu {
    public static byte[] A0A;
    public static String[] A0B = {"QvoqMDlujHZGkbfh87JugdjLyzIxT7Wh", "ZZchp3HeTsLmxg3WfZ3Y", "qhagKIv", "Y1FNp0MjJJUWN0FCWTznZ2J9LVjCbw0g", "qdDuvYrChXaUr4tN", "YWBrlCwfH1YxEEmdkJFSbaSmAQF4", "KXNImhaNyDm6MeVCqM70", "pGNt1qWL1myUumzYaBIGkqUD2WTNJwvO"};
    public InterfaceC0758Gu A00;
    public InterfaceC0758Gu A01;
    public InterfaceC0758Gu A02;
    public InterfaceC0758Gu A03;
    public InterfaceC0758Gu A04;
    public InterfaceC0758Gu A05;
    public InterfaceC0758Gu A06;
    public final Context A07;
    public final InterfaceC0758Gu A08;
    public final HG<? super InterfaceC0758Gu> A09;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{22, 88, 87, 93, 75, 86, 80, 93, 102, 88, 74, 74, 92, 77, 22, 11, 62, 62, 47, 39, 58, 62, 35, 36, 45, 106, 62, 37, 106, 58, 38, 43, 51, 106, 24, 30, 7, 26, 106, 57, 62, 56, 47, 43, 39, 106, Base64.padSymbol, 35, 62, 34, 37, Utf8.REPLACEMENT_BYTE, 62, 106, 46, 47, 58, 47, 36, 46, 35, 36, 45, 106, 37, 36, 106, 62, 34, 47, 106, 24, 30, 7, 26, 106, 47, 50, 62, 47, 36, 57, 35, 37, 36, 6, 39, 36, 35, 55, 46, 54, 6, 35, 54, 35, 17, 45, 55, 48, 33, 39, 15, 56, 56, 37, 56, 106, 35, 36, 57, 62, 43, 36, 62, 35, 43, 62, 35, 36, 45, 106, 24, 30, 7, 26, 106, 47, 50, 62, 47, 36, 57, 35, 37, 36, 60, 46, 46, 56, 41, 81, 93, 95, 28, 84, 83, 81, 87, 80, 93, 93, 89, 28, 83, 86, 65, 28, 91, 92, 70, 87, 64, 92, 83, 94, 28, 87, 74, 93, 66, 94, 83, 75, 87, 64, 0, 28, 87, 74, 70, 28, 64, 70, 95, 66, 28, 96, 70, 95, 66, 118, 83, 70, 83, 97, 93, 71, 64, 81, 87, 96, 108, 109, 119, 102, 109, 119, 115, 118, 99, 118, 89, 74, 92, 89, 78, 88, 68, 94, 89, 72, 78, 87, 81, 72, 85};
    }

    static {
        A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public W0(Context context, HG<? super InterfaceC0758Gu> hg, InterfaceC0758Gu interfaceC0758Gu) {
        this.A07 = context.getApplicationContext();
        this.A09 = hg;
        this.A08 = (InterfaceC0758Gu) AbstractC0763Ha.A01(interfaceC0758Gu);
    }

    private InterfaceC0758Gu A00() {
        if (this.A00 == null) {
            this.A00 = new W5(this.A07, this.A09);
        }
        return this.A00;
    }

    private InterfaceC0758Gu A01() {
        if (this.A01 == null) {
            this.A01 = new W4(this.A07, this.A09);
        }
        return this.A01;
    }

    private InterfaceC0758Gu A02() {
        if (this.A02 == null) {
            this.A02 = new W3();
        }
        return this.A02;
    }

    private InterfaceC0758Gu A03() {
        if (this.A04 == null) {
            this.A04 = new C1141Vw(this.A09);
        }
        return this.A04;
    }

    private InterfaceC0758Gu A04() {
        if (this.A05 == null) {
            this.A05 = new C1133Vo(this.A07, this.A09);
        }
        return this.A05;
    }

    private InterfaceC0758Gu A05() throws Exception {
        if (this.A06 == null) {
            try {
                this.A06 = (InterfaceC0758Gu) Class.forName(A06(Opcodes.F2D, 60, 110)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(A06(85, 17, 30), A06(15, 70, 22));
            } catch (Exception e) {
                throw new RuntimeException(A06(102, 34, 22), e);
            }
            InterfaceC0758Gu interfaceC0758Gu = this.A06;
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "M1stUSKIngTBOPXJSAAv";
            strArr2[4] = "pJ0gFaSQQ06jpnK4";
            if (interfaceC0758Gu == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final Uri A8E() {
        InterfaceC0758Gu interfaceC0758Gu = this.A03;
        if (interfaceC0758Gu == null) {
            return null;
        }
        return interfaceC0758Gu.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final long ADl(C0762Gy c0762Gy) throws IOException {
        AbstractC0763Ha.A04(this.A03 == null);
        String scheme = c0762Gy.A04.getScheme();
        if (IF.A0e(c0762Gy.A04)) {
            String path = c0762Gy.A04.getPath();
            String scheme2 = A06(0, 15, 101);
            if (path.startsWith(scheme2)) {
                InterfaceC0758Gu interfaceC0758GuA00 = A00();
                String[] strArr = A0B;
                String str = strArr[1];
                String scheme3 = strArr[2];
                if (str.length() == scheme3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0B;
                strArr2[1] = "klcz1c4PkgrD18lWpLHv";
                strArr2[2] = "u5g7BFA";
                this.A03 = interfaceC0758GuA00;
            } else {
                this.A03 = A03();
            }
        } else {
            String scheme4 = A06(136, 5, 1);
            if (scheme4.equals(scheme)) {
                this.A03 = A00();
            } else {
                String scheme5 = A06(201, 7, 95);
                if (scheme5.equals(scheme)) {
                    this.A03 = A01();
                } else {
                    String scheme6 = A06(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 4, 121);
                    if (scheme6.equals(scheme)) {
                        this.A03 = A05();
                    } else {
                        String scheme7 = A06(208, 4, 75);
                        if (scheme7.equals(scheme)) {
                            this.A03 = A02();
                        } else {
                            String scheme8 = A06(212, 11, 119);
                            if (scheme8.equals(scheme)) {
                                this.A03 = A04();
                            } else {
                                this.A03 = this.A08;
                            }
                        }
                    }
                }
            }
        }
        return this.A03.ADl(c0762Gy);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final void close() throws IOException {
        InterfaceC0758Gu interfaceC0758Gu = this.A03;
        if (interfaceC0758Gu != null) {
            try {
                interfaceC0758Gu.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0758Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.A03.read(bArr, i, i2);
    }
}
