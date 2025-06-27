package com.json.mediationsdk.adunit.adapter.internal;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.LoadWhileShowSupportState;
import com.json.mediationsdk.model.NetworkSettings;

/* loaded from: classes4.dex */
public interface AdapterSettingsInterface {
    LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings);

    LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings);

    boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit);
}
