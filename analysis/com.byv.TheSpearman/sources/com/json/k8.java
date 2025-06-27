package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k8 extends t1<m8, AdapterAdInteractionListener> {
    public k8(List<NetworkSettings> list, n8 n8Var, String str, m9 m9Var, IronSourceSegment ironSourceSegment, boolean z) {
        super(new InterstitialAdManagerData(str, list, n8Var), m9Var, ironSourceSegment, z);
    }

    @Override // com.json.v1
    protected /* bridge */ /* synthetic */ y1 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, i1 i1Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdInteractionListener>) baseAdAdapter, i, str, i1Var);
    }

    protected m8 b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i, String str, i1 i1Var) {
        return new m8(this, new u(IronSource.AD_UNIT.INTERSTITIAL, this.o.getUserId(), i, this.g, str, this.e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, i1Var, this);
    }

    @Override // com.json.v1
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }

    @Override // com.json.v1
    protected c0 e() {
        return new p8();
    }

    @Override // com.json.v1
    protected String i() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.json.v1
    protected String l() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }
}
