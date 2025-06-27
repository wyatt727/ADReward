package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SP extends RD {
    public final /* synthetic */ J2 A00;
    public final /* synthetic */ C0866Lg A01;
    public final /* synthetic */ C0979Pp A02;
    public final /* synthetic */ SN A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public SP(SN sn, String str, C0979Pp c0979Pp, J2 j2, Map map, C0866Lg c0866Lg) {
        this.A03 = sn;
        this.A04 = str;
        this.A02 = c0979Pp;
        this.A00 = j2;
        this.A05 = map;
        this.A01 = c0866Lg;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A08.get(this.A02.A02())) {
            this.A00.A9g(this.A04, new C0920Ni(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C1U.A07(this.A03.A00, this.A03.A09);
            this.A03.A08.put(this.A02.A02(), true);
        }
    }
}
