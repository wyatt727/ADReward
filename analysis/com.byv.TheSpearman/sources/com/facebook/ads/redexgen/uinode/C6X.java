package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6X implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C05126c A01;

    public C6X(C05126c c05126c, C6Y c6y) {
        this.A01 = c05126c;
        new Handler(Looper.getMainLooper()).post(new C1210Yq(this, c05126c, c6y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6Y c6y) throws SecurityException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        R0 r0A05 = R0.A05(this.A01.A04.A01());
        Uri uriA00 = AbstractC0858Ky.A00(c6y.A08);
        long jA0O = c6y.A00;
        if (jA0O == -1) {
            jA0O = C0796Ih.A0O(this.A01.A04);
        }
        r0A05.A0G(uriA00, new C1209Yp(this, c6y, jA0O, jCurrentTimeMillis), jA0O);
    }
}
