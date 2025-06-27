package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FW extends AbstractC1311b6 {
    public final C1207Yn A00;

    public FW(C3C c3c, List<V2> list, C1207Yn c1207Yn) {
        super(c3c, list, c1207Yn);
        this.A00 = c1207Yn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i) {
        return new UR(new MN(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(UR ur, int i) {
        super.A0D(ur, i);
        MN mn = (MN) ur.A0j();
        MZ imageView = (MZ) mn.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        V2 childAd = ((AbstractC1311b6) this).A01.get(i);
        childAd.A11().A0K(this.A00);
        childAd.A1N(mn, mn);
    }
}
