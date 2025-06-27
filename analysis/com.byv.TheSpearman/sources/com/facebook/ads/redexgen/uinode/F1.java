package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class F1 {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final C0703Eo A01;
    public final long A02;
    public final CopyOnWriteArrayList<F0> A03;

    public F1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F1(CopyOnWriteArrayList<F0> copyOnWriteArrayList, int i, C0703Eo c0703Eo, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c0703Eo;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA01 = C9W.A01(j);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final F1 A02(int i, C0703Eo c0703Eo, long j) {
        return new F1(this.A03, i, c0703Eo, j);
    }

    public final void A03() {
        AbstractC0763Ha.A04(this.A01 != null);
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0706Er(this, listener));
        }
    }

    public final void A04() {
        AbstractC0763Ha.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0707Es(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        AbstractC0763Ha.A04(this.A01 != null);
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0712Ex(this, listener));
        }
    }

    public final void A06(int i, Format format, int i2, Object obj, long j) {
        A0C(new F3(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, F4 f4) {
        AbstractC0763Ha.A03((handler == null || f4 == null) ? false : true);
        this.A03.add(new F0(handler, f4));
    }

    public final void A08(F2 f2, F3 f3) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0710Ev(this, listener, f2, f3));
        }
    }

    public final void A09(F2 f2, F3 f3) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0709Eu(this, listener, f2, f3));
        }
    }

    public final void A0A(F2 f2, F3 f3) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0708Et(this, listener, f2, f3));
        }
    }

    public final void A0B(F2 f2, F3 f3, IOException iOException, boolean z) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            A01(next.A00, new RunnableC0711Ew(this, next.A01, f2, f3, iOException, z));
        }
    }

    public final void A0C(F3 f3) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0714Ez(this, listener, f3));
        }
    }

    public final void A0D(F4 f4) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == f4) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C0762Gy c0762Gy, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
        A0A(new F2(c0762Gy, j3, 0L, 0L), new F3(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C0762Gy c0762Gy, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new F2(c0762Gy, j3, j4, j5), new F3(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C0762Gy c0762Gy, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new F2(c0762Gy, j3, j4, j5), new F3(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C0762Gy c0762Gy, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new F2(c0762Gy, j3, j4, j5), new F3(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
