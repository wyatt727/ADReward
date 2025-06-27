package com.facebook.ads.redexgen.uinode;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public abstract class QQ extends RelativeLayout implements QN {
    public SA A00;

    public QQ(C1207Yn c1207Yn) {
        super(c1207Yn);
    }

    public QQ(C1207Yn c1207Yn, AttributeSet attributeSet, int i) {
        super(c1207Yn, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa) {
        this.A00 = sa;
        A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa) {
        A08();
        this.A00 = null;
    }

    public SA getVideoView() {
        return this.A00;
    }
}
