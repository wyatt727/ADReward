package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:37:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:43:0x00ae */
    public static long A00(C0762Gy c0762Gy, long j, long j2, InterfaceC0758Gu interfaceC0758Gu, byte[] bArr, I3 i3, int i, HP hp) throws InterruptedException, IOException {
        InterfaceC0758Gu interfaceC0758Gu2;
        while (true) {
            if (i3 != null) {
                i3.A01(i);
            }
            try {
                break;
            } catch (I2 unused) {
            } finally {
                IF.A0W(interfaceC0758Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0762Gy c0762Gy2 = new C0762Gy(c0762Gy.A04, c0762Gy.A06, j, (c0762Gy.A03 + j) - c0762Gy.A01, -1L, c0762Gy.A05, c0762Gy.A00 | 2);
        long jADl = interfaceC0758Gu2.ADl(c0762Gy2);
        if (hp.A01 == -1 && jADl != -1) {
            hp.A01 = c0762Gy2.A01 + jADl;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i2 = interfaceC0758Gu2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (i2 != -1) {
                j3 += i2;
                hp.A02 += i2;
            } else if (hp.A01 == -1) {
                hp.A01 = c0762Gy2.A01 + j3;
            }
        }
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0762Gy c0762Gy) {
        if (c0762Gy.A05 != null) {
            return c0762Gy.A05;
        }
        Uri uri = c0762Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0762Gy c0762Gy, HK hk, C1129Vk c1129Vk, byte[] bArr, I3 i3, int i, HP hp, AtomicBoolean atomicBoolean, boolean z) throws InterruptedException, IOException {
        long start;
        HP hp2 = hp;
        AbstractC0763Ha.A01(c1129Vk);
        AbstractC0763Ha.A01(bArr);
        if (hp2 != null) {
            A04(c0762Gy, hk, hp2);
        } else {
            hp2 = new HP();
        }
        String strA02 = A02(c0762Gy);
        long j = c0762Gy.A01;
        long start2 = c0762Gy.A02;
        if (start2 != -1) {
            start = c0762Gy.A02;
        } else {
            start = hk.A6W(strA02);
        }
        while (true) {
            long j2 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long jA6G = hk.A6G(strA02, j, start != -1 ? start : Long.MAX_VALUE);
                    if (jA6G <= 0) {
                        long j3 = -jA6G;
                        jA6G = j3;
                        if (A00(c0762Gy, j, j3, c1129Vk, bArr, i3, i, hp2) < jA6G) {
                            if (!z || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j += jA6G;
                    if (start != -1) {
                        j2 = jA6G;
                    }
                    start -= j2;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0762Gy c0762Gy, HK hk, HP hp) {
        long left;
        String strA02 = A02(c0762Gy);
        long j = c0762Gy.A01;
        if (c0762Gy.A02 != -1) {
            left = c0762Gy.A02;
        } else {
            left = hk.A6W(strA02);
        }
        hp.A01 = left;
        hp.A00 = 0L;
        hp.A02 = 0L;
        while (left != 0) {
            long jA6G = hk.A6G(strA02, j, left != -1 ? left : Long.MAX_VALUE);
            if (jA6G > 0) {
                hp.A00 += jA6G;
            } else {
                jA6G = -jA6G;
                if (jA6G == Long.MAX_VALUE) {
                    return;
                }
            }
            j += jA6G;
            if (left == -1) {
                jA6G = 0;
            }
            left -= jA6G;
        }
    }

    public static void A05(HK hk, String str) {
        Iterator<HO> it = hk.A6H(str).iterator();
        while (it.hasNext()) {
            try {
                hk.AF9(it.next());
            } catch (HI unused) {
            }
        }
    }
}
