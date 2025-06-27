package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1331bQ implements P0 {
    public final /* synthetic */ C1328bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void A9L() {
        String strA00 = this.A00.A03.A10().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        C0855Kv.A0M(new C0855Kv(), this.A00.A04, AbstractC0858Ky.A00(strA00), this.A00.A6T());
    }

    public C1331bQ(C1328bN c1328bN) {
        this.A00 = c1328bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABO(B0 b0) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1332bR(this, b0), 1L);
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABd() {
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
