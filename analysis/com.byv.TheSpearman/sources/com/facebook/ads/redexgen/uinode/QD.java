package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QD implements View.OnTouchListener {
    public final /* synthetic */ SA A00;

    public QD(SA sa) {
        this.A00 = sa;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0B.A02(new MY(view, motionEvent));
        return false;
    }
}
