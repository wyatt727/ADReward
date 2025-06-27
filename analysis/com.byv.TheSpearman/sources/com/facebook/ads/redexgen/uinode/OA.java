package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC0874Lo.A00();

    public static void A00(C1207Yn c1207Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC1084Tq(viewGroup, c1207Yn).A07(str);
        View view = new View(c1207Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0874Lo.A0R(view, c1207Yn);
        viewGroup.addView(view, 0);
    }
}
