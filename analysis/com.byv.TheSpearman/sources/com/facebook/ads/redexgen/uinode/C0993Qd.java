package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0993Qd extends AbstractC05698s<C9H> {
    public final /* synthetic */ C9I A00;

    public C0993Qd(C9I c9i) {
        this.A00 = c9i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        int iA00 = c9h.A00();
        int duration = c9h.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && iA00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = iA00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C9I c9i = this.A00;
                int currentPosition4 = c9i.A00;
                c9i.A0e(currentPosition4);
                return;
            }
            this.A00.A0e(duration);
            return;
        }
        this.A00.A0e(iA00);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    public final Class<C9H> A01() {
        return C9H.class;
    }
}
