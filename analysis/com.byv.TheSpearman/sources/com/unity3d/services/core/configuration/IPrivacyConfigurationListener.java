package com.unity3d.services.core.configuration;

/* loaded from: classes4.dex */
public interface IPrivacyConfigurationListener {
    void onError(PrivacyCallError privacyCallError, String str);

    void onSuccess(PrivacyConfig privacyConfig);
}
