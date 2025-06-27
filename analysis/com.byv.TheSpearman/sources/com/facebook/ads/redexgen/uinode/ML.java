package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* loaded from: assets/audience_network.dex */
public class ML implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ML(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null || !this.A00.A07.A04()) {
                return;
            }
            this.A00.A02.AB6();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
