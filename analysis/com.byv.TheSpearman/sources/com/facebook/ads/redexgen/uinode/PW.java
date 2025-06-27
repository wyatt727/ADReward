package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PW implements View.OnTouchListener {
    public final /* synthetic */ C1065Sx A00;

    public PW(C1065Sx c1065Sx) {
        this.A00 = c1065Sx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                break;
            case 1:
                float browserFinalY = motionEvent.getY();
                if (this.A00.A00 < browserFinalY) {
                    this.A00.A0k(false);
                    break;
                }
                break;
        }
        return true;
    }
}
