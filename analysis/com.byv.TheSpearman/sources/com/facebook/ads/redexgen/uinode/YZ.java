package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: assets/audience_network.dex */
public class YZ extends KT {
    public final /* synthetic */ C1206Ym A00;

    public YZ(C1206Ym c1206Ym) {
        this.A00 = c1206Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
