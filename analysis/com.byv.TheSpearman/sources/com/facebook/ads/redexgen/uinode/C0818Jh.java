package com.facebook.ads.redexgen.uinode;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0818Jh implements RK {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public AnonymousClass89 A00;
    public Executor A01;
    public boolean A02;
    public RP A03;
    public final RU A04 = new C0829Js();
    public final RZ A05;
    public final InterfaceC1016Ra A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final RJ A01(RW rw) throws RX {
        String strA07 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        C0823Jm c0823JmA05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(rw.A05(), L0.A04() ? A09() : null);
                A0H(httpURLConnectionA08, rw);
                A0G(httpURLConnectionA08, rw);
                if (this.A06.A98()) {
                    this.A06.A9y(httpURLConnectionA08, rw.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean z2 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        AbstractC1017Rb.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e) {
                        this.A00.AA2(strA07, C8A.A1z, new C8B(e));
                    } catch (Exception e2) {
                        this.A00.AA2(strA07, C8A.A1y, new C8B(e2));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && rw.A06() != null) {
                    A00(httpURLConnectionA08, rw.A06());
                }
                C0823Jm c0823JmA06 = httpURLConnectionA08.getDoInput() ? A06(httpURLConnectionA08) : new C0823Jm(httpURLConnectionA08, null);
                if (this.A06.A98()) {
                    this.A06.A9z(c0823JmA06);
                }
                if (httpURLConnectionA08 != null) {
                    httpURLConnectionA08.disconnect();
                }
                return c0823JmA06;
            } catch (Exception e3) {
                try {
                    try {
                        c0823JmA05 = A05(null);
                        if (c0823JmA05 == null || c0823JmA05.A83() <= 0) {
                            throw new RX(e3, c0823JmA05);
                        }
                        if (this.A06.A98()) {
                            this.A06.A9z(c0823JmA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return c0823JmA05;
                    } catch (Exception unused) {
                        Log.e(getClass().getSimpleName(), A07(117, 13, 53), e3);
                        if (c0823JmA05 == null || c0823JmA05.A83() <= 0) {
                            throw new RX(e3, c0823JmA05);
                        }
                        if (this.A06.A98()) {
                            InterfaceC1016Ra interfaceC1016Ra = this.A06;
                            String[] strArr = A08;
                            if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[0] = "IlkFDbfWlXmKaUvETbHYmdNk6OEHYi1H";
                            strArr2[2] = "BN3YcSqfdOqAJI6hng3gZMbRThXyngdJ";
                            interfaceC1016Ra.A9z(c0823JmA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return c0823JmA05;
                    }
                } catch (Throwable unused2) {
                    if (c0823JmA05 == null || c0823JmA05.A83() <= 0) {
                        throw new RX(e3, c0823JmA05);
                    }
                    if (this.A06.A98()) {
                        this.A06.A9z(c0823JmA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c0823JmA05;
                }
            }
        } catch (Throwable th) {
            if (this.A06.A98()) {
                this.A06.A9z(c0823JmA05);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, Utf8.REPLACEMENT_BYTE, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, Utf8.REPLACEMENT_BYTE, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x017c, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        if (r30.A04 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        r7.A9t(r1, r10, 0, r3, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 27)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a5, code lost:
    
        r3 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.uinode.RJ A0J(com.facebook.ads.redexgen.uinode.RW r30) throws java.lang.InterruptedException, com.facebook.ads.redexgen.uinode.RX {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0818Jh.A0J(com.facebook.ads.redexgen.X.RW):com.facebook.ads.redexgen.X.RJ");
    }

    static {
        A0A();
        A09 = RK.class.getSimpleName();
    }

    public C0818Jh(RP rp, AnonymousClass89 anonymousClass89, Executor executor) {
        A0B();
        this.A03 = rp;
        final JN jn = new JN(rp.A04());
        this.A06 = jn;
        this.A05 = new AbstractC0828Jr(jn) { // from class: com.facebook.ads.redexgen.X.76
        };
        this.A01 = executor;
        this.A00 = anonymousClass89;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamADq = null;
        try {
            outputStreamADq = this.A05.ADq(httpURLConnection);
            if (outputStreamADq != null) {
                this.A05.AHG(outputStreamADq, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStreamADq != null) {
                try {
                    outputStreamADq.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStreamADq != null) {
                try {
                    outputStreamADq.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final RJ A02(RW rw) {
        if (this.A03.A04()) {
            A0C(rw);
        }
        RJ rjA01 = null;
        try {
            rjA01 = A01(rw);
            return rjA01;
        } catch (RX hre) {
            this.A05.ABU(hre);
            return rjA01;
        } catch (Exception e) {
            this.A05.ABU(new RX(e, rjA01));
            return rjA01;
        }
    }

    private final RJ A03(String str, RY ry, RS rs) {
        return A02(new C0825Jo(str, ry, rs));
    }

    private final RJ A04(String str, String str2, byte[] bArr, RS rs) {
        return A02(new C0824Jn(str, null, str2, bArr, rs));
    }

    private final C0823Jm A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] responseBody = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                responseBody = this.A05.AEO(errorStream);
            }
            C0823Jm c0823Jm = new C0823Jm(httpURLConnection, responseBody);
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
            return c0823Jm;
        } catch (Throwable th) {
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            A08[4] = "eS";
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final C0823Jm A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamADp = null;
        byte[] responseBody = null;
        try {
            inputStreamADp = this.A05.ADp(httpURLConnection);
            if (inputStreamADp != null) {
                responseBody = this.A05.AEO(inputStreamADp);
            }
            C0823Jm c0823Jm = new C0823Jm(httpURLConnection, responseBody);
            if (inputStreamADp != null) {
                try {
                    inputStreamADp.close();
                } catch (Exception unused) {
                }
            }
            return c0823Jm;
        } catch (Throwable th) {
            if (inputStreamADp != null) {
                try {
                    inputStreamADp.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ADo(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static Proxy A09() throws NumberFormatException {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String property2 = System.getProperty(A07(206, 14, 74));
        int i = -1;
        if (property2 != null) {
            try {
                i = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String proxyAddress = strArr[0];
        String portStr = strArr[2];
        if (proxyAddress.charAt(28) == portStr.charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!zIsEmpty && i > 0 && i <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(RW rw) {
        StringBuilder sb = new StringBuilder(A07(Opcodes.INVOKEVIRTUAL, 10, 17));
        boolean zEquals = rw.A03().equals(RV.A06);
        String strA07 = A07(41, 1, 33);
        if (zEquals && rw.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(rw.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(strA07);
        }
        Map<String, String> mapA06 = rw.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : mapA06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(strA07);
        }
        sb.append(A07(0, 2, 109));
        sb.append(rw.A05());
        sb.append(strA07);
        String string = sb.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(RW rw, RL rl) {
        this.A04.A63(this, rl, this.A01).A04(rw);
        if (this.A03.A04()) {
            A0C(rw);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, RL rl, RS rs) {
        C0824Jn req = new C0824Jn(str, null, str2, bArr, rs);
        A0D(req, rl);
    }

    private void A0G(HttpURLConnection httpURLConnection, RW rw) {
        Map<String, String> mapA06 = rw.A02().A06();
        RI riA05 = rw.A02().A05();
        for (String str : mapA06.keySet()) {
            httpURLConnection.setRequestProperty(str, mapA06.get(str));
        }
        if (riA05 != null) {
            Map<String, String> mapA5o = riA05.A5o(this.A03.A03());
            for (String str2 : mapA5o.keySet()) {
                httpURLConnection.setRequestProperty(str2, mapA5o.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, RW rw) throws IOException {
        RS rsA02 = rw.A02();
        httpURLConnection.setConnectTimeout(rsA02.A00());
        httpURLConnection.setReadTimeout(rsA02.A02());
        this.A05.AE6(httpURLConnection, rw.A03(), rw.A04());
    }

    private final boolean A0I(Throwable th, long j, RW rw) {
        RS rsA02 = rw.A02();
        long elapsedTime = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A98()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + rsA02.A00() + A07(49, 7, 109) + rsA02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) rsA02.A02());
        }
        long jA00 = rsA02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= jA00;
    }

    public final RP A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.RK
    @Deprecated
    public final RJ ADy(String str, Map<String, String> parameters) {
        return A03(str, new RY(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.RK
    @Deprecated
    public final RJ ADz(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.RK
    public final void AE0(String str, byte[] bArr, RL rl) {
        A0F(str, A07(135, 47, 70), bArr, rl, this.A03.A00());
    }
}
