package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.ob;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new ob(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
