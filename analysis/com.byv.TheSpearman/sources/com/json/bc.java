package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* loaded from: classes4.dex */
public class bc extends x1<h0> implements RewardedVideoAdListener {
    public bc(qb qbVar, u uVar, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, i1 i1Var, h0 h0Var) {
        super(qbVar, uVar, baseAdAdapter, new m0(uVar.g(), uVar.g().getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), i1Var, h0Var);
    }
}
