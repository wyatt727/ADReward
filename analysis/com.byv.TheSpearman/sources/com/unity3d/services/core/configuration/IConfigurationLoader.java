package com.unity3d.services.core.configuration;

/* loaded from: classes4.dex */
public interface IConfigurationLoader {
    Configuration getLocalConfiguration();

    void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception;
}
