package com.unity3d.services.core.configuration;

/* loaded from: classes4.dex */
public interface IConfigurationLoaderListener {
    void onError(String str);

    void onSuccess(Configuration configuration);
}
