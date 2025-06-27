package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class jg extends ig {
    public jg(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.ig
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.ig
    protected AdSessionContext a(WebView webView) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        try {
            if (this.f535a.getOpenMeasurementVerificationScriptResources().size() > 0) {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createNativeAdSessionContext(this.b.Y().b(), this.b.Y().a(), this.f535a.getOpenMeasurementVerificationScriptResources(), this.f535a.getOpenMeasurementContentUrl(), this.f535a.getOpenMeasurementCustomReferenceData());
            } else {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.b.Y().b(), webView, this.f535a.getOpenMeasurementContentUrl(), this.f535a.getOpenMeasurementCustomReferenceData());
            }
            return adSessionContextCreateHtmlAdSessionContext;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
