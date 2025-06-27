package com.facebook.ads.redexgen.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04513r extends C0690Eb {
    public C04513r(C1207Yn c1207Yn) {
        super(c1207Yn);
        setCarouselLayoutManager(c1207Yn);
    }

    public AbstractC1042Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0690Eb
    public C1233Zo getLayoutManager() {
        return (C1233Zo) super.getLayoutManager();
    }

    public AbstractC04784t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C1207Yn c1207Yn) {
        C1233Zo c1233Zo = new C1233Zo(c1207Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1233Zo.A1R(true);
        }
        super.setLayoutManager(c1233Zo);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0690Eb
    public void setLayoutManager(AbstractC04734o abstractC04734o) {
    }
}
