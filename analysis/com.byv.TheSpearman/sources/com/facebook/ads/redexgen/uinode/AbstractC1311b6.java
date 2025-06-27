package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1311b6 extends AbstractC04614c<UR> {
    public static final int A05 = (int) (LD.A02 * 4.0f);
    public C1B A00;
    public final List<V2> A01;
    public final int A02;
    public final C1207Yn A03;
    public final RD A04 = new C1313b8(this);

    public AbstractC1311b6(C3C c3c, List<V2> list, C1207Yn c1207Yn) {
        this.A03 = c1207Yn;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04614c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        V2 v2 = this.A01.get(i);
        JP adCoverImage = v2.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1084Tq asyncTaskC1084TqA04 = new AsyncTaskC1084Tq(imageView, this.A03).A04();
            asyncTaskC1084TqA04.A06(new C1312b7(this, i, v2));
            asyncTaskC1084TqA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1B c1b) {
        this.A00 = c1b;
    }

    public void A0H(UR ur, int i) {
        ur.A0j().setLayoutParams(A02(i));
    }
}
