package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nm extends gm {
    private final AppLovinAdLoadListener j;

    public nm(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(h0Var, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.gm
    protected String f() {
        return c4.b(this.f1179a);
    }

    @Override // com.applovin.impl.gm
    protected String e() {
        return c4.a(this.f1179a);
    }

    @Override // com.applovin.impl.gm
    protected void a(int i, String str) {
        super.a(i, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) this.j).failedToReceiveAdV2(new AppLovinError(i, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    public nm(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(h0Var, str, kVar);
        this.j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.gm
    protected xl a(JSONObject jSONObject) {
        return new tm(jSONObject, this.h, this.j, this.f1179a);
    }
}
