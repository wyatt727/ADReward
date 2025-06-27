package com.applovin.mediation.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f1257a;

    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f1257a.logApiCall("destroy()");
        this.f1257a.destroy();
    }

    public String getAdUnitId() {
        return this.f1257a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f1257a.isReady();
        this.f1257a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f1257a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f1257a.logApiCall("loadAd()");
        this.f1257a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f1257a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1257a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f1257a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f1257a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f1257a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1257a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f1257a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f1257a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f1257a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1257a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f1257a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1257a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f1257a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1257a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f1257a;
    }

    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.k());
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f1257a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }

    public void showAd(String str, String str2) {
        this.f1257a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        zp.b(str2, "MaxAppOpenAd");
        this.f1257a.showAd(str, str2, null);
    }
}
