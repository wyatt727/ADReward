package com.facebook.ads.redexgen.uinode;

import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class TC implements PG {
    public final /* synthetic */ C1207Yn A00;
    public final /* synthetic */ String A01;

    public TC(C1207Yn c1207Yn, String str) {
        this.A00 = c1207Yn;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.PG
    public final void A8d(String str) throws JSONException {
        PP.A05(this.A00, str, this.A01);
    }
}
