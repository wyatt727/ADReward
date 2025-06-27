package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1326bL extends KT {
    public final /* synthetic */ C1325bK A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1326bL(C1325bK c1325bK, Map map, Map map2) {
        this.A00 = c1325bK;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (!TextUtils.isEmpty(this.A00.A01.A0Y())) {
            HashMap map = new HashMap();
            Map<String, String> extraData = this.A02;
            map.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            map.putAll(extraData2);
            this.A00.A0A.A09().AA4(this.A00.A01.A0Y(), map);
        }
    }
}
