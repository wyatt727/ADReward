package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1349bi implements C0K {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"0sQYFfkZHHeVMKUBSEw8nV", "OMjsYZjecgzBPFsO2qu9DXSbxh5JXpo7", "UT2rHb55ERwVxNOqpRWPVvfe1UkWVyPP", "dnZnJ0uYb7k8tLcQy7f3QyFDUQrwjEiR", "oxpcdWRNT0kUjhHWpmvIkR5l", "M5dLDfrAE2TxcxVuZGCd0hZ7u7RiqVG3", "YVmAwTI", "30bRwIya64cDsyZ9K4ZP4bQrXzvqCneG"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
            if (A09[7].charAt(10) == 'N') {
                throw new RuntimeException();
            }
            A09[3] = "xmylGJpTyqy6yVXTtCE3KaogQJsBWdto";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-65, 8, 18, -65, 8, 13, 19, 4, 17, 17, 20, 15, 19, 4, 3, -65, 19, 14, -65, -45, 42, 28, 39, 27, -45, 34, 25, 25, 38, 24, 39, -45, -19, -31, 36, 48, 47, 53, 38, 47, 53, -18, 45, 38, 47, 40, 53, 41, -5, -31, -100, -84, -110, -43, -31, -32, -32, -41, -43, -26, -37, -31, -32, -110, -37, -27, -110, -45, -44, -27, -41, -32, -26, -109, 8, 52, 51, 57, 42, 51, 57, -27, 46, 51, 43, 52, -27, 43, 52, 55, -27, 37, -1, 44, 44, 41, 44, -38, 30, 35, 45, 29, 41, 40, 40, 31, 29, 46, 35, 40, 33, -38, 2, 46, 46, 42, 15, 44, 38, -3, 41, 40, 40, 31, 29, 46, 35, 41, 40, -17, 28, 28, 25, 28, -54, 16, 15, 30, 13, 18, 19, 24, 17, -54, 19, 24, 16, 25, -54, 16, 28, 25, 23, -54, -31, 14, 14, 11, 14, -68, 11, 12, 1, 10, 5, 10, 3, -68, -1, 11, 10, 10, 1, -1, 16, 5, 11, 10, -68, 2, 11, 14, -68, 10, 55, 55, 52, 55, -27, 55, 42, 38, 41, 46, 51, 44, -27, 41, 38, 57, 38, -27, 43, 55, 52, 50, -27, -50, -6, -6, -10, -37, -8, -14, -39, -11, -5, -8, -23, -21, 1, -5, -8, -14, -61, -83, -38, -3, -15, -17, 2, -9, -3, -4, 18, 51, 40, 49, -29, 38, 50, 49, 49, 40, 38, 55, 44, 50, 49, -29, -21, -6, 7, 0, -2, -53, -34, -38, -35, -103, -36, -24, -25, -19, -34, -25, -19, -103, -30, -25, -33, -24, -103, -33, -21, -24, -26, -103, 15, 34, 30, 33, 38, 43, 36, -35, 48, 44, 50, 47, 32, 34, -35, 27, 54, 54, -25, 52, 40, 53, 64, -25, 57, 44, 43, 48, 57, 44, 42, 59, 58, 1, -25, -9, -47, -73, 4, 0, 4, -4, -47, -73, 62, 85, 80, 65, 79, 25, 49};
    }

    static {
        A04();
        A07 = C1349bi.class.getSimpleName();
    }

    public C1349bi(String str) {
        this(str, C0I.A01(str));
    }

    public C1349bi(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C1349bi(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) C0J.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.A05;
    }

    private HttpURLConnection A02(int i, int i2) throws IOException, C1351bk {
        HttpURLConnection httpURLConnection;
        int code;
        int i3 = 0;
        String headerField = this.A03;
        do {
            String str = A01(234, 16, 102) + (i > 0 ? A01(19, 13, 86) + i : A01(0, 0, 78)) + A01(15, 4, 66) + headerField;
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(A01(250, 5, 60), A01(322, 6, 127) + i + A01(50, 1, 18));
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int code2 = httpURLConnection.getResponseCode();
            this.A04 = code2;
            String[] strArr = A09;
            String url = strArr[1];
            String str2 = strArr[5];
            int iCharAt = url.charAt(4);
            int redirectCount = str2.charAt(4);
            if (iCharAt == redirectCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[2] = "PLgwygtF0FJvu0SiSas8utQP577qcxnM";
            strArr2[0] = "YPLv6eSsZkmOoYsRk43xhT";
            code = (code2 == 301 || code2 == 302 || code2 == 303) ? 1 : 0;
            if (code != 0) {
                headerField = httpURLConnection.getHeaderField(A01(226, 8, 49));
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 > 5) {
                String url2 = A01(293, 20, 106) + i3;
                throw new C1351bk(url2);
            }
        } while (code != 0);
        return httpURLConnection;
    }

    private void A03() throws IOException, C1351bk {
        String[] strArr;
        String str = A01(255, 23, 28) + this.A03;
        HttpURLConnection httpURLConnectionA02 = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionA02 = A02(0, 10000);
                this.A05 = httpURLConnectionA02.getContentLength();
                this.A06 = httpURLConnectionA02.getContentType();
                inputStream = httpURLConnectionA02.getInputStream();
                Log.i(A07, A01(74, 18, 104) + this.A03 + A01(313, 9, 58) + this.A06 + A01(32, 18, 100) + this.A05);
                C0I.A05(inputStream);
                strArr = A09;
            } catch (IOException e) {
                Log.e(A07, A01(129, 25, 77) + this.A03, e);
                C0I.A05(inputStream);
                if (httpURLConnectionA02 != null) {
                }
            }
            if (strArr[6].length() != strArr[4].length()) {
                A09[3] = "wXbsZKrVFoHdOYHZfC25A956bVUh0jFV";
                if (httpURLConnectionA02 != null) {
                    httpURLConnectionA02.disconnect();
                }
                return;
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            C0I.A05(inputStream);
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws C1351bk {
        try {
            HttpURLConnection httpURLConnectionA02 = A02(i, i2);
            this.A02 = httpURLConnectionA02;
            this.A06 = httpURLConnectionA02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.A02;
            this.A05 = A00(httpURLConnection, i, httpURLConnection.getResponseCode());
        } catch (IOException e) {
            throw new C1351bk(A01(154, 29, 63) + this.A03 + A01(19, 13, 86) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final void ADm(int i) throws C1351bk {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final void close() throws C1351bk {
        HttpURLConnection httpURLConnection = this.A02;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (NullPointerException e) {
                throw new C1351bk(A01(92, 37, 93), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final synchronized int length() throws C1351bk {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final int read(byte[] bArr) throws C1351bk {
        InputStream inputStream = this.A01;
        String strA01 = A01(Opcodes.INVOKESPECIAL, 24, 104);
        if (inputStream != null) {
            try {
                return inputStream.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new GF(A01(278, 15, 96) + this.A03 + A01(0, 15, 66), e);
            } catch (IOException e2) {
                throw new C1351bk(strA01 + this.A03, e2);
            }
        }
        throw new C1351bk(strA01 + this.A03 + A01(51, 23, 21));
    }

    public final String toString() {
        return A01(207, 19, 41) + this.A03 + A01(328, 1, 87);
    }
}
