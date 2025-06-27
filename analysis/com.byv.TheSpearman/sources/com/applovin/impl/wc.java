package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.vc;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;

/* loaded from: classes.dex */
public abstract class wc extends Activity implements vc.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.sdk.k f1128a;
    protected vc b;
    protected xc c = new xc(null);
    private MaxAdapterListener d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.c.a());
        com.applovin.impl.sdk.k kVar = this.f1128a;
        r.a(kVar != null ? ((Boolean) kVar.a(oj.I2)).booleanValue() : true, this);
        vc vcVar = new vc(this.c, this);
        this.b = vcVar;
        vcVar.setListener(this);
        this.b.setVisibility(4);
        viewGroup.addView(this.b);
        ar.a(this.b, this.c.b());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            } else {
                throw new IllegalStateException("Failed to fire hidden callback (" + this.d + "): neither interstitial nor app open ad");
            }
        }
        super.onDestroy();
    }

    protected void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(R.id.content)).addView(view);
        this.b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
            return;
        }
        if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
            return;
        }
        throw new IllegalStateException("Failed to fire display callback (" + this.d + "): neither interstitial nor app open ad");
    }

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Null hybrid ad view (" + str + ")");
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new IllegalStateException("Failed to fire display failed callback (" + this.d + "): neither interstitial nor app open ad");
        }
        finish();
    }

    protected void a(xc xcVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
        this.f1128a = kVar;
        this.c = xcVar;
        this.d = maxAdapterListener;
    }

    @Override // com.applovin.impl.vc.a
    public void a(vc vcVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
