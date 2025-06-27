package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import java.util.List;

/* loaded from: classes.dex */
public interface AppLovinSdkInitializationConfiguration {

    /* renamed from: com.applovin.sdk.AppLovinSdkInitializationConfiguration$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Builder builder(String str, Context context) {
            return new AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, context);
        }
    }

    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        String getMediationProvider();

        String getPluginVersion();

        String getSdkKey();

        AppLovinTargetingData getTargetingData();

        List<String> getTestDeviceAdvertisingIds();

        AppLovinUserSegment getUserSegment();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z);

        Builder setMediationProvider(String str);

        Builder setPluginVersion(String str);

        Builder setTargetingData(AppLovinTargetingData appLovinTargetingData);

        Builder setTestDeviceAdvertisingIds(List<String> list);

        Builder setUserSegment(AppLovinUserSegment appLovinUserSegment);
    }

    List<String> getAdUnitIds();

    String getMediationProvider();

    String getPluginVersion();

    String getSdkKey();

    AppLovinTargetingData getTargetingData();

    List<String> getTestDeviceAdvertisingIds();

    AppLovinUserSegment getUserSegment();

    boolean isExceptionHandlerEnabled();
}
