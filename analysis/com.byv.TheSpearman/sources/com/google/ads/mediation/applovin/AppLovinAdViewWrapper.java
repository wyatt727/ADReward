package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes2.dex */
class AppLovinAdViewWrapper {
    private final AppLovinAdView appLovinAdView;

    private AppLovinAdViewWrapper(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this.appLovinAdView = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
    }

    public static AppLovinAdViewWrapper newInstance(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        return new AppLovinAdViewWrapper(appLovinSdk, appLovinAdSize, context);
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.appLovinAdView.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.appLovinAdView.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.appLovinAdView.setAdViewEventListener(appLovinAdViewEventListener);
    }

    public void renderAd(AppLovinAd appLovinAd) {
        this.appLovinAdView.renderAd(appLovinAd);
    }

    public AppLovinAdView getAppLovinAdView() {
        return this.appLovinAdView;
    }
}
