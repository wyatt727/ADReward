package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class IL extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public Handler A00;
    public RunnableC0773Hk A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-34, 15, 7, 7, 19, -19, 15, 12, 0, -5, -3, -1, -70, -43, -35, -32, -39, -40, -108, -24, -29, -108, -35, -30, -35, -24, -35, -43, -32, -35, -18, -39, -108, -40, -23, -31, -31, -19, -108, -25, -23, -26, -38, -43, -41, -39, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -77, -90, -83, -90, -94, -76, -90, 97, -91, -74, -82, -82, -70, 97, -76, -74, -77, -89, -94, -92, -90, -35, -18, -26, -26, -14, -52, -18, -21, -33, -38, -36, -34};
    }

    public IL() {
        super(A00(77, 12, 64));
    }

    private void A01() {
        AbstractC0763Ha.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        AbstractC0763Ha.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC0773Hk(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.A04;
        if (runtimeException == null) {
            Error error = this.A03;
            if (error == null) {
                return (DummySurface) AbstractC0763Ha.A01(this.A02);
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void A05() {
        AbstractC0763Ha.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.what
            r5 = 1
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L7;
                default: goto L6;
            }
        L6:
            return r5
        L7:
            r6.A01()     // Catch: java.lang.Throwable -> Lb
            goto L22
        Lb:
            r4 = move-exception
            r2 = 0
            r1 = 12
            r0 = 97
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L26
            r3 = 46
            r2 = 31
            r0 = 8
            java.lang.String r0 = A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L26
            android.util.Log.e(r1, r0, r4)     // Catch: java.lang.Throwable -> L26
        L22:
            r6.quit()
            return r5
        L26:
            r0 = move-exception
            r6.quit()
            throw r0
        L2b:
            int r0 = r7.arg1     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L5b java.lang.Throwable -> L7d
            r6.A03(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L5b java.lang.Throwable -> L7d
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L36
            goto L79
        L36:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L36
            throw r0
        L39:
            r4 = move-exception
            r2 = 0
            r1 = 12
            r0 = 97
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L7d
            r3 = 12
            r2 = 34
            r0 = 59
            java.lang.String r0 = A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L7d
            android.util.Log.e(r1, r0, r4)     // Catch: java.lang.Throwable -> L7d
            r6.A03 = r4     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            goto L79
        L58:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            throw r0
        L5b:
            r4 = move-exception
            r2 = 0
            r1 = 12
            r0 = 97
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L7d
            r3 = 12
            r2 = 34
            r0 = 59
            java.lang.String r0 = A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L7d
            android.util.Log.e(r1, r0, r4)     // Catch: java.lang.Throwable -> L7d
            r6.A04 = r4     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
        L79:
            return r5
        L7a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            throw r0
        L7d:
            r0 = move-exception
            monitor-enter(r6)
            r6.notify()     // Catch: java.lang.Throwable -> L84
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L84
            throw r0
        L84:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.IL.handleMessage(android.os.Message):boolean");
    }
}
