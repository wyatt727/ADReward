package com.facebook.ads.redexgen.uinode;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Vq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1135Vq {
    public H7<? extends H8> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final <T extends H8> long A04(T t, H6<T> h6, int i) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0763Ha.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new H7(this, looperMyLooper, t, h6, i, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public C1135Vq(String str) {
        this.A02 = IF.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            H7<? extends H8> h7 = this.A00;
            if (h7 != null) {
                if (i == Integer.MIN_VALUE) {
                    i = h7.A03;
                }
                h7.A05(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(H9 h9) {
        H7<? extends H8> h7 = this.A00;
        if (h7 != null) {
            h7.A07(true);
        }
        if (h9 != null) {
            this.A02.execute(new HA(h9));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
