package com.json.mediationsdk.adunit.adapter;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.LoadWhileShowSupportState;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.json.mediationsdk.model.NetworkSettings;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseAdapter implements AdapterBaseInterface, AdapterMetaDataInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterSettingsInterface {
    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return LoadWhileShowSupportState.NONE;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return true;
    }

    @Override // com.json.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
    }
}
