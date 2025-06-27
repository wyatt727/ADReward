package com.json;

import com.json.d0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ac extends w1<bc> {
    public ac(List<NetworkSettings> list, cc ccVar, String str, boolean z, m9 m9Var, IronSourceSegment ironSourceSegment, boolean z2) {
        super(new RewardedVideoAdDataManager(str, list, ccVar, z), m9Var, ironSourceSegment, z2);
    }

    @Override // com.json.v1
    protected /* bridge */ /* synthetic */ y1 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str, i1 i1Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdRewardListener>) baseAdAdapter, i, str, i1Var);
    }

    protected bc b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i, String str, i1 i1Var) {
        return new bc(this, new u(IronSource.AD_UNIT.REWARDED_VIDEO, this.o.getUserId(), i, this.g, str, this.e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, i1Var, this);
    }

    @Override // com.json.v1
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.json.v1
    protected c0 e() {
        return new ec();
    }

    @Override // com.json.v1
    protected String i() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.json.v1
    protected String l() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.json.v1
    protected boolean n() {
        return this.o.getLoadingData().a() == d0.a.MANUAL;
    }
}
