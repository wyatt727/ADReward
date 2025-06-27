package com.my.target.mediation;

import com.my.target.common.MyTargetPrivacy;
import java.util.Map;

/* loaded from: classes4.dex */
public interface MediationAdConfig {
    AdNetworkConfig getAdNetworkConfig();

    int getAge();

    int getGender();

    String getPayload();

    String getPlacementId();

    MyTargetPrivacy getPrivacy();

    Map<String, String> getServerParams();

    boolean isUserAgeRestricted();

    boolean isUserConsent();

    boolean isUserConsentSpecified();
}
