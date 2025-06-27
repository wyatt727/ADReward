package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1244a0 implements C3D {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C04413h A01;

    public C1244a0(C04413h c04413h) {
        this.A01 = c04413h;
    }

    @Override // com.facebook.ads.redexgen.uinode.C3D
    public final C04443k AAk(View view, C04443k c04443k) {
        C04443k c04443kA06 = C3T.A06(view, c04443k);
        if (c04443kA06.A07()) {
            return c04443kA06;
        }
        Rect rect = this.A00;
        rect.left = c04443kA06.A03();
        rect.top = c04443kA06.A05();
        rect.right = c04443kA06.A04();
        rect.bottom = c04443kA06.A02();
        int i = this.A01.getChildCount();
        for (int count = 0; count < i; count++) {
            C04443k c04443kA05 = C3T.A05(this.A01.getChildAt(count), c04443kA06);
            rect.left = Math.min(c04443kA05.A03(), rect.left);
            rect.top = Math.min(c04443kA05.A05(), rect.top);
            rect.right = Math.min(c04443kA05.A04(), rect.right);
            rect.bottom = Math.min(c04443kA05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C04443k applied = c04443kA06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
