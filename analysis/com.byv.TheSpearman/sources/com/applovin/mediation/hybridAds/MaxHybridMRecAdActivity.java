package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.View;
import com.applovin.impl.sdk.k;
import com.applovin.impl.wc;
import com.applovin.impl.xc;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

/* loaded from: classes.dex */
public class MaxHybridMRecAdActivity extends wc {
    private View f;

    @Override // com.applovin.impl.wc, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f, "MaxHybridMRecAdActivity");
    }

    public void a(xc xcVar, View view, k kVar, MaxAdapterListener maxAdapterListener) {
        super.a(xcVar, kVar, maxAdapterListener);
        this.f = view;
    }
}
