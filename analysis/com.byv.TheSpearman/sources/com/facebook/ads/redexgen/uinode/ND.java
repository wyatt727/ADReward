package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ND implements View.OnTouchListener {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                AbstractC0874Lo.A0M(view, NJ.A0H);
                return false;
            case 1:
                AbstractC0874Lo.A0M(view, 0);
                return false;
            default:
                return false;
        }
    }
}
