package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1311b6 {
    public final C1207Yn A00;
    public final JR A01;

    public FX(C1207Yn c1207Yn, C3C c3c, List<V2> list, JR jr) {
        super(c3c, list, c1207Yn);
        this.A00 = c1207Yn;
        this.A01 = jr == null ? new JR() : jr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i) {
        return new UR(new MI(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    /* renamed from: A0H */
    public final void A0D(UR ur, int i) {
        super.A0D(ur, i);
        MI mi = (MI) ur.A0j();
        A0F(mi.getImageCardView(), i);
        if (((AbstractC1311b6) this).A01.get(i) != null) {
            mi.setTitle(((AbstractC1311b6) this).A01.get(i).getAdHeadline());
            mi.setSubtitle(((AbstractC1311b6) this).A01.get(i).getAdLinkDescription());
            mi.setButtonText(((AbstractC1311b6) this).A01.get(i).getAdCallToAction());
        }
        V2 v2 = ((AbstractC1311b6) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mi);
        v2.A1O(mi, mi, arrayList);
    }
}
