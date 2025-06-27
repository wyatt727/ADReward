package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.5U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5U implements View.OnLongClickListener {
    public final /* synthetic */ C5V A00;

    public C5U(C5V c5v) {
        this.A00 = c5v;
    }

    public /* synthetic */ C5U(C5V c5v, C5R c5r) {
        this(c5v);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A0A != null && this.A00.A06 != null) {
            this.A00.A0A.setBounds(0, 0, this.A00.A06.getWidth(), this.A00.A06.getHeight());
            this.A00.A0A.A0D(!this.A00.A0A.A0E());
        }
        return true;
    }
}
