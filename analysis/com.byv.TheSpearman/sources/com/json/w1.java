package com.json;

import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.model.Placement;
import com.json.x1;

/* loaded from: classes4.dex */
public abstract class w1<Smash extends x1<?>> extends t1<Smash, AdapterAdRewardListener> implements h0 {
    public w1(p pVar, m9 m9Var, IronSourceSegment ironSourceSegment, boolean z) {
        super(pVar, m9Var, ironSourceSegment, z);
    }

    @Override // com.json.h0
    public void a(x1<?> x1Var, Placement placement) {
        IronLog.INTERNAL.verbose(b(x1Var.k()));
        this.t.b(placement, x1Var.f());
    }
}
