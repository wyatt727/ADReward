package com.facebook.ads.redexgen.uinode;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1193Xz implements InterfaceC0619As {
    public static byte[] A01;
    public static String[] A02 = {"uFnK", "23brwyJGPu3ZknDoMNdw3hVXVLFEULQy", "FtMR8ROvDO4Zz8SuhvbrIDHAZ1hbcqSx", "4tDbtxEkY45WyXaQwFKWRvOHK17MthWz", "P3L0", "jQPyzSgXTRUrKPul", "L4bq6z2eevSU7Qg95t0o6YCr4fHdh5", "Io3idew6HPzrUVEIzO8xEfp6xkmYSMtW"};
    public final /* synthetic */ C1192Xy A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[5].length() == 27) {
                throw new RuntimeException();
            }
            A02[5] = "3SKjhf7gYf6c2NzhB";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{109, 97, 92, 104, 121, 116, 114, 73, 111, 124, 126, 118, 18, 60, 53, 52, 41, 50, 53, 60, 123, 50, 54, 43, 52, 40, 40, 50, 57, 55, 34, 123, 55, 58, 41, 60, 62, 123, 58, 46, Utf8.REPLACEMENT_BYTE, 50, 52, 123, 55, 58, 47, 62, 53, 56, 34, 97, 123, 35, 0, 5, 2, 25, 31, 5, 3, 80, 17, 5, 20, 25, 31, 80, 4, 25, 29, 21, 3, 4, 17, 29, 0, 80, 88, 22, 2, 17, 29, 21, 80, 0, 31, 3, 25, 4, 25, 31, 30, 80, 29, 25, 3, 29, 17, 4, 19, 24, 89, 74, 80, 79, 108, 105, 110, 117, 115, 105, 111, 60, 125, 105, 120, 117, 115, 60, 104, 117, 113, 121, 111, 104, 125, 113, 108, 60, 52, 111, 101, 111, 104, 121, 113, 60, Byte.MAX_VALUE, 112, 115, Byte.MAX_VALUE, 119, 60, 113, 117, 111, 113, 125, 104, Byte.MAX_VALUE, 116, 53, 38, 60};
    }

    static {
        A01();
    }

    public C1193Xz(C1192Xy c1192Xy) {
        this.A00 = c1192Xy;
    }

    public /* synthetic */ C1193Xz(C1192Xy c1192Xy, C0622Av c0622Av) {
        this(c1192Xy);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0619As
    public final void ABv(long j) {
        Log.w(A00(2, 10, 112), A00(12, 41, 54) + j);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0619As
    public final void ACi(long j, long j2, long j3, long j4) {
        StringBuilder sbAppend = new StringBuilder().append(A00(53, 52, 29)).append(j);
        String strA00 = A00(0, 2, 44);
        String string = sbAppend.append(strA00).append(j2).append(strA00).append(j3).append(strA00).append(j4).append(strA00).append(this.A00.A03()).append(strA00).append(this.A00.A04()).toString();
        if (!C1192Xy.A0q) {
            String message = A00(2, 10, 112);
            Log.w(message, string);
            return;
        }
        throw new C0625Ay(string, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0619As
    public final void ADH(long j, long j2, long j3, long j4) {
        StringBuilder sbAppend = new StringBuilder().append(A00(105, 50, 113)).append(j);
        String strA00 = A00(0, 2, 44);
        String string = sbAppend.append(strA00).append(j2).append(strA00).append(j3).append(strA00).append(j4).append(strA00).append(this.A00.A03()).append(strA00).append(this.A00.A04()).toString();
        if (C1192Xy.A0q) {
            throw new C0625Ay(string, null);
        }
        String[] strArr = A02;
        String str = strArr[4];
        String message = strArr[0];
        if (str.length() != message.length()) {
            throw new RuntimeException();
        }
        A02[3] = "q4b4TTgkvPPQBYTsQFxk23ASltXkXf65";
        String message2 = A00(2, 10, 112);
        Log.w(message2, string);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0619As
    public final void ADQ(int i, long j) {
        if (this.A00.A0R != null) {
            this.A00.A0R.ADR(i, j, SystemClock.elapsedRealtime() - this.A00.A0E);
        }
    }
}
