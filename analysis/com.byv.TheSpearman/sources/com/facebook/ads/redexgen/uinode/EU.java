package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public class EU extends AbstractC0984Pu {
    public final /* synthetic */ C04915h A00;

    public EU(C04915h c04915h) {
        this.A00 = c04915h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        this.A00.A00.onCompleted();
        if (C0796Ih.A1H(this.A00.A00.getContext())) {
            this.A00.A00.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
