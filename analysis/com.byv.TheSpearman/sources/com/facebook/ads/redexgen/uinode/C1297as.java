package com.facebook.ads.redexgen.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1297as implements C6U {
    public final C03841c A00;
    public final InterfaceC03981q A01;
    public final C05126c A02;
    public final C1207Yn A03;
    public final boolean A04;

    public C1297as(C1207Yn c1207Yn, InterfaceC03981q interfaceC03981q, C05126c c05126c, C03841c c03841c, boolean z) {
        this.A03 = c1207Yn;
        this.A01 = interfaceC03981q;
        this.A02 = c05126c;
        this.A00 = c03841c;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C03991r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == EnumC03851d.A05) {
            A00();
            return;
        }
        String strA0E = this.A00.A0E();
        if (z) {
            C05126c c05126c = this.A02;
            String markupUrlResult = this.A00.A0E();
            strA0E = c05126c.A0R(markupUrlResult);
        }
        this.A00.A0H(strA0E);
        this.A01.ACa();
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}
