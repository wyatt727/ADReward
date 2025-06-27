package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* loaded from: classes4.dex */
public class m8 extends u1<b0> implements InterstitialAdListener {
    public m8(qb qbVar, u uVar, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, i1 i1Var, b0 b0Var) {
        super(qbVar, uVar, baseAdAdapter, new m0(uVar.g(), uVar.g().getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), i1Var, b0Var);
    }
}
