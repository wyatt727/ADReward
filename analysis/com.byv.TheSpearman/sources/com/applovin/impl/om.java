package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class om extends gm {
    private final AppLovinNativeAdLoadListener j;

    public om(h0 h0Var, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(h0Var, str, kVar);
        this.j = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.gm
    protected String f() {
        return c4.e(this.f1179a);
    }

    @Override // com.applovin.impl.gm
    protected String e() {
        return c4.d(this.f1179a);
    }

    @Override // com.applovin.impl.gm
    protected void a(int i, String str) {
        super.a(i, str);
        this.j.onNativeAdLoadFailed(new AppLovinError(i, str));
    }

    @Override // com.applovin.impl.gm
    protected xl a(JSONObject jSONObject) {
        return new xm(jSONObject, this.j, this.f1179a);
    }
}
