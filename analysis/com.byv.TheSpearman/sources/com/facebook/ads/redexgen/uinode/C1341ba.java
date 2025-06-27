package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1341ba implements InterfaceC03670k {
    public final /* synthetic */ C1207Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1341ba(JSONObject jSONObject, C1207Yn c1207Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c1207Yn;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03670k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03670k
    public final Collection<String> A6n() {
        return AbstractC03680l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03670k
    public final EnumC03660j A7E() {
        return AbstractC03680l.A00(this.A02);
    }
}
