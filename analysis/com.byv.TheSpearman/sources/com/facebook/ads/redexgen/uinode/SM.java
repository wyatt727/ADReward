package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SM extends AbstractC04614c<SK> {
    public final int A00;
    public final C1207Yn A01;
    public final ViewOnClickListenerC1079Tl A02;
    public final List<String> A03;

    public SM(C1207Yn c1207Yn, List<String> screenshotUrls, int i, ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1207Yn;
        this.A02 = viewOnClickListenerC1079Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final SK A0C(ViewGroup viewGroup, int i) {
        SL sl = new SL(this.A01);
        if (C0796Ih.A12(this.A01)) {
            sl.setOnClickListener(new Q6(this));
        }
        return new SK(sl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(SK sk, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i2 = leftMargin * 4;
        if (i == 0) {
            leftMargin = i2;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        sk.A0j().setLayoutParams(marginLayoutParams);
        sk.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    public final int A0E() {
        return this.A03.size();
    }
}
