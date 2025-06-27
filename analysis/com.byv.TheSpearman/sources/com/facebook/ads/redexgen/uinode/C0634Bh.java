package com.facebook.ads.redexgen.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0634Bh extends C1232Zn {
    public final /* synthetic */ C0633Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.C1232Zn
    public final int A0O(View view, int i) {
        AbstractC04734o abstractC04734oA08 = A08();
        if (!abstractC04734oA08.A20()) {
            return 0;
        }
        C04744p c04744p = (C04744p) view.getLayoutParams();
        return A0N(abstractC04734oA08.A0k(view) - c04744p.leftMargin, abstractC04734oA08.A0n(view) + c04744p.rightMargin, abstractC04734oA08.A0e(), abstractC04734oA08.A0h() - abstractC04734oA08.A0f(), i) + this.A00.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634Bh(C0633Bg c0633Bg, C1207Yn c1207Yn) {
        super(c1207Yn);
        this.A00 = c0633Bg;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1232Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1232Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1232Zn
    public final PointF A0P(int i) {
        return this.A00.A4O(i);
    }
}
