package com.applovin.sdk;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes.dex */
public interface AppLovinTermsAndPrivacyPolicyFlowSettings extends AppLovinTermsFlowSettings {
    AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);
}
