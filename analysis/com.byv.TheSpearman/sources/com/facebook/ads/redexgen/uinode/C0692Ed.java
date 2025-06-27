package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0692Ed extends C1232Zn {
    public final /* synthetic */ C0691Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692Ed(C0691Ec c0691Ec, Context context) {
        super(context);
        this.A00 = c0691Ec;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1232Zn, com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C04834z c04834z) {
        C0691Ec c0691Ec = this.A00;
        int[] iArrA0H = c0691Ec.A0H(((ZY) c0691Ec).A00.getLayoutManager(), view);
        int time = iArrA0H[0];
        int dy = iArrA0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c04834z.A04(time, dy, dx, ((C1232Zn) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1232Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1232Zn
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
